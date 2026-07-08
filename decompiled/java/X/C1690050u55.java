package X;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.AwS131S0101000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0u55, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690050u55 implements InterfaceC1420105h9 {
    public static final C1687100u0K LJIL = C1684250tvj.LIZ(AFwS229S0000000_2.get$arr$(819), AFwS285S0000000_2.get$arr$(61));
    public final InterfaceC1690400u5e LIZ;
    public boolean LIZIZ;
    public C1690040u54 LIZJ;
    public final C1690360u5a LIZLLL;
    public final C05P0<C1690040u54> LJ;
    public final C612270Nzt LJFF;
    public float LJI;
    public final C594850NUt LJII;
    public final boolean LJIIIIZZ;
    public InterfaceC1690550u5t LJIIIZ;
    public final C1690270u5R LJIIJ;
    public final C1690600u5y LJIIJJI;
    public final LazyLayoutItemAnimator<C1690030u53> LJIIL;
    public final C1690570u5v LJIILIIL;
    public final C20044113bj LJIILJJIL;
    public final C1689900u4q LJIILL;
    public final C1682920tta LJIILLIIL;
    public final C05P0<Unit> LJIIZILJ;
    public final C05P0<Unit> LJIJ;
    public final C05P0 LJIJI;
    public final C05P0 LJIJJ;
    public final C1678030tlh LJIJJLI;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1690050u55() {
        final int i = 2;
        this(0, 0, new InterfaceC1690400u5e(i) { // from class: X.0txC
            public final int LIZ;
            public int LIZIZ = -1;
            public final C19968013Aw<InterfaceC1564810qp5> LIZJ = new C19968013Aw<>(new InterfaceC1564810qp5[16]);
            public boolean LIZLLL;

            @Override // X.InterfaceC1690400u5e
            public final /* synthetic */ void LIZIZ() {
            }

            {
                this.LIZ = i;
            }

            @Override // X.InterfaceC1690400u5e
            public final void LIZJ(InterfaceC1685110tx7 interfaceC1685110tx7) {
                int iLJIIJ;
                int i2;
                int iLJIIJ2;
                if (this.LIZIZ != -1 && (!interfaceC1685110tx7.LJII().isEmpty())) {
                    if (this.LIZLLL) {
                        InterfaceC1685080tx4 interfaceC1685080tx4 = (InterfaceC1685080tx4) C13LP.LJJLIIIJJI(interfaceC1685110tx7.LJII());
                        if (interfaceC1685110tx7.getOrientation() == EnumC1684030tvN.Vertical) {
                            iLJIIJ2 = interfaceC1685080tx4.LJIIIIZZ();
                        } else {
                            iLJIIJ2 = interfaceC1685080tx4.LJIIJ();
                        }
                        i2 = iLJIIJ2 + 1;
                    } else {
                        InterfaceC1685080tx4 interfaceC1685080tx42 = (InterfaceC1685080tx4) C13LP.LJJJJZI(interfaceC1685110tx7.LJII());
                        if (interfaceC1685110tx7.getOrientation() == EnumC1684030tvN.Vertical) {
                            iLJIIJ = interfaceC1685080tx42.LJIIIIZZ();
                        } else {
                            iLJIIJ = interfaceC1685080tx42.LJIIJ();
                        }
                        i2 = iLJIIJ - 1;
                    }
                    if (this.LIZIZ != i2) {
                        this.LIZIZ = -1;
                        C19968013Aw<InterfaceC1564810qp5> c19968013Aw = this.LIZJ;
                        InterfaceC1564810qp5[] interfaceC1564810qp5Arr = c19968013Aw.LL;
                        int i3 = c19968013Aw.LLILLL;
                        for (int i4 = 0; i4 < i3; i4++) {
                            interfaceC1564810qp5Arr[i4].cancel();
                        }
                        this.LIZJ.LJIIIZ();
                    }
                }
            }

            @Override // X.InterfaceC1690400u5e
            public final void LIZ(InterfaceC1564790qp3 interfaceC1564790qp3, int i2) {
                int i3 = this.LIZ;
                for (int i4 = 0; i4 < i3; i4++) {
                    interfaceC1564790qp3.LIZ(i2 + i4);
                }
            }

            @Override // X.InterfaceC1690400u5e
            public final void LIZLLL(C1689900u4q c1689900u4q, float f, InterfaceC1685110tx7 interfaceC1685110tx7) {
                boolean z;
                int iLJIIJ;
                int i2;
                int index;
                long jLIZ;
                int iLJIIJ2;
                if (!interfaceC1685110tx7.LJII().isEmpty()) {
                    int i3 = 0;
                    if (f < 0.0f) {
                        z = true;
                        InterfaceC1685080tx4 interfaceC1685080tx4 = (InterfaceC1685080tx4) C13LP.LJJLIIIJJI(interfaceC1685110tx7.LJII());
                        if (interfaceC1685110tx7.getOrientation() == EnumC1684030tvN.Vertical) {
                            iLJIIJ2 = interfaceC1685080tx4.LJIIIIZZ();
                        } else {
                            iLJIIJ2 = interfaceC1685080tx4.LJIIJ();
                        }
                        i2 = iLJIIJ2 + 1;
                        index = ((InterfaceC1685080tx4) C13LP.LJJLIIIJJI(interfaceC1685110tx7.LJII())).getIndex() + 1;
                    } else {
                        z = false;
                        InterfaceC1685080tx4 interfaceC1685080tx42 = (InterfaceC1685080tx4) C13LP.LJJJJZI(interfaceC1685110tx7.LJII());
                        if (interfaceC1685110tx7.getOrientation() == EnumC1684030tvN.Vertical) {
                            iLJIIJ = interfaceC1685080tx42.LJIIIIZZ();
                        } else {
                            iLJIIJ = interfaceC1685080tx42.LJIIJ();
                        }
                        i2 = iLJIIJ - 1;
                        index = ((InterfaceC1685080tx4) C13LP.LJJJJZI(interfaceC1685110tx7.LJII())).getIndex() - 1;
                    }
                    if (index >= 0 && index < interfaceC1685110tx7.LJFF()) {
                        if (i2 != this.LIZIZ && i2 >= 0) {
                            if (this.LIZLLL != z) {
                                C19968013Aw<InterfaceC1564810qp5> c19968013Aw = this.LIZJ;
                                InterfaceC1564810qp5[] interfaceC1564810qp5Arr = c19968013Aw.LL;
                                int i4 = c19968013Aw.LLILLL;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    interfaceC1564810qp5Arr[i5].cancel();
                                }
                            }
                            this.LIZLLL = z;
                            this.LIZIZ = i2;
                            this.LIZJ.LJIIIZ();
                            C19968013Aw<InterfaceC1564810qp5> c19968013Aw2 = this.LIZJ;
                            c19968013Aw2.LJFF(c19968013Aw2.LLILLL, c1689900u4q.LIZ(i2));
                        }
                        if (z) {
                            InterfaceC1685080tx4 interfaceC1685080tx43 = (InterfaceC1685080tx4) C13LP.LJJLIIIJJI(interfaceC1685110tx7.LJII());
                            if (interfaceC1685110tx7.getOrientation() == EnumC1684030tvN.Vertical) {
                                jLIZ = interfaceC1685080tx43.LIZ() & 4294967295L;
                            } else {
                                jLIZ = interfaceC1685080tx43.LIZ() >> 32;
                            }
                            int i6 = (int) jLIZ;
                            if (((C1685170txD.LIZ(interfaceC1685080tx43, interfaceC1685110tx7.getOrientation()) + i6) + interfaceC1685110tx7.LJI()) - interfaceC1685110tx7.LIZIZ() < (-f)) {
                                C19968013Aw<InterfaceC1564810qp5> c19968013Aw3 = this.LIZJ;
                                InterfaceC1564810qp5[] interfaceC1564810qp5Arr2 = c19968013Aw3.LL;
                                int i7 = c19968013Aw3.LLILLL;
                                while (i3 < i7) {
                                    interfaceC1564810qp5Arr2[i3].LIZ();
                                    i3++;
                                }
                                return;
                            }
                            return;
                        }
                        if (interfaceC1685110tx7.LIZLLL() - C1685170txD.LIZ((InterfaceC1685080tx4) C13LP.LJJJJZI(interfaceC1685110tx7.LJII()), interfaceC1685110tx7.getOrientation()) < f) {
                            C19968013Aw<InterfaceC1564810qp5> c19968013Aw4 = this.LIZJ;
                            InterfaceC1564810qp5[] interfaceC1564810qp5Arr3 = c19968013Aw4.LL;
                            int i8 = c19968013Aw4.LLILLL;
                            while (i3 < i8) {
                                interfaceC1564810qp5Arr3[i3].LIZ();
                                i3++;
                            }
                        }
                    }
                }
            }
        });
    }

    @Override // X.InterfaceC1420105h9
    public final boolean LIZIZ() {
        return this.LJII.LIZIZ();
    }

    @Override // X.InterfaceC1420105h9
    public final boolean LIZJ() {
        return ((Boolean) this.LJIJI.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1420105h9
    public final boolean LIZLLL() {
        return ((Boolean) this.LJIJJ.getValue()).booleanValue();
    }

    public final int LJI() {
        return ((C13FG) this.LIZLLL.LIZ).LIZLLL();
    }

    public final int LJII() {
        return ((C13FG) this.LIZLLL.LIZIZ).LIZLLL();
    }

    public final boolean LJIIIIZZ() {
        return this.LJII.LJFF();
    }

    public final InterfaceC1685110tx7 LJIIIZ() {
        return (InterfaceC1685110tx7) ((C13FE) this.LJ).getValue();
    }

    @Override // X.InterfaceC1420105h9
    public final float LJ(float f) {
        return this.LJII.LJ(f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1690050u55(int i, int i2) {
        final int i3 = 2;
        this(i, i2, new InterfaceC1690400u5e(i3) { // from class: X.0txC
            public final int LIZ;
            public int LIZIZ = -1;
            public final C19968013Aw<InterfaceC1564810qp5> LIZJ = new C19968013Aw<>(new InterfaceC1564810qp5[16]);
            public boolean LIZLLL;

            @Override // X.InterfaceC1690400u5e
            public final /* synthetic */ void LIZIZ() {
            }

            {
                this.LIZ = i3;
            }

            @Override // X.InterfaceC1690400u5e
            public final void LIZJ(InterfaceC1685110tx7 interfaceC1685110tx7) {
                int iLJIIJ;
                int i22;
                int iLJIIJ2;
                if (this.LIZIZ != -1 && (!interfaceC1685110tx7.LJII().isEmpty())) {
                    if (this.LIZLLL) {
                        InterfaceC1685080tx4 interfaceC1685080tx4 = (InterfaceC1685080tx4) C13LP.LJJLIIIJJI(interfaceC1685110tx7.LJII());
                        if (interfaceC1685110tx7.getOrientation() == EnumC1684030tvN.Vertical) {
                            iLJIIJ2 = interfaceC1685080tx4.LJIIIIZZ();
                        } else {
                            iLJIIJ2 = interfaceC1685080tx4.LJIIJ();
                        }
                        i22 = iLJIIJ2 + 1;
                    } else {
                        InterfaceC1685080tx4 interfaceC1685080tx42 = (InterfaceC1685080tx4) C13LP.LJJJJZI(interfaceC1685110tx7.LJII());
                        if (interfaceC1685110tx7.getOrientation() == EnumC1684030tvN.Vertical) {
                            iLJIIJ = interfaceC1685080tx42.LJIIIIZZ();
                        } else {
                            iLJIIJ = interfaceC1685080tx42.LJIIJ();
                        }
                        i22 = iLJIIJ - 1;
                    }
                    if (this.LIZIZ != i22) {
                        this.LIZIZ = -1;
                        C19968013Aw<InterfaceC1564810qp5> c19968013Aw = this.LIZJ;
                        InterfaceC1564810qp5[] interfaceC1564810qp5Arr = c19968013Aw.LL;
                        int i32 = c19968013Aw.LLILLL;
                        for (int i4 = 0; i4 < i32; i4++) {
                            interfaceC1564810qp5Arr[i4].cancel();
                        }
                        this.LIZJ.LJIIIZ();
                    }
                }
            }

            @Override // X.InterfaceC1690400u5e
            public final void LIZ(InterfaceC1564790qp3 interfaceC1564790qp3, int i22) {
                int i32 = this.LIZ;
                for (int i4 = 0; i4 < i32; i4++) {
                    interfaceC1564790qp3.LIZ(i22 + i4);
                }
            }

            @Override // X.InterfaceC1690400u5e
            public final void LIZLLL(C1689900u4q c1689900u4q, float f, InterfaceC1685110tx7 interfaceC1685110tx7) {
                boolean z;
                int iLJIIJ;
                int i22;
                int index;
                long jLIZ;
                int iLJIIJ2;
                if (!interfaceC1685110tx7.LJII().isEmpty()) {
                    int i32 = 0;
                    if (f < 0.0f) {
                        z = true;
                        InterfaceC1685080tx4 interfaceC1685080tx4 = (InterfaceC1685080tx4) C13LP.LJJLIIIJJI(interfaceC1685110tx7.LJII());
                        if (interfaceC1685110tx7.getOrientation() == EnumC1684030tvN.Vertical) {
                            iLJIIJ2 = interfaceC1685080tx4.LJIIIIZZ();
                        } else {
                            iLJIIJ2 = interfaceC1685080tx4.LJIIJ();
                        }
                        i22 = iLJIIJ2 + 1;
                        index = ((InterfaceC1685080tx4) C13LP.LJJLIIIJJI(interfaceC1685110tx7.LJII())).getIndex() + 1;
                    } else {
                        z = false;
                        InterfaceC1685080tx4 interfaceC1685080tx42 = (InterfaceC1685080tx4) C13LP.LJJJJZI(interfaceC1685110tx7.LJII());
                        if (interfaceC1685110tx7.getOrientation() == EnumC1684030tvN.Vertical) {
                            iLJIIJ = interfaceC1685080tx42.LJIIIIZZ();
                        } else {
                            iLJIIJ = interfaceC1685080tx42.LJIIJ();
                        }
                        i22 = iLJIIJ - 1;
                        index = ((InterfaceC1685080tx4) C13LP.LJJJJZI(interfaceC1685110tx7.LJII())).getIndex() - 1;
                    }
                    if (index >= 0 && index < interfaceC1685110tx7.LJFF()) {
                        if (i22 != this.LIZIZ && i22 >= 0) {
                            if (this.LIZLLL != z) {
                                C19968013Aw<InterfaceC1564810qp5> c19968013Aw = this.LIZJ;
                                InterfaceC1564810qp5[] interfaceC1564810qp5Arr = c19968013Aw.LL;
                                int i4 = c19968013Aw.LLILLL;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    interfaceC1564810qp5Arr[i5].cancel();
                                }
                            }
                            this.LIZLLL = z;
                            this.LIZIZ = i22;
                            this.LIZJ.LJIIIZ();
                            C19968013Aw<InterfaceC1564810qp5> c19968013Aw2 = this.LIZJ;
                            c19968013Aw2.LJFF(c19968013Aw2.LLILLL, c1689900u4q.LIZ(i22));
                        }
                        if (z) {
                            InterfaceC1685080tx4 interfaceC1685080tx43 = (InterfaceC1685080tx4) C13LP.LJJLIIIJJI(interfaceC1685110tx7.LJII());
                            if (interfaceC1685110tx7.getOrientation() == EnumC1684030tvN.Vertical) {
                                jLIZ = interfaceC1685080tx43.LIZ() & 4294967295L;
                            } else {
                                jLIZ = interfaceC1685080tx43.LIZ() >> 32;
                            }
                            int i6 = (int) jLIZ;
                            if (((C1685170txD.LIZ(interfaceC1685080tx43, interfaceC1685110tx7.getOrientation()) + i6) + interfaceC1685110tx7.LJI()) - interfaceC1685110tx7.LIZIZ() < (-f)) {
                                C19968013Aw<InterfaceC1564810qp5> c19968013Aw3 = this.LIZJ;
                                InterfaceC1564810qp5[] interfaceC1564810qp5Arr2 = c19968013Aw3.LL;
                                int i7 = c19968013Aw3.LLILLL;
                                while (i32 < i7) {
                                    interfaceC1564810qp5Arr2[i32].LIZ();
                                    i32++;
                                }
                                return;
                            }
                            return;
                        }
                        if (interfaceC1685110tx7.LIZLLL() - C1685170txD.LIZ((InterfaceC1685080tx4) C13LP.LJJJJZI(interfaceC1685110tx7.LJII()), interfaceC1685110tx7.getOrientation()) < f) {
                            C19968013Aw<InterfaceC1564810qp5> c19968013Aw4 = this.LIZJ;
                            InterfaceC1564810qp5[] interfaceC1564810qp5Arr3 = c19968013Aw4.LL;
                            int i8 = c19968013Aw4.LLILLL;
                            while (i32 < i8) {
                                interfaceC1564810qp5Arr3[i32].LIZ();
                                i32++;
                            }
                        }
                    }
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0u5R] */
    public C1690050u55(int i, int i2, InterfaceC1690400u5e interfaceC1690400u5e) {
        this.LIZ = interfaceC1690400u5e;
        this.LIZLLL = new C1690360u5a(i, i2);
        this.LJ = C20028913Yh.LJFF(C1689910u4r.LIZ, C13FT.LIZ);
        this.LJFF = new C612270Nzt();
        this.LJII = new C594850NUt(new AwS604S0100000_25(this, 758));
        this.LJIIIIZZ = true;
        this.LJIIJ = new InterfaceC1690520u5q() { // from class: X.0u5R
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
                this.LIZIZ.LJIIIZ = c20053713dH;
            }

            @Override // X.InterfaceC1685750ty9
            public final Object LJIILJJIL(Object obj, Function2 function2) {
                return function2.invoke(obj, this);
            }
        };
        this.LJIIJJI = new C1690600u5y();
        this.LJIIL = new LazyLayoutItemAnimator<>();
        this.LJIILIIL = new C1690570u5v();
        interfaceC1690400u5e.LIZIZ();
        this.LJIILJJIL = new C20044113bj(null, new AwS131S0101000_25(this, i, 11));
        this.LJIILL = new C1689900u4q(this);
        this.LJIILLIIL = new C1682920tta();
        this.LJIIZILJ = C1690450u5j.LIZ();
        this.LJIJ = C1690450u5j.LIZ();
        Boolean bool = Boolean.FALSE;
        this.LJIJI = C20028913Yh.LJI(bool);
        this.LJIJJ = C20028913Yh.LJI(bool);
        this.LJIJJLI = new C1678030tlh();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    @Override // X.InterfaceC1420105h9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(X.EnumC1384205bM r7, kotlin.jvm.functions.Function2<? super X.InterfaceC1392705cj, ? super X.InterfaceC1364105Vn<? super kotlin.Unit>, ? extends java.lang.Object> r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C1690190u5J
            if (r0 == 0) goto L59
            r5 = r9
            X.0u5J r5 = (X.C1690190u5J) r5
            int r2 = r5.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L59
            int r2 = r2 - r1
            r5.LLILZLL = r2
        L12:
            java.lang.Object r4 = r5.LLILZ
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L3e
            if (r0 != r2) goto L5f
            X.C155000ia.LIZIZ(r4)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r4)
            X.0u5y r0 = r6.LJIIJJI
            r5.LL = r6
            r5.LLILLJJLI = r7
            r5.LLILLL = r8
            r5.LLILZLL = r1
            java.lang.Object r0 = r0.LJIJI(r5)
            if (r0 != r3) goto L3c
            return r3
        L3c:
            r0 = r6
            goto L47
        L3e:
            kotlin.jvm.functions.Function2 r8 = r5.LLILLL
            X.05bM r7 = r5.LLILLJJLI
            X.0u55 r0 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L47:
            X.0NUt r1 = r0.LJII
            r0 = 0
            r5.LL = r0
            r5.LLILLJJLI = r0
            r5.LLILLL = r0
            r5.LLILZLL = r2
            java.lang.Object r0 = r1.LIZ(r7, r8, r5)
            if (r0 != r3) goto L25
            return r3
        L59:
            X.0u5J r5 = new X.0u5J
            r5.<init>(r6, r9)
            goto L12
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1690050u55.LIZ(X.05bM, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }

    public final void LJFF(C1690040u54 c1690040u54, boolean z, boolean z2) {
        boolean z3;
        Object obj;
        int i;
        C1690030u53[] c1690030u53Arr;
        C1690030u53 c1690030u53;
        C1690030u53[] c1690030u53Arr2;
        C1690030u53 c1690030u532;
        if (!z && this.LIZIZ) {
            this.LIZJ = c1690040u54;
            return;
        }
        if (z) {
            this.LIZIZ = true;
        }
        this.LJI -= c1690040u54.LIZLLL;
        ((C13FE) this.LJ).setValue(c1690040u54);
        C1690210u5L c1690210u5L = c1690040u54.LIZ;
        if ((c1690210u5L == null || c1690210u5L.LIZ == 0) && c1690040u54.LIZIZ == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        ((C13FE) this.LJIJJ).setValue(Boolean.valueOf(z3));
        ((C13FE) this.LJIJI).setValue(Boolean.valueOf(c1690040u54.LIZJ));
        if (z2) {
            C1690360u5a c1690360u5a = this.LIZLLL;
            int i2 = c1690040u54.LIZIZ;
            c1690360u5a.getClass();
            if (i2 < 0.0f) {
                C1691080u6k.LIZJ("scrollOffset should be non-negative");
            }
            ((C13FG) c1690360u5a.LIZIZ).LJIIJ(i2);
        } else {
            C1690360u5a c1690360u5a2 = this.LIZLLL;
            c1690360u5a2.getClass();
            C1690210u5L c1690210u5L2 = c1690040u54.LIZ;
            if (c1690210u5L2 != null && (c1690030u53Arr2 = c1690210u5L2.LIZIZ) != null && (c1690030u532 = (C1690030u53) C13LQ.LJJIFFI(c1690030u53Arr2)) != null) {
                obj = c1690030u532.LIZIZ;
            } else {
                obj = null;
            }
            c1690360u5a2.LIZLLL = obj;
            if (c1690360u5a2.LIZJ || c1690040u54.LJIILJJIL > 0) {
                c1690360u5a2.LIZJ = true;
                int i3 = c1690040u54.LIZIZ;
                if (i3 < 0.0f) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("scrollOffset should be non-negative (");
                    sbLIZ.append(i3);
                    sbLIZ.append(')');
                    C1691080u6k.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                }
                C1690210u5L c1690210u5L3 = c1690040u54.LIZ;
                if (c1690210u5L3 != null && (c1690030u53Arr = c1690210u5L3.LIZIZ) != null && (c1690030u53 = (C1690030u53) C13LQ.LJJIFFI(c1690030u53Arr)) != null) {
                    i = c1690030u53.LIZ;
                } else {
                    i = 0;
                }
                if (i < 0.0f) {
                    C1691080u6k.LIZ("Index should be non-negative");
                }
                ((C13FG) c1690360u5a2.LIZ).LJIIJ(i);
                c1690360u5a2.LJ.LJIIL(i);
                ((C13FG) c1690360u5a2.LIZIZ).LJIIJ(i3);
            }
            if (this.LJIIIIZZ) {
                this.LIZ.LIZJ(c1690040u54);
            }
        }
        if (!z) {
            return;
        }
        this.LJIJJLI.LIZ(c1690040u54.LJFF, c1690040u54.LJIIIIZZ, c1690040u54.LJII);
    }

    public final Object LJIIJ(int i, int i2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZ = LIZ(EnumC1384205bM.Default, new C1690060u56(this, i, i2, null), interfaceC1364105Vn);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }
}
