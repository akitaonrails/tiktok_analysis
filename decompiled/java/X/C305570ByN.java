package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0ByN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C305570ByN {
    public static final C01GW LIZ = C292401Bi.LIZ(new C293770BfL());

    public static int LIZJ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static boolean LIZ(String str) {
        if (LIZIZ(str)) {
            if (LIZJ() == 1 || LIZJ() == 2 || LIZJ() == 3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean LIZIZ(String str) {
        if (TextUtils.equals(str, "homepage_hot") || TextUtils.equals(str, "homepage_follow") || C0C64.LJIILLIIL().LJIIIZ(31744, "feed_live_card_widget_load_release", true, false)) {
            return true;
        }
        return false;
    }
}
