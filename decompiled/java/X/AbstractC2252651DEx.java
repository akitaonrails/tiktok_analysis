package X;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.1DEx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2252651DEx extends AbstractC23273099z implements InterfaceC23139094v {
    public static final C1DFR Key = new C09AB<InterfaceC23139094v, AbstractC2252651DEx>() { // from class: X.1DFR
        {
            C23138094u c23138094u = InterfaceC23139094v.LJJLIIJ;
            new C1DFV();
        }
    };

    public abstract void dispatch(CoroutineContext coroutineContext, Runnable runnable);

    public boolean isDispatchNeeded(CoroutineContext coroutineContext) {
        return true;
    }

    @InterfaceC1294060jmO
    public final AbstractC2252651DEx plus(AbstractC2252651DEx abstractC2252651DEx) {
        return abstractC2252651DEx;
    }

    public AbstractC2252651DEx() {
        super(InterfaceC23139094v.LJJLIIJ);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getClass().getSimpleName());
        sbLIZ.append('@');
        sbLIZ.append(C2239208py.LIZ(this));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC23273099z, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(InterfaceC23272099y<E> interfaceC23272099y) {
        return (E) C09AA.LIZ(this, interfaceC23272099y);
    }

    @Override // X.InterfaceC23139094v
    public final <T> InterfaceC1364105Vn<T> interceptContinuation(InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        return new C2252621DEu(this, interfaceC1364105Vn);
    }

    public AbstractC2252651DEx limitedParallelism(int i) {
        C1917207f8.LIZ(i);
        return new C2252581DEq(this, i);
    }

    @Override // X.AbstractC23273099z, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(InterfaceC23272099y<?> interfaceC23272099y) {
        return C09AA.LIZIZ(this, interfaceC23272099y);
    }

    @Override // X.InterfaceC23139094v
    public final void releaseInterceptedContinuation(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2252611DEt c2252611DEt;
        while (C2252621DEu.LLIZLLLIL.get(interfaceC1364105Vn) == C2252641DEw.LIZIZ) {
        }
        Object obj = C2252621DEu.LLIZLLLIL.get(interfaceC1364105Vn);
        if ((obj instanceof C2252611DEt) && (c2252611DEt = (C2252611DEt) obj) != null) {
            c2252611DEt.LJIILIIL();
        }
    }

    public void dispatchYield(CoroutineContext coroutineContext, Runnable runnable) {
        C0WQQ.LIZ(this, coroutineContext, runnable);
    }
}
