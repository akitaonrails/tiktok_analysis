package X;

import Y.ARunnableS113S0100000_13;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0W0i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC816260W0i {
    public final RunnableC816250W0h runnable = new RunnableC816250W0h(new ARunnableS113S0100000_13(this, 142));
    public final AtomicBoolean initialized = new AtomicBoolean(false);

    public static /* synthetic */ void lambda$semisugar$runCatching$0(AbstractC816260W0i abstractC816260W0i) {
        C1C7U.LIZ("LynxLazyInitializer@8796.<init>$1L");
        abstractC816260W0i.runCatching();
        C1C7U.LIZIZ("LynxLazyInitializer@8796.<init>$1L");
    }

    public abstract boolean doInitialize();

    public boolean ensureInitialized() {
        return ensureInitialized(true);
    }

    private void runCatching() {
        try {
            this.initialized.set(doInitialize());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("initialize failed: ");
            sbLIZ.append(th);
            LynxLog.e("LynxLazyInitializer", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void initialize() {
        if (this.runnable.LLILLJJLI.get() == 0) {
            C1301610jyZ.LIZ().execute(this.runnable);
        }
    }

    public boolean ensureInitialized(boolean z) {
        if (this.runnable.LLILLJJLI.get() == 3) {
            return this.initialized.get();
        }
        if (!z) {
            initialize();
        } else {
            this.runnable.run();
        }
        RunnableC816250W0h runnableC816250W0h = this.runnable;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        runnableC816250W0h.getClass();
        try {
            if (runnableC816250W0h.LLILZ.await(3L, timeUnit)) {
                return this.initialized.get();
            }
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LynxLog.e("LynxLazyInitializer", "ensureInitialized timeout");
        return false;
    }
}
