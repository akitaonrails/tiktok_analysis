package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0u62, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1690640u62 implements InterfaceC1420105h9 {
    public boolean LIZ;
    public C1690660u64 LIZIZ;
    public final C05P0 LIZJ;
    public final C1690330u5X LIZLLL;
    public int LJ;
    public int LJFF;
    public long LJI;
    public long LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public final C594850NUt LJIIJ;
    public final boolean LJIIJJI;
    public int LJIIL;
    public InterfaceC1564810qp5 LJIILIIL;
    public boolean LJIILJJIL;
    public final C05P0<C1690660u64> LJIILL;
    public InterfaceC1690500u5o LJIILLIIL;
    public final C612270Nzt LJIIZILJ;
    public final InterfaceC1676320tiw LJIJ;
    public final InterfaceC1676320tiw LJIJI;
    public final C13YZ LJIJJ;
    public final C13YZ LJIJJLI;
    public final C20044113bj LJIL;
    public final C1690570u5v LJJ;
    public final C1690600u5y LJJI;
    public final C05P0 LJJIFFI;
    public final C1690280u5S LJJII;
    public long LJJIII;
    public final C1682920tta LJJIIJ;
    public final C05P0<Unit> LJJIIJZLJL;
    public final C05P0<Unit> LJJIIZ;
    public final C05P0 LJJIIZI;
    public final C05P0 LJJIJ;
    public final C05P0<Boolean> LJJIJIIJI;
    public final C05P0<Boolean> LJJIJIIJIL;

    @Override // X.InterfaceC1420105h9
    public final Object LIZ(EnumC1384205bM enumC1384205bM, Function2<? super InterfaceC1392705cj, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return LJIJJ(this, enumC1384205bM, function2, interfaceC1364105Vn);
    }

    public abstract int LJIILIIL();

    @Override // X.InterfaceC1420105h9
    public final boolean LIZIZ() {
        return this.LJIIJ.LIZIZ();
    }

    @Override // X.InterfaceC1420105h9
    public final boolean LIZJ() {
        return ((Boolean) this.LJJIIZI.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1420105h9
    public final boolean LIZLLL() {
        return ((Boolean) this.LJJIJ.getValue()).booleanValue();
    }

    public final int LJIIIZ() {
        return ((C13FG) this.LIZLLL.LIZIZ).LIZLLL();
    }

    public final float LJIIJ() {
        return ((C13FI) this.LIZLLL.LIZJ).LIZIZ();
    }

    public final boolean LJIIJJI() {
        return ((Boolean) ((C13FE) this.LJJIJIIJI).getValue()).booleanValue();
    }

    public final InterfaceC1690800u6I LJIIL() {
        return (InterfaceC1690800u6I) ((C13FE) this.LJIILL).getValue();
    }

    public final int LJIILJJIL() {
        return ((C1690660u64) ((C13FE) this.LJIILL).getValue()).LIZIZ;
    }

    public final int LJIILLIIL() {
        return ((Number) this.LJIJJ.getValue()).intValue();
    }

    public final long LJIIZILJ() {
        return ((C1378605aS) this.LIZJ.getValue()).LIZ;
    }

    public final int LJIILL() {
        return LJIILJJIL() + ((C1690660u64) ((C13FE) this.LJIILL).getValue()).LIZJ;
    }

    public final boolean LJIJ() {
        return ((int) Float.intBitsToFloat((int) (LJIIZILJ() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (LJIIZILJ() & 4294967295L))) == 0;
    }

    @Override // X.InterfaceC1420105h9
    public final float LJ(float f) {
        return this.LJIIJ.LJ(f);
    }

    public final int LJIIIIZZ(int i) {
        if (LJIILIIL() <= 0) {
            return 0;
        }
        return C13LZ.LJ(i, 0, LJIILIIL() - 1);
    }

    public final void LJIJI(float f, InterfaceC1690800u6I interfaceC1690800u6I) {
        boolean z;
        int index;
        InterfaceC1564810qp5 interfaceC1564810qp5;
        InterfaceC1564810qp5 interfaceC1564810qp52;
        InterfaceC1564810qp5 interfaceC1564810qp53;
        if (this.LJIIJJI && (!interfaceC1690800u6I.LJIIIZ().isEmpty())) {
            if (f > 0.0f) {
                z = true;
                index = ((InterfaceC1690900u6S) C13LP.LJJLIIIJJI(interfaceC1690800u6I.LJIIIZ())).getIndex() + interfaceC1690800u6I.LJIIIIZZ() + 1;
            } else {
                z = false;
                index = (((InterfaceC1690900u6S) C13LP.LJJJJZI(interfaceC1690800u6I.LJIIIZ())).getIndex() - interfaceC1690800u6I.LJIIIIZZ()) - 1;
            }
            if (index >= 0 && index < LJIILIIL()) {
                if (index != this.LJIIL) {
                    if (this.LJIILJJIL != z && (interfaceC1564810qp53 = this.LJIILIIL) != null) {
                        interfaceC1564810qp53.cancel();
                    }
                    this.LJIILJJIL = z;
                    this.LJIIL = index;
                    this.LJIILIIL = this.LJIL.LIZ(index, this.LJJIII);
                }
                if (z) {
                    if ((((InterfaceC1690900u6S) C13LP.LJJLIIIJJI(interfaceC1690800u6I.LJIIIZ())).getOffset() + (interfaceC1690800u6I.LJFF() + interfaceC1690800u6I.LJI())) - interfaceC1690800u6I.LIZIZ() < f && (interfaceC1564810qp52 = this.LJIILIIL) != null) {
                        interfaceC1564810qp52.LIZ();
                        return;
                    }
                    return;
                }
                if (interfaceC1690800u6I.LIZLLL() - ((InterfaceC1690900u6S) C13LP.LJJJJZI(interfaceC1690800u6I.LJIIIZ())).getOffset() >= (-f) || (interfaceC1564810qp5 = this.LJIILIIL) == null) {
                    return;
                }
                interfaceC1564810qp5.LIZ();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.0u5S] */
    public AbstractC1690640u62(int i, float f, InterfaceC20044013bi interfaceC20044013bi) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("currentPageOffsetFraction ");
            sbLIZ.append(f);
            sbLIZ.append(" is not within the range -0.5 to 0.5");
            C1691080u6k.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZJ = C20028913Yh.LJI(new C1378605aS(0L));
        this.LIZLLL = new C1690330u5X(i, f, this);
        this.LJ = i;
        this.LJI = Long.MAX_VALUE;
        this.LJIIJ = new C594850NUt(new AwS604S0100000_25(this, 797));
        this.LJIIJJI = true;
        this.LJIIL = -1;
        this.LJIILL = C20028913Yh.LJFF(C1690670u65.LIZIZ, C13FT.LIZ);
        this.LJIILLIIL = C1690670u65.LIZJ;
        this.LJIIZILJ = new C612270Nzt();
        this.LJIJ = C1696870uG5.LIZ(-1);
        this.LJIJI = C1696870uG5.LIZ(i);
        C595410NWx c595410NWx = C595410NWx.LIZ;
        this.LJIJJ = C20028913Yh.LIZLLL(c595410NWx, new AwS569S0100000_25(this, 1067));
        this.LJIJJLI = C20028913Yh.LIZLLL(c595410NWx, new AwS569S0100000_25(this, 1068));
        this.LJIL = new C20044113bj(interfaceC20044013bi, new AwS604S0100000_25(this, 796));
        this.LJJ = new C1690570u5v();
        this.LJJI = new C1690600u5y();
        this.LJJIFFI = C20028913Yh.LJI(null);
        this.LJJII = new InterfaceC1690520u5q() { // from class: X.0u5S
            @Override // X.InterfaceC1685750ty9
            public final /* synthetic */ InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9) {
                return C1685810tyF.LIZ(this, interfaceC1685750ty9);
            }

            @Override // X.InterfaceC1685750ty9
            public final /* synthetic */ boolean LJIILLIIL(Function1 function1) {
                return C1672400tcc.LIZ(this, function1);
            }

            @Override // X.InterfaceC1690520u5q
            public final void LJIIJ(C20053713dH c20053713dH) {
                ((C13FE) this.LIZIZ.LJJIFFI).setValue(c20053713dH);
            }

            @Override // X.InterfaceC1685750ty9
            public final Object LJIILJJIL(Object obj, Function2 function2) {
                return function2.invoke(obj, this);
            }
        };
        this.LJJIII = C1682390tsj.LIZ(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        this.LJJIIJ = new C1682920tta();
        this.LJJIIJZLJL = C1690450u5j.LIZ();
        this.LJJIIZ = C1690450u5j.LIZ();
        Boolean bool = Boolean.FALSE;
        this.LJJIIZI = C20028913Yh.LJI(bool);
        this.LJJIJ = C20028913Yh.LJI(bool);
        this.LJJIJIIJI = C20028913Yh.LJI(bool);
        this.LJJIJIIJIL = C20028913Yh.LJI(bool);
    }

    public static Object LJIJJLI(AbstractC1690640u62 abstractC1690640u62, int i, InterfaceC1364105Vn interfaceC1364105Vn) {
        abstractC1690640u62.getClass();
        Object objLIZ = abstractC1690640u62.LIZ(EnumC1384205bM.Default, new C1690700u68(abstractC1690640u62, 0.0f, i, null), interfaceC1364105Vn);
        if (objLIZ != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0144 A[Catch: all -> 0x0182, TryCatch #0 {all -> 0x0182, blocks: (B:55:0x00ea, B:57:0x00fd, B:59:0x0101, B:61:0x010f, B:63:0x0126, B:67:0x0144, B:64:0x012c), top: B:80:0x00ea }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.C1690660u64 r12, boolean r13, boolean r14) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1690640u62.LJII(X.0u64, boolean, boolean):void");
    }

    public final void LJIL(float f, int i, boolean z) {
        C1690330u5X c1690330u5X = this.LIZLLL;
        ((C13FG) c1690330u5X.LIZIZ).LJIIJ(i);
        c1690330u5X.LJFF.LJIIL(i);
        ((C13FI) c1690330u5X.LIZJ).LJIILJJIL(f);
        c1690330u5X.LJ = null;
        if (z) {
            InterfaceC1690550u5t interfaceC1690550u5t = (InterfaceC1690550u5t) ((C13FE) this.LJJIFFI).getValue();
            if (interfaceC1690550u5t != null) {
                interfaceC1690550u5t.LJIIL();
                return;
            }
            return;
        }
        this.LJJIIZ.setValue(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJIJJ(X.AbstractC1690640u62 r6, X.EnumC1384205bM r7, kotlin.jvm.functions.Function2<? super X.InterfaceC1392705cj, ? super X.InterfaceC1364105Vn<? super kotlin.Unit>, ? extends java.lang.Object> r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof X.C1690780u6G
            if (r0 == 0) goto L7a
            r4 = r9
            X.0u6G r4 = (X.C1690780u6G) r4
            int r2 = r4.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7a
            int r2 = r2 - r1
            r4.LLILZLL = r2
        L12:
            java.lang.Object r5 = r4.LLILZ
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r4.LLILZLL
            r2 = 2
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 == r0) goto L4e
            if (r1 != r2) goto L80
            X.0u62 r6 = r4.LL
            X.C155000ia.LIZIZ(r5)
        L27:
            X.0tiw r1 = r6.LJIJ
            X.13FG r1 = (X.C13FG) r1
            r0 = -1
            r1.LJIIJ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L32:
            X.C155000ia.LIZIZ(r5)
            r4.LL = r6
            r4.LLILLJJLI = r7
            r4.LLILLL = r8
            r4.LLILZLL = r0
            X.0u5y r0 = r6.LJJI
            java.lang.Object r1 = r0.LJIJI(r4)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L4b
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L4b:
            if (r1 != r3) goto L57
            return r3
        L4e:
            kotlin.jvm.functions.Function2 r8 = r4.LLILLL
            X.05bM r7 = r4.LLILLJJLI
            X.0u62 r6 = r4.LL
            X.C155000ia.LIZIZ(r5)
        L57:
            boolean r0 = r6.LIZIZ()
            if (r0 != 0) goto L68
            int r1 = r6.LJIIIZ()
            X.0tiw r0 = r6.LJIJI
            X.13FG r0 = (X.C13FG) r0
            r0.LJIIJ(r1)
        L68:
            X.0NUt r1 = r6.LJIIJ
            r4.LL = r6
            r0 = 0
            r4.LLILLJJLI = r0
            r4.LLILLL = r0
            r4.LLILZLL = r2
            java.lang.Object r0 = r1.LIZ(r7, r8, r4)
            if (r0 != r3) goto L27
            return r3
        L7a:
            X.0u6G r4 = new X.0u6G
            r4.<init>(r6, r9)
            goto L12
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1690640u62.LJIJJ(X.0u62, X.05bM, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(int r14, float r15, X.InterfaceC1677030tk5<java.lang.Float> r16, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
        /*
            r13 = this;
            r3 = r17
            r11 = r16
            r10 = r15
            boolean r0 = r3 instanceof X.C1690770u6F
            if (r0 == 0) goto Lb4
            r4 = r3
            X.0u6F r4 = (X.C1690770u6F) r4
            int r2 = r4.LLIZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb4
            int r2 = r2 - r1
            r4.LLIZ = r2
        L17:
            java.lang.Object r5 = r4.LLILZIL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLIZ
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 == r1) goto L2d
            if (r0 != r2) goto Lbb
            X.C155000ia.LIZIZ(r5)
        L2a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2d:
            float r10 = r4.LLILZ
            int r14 = r4.LLILLL
            X.0tk5 r11 = r4.LLILLJJLI
            X.0u62 r8 = r4.LL
            X.C155000ia.LIZIZ(r5)
            goto L6f
        L39:
            X.C155000ia.LIZIZ(r5)
            int r0 = r13.LJIIIZ()
            if (r14 != r0) goto L4d
            float r0 = r13.LJIIJ()
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 != 0) goto L4d
        L4a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4d:
            int r0 = r13.LJIILIIL()
            if (r0 == 0) goto L4a
            r4.LL = r13
            r4.LLILLJJLI = r11
            r4.LLILLL = r14
            r4.LLILZ = r10
            r4.LLIZ = r1
            X.0u5y r0 = r13.LJJI
            java.lang.Object r1 = r0.LJIJI(r4)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L6b
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L6b:
            if (r1 != r3) goto L6e
            return r3
        L6e:
            r8 = r13
        L6f:
            double r0 = (double) r10
            r6 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 > 0) goto L9b
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 > 0) goto L9b
        L7c:
            int r9 = r8.LJIIIIZZ(r14)
            int r0 = r8.LJIILL()
            float r0 = (float) r0
            float r10 = r10 * r0
            X.0u6D r7 = new X.0u6D
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r4.LL = r12
            r4.LLILLJJLI = r12
            r4.LLIZ = r2
            X.05bM r0 = X.EnumC1384205bM.Default
            java.lang.Object r0 = r8.LIZ(r0, r7, r4)
            if (r0 != r3) goto L2a
            return r3
        L9b:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "pageOffsetFraction "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " is not within the range -0.5 to 0.5"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C1691080u6k.LIZ(r0)
            goto L7c
        Lb4:
            X.0u6F r4 = new X.0u6F
            r4.<init>(r13, r3)
            goto L17
        Lbb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1690640u62.LJFF(int, float, X.0tk5, X.05Vn):java.lang.Object");
    }
}
