package X;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: renamed from: X.099D, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public abstract class C099D<T> extends JobSupport implements InterfaceC1364105Vn<T>, InterfaceC497601wk {
    public final CoroutineContext LLILLL;

    public void LJLILLLLZI(Throwable th, boolean z) {
    }

    public void LJLJJI(T t) {
    }

    @Override // kotlinx.coroutines.JobSupport
    public final String LJJIJIL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append(" was cancelled");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // kotlinx.coroutines.JobSupport
    public String LJJLIIIJJIZ() {
        return super.LJJLIIIJJIZ();
    }

    @Override // kotlinx.coroutines.JobSupport, X.C09AE
    public boolean isActive() {
        return super.isActive();
    }

    @Override // X.InterfaceC1364105Vn
    public final CoroutineContext getContext() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LLILLL;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void LJJJLZIJ(C09AO c09ao) {
        C2185108hF.LIZ(this.LLILLL, c09ao);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.JobSupport
    public final void LJJLIIIJLLLLLLLZ(Object obj) {
        if (obj instanceof CompletedExceptionally) {
            CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
            LJLILLLLZI(completedExceptionally.cause, completedExceptionally.getHandled());
        } else {
            LJLJJI(obj);
        }
    }

    public void LJLIL(Object obj) {
        LJJIII(obj);
    }

    @Override // X.InterfaceC1364105Vn
    public final void resumeWith(Object obj) {
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        if (thM5exceptionOrNullimpl != null) {
            obj = new CompletedExceptionally(thM5exceptionOrNullimpl, false, 2, null);
        }
        Object objLJJLIIIJJI = LJJLIIIJJI(obj);
        if (objLJJLIIIJJI == C1DFI.LIZIZ) {
            return;
        }
        LJLIL(objLJJLIIIJJI);
    }

    public C099D(CoroutineContext coroutineContext, boolean z, boolean z2) {
        super(z2);
        if (z) {
            LJJLI((C09AE) coroutineContext.get(C09AE.LJJLJ));
        }
        this.LLILLL = coroutineContext.plus(this);
    }
}
