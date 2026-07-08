package X;

import android.content.Context;

/* JADX INFO: renamed from: X.1B3Q, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B3Q {
    public static final C1B3Q LIZ = new C1B3Q();

    public static void LIZLLL(C2344009Gk c2344009Gk, String str) {
        c2344009Gk.LJIIIIZZ("result", "success");
        c2344009Gk.LJIIIIZZ("api_path", str);
        C20684815ws.LJIILLIIL("platform_auth_info", c2344009Gk.LIZ);
    }

    public static void LIZJ(C2344009Gk c2344009Gk, Integer num, String str, String str2, Context context) {
        c2344009Gk.LJIIIIZZ("result", "fail");
        c2344009Gk.LJ(num, "error_code");
        c2344009Gk.LJIIIIZZ("error_msg", str);
        c2344009Gk.LJIIIIZZ("api_path", str2);
        c2344009Gk.LIZJ(C0XF1.LIZLLL(context) ? 1 : 0, "is_network_available");
        c2344009Gk.LIZJ(C0XF1.LIZ(context).getValue(), "network_type");
        C20684815ws.LJIILLIIL("auth_server_error", c2344009Gk.LIZ);
    }

    public static C2344009Gk LIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        if (str5 == null) {
            if (z) {
                str5 = "qr_code";
            } else {
                str5 = "android";
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("auth_app", str);
        c2344009Gk.LJIIIIZZ("channel", str2);
        c2344009Gk.LJIIIIZZ("enter_from", "authorize_screen");
        c2344009Gk.LJIIIIZZ("enter_method", str5);
        c2344009Gk.LJIIIIZZ("sdk_name", str3);
        c2344009Gk.LJIIIIZZ("sdk_version", str4);
        c2344009Gk.LJIIIIZZ("enter_source", str6);
        c2344009Gk.LJIIIIZZ("auth_app", str7);
        return c2344009Gk;
    }
}
