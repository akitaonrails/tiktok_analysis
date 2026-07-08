package X;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0u58, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690080u58 implements InterfaceC1420105h9 {
    public static final C1687100u0K LJIL = C1684250tvj.LIZ(new C1690340u5Y(), new C1386405bi());
    public final InterfaceC1690390u5d LIZ;
    public boolean LIZIZ;
    public C1690070u57 LIZJ;
    public final C1690140u5E LIZLLL;
    public final C05P0<C1690070u57> LJ;
    public final C612270Nzt LJFF;
    public float LJI;
    public final C594850NUt LJII;
    public final boolean LJIIIIZZ;
    public InterfaceC1690550u5t LJIIIZ;
    public final C1690260u5Q LJIIJ;
    public final C1690600u5y LJIIJJI;
    public final LazyLayoutItemAnimator<C1690020u52> LJIIL;
    public final C1690570u5v LJIILIIL;
    public final C20044113bj LJIILJJIL;
    public final C1690170u5H LJIILL;
    public final C1682920tta LJIILLIIL;
    public final C05P0<Unit> LJIIZILJ;
    public final C05P0 LJIJ;
    public final C05P0 LJIJI;
    public final C05P0<Unit> LJIJJ;
    public final C1678030tlh LJIJJLI;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1690080u58() {
        final int i = 2;
        this(0, 0, new InterfaceC1690390u5d(i) { // from class: X.0qp2
            public final int LIZ;
            public int LIZIZ = -1;
            public InterfaceC1564810qp5 LIZJ;
            public boolean LIZLLL;

            @Override // X.InterfaceC1690390u5d
            public final /* synthetic */ void LIZIZ() {
            }

            {
                this.LIZ = i;
            }

            @Override // X.InterfaceC1690390u5d
            public final void LIZLLL(InterfaceC1564820qp6 interfaceC1564820qp6) {
                int index;
                if (this.LIZIZ != -1 && (!interfaceC1564820qp6.LJII().isEmpty())) {
                    if (this.LIZLLL) {
                        index = ((C06XG) C13LP.LJJLIIIJJI(interfaceC1564820qp6.LJII())).getIndex() + 1;
                    } else {
                        index = ((C06XG) C13LP.LJJJJZI(interfaceC1564820qp6.LJII())).getIndex() - 1;
                    }
                    if (this.LIZIZ != index) {
                        this.LIZIZ = -1;
                        InterfaceC1564810qp5 interfaceC1564810qp5 = this.LIZJ;
                        if (interfaceC1564810qp5 != null) {
                            interfaceC1564810qp5.cancel();
                        }
                        this.LIZJ = null;
                    }
                }
            }

            @Override // X.InterfaceC1690390u5d
            public final void LIZ(InterfaceC1564790qp3 interfaceC1564790qp3, int i2) {
                int i3 = this.LIZ;
                for (int i4 = 0; i4 < i3; i4++) {
                    interfaceC1564790qp3.LIZ(i2 + i4);
                }
            }

            @Override // X.InterfaceC1690390u5d
            public final void LIZJ(C1690170u5H c1690170u5H, float f, InterfaceC1564820qp6 interfaceC1564820qp6) {
                boolean z;
                int index;
                InterfaceC1564810qp5 interfaceC1564810qp5;
                InterfaceC1564810qp5 interfaceC1564810qp52;
                InterfaceC1564810qp5 interfaceC1564810qp53;
                if (!interfaceC1564820qp6.LJII().isEmpty()) {
                    if (f < 0.0f) {
                        z = true;
                        index = ((C06XG) C13LP.LJJLIIIJJI(interfaceC1564820qp6.LJII())).getIndex() + 1;
                    } else {
                        z = false;
                        index = ((C06XG) C13LP.LJJJJZI(interfaceC1564820qp6.LJII())).getIndex() - 1;
                    }
                    if (index >= 0 && index < interfaceC1564820qp6.LJFF()) {
                        if (index != this.LIZIZ) {
                            if (this.LIZLLL != z && (interfaceC1564810qp53 = this.LIZJ) != null) {
                                interfaceC1564810qp53.cancel();
                            }
                            this.LIZLLL = z;
                            this.LIZIZ = index;
                            this.LIZJ = c1690170u5H.LIZ(index);
                        }
                        if (z) {
                            C06XG c06xg = (C06XG) C13LP.LJJLIIIJJI(interfaceC1564820qp6.LJII());
                            if (((c06xg.getOffset() + c06xg.getSize()) + interfaceC1564820qp6.LJI()) - interfaceC1564820qp6.LIZIZ() < (-f) && (interfaceC1564810qp52 = this.LIZJ) != null) {
                                interfaceC1564810qp52.LIZ();
                                return;
                            }
                            return;
                        }
                        if (interfaceC1564820qp6.LIZLLL() - ((C06XG) C13LP.LJJJJZI(interfaceC1564820qp6.LJII())).getOffset() >= f || (interfaceC1564810qp5 = this.LIZJ) == null) {
                            return;
                        }
                        interfaceC1564810qp5.LIZ();
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
        return ((Boolean) this.LJIJ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1420105h9
    public final boolean LIZLLL() {
        return ((Boolean) this.LJIJI.getValue()).booleanValue();
    }

    public final int LJII() {
        return ((C13FG) this.LIZLLL.LIZ).LIZLLL();
    }

    public final int LJIIIIZZ() {
        return ((C13FG) this.LIZLLL.LIZIZ).LIZLLL();
    }

    public final InterfaceC1564820qp6 LJIIIZ() {
        return (InterfaceC1564820qp6) ((C13FE) this.LJ).getValue();
    }

    @Override // X.InterfaceC1420105h9
    public final float LJ(float f) {
        return this.LJII.LJ(f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1690080u58(int i, int i2) {
        final int i3 = 2;
        this(i, i2, new InterfaceC1690390u5d(i3) { // from class: X.0qp2
            public final int LIZ;
            public int LIZIZ = -1;
            public InterfaceC1564810qp5 LIZJ;
            public boolean LIZLLL;

            @Override // X.InterfaceC1690390u5d
            public final /* synthetic */ void LIZIZ() {
            }

            {
                this.LIZ = i3;
            }

            @Override // X.InterfaceC1690390u5d
            public final void LIZLLL(InterfaceC1564820qp6 interfaceC1564820qp6) {
                int index;
                if (this.LIZIZ != -1 && (!interfaceC1564820qp6.LJII().isEmpty())) {
                    if (this.LIZLLL) {
                        index = ((C06XG) C13LP.LJJLIIIJJI(interfaceC1564820qp6.LJII())).getIndex() + 1;
                    } else {
                        index = ((C06XG) C13LP.LJJJJZI(interfaceC1564820qp6.LJII())).getIndex() - 1;
                    }
                    if (this.LIZIZ != index) {
                        this.LIZIZ = -1;
                        InterfaceC1564810qp5 interfaceC1564810qp5 = this.LIZJ;
                        if (interfaceC1564810qp5 != null) {
                            interfaceC1564810qp5.cancel();
                        }
                        this.LIZJ = null;
                    }
                }
            }

            @Override // X.InterfaceC1690390u5d
            public final void LIZ(InterfaceC1564790qp3 interfaceC1564790qp3, int i22) {
                int i32 = this.LIZ;
                for (int i4 = 0; i4 < i32; i4++) {
                    interfaceC1564790qp3.LIZ(i22 + i4);
                }
            }

            @Override // X.InterfaceC1690390u5d
            public final void LIZJ(C1690170u5H c1690170u5H, float f, InterfaceC1564820qp6 interfaceC1564820qp6) {
                boolean z;
                int index;
                InterfaceC1564810qp5 interfaceC1564810qp5;
                InterfaceC1564810qp5 interfaceC1564810qp52;
                InterfaceC1564810qp5 interfaceC1564810qp53;
                if (!interfaceC1564820qp6.LJII().isEmpty()) {
                    if (f < 0.0f) {
                        z = true;
                        index = ((C06XG) C13LP.LJJLIIIJJI(interfaceC1564820qp6.LJII())).getIndex() + 1;
                    } else {
                        z = false;
                        index = ((C06XG) C13LP.LJJJJZI(interfaceC1564820qp6.LJII())).getIndex() - 1;
                    }
                    if (index >= 0 && index < interfaceC1564820qp6.LJFF()) {
                        if (index != this.LIZIZ) {
                            if (this.LIZLLL != z && (interfaceC1564810qp53 = this.LIZJ) != null) {
                                interfaceC1564810qp53.cancel();
                            }
                            this.LIZLLL = z;
                            this.LIZIZ = index;
                            this.LIZJ = c1690170u5H.LIZ(index);
                        }
                        if (z) {
                            C06XG c06xg = (C06XG) C13LP.LJJLIIIJJI(interfaceC1564820qp6.LJII());
                            if (((c06xg.getOffset() + c06xg.getSize()) + interfaceC1564820qp6.LJI()) - interfaceC1564820qp6.LIZIZ() < (-f) && (interfaceC1564810qp52 = this.LIZJ) != null) {
                                interfaceC1564810qp52.LIZ();
                                return;
                            }
                            return;
                        }
                        if (interfaceC1564820qp6.LIZLLL() - ((C06XG) C13LP.LJJJJZI(interfaceC1564820qp6.LJII())).getOffset() >= f || (interfaceC1564810qp5 = this.LIZJ) == null) {
                            return;
                        }
                        interfaceC1564810qp5.LIZ();
                    }
                }
            }
        });
    }

    public final void LJIIJJI(int i, int i2) {
        boolean z;
        if (((C13FG) this.LIZLLL.LIZ).LIZLLL() == i && ((C13FG) this.LIZLLL.LIZIZ).LIZLLL() == i2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            LazyLayoutItemAnimator<C1690020u52> lazyLayoutItemAnimator = this.LJIIL;
            lazyLayoutItemAnimator.LJ();
            lazyLayoutItemAnimator.LIZIZ = null;
            lazyLayoutItemAnimator.LIZJ = -1;
        }
        C1690140u5E c1690140u5E = this.LIZLLL;
        c1690140u5E.LIZ(i, i2);
        c1690140u5E.LIZLLL = null;
        InterfaceC1690550u5t interfaceC1690550u5t = this.LJIIIZ;
        if (interfaceC1690550u5t != null) {
            interfaceC1690550u5t.LJIIL();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0u5Q] */
    public C1690080u58(int i, int i2, InterfaceC1690390u5d interfaceC1690390u5d) {
        this.LIZ = interfaceC1690390u5d;
        this.LIZLLL = new C1690140u5E(i, i2);
        this.LJ = C20028913Yh.LJFF(C1690130u5D.LIZ, C13FT.LIZ);
        this.LJFF = new C612270Nzt();
        this.LJII = new C594850NUt(new C1690120u5C(this));
        this.LJIIIIZZ = true;
        this.LJIIJ = new InterfaceC1690520u5q() { // from class: X.0u5Q
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
        interfaceC1690390u5d.LIZIZ();
        this.LJIILJJIL = new C20044113bj(null, new C1690320u5W(this, i));
        this.LJIILL = new C1690170u5H(this);
        this.LJIILLIIL = new C1682920tta();
        this.LJIIZILJ = C1690450u5j.LIZ();
        Boolean bool = Boolean.FALSE;
        this.LJIJ = C20028913Yh.LJI(bool);
        this.LJIJI = C20028913Yh.LJI(bool);
        this.LJIJJ = C1690450u5j.LIZ();
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
            boolean r0 = r9 instanceof X.C1690180u5I
            if (r0 == 0) goto L59
            r5 = r9
            X.0u5I r5 = (X.C1690180u5I) r5
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
            X.0u58 r0 = r5.LL
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
            X.0u5I r5 = new X.0u5I
            r5.<init>(r6, r9)
            goto L12
        L5f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1690080u58.LIZ(X.05bM, kotlin.jvm.functions.Function2, X.05Vn):java.lang.Object");
    }

    public final Object LJFF(int i, int i2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZ = LIZ(EnumC1384205bM.Default, new C1690110u5B(this, i, i2, null), interfaceC1364105Vn);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    public final void LJI(C1690070u57 c1690070u57, boolean z, boolean z2) {
        boolean z3;
        Object obj;
        if (!z && this.LIZIZ) {
            this.LIZJ = c1690070u57;
            return;
        }
        if (z) {
            this.LIZIZ = true;
        }
        C1690020u52 c1690020u52 = c1690070u57.LIZ;
        int i = 0;
        if ((c1690020u52 == null || c1690020u52.LIZ == 0) && c1690070u57.LIZIZ == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        ((C13FE) this.LJIJI).setValue(Boolean.valueOf(z3));
        ((C13FE) this.LJIJ).setValue(Boolean.valueOf(c1690070u57.LIZJ));
        this.LJI -= c1690070u57.LIZLLL;
        ((C13FE) this.LJ).setValue(c1690070u57);
        if (z2) {
            C1690140u5E c1690140u5E = this.LIZLLL;
            int i2 = c1690070u57.LIZIZ;
            c1690140u5E.getClass();
            if (i2 < 0.0f) {
                C1691080u6k.LIZJ("scrollOffset should be non-negative");
            }
            ((C13FG) c1690140u5E.LIZIZ).LJIIJ(i2);
        } else {
            C1690140u5E c1690140u5E2 = this.LIZLLL;
            c1690140u5E2.getClass();
            C1690020u52 c1690020u522 = c1690070u57.LIZ;
            if (c1690020u522 != null) {
                obj = c1690020u522.LJIIJJI;
            } else {
                obj = null;
            }
            c1690140u5E2.LIZLLL = obj;
            if (c1690140u5E2.LIZJ || c1690070u57.LJIILIIL > 0) {
                c1690140u5E2.LIZJ = true;
                int i3 = c1690070u57.LIZIZ;
                if (i3 < 0.0f) {
                    C1691080u6k.LIZJ("scrollOffset should be non-negative");
                }
                C1690020u52 c1690020u523 = c1690070u57.LIZ;
                if (c1690020u523 != null) {
                    i = c1690020u523.LIZ;
                }
                c1690140u5E2.LIZ(i, i3);
            }
            if (this.LJIIIIZZ) {
                this.LIZ.LIZLLL(c1690070u57);
            }
        }
        if (!z) {
            return;
        }
        this.LJIJJLI.LIZ(c1690070u57.LJFF, c1690070u57.LJIIIIZZ, c1690070u57.LJII);
    }

    public final Object LJIIJ(int i, int i2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZ = LIZ(EnumC1384205bM.Default, new C1392505ch(this, i, i2, null), interfaceC1364105Vn);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }
}
