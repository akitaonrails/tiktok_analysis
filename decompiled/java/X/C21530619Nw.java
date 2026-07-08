package X;

/* JADX INFO: renamed from: X.19Nw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21530619Nw {
    public int LIZ;
    public C19OA LIZIZ;
    public int LIZJ;
    public C19OG LIZLLL;
    public C19OG LJ;
    public C19OG LJFF;
    public C19OG LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public final /* synthetic */ C21530519Nv LJIIZILJ;

    public final int LIZJ() {
        return this.LIZ == 1 ? this.LJIIL - this.LJIIZILJ.LJJII : this.LJIIL;
    }

    public final int LIZLLL() {
        return this.LIZ == 0 ? this.LJIIJJI - this.LJIIZILJ.LJJIFFI : this.LJIIJJI;
    }

    public final void LIZ(C19OA c19oa) {
        int i = 0;
        if (this.LIZ == 0) {
            int iLJII = this.LJIIZILJ.LJII(c19oa, this.LJIILLIIL);
            if (c19oa.getHorizontalDimensionBehaviour() == C19O3.MATCH_CONSTRAINT) {
                this.LJIILL++;
                iLJII = 0;
            }
            C21530519Nv c21530519Nv = this.LJIIZILJ;
            int i2 = c21530519Nv.LJJIFFI;
            if (c19oa.mVisibility != 8) {
                i = i2;
            }
            this.LJIIJJI += iLJII + i;
            int iLJI = c21530519Nv.LJI(c19oa, this.LJIILLIIL);
            if (this.LIZIZ == null || this.LIZJ < iLJI) {
                this.LIZIZ = c19oa;
                this.LIZJ = iLJI;
                this.LJIIL = iLJI;
            }
        } else {
            int iLJII2 = this.LJIIZILJ.LJII(c19oa, this.LJIILLIIL);
            int iLJI2 = this.LJIIZILJ.LJI(c19oa, this.LJIILLIIL);
            if (c19oa.getVerticalDimensionBehaviour() == C19O3.MATCH_CONSTRAINT) {
                this.LJIILL++;
                iLJI2 = 0;
            }
            int i3 = this.LJIIZILJ.LJJII;
            if (c19oa.mVisibility != 8) {
                i = i3;
            }
            this.LJIIL += iLJI2 + i;
            if (this.LIZIZ == null || this.LIZJ < iLJII2) {
                this.LIZIZ = c19oa;
                this.LIZJ = iLJII2;
                this.LJIIJJI = iLJII2;
            }
        }
        this.LJIILJJIL++;
    }

    public final void LJ(int i) {
        int i2 = this.LJIILL;
        if (i2 == 0) {
            return;
        }
        int i3 = this.LJIILJJIL;
        int i4 = i / i2;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = this.LJIILIIL;
            int i7 = i6 + i5;
            C21530519Nv c21530519Nv = this.LJIIZILJ;
            if (i7 >= c21530519Nv.LJJIJLIJ) {
                break;
            }
            C19OA c19oa = c21530519Nv.LJJIJL[i6 + i5];
            if (this.LIZ == 0) {
                if (c19oa != null && c19oa.getHorizontalDimensionBehaviour() == C19O3.MATCH_CONSTRAINT && c19oa.mMatchConstraintDefaultWidth == 0) {
                    this.LJIIZILJ.LJFF(c19oa, C19O3.FIXED, i4, c19oa.getVerticalDimensionBehaviour(), c19oa.getHeight());
                }
            } else if (c19oa != null && c19oa.getVerticalDimensionBehaviour() == C19O3.MATCH_CONSTRAINT && c19oa.mMatchConstraintDefaultHeight == 0) {
                this.LJIIZILJ.LJFF(c19oa, c19oa.getHorizontalDimensionBehaviour(), c19oa.getWidth(), C19O3.FIXED, i4);
            }
        }
        this.LJIIJJI = 0;
        this.LJIIL = 0;
        this.LIZIZ = null;
        this.LIZJ = 0;
        int i8 = this.LJIILJJIL;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = this.LJIILIIL + i9;
            C21530519Nv c21530519Nv2 = this.LJIIZILJ;
            if (i10 < c21530519Nv2.LJJIJLIJ) {
                C19OA c19oa2 = c21530519Nv2.LJJIJL[i10];
                if (this.LIZ == 0) {
                    int width = c19oa2.getWidth();
                    C21530519Nv c21530519Nv3 = this.LJIIZILJ;
                    int i11 = c21530519Nv3.LJJIFFI;
                    if (c19oa2.mVisibility == 8) {
                        i11 = 0;
                    }
                    this.LJIIJJI += width + i11;
                    int iLJI = c21530519Nv3.LJI(c19oa2, this.LJIILLIIL);
                    if (this.LIZIZ == null || this.LIZJ < iLJI) {
                        this.LIZIZ = c19oa2;
                        this.LIZJ = iLJI;
                        this.LJIIL = iLJI;
                    }
                } else {
                    int iLJII = c21530519Nv2.LJII(c19oa2, this.LJIILLIIL);
                    int iLJI2 = this.LJIIZILJ.LJI(c19oa2, this.LJIILLIIL);
                    int i12 = this.LJIIZILJ.LJJII;
                    if (c19oa2.mVisibility == 8) {
                        i12 = 0;
                    }
                    this.LJIIL += iLJI2 + i12;
                    if (this.LIZIZ == null || this.LIZJ < iLJII) {
                        this.LIZIZ = c19oa2;
                        this.LIZJ = iLJII;
                        this.LJIIJJI = iLJII;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21530619Nw.LIZIZ(int, boolean, boolean):void");
    }

    public C21530619Nw(C21530519Nv c21530519Nv, int i, C19OG c19og, C19OG c19og2, C19OG c19og3, C19OG c19og4, int i2) {
        this.LJIIZILJ = c21530519Nv;
        this.LIZ = i;
        this.LIZLLL = c19og;
        this.LJ = c19og2;
        this.LJFF = c19og3;
        this.LJI = c19og4;
        this.LJII = c21530519Nv.LJI;
        this.LJIIIIZZ = c21530519Nv.LIZJ;
        this.LJIIIZ = c21530519Nv.LJII;
        this.LJIIJ = c21530519Nv.LIZLLL;
        this.LJIILLIIL = i2;
    }

    public final void LJFF(int i, C19OG c19og, C19OG c19og2, C19OG c19og3, C19OG c19og4, int i2, int i3, int i4, int i5, int i6) {
        this.LIZ = i;
        this.LIZLLL = c19og;
        this.LJ = c19og2;
        this.LJFF = c19og3;
        this.LJI = c19og4;
        this.LJII = i2;
        this.LJIIIIZZ = i3;
        this.LJIIIZ = i4;
        this.LJIIJ = i5;
        this.LJIILLIIL = i6;
    }
}
