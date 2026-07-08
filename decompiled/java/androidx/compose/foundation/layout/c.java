package androidx.compose.foundation.layout;

import X.C1296870jqv;
import X.C1296880jqw;
import X.C1668040tVa;
import X.C1683950tvF;
import X.C1684360tvu;
import X.EnumC1683990tvJ;
import X.InterfaceC1666960tTq;
import X.InterfaceC1668050tVb;
import X.InterfaceC1685750ty9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class c {
    public static final FillElement LIZ = new FillElement(EnumC1683990tvJ.Horizontal, 1.0f);
    public static final FillElement LIZIZ = new FillElement(EnumC1683990tvJ.Vertical, 1.0f);
    public static final FillElement LIZJ = new FillElement(EnumC1683990tvJ.Both, 1.0f);
    public static final WrapContentElement LIZLLL;
    public static final WrapContentElement LJ;
    public static final WrapContentElement LJFF;
    public static final WrapContentElement LJI;
    public static final WrapContentElement LJII;
    public static final WrapContentElement LJIIIIZZ;

    static {
        InterfaceC1668050tVb.LIZ.getClass();
        LIZLLL = C1683950tvF.LIZJ(C1668040tVa.LJIILJJIL, false);
        LJ = C1683950tvF.LIZJ(C1668040tVa.LJIILIIL, false);
        LJFF = C1683950tvF.LIZ(C1668040tVa.LJIIJJI, false);
        LJI = C1683950tvF.LIZ(C1668040tVa.LJIIJ, false);
        LJII = C1683950tvF.LIZIZ(C1668040tVa.LJFF, false);
        LJIIIIZZ = C1683950tvF.LIZIZ(C1668040tVa.LIZIZ, false);
    }

    public static InterfaceC1685750ty9 LIZLLL(InterfaceC1685750ty9 interfaceC1685750ty9) {
        return interfaceC1685750ty9.LIZ(LIZJ);
    }

    public static final InterfaceC1685750ty9 LIZIZ(InterfaceC1685750ty9 interfaceC1685750ty9, float f) {
        FillElement fillElement;
        if (f == 1.0f) {
            fillElement = LIZIZ;
        } else {
            fillElement = new FillElement(EnumC1683990tvJ.Vertical, f);
        }
        return interfaceC1685750ty9.LIZ(fillElement);
    }

    public static final InterfaceC1685750ty9 LJ(InterfaceC1685750ty9 interfaceC1685750ty9, float f) {
        FillElement fillElement;
        if (f == 1.0f) {
            fillElement = LIZ;
        } else {
            fillElement = new FillElement(EnumC1683990tvJ.Horizontal, f);
        }
        return interfaceC1685750ty9.LIZ(fillElement);
    }

    public static final InterfaceC1685750ty9 LJI(InterfaceC1685750ty9 interfaceC1685750ty9, float f) {
        return interfaceC1685750ty9.LIZ(new SizeElement(0.0f, f, 0.0f, f, true, C1684360tvu.LIZ, 5));
    }

    public static final InterfaceC1685750ty9 LJIIIZ(InterfaceC1685750ty9 interfaceC1685750ty9, float f) {
        return interfaceC1685750ty9.LIZ(new SizeElement(0.0f, f, 0.0f, f, false, C1684360tvu.LIZ, 5));
    }

    public static final InterfaceC1685750ty9 LJIIJ(InterfaceC1685750ty9 interfaceC1685750ty9, float f) {
        return interfaceC1685750ty9.LIZ(new SizeElement(f, f, f, f, false, C1684360tvu.LIZ));
    }

    public static final InterfaceC1685750ty9 LJIILIIL(InterfaceC1685750ty9 interfaceC1685750ty9, float f) {
        return interfaceC1685750ty9.LIZ(new SizeElement(f, f, f, f, true, C1684360tvu.LIZ));
    }

    public static final InterfaceC1685750ty9 LJIILLIIL(InterfaceC1685750ty9 interfaceC1685750ty9, float f) {
        return interfaceC1685750ty9.LIZ(new SizeElement(f, 0.0f, f, 0.0f, true, C1684360tvu.LIZ, 10));
    }

    public static final InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2) {
        return interfaceC1685750ty9.LIZ(new UnspecifiedConstraintsElement(f, f2));
    }

    public static final InterfaceC1685750ty9 LJII(InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2) {
        return interfaceC1685750ty9.LIZ(new SizeElement(0.0f, f, 0.0f, f2, true, C1684360tvu.LIZ, 5));
    }

    public static final InterfaceC1685750ty9 LJIIJJI(InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2) {
        return interfaceC1685750ty9.LIZ(new SizeElement(f, f2, f, f2, false, C1684360tvu.LIZ));
    }

    public static final InterfaceC1685750ty9 LJIILJJIL(InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2) {
        return interfaceC1685750ty9.LIZ(new SizeElement(f, f2, f, f2, true, C1684360tvu.LIZ));
    }

    public static final InterfaceC1685750ty9 LJIIZILJ(InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2) {
        return interfaceC1685750ty9.LIZ(new SizeElement(f, 0.0f, f2, 0.0f, true, C1684360tvu.LIZ, 10));
    }

    public static InterfaceC1685750ty9 LJIJI(InterfaceC1685750ty9 interfaceC1685750ty9, C1296880jqw c1296880jqw, int i) {
        WrapContentElement wrapContentElementLIZ;
        if ((i & 1) != 0) {
            InterfaceC1668050tVb.LIZ.getClass();
            c1296880jqw = C1668040tVa.LJIIJJI;
        }
        InterfaceC1668050tVb.LIZ.getClass();
        if (Intrinsics.LJFF(c1296880jqw, C1668040tVa.LJIIJJI)) {
            wrapContentElementLIZ = LJFF;
        } else if (Intrinsics.LJFF(c1296880jqw, C1668040tVa.LJIIJ)) {
            wrapContentElementLIZ = LJI;
        } else {
            wrapContentElementLIZ = C1683950tvF.LIZ(c1296880jqw, false);
        }
        return interfaceC1685750ty9.LIZ(wrapContentElementLIZ);
    }

    public static InterfaceC1685750ty9 LJIJJ(InterfaceC1685750ty9 interfaceC1685750ty9, C1296870jqv c1296870jqv, int i) {
        WrapContentElement wrapContentElementLIZIZ;
        if ((i & 1) != 0) {
            InterfaceC1668050tVb.LIZ.getClass();
            c1296870jqv = C1668040tVa.LJFF;
        }
        InterfaceC1668050tVb.LIZ.getClass();
        if (Intrinsics.LJFF(c1296870jqv, C1668040tVa.LJFF)) {
            wrapContentElementLIZIZ = LJII;
        } else if (Intrinsics.LJFF(c1296870jqv, C1668040tVa.LIZIZ)) {
            wrapContentElementLIZIZ = LJIIIIZZ;
        } else {
            wrapContentElementLIZIZ = C1683950tvF.LIZIZ(c1296870jqv, false);
        }
        return interfaceC1685750ty9.LIZ(wrapContentElementLIZIZ);
    }

    public static final InterfaceC1685750ty9 LJIJJLI(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1666960tTq interfaceC1666960tTq, boolean z) {
        WrapContentElement wrapContentElementLIZJ;
        InterfaceC1668050tVb.LIZ.getClass();
        if (Intrinsics.LJFF(interfaceC1666960tTq, C1668040tVa.LJIILJJIL) && !z) {
            wrapContentElementLIZJ = LIZLLL;
        } else if (Intrinsics.LJFF(interfaceC1666960tTq, C1668040tVa.LJIILIIL) && !z) {
            wrapContentElementLIZJ = LJ;
        } else {
            wrapContentElementLIZJ = C1683950tvF.LIZJ(interfaceC1666960tTq, z);
        }
        return interfaceC1685750ty9.LIZ(wrapContentElementLIZJ);
    }

    public static InterfaceC1685750ty9 LJIIIIZZ(InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        return LJII(interfaceC1685750ty9, f, f2);
    }

    public static InterfaceC1685750ty9 LJIJ(InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = Float.NaN;
        }
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        return LJIIZILJ(interfaceC1685750ty9, f, f2);
    }

    public static final InterfaceC1685750ty9 LJIILL(InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2, float f3, float f4) {
        return interfaceC1685750ty9.LIZ(new SizeElement(f, f2, f3, f4, true, C1684360tvu.LIZ));
    }

    public static InterfaceC1685750ty9 LJIIL(InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2, float f3, float f4, int i) {
        float f5 = f4;
        float f6 = f3;
        float f7 = f2;
        float f8 = f;
        if ((i & 1) != 0) {
            f8 = Float.NaN;
        }
        if ((i & 2) != 0) {
            f7 = Float.NaN;
        }
        if ((i & 4) != 0) {
            f6 = Float.NaN;
        }
        if ((i & 8) != 0) {
            f5 = Float.NaN;
        }
        return interfaceC1685750ty9.LIZ(new SizeElement(f8, f7, f6, f5, false, C1684360tvu.LIZ));
    }
}
