package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08VI, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08VI implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("CronetBidirectionalStream@4745.onCanceled$1");
        try {
            try {
                throw null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C08VH.LIZ("Exception in onCanceled method", e);
                C1C7U.LIZIZ("CronetBidirectionalStream@4745.onCanceled$1");
            }
        } finally {
            if (!zLIZ) {
            }
            C1C7U.LIZIZ("CronetBidirectionalStream@4745.onCanceled$1");
        }
    }
}
