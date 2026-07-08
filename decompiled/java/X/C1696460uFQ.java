package X;

/* JADX INFO: renamed from: X.0uFQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1696460uFQ extends AbstractC20077113h3 {
    public static C1696460uFQ LIZLLL;
    public static final EnumC1680400tpW LJ = EnumC1680400tpW.Rtl;
    public static final EnumC1680400tpW LJFF = EnumC1680400tpW.Ltr;
    public C1692150u8T LIZJ;

    @Override // X.InterfaceC20077913hB
    public final int[] LIZ(int i) {
        int iLJII;
        if (LIZLLL().length() <= 0 || i >= LIZLLL().length()) {
            return null;
        }
        if (i < 0) {
            C1692150u8T c1692150u8T = this.LIZJ;
            if (c1692150u8T == null) {
                c1692150u8T = null;
            }
            iLJII = c1692150u8T.LJII(0);
        } else {
            C1692150u8T c1692150u8T2 = this.LIZJ;
            if (c1692150u8T2 == null) {
                c1692150u8T2 = null;
            }
            iLJII = c1692150u8T2.LJII(i);
            if (LJ(iLJII, LJ) != i) {
                iLJII++;
            }
        }
        C1692150u8T c1692150u8T3 = this.LIZJ;
        if (c1692150u8T3 == null) {
            c1692150u8T3 = null;
        }
        if (iLJII >= c1692150u8T3.LIZIZ.LJFF) {
            return null;
        }
        return LIZJ(LJ(iLJII, LJ), LJ(iLJII, LJFF) + 1);
    }

    @Override // X.InterfaceC20077913hB
    public final int[] LIZIZ(int i) {
        int iLJII;
        if (LIZLLL().length() <= 0 || i <= 0) {
            return null;
        }
        if (i > LIZLLL().length()) {
            C1692150u8T c1692150u8T = this.LIZJ;
            if (c1692150u8T == null) {
                c1692150u8T = null;
            }
            iLJII = c1692150u8T.LJII(LIZLLL().length());
        } else {
            C1692150u8T c1692150u8T2 = this.LIZJ;
            if (c1692150u8T2 == null) {
                c1692150u8T2 = null;
            }
            iLJII = c1692150u8T2.LJII(i);
            if (LJ(iLJII, LJFF) + 1 != i) {
                iLJII--;
            }
        }
        if (iLJII < 0) {
            return null;
        }
        return LIZJ(LJ(iLJII, LJ), LJ(iLJII, LJFF) + 1);
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
