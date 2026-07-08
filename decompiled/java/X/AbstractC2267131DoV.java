package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.1DoV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2267131DoV implements InterfaceC2267401Dow {
    public int LIZ;
    public C2267081DoQ LIZIZ;
    public C2267331Dop LIZJ;
    public EnumC2266981DoG LIZLLL;
    public final C2267281Dok LJ = new C2267281Dok(this);
    public int LJFF = 0;
    public boolean LJI = false;
    public final C2267191Dob LJII = new C2267191Dob(this);
    public final C2267191Dob LJIIIIZZ = new C2267191Dob(this);
    public C18JX LJIIIZ = C18JX.NONE;

    @Override // X.InterfaceC2267401Dow
    public void LIZ(InterfaceC2267401Dow interfaceC2267401Dow) {
    }

    public abstract void LIZLLL();

    public abstract void LJ();

    public AbstractC2267131DoV(C2267081DoQ c2267081DoQ) {
        this.LIZIZ = c2267081DoQ;
    }

    public static C2267191Dob LJI(C2267141DoW c2267141DoW) {
        C2267141DoW c2267141DoW2 = c2267141DoW.LJFF;
        if (c2267141DoW2 == null) {
            return null;
        }
        C2267081DoQ c2267081DoQ = c2267141DoW2.LIZLLL;
        int i = C2266961DoE.LIZ[c2267141DoW2.LJ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return c2267081DoQ.LJ.LJIIIIZZ;
                    }
                    return c2267081DoQ.LJ.LJIIJ;
                }
                return c2267081DoQ.LJ.LJII;
            }
            return c2267081DoQ.LIZLLL.LJIIIIZZ;
        }
        return c2267081DoQ.LIZLLL.LJII;
    }

    public static C2267191Dob LJII(C2267141DoW c2267141DoW, int i) {
        AbstractC2267131DoV abstractC2267131DoV;
        C2267141DoW c2267141DoW2 = c2267141DoW.LJFF;
        if (c2267141DoW2 == null) {
            return null;
        }
        C2267081DoQ c2267081DoQ = c2267141DoW2.LIZLLL;
        if (i == 0) {
            abstractC2267131DoV = c2267081DoQ.LIZLLL;
        } else {
            abstractC2267131DoV = c2267081DoQ.LJ;
        }
        int i2 = C2266961DoE.LIZ[c2267141DoW2.LJ.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return abstractC2267131DoV.LJIIIIZZ;
        }
        return abstractC2267131DoV.LJII;
    }

    public final int LJFF(int i, int i2) {
        if (i2 == 0) {
            C2267081DoQ c2267081DoQ = this.LIZIZ;
            int i3 = c2267081DoQ.LJIL;
            int iMax = Math.max(c2267081DoQ.LJIJJLI, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            C2267081DoQ c2267081DoQ2 = this.LIZIZ;
            int i4 = c2267081DoQ2.LJJIFFI;
            int iMax2 = Math.max(c2267081DoQ2.LJJI, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public static void LIZIZ(C2267191Dob c2267191Dob, C2267191Dob c2267191Dob2, int i) {
        ((ArrayList) c2267191Dob.LJIIJJI).add(c2267191Dob2);
        c2267191Dob.LJFF = i;
        ((ArrayList) c2267191Dob2.LJIIJ).add(c2267191Dob);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.C2267141DoW r16, X.C2267141DoW r17, int r18) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC2267131DoV.LJIIIIZZ(X.1DoW, X.1DoW, int):void");
    }

    public final void LIZJ(C2267191Dob c2267191Dob, C2267191Dob c2267191Dob2, int i, C2267281Dok c2267281Dok) {
        ((ArrayList) c2267191Dob.LJIIJJI).add(c2267191Dob2);
        ((ArrayList) c2267191Dob.LJIIJJI).add(this.LJ);
        c2267191Dob.LJII = i;
        c2267191Dob.LJIIIIZZ = c2267281Dok;
        ((ArrayList) c2267191Dob2.LJIIJ).add(c2267191Dob);
        ((ArrayList) c2267281Dok.LJIIJ).add(c2267191Dob);
    }
}
