package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: X.11Rz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class CallableC19502911Rz extends AbstractC19502611Rw implements Callable<Void> {
    public static final long serialVersionUID = 1811839108042568751L;

    @Override // java.util.concurrent.Callable
    public Void call() {
        this.LLILLJJLI = C786410Ut5.u3();
        try {
            this.LL.run();
            lazySet(AbstractC19502611Rw.LLILLL);
            this.LLILLJJLI = null;
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            lazySet(AbstractC19502611Rw.LLILLL);
            this.LLILLJJLI = null;
            throw th;
        }
    }

    @Override // X.AbstractC19502611Rw
    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    public CallableC19502911Rz(Runnable runnable) {
        super(runnable);
    }
}
