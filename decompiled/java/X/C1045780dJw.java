package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0dJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045780dJw {
    public static void LIZ(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void LIZIZ(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void LIZLLL(C1BUP c1bup) {
        if (c1bup.LJI) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void LIZJ(C1BUP c1bup) {
        if (c1bup.LJFF) {
            LIZLLL(c1bup);
            return;
        }
        throw new IllegalStateException("AdSession is not started");
    }
}
