package X;

/* JADX INFO: renamed from: X.1DoZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2267171DoZ extends C2267081DoQ {
    public float LJJLIIIJLLLLLLLZ = -1.0f;
    public int LJJLIIJ = -1;
    public int LJJLIL = -1;
    public C2267141DoW LJJLJ = this.LJJIJIIJI;
    public boolean LJJLJLI;

    @Override // X.C2267081DoQ
    public final boolean LIZLLL() {
        return true;
    }

    public C2267171DoZ() {
        this.LJJJI.clear();
        this.LJJJI.add(this.LJJLJ);
        int length = this.LJJJ.length;
        for (int i = 0; i < length; i++) {
            this.LJJJ[i] = this.LJJLJ;
        }
    }

    @Override // X.C2267081DoQ
    public final boolean LJIJJLI() {
        return this.LJJLJLI;
    }

    @Override // X.C2267081DoQ
    public final boolean LJIL() {
        return this.LJJLJLI;
    }

    @Override // X.C2267081DoQ
    public final C2267141DoW LJI(EnumC2266931DoB enumC2266931DoB) {
        int i = C2266951DoD.LIZ[enumC2266931DoB.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                return null;
            }
            return this.LJJLJ;
        }
        return null;
    }

    public final void LJJIJIIJIL(int i) {
        this.LJJLJ.LJIIIIZZ(i);
        this.LJJLJLI = true;
    }

    @Override // X.C2267081DoQ
    public final void LIZJ(C21536919Qh c21536919Qh, boolean z) {
        C2267271Doj c2267271Doj = this.LJJJJI;
        if (c2267271Doj == null) {
            return;
        }
        c2267271Doj.LJI(EnumC2266931DoB.LEFT);
        c2267271Doj.LJI(EnumC2266931DoB.RIGHT);
        C2267271Doj c2267271Doj2 = this.LJJJJI;
        boolean z2 = true;
        Object objLJI = c2267271Doj.LJI(EnumC2266931DoB.TOP);
        Object objLJI2 = c2267271Doj.LJI(EnumC2266931DoB.BOTTOM);
        C2267271Doj c2267271Doj3 = this.LJJJJI;
        if (c2267271Doj3 == null || c2267271Doj3.LJJJJ[1] != EnumC2266981DoG.WRAP_CONTENT) {
            z2 = false;
        }
        if (this.LJJLJLI) {
            C2267141DoW c2267141DoW = this.LJJLJ;
            if (c2267141DoW.LIZJ) {
                C21537019Qi c21537019QiLJIIJ = c21536919Qh.LJIIJ(c2267141DoW);
                c21536919Qh.LIZLLL(c21537019QiLJIIJ, this.LJJLJ.LIZJ());
                if (this.LJJLIIJ != -1) {
                    if (z2) {
                        c21536919Qh.LJFF(c21536919Qh.LJIIJ(objLJI2), c21537019QiLJIIJ, 0, 5);
                    }
                } else if (this.LJJLIL != -1 && z2) {
                    C21537019Qi c21537019QiLJIIJ2 = c21536919Qh.LJIIJ(objLJI2);
                    c21536919Qh.LJFF(c21537019QiLJIIJ, c21536919Qh.LJIIJ(objLJI), 0, 5);
                    c21536919Qh.LJFF(c21537019QiLJIIJ2, c21537019QiLJIIJ, 0, 5);
                }
                this.LJJLJLI = false;
                return;
            }
        }
        if (this.LJJLIIJ != -1) {
            C21537019Qi c21537019QiLJIIJ3 = c21536919Qh.LJIIJ(this.LJJLJ);
            c21536919Qh.LJ(c21537019QiLJIIJ3, c21536919Qh.LJIIJ(objLJI), this.LJJLIIJ, 8);
            if (z2) {
                c21536919Qh.LJFF(c21536919Qh.LJIIJ(objLJI2), c21537019QiLJIIJ3, 0, 5);
                return;
            }
            return;
        }
        if (this.LJJLIL != -1) {
            C21537019Qi c21537019QiLJIIJ4 = c21536919Qh.LJIIJ(this.LJJLJ);
            C21537019Qi c21537019QiLJIIJ5 = c21536919Qh.LJIIJ(objLJI2);
            c21536919Qh.LJ(c21537019QiLJIIJ4, c21537019QiLJIIJ5, -this.LJJLIL, 8);
            if (!z2) {
                return;
            }
            c21536919Qh.LJFF(c21537019QiLJIIJ4, c21536919Qh.LJIIJ(objLJI), 0, 5);
            c21536919Qh.LJFF(c21537019QiLJIIJ5, c21537019QiLJIIJ4, 0, 5);
            return;
        }
        if (this.LJJLIIIJLLLLLLLZ == -1.0f) {
            return;
        }
        C21537019Qi c21537019QiLJIIJ6 = c21536919Qh.LJIIJ(this.LJJLJ);
        C21537019Qi c21537019QiLJIIJ7 = c21536919Qh.LJIIJ(objLJI2);
        float f = this.LJJLIIIJLLLLLLLZ;
        C21536819Qg c21536819QgLJIIJJI = c21536919Qh.LJIIJJI();
        c21536819QgLJIIJJI.LIZLLL.LJI(c21537019QiLJIIJ6, -1.0f);
        c21536819QgLJIIJJI.LIZLLL.LJI(c21537019QiLJIIJ7, f);
        c21536919Qh.LIZJ(c21536819QgLJIIJJI);
    }

    @Override // X.C2267081DoQ
    public final void LJJIJIIJI(C21536919Qh c21536919Qh, boolean z) {
        if (this.LJJJJI == null) {
            return;
        }
        C2267141DoW c2267141DoW = this.LJJLJ;
        c21536919Qh.getClass();
        int iLJIILIIL = C21536919Qh.LJIILIIL(c2267141DoW);
        this.LJJJJLI = 0;
        this.LJJJJLL = iLJIILIIL;
        LJJIIZI(this.LJJJJI.LJIIJJI());
        LJJIIJ(0);
    }
}
