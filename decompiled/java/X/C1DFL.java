package X;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.scheduling.CoroutineScheduler;

/* JADX INFO: renamed from: X.1DFL, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public class C1DFL extends C1DFT {
    public final CoroutineScheduler LL;

    @Override // X.C1DFT
    public final Executor LLIILII() {
        return this.LL;
    }

    @Override // X.AbstractC2252651DEx
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler.dispatch$default(this.LL, runnable, null, false, 6, null);
    }

    @Override // X.AbstractC2252651DEx
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler.dispatch$default(this.LL, runnable, null, true, 2, null);
    }

    public C1DFL(int i, int i2, long j, String str) {
        this.LL = new CoroutineScheduler(i, i2, j, str);
    }
}
