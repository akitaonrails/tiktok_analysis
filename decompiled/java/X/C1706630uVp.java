package X;

import android.util.Log;

/* JADX INFO: renamed from: X.0uVp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1706630uVp {
    public static final void LIZ(String str, String str2) {
        C1706500uVc.LIZ().d(str, str2);
    }

    public static final void LIZJ(String str, String str2) {
        C1706500uVc.LIZ().e(str, str2);
    }

    public static final void LJFF(String str, String str2) {
        C1706500uVc.LIZ().i(str, str2);
    }

    public static final void LJI(String str, String str2) {
        C1706500uVc.LIZ().d(str, Log.getStackTraceString(new Throwable(str2)));
    }

    public static final void LJII(String str, String str2) {
        C1706500uVc.LIZ().w(str, str2);
    }

    public static final void LIZLLL(String str, String str2, Throwable th) {
        if (th == null) {
            C1706500uVc.LIZ().e(str, str2);
        } else {
            C1706500uVc.LIZ().e(str, str2, th);
        }
    }
}
