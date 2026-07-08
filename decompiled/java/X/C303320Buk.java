package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Buk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C303320Buk {
    public static void LIZ(Runnable runnable) {
        System.currentTimeMillis();
        runnable.run();
        System.currentTimeMillis();
    }

    public static void LIZIZ(long j, boolean z) {
        if (z) {
            try {
                Thread.sleep(j);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
