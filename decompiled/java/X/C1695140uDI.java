package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uDI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695140uDI implements InterfaceC1675870tiD {
    public final C1680390tpV LL = new C1680390tpV();
    public final C1695230uDR LLILLJJLI = new C1695230uDR(this);
    public C1695150uDJ LLILLL;
    public C1695150uDJ LLILZ;

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ long LJJLIIIJLJLI(long j) {
        return C1682420tsm.LIZLLL(j, this);
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ long LJLI(long j) {
        return C1682420tsm.LIZIZ(j, this);
    }

    @Override // X.InterfaceC1681050tqZ
    public final /* synthetic */ long LJLJLJ(float f) {
        return C1685230txJ.LIZIZ(this, f);
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ int LJLLJ(float f) {
        return C1682420tsm.LIZ(f, this);
    }

    @Override // X.InterfaceC1690500u5o
    public final /* synthetic */ float LJLLL(long j) {
        return C1682420tsm.LIZJ(j, this);
    }

    @Override // X.InterfaceC1681050tqZ
    public final /* synthetic */ float LLI(long j) {
        return C1685230txJ.LIZ(this, j);
    }

    @Override // X.InterfaceC1675870tiD
    public final void LLIIZ(C1695970uEd c1695970uEd, long j, Function1 function1) {
        throw null;
    }

    @Override // X.InterfaceC1675870tiD
    public final long LIZIZ() {
        return this.LLILLJJLI.LIZIZ();
    }

    @Override // X.InterfaceC1675870tiD
    public final long LJIJI() {
        return C1671580tbI.LIZIZ(this.LLILLJJLI.LIZIZ());
    }

    public final InterfaceC1695240uDS LJIJJLI() {
        C1695150uDJ c1695150uDJ = this.LLILZ;
        if (c1695150uDJ != null) {
            return c1695150uDJ;
        }
        C1695150uDJ c1695150uDJLIZ = C1695550uDx.LIZ();
        c1695150uDJLIZ.LJFF(1);
        this.LLILZ = c1695150uDJLIZ;
        return c1695150uDJLIZ;
    }

    @Override // X.InterfaceC1681050tqZ
    public final float LJJ() {
        return this.LL.LIZ.LJJ();
    }

    @Override // X.InterfaceC1690500u5o
    public final float getDensity() {
        return this.LL.LIZ.getDensity();
    }

    @Override // X.InterfaceC1675870tiD
    public final EnumC1671200tag getLayoutDirection() {
        return this.LL.LIZIZ;
    }

    @Override // X.InterfaceC1675870tiD
    public final C1695230uDR LJLJI() {
        return this.LLILLJJLI;
    }

    public final InterfaceC1695240uDS LJIL(AbstractC1695860uES abstractC1695860uES) {
        if (Intrinsics.LJFF(abstractC1695860uES, C1695700uEC.LIZ)) {
            C1695150uDJ c1695150uDJ = this.LLILLL;
            if (c1695150uDJ == null) {
                C1695150uDJ c1695150uDJLIZ = C1695550uDx.LIZ();
                c1695150uDJLIZ.LJFF(0);
                this.LLILLL = c1695150uDJLIZ;
                return c1695150uDJLIZ;
            }
            return c1695150uDJ;
        }
        if (abstractC1695860uES instanceof C1695210uDP) {
            InterfaceC1695240uDS interfaceC1695240uDSLJIJJLI = LJIJJLI();
            C1695150uDJ c1695150uDJ2 = (C1695150uDJ) interfaceC1695240uDSLJIJJLI;
            float fLJIJJLI = c1695150uDJ2.LJIJJLI();
            C1695210uDP c1695210uDP = (C1695210uDP) abstractC1695860uES;
            float f = c1695210uDP.LIZ;
            if (fLJIJJLI != f) {
                c1695150uDJ2.LJI(f);
            }
            int iLJIIZILJ = c1695150uDJ2.LJIIZILJ();
            int i = c1695210uDP.LIZJ;
            if (iLJIIZILJ != i) {
                c1695150uDJ2.LIZLLL(i);
            }
            float fLJIJJ = c1695150uDJ2.LJIJJ();
            float f2 = c1695210uDP.LIZIZ;
            if (fLJIJJ != f2) {
                c1695150uDJ2.LJIIIIZZ(f2);
            }
            int iLJIJI = c1695150uDJ2.LJIJI();
            int i2 = c1695210uDP.LIZLLL;
            if (iLJIJI != i2) {
                c1695150uDJ2.LJII(i2);
            }
            if (Intrinsics.LJFF(c1695150uDJ2.LJ, c1695210uDP.LJ)) {
                return interfaceC1695240uDSLJIJJLI;
            }
            c1695150uDJ2.LJ(c1695210uDP.LJ);
            return interfaceC1695240uDSLJIJJLI;
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJI(int i) {
        return i / getDensity();
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJJJLL(float f) {
        return f * getDensity();
    }

    @Override // X.InterfaceC1690500u5o
    public final float LLIIIJ(float f) {
        return f / getDensity();
    }

    public static long LJIJJ(float f, long j) {
        if (f != 1.0f) {
            return C1685910tyP.LIZJ(C1685910tyP.LJFF(j) * f, j);
        }
        return j;
    }

    public static InterfaceC1695240uDS LIZLLL(C1695140uDI c1695140uDI, long j, AbstractC1695860uES abstractC1695860uES, float f, C1685400txa c1685400txa, int i) {
        InterfaceC1675870tiD.LLILL.getClass();
        int i2 = C1668240tVu.LIZJ;
        InterfaceC1695240uDS interfaceC1695240uDSLJIL = c1695140uDI.LJIL(abstractC1695860uES);
        long jLJIJJ = LJIJJ(f, j);
        C1695150uDJ c1695150uDJ = (C1695150uDJ) interfaceC1695240uDSLJIL;
        if (!C1685910tyP.LJ(c1695150uDJ.LIZJ(), jLJIJJ)) {
            c1695150uDJ.LJIIIZ(jLJIJJ);
        }
        if (c1695150uDJ.LIZJ != null) {
            c1695150uDJ.LJIILL(null);
        }
        if (!Intrinsics.LJFF(c1695150uDJ.LIZLLL, c1685400txa)) {
            c1695150uDJ.LJIIJJI(c1685400txa);
        }
        if (c1695150uDJ.LIZIZ != i) {
            c1695150uDJ.LJIIJ(i);
        }
        if (c1695150uDJ.LJIILLIIL() != i2) {
            c1695150uDJ.LJIIL(i2);
        }
        return interfaceC1695240uDSLJIL;
    }

    public static InterfaceC1695240uDS LJIILL(C1695140uDI c1695140uDI, AbstractC1668700tWe abstractC1668700tWe, AbstractC1695860uES abstractC1695860uES, float f, C1685400txa c1685400txa, int i) {
        InterfaceC1675870tiD.LLILL.getClass();
        return c1695140uDI.LJIIL(abstractC1668700tWe, abstractC1695860uES, f, c1685400txa, i, C1668240tVu.LIZJ);
    }

    public final InterfaceC1695240uDS LJIIL(AbstractC1668700tWe abstractC1668700tWe, AbstractC1695860uES abstractC1695860uES, float f, C1685400txa c1685400txa, int i, int i2) {
        InterfaceC1695240uDS interfaceC1695240uDSLJIL = LJIL(abstractC1695860uES);
        if (abstractC1668700tWe != null) {
            abstractC1668700tWe.LIZ(f, LIZIZ(), interfaceC1695240uDSLJIL);
        } else {
            if (interfaceC1695240uDSLJIL.LJIILJJIL() != null) {
                interfaceC1695240uDSLJIL.LJIILL(null);
            }
            long jLIZJ = interfaceC1695240uDSLJIL.LIZJ();
            int i3 = C1685910tyP.LJIIJJI;
            long j = C1685910tyP.LIZIZ;
            if (!C1685910tyP.LJ(jLIZJ, j)) {
                interfaceC1695240uDSLJIL.LJIIIZ(j);
            }
            if (interfaceC1695240uDSLJIL.LIZ() != f) {
                interfaceC1695240uDSLJIL.setAlpha(f);
            }
        }
        if (!Intrinsics.LJFF(interfaceC1695240uDSLJIL.LIZIZ(), c1685400txa)) {
            interfaceC1695240uDSLJIL.LJIIJJI(c1685400txa);
        }
        if (interfaceC1695240uDSLJIL.LJIJ() != i) {
            interfaceC1695240uDSLJIL.LJIIJ(i);
        }
        if (interfaceC1695240uDSLJIL.LJIILLIIL() != i2) {
            interfaceC1695240uDSLJIL.LJIIL(i2);
        }
        return interfaceC1695240uDSLJIL;
    }

    @Override // X.InterfaceC1675870tiD
    public final void LJJIII(InterfaceC1680820tqC interfaceC1680820tqC, long j, float f, AbstractC1695860uES abstractC1695860uES, C1685400txa c1685400txa, int i) {
        this.LL.LIZJ.LJFF(interfaceC1680820tqC, j, LJIILL(this, null, abstractC1695860uES, f, c1685400txa, i));
    }

    @Override // X.InterfaceC1675870tiD
    public final void LJJIJIIJI(InterfaceC1680960tqQ interfaceC1680960tqQ, AbstractC1668700tWe abstractC1668700tWe, float f, AbstractC1695860uES abstractC1695860uES, C1685400txa c1685400txa, int i) {
        this.LL.LIZJ.LJII(interfaceC1680960tqQ, LJIILL(this, abstractC1668700tWe, abstractC1695860uES, f, c1685400txa, i));
    }

    @Override // X.InterfaceC1675870tiD
    public final void LLILL(InterfaceC1680960tqQ interfaceC1680960tqQ, long j, float f, AbstractC1695860uES abstractC1695860uES, C1685400txa c1685400txa, int i) {
        this.LL.LIZJ.LJII(interfaceC1680960tqQ, LIZLLL(this, j, abstractC1695860uES, f, c1685400txa, i));
    }

    @Override // X.InterfaceC1675870tiD
    public final void LJJIIJ(long j, float f, long j2, float f2, AbstractC1695860uES abstractC1695860uES, C1685400txa c1685400txa, int i) {
        this.LL.LIZJ.LIZIZ(f, j2, LIZLLL(this, j, abstractC1695860uES, f2, c1685400txa, i));
    }

    @Override // X.InterfaceC1675870tiD
    public final void LJLIIIL(AbstractC1668700tWe abstractC1668700tWe, long j, long j2, float f, AbstractC1695860uES abstractC1695860uES, C1685400txa c1685400txa, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.LL.LIZJ.LJIIIIZZ(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j2 & 4294967295L)), LJIILL(this, abstractC1668700tWe, abstractC1695860uES, f, c1685400txa, i));
    }

    @Override // X.InterfaceC1675870tiD
    public final void LLIFFJFJJ(long j, long j2, long j3, float f, AbstractC1695860uES abstractC1695860uES, C1685400txa c1685400txa, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.LL.LIZJ.LJIIIIZZ(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 & 4294967295L)), LIZLLL(this, j, abstractC1695860uES, f, c1685400txa, i));
    }

    @Override // X.InterfaceC1675870tiD
    public final void LLII(AbstractC1668700tWe abstractC1668700tWe, float f, long j, float f2, AbstractC1695860uES abstractC1695860uES, C1685400txa c1685400txa, int i) {
        this.LL.LIZJ.LIZIZ(f, j, LJIILL(this, abstractC1668700tWe, abstractC1695860uES, f2, c1685400txa, i));
    }

    @Override // X.InterfaceC1675870tiD
    public final void LJJJJI(AbstractC1668700tWe abstractC1668700tWe, long j, long j2, long j3, float f, AbstractC1695860uES abstractC1695860uES, C1685400txa c1685400txa, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.LL.LIZJ.LJIIZILJ(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), LJIILL(this, abstractC1668700tWe, abstractC1695860uES, f, c1685400txa, i));
    }

    @Override // X.InterfaceC1675870tiD
    public final void LJJLIIIJLLLLLLLZ(AbstractC1668700tWe abstractC1668700tWe, float f, long j, long j2, float f2, AbstractC1695860uES abstractC1695860uES, C1685400txa c1685400txa, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.LL.LIZJ.LJIIL(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j2 & 4294967295L)), -90.0f, f, false, LJIILL(this, abstractC1668700tWe, abstractC1695860uES, f2, c1685400txa, i));
    }

    @Override // X.InterfaceC1675870tiD
    public final void LJLLILLLL(long j, long j2, long j3, long j4, AbstractC1695860uES abstractC1695860uES, float f, C1685400txa c1685400txa, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.LL.LIZJ.LJIIZILJ(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), LIZLLL(this, j, abstractC1695860uES, f, c1685400txa, i));
    }

    @Override // X.InterfaceC1675870tiD
    public final void LJLZ(long j, long j2, long j3, float f, int i, InterfaceC1669090tXH interfaceC1669090tXH, float f2, C1685400txa c1685400txa, int i2) {
        InterfaceC1686290tz1 interfaceC1686290tz1 = this.LL.LIZJ;
        InterfaceC1675870tiD.LLILL.getClass();
        int i3 = C1668240tVu.LIZJ;
        InterfaceC1695240uDS interfaceC1695240uDSLJIJJLI = LJIJJLI();
        long jLJIJJ = LJIJJ(f2, j);
        C1695150uDJ c1695150uDJ = (C1695150uDJ) interfaceC1695240uDSLJIJJLI;
        if (!C1685910tyP.LJ(c1695150uDJ.LIZJ(), jLJIJJ)) {
            c1695150uDJ.LJIIIZ(jLJIJJ);
        }
        if (c1695150uDJ.LIZJ != null) {
            c1695150uDJ.LJIILL(null);
        }
        if (!Intrinsics.LJFF(c1695150uDJ.LIZLLL, c1685400txa)) {
            c1695150uDJ.LJIIJJI(c1685400txa);
        }
        if (c1695150uDJ.LIZIZ != i2) {
            c1695150uDJ.LJIIJ(i2);
        }
        if (c1695150uDJ.LJIJJLI() != f) {
            c1695150uDJ.LJI(f);
        }
        if (c1695150uDJ.LJIJJ() != 4.0f) {
            c1695150uDJ.LJIIIIZZ(4.0f);
        }
        if (c1695150uDJ.LJIIZILJ() != i) {
            c1695150uDJ.LIZLLL(i);
        }
        if (c1695150uDJ.LJIJI() != 0) {
            c1695150uDJ.LJII(0);
        }
        if (!Intrinsics.LJFF(c1695150uDJ.LJ, interfaceC1669090tXH)) {
            c1695150uDJ.LJ(interfaceC1669090tXH);
        }
        if (c1695150uDJ.LJIILLIIL() != i3) {
            c1695150uDJ.LJIIL(i3);
        }
        interfaceC1686290tz1.LJIIJJI(j2, j3, interfaceC1695240uDSLJIJJLI);
    }

    @Override // X.InterfaceC1675870tiD
    public final void LL(AbstractC1668700tWe abstractC1668700tWe, long j, long j2, float f, int i, InterfaceC1669090tXH interfaceC1669090tXH, float f2, C1685400txa c1685400txa, int i2) {
        InterfaceC1686290tz1 interfaceC1686290tz1 = this.LL.LIZJ;
        InterfaceC1675870tiD.LLILL.getClass();
        int i3 = C1668240tVu.LIZJ;
        InterfaceC1695240uDS interfaceC1695240uDSLJIJJLI = LJIJJLI();
        if (abstractC1668700tWe != null) {
            abstractC1668700tWe.LIZ(f2, LIZIZ(), interfaceC1695240uDSLJIJJLI);
        } else {
            C1695150uDJ c1695150uDJ = (C1695150uDJ) interfaceC1695240uDSLJIJJLI;
            if (c1695150uDJ.LIZ() != f2) {
                c1695150uDJ.setAlpha(f2);
            }
        }
        C1695150uDJ c1695150uDJ2 = (C1695150uDJ) interfaceC1695240uDSLJIJJLI;
        if (!Intrinsics.LJFF(c1695150uDJ2.LIZLLL, c1685400txa)) {
            c1695150uDJ2.LJIIJJI(c1685400txa);
        }
        if (c1695150uDJ2.LIZIZ != i2) {
            c1695150uDJ2.LJIIJ(i2);
        }
        if (c1695150uDJ2.LJIJJLI() != f) {
            c1695150uDJ2.LJI(f);
        }
        if (c1695150uDJ2.LJIJJ() != 4.0f) {
            c1695150uDJ2.LJIIIIZZ(4.0f);
        }
        if (c1695150uDJ2.LJIIZILJ() != i) {
            c1695150uDJ2.LIZLLL(i);
        }
        if (c1695150uDJ2.LJIJI() != 0) {
            c1695150uDJ2.LJII(0);
        }
        if (!Intrinsics.LJFF(c1695150uDJ2.LJ, interfaceC1669090tXH)) {
            c1695150uDJ2.LJ(interfaceC1669090tXH);
        }
        if (c1695150uDJ2.LJIILLIIL() != i3) {
            c1695150uDJ2.LJIIL(i3);
        }
        interfaceC1686290tz1.LJIIJJI(j, j2, interfaceC1695240uDSLJIJJLI);
    }

    @Override // X.InterfaceC1675870tiD
    public final void LJJIZ(long j, float f, float f2, boolean z, long j2, long j3, float f3, AbstractC1695860uES abstractC1695860uES, C1685400txa c1685400txa, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.LL.LIZJ.LJIIL(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 & 4294967295L)), f, f2, z, LIZLLL(this, j, abstractC1695860uES, f3, c1685400txa, i));
    }

    @Override // X.InterfaceC1675870tiD
    public final void LJLJLLL(InterfaceC1680820tqC interfaceC1680820tqC, long j, long j2, long j3, long j4, float f, AbstractC1695860uES abstractC1695860uES, C1685400txa c1685400txa, int i, int i2) {
        this.LL.LIZJ.LJI(interfaceC1680820tqC, j, j2, j3, j4, LJIIL(null, abstractC1695860uES, f, c1685400txa, i, i2));
    }
}
