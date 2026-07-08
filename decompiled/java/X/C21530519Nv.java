package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.19Nv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21530519Nv extends C21530419Nu {
    public int LJJIFFI;
    public int LJJII;
    public int LJJIIJZLJL;
    public int LJJIIZI;
    public C19OA[] LJJIJL;
    public int LJIILIIL = -1;
    public int LJIILJJIL = -1;
    public int LJIILL = -1;
    public int LJIILLIIL = -1;
    public int LJIIZILJ = -1;
    public int LJIJ = -1;
    public float LJIJI = 0.5f;
    public float LJIJJ = 0.5f;
    public float LJIJJLI = 0.5f;
    public float LJIL = 0.5f;
    public float LJJ = 0.5f;
    public float LJJI = 0.5f;
    public int LJJIII = 2;
    public int LJJIIJ = 2;
    public int LJJIIZ = -1;
    public final ArrayList<C21530619Nw> LJJIJ = new ArrayList<>();
    public C19OA[] LJJIJIIJI = null;
    public C19OA[] LJJIJIIJIL = null;
    public int[] LJJIJIL = null;
    public int LJJIJLIJ = 0;

    public final int LJI(C19OA c19oa, int i) {
        if (c19oa == null) {
            return 0;
        }
        if (c19oa.getVerticalDimensionBehaviour() == C19O3.MATCH_CONSTRAINT) {
            int i2 = c19oa.mMatchConstraintDefaultHeight;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c19oa.mMatchConstraintPercentHeight * i);
                if (i3 != c19oa.getHeight()) {
                    c19oa.mMeasureRequested = true;
                    LJFF(c19oa, c19oa.getHorizontalDimensionBehaviour(), c19oa.getWidth(), C19O3.FIXED, i3);
                }
                return i3;
            }
            if (i2 == 1) {
                return c19oa.getHeight();
            }
            if (i2 == 3) {
                return (int) ((c19oa.getWidth() * c19oa.mDimensionRatio) + 0.5f);
            }
        }
        return c19oa.getHeight();
    }

    public final int LJII(C19OA c19oa, int i) {
        if (c19oa == null) {
            return 0;
        }
        if (c19oa.getHorizontalDimensionBehaviour() == C19O3.MATCH_CONSTRAINT) {
            int i2 = c19oa.mMatchConstraintDefaultWidth;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c19oa.mMatchConstraintPercentWidth * i);
                if (i3 != c19oa.getWidth()) {
                    c19oa.mMeasureRequested = true;
                    LJFF(c19oa, C19O3.FIXED, i3, c19oa.getVerticalDimensionBehaviour(), c19oa.getHeight());
                }
                return i3;
            }
            if (i2 == 1) {
                return c19oa.getWidth();
            }
            if (i2 == 3) {
                return (int) ((c19oa.getHeight() * c19oa.mDimensionRatio) + 0.5f);
            }
        }
        return c19oa.getWidth();
    }

    @Override // X.C19OA
    public final void addToSolver(C21531219Oc c21531219Oc, boolean z) {
        boolean z2;
        boolean z3;
        C19OA c19oa;
        int i;
        super.addToSolver(c21531219Oc, z);
        C19OA c19oa2 = this.mParent;
        if (c19oa2 != null) {
            z2 = ((C19O9) c19oa2).LJ;
        } else {
            z2 = false;
        }
        int i2 = this.LJJIIJZLJL;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2 && this.LJJIJIL != null && this.LJJIJIIJIL != null && this.LJJIJIIJI != null) {
                    for (int i3 = 0; i3 < this.LJJIJLIJ; i3++) {
                        this.LJJIJL[i3].resetAnchors();
                    }
                    int[] iArr = this.LJJIJIL;
                    int i4 = iArr[0];
                    int i5 = iArr[1];
                    C19OA c19oa3 = null;
                    for (int i6 = 0; i6 < i4; i6++) {
                        if (z2) {
                            i = (i4 - i6) - 1;
                        } else {
                            i = i6;
                        }
                        C19OA c19oa4 = this.LJJIJIIJIL[i];
                        if (c19oa4 != null && c19oa4.mVisibility != 8) {
                            if (i6 == 0) {
                                c19oa4.connect(c19oa4.mLeft, this.mLeft, this.LJI);
                                c19oa4.mHorizontalChainStyle = this.LJIILIIL;
                                c19oa4.mHorizontalBiasPercent = this.LJIJI;
                            }
                            if (i6 == i4 - 1) {
                                c19oa4.connect(c19oa4.mRight, this.mRight, this.LJII);
                            }
                            if (i6 > 0) {
                                c19oa4.connect(c19oa4.mLeft, c19oa3.mRight, this.LJJIFFI);
                                c19oa3.connect(c19oa3.mRight, c19oa4.mLeft, 0);
                            }
                            c19oa3 = c19oa4;
                        }
                    }
                    for (int i7 = 0; i7 < i5; i7++) {
                        C19OA c19oa5 = this.LJJIJIIJI[i7];
                        if (c19oa5 != null && c19oa5.mVisibility != 8) {
                            if (i7 == 0) {
                                c19oa5.connect(c19oa5.mTop, this.mTop, this.LIZJ);
                                c19oa5.mVerticalChainStyle = this.LJIILJJIL;
                                c19oa5.mVerticalBiasPercent = this.LJIJJ;
                            }
                            if (i7 == i5 - 1) {
                                c19oa5.connect(c19oa5.mBottom, this.mBottom, this.LIZLLL);
                            }
                            if (i7 > 0) {
                                c19oa5.connect(c19oa5.mTop, c19oa3.mBottom, this.LJJII);
                                c19oa3.connect(c19oa3.mBottom, c19oa5.mTop, 0);
                            }
                            c19oa3 = c19oa5;
                        }
                    }
                    for (int i8 = 0; i8 < i4; i8++) {
                        for (int i9 = 0; i9 < i5; i9++) {
                            int i10 = (i9 * i4) + i8;
                            if (this.LJJIIZI == 1) {
                                i10 = (i8 * i5) + i9;
                            }
                            C19OA[] c19oaArr = this.LJJIJL;
                            if (i10 < c19oaArr.length && (c19oa = c19oaArr[i10]) != null && c19oa.mVisibility != 8) {
                                C19OA c19oa6 = this.LJJIJIIJIL[i8];
                                C19OA c19oa7 = this.LJJIJIIJI[i9];
                                if (c19oa != c19oa6) {
                                    c19oa.connect(c19oa.mLeft, c19oa6.mLeft, 0);
                                    c19oa.connect(c19oa.mRight, c19oa6.mRight, 0);
                                }
                                if (c19oa != c19oa7) {
                                    c19oa.connect(c19oa.mTop, c19oa7.mTop, 0);
                                    c19oa.connect(c19oa.mBottom, c19oa7.mBottom, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size = this.LJJIJ.size();
                for (int i11 = 0; i11 < size; i11++) {
                    C21530619Nw c21530619Nw = (C21530619Nw) ListProtector.get(this.LJJIJ, i11);
                    if (i11 == size - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    c21530619Nw.LIZIZ(i11, z2, z3);
                }
            }
        } else if (this.LJJIJ.size() > 0) {
            ((C21530619Nw) ListProtector.get(this.LJJIJ, 0)).LIZIZ(0, z2, true);
        }
        this.LJIIIIZZ = false;
    }

    @Override // X.C21530019Nq, X.C19OA
    public final void copy(C19OA c19oa, HashMap<C19OA, C19OA> map) {
        super.copy(c19oa, map);
        C21530519Nv c21530519Nv = (C21530519Nv) c19oa;
        this.LJIILIIL = c21530519Nv.LJIILIIL;
        this.LJIILJJIL = c21530519Nv.LJIILJJIL;
        this.LJIILL = c21530519Nv.LJIILL;
        this.LJIILLIIL = c21530519Nv.LJIILLIIL;
        this.LJIIZILJ = c21530519Nv.LJIIZILJ;
        this.LJIJ = c21530519Nv.LJIJ;
        this.LJIJI = c21530519Nv.LJIJI;
        this.LJIJJ = c21530519Nv.LJIJJ;
        this.LJIJJLI = c21530519Nv.LJIJJLI;
        this.LJIL = c21530519Nv.LJIL;
        this.LJJ = c21530519Nv.LJJ;
        this.LJJI = c21530519Nv.LJJI;
        this.LJJIFFI = c21530519Nv.LJJIFFI;
        this.LJJII = c21530519Nv.LJJII;
        this.LJJIII = c21530519Nv.LJJIII;
        this.LJJIIJ = c21530519Nv.LJJIIJ;
        this.LJJIIJZLJL = c21530519Nv.LJJIIJZLJL;
        this.LJJIIZ = c21530519Nv.LJJIIZ;
        this.LJJIIZI = c21530519Nv.LJJIIZI;
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0404  */
    @Override // X.C21530419Nu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(int r43, int r44, int r45, int r46) {
        /*
            Method dump skipped, instruction units count: 1235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21530519Nv.LJ(int, int, int, int):void");
    }
}
