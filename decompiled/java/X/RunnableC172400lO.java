package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.00lO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC172400lO implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("CronetBidirectionalStream@4745.onResponseHeadersReceived$1");
        try {
            throw null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
            C1C7U.LIZIZ("CronetBidirectionalStream@4745.onResponseHeadersReceived$1");
        }
    }
}
