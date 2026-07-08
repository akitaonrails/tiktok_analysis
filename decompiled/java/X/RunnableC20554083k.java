package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.083k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC20554083k implements Runnable {
    public final /* synthetic */ Runnable LL;

    public RunnableC20554083k(RunnableC775480UbS runnableC775480UbS) {
        this.LL = runnableC775480UbS;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("MonitorThreadHelper@2592.runOnWorkingThread$1");
        try {
            try {
                this.LL.run();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1CC2.LIZ("LinkLayerMonitor Error", th);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MonitorThreadHelper@2592.runOnWorkingThread$1");
    }
}
