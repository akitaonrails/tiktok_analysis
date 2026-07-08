package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0W89, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W89 implements Runnable {
    public final /* synthetic */ Runnable LL;

    public C0W89(Runnable runnable) {
        this.LL = runnable;
    }

    @Override // java.lang.Runnable
    @C1BCF(distinctId = 10, scene = "boot", taskPriority = EnumC21352718hJ.P0)
    public final void run() {
        try {
            this.LL.run();
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                C1520960pgM.LIZIZ(th);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (!C2179971ATj.LIZ(th2)) {
                    throw th2;
                }
            }
        }
    }
}
