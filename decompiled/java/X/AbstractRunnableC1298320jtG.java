package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jtG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractRunnableC1298320jtG implements Runnable {
    public final InterfaceC1298330jtH LL;

    public abstract void LIZ();

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SafeRunnable@15fa.run");
        try {
            try {
                LIZ();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                this.LL.handleException(e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SafeRunnable@15fa.run");
    }

    public AbstractRunnableC1298320jtG(InterfaceC1298330jtH interfaceC1298330jtH) {
        this.LL = interfaceC1298330jtH;
    }
}
