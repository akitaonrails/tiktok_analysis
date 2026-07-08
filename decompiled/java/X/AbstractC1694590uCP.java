package X;

import X.AbstractC1694590uCP;

/* JADX INFO: renamed from: X.0uCP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1694590uCP<T extends AbstractC1694590uCP<T>> {
    public final C1692220u8a LIZ;
    public final long LIZIZ;
    public final C1692150u8T LIZJ;
    public final InterfaceC1692600u9C LIZLLL;
    public final C1694460uCC LJ;
    public long LJFF;
    public final C1692220u8a LJI;

    public final Integer LIZ() {
        C1692150u8T c1692150u8T = this.LIZJ;
        if (c1692150u8T == null) {
            return null;
        }
        return Integer.valueOf(this.LIZLLL.LIZIZ(c1692150u8T.LJI(c1692150u8T.LJII(this.LIZLLL.LIZ(C1692280u8g.LJFF(this.LJFF))), true)));
    }

    public final Integer LIZIZ() {
        C1692150u8T c1692150u8T = this.LIZJ;
        if (c1692150u8T == null) {
            return null;
        }
        return Integer.valueOf(this.LIZLLL.LIZIZ(c1692150u8T.LJIIJJI(c1692150u8T.LJII(this.LIZLLL.LIZ(C1692280u8g.LJI(this.LJFF))))));
    }

    public final Integer LIZJ() {
        int length;
        C1692150u8T c1692150u8T = this.LIZJ;
        if (c1692150u8T == null) {
            return null;
        }
        int iLJJ = LJJ();
        while (true) {
            if (iLJJ < this.LIZ.length()) {
                int length2 = this.LJI.LLILLJJLI.length() - 1;
                if (iLJJ <= length2) {
                    length2 = iLJJ;
                }
                long jLJIILL = c1692150u8T.LJIILL(length2);
                if (C1692280u8g.LIZLLL(jLJIILL) > iLJJ) {
                    length = this.LIZLLL.LIZIZ(C1692280u8g.LIZLLL(jLJIILL));
                    break;
                }
                iLJJ++;
            } else {
                length = this.LIZ.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer LIZLLL() {
        int iLIZIZ;
        C1692150u8T c1692150u8T = this.LIZJ;
        if (c1692150u8T == null) {
            return null;
        }
        int iLJJ = LJJ();
        while (true) {
            if (iLJJ <= 0) {
                iLIZIZ = 0;
                break;
            }
            int length = this.LJI.LLILLJJLI.length() - 1;
            if (iLJJ <= length) {
                length = iLJJ;
            }
            long jLJIILL = c1692150u8T.LJIILL(length);
            int i = C1692280u8g.LIZJ;
            int i2 = (int) (jLJIILL >> 32);
            if (i2 < iLJJ) {
                iLIZIZ = this.LIZLLL.LIZIZ(i2);
                break;
            }
            iLJJ--;
        }
        return Integer.valueOf(iLIZIZ);
    }

    public final boolean LJ() {
        C1692150u8T c1692150u8T = this.LIZJ;
        return (c1692150u8T != null ? c1692150u8T.LJIILIIL(LJJ()) : null) != EnumC1680400tpW.Rtl;
    }

    public final void LJI() {
        this.LJ.LIZ = null;
        if (this.LJI.LLILLJJLI.length() > 0) {
            if (LJ()) {
                LJIIJJI();
            } else {
                LJIIIIZZ();
            }
        }
    }

    public final void LJII() {
        this.LJ.LIZ = null;
        if (this.LJI.LLILLJJLI.length() > 0) {
            if (LJ()) {
                LJIILIIL();
            } else {
                LJIIJ();
            }
        }
    }

    public final void LJIIIIZZ() {
        this.LJ.LIZ = null;
        if (this.LJI.LLILLJJLI.length() > 0) {
            int iLIZ = C21402818pO.LIZ(C1692280u8g.LIZLLL(this.LJFF), this.LJI.LLILLJJLI);
            if (iLIZ != -1) {
                LJIL(iLIZ, iLIZ);
            }
        }
    }

    public final void LJIIIZ() {
        this.LJ.LIZ = null;
        if (this.LJI.LLILLJJLI.length() > 0) {
            int iLIZ = C1692490u91.LIZ(C1692280u8g.LJFF(this.LJFF), this.LJI.LLILLJJLI);
            if (iLIZ == C1692280u8g.LJFF(this.LJFF) && iLIZ != this.LJI.LLILLJJLI.length()) {
                iLIZ = C1692490u91.LIZ(iLIZ + 1, this.LJI.LLILLJJLI);
            }
            LJIL(iLIZ, iLIZ);
        }
    }

    public final void LJIIJ() {
        Integer numLIZJ;
        this.LJ.LIZ = null;
        if (this.LJI.LLILLJJLI.length() <= 0 || (numLIZJ = LIZJ()) == null) {
            return;
        }
        int iIntValue = numLIZJ.intValue();
        LJIL(iIntValue, iIntValue);
    }

    public final void LJIIJJI() {
        this.LJ.LIZ = null;
        if (this.LJI.LLILLJJLI.length() > 0) {
            int iLIZIZ = C21402818pO.LIZIZ(C1692280u8g.LIZLLL(this.LJFF), this.LJI.LLILLJJLI);
            if (iLIZIZ != -1) {
                LJIL(iLIZIZ, iLIZIZ);
            }
        }
    }

    public final void LJIIL() {
        this.LJ.LIZ = null;
        if (this.LJI.LLILLJJLI.length() > 0) {
            int iLIZIZ = C1692490u91.LIZIZ(C1692280u8g.LJI(this.LJFF), this.LJI.LLILLJJLI);
            if (iLIZIZ == C1692280u8g.LJI(this.LJFF) && iLIZIZ != 0) {
                iLIZIZ = C1692490u91.LIZIZ(iLIZIZ - 1, this.LJI.LLILLJJLI);
            }
            LJIL(iLIZIZ, iLIZIZ);
        }
    }

    public final void LJIILIIL() {
        Integer numLIZLLL;
        this.LJ.LIZ = null;
        if (this.LJI.LLILLJJLI.length() <= 0 || (numLIZLLL = LIZLLL()) == null) {
            return;
        }
        int iIntValue = numLIZLLL.intValue();
        LJIL(iIntValue, iIntValue);
    }

    public final void LJIILJJIL() {
        this.LJ.LIZ = null;
        if (this.LJI.LLILLJJLI.length() > 0) {
            if (LJ()) {
                LJIIIIZZ();
            } else {
                LJIIJJI();
            }
        }
    }

    public final void LJIILL() {
        this.LJ.LIZ = null;
        if (this.LJI.LLILLJJLI.length() > 0) {
            if (LJ()) {
                LJIIJ();
            } else {
                LJIILIIL();
            }
        }
    }

    public final void LJIILLIIL() {
        this.LJ.LIZ = null;
        if (this.LJI.LLILLJJLI.length() > 0) {
            int length = this.LJI.LLILLJJLI.length();
            LJIL(length, length);
        }
    }

    public final void LJIIZILJ() {
        Integer numLIZ;
        this.LJ.LIZ = null;
        if (this.LJI.LLILLJJLI.length() <= 0 || (numLIZ = LIZ()) == null) {
            return;
        }
        int iIntValue = numLIZ.intValue();
        LJIL(iIntValue, iIntValue);
    }

    public final void LJIJ() {
        this.LJ.LIZ = null;
        if (this.LJI.LLILLJJLI.length() > 0) {
            if (LJ()) {
                LJIJJ();
            } else {
                LJIIZILJ();
            }
        }
    }

    public final void LJIJI() {
        this.LJ.LIZ = null;
        if (this.LJI.LLILLJJLI.length() > 0) {
            if (LJ()) {
                LJIIZILJ();
            } else {
                LJIJJ();
            }
        }
    }

    public final void LJIJJ() {
        Integer numLIZIZ;
        this.LJ.LIZ = null;
        if (this.LJI.LLILLJJLI.length() <= 0 || (numLIZIZ = LIZIZ()) == null) {
            return;
        }
        int iIntValue = numLIZIZ.intValue();
        LJIL(iIntValue, iIntValue);
    }

    public final void LJIJJLI() {
        if (this.LJI.LLILLJJLI.length() > 0) {
            long j = this.LIZIZ;
            int i = C1692280u8g.LIZJ;
            this.LJFF = C1680680tpy.LIZ((int) (j >> 32), C1692280u8g.LIZLLL(this.LJFF));
        }
    }

    public final int LJJ() {
        return this.LIZLLL.LIZ(C1692280u8g.LIZLLL(this.LJFF));
    }

    public final int LJFF(C1692150u8T c1692150u8T, int i) {
        int iLJJ = LJJ();
        C1694460uCC c1694460uCC = this.LJ;
        if (c1694460uCC.LIZ == null) {
            c1694460uCC.LIZ = Float.valueOf(c1692150u8T.LIZJ(iLJJ).LIZ);
        }
        int iLJII = c1692150u8T.LJII(iLJJ) + i;
        if (iLJII < 0) {
            return 0;
        }
        if (iLJII >= c1692150u8T.LIZIZ.LJFF) {
            return this.LJI.LLILLJJLI.length();
        }
        float fLJFF = c1692150u8T.LJFF(iLJII) - 1;
        Float f = this.LJ.LIZ;
        float fFloatValue = f.floatValue();
        if ((LJ() && fFloatValue >= c1692150u8T.LJIIJ(iLJII)) || (!LJ() && fFloatValue <= c1692150u8T.LJIIIZ(iLJII))) {
            return c1692150u8T.LJI(iLJII, true);
        }
        return this.LIZLLL.LIZIZ(c1692150u8T.LIZIZ.LJI((((long) Float.floatToRawIntBits(f.floatValue())) << 32) | (((long) Float.floatToRawIntBits(fLJFF)) & 4294967295L)));
    }

    public final void LJIL(int i, int i2) {
        this.LJFF = C1680680tpy.LIZ(i, i2);
    }

    public AbstractC1694590uCP(C1692220u8a c1692220u8a, long j, C1692150u8T c1692150u8T, InterfaceC1692600u9C interfaceC1692600u9C, C1694460uCC c1694460uCC) {
        this.LIZ = c1692220u8a;
        this.LIZIZ = j;
        this.LIZJ = c1692150u8T;
        this.LIZLLL = interfaceC1692600u9C;
        this.LJ = c1694460uCC;
        this.LJFF = j;
        this.LJI = c1692220u8a;
    }
}
