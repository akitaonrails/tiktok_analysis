package X;

import android.graphics.PointF;

/* JADX INFO: renamed from: X.0uCR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694610uCR {
    public static final long LIZLLL(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    public static final boolean LJI(int i) {
        int type = Character.getType(i);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(int i) {
        if (!Character.isWhitespace(i) && i != 160) {
            return false;
        }
        return true;
    }

    public static final boolean LJIIIIZZ(int i) {
        int type;
        if (!LJII(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(C1692150u8T c1692150u8T, int i) {
        int iLJII = c1692150u8T.LJII(i);
        if (i != c1692150u8T.LJIIJJI(iLJII) && i != c1692150u8T.LJI(iLJII, false)) {
            if (c1692150u8T.LIZ(i) != c1692150u8T.LIZ(i - 1)) {
                return true;
            }
            return false;
        }
        if (c1692150u8T.LJIILIIL(i) != c1692150u8T.LIZ(i)) {
            return true;
        }
        return false;
    }

    public static final int LIZ(C1691930u87 c1691930u87, long j, InterfaceC1374305Zl interfaceC1374305Zl) {
        C1692150u8T c1692150u8T;
        C1692200u8Y c1692200u8Y;
        InterfaceC1692950u9l interfaceC1692950u9lLIZJ;
        long jLJIIL;
        int iLJ;
        C1691980u8C c1691980u8CLIZLLL = c1691930u87.LIZLLL();
        if (c1691980u8CLIZLLL == null || (c1692150u8T = c1691980u8CLIZLLL.LIZ) == null || (c1692200u8Y = c1692150u8T.LIZIZ) == null || (interfaceC1692950u9lLIZJ = c1691930u87.LIZJ()) == null || (iLJ = LJ(c1692200u8Y, (jLJIIL = interfaceC1692950u9lLIZJ.LJIIL(j)), interfaceC1374305Zl)) == -1) {
            return -1;
        }
        return c1692200u8Y.LJI(C1378605aS.LIZ((c1692200u8Y.LJFF(iLJ) + c1692200u8Y.LIZIZ(iLJ)) / 2.0f, 1, jLJIIL));
    }

    public static final int LJ(C1692200u8Y c1692200u8Y, long j, InterfaceC1374305Zl interfaceC1374305Zl) {
        float fLJFF;
        if (interfaceC1374305Zl != null) {
            fLJFF = interfaceC1374305Zl.LJFF();
        } else {
            fLJFF = 0.0f;
        }
        int i = (int) (4294967295L & j);
        int iLJ = c1692200u8Y.LJ(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) >= c1692200u8Y.LJFF(iLJ) - fLJFF && Float.intBitsToFloat(i) <= c1692200u8Y.LIZIZ(iLJ) + fLJFF) {
            int i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) >= (-fLJFF) && Float.intBitsToFloat(i2) <= c1692200u8Y.LIZLLL + fLJFF) {
                return iLJ;
            }
        }
        return -1;
    }

    public static final long LJFF(C1691930u87 c1691930u87, C1683130ttv c1683130ttv, int i) {
        C1692200u8Y c1692200u8Y;
        C1692150u8T c1692150u8T;
        C1694720uCc c1694720uCc = C1694710uCb.LIZJ;
        C1691980u8C c1691980u8CLIZLLL = c1691930u87.LIZLLL();
        if (c1691980u8CLIZLLL != null && (c1692150u8T = c1691980u8CLIZLLL.LIZ) != null) {
            c1692200u8Y = c1692150u8T.LIZIZ;
        } else {
            c1692200u8Y = null;
        }
        InterfaceC1692950u9l interfaceC1692950u9lLIZJ = c1691930u87.LIZJ();
        if (c1692200u8Y != null && interfaceC1692950u9lLIZJ != null) {
            return c1692200u8Y.LJII(c1683130ttv.LJIIIZ(interfaceC1692950u9lLIZJ.LJIIL(0L)), i, c1694720uCc);
        }
        return C1692280u8g.LIZIZ;
    }

    public static final long LIZIZ(C1691930u87 c1691930u87, C1683130ttv c1683130ttv, C1683130ttv c1683130ttv2, int i) {
        long jLJFF = LJFF(c1691930u87, c1683130ttv, i);
        if (C1692280u8g.LIZJ(jLJFF)) {
            return C1692280u8g.LIZIZ;
        }
        long jLJFF2 = LJFF(c1691930u87, c1683130ttv2, i);
        if (C1692280u8g.LIZJ(jLJFF2)) {
            return C1692280u8g.LIZIZ;
        }
        int i2 = (int) (jLJFF >> 32);
        return C1680680tpy.LIZ(Math.min(i2, i2), Math.max(C1692280u8g.LIZLLL(jLJFF2), C1692280u8g.LIZLLL(jLJFF2)));
    }
}
