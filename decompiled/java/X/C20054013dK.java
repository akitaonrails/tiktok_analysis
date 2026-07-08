package X;

/* JADX INFO: renamed from: X.13dK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20054013dK {
    public final C20053713dH LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public int LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public int LJIILJJIL;
    public C20053613dG LJIILLIIL;
    public EnumC20047813cK LIZLLL = EnumC20047813cK.Idle;
    public final C20053813dI LJIILL = new C20053813dI(this);

    public final void LJI() {
        boolean z;
        C20053713dH c20053713dHLJJIJIL;
        C20053813dI c20053813dI = this.LJIILL;
        if (!(c20053813dI.LLJJIJIIJIL == null && c20053813dI.LJJZ().LJJJ() == null) && c20053813dI.LLJJIJI) {
            c20053813dI.LLJJIJI = false;
            c20053813dI.LLJJIJIIJIL = c20053813dI.LJJZ().LJJJ();
            z = true;
        } else {
            z = false;
        }
        if (z && (c20053713dHLJJIJIL = this.LIZ.LJJIJIL()) != null) {
            C20053713dH.LJJLI(c20053713dHLJJIJIL, false, 7);
        }
        C20053613dG c20053613dG = this.LJIILLIIL;
        if (c20053613dG != null) {
            if (!(c20053613dG.LLJJJJJIL == null && c20053613dG.LJJLJLI().LLIIII().LJJJ() == null) && c20053613dG.LLJJJJ) {
                c20053613dG.LLJJJJ = false;
                c20053613dG.LLJJJJJIL = c20053613dG.LJJLJLI().LLIIII().LJJJ();
                if (C20052113d1.LIZ(this.LIZ)) {
                    C20053713dH c20053713dHLJJIJIL2 = this.LIZ.LJJIJIL();
                    if (c20053713dHLJJIJIL2 != null) {
                        C20053713dH.LJJLI(c20053713dHLJJIJIL2, false, 7);
                        return;
                    }
                    return;
                }
                C20053713dH c20053713dHLJJIJIL3 = this.LIZ.LJJIJIL();
                if (c20053713dHLJJIJIL3 != null) {
                    C20053713dH.LJJJZ(c20053713dHLJJIJIL3, false, 7);
                }
            }
        }
    }

    public C20054013dK(C20053713dH c20053713dH) {
        this.LIZ = c20053713dH;
    }

    public final void LIZ(int i) {
        boolean z;
        C20053713dH c20053713dHLJJIJIL;
        C20054013dK c20054013dK;
        int i2 = this.LJIIJJI;
        this.LJIIJJI = i;
        boolean z2 = false;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2 && (c20053713dHLJJIJIL = this.LIZ.LJJIJIL()) != null && (c20054013dK = c20053713dHLJJIJIL.LLJLLL) != null) {
            if (i == 0) {
                c20054013dK.LIZ(c20054013dK.LJIIJJI - 1);
            } else {
                c20054013dK.LIZ(c20054013dK.LJIIJJI + 1);
            }
        }
    }

    public final void LIZIZ(int i) {
        boolean z;
        C20053713dH c20053713dHLJJIJIL;
        C20054013dK c20054013dK;
        int i2 = this.LJIILJJIL;
        this.LJIILJJIL = i;
        boolean z2 = false;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 0) {
            z2 = true;
        }
        if (z != z2 && (c20053713dHLJJIJIL = this.LIZ.LJJIJIL()) != null && (c20054013dK = c20053713dHLJJIJIL.LLJLLL) != null) {
            if (i == 0) {
                c20054013dK.LIZIZ(c20054013dK.LJIILJJIL - 1);
            } else {
                c20054013dK.LIZIZ(c20054013dK.LJIILJJIL + 1);
            }
        }
    }

    public final void LIZJ(boolean z) {
        if (this.LJIIJ != z) {
            this.LJIIJ = z;
            if (z) {
                if (!this.LJIIIZ) {
                    LIZ(this.LJIIJJI + 1);
                }
            } else {
                if (this.LJIIIZ) {
                    return;
                }
                LIZ(this.LJIIJJI - 1);
            }
        }
    }

    public final void LIZLLL(boolean z) {
        if (this.LJIIIZ != z) {
            this.LJIIIZ = z;
            if (z) {
                if (!this.LJIIJ) {
                    LIZ(this.LJIIJJI + 1);
                }
            } else {
                if (this.LJIIJ) {
                    return;
                }
                LIZ(this.LJIIJJI - 1);
            }
        }
    }

    public final void LJ(boolean z) {
        if (this.LJIILIIL != z) {
            this.LJIILIIL = z;
            if (z) {
                if (!this.LJIIL) {
                    LIZIZ(this.LJIILJJIL + 1);
                }
            } else {
                if (this.LJIIL) {
                    return;
                }
                LIZIZ(this.LJIILJJIL - 1);
            }
        }
    }

    public final void LJFF(boolean z) {
        if (this.LJIIL != z) {
            this.LJIIL = z;
            if (z) {
                if (!this.LJIILIIL) {
                    LIZIZ(this.LJIILJJIL + 1);
                }
            } else {
                if (this.LJIILIIL) {
                    return;
                }
                LIZIZ(this.LJIILJJIL - 1);
            }
        }
    }
}
