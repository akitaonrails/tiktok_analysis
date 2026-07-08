package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Dus, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354360Dus extends C0W9W {
    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C1C7U.LIZ("ChainedAnalytics$Chain@cf87.run");
        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
        try {
            C13LP.LJJLIIIJL(null);
            throw null;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                if (!C2179971ATj.LIZ(th)) {
                    throw th;
                }
                if (zLJ) {
                    C0W9U.LJFF();
                }
                C1C7U.LIZIZ("ChainedAnalytics$Chain@cf87.run");
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (zLJ) {
                    C0W9U.LJFF();
                }
                throw th2;
            }
        }
    }
}
