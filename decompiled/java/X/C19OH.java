package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.19OH, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19OH extends C21530019Nq {
    public int LIZJ;
    public boolean LIZLLL = true;
    public int LJ;
    public boolean LJFF;

    public final boolean LJ() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.LIZIZ;
            if (i4 >= i) {
                break;
            }
            C19OA c19oa = this.LIZ[i4];
            if ((this.LIZLLL || c19oa.allowedInBarrier()) && ((((i2 = this.LIZJ) == 0 || i2 == 1) && !c19oa.isResolvedHorizontally()) || (((i3 = this.LIZJ) == 2 || i3 == 3) && !c19oa.isResolvedVertically()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.LIZIZ; i5++) {
            C19OA c19oa2 = this.LIZ[i5];
            if (this.LIZLLL || c19oa2.allowedInBarrier()) {
                if (!z2) {
                    int i6 = this.LIZJ;
                    if (i6 == 0) {
                        iMax = c19oa2.getAnchor(C19OV.LEFT).LIZLLL();
                    } else if (i6 == 1) {
                        iMax = c19oa2.getAnchor(C19OV.RIGHT).LIZLLL();
                    } else if (i6 == 2) {
                        iMax = c19oa2.getAnchor(C19OV.TOP).LIZLLL();
                    } else if (i6 == 3) {
                        iMax = c19oa2.getAnchor(C19OV.BOTTOM).LIZLLL();
                    }
                    z2 = true;
                }
                int i7 = this.LIZJ;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c19oa2.getAnchor(C19OV.LEFT).LIZLLL());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c19oa2.getAnchor(C19OV.RIGHT).LIZLLL());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c19oa2.getAnchor(C19OV.TOP).LIZLLL());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c19oa2.getAnchor(C19OV.BOTTOM).LIZLLL());
                }
            }
        }
        int i8 = iMax + this.LJ;
        int i9 = this.LIZJ;
        if (i9 == 0 || i9 == 1) {
            setFinalHorizontal(i8, i8);
        } else {
            setFinalVertical(i8, i8);
        }
        this.LJFF = true;
        return true;
    }

    @Override // X.C19OA
    public final boolean allowedInBarrier() {
        return true;
    }

    public final int LJFF() {
        int i = this.LIZJ;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // X.C19OA
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Barrier] ");
        sbLIZ.append(this.mDebugName);
        sbLIZ.append(" {");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        for (int i = 0; i < this.LIZIZ; i++) {
            C19OA c19oa = this.LIZ[i];
            if (i > 0) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(", ");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(c19oa.mDebugName);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(strLIZIZ);
        sbLIZ4.append("}");
        return C2188811AlT.LIZIZ(sbLIZ4);
    }

    @Override // X.C19OA
    public final boolean isResolvedHorizontally() {
        return this.LJFF;
    }

    @Override // X.C19OA
    public final boolean isResolvedVertically() {
        return this.LJFF;
    }

    @Override // X.C19OA
    public final void addToSolver(C21531219Oc c21531219Oc, boolean z) {
        C19OG[] c19ogArr;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C19OG[] c19ogArr2 = this.mListAnchors;
        c19ogArr2[0] = this.mLeft;
        c19ogArr2[2] = this.mTop;
        c19ogArr2[1] = this.mRight;
        c19ogArr2[3] = this.mBottom;
        int i6 = 0;
        while (true) {
            c19ogArr = this.mListAnchors;
            if (i6 >= c19ogArr.length) {
                break;
            }
            C19OG c19og = c19ogArr[i6];
            c19og.LJIIIIZZ = c21531219Oc.LJIIJ(c19og);
            i6++;
        }
        int i7 = this.LIZJ;
        if (i7 >= 0 && i7 < 4) {
            C19OG c19og2 = c19ogArr[i7];
            if (!this.LJFF) {
                LJ();
            }
            if (this.LJFF) {
                this.LJFF = false;
                int i8 = this.LIZJ;
                if (i8 != 0 && i8 != 1) {
                    if (i8 == 2 || i8 == 3) {
                        c21531219Oc.LIZLLL(this.mTop.LJIIIIZZ, this.mY);
                        c21531219Oc.LIZLLL(this.mBottom.LJIIIIZZ, this.mY);
                        return;
                    }
                    return;
                }
                c21531219Oc.LIZLLL(this.mLeft.LJIIIIZZ, this.mX);
                c21531219Oc.LIZLLL(this.mRight.LJIIIIZZ, this.mX);
                return;
            }
            for (int i9 = 0; i9 < this.LIZIZ; i9++) {
                C19OA c19oa = this.LIZ[i9];
                if ((this.LIZLLL || c19oa.allowedInBarrier()) && ((((i4 = this.LIZJ) == 0 || i4 == 1) && c19oa.getHorizontalDimensionBehaviour() == C19O3.MATCH_CONSTRAINT && c19oa.mLeft.LJFF != null && c19oa.mRight.LJFF != null) || (((i5 = this.LIZJ) == 2 || i5 == 3) && c19oa.getVerticalDimensionBehaviour() == C19O3.MATCH_CONSTRAINT && c19oa.mTop.LJFF != null && c19oa.mBottom.LJFF != null))) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            if (!this.mLeft.LJI() && !this.mRight.LJI()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!this.mTop.LJI() && !this.mBottom.LJI()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z2 || ((i3 = this.LIZJ) != 0 ? i3 != 2 ? i3 != 1 ? i3 != 3 || !z4 : !z3 : !z4 : !z3)) {
                i = 4;
            } else {
                i = 5;
            }
            for (int i10 = 0; i10 < this.LIZIZ; i10++) {
                C19OA c19oa2 = this.LIZ[i10];
                if (this.LIZLLL || c19oa2.allowedInBarrier()) {
                    C21531519Of c21531519OfLJIIJ = c21531219Oc.LJIIJ(c19oa2.mListAnchors[this.LIZJ]);
                    C19OG[] c19ogArr3 = c19oa2.mListAnchors;
                    int i11 = this.LIZJ;
                    C19OG c19og3 = c19ogArr3[i11];
                    c19og3.LJIIIIZZ = c21531519OfLJIIJ;
                    C19OG c19og4 = c19og3.LJFF;
                    if (c19og4 != null && c19og4.LIZLLL == this) {
                        i2 = c19og3.LJI;
                    } else {
                        i2 = 0;
                    }
                    if (i11 != 0 && i11 != 2) {
                        C21531519Of c21531519Of = c19og2.LJIIIIZZ;
                        int i12 = this.LJ + i2;
                        C21531319Od c21531319OdLJIIJJI = c21531219Oc.LJIIJJI();
                        C21531519Of c21531519OfLJIIL = c21531219Oc.LJIIL();
                        c21531519OfLJIIL.LJ = 0;
                        c21531319OdLJIIJJI.LIZJ(c21531519Of, c21531519OfLJIIJ, c21531519OfLJIIL, i12);
                        c21531219Oc.LIZJ(c21531319OdLJIIJJI);
                    } else {
                        C21531519Of c21531519Of2 = c19og2.LJIIIIZZ;
                        int i13 = this.LJ - i2;
                        C21531319Od c21531319OdLJIIJJI2 = c21531219Oc.LJIIJJI();
                        C21531519Of c21531519OfLJIIL2 = c21531219Oc.LJIIL();
                        c21531519OfLJIIL2.LJ = 0;
                        c21531319OdLJIIJJI2.LIZLLL(c21531519Of2, c21531519OfLJIIJ, c21531519OfLJIIL2, i13);
                        c21531219Oc.LIZJ(c21531319OdLJIIJJI2);
                    }
                    c21531219Oc.LJ(c19og2.LJIIIIZZ, c21531519OfLJIIJ, this.LJ + i2, i);
                }
            }
            int i14 = this.LIZJ;
            if (i14 == 0) {
                c21531219Oc.LJ(this.mRight.LJIIIIZZ, this.mLeft.LJIIIIZZ, 0, 8);
                c21531219Oc.LJ(this.mLeft.LJIIIIZZ, this.mParent.mRight.LJIIIIZZ, 0, 4);
                c21531219Oc.LJ(this.mLeft.LJIIIIZZ, this.mParent.mLeft.LJIIIIZZ, 0, 0);
                return;
            }
            if (i14 == 1) {
                c21531219Oc.LJ(this.mLeft.LJIIIIZZ, this.mRight.LJIIIIZZ, 0, 8);
                c21531219Oc.LJ(this.mLeft.LJIIIIZZ, this.mParent.mLeft.LJIIIIZZ, 0, 4);
                c21531219Oc.LJ(this.mLeft.LJIIIIZZ, this.mParent.mRight.LJIIIIZZ, 0, 0);
            } else if (i14 == 2) {
                c21531219Oc.LJ(this.mBottom.LJIIIIZZ, this.mTop.LJIIIIZZ, 0, 8);
                c21531219Oc.LJ(this.mTop.LJIIIIZZ, this.mParent.mBottom.LJIIIIZZ, 0, 4);
                c21531219Oc.LJ(this.mTop.LJIIIIZZ, this.mParent.mTop.LJIIIIZZ, 0, 0);
            } else {
                if (i14 != 3) {
                    return;
                }
                c21531219Oc.LJ(this.mTop.LJIIIIZZ, this.mBottom.LJIIIIZZ, 0, 8);
                c21531219Oc.LJ(this.mTop.LJIIIIZZ, this.mParent.mTop.LJIIIIZZ, 0, 4);
                c21531219Oc.LJ(this.mTop.LJIIIIZZ, this.mParent.mBottom.LJIIIIZZ, 0, 0);
            }
        }
    }

    @Override // X.C21530019Nq, X.C19OA
    public final void copy(C19OA c19oa, HashMap<C19OA, C19OA> map) {
        super.copy(c19oa, map);
        C19OH c19oh = (C19OH) c19oa;
        this.LIZJ = c19oh.LIZJ;
        this.LIZLLL = c19oh.LIZLLL;
        this.LJ = c19oh.LJ;
    }
}
