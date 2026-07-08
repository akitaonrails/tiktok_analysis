package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CompletedExceptionally;

/* JADX INFO: renamed from: X.1DEu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252621DEu<T> extends AbstractC2252631DEv<T> implements InterfaceC23256099i, InterfaceC1364105Vn<T> {
    public static final AtomicReferenceFieldUpdater LLIZLLLIL = AtomicReferenceFieldUpdater.newUpdater(C2252621DEu.class, Object.class, "_reusableCancellableContinuation");
    public final AbstractC2252651DEx LLILZ;
    public final InterfaceC1364105Vn<T> LLILZIL;
    public Object LLILZLL;
    public final Object LLIZ;
    public volatile Object _reusableCancellableContinuation;

    @Override // X.AbstractC2252631DEv
    public final InterfaceC1364105Vn<T> LIZIZ() {
        return this;
    }

    @Override // X.InterfaceC1364105Vn
    public final CoroutineContext getContext() {
        return this.LLILZIL.getContext();
    }

    @Override // X.AbstractC2252631DEv
    public final Object LJIIIIZZ() {
        Object obj = this.LLILZLL;
        this.LLILZLL = C2252641DEw.LIZ;
        return obj;
    }

    @Override // X.InterfaceC23256099i
    public final InterfaceC23256099i getCallerFrame() {
        InterfaceC1364105Vn<T> interfaceC1364105Vn = this.LLILZIL;
        if (interfaceC1364105Vn instanceof InterfaceC23256099i) {
            return (InterfaceC23256099i) interfaceC1364105Vn;
        }
        return null;
    }

    public final String toString() {
        if (C2252781DFk.LIZ == 0) {
            C2252781DFk.LIZ = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() - C2252781DFk.LIZ > 10000 && ((Number) C0CD2.LJIILIIL.getValue()).intValue() == 2) {
            return "DispatchedContinuation[]";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DispatchedContinuation[");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", ");
        sbLIZ.append(C2239208py.LIZIZ(this.LLILZIL));
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1364105Vn
    public final void resumeWith(Object obj) {
        Object completedExceptionally;
        CoroutineContext context = this.LLILZIL.getContext();
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        if (thM5exceptionOrNullimpl == null) {
            completedExceptionally = obj;
        } else {
            completedExceptionally = new CompletedExceptionally(thM5exceptionOrNullimpl, false, 2, null);
        }
        if (this.LLILZ.isDispatchNeeded(context)) {
            this.LLILZLL = completedExceptionally;
            this.LLILLL = 0;
            C0WQQ.LIZ(this.LLILZ, context, this);
            return;
        }
        AbstractC2252601DEs abstractC2252601DEsLIZ = C23262099o.LIZ();
        if (abstractC2252601DEsLIZ.isUnconfinedLoopActive()) {
            this.LLILZLL = completedExceptionally;
            this.LLILLL = 0;
            abstractC2252601DEsLIZ.dispatchUnconfined(this);
            return;
        }
        abstractC2252601DEsLIZ.incrementUseCount(true);
        try {
            CoroutineContext context2 = getContext();
            Object objLIZJ = C09AQ.LIZJ(context2, this.LLIZ);
            try {
                this.LLILZIL.resumeWith(obj);
                while (abstractC2252601DEsLIZ.processUnconfinedEvent()) {
                }
            } finally {
                C09AQ.LIZ(context2, objLIZJ);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2252621DEu(AbstractC2252651DEx abstractC2252651DEx, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
        super(-1);
        this.LLILZ = abstractC2252651DEx;
        this.LLILZIL = interfaceC1364105Vn;
        this.LLILZLL = C2252641DEw.LIZ;
        this.LLIZ = C09AQ.LIZIZ(getContext());
    }

    @Override // X.AbstractC2252631DEv
    public final void LIZ(Object obj, Throwable th) {
        if (obj instanceof C1165404hA) {
            ((C1165404hA) obj).LIZIZ.invoke(th);
        }
    }
}
