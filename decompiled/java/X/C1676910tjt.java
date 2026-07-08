package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS124S0201000_25;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tjt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676910tjt<S> {
    public final AbstractC1676900tjs<S> LIZ;
    public final C1676910tjt<?> LIZIZ;
    public final String LIZJ;
    public final C05P0 LIZLLL;
    public final C05P0 LJ;
    public final InterfaceC1675750ti1 LJFF;
    public final InterfaceC1675750ti1 LJI;
    public final C05P0 LJII;
    public final C13ES<C1676910tjt<S>.d<?, ?>> LJIIIIZZ;
    public final C13ES<C1676910tjt<?>> LJIIIZ;
    public final C05P0 LJIIJ;
    public long LJIIJJI;

    /* JADX INFO: renamed from: X.0tjt$d */
    public final class d<T, V extends AbstractC1677260tkS> implements C05P1<T> {
        public final InterfaceC1677290tkV<T, V> LL;
        public final C05P0 LLILLJJLI;
        public final C05P0 LLILLL;
        public final C05P0 LLILZ;
        public final C05P0 LLILZIL;
        public final C05ZL LLILZLL;
        public boolean LLIZ;
        public final C05P0 LLIZLLLIL;
        public V LLJ;
        public final InterfaceC1675750ti1 LLJI;
        public boolean LLJIJIL;
        public final C1676890tjr LLJILJIL;

        public final C1677210tkN<T, V> LJIIL() {
            return (C1677210tkN) this.LLILZ.getValue();
        }

        public final float LJIILIIL() {
            return this.LLILZLL.LIZIZ();
        }

        @Override // X.C05P1
        public final T getValue() {
            return (T) this.LLIZLLLIL.getValue();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("current value: ");
            sbLIZ.append(getValue());
            sbLIZ.append(", target: ");
            sbLIZ.append(((C13FE) this.LLILLJJLI).getValue());
            sbLIZ.append(", spec: ");
            sbLIZ.append(((C13FE) this.LLILLL).getValue());
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public final void LJIILLIIL(long j) {
            if (LJIILIIL() == -1.0f) {
                this.LLJIJIL = true;
                if (Intrinsics.LJFF(LJIIL().LIZJ, LJIIL().LIZLLL)) {
                    ((C13FE) this.LLIZLLLIL).setValue(LJIIL().LIZJ);
                } else {
                    ((C13FE) this.LLIZLLLIL).setValue(LJIIL().LJ(j));
                    this.LLJ = (V) LJIIL().LJI(j);
                }
            }
        }

        public final void LJIIZILJ(T t, boolean z) {
            final InterfaceC1675680thu interfaceC1675680thu;
            if (Intrinsics.LJFF(null, ((C13FE) this.LLILLJJLI).getValue())) {
                ((C13FE) this.LLILZ).setValue(new C1677210tkN(this.LLJILJIL, this.LL, t, t, this.LLJ.LIZJ()));
                this.LLIZ = true;
                ((C13FK) this.LLJI).LJIIIIZZ(LJIIL().LIZJ());
                return;
            }
            if (!z || this.LLJIJIL || (((C13FE) this.LLILLL).getValue() instanceof C1676890tjr)) {
                interfaceC1675680thu = (InterfaceC1675680thu) ((C13FE) this.LLILLL).getValue();
            } else {
                interfaceC1675680thu = this.LLJILJIL;
            }
            long jMax = 0;
            InterfaceC1677030tk5<T> interfaceC1677030tk5 = interfaceC1675680thu;
            if (C1676910tjt.this.LJ() > 0) {
                final long jLJ = C1676910tjt.this.LJ();
                interfaceC1677030tk5 = new InterfaceC1677030tk5<T>(interfaceC1675680thu, jLJ) { // from class: X.0tk4
                    public final InterfaceC1677030tk5<T> LIZ;
                    public final long LIZIZ;

                    public final int hashCode() {
                        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
                    }

                    @Override // X.InterfaceC1677030tk5
                    public final <V extends AbstractC1677260tkS> InterfaceC1677220tkO<V> LIZ(InterfaceC1677290tkV<T, V> interfaceC1677290tkV) {
                        final InterfaceC1677220tkO<V> interfaceC1677220tkOLIZ = this.LIZ.LIZ(interfaceC1677290tkV);
                        final long j = this.LIZIZ;
                        return (InterfaceC1677220tkO<V>) new InterfaceC1677220tkO<V>(interfaceC1677220tkOLIZ, j) { // from class: X.0tkM
                            public final InterfaceC1677220tkO<V> LIZ;
                            public final long LIZIZ;

                            @Override // X.InterfaceC1677220tkO
                            public final /* synthetic */ AbstractC1677260tkS LJ(AbstractC1677260tkS abstractC1677260tkS, AbstractC1677260tkS abstractC1677260tkS2, AbstractC1677260tkS abstractC1677260tkS3) {
                                return C1677230tkP.LIZ(this, abstractC1677260tkS, abstractC1677260tkS2, abstractC1677260tkS3);
                            }

                            @Override // X.InterfaceC1677220tkO
                            public final boolean LIZ() {
                                return this.LIZ.LIZ();
                            }

                            public final int hashCode() {
                                return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
                            }

                            public final boolean equals(Object obj) {
                                if (!(obj instanceof C1677200tkM)) {
                                    return false;
                                }
                                C1677200tkM c1677200tkM = (C1677200tkM) obj;
                                if (c1677200tkM.LIZIZ != this.LIZIZ || !Intrinsics.LJFF(c1677200tkM.LIZ, this.LIZ)) {
                                    return false;
                                }
                                return true;
                            }

                            {
                                this.LIZ = interfaceC1677220tkOLIZ;
                                this.LIZIZ = j;
                            }

                            @Override // X.InterfaceC1677220tkO
                            public final long LIZLLL(V v, V v2, V v3) {
                                return this.LIZ.LIZLLL(v, v2, v3) + this.LIZIZ;
                            }

                            @Override // X.InterfaceC1677220tkO
                            public final V LIZIZ(long j2, V v, V v2, V v3) {
                                long j3 = this.LIZIZ;
                                if (j2 < j3) {
                                    return v3;
                                }
                                return (V) this.LIZ.LIZIZ(j2 - j3, v, v2, v3);
                            }

                            @Override // X.InterfaceC1677220tkO
                            public final V LIZJ(long j2, V v, V v2, V v3) {
                                long j3 = this.LIZIZ;
                                if (j2 < j3) {
                                    return v;
                                }
                                return (V) this.LIZ.LIZJ(j2 - j3, v, v2, v3);
                            }
                        };
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof C1677020tk4)) {
                            return false;
                        }
                        C1677020tk4 c1677020tk4 = (C1677020tk4) obj;
                        if (c1677020tk4.LIZIZ != this.LIZIZ || !Intrinsics.LJFF(c1677020tk4.LIZ, this.LIZ)) {
                            return false;
                        }
                        return true;
                    }

                    {
                        this.LIZ = interfaceC1675680thu;
                        this.LIZIZ = jLJ;
                    }
                };
            }
            ((C13FE) this.LLILZ).setValue(new C1677210tkN(interfaceC1677030tk5, this.LL, t, ((C13FE) this.LLILLJJLI).getValue(), this.LLJ));
            ((C13FK) this.LLJI).LJIIIIZZ(LJIIL().LIZJ());
            this.LLIZ = false;
            C1676910tjt<S> c1676910tjt = C1676910tjt.this;
            ((C13FE) c1676910tjt.LJII).setValue(Boolean.TRUE);
            if (c1676910tjt.LJII()) {
                C13ES<C1676910tjt<S>.d<?, ?>> c13es = c1676910tjt.LJIIIIZZ;
                int size = c13es.size();
                for (int i = 0; i < size; i++) {
                    d dVar = (d) ListProtector.get(c13es, i);
                    jMax = Math.max(jMax, ((C13FK) dVar.LLJI).LIZ());
                    dVar.LJIILLIIL(c1676910tjt.LJIIJJI);
                }
                ((C13FE) c1676910tjt.LJII).setValue(Boolean.FALSE);
            }
        }

        public final void LJIJI(T t, InterfaceC1675680thu<T> interfaceC1675680thu) {
            T value;
            boolean z;
            if (this.LLIZ && Intrinsics.LJFF(t, null)) {
                return;
            }
            if (Intrinsics.LJFF(((C13FE) this.LLILLJJLI).getValue(), t) && LJIILIIL() == -1.0f) {
                return;
            }
            ((C13FE) this.LLILLJJLI).setValue(t);
            ((C13FE) this.LLILLL).setValue(interfaceC1675680thu);
            if (LJIILIIL() == -3.0f) {
                value = t;
            } else {
                value = getValue();
            }
            LJIIZILJ(value, !((Boolean) ((C13FE) this.LLILZIL).getValue()).booleanValue());
            if (LJIILIIL() == -3.0f) {
                z = true;
            } else {
                z = false;
            }
            ((C13FE) this.LLILZIL).setValue(Boolean.valueOf(z));
            if (LJIILIIL() >= 0.0f) {
                ((C13FE) this.LLIZLLLIL).setValue(LJIIL().LJ((long) (LJIIL().LIZJ() * LJIILIIL())));
            } else if (LJIILIIL() == -3.0f) {
                ((C13FE) this.LLIZLLLIL).setValue(t);
            }
            this.LLIZ = false;
            ((C13FI) this.LLILZLL).LJIILJJIL(-1.0f);
        }

        public final void LJIJ(T t, T t2, InterfaceC1675680thu<T> interfaceC1675680thu) {
            ((C13FE) this.LLILLJJLI).setValue(t2);
            ((C13FE) this.LLILLL).setValue(interfaceC1675680thu);
            if (Intrinsics.LJFF(LJIIL().LIZLLL, t) && Intrinsics.LJFF(LJIIL().LIZJ, t2)) {
                return;
            }
            LJIIZILJ(t, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public d(Object obj, AbstractC1677260tkS abstractC1677260tkS, InterfaceC1677290tkV interfaceC1677290tkV) {
            this.LL = interfaceC1677290tkV;
            C05P0 c05p0LJI = C20028913Yh.LJI(obj);
            this.LLILLJJLI = c05p0LJI;
            T tInvoke = null;
            C05P0 c05p0LJI2 = C20028913Yh.LJI(C1671550tbF.LIZJ(0.0f, 0.0f, null, 7));
            this.LLILLL = c05p0LJI2;
            this.LLILZ = C20028913Yh.LJI(new C1677210tkN((InterfaceC1677030tk5) ((C13FE) c05p0LJI2).getValue(), interfaceC1677290tkV, obj, ((C13FE) c05p0LJI).getValue(), abstractC1677260tkS));
            this.LLILZIL = C20028913Yh.LJI(Boolean.TRUE);
            this.LLILZLL = C1691250u71.LIZ(-1.0f);
            this.LLIZLLLIL = C20028913Yh.LJI(obj);
            this.LLJ = abstractC1677260tkS;
            this.LLJI = C1696980uGG.LIZ(LJIIL().LIZJ());
            Float f = C1675670tht.LIZIZ.get(interfaceC1677290tkV);
            if (f != null) {
                float fFloatValue = f.floatValue();
                V vInvoke = interfaceC1677290tkV.LIZ().invoke(obj);
                int iLIZIZ = vInvoke.LIZIZ();
                for (int i = 0; i < iLIZIZ; i++) {
                    vInvoke.LJ(fFloatValue, i);
                }
                tInvoke = this.LL.LIZIZ().invoke(vInvoke);
            }
            this.LLJILJIL = C1671550tbF.LIZJ(0.0f, 0.0f, tInvoke, 3);
        }
    }

    public C1676910tjt() {
        throw null;
    }

    public final long LIZIZ() {
        C13ES<C1676910tjt<S>.d<?, ?>> c13es = this.LJIIIIZZ;
        int size = c13es.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((C13FK) ((d) ListProtector.get(c13es, i)).LLJI).LIZ());
        }
        C13ES<C1676910tjt<?>> c13es2 = this.LJIIIZ;
        int size2 = c13es2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((C1676910tjt) ListProtector.get(c13es2, i2)).LIZIZ());
        }
        return jMax;
    }

    public final S LIZJ() {
        return this.LIZ.LIZ();
    }

    public final boolean LIZLLL() {
        C13ES<C1676910tjt<S>.d<?, ?>> c13es = this.LJIIIIZZ;
        int size = c13es.size();
        for (int i = 0; i < size; i++) {
            ListProtector.get(c13es, i).getClass();
        }
        C13ES<C1676910tjt<?>> c13es2 = this.LJIIIZ;
        int size2 = c13es2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((C1676910tjt) ListProtector.get(c13es2, i2)).LIZLLL()) {
                return true;
            }
        }
        return false;
    }

    public final long LJ() {
        C1676910tjt<?> c1676910tjt = this.LIZIZ;
        return c1676910tjt != null ? c1676910tjt.LJ() : this.LJFF.LIZ();
    }

    public final InterfaceC1676620tjQ<S> LJFF() {
        return (InterfaceC1676620tjQ) this.LJ.getValue();
    }

    public final S LJI() {
        return (S) this.LIZLLL.getValue();
    }

    public final boolean LJII() {
        return ((Boolean) this.LJIIJ.getValue()).booleanValue();
    }

    public final void LJIIIZ() {
        ((C13FK) this.LJI).LJIIIIZZ(Long.MIN_VALUE);
        AbstractC1676900tjs<S> abstractC1676900tjs = this.LIZ;
        if (abstractC1676900tjs instanceof C1676880tjq) {
            abstractC1676900tjs.LIZJ(LJI());
        }
        if (this.LIZIZ == null) {
            ((C13FK) this.LJFF).LJIIIIZZ(0L);
        }
        ((C13FE) this.LIZ.LIZ).setValue(Boolean.FALSE);
        C13ES<C1676910tjt<?>> c13es = this.LJIIIZ;
        int size = c13es.size();
        for (int i = 0; i < size; i++) {
            ((C1676910tjt) ListProtector.get(c13es, i)).LJIIIZ();
        }
    }

    public final String toString() {
        C13ES<C1676910tjt<S>.d<?, ?>> c13es = this.LJIIIIZZ;
        int size = c13es.size();
        String strLIZIZ = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(c13es, i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(obj);
            sbLIZ.append(", ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        return strLIZIZ;
    }

    public final void LJIIJJI(S s) {
        if (!Intrinsics.LJFF(LJI(), s)) {
            ((C13FE) this.LJ).setValue(new C1676610tjP(LJI(), s));
            if (!Intrinsics.LJFF(LIZJ(), LJI())) {
                this.LIZ.LIZJ(LJI());
            }
            ((C13FE) this.LIZLLL).setValue(s);
            if (((C13FK) this.LJI).LIZ() == Long.MIN_VALUE) {
                ((C13FE) this.LJII).setValue(Boolean.TRUE);
            }
            C13ES<C1676910tjt<S>.d<?, ?>> c13es = this.LJIIIIZZ;
            int size = c13es.size();
            for (int i = 0; i < size; i++) {
                ((C13FI) ((d) ListProtector.get(c13es, i)).LLILZLL).LJIILJJIL(-2.0f);
            }
        }
    }

    /* JADX INFO: renamed from: X.0tjt$a */
    public final class a<T, V extends AbstractC1677260tkS> {
        public final InterfaceC1677290tkV<T, V> LIZ;
        public final C05P0 LIZIZ = C20028913Yh.LJI(null);

        public final C1676850tjn LIZ(Function1 function1, Function1 function12) {
            C1676850tjn c1676850tjn = (C1676850tjn) ((C13FE) this.LIZIZ).getValue();
            if (c1676850tjn == null) {
                C1676910tjt<S> c1676910tjt = C1676910tjt.this;
                Object objInvoke = function12.invoke(c1676910tjt.LIZJ());
                InterfaceC1677290tkV<T, V> interfaceC1677290tkV = this.LIZ;
                AbstractC1677260tkS abstractC1677260tkS = (AbstractC1677260tkS) interfaceC1677290tkV.LIZ().invoke(function12.invoke(C1676910tjt.this.LIZJ()));
                abstractC1677260tkS.LIZLLL();
                C1676910tjt<S>.d<?, ?> dVar = c1676910tjt.new d<>(objInvoke, abstractC1677260tkS, this.LIZ);
                c1676850tjn = new C1676850tjn(this, dVar, function1, function12);
                C1676910tjt<S> c1676910tjt2 = C1676910tjt.this;
                ((C13FE) this.LIZIZ).setValue(c1676850tjn);
                c1676910tjt2.LJIIIIZZ.add(dVar);
            }
            C1676910tjt<S> c1676910tjt3 = C1676910tjt.this;
            c1676850tjn.LLILLL = function12;
            c1676850tjn.LLILLJJLI = function1;
            c1676850tjn.LJIIL(c1676910tjt3.LJFF());
            return c1676850tjn;
        }

        public a(C1677610tl1 c1677610tl1, String str) {
            this.LIZ = c1677610tl1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [V extends X.0tkS, X.0tkS] */
    public final void LJIIIIZZ(long j, boolean z) {
        long jLIZJ;
        if (((C13FK) this.LJI).LIZ() == Long.MIN_VALUE) {
            ((C13FK) this.LJI).LJIIIIZZ(j);
            ((C13FE) this.LIZ.LIZ).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((C13FE) this.LIZ.LIZ).getValue()).booleanValue()) {
            ((C13FE) this.LIZ.LIZ).setValue(Boolean.TRUE);
        }
        ((C13FE) this.LJII).setValue(Boolean.FALSE);
        C13ES<C1676910tjt<S>.d<?, ?>> c13es = this.LJIIIIZZ;
        int size = c13es.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            d dVar = (d) ListProtector.get(c13es, i);
            if (!((Boolean) ((C13FE) dVar.LLILZIL).getValue()).booleanValue()) {
                if (z) {
                    jLIZJ = dVar.LJIIL().LIZJ();
                } else {
                    jLIZJ = j;
                }
                ((C13FE) dVar.LLIZLLLIL).setValue(dVar.LJIIL().LJ(jLIZJ));
                dVar.LLJ = dVar.LJIIL().LJI(jLIZJ);
                C1677210tkN c1677210tkNLJIIL = dVar.LJIIL();
                c1677210tkNLJIIL.getClass();
                if (C1676970tjz.LIZ(c1677210tkNLJIIL, jLIZJ)) {
                    ((C13FE) dVar.LLILZIL).setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) ((C13FE) dVar.LLILZIL).getValue()).booleanValue()) {
                z2 = false;
            }
        }
        C13ES<C1676910tjt<?>> c13es2 = this.LJIIIZ;
        int size2 = c13es2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C1676910tjt c1676910tjt = (C1676910tjt) ListProtector.get(c13es2, i2);
            if (!Intrinsics.LJFF(c1676910tjt.LJI(), c1676910tjt.LIZJ())) {
                c1676910tjt.LJIIIIZZ(j, z);
            }
            if (!Intrinsics.LJFF(c1676910tjt.LJI(), c1676910tjt.LIZJ())) {
                z2 = false;
            }
        }
        if (z2) {
            LJIIIZ();
        }
    }

    public C1676910tjt(AbstractC1676900tjs<S> abstractC1676900tjs, C1676910tjt<?> c1676910tjt, String str) {
        this.LIZ = abstractC1676900tjs;
        this.LIZIZ = c1676910tjt;
        this.LIZJ = str;
        this.LIZLLL = C20028913Yh.LJI(LIZJ());
        this.LJ = C20028913Yh.LJI(new C1676610tjP(LIZJ(), LIZJ()));
        this.LJFF = C1696980uGG.LIZ(0L);
        this.LJI = C1696980uGG.LIZ(Long.MIN_VALUE);
        Boolean bool = Boolean.FALSE;
        this.LJII = C20028913Yh.LJI(bool);
        this.LJIIIIZZ = new C13ES<>();
        this.LJIIIZ = new C13ES<>();
        this.LJIIJ = C20028913Yh.LJI(bool);
        C20028913Yh.LJ(new AwS569S0100000_25(this, (C1676910tjt<EnumC1676720tja>) 793));
        abstractC1676900tjs.LIZLLL(this);
    }

    public final void LIZ(S s, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        int i3;
        boolean zLJII;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1493585151);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(s);
            } else {
                zLJII = c13zcLJIIJ.LJII(s);
            }
            if (zLJII) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        boolean z2 = true;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (c13zcLJIIJ.LJIJJLI(i2 & 1, z)) {
            if (!LJII()) {
                c13zcLJIIJ.LJJIIJZLJL(1822801203);
                LJIIJJI(s);
                if (Intrinsics.LJFF(s, LIZJ()) && ((C13FK) this.LJI).LIZ() == Long.MIN_VALUE && !((Boolean) ((C13FE) this.LJII).getValue()).booleanValue()) {
                    c13zcLJIIJ.LJJIIJZLJL(1824275067);
                    c13zcLJIIJ.LJJJJL(false);
                } else {
                    c13zcLJIIJ.LJJIIJZLJL(1823032494);
                    Object objLJJ = c13zcLJIIJ.LJJ();
                    InterfaceC1680500tpg.LIZ.getClass();
                    C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                    if (objLJJ == c1680520tpi) {
                        objLJJ = C1680540tpk.LJIIIIZZ(C23271099x.INSTANCE, c13zcLJIIJ);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ);
                    }
                    InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) objLJJ;
                    boolean zLJII2 = c13zcLJIIJ.LJII(interfaceC497601wk);
                    if ((i2 & 112) != 32) {
                        z2 = false;
                    }
                    boolean z3 = zLJII2 | z2;
                    Object objLJJ2 = c13zcLJIIJ.LJJ();
                    if (z3 || objLJJ2 == c1680520tpi) {
                        objLJJ2 = new AwS391S0200000_25(interfaceC497601wk, (InterfaceC497601wk) this, 197);
                        c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                    }
                    C1680540tpk.LIZ(interfaceC497601wk, this, (Function1) objLJJ2, c13zcLJIIJ);
                    c13zcLJIIJ.LJJJJL(false);
                }
                c13zcLJIIJ.LJJJJL(false);
            } else {
                c13zcLJIIJ.LJJIIJZLJL(1824284987);
                c13zcLJIIJ.LJJJJL(false);
            }
        } else {
            c13zcLJIIJ.LIZJ();
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS124S0201000_25(this, (C1676910tjt<int>) s, i, 68);
        }
    }

    public final void LJIIJ(long j, Object obj, Object obj2) {
        ((C13FK) this.LJI).LJIIIIZZ(Long.MIN_VALUE);
        ((C13FE) this.LIZ.LIZ).setValue(Boolean.FALSE);
        if (!LJII() || !Intrinsics.LJFF(LIZJ(), obj) || !Intrinsics.LJFF(LJI(), obj2)) {
            if (!Intrinsics.LJFF(LIZJ(), obj)) {
                AbstractC1676900tjs<S> abstractC1676900tjs = this.LIZ;
                if (abstractC1676900tjs instanceof C1676880tjq) {
                    abstractC1676900tjs.LIZJ(obj);
                }
            }
            ((C13FE) this.LIZLLL).setValue(obj2);
            ((C13FE) this.LJIIJ).setValue(Boolean.TRUE);
            ((C13FE) this.LJ).setValue(new C1676610tjP(obj, obj2));
        }
        C13ES<C1676910tjt<?>> c13es = this.LJIIIZ;
        int size = c13es.size();
        for (int i = 0; i < size; i++) {
            C1676910tjt c1676910tjt = (C1676910tjt) ListProtector.get(c13es, i);
            if (c1676910tjt.LJII()) {
                c1676910tjt.LJIIJ(j, c1676910tjt.LIZJ(), c1676910tjt.LJI());
            }
        }
        C13ES<C1676910tjt<S>.d<?, ?>> c13es2 = this.LJIIIIZZ;
        int size2 = c13es2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((d) ListProtector.get(c13es2, i2)).LJIILLIIL(j);
        }
        this.LJIIJJI = j;
    }
}
