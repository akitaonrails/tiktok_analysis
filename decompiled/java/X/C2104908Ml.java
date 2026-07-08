package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08Ml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2104908Ml {
    public static int LIZ;

    public static boolean LIZ() {
        return LIZ > 0;
    }

    public static synchronized boolean LIZIZ() {
        int i = LIZ;
        if (i != 0) {
            return i > 0;
        }
        try {
            System.loadLibrary("jato");
            LIZ = 1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ = -1;
        }
        return LIZ > 0;
    }
}
