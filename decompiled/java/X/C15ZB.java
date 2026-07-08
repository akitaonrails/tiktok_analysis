package X;

/* JADX INFO: renamed from: X.15ZB, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15ZB {
    public static final void LIZ(Integer num, String str, String str2) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("business", str);
        c2344009Gk.LJFF("style", str2);
        c2344009Gk.LJFF("enter_from", "dwl_sleephour_reminder");
        if (num != null) {
            c2344009Gk.LIZJ(num.intValue(), "cadence");
        }
        C20684815ws.LJIILLIIL("pns_content_shown", c2344009Gk.LIZ);
    }

    public static final void LIZIZ(int i, String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("popup_name", str);
        c2344009Gk.LJIIIIZZ("button_name", str2);
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LIZJ(i, "cadence");
        C20684815ws.LJIILLIIL("PrivacyDWL_popup_button_click", c2344009Gk.LIZ);
    }
}
