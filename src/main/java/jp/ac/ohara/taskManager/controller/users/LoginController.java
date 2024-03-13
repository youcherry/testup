package jp.ac.ohara.taskManager.controller.users;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@GetMapping("/login/")
	public ModelAndView form(ModelAndView model) {
		model.setViewName("views/login/login");
		return model;
	}
}
