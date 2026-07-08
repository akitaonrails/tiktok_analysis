package X;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.1DFD, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DFD extends AbstractC2252651DEx {
    public static final C1DFD LL = new C1DFD();

    @Override // X.AbstractC2252651DEx
    public final AbstractC2252651DEx limitedParallelism(int i) {
        C1917207f8.LIZ(i);
        if (i >= C1DFC.LIZLLL) {
            return this;
        }
        return super.limitedParallelism(i);
    }

    @Override // X.AbstractC2252651DEx
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        C1DFH c1dfh = C1DFH.LLILLJJLI;
        c1dfh.LL.dispatch(runnable, C1DFC.LJII, false);
    }

    @Override // X.AbstractC2252651DEx
    public final void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        C1DFH c1dfh = C1DFH.LLILLJJLI;
        c1dfh.LL.dispatch(runnable, C1DFC.LJII, true);
    }
}
