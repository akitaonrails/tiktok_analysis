package X;

import android.graphics.Rect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0uFP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696450uFP extends AbstractC20077113h3 {
    public static C1696450uFP LJ;
    public static final EnumC1680400tpW LJFF = EnumC1680400tpW.Rtl;
    public static final EnumC1680400tpW LJI = EnumC1680400tpW.Ltr;
    public C1692150u8T LIZJ;
    public C20068213fc LIZLLL;

    public C1696450uFP() {
        new Rect();
    }

    @Override // X.InterfaceC20077913hB
    public final int[] LIZ(int i) {
        C1692150u8T c1692150u8T;
        int iLJIIIIZZ;
        C1692150u8T c1692150u8T2 = null;
        if (LIZLLL().length() <= 0 || i >= LIZLLL().length()) {
            return null;
        }
        try {
            C20068213fc c20068213fc = this.LIZLLL;
            if (c20068213fc == null) {
                c20068213fc = null;
            }
            C1683130ttv c1683130ttvLJ = c20068213fc.LJ();
            int iRound = Math.round(c1683130ttvLJ.LIZLLL - c1683130ttvLJ.LIZIZ);
            if (i <= 0) {
                i = 0;
            }
            C1692150u8T c1692150u8T3 = this.LIZJ;
            if (c1692150u8T3 == null) {
                c1692150u8T3 = null;
            }
            int iLJII = c1692150u8T3.LJII(i);
            C1692150u8T c1692150u8T4 = this.LIZJ;
            if (c1692150u8T4 == null) {
                c1692150u8T4 = null;
            }
            float fLJIIL = c1692150u8T4.LJIIL(iLJII) + iRound;
            C1692150u8T c1692150u8T5 = this.LIZJ;
            if (c1692150u8T5 == null) {
                c1692150u8T = null;
            } else {
                c1692150u8T = c1692150u8T5;
            }
            if (c1692150u8T5 == null) {
                c1692150u8T5 = null;
            }
            if (fLJIIL < c1692150u8T.LJIIL(c1692150u8T5.LIZIZ.LJFF - 1)) {
                C1692150u8T c1692150u8T6 = this.LIZJ;
                if (c1692150u8T6 != null) {
                    c1692150u8T2 = c1692150u8T6;
                }
                iLJIIIIZZ = c1692150u8T2.LJIIIIZZ(fLJIIL);
            } else {
                C1692150u8T c1692150u8T7 = this.LIZJ;
                if (c1692150u8T7 != null) {
                    c1692150u8T2 = c1692150u8T7;
                }
                iLJIIIIZZ = c1692150u8T2.LIZIZ.LJFF;
            }
            return LIZJ(i, LJ(iLJIIIIZZ - 1, LJI) + 1);
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC20077913hB
    public final int[] LIZIZ(int i) {
        int iLJIIIIZZ;
        C1692150u8T c1692150u8T = null;
        if (LIZLLL().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            C20068213fc c20068213fc = this.LIZLLL;
            if (c20068213fc == null) {
                c20068213fc = null;
            }
            C1683130ttv c1683130ttvLJ = c20068213fc.LJ();
            int iRound = Math.round(c1683130ttvLJ.LIZLLL - c1683130ttvLJ.LIZIZ);
            int length = LIZLLL().length();
            if (length <= i) {
                i = length;
            }
            C1692150u8T c1692150u8T2 = this.LIZJ;
            if (c1692150u8T2 == null) {
                c1692150u8T2 = null;
            }
            int iLJII = c1692150u8T2.LJII(i);
            C1692150u8T c1692150u8T3 = this.LIZJ;
            if (c1692150u8T3 == null) {
                c1692150u8T3 = null;
            }
            float fLJIIL = c1692150u8T3.LJIIL(iLJII) - iRound;
            if (fLJIIL > 0.0f) {
                C1692150u8T c1692150u8T4 = this.LIZJ;
                if (c1692150u8T4 != null) {
                    c1692150u8T = c1692150u8T4;
                }
                iLJIIIIZZ = c1692150u8T.LJIIIIZZ(fLJIIL);
            } else {
                iLJIIIIZZ = 0;
            }
            if (i == LIZLLL().length() && iLJIIIIZZ < iLJII) {
                iLJIIIIZZ++;
            }
            return LIZJ(LJ(iLJIIIIZZ, LJFF), i);
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final int LJ(int i, EnumC1680400tpW enumC1680400tpW) {
        C1692150u8T c1692150u8T = this.LIZJ;
        C1692150u8T c1692150u8T2 = null;
        if (c1692150u8T == null) {
            c1692150u8T = null;
        }
        int iLJIIJJI = c1692150u8T.LJIIJJI(i);
        C1692150u8T c1692150u8T3 = this.LIZJ;
        if (c1692150u8T3 == null) {
            c1692150u8T3 = null;
        }
        if (enumC1680400tpW != c1692150u8T3.LJIILIIL(iLJIIJJI)) {
            C1692150u8T c1692150u8T4 = this.LIZJ;
            if (c1692150u8T4 != null) {
                c1692150u8T2 = c1692150u8T4;
            }
            return c1692150u8T2.LJIIJJI(i);
        }
        C1692150u8T c1692150u8T5 = this.LIZJ;
        if (c1692150u8T5 != null) {
            c1692150u8T2 = c1692150u8T5;
        }
        return c1692150u8T2.LJI(i, false) - 1;
    }
}
