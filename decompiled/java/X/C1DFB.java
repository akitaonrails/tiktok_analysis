package X;

import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.1DFB, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DFB extends C1DFT implements Executor {
    public static final C1DFB LL = new C1DFB();
    public static final AbstractC2252651DEx LLILLJJLI;

    @Override // X.C1DFT
    public final Executor LLIILII() {
        return this;
    }

    @Override // X.AbstractC2252651DEx
    public final String toString() {
        return "Dispatchers.IO";
    }

    static {
        C1DFD c1dfd = C1DFD.LL;
        int i = C1BA4.LIZ;
        if (64 >= i) {
            i = 64;
        }
        LLILLJJLI = c1dfd.limitedParallelism(C1992307rF.LIZIZ("kotlinx.coroutines.io.parallelism", i, 0, 0, 12));
    }

    @Override // X.C1DFT, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        "Cannot be invoked on Dispatchers.IO".toString();
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        C0WQQ.LIZ(this, C23271099x.INSTANCE, runnable);
    }

    @Override // X.AbstractC2252651DEx
    public final AbstractC2252651DEx limitedParallelism(int i) {
        return C1DFD.LL.limitedParallelism(i);
    }

    @Override // X.AbstractC2252651DEx
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        C0WQQ.LIZ(LLILLJJLI, coroutineContext, runnable);
    }

    @Override // X.AbstractC2252651DEx
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        LLILLJJLI.dispatchYield(coroutineContext, runnable);
    }
}
