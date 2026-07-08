package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07zV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC2043507zV implements Runnable {
    public static final RunnableC2043507zV LL = new RunnableC2043507zV();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        boolean z;
        C1C7U.LIZ("ExploreFirstScreenCoverGate@27b1.forceOpenRunnable$1");
        try {
            synchronized (C2043407zU.LIZJ) {
                try {
                    if (!C2043407zU.LIZLLL || C2043407zU.LJ) {
                        z = false;
                    } else {
                        z = true;
                        C2043407zU.LJ = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (z) {
                C2043407zU.LIZIZ();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ExploreFirstScreenCoverGate@27b1.forceOpenRunnable$1");
    }
}
