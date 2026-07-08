package X;

import X.AbstractC1677260tkS;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677480tko<T, V extends AbstractC1677260tkS> {
    public final InterfaceC1677290tkV<T, V> LIZ;
    public final T LIZIZ;
    public final C1677580tky<T, V> LIZJ;
    public final C05P0 LIZLLL;
    public final C05P0 LJ;
    public final C1384005bK LJFF;
    public final C1676890tjr<T> LJI;
    public final V LJII;
    public final V LJIIIIZZ;
    public final V LJIIIZ;
    public final V LJIIJ;

    public final T LIZLLL() {
        return this.LIZJ.getValue();
    }

    public final boolean LJ() {
        return ((Boolean) this.LIZLLL.getValue()).booleanValue();
    }

    public static final void LIZIZ(C1677480tko c1677480tko) {
        C1677580tky<T, V> c1677580tky = c1677480tko.LIZJ;
        c1677580tky.LLILLL.LIZLLL();
        c1677580tky.LLILZ = Long.MIN_VALUE;
        ((C13FE) c1677480tko.LIZLLL).setValue(Boolean.FALSE);
    }

    public final Object LJI(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZ = C1384005bK.LIZ(this.LJFF, new C1393405cq(this, null), interfaceC1364105Vn);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    public static final Object LIZ(C1677480tko c1677480tko, Object obj) {
        if (!Intrinsics.LJFF(c1677480tko.LJIIIZ, c1677480tko.LJII) || !Intrinsics.LJFF(c1677480tko.LJIIJ, c1677480tko.LJIIIIZZ)) {
            V vInvoke = c1677480tko.LIZ.LIZ().invoke(obj);
            int iLIZIZ = vInvoke.LIZIZ();
            boolean z = false;
            for (int i = 0; i < iLIZIZ; i++) {
                if (vInvoke.LIZ(i) < c1677480tko.LJIIIZ.LIZ(i) || vInvoke.LIZ(i) > c1677480tko.LJIIJ.LIZ(i)) {
                    vInvoke.LJ(C13LZ.LIZLLL(vInvoke.LIZ(i), c1677480tko.LJIIIZ.LIZ(i), c1677480tko.LJIIJ.LIZ(i)), i);
                    z = true;
                }
            }
            if (z) {
                return c1677480tko.LIZ.LIZIZ().invoke(vInvoke);
            }
        }
        return obj;
    }

    public final Object LJFF(T t, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZ = C1384005bK.LIZ(this.LJFF, new C1393505cr(this, t, null), interfaceC1364105Vn);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1677480tko(Object obj, InterfaceC1677290tkV interfaceC1677290tkV, Object obj2) {
        V v;
        V v2;
        this.LIZ = interfaceC1677290tkV;
        this.LIZIZ = obj2;
        C1677580tky<T, V> c1677580tky = new C1677580tky<>(interfaceC1677290tkV, obj, null, 60);
        this.LIZJ = c1677580tky;
        this.LIZLLL = C20028913Yh.LJI(Boolean.FALSE);
        this.LJ = C20028913Yh.LJI(obj);
        this.LJFF = new C1384005bK();
        this.LJI = new C1676890tjr<>(obj2, 3);
        V v3 = c1677580tky.LLILLL;
        boolean z = v3 instanceof C1677280tkU;
        if (z) {
            v = C1677470tkn.LJ;
        } else if (v3 instanceof C1677270tkT) {
            v = C1677470tkn.LJFF;
        } else if (v3 instanceof C1677300tkW) {
            v = C1677470tkn.LJI;
        } else {
            v = C1677470tkn.LJII;
        }
        this.LJII = v;
        if (z) {
            v2 = C1677470tkn.LIZ;
        } else if (v3 instanceof C1677270tkT) {
            v2 = C1677470tkn.LIZIZ;
        } else if (v3 instanceof C1677300tkW) {
            v2 = C1677470tkn.LIZJ;
        } else {
            v2 = C1677470tkn.LIZLLL;
        }
        this.LJIIIIZZ = v2;
        this.LJIIIZ = v;
        this.LJIIJ = v2;
    }

    public /* synthetic */ C1677480tko(Object obj, C1677610tl1 c1677610tl1, Object obj2, int i) {
        this(obj, c1677610tl1, (i & 4) != 0 ? null : obj2);
    }

    public static Object LIZJ(C1677480tko c1677480tko, Object obj, InterfaceC1677030tk5 interfaceC1677030tk5, Object obj2, Function1 function1, InterfaceC1364105Vn interfaceC1364105Vn, int i) {
        Object objInvoke = obj2;
        Function1 function12 = function1;
        InterfaceC1677030tk5 interfaceC1677030tk52 = interfaceC1677030tk5;
        if ((i & 2) != 0) {
            interfaceC1677030tk52 = c1677480tko.LJI;
        }
        if ((i & 4) != 0) {
            objInvoke = c1677480tko.LIZ.LIZIZ().invoke(c1677480tko.LIZJ.LLILLL);
        }
        if ((i & 8) != 0) {
            function12 = null;
        }
        Object objLIZLLL = c1677480tko.LIZLLL();
        InterfaceC1677290tkV<T, V> interfaceC1677290tkV = c1677480tko.LIZ;
        return C1384005bK.LIZ(c1677480tko.LJFF, new C1677570tkx(c1677480tko, objInvoke, new C1677210tkN(interfaceC1677030tk52, interfaceC1677290tkV, objLIZLLL, obj, (AbstractC1677260tkS) interfaceC1677290tkV.LIZ().invoke(objInvoke)), c1677480tko.LIZJ.LLILZ, function12, null), interfaceC1364105Vn);
    }
}
