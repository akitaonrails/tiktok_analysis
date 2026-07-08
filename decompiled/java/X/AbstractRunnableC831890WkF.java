package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WkF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractRunnableC831890WkF implements Runnable {
    public final /* synthetic */ C831820Wk8 LL;

    public /* synthetic */ AbstractRunnableC831890WkF(C831820Wk8 c831820Wk8) {
        this.LL = c831820Wk8;
    }

    public abstract void LIZIZ();

    public final void LIZ() {
        this.LL.LIZIZ.lock();
        try {
            try {
                if (Thread.interrupted()) {
                    this.LL.LIZIZ.unlock();
                    return;
                } else {
                    LIZIZ();
                    this.LL.LIZIZ.unlock();
                    return;
                }
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                C831840WkA c831840WkA = this.LL.LIZ;
                c831840WkA.LLILZIL.sendMessage(c831840WkA.LLILZIL.obtainMessage(2, e));
                this.LL.LIZIZ.unlock();
                return;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LL.LIZIZ.unlock();
            throw th;
        }
        TryCatchGuardChecker.doCheck(th);
        this.LL.LIZIZ.unlock();
        throw th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("zaav@ee3.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("zaav@ee3.run");
    }
}
