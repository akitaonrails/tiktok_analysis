package X;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.1DFM, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DFM implements Executor {
    public final AbstractC2252651DEx LL;

    public final String toString() {
        return this.LL.toString();
    }

    public C1DFM(AbstractC2252651DEx abstractC2252651DEx) {
        this.LL = abstractC2252651DEx;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC2252651DEx abstractC2252651DEx = this.LL;
        C23271099x c23271099x = C23271099x.INSTANCE;
        if (abstractC2252651DEx.isDispatchNeeded(c23271099x)) {
            C0WQQ.LIZ(this.LL, c23271099x, runnable);
        } else {
            runnable.run();
        }
    }
}
