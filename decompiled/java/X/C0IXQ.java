package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0IXQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IXQ {
    public static String LIZIZ() {
        return C497740JfY.LJIL() ? "portrait_screen" : "landscape_screen";
    }

    public static String LIZ(String str) {
        if (TextUtils.equals(str, "match")) {
            return "manual_pk";
        }
        if (TextUtils.equals(str, "guests")) {
            return "audience";
        }
        if (TextUtils.equals(str, "cohost")) {
            return "anchor";
        }
        return "normal";
    }
}
