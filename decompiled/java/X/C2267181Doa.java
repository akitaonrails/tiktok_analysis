package X;

/* JADX INFO: renamed from: X.1Doa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2267181Doa extends C2267291Dol {
    public final boolean LJJLIL = true;
    public boolean LJJLJ;

    public static final int LJJIJLIJ() {
        return 0;
    }

    @Override // X.C2267081DoQ
    public final boolean LIZLLL() {
        return true;
    }

    public final boolean LJJIJL() {
        int i;
        boolean z = true;
        int i2 = 0;
        while (true) {
            i = this.LJJLIIJ;
            if (i2 >= i) {
                break;
            }
            C2267081DoQ c2267081DoQ = this.LJJLIIIJLLLLLLLZ[i2];
            if ((this.LJJLIL || c2267081DoQ.LIZLLL()) && !c2267081DoQ.LJIJJLI()) {
                z = false;
            }
            i2++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMin = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < this.LJJLIIJ; i3++) {
            C2267081DoQ c2267081DoQ2 = this.LJJLIIIJLLLLLLLZ[i3];
            if (this.LJJLIL || c2267081DoQ2.LIZLLL()) {
                if (!z2) {
                    iMin = c2267081DoQ2.LJI(EnumC2266931DoB.LEFT).LIZJ();
                    z2 = true;
                }
                iMin = Math.min(iMin, c2267081DoQ2.LJI(EnumC2266931DoB.LEFT).LIZJ());
            }
        }
        LJJII(iMin, iMin);
        this.LJJLJ = true;
        return true;
    }

    @Override // X.C2267081DoQ
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Barrier] ");
        sbLIZ.append(this.LJJLI);
        sbLIZ.append(" {");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        for (int i = 0; i < this.LJJLIIJ; i++) {
            C2267081DoQ c2267081DoQ = this.LJJLIIIJLLLLLLLZ[i];
            if (i > 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(", ");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(c2267081DoQ.LJJLI);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLIZIZ);
        sbLIZ4.append("}");
        return C2188811AlT.LIZIZ(sbLIZ4);
    }

    @Override // X.C2267081DoQ
    public final boolean LJIJJLI() {
        return this.LJJLJ;
    }

    @Override // X.C2267081DoQ
    public final boolean LJIL() {
        return this.LJJLJ;
    }

    @Override // X.C2267081DoQ
    public final void LIZJ(C21536919Qh c21536919Qh, boolean z) {
        C2267141DoW[] c2267141DoWArr;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        C2267141DoW[] c2267141DoWArr2 = this.LJJJ;
        c2267141DoWArr2[0] = this.LJJIJ;
        c2267141DoWArr2[2] = this.LJJIJIIJI;
        c2267141DoWArr2[1] = this.LJJIJIIJIL;
        c2267141DoWArr2[3] = this.LJJIJIL;
        int i3 = 0;
        while (true) {
            c2267141DoWArr = this.LJJJ;
            if (i3 >= c2267141DoWArr.length) {
                break;
            }
            C2267141DoW c2267141DoW = c2267141DoWArr[i3];
            c2267141DoW.LJIIIIZZ = c21536919Qh.LJIIJ(c2267141DoW);
            i3++;
        }
        C2267141DoW c2267141DoW2 = c2267141DoWArr[0];
        if (!this.LJJLJ) {
            LJJIJL();
        }
        if (this.LJJLJ) {
            this.LJJLJ = false;
            c21536919Qh.LIZLLL(this.LJJIJ.LJIIIIZZ, this.LJJJJLI);
            c21536919Qh.LIZLLL(this.LJJIJIIJIL.LJIIIIZZ, this.LJJJJLI);
            return;
        }
        int i4 = 0;
        while (true) {
            if (i4 < this.LJJLIIJ) {
                C2267081DoQ c2267081DoQ = this.LJJLIIIJLLLLLLLZ[i4];
                if ((!this.LJJLIL && !c2267081DoQ.LIZLLL()) || c2267081DoQ.LJJJJ[0] != EnumC2266981DoG.MATCH_CONSTRAINT || c2267081DoQ.LJJIJ.LJFF == null || c2267081DoQ.LJJIJIIJIL.LJFF == null) {
                    i4++;
                } else {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (!this.LJJIJ.LJ() && !this.LJJIJIIJIL.LJ()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!this.LJJIJIIJI.LJ()) {
            this.LJJIJIL.LJ();
        }
        if (!z2 && z3) {
            i = 5;
        } else {
            i = 4;
        }
        for (int i5 = 0; i5 < this.LJJLIIJ; i5++) {
            C2267081DoQ c2267081DoQ2 = this.LJJLIIIJLLLLLLLZ[i5];
            if (this.LJJLIL || c2267081DoQ2.LIZLLL()) {
                C21537019Qi c21537019QiLJIIJ = c21536919Qh.LJIIJ(c2267081DoQ2.LJJJ[0]);
                C2267141DoW c2267141DoW3 = c2267081DoQ2.LJJJ[0];
                c2267141DoW3.LJIIIIZZ = c21537019QiLJIIJ;
                C2267141DoW c2267141DoW4 = c2267141DoW3.LJFF;
                if (c2267141DoW4 != null && c2267141DoW4.LIZLLL == this) {
                    i2 = c2267141DoW3.LJI;
                } else {
                    i2 = 0;
                }
                C21536819Qg c21536819QgLJIIJJI = c21536919Qh.LJIIJJI();
                C21537019Qi c21537019QiLJIIL = c21536919Qh.LJIIL();
                c21537019QiLJIIL.LLILZ = 0;
                c21536819QgLJIIJJI.LIZLLL(c2267141DoW2.LJIIIIZZ, c21537019QiLJIIJ, c21537019QiLJIIL, -i2);
                c21536919Qh.LIZJ(c21536819QgLJIIJJI);
                c21536919Qh.LJ(c2267141DoW2.LJIIIIZZ, c21537019QiLJIIJ, 0 + i2, i);
            }
        }
        c21536919Qh.LJ(this.LJJIJIIJIL.LJIIIIZZ, this.LJJIJ.LJIIIIZZ, 0, 8);
        c21536919Qh.LJ(this.LJJIJ.LJIIIIZZ, this.LJJJJI.LJJIJIIJIL.LJIIIIZZ, 0, 4);
        c21536919Qh.LJ(this.LJJIJ.LJIIIIZZ, this.LJJJJI.LJJIJ.LJIIIIZZ, 0, 0);
    }
}
