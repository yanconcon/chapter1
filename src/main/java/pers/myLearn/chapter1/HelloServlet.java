package pers.myLearn.chapter1;

import javafx.scene.input.DataFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 聪聪 on 2018/7/3 0003.
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String current = dateFormat.format(new Date());
        req.setAttribute("current", current);
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req, resp);

    }
}
