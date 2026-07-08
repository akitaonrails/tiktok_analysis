package X;

/* JADX INFO: renamed from: X.0tmK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678420tmK {
    public static final C1678420tmK LIZ = new C1678420tmK();

    public static void LIZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "settings_page");
        c2344009Gk.LJIIIIZZ("enter_method", "click");
        c2344009Gk.LJIIIIZZ("action", str);
        C20684815ws.LJIILLIIL("remove_password_click", c2344009Gk.LIZ);
    }

    public static void LIZIZ(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "settings_page");
        c2344009Gk.LJIIIIZZ("enter_method", "click");
        c2344009Gk.LJIIIIZZ("action", str);
        C20684815ws.LJIILLIIL("remove_password_success_click", c2344009Gk.LIZ);
    }

    public static void LIZJ(String str, String str2, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "settings_page");
        c2344009Gk.LJIIIIZZ("enter_method", str);
        c2344009Gk.LJIIIIZZ("page", "passkey_page");
        c2344009Gk.LJ(Boolean.valueOf(z), "is_success");
        c2344009Gk.LJIIIIZZ("error_code", str2);
        C20684815ws.LJIILLIIL("sec_check_result", c2344009Gk.LIZ);
    }
}
