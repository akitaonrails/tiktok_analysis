package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0zsO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1912820zsO {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(String str, String str2, String str3) {
        String str4;
        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("draw_ad", "otherclick", str2, str3, null);
        c1022820ciuLJ.LIZJ("expired_reminder_window", "refer");
        if (TextUtils.equals(str, "draw_ad")) {
            str4 = "1";
        } else {
            str4 = "2";
        }
        c1022820ciuLJ.LIZIZ(str4, "window_type");
        c1022820ciuLJ.LJII();
    }

    public static void LIZ(Boolean bool, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        int i;
        C1022820ciu c1022820ciuLJ = C2184171Adz.LJ("draw_ad", "otherclick", str2, str3, null);
        c1022820ciuLJ.LIZJ("reminder_window", "refer");
        if (TextUtils.equals(str, "draw_ad")) {
            str5 = "1";
        } else {
            str5 = "2";
        }
        c1022820ciuLJ.LIZIZ(str5, "window_type");
        c1022820ciuLJ.LIZIZ(str4, "window_click_type");
        c1022820ciuLJ.LIZIZ(Integer.valueOf(z ? 1 : 0), "is_auto_click");
        if (bool != null) {
            if (bool.booleanValue()) {
                i = 1;
            } else {
                i = 2;
            }
            c1022820ciuLJ.LIZIZ(Integer.valueOf(i), "register_status");
        }
        c1022820ciuLJ.LJII();
    }
}
