package androidx.lifecycle;

import X.AbstractC2252651DEx;
import X.C0PEM;
import X.C1DFH;
import X.C2107308Nj;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
public final class PausingDispatcher extends AbstractC2252651DEx {
    public final DispatchQueue dispatchQueue = new DispatchQueue();

    @Override // X.AbstractC2252651DEx
    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        C1DFH c1dfh = C0PEM.LIZ;
        if (C2107308Nj.LIZ.LLIILII().isDispatchNeeded(coroutineContext)) {
            return true;
        }
        return !this.dispatchQueue.canRun();
    }

    @Override // X.AbstractC2252651DEx
    public void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        this.dispatchQueue.dispatchAndEnqueue(coroutineContext, runnable);
    }
}
