package X;

/* JADX INFO: renamed from: X.0zBv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1886490zBv {
    public static final C1886490zBv LIZ = new C1886490zBv();

    public static void LIZIZ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "settings_page");
        c2344009Gk.LJIIIIZZ("enter_method", "click");
        c2344009Gk.LJIIIIZZ("auth_type", str);
        c2344009Gk.LJIIIIZZ("popup_type", str2);
        C20684815ws.LJIILLIIL("remove_passkey_popup_show", c2344009Gk.LIZ);
    }

    public static void LIZ(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "settings_page");
        c2344009Gk.LJIIIIZZ("enter_method", "click");
        c2344009Gk.LJIIIIZZ("auth_type", str);
        c2344009Gk.LJIIIIZZ("popup_type", str2);
        c2344009Gk.LJIIIIZZ("action", str3);
        C20684815ws.LJIILLIIL("remove_passkey_popup_click", c2344009Gk.LIZ);
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
