package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: renamed from: X.1DEt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2252611DEt<T> extends AbstractC2252631DEv<T> implements InterfaceC20236714Gf<T>, InterfaceC23256099i, C1DEG {
    public static final AtomicIntegerFieldUpdater LLILZLL = AtomicIntegerFieldUpdater.newUpdater(C2252611DEt.class, "_decisionAndIndex");
    public static final AtomicReferenceFieldUpdater LLIZ = AtomicReferenceFieldUpdater.newUpdater(C2252611DEt.class, Object.class, "_state");
    public static final AtomicReferenceFieldUpdater LLIZLLLIL = AtomicReferenceFieldUpdater.newUpdater(C2252611DEt.class, Object.class, "_parentHandle");
    public final InterfaceC1364105Vn<T> LLILZ;
    public final CoroutineContext LLILZIL;
    public volatile int _decisionAndIndex;
    public volatile Object _parentHandle;
    public volatile Object _state;

    public String LJJIIJ() {
        return "CancellableContinuation";
    }

    public final void LJIILIIL() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LLIZLLLIL;
        InterfaceC2238208po interfaceC2238208po = (InterfaceC2238208po) atomicReferenceFieldUpdater.get(this);
        if (interfaceC2238208po == null) {
            return;
        }
        interfaceC2238208po.dispose();
        atomicReferenceFieldUpdater.set(this, C09AF.LL);
    }

    public final Object LJIJI() {
        return LLIZ.get(this);
    }

    public final InterfaceC2238208po LJIJJLI() {
        C09AE c09ae = (C09AE) this.LLILZIL.get(C09AE.LJJLJ);
        if (c09ae == null) {
            return null;
        }
        InterfaceC2238208po interfaceC2238208poLIZIZ = C1145850fvL.LIZIZ(c09ae, true, new AbstractC2252721DFe(this) { // from class: X.1DF4
            public final C2252611DEt<?> LLILZIL;

            {
                this.LLILZIL = this;
            }

            @Override // X.C1DFU
            public final void LJII(Throwable th) {
                C2252611DEt<?> c2252611DEt = this.LLILZIL;
                Throwable thLJIIZILJ = c2252611DEt.LJIIZILJ(LJIIIIZZ());
                if (c2252611DEt.LJJI()) {
                    InterfaceC1364105Vn<?> interfaceC1364105Vn = c2252611DEt.LLILZ;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2252621DEu.LLIZLLLIL;
                    loop0: while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(interfaceC1364105Vn);
                        C09AU c09au = C2252641DEw.LIZIZ;
                        if (Intrinsics.LJFF(obj, c09au)) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2252621DEu.LLIZLLLIL;
                            while (!atomicReferenceFieldUpdater2.compareAndSet(interfaceC1364105Vn, c09au, thLJIIZILJ)) {
                                if (atomicReferenceFieldUpdater2.get(interfaceC1364105Vn) != c09au) {
                                    break;
                                }
                            }
                            return;
                        }
                        if (!(obj instanceof Throwable)) {
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C2252621DEu.LLIZLLLIL;
                            while (!atomicReferenceFieldUpdater3.compareAndSet(interfaceC1364105Vn, obj, null)) {
                                if (atomicReferenceFieldUpdater3.get(interfaceC1364105Vn) != obj) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        return;
                    }
                }
                c2252611DEt.LJJIIZ(thLJIIZILJ);
                if (!c2252611DEt.LJJI()) {
                    c2252611DEt.LJIILIIL();
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                LJII(th);
                return Unit.LIZ;
            }
        }, 2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LLIZLLLIL;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC2238208poLIZIZ) && atomicReferenceFieldUpdater.get(this) == null) {
        }
        return interfaceC2238208poLIZIZ;
    }

    public final boolean LJJI() {
        if (this.LLILLL == 2) {
            return C2252621DEu.LLIZLLLIL.get(this.LLILZ) != null;
        }
        return false;
    }

    public final void LJJIIZI() {
        InterfaceC1364105Vn<T> interfaceC1364105Vn = this.LLILZ;
        if (!(interfaceC1364105Vn instanceof C2252621DEu) || interfaceC1364105Vn == null) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2252621DEu.LLIZLLLIL;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(interfaceC1364105Vn);
            C09AU c09au = C2252641DEw.LIZIZ;
            if (obj == c09au) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2252621DEu.LLIZLLLIL;
                while (!atomicReferenceFieldUpdater2.compareAndSet(interfaceC1364105Vn, c09au, this)) {
                    if (atomicReferenceFieldUpdater2.get(interfaceC1364105Vn) != c09au) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof Throwable)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Inconsistent state ");
                sbLIZ.append(obj);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalStateException(strLIZIZ);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C2252621DEu.LLIZLLLIL;
            while (!atomicReferenceFieldUpdater3.compareAndSet(interfaceC1364105Vn, obj, null)) {
                if (atomicReferenceFieldUpdater3.get(interfaceC1364105Vn) != obj) {
                    "Failed requirement.".toString();
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            Throwable th = (Throwable) obj;
            if (th != null) {
                LJIILIIL();
                LJJIIZ(th);
                return;
            }
            return;
        }
    }

    @Override // X.InterfaceC23256099i
    public final InterfaceC23256099i getCallerFrame() {
        InterfaceC1364105Vn<T> interfaceC1364105Vn = this.LLILZ;
        if (interfaceC1364105Vn instanceof InterfaceC23256099i) {
            return (InterfaceC23256099i) interfaceC1364105Vn;
        }
        return null;
    }

    @Override // X.AbstractC2252631DEv
    public final Object LJIIIIZZ() {
        return LJIJI();
    }

    public final Object LJIJ() {
        int i;
        C09AE c09ae;
        boolean zLJJI = LJJI();
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = LLILZLL;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    "Already suspended".toString();
                    throw new IllegalStateException("Already suspended");
                }
                if (zLJJI) {
                    LJJIIZI();
                }
                Object objLJIJI = LJIJI();
                if (objLJIJI instanceof CompletedExceptionally) {
                    throw ((CompletedExceptionally) objLJIJI).cause;
                }
                int i3 = this.LLILLL;
                if ((i3 != 1 && i3 != 2) || (c09ae = (C09AE) this.LLILZIL.get(C09AE.LJJLJ)) == null || c09ae.isActive()) {
                    return LJ(objLJIJI);
                }
                CancellationException cancellationExceptionLJJJLL = c09ae.LJJJLL();
                LIZ(objLJIJI, cancellationExceptionLJJJLL);
                throw cancellationExceptionLJJJLL;
            }
        } while (!LLILZLL.compareAndSet(this, i, (536870911 & i) + 536870912));
        if (LLIZLLLIL.get(this) == null) {
            LJIJJLI();
        }
        if (zLJJI) {
            LJJIIZI();
        }
        return C099R.LJFF();
    }

    public final void LJIJJ() {
        InterfaceC2238208po interfaceC2238208poLJIJJLI = LJIJJLI();
        if (interfaceC2238208poLJIJJLI != null && isCompleted()) {
            interfaceC2238208poLJIJJLI.dispose();
            LLIZLLLIL.set(this, C09AF.LL);
        }
    }

    @Override // X.InterfaceC20236714Gf
    public final boolean isActive() {
        return LJIJI() instanceof InterfaceC2236308pV;
    }

    @Override // X.InterfaceC20236714Gf
    public final boolean isCancelled() {
        return LJIJI() instanceof C23259099l;
    }

    @Override // X.InterfaceC20236714Gf
    public final boolean isCompleted() {
        return !(LJIJI() instanceof InterfaceC2236308pV);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJJIIJ());
        sbLIZ.append('(');
        sbLIZ.append(C2239208py.LIZIZ(this.LLILZ));
        sbLIZ.append("){");
        Object objLJIJI = LJIJI();
        sbLIZ.append(objLJIJI instanceof InterfaceC2236308pV ? "Active" : objLJIJI instanceof C23259099l ? "Cancelled" : "Completed");
        sbLIZ.append("}@");
        sbLIZ.append(C2239208py.LIZ(this));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC2252631DEv
    public final InterfaceC1364105Vn<T> LIZIZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1364105Vn
    public final CoroutineContext getContext() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2252631DEv
    public final Throwable LIZJ(Object obj) {
        Throwable thLIZJ = super.LIZJ(obj);
        if (thLIZJ == null) {
            return null;
        }
        return thLIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC2252631DEv
    public final <T> T LJ(Object obj) {
        if (obj instanceof C19370310qL) {
            return (T) ((C19370310qL) obj).LIZ;
        }
        return obj;
    }

    @Override // X.InterfaceC20236714Gf
    public final void LJIIL(Object obj) {
        LJIILJJIL(this.LLILLL);
    }

    public final void LJIILJJIL(int i) {
        int i2;
        boolean z;
        boolean z2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = LLILZLL;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            boolean z3 = false;
            if (i3 != 0) {
                if (i3 == 1) {
                    InterfaceC1364105Vn<T> interfaceC1364105Vn = this.LLILZ;
                    if (i == 4) {
                        z = true;
                    } else {
                        z = false;
                        if (interfaceC1364105Vn instanceof C2252621DEu) {
                            if (i != 1 && i != 2) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            int i4 = this.LLILLL;
                            if (i4 == 1 || i4 == 2) {
                                z3 = true;
                            }
                            if (z2 == z3) {
                                AbstractC2252651DEx abstractC2252651DEx = ((C2252621DEu) interfaceC1364105Vn).LLILZ;
                                CoroutineContext context = interfaceC1364105Vn.getContext();
                                if (abstractC2252651DEx.isDispatchNeeded(context)) {
                                    C0WQQ.LIZ(abstractC2252651DEx, context, this);
                                    return;
                                }
                                AbstractC2252601DEs abstractC2252601DEsLIZ = C23262099o.LIZ();
                                if (abstractC2252601DEsLIZ.isUnconfinedLoopActive()) {
                                    abstractC2252601DEsLIZ.dispatchUnconfined(this);
                                    return;
                                }
                                abstractC2252601DEsLIZ.incrementUseCount(true);
                                try {
                                    C1DF0.LIZ(this, this.LLILZ, true);
                                    do {
                                    } while (abstractC2252601DEsLIZ.processUnconfinedEvent());
                                } finally {
                                    try {
                                    } finally {
                                    }
                                }
                                return;
                            }
                        }
                    }
                    C1DF0.LIZ(this, interfaceC1364105Vn, z);
                    return;
                }
                "Already resumed".toString();
                throw new IllegalStateException("Already resumed");
            }
        } while (!LLILZLL.compareAndSet(this, i2, (536870911 & i2) + 1073741824));
    }

    public Throwable LJIIZILJ(JobSupport jobSupport) {
        return jobSupport.LJJJLL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJ(Object obj) {
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LLIZ;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C2252771DFj) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LLIZ;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, obj)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            if (obj2 instanceof AbstractC2236208pU) {
                z = true;
            } else {
                z = obj2 instanceof C1DET;
            }
            if (!z) {
                if (obj2 instanceof CompletedExceptionally) {
                    CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj2;
                    if (completedExceptionally.makeHandled()) {
                        if (obj2 instanceof C23259099l) {
                            Throwable th = completedExceptionally.cause;
                            if (obj instanceof AbstractC2236208pU) {
                                LJIIIZ((AbstractC2236208pU) obj, th);
                                return;
                            } else {
                                LJIIJJI((C1DET) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    LJJIII(obj, obj2);
                    throw null;
                }
                if (obj2 instanceof C19370310qL) {
                    C19370310qL c19370310qL = (C19370310qL) obj2;
                    if (c19370310qL.LIZIZ == null) {
                        if (obj instanceof C1DET) {
                            return;
                        }
                        AbstractC2236208pU abstractC2236208pU = (AbstractC2236208pU) obj;
                        Throwable th2 = c19370310qL.LJ;
                        if (th2 != null) {
                            LJIIIZ(abstractC2236208pU, th2);
                            return;
                        }
                        C19370310qL c19370310qLLIZ = C19370310qL.LIZ(c19370310qL, abstractC2236208pU, null, 29);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = LLIZ;
                        while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj2, c19370310qLLIZ)) {
                            if (atomicReferenceFieldUpdater3.get(this) != obj2) {
                                break;
                            }
                        }
                        return;
                    }
                    LJJIII(obj, obj2);
                    throw null;
                }
                if (obj instanceof C1DET) {
                    return;
                }
                C19370310qL c19370310qL2 = new C19370310qL(obj2, (AbstractC2236208pU) obj, (Function1) null, (Throwable) (0 == true ? 1 : 0), 28);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = LLIZ;
                while (!atomicReferenceFieldUpdater4.compareAndSet(this, obj2, c19370310qL2)) {
                    if (atomicReferenceFieldUpdater4.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            LJJIII(obj, obj2);
            throw null;
        }
    }

    @Override // X.InterfaceC20236714Gf
    public final void LJJII(final Function1<? super Throwable, Unit> function1) {
        if (!(function1 instanceof AbstractC2236208pU)) {
            function1 = new AbstractC2236208pU(function1) { // from class: X.08pp
                public final Function1<Throwable, Unit> LL;

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("InvokeOnCancel[");
                    sbLIZ.append(this.LL.getClass().getSimpleName());
                    sbLIZ.append('@');
                    sbLIZ.append(C2239208py.LIZ(this));
                    sbLIZ.append(']');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LL = function1;
                }

                @Override // X.AbstractC2236108pT
                public final void LJFF(Throwable th) {
                    this.LL.invoke(th);
                }

                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    LJFF(th);
                    return Unit.LIZ;
                }
            };
        }
        LJJ(function1);
    }

    @Override // X.InterfaceC20236714Gf
    public final boolean LJJIIZ(Throwable th) {
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LLIZ;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC2236308pV)) {
                return false;
            }
            if (!(obj instanceof AbstractC2236208pU) && !(obj instanceof C1DET)) {
                z = false;
            } else {
                z = true;
            }
            C23259099l c23259099l = new C23259099l(this, th, z);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LLIZ;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c23259099l)) {
                if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    break;
                }
            }
            if (obj instanceof AbstractC2236208pU) {
                LJIIIZ((AbstractC2236208pU) obj, th);
            } else if (obj instanceof C1DET) {
                LJIIJJI((C1DET) obj, th);
            }
            if (!LJJI()) {
                LJIILIIL();
            }
            LJIILJJIL(this.LLILLL);
            return true;
        }
    }

    @Override // X.InterfaceC20236714Gf
    public final C09AU LJJIJ(Throwable th) {
        return LJJIJIL(null, new CompletedExceptionally(th, false, 2, null));
    }

    @Override // X.InterfaceC1364105Vn
    public final void resumeWith(Object obj) {
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(obj);
        if (thM5exceptionOrNullimpl != null) {
            obj = new CompletedExceptionally(thM5exceptionOrNullimpl, false, 2, null);
        }
        LJJIJIIJI(this.LLILLL, obj, null);
    }

    public C2252611DEt(int i, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(i);
        this.LLILZ = interfaceC1364105Vn;
        this.LLILZIL = interfaceC1364105Vn.getContext();
        this._decisionAndIndex = 536870911;
        this._state = C2252771DFj.LL;
    }

    public static void LJJIII(Object obj, Object obj2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("It's prohibited to register multiple handlers, tried to register ");
        sbLIZ.append(obj);
        sbLIZ.append(", already has ");
        sbLIZ.append(obj2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    @Override // X.AbstractC2252631DEv
    public final void LIZ(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LLIZ;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC2236308pV)) {
                if (obj2 instanceof CompletedExceptionally) {
                    return;
                }
                if (obj2 instanceof C19370310qL) {
                    C19370310qL c19370310qL = (C19370310qL) obj2;
                    if (c19370310qL.LJ != null) {
                        "Must be called at most once".toString();
                        throw new IllegalStateException("Must be called at most once");
                    }
                    C19370310qL c19370310qLLIZ = C19370310qL.LIZ(c19370310qL, null, th, 15);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LLIZ;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c19370310qLLIZ)) {
                        if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                            break;
                        }
                    }
                    AbstractC2236208pU abstractC2236208pU = c19370310qL.LIZIZ;
                    if (abstractC2236208pU != null) {
                        LJIIIZ(abstractC2236208pU, th);
                    }
                    Function1<Throwable, Unit> function1 = c19370310qL.LIZJ;
                    if (function1 != null) {
                        LJIIJ(th, function1);
                        return;
                    }
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = LLIZ;
                AbstractC2236208pU abstractC2236208pU2 = null;
                C19370310qL c19370310qL2 = new C19370310qL(obj2, abstractC2236208pU2, abstractC2236208pU2, th, 14);
                while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj2, c19370310qL2)) {
                    if (atomicReferenceFieldUpdater3.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            "Not completed".toString();
            throw new IllegalStateException("Not completed");
        }
    }

    @Override // X.C1DEG
    public final void LIZLLL(C1DET<?> c1det, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = LLILZLL;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                "invokeOnCancellation should be called at most once".toString();
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        LJJ(c1det);
    }

    public final void LJIIIZ(AbstractC2236208pU abstractC2236208pU, Throwable th) {
        try {
            abstractC2236208pU.LJFF(th);
        } catch (Throwable th2) {
            CoroutineContext coroutineContext = this.LLILZIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Exception in invokeOnCancellation handler for ");
            sbLIZ.append(this);
            C2185108hF.LIZ(coroutineContext, new C09AO(C2188811AlT.LIZIZ(sbLIZ), th2));
        }
    }

    public final void LJIIJ(Throwable th, Function1 function1) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            CoroutineContext coroutineContext = this.LLILZIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Exception in resume onCancellation handler for ");
            sbLIZ.append(this);
            C2185108hF.LIZ(coroutineContext, new C09AO(C2188811AlT.LIZIZ(sbLIZ), th2));
        }
    }

    public final void LJIIJJI(C1DET<?> c1det, Throwable th) {
        int i = LLILZLL.get(this) & 536870911;
        if (i != 536870911) {
            try {
                c1det.LJI(i, this.LLILZIL);
                return;
            } catch (Throwable th2) {
                CoroutineContext coroutineContext = this.LLILZIL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Exception in invokeOnCancellation handler for ");
                sbLIZ.append(this);
                C2185108hF.LIZ(coroutineContext, new C09AO(C2188811AlT.LIZIZ(sbLIZ), th2));
                return;
            }
        }
        "The index for Segment.onCancellation(..) is broken".toString();
        throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
    }

    @Override // X.InterfaceC20236714Gf
    public final void LJIL(AbstractC2252651DEx abstractC2252651DEx, T t) {
        AbstractC2252651DEx abstractC2252651DEx2;
        int i;
        C2252621DEu c2252621DEu;
        InterfaceC1364105Vn<T> interfaceC1364105Vn = this.LLILZ;
        if ((interfaceC1364105Vn instanceof C2252621DEu) && (c2252621DEu = (C2252621DEu) interfaceC1364105Vn) != null) {
            abstractC2252651DEx2 = c2252621DEu.LLILZ;
        } else {
            abstractC2252651DEx2 = null;
        }
        if (abstractC2252651DEx2 == abstractC2252651DEx) {
            i = 4;
        } else {
            i = this.LLILLL;
        }
        LJJIJIIJI(i, t, null);
    }

    @Override // X.InterfaceC20236714Gf
    public final void LJJIFFI(Function1 function1, Object obj) {
        LJJIJIIJI(this.LLILLL, obj, function1);
    }

    @Override // X.InterfaceC20236714Gf
    public final C09AU LJJIIJZLJL(Function1 function1, Object obj) {
        return LJJIJIL(function1, obj);
    }

    public final C09AU LJJIJIL(Function1 function1, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LLIZ;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC2236308pV) {
                Object objLJJIJIIJIL = LJJIJIIJIL((InterfaceC2236308pV) obj2, obj, this.LLILLL, function1);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LLIZ;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, objLJJIJIIJIL)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                if (!LJJI()) {
                    LJIILIIL();
                }
                return C2252731DFf.LIZ;
            }
            return null;
        }
    }

    public final void LJJIJIIJI(int i, Object obj, Function1 function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LLIZ;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC2236308pV) {
                Object objLJJIJIIJIL = LJJIJIIJIL((InterfaceC2236308pV) obj2, obj, i, function1);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LLIZ;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, objLJJIJIIJIL)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                if (!LJJI()) {
                    LJIILIIL();
                }
                LJIILJJIL(i);
                return;
            }
            if (obj2 instanceof C23259099l) {
                CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj2;
                completedExceptionally.getClass();
                if (C23259099l.LIZ.compareAndSet(completedExceptionally, 0, 1)) {
                    if (function1 != null) {
                        LJIIJ(completedExceptionally.cause, function1);
                        return;
                    }
                    return;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Already resumed, but proposed with update ");
            sbLIZ.append(obj);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalStateException(strLIZIZ);
        }
    }

    public static Object LJJIJIIJIL(InterfaceC2236308pV interfaceC2236308pV, Object obj, int i, Function1 function1) {
        AbstractC2236208pU abstractC2236208pU;
        if ((obj instanceof CompletedExceptionally) || ((i != 1 && i != 2) || (function1 == null && !(interfaceC2236308pV instanceof AbstractC2236208pU)))) {
            return obj;
        }
        if (interfaceC2236308pV instanceof AbstractC2236208pU) {
            abstractC2236208pU = (AbstractC2236208pU) interfaceC2236308pV;
        } else {
            abstractC2236208pU = null;
        }
        return new C19370310qL(obj, abstractC2236208pU, function1, (Throwable) null, 16);
    }
}
