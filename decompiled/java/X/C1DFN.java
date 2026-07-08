package X;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.1DFN, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DFN extends AbstractC2252651DEx {
    public static final C1DFN LL = new C1DFN();

    @Override // X.AbstractC2252651DEx
    public final boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return false;
    }

    @Override // X.AbstractC2252651DEx
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // X.AbstractC2252651DEx
    public final AbstractC2252651DEx limitedParallelism(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // X.AbstractC2252651DEx
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        C1DFQ c1dfq = (C1DFQ) coroutineContext.get(C1DFQ.LLILLJJLI);
        if (c1dfq != null) {
            c1dfq.LL = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }
}
