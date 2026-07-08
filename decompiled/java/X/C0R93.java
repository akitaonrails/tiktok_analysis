package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0R93, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R93 {
    public static boolean LIZ(String str) {
        return TextUtils.equals(str, "homepage_friends");
    }

    public static boolean LIZIZ(String str) {
        return TextUtils.equals(str, "homepage_follow");
    }

    public static boolean LIZJ(String str) {
        return TextUtils.equals(str, "homepage_popular");
    }

    public static boolean LIZLLL(String str) {
        return TextUtils.equals(str, "homepage_hot");
    }

    public static boolean LJ(String str) {
        return TextUtils.equals(str, "homepage_nearby");
    }

    public static boolean LJFF(String str) {
        return TextUtils.equals(str, "repost_feed");
    }

    public static boolean LJI(String str) {
        if (!TextUtils.equals(str, "homepage_series") && !TextUtils.equals(str, "homepage_series")) {
            return false;
        }
        return true;
    }
}
