package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08Mr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2105508Mr {
    public static volatile int LIZ;

    public static synchronized boolean LIZ() {
        if (LIZ != 0) {
            return LIZ > 0;
        }
        try {
            System.loadLibrary("otisopt");
            LIZ = 1;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZ = -1;
        }
        return LIZ > 0;
    }
}
