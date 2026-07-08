package X;

/* JADX INFO: renamed from: X.0iSk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1243440iSk {
    public static final C1243440iSk LIZ = new C1243440iSk();

    public static void LIZIZ(String str, boolean z) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            str2 = "email";
        } else {
            str2 = "phone";
        }
        c2344009Gk.LJIIIIZZ("invite_type", str2);
        c2344009Gk.LJIIIIZZ("btn_click", str);
        C20684815ws.LJIILLIIL("org_permission_invite_sent_click", c2344009Gk.LIZ);
    }

    public static void LIZ(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("btn_click", str);
        c2344009Gk.LJIIIIZZ("permission_status", str2);
        c2344009Gk.LJIIIIZZ("user_role", str3);
        C20684815ws.LJIILLIIL("org_permission_confirm_click", c2344009Gk.LIZ);
    }

    public static void LIZJ(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("btn_click", str);
        c2344009Gk.LJIIIIZZ("permission_status", str2);
        c2344009Gk.LJIIIIZZ("user_role", str3);
        C20684815ws.LJIILLIIL("org_permission_popup_click", c2344009Gk.LIZ);
    }
}
