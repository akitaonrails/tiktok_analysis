package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.07yD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC2035507yD implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("CronetUrlRequestContext@4cdf.onThroughputObservation$1");
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
            C1C7U.LIZIZ("CronetUrlRequestContext@4cdf.onThroughputObservation$1");
        }
    }
}
