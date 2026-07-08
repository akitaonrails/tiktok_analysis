package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.092S, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C092S<T> implements Runnable {
    public final AtomicBoolean LL = new AtomicBoolean(false);
    public final FutureTask<T> LLILLJJLI;
    public final C092O<Exception> LLILLL;

    public final T LIZ() {
        try {
            return this.LLILLJJLI.get();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Get result from OnceTask failed since: ");
            sbLIZ.append(e.toString());
            LynxLog.e("OnceTask", C2188811AlT.LIZIZ(sbLIZ));
            C092O<Exception> c092o = this.LLILLL;
            if (c092o == null) {
                return null;
            }
            c092o.accept(e);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("OnceTask@5186.run");
        try {
            if (this.LL.compareAndSet(false, true)) {
                this.LLILLJJLI.run();
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OnceTask@5186.run");
    }

    public C092S(Callable<T> callable, C092O<Exception> c092o) {
        this.LLILLL = null;
        this.LLILLJJLI = new FutureTask<>(callable);
        this.LLILLL = c092o;
    }
}
