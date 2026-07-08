package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0C3F, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C3F {
    public static final C0C3F LIZ = new C0C3F();
    public static final int LIZIZ = 1;
    public static final int LIZJ = 2;
    public static final C01GW LIZLLL = C292401Bi.LIZ(new C0C3E());

    public static boolean LIZ(String str) {
        if (TextUtils.equals(str, "homepage_hot") || TextUtils.equals(str, "homepage_follow") || C0C64.LJIILLIIL().LJIIIZ(31744, "feed_live_card_widget_load_release", true, false)) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(String str) {
        if (LIZ(str)) {
            int iIntValue = ((Number) LIZLLL.getValue()).intValue();
            int i = LIZIZ;
            if ((iIntValue & i) == i) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZJ(String str) {
        if (LIZ(str)) {
            int iIntValue = ((Number) LIZLLL.getValue()).intValue();
            int i = LIZJ;
            if ((iIntValue & i) == i) {
                return true;
            }
            return false;
        }
        return false;
    }
}
