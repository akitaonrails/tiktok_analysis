package X;

import h0.n2;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS391S0200000_25;

/* JADX INFO: renamed from: X.0tlL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677810tlL {
    public static final float LJII(CoroutineContext coroutineContext) {
        InterfaceC1677690tl9 interfaceC1677690tl9 = (InterfaceC1677690tl9) coroutineContext.get(InterfaceC1677690tl9.LJLJJI);
        if (interfaceC1677690tl9 != null) {
            float fLJLJI = interfaceC1677690tl9.LJLJI();
            if (fLJLJI < 0.0f) {
                C1676960tjy.LIZIZ("negative scale factor");
            }
            return fLJLJI;
        }
        return 1.0f;
    }

    public static final <T, V extends AbstractC1677260tkS> void LJIIIIZZ(C1677830tlN<T, V> c1677830tlN, C1677580tky<T, V> c1677580tky) {
        ((C13FE) c1677580tky.LLILLJJLI).setValue(c1677830tlN.LIZIZ());
        V v = c1677580tky.LLILLL;
        V v2 = c1677830tlN.LJFF;
        int iLIZIZ = v.LIZIZ();
        for (int i = 0; i < iLIZIZ; i++) {
            v.LJ(v2.LIZ(i), i);
        }
        c1677580tky.LLILZIL = c1677830tlN.LJII;
        c1677580tky.LLILZ = c1677830tlN.LJI;
        c1677580tky.LLILZLL = ((Boolean) ((C13FE) c1677830tlN.LJIIIIZZ).getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013d  */
    /* JADX WARN: Type inference failed for: r15v0, types: [T, X.0tlN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, V extends X.AbstractC1677260tkS> java.lang.Object LIZIZ(X.C1677580tky<T, V> r19, X.InterfaceC1677860tlQ<T, V> r20, long r21, kotlin.jvm.functions.Function1<? super X.C1677830tlN<T, V>, kotlin.Unit> r23, X.InterfaceC1364105Vn<? super kotlin.Unit> r24) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1677810tlL.LIZIZ(X.0tky, X.0tlQ, long, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    public static final <T, V extends AbstractC1677260tkS> Object LIZLLL(C1677580tky<T, V> c1677580tky, final InterfaceC1677940tlY<T> interfaceC1677940tlY, boolean z, Function1<? super C1677830tlN<T, V>, Unit> function1, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        long j;
        final T value = c1677580tky.getValue();
        final V v = c1677580tky.LLILLL;
        final InterfaceC1677290tkV<T, V> interfaceC1677290tkV = c1677580tky.LL;
        InterfaceC1677860tlQ<T, V> interfaceC1677860tlQ = new InterfaceC1677860tlQ<T, V>(interfaceC1677940tlY, interfaceC1677290tkV, value, v) { // from class: X.0tlM
            public final InterfaceC1677890tlT<V> LIZ;
            public final InterfaceC1677290tkV<T, V> LIZIZ;
            public final T LIZJ;
            public final V LIZLLL;
            public final V LJ;
            public final V LJFF;
            public final T LJI;
            public final long LJII;

            @Override // X.InterfaceC1677860tlQ
            public final boolean LIZ() {
                return false;
            }

            @Override // X.InterfaceC1677860tlQ
            public final /* synthetic */ boolean LIZIZ(long j2) {
                return C1676970tjz.LIZ(this, j2);
            }

            @Override // X.InterfaceC1677860tlQ
            public final long LIZJ() {
                return this.LJII;
            }

            @Override // X.InterfaceC1677860tlQ
            public final InterfaceC1677290tkV<T, V> LIZLLL() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1677860tlQ
            public final T LJFF() {
                return this.LJI;
            }

            @Override // X.InterfaceC1677860tlQ
            public final T LJ(long j2) {
                if (!C1676970tjz.LIZ(this, j2)) {
                    return (T) this.LIZIZ.LIZIZ().invoke(this.LIZ.LIZIZ(j2, this.LIZLLL, this.LJ));
                }
                return this.LJI;
            }

            @Override // X.InterfaceC1677860tlQ
            public final V LJI(long j2) {
                if (!C1676970tjz.LIZ(this, j2)) {
                    return (V) this.LIZ.LIZJ(j2, this.LIZLLL, this.LJ);
                }
                return this.LJFF;
            }

            {
                C1677870tlR c1677870tlRLIZ = interfaceC1677940tlY.LIZ();
                this.LIZ = c1677870tlRLIZ;
                this.LIZIZ = interfaceC1677290tkV;
                this.LIZJ = value;
                V vInvoke = interfaceC1677290tkV.LIZ().invoke(value);
                this.LIZLLL = vInvoke;
                this.LJ = (V) C1677250tkR.LIZ(v);
                this.LJI = (T) interfaceC1677290tkV.LIZIZ().invoke(c1677870tlRLIZ.LJ(vInvoke, v));
                long jLIZLLL = c1677870tlRLIZ.LIZLLL(vInvoke, v);
                this.LJII = jLIZLLL;
                V v2 = (V) C1677250tkR.LIZ(c1677870tlRLIZ.LIZJ(jLIZLLL, vInvoke, v));
                this.LJFF = v2;
                int iLIZIZ = v2.LIZIZ();
                for (int i = 0; i < iLIZIZ; i++) {
                    V v3 = this.LJFF;
                    v3.LJ(C13LZ.LIZLLL(v3.LIZ(i), -this.LIZ.LIZ(), this.LIZ.LIZ()), i);
                }
            }
        };
        if (z) {
            j = c1677580tky.LLILZ;
        } else {
            j = Long.MIN_VALUE;
        }
        Object objLIZIZ = LIZIZ(c1677580tky, interfaceC1677860tlQ, j, function1, interfaceC1364105Vn);
        if (objLIZIZ == C099R.LJFF()) {
            return objLIZIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final Object LIZ(float f, float f2, float f3, InterfaceC1677030tk5<Float> interfaceC1677030tk5, Function2<? super Float, ? super Float, Unit> function2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        AbstractC1677260tkS abstractC1677260tkSLIZJ;
        C1677610tl1 c1677610tl1 = n2.LIZ;
        Object objLIZLLL = C2286608xc.LIZLLL(f);
        Float fLIZLLL = C2286608xc.LIZLLL(f2);
        Object objLIZLLL2 = C2286608xc.LIZLLL(f3);
        if (objLIZLLL2 == null || (abstractC1677260tkSLIZJ = (AbstractC1677260tkS) c1677610tl1.LIZ.invoke((T) objLIZLLL2)) == null) {
            abstractC1677260tkSLIZJ = ((AbstractC1677260tkS) c1677610tl1.LIZ.invoke((T) objLIZLLL)).LIZJ();
        }
        Object objLIZIZ = LIZIZ(new C1677580tky(c1677610tl1, objLIZLLL, abstractC1677260tkSLIZJ, 56), new C1677210tkN(interfaceC1677030tk5, c1677610tl1, objLIZLLL, fLIZLLL, abstractC1677260tkSLIZJ), Long.MIN_VALUE, new AwS391S0200000_25(function2, c1677610tl1, 195), interfaceC1364105Vn);
        if (objLIZIZ != C099R.LJFF()) {
            objLIZIZ = Unit.LIZ;
        }
        if (objLIZIZ == C099R.LJFF()) {
            return objLIZIZ;
        }
        return Unit.LIZ;
    }

    public static final <T, V extends AbstractC1677260tkS> Object LJ(C1677580tky<T, V> c1677580tky, T t, InterfaceC1677030tk5<T> interfaceC1677030tk5, boolean z, Function1<? super C1677830tlN<T, V>, Unit> function1, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        long j;
        C1677210tkN c1677210tkN = new C1677210tkN(interfaceC1677030tk5, c1677580tky.LL, c1677580tky.getValue(), t, c1677580tky.LLILLL);
        if (z) {
            j = c1677580tky.LLILZ;
        } else {
            j = Long.MIN_VALUE;
        }
        Object objLIZIZ = LIZIZ(c1677580tky, c1677210tkN, j, function1, interfaceC1364105Vn);
        if (objLIZIZ == C099R.LJFF()) {
            return objLIZIZ;
        }
        return Unit.LIZ;
    }

    public static final <T, V extends AbstractC1677260tkS> void LJI(C1677830tlN<T, V> c1677830tlN, long j, float f, InterfaceC1677860tlQ<T, V> interfaceC1677860tlQ, C1677580tky<T, V> c1677580tky, Function1<? super C1677830tlN<T, V>, Unit> function1) {
        long jLIZJ;
        if (f == 0.0f) {
            jLIZJ = interfaceC1677860tlQ.LIZJ();
        } else {
            jLIZJ = (long) ((j - c1677830tlN.LIZJ) / f);
        }
        c1677830tlN.LJI = j;
        ((C13FE) c1677830tlN.LJ).setValue(interfaceC1677860tlQ.LJ(jLIZJ));
        c1677830tlN.LJFF = (V) interfaceC1677860tlQ.LJI(jLIZJ);
        if (interfaceC1677860tlQ.LIZIZ(jLIZJ)) {
            c1677830tlN.LJII = c1677830tlN.LJI;
            ((C13FE) c1677830tlN.LJIIIIZZ).setValue(Boolean.FALSE);
        }
        LJIIIIZZ(c1677830tlN, c1677580tky);
        function1.invoke(c1677830tlN);
    }
}
