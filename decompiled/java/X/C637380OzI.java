package X;

/* JADX INFO: renamed from: X.0OzI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637380OzI {
    public static final C637380OzI LIZ = new C637380OzI();

    public static void LIZIZ(String str, String str2, boolean z) {
        LIZ(str, "click", str2, z);
    }

    public static void LIZ(String str, String str2, String str3, boolean z) {
        int i;
        C296840BkI.LIZ.getClass();
        if (!C296840BkI.LIZ()) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("banner_name", str);
        c2344009Gk.LJIIIIZZ("action_type", str2);
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_template");
        if (str3 == null) {
            str3 = "";
        }
        c2344009Gk.LJIIIIZZ("click_type", str3);
        C20684815ws.LJIILLIIL("inbox_platform_banner_event", c2344009Gk.LIZ);
    }
}
