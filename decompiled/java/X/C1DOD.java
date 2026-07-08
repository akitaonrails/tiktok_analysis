package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1DOD, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DOD {
    public static volatile int LIZ;

    public static void LIZ() {
        synchronized (C1DOD.class) {
            try {
                LIZ++;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZIZ() {
        synchronized (C1DOD.class) {
            try {
                LIZ--;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
