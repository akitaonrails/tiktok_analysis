package X;

/* JADX INFO: renamed from: X.0iVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1245240iVe {
    public static final C1245240iVe LIZ = new C1245240iVe();

    public static void LIZ(int i, String str) {
        String str2;
        if (i == 1) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("label", str);
        c2344009Gk.LJIIIIZZ("to_status", str2);
        C20684815ws.LJIILLIIL("notification_switch", c2344009Gk.LIZ);
    }

    public static void LIZIZ(String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("label", str);
        if (str2.length() > 0) {
            c2344009Gk.LJFF("enter_from", str2);
        }
        C20684815ws.LJIILLIIL("enter_push_setting_detail", c2344009Gk.LIZ);
    }

    public static void LIZJ(int i, Integer num, String str) {
        String str2;
        if (i == 0) {
            str2 = "off";
        } else if (num != null && num.intValue() == 1) {
            str2 = "friends";
        } else {
            str2 = "on";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("label", str);
        c2344009Gk.LJIIIIZZ("to_status", str2);
        C20684815ws.LJIILLIIL("notification_switch", c2344009Gk.LIZ);
    }
}
