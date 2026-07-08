package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DE8, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DE8<R> extends AbstractC2236208pU implements InterfaceC2192561ArW<R>, C1DEF, C1DEG {
    public static final AtomicReferenceFieldUpdater LLILZLL = AtomicReferenceFieldUpdater.newUpdater(C1DE8.class, Object.class, "state");
    public final CoroutineContext LL;
    public Object LLILLL;
    public volatile Object state = C1DEA.LIZIZ;
    public List<C1DE8<R>.a> LLILLJJLI = new ArrayList(2);
    public int LLILZ = -1;
    public Object LLILZIL = C1DEA.LJ;

    /* JADX INFO: renamed from: X.1DE8$a */
    public final class a {
        public final Object LIZ;
        public final InterfaceC1631620sYq<Object, C1DEF<?>, Object, Unit> LIZIZ;
        public final InterfaceC1631620sYq<Object, Object, Object, Object> LIZJ;
        public final Object LIZLLL;
        public final Object LJ;
        public final InterfaceC1631620sYq<C1DEF<?>, Object, Object, Function1<Throwable, Unit>> LJFF;
        public Object LJI;
        public int LJII = -1;

        public final void LIZ() {
            InterfaceC2238208po interfaceC2238208po;
            Object obj = this.LJI;
            C1DE8<R> c1de8 = C1DE8.this;
            if (obj instanceof C1DET) {
                ((C1DET) obj).LJI(this.LJII, c1de8.LL);
            } else {
                if (!(obj instanceof InterfaceC2238208po) || (interfaceC2238208po = (InterfaceC2238208po) obj) == null) {
                    return;
                }
                interfaceC2238208po.dispose();
            }
        }

        public a(Object obj, InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1631620sYq interfaceC1631620sYq2, C09AU c09au, C09AX c09ax, InterfaceC1631620sYq interfaceC1631620sYq3) {
            this.LIZ = obj;
            this.LIZIZ = interfaceC1631620sYq;
            this.LIZJ = interfaceC1631620sYq2;
            this.LIZLLL = c09au;
            this.LJ = c09ax;
            this.LJFF = interfaceC1631620sYq3;
        }
    }

    @Override // X.C1DEF
    public final CoroutineContext getContext() {
        return this.LL;
    }

    public C1DE8(CoroutineContext coroutineContext) {
        this.LL = coroutineContext;
    }

    @Override // X.C1DEF
    public final void LIZ(InterfaceC2238208po interfaceC2238208po) {
        this.LLILLL = interfaceC2238208po;
    }

    @Override // X.C1DEF
    public final void LIZIZ(Object obj) {
        this.LLILZIL = obj;
    }

    @Override // X.AbstractC2236108pT
    public final void LJFF(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LLILZLL;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == C1DEA.LIZJ) {
                return;
            }
            C09AU c09au = C1DEA.LIZLLL;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c09au)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            List<C1DE8<R>.a> list = this.LLILLJJLI;
            if (list == null) {
                return;
            }
            Iterator<C1DE8<R>.a> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
            this.LLILZIL = C1DEA.LJ;
            this.LLILLJJLI = null;
            return;
        }
    }

    public final Object LJI(InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        a aVar = (a) LLILZLL.get(this);
        Object obj = this.LLILZIL;
        List<C1DE8<R>.a> list = this.LLILLJJLI;
        if (list != null) {
            for (a aVar2 : (ArrayList) list) {
                if (aVar2 != aVar) {
                    aVar2.LIZ();
                }
            }
            LLILZLL.set(this, C1DEA.LIZJ);
            this.LLILZIL = C1DEA.LJ;
            this.LLILLJJLI = null;
        }
        Object objInvoke = aVar.LIZJ.invoke(aVar.LIZ, aVar.LIZLLL, obj);
        Object obj2 = aVar.LJ;
        if (aVar.LIZLLL == C1DEA.LJFF) {
            return ((Function1) obj2).invoke(interfaceC1364105Vn);
        }
        return ((Function2) obj2).invoke(objInvoke, interfaceC1364105Vn);
    }

    public final Object LJII(InterfaceC1364105Vn<? super R> interfaceC1364105Vn) {
        if (LLILZLL.get(this) instanceof a) {
            return LJI(interfaceC1364105Vn);
        }
        return LJIIIIZZ(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.InterfaceC1364105Vn<? super R> r12) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DE8.LJIIIIZZ(X.05Vn):java.lang.Object");
    }

    public final C1DE8<R>.a LJIIIZ(Object obj) {
        List<C1DE8<R>.a> list = this.LLILLJJLI;
        C1DE8<R>.a aVar = null;
        if (list == null) {
            return null;
        }
        Iterator<C1DE8<R>.a> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C1DE8<R>.a next = it2.next();
            if (next.LIZ == obj) {
                aVar = next;
                break;
            }
        }
        C1DE8<R>.a aVar2 = aVar;
        if (aVar2 != null) {
            return aVar2;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Clause with object ");
        sbLIZ.append(obj);
        sbLIZ.append(" is not found");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        LJFF(th);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC2192561ArW
    public final <Q> void LIZJ(InterfaceC2192541ArU<? extends Q> interfaceC2192541ArU, Function2<? super Q, ? super InterfaceC1364105Vn<? super R>, ? extends Object> function2) {
        LJIIJJI(new a(interfaceC2192541ArU.LIZJ(), interfaceC2192541ArU.LIZIZ(), interfaceC2192541ArU.LIZLLL(), null, (C09AX) function2, interfaceC2192541ArU.LIZ()), false);
    }

    @Override // X.C1DEG
    public final void LIZLLL(C1DET<?> c1det, int i) {
        this.LLILLL = c1det;
        this.LLILZ = i;
    }

    @Override // X.C1DEF
    public final boolean LJ(Object obj, Object obj2) {
        if (LJIIL(obj, obj2) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIJ(C1DE9 c1de9, Function1 function1) {
        LJIIJJI(new a(c1de9.LIZ, c1de9.LIZIZ, c1de9.LIZLLL, C1DEA.LJFF, (C09AX) function1, c1de9.LIZJ), false);
    }

    public final void LJIIJJI(C1DE8<R>.a aVar, boolean z) {
        if (LLILZLL.get(this) instanceof a) {
            return;
        }
        if (!z) {
            Object obj = aVar.LIZ;
            ArrayList arrayList = (ArrayList) this.LLILLJJLI;
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((a) it2.next()).LIZ == obj) {
                        String str = "Cannot use select clauses on the same object: " + obj;
                        str.toString();
                        throw new IllegalStateException(str);
                    }
                }
            }
        }
        aVar.LIZIZ.invoke(aVar.LIZ, this, aVar.LIZLLL);
        if (this.LLILZIL == C1DEA.LJ) {
            if (!z) {
                ((ArrayList) this.LLILLJJLI).add(aVar);
            }
            aVar.LJI = this.LLILLL;
            aVar.LJII = this.LLILZ;
            this.LLILLL = null;
            this.LLILZ = -1;
            return;
        }
        LLILZLL.set(this, aVar);
    }

    public final int LJIIL(Object obj, Object obj2) {
        Function1<Throwable, Unit> function1Invoke;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LLILZLL;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof InterfaceC20236714Gf) {
                C1DE8<R>.a aVarLJIIIZ = LJIIIZ(obj);
                if (aVarLJIIIZ != null) {
                    InterfaceC1631620sYq<C1DEF<?>, Object, Object, Function1<Throwable, Unit>> interfaceC1631620sYq = aVarLJIIIZ.LJFF;
                    if (interfaceC1631620sYq != null) {
                        function1Invoke = interfaceC1631620sYq.invoke(this, aVarLJIIIZ.LIZLLL, obj2);
                    } else {
                        function1Invoke = null;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, aVarLJIIIZ)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) obj3;
                    this.LLILZIL = obj2;
                    C09AU c09auLJJIIJZLJL = interfaceC20236714Gf.LJJIIJZLJL(function1Invoke, Unit.LIZ);
                    if (c09auLJJIIJZLJL == null) {
                        this.LLILZIL = null;
                        return 2;
                    }
                    interfaceC20236714Gf.LJIIL(c09auLJJIIJZLJL);
                    return 0;
                }
                continue;
            } else {
                if (!Intrinsics.LJFF(obj3, C1DEA.LIZJ) && !(obj3 instanceof a)) {
                    if (Intrinsics.LJFF(obj3, C1DEA.LIZLLL)) {
                        return 2;
                    }
                    if (Intrinsics.LJFF(obj3, C1DEA.LIZIZ)) {
                        List listSingletonList = Collections.singletonList(obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listSingletonList)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj3) {
                                break;
                            }
                        }
                        return 1;
                    }
                    if (obj3 instanceof List) {
                        List listLJLILLLLZI = C13LP.LJLILLLLZI(obj, (Collection) obj3);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listLJLILLLLZI)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj3) {
                                break;
                            }
                        }
                        return 1;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unexpected state: ");
                    sbLIZ.append(obj3);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    strLIZIZ.toString();
                    throw new IllegalStateException(strLIZIZ);
                }
                return 3;
            }
        }
    }
}
