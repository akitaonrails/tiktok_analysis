package X;

import java.util.ArrayList;

/* JADX INFO: renamed from: X.19OD, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19OD extends C19OF {
    public static final int[] LJIIJ = new int[2];

    @Override // X.C19OF
    public final void LJFF() {
        this.LIZJ = null;
        this.LJII.LIZJ();
        this.LJIIIIZZ.LIZJ();
        this.LJ.LIZJ();
        this.LJI = false;
    }

    public final void LJIILIIL() {
        this.LJI = false;
        this.LJII.LIZJ();
        this.LJII.LJIIIZ = false;
        this.LJIIIIZZ.LIZJ();
        this.LJIIIIZZ.LJIIIZ = false;
        this.LJ.LJIIIZ = false;
    }

    @Override // X.C19OF
    public final void LIZLLL() {
        C19OA c19oa;
        C19OA c19oa2;
        C19OA c19oa3;
        C19OA c19oa4 = this.LIZIZ;
        if (c19oa4.measured) {
            this.LJ.LIZLLL(c19oa4.getWidth());
        }
        if (this.LJ.LJIIIZ) {
            C19O3 c19o3 = this.LIZLLL;
            C19O3 c19o32 = C19O3.MATCH_PARENT;
            if (c19o3 == c19o32 && (((c19oa = this.LIZIZ.mParent) != null && c19oa.getHorizontalDimensionBehaviour() == C19O3.FIXED) || c19oa.getHorizontalDimensionBehaviour() == c19o32)) {
                C19OF.LIZIZ(this.LJII, c19oa.horizontalRun.LJII, this.LIZIZ.mLeft.LJ());
                C19OF.LIZIZ(this.LJIIIIZZ, c19oa.horizontalRun.LJIIIIZZ, -this.LIZIZ.mRight.LJ());
                return;
            }
        } else {
            C19O3 horizontalDimensionBehaviour = this.LIZIZ.getHorizontalDimensionBehaviour();
            this.LIZLLL = horizontalDimensionBehaviour;
            if (horizontalDimensionBehaviour != C19O3.MATCH_CONSTRAINT) {
                C19O3 c19o33 = C19O3.MATCH_PARENT;
                if (horizontalDimensionBehaviour == c19o33 && (((c19oa3 = this.LIZIZ.mParent) != null && c19oa3.getHorizontalDimensionBehaviour() == C19O3.FIXED) || c19oa3.getHorizontalDimensionBehaviour() == c19o33)) {
                    int width = (c19oa3.getWidth() - this.LIZIZ.mLeft.LJ()) - this.LIZIZ.mRight.LJ();
                    C19OF.LIZIZ(this.LJII, c19oa3.horizontalRun.LJII, this.LIZIZ.mLeft.LJ());
                    C19OF.LIZIZ(this.LJIIIIZZ, c19oa3.horizontalRun.LJIIIIZZ, -this.LIZIZ.mRight.LJ());
                    this.LJ.LIZLLL(width);
                    return;
                }
                if (this.LIZLLL == C19O3.FIXED) {
                    this.LJ.LIZLLL(this.LIZIZ.getWidth());
                }
            }
        }
        C19OX c19ox = this.LJ;
        if (c19ox.LJIIIZ) {
            C19OA c19oa5 = this.LIZIZ;
            if (c19oa5.measured) {
                C19OG[] c19ogArr = c19oa5.mListAnchors;
                C19OG c19og = c19ogArr[0];
                if (c19og.LJFF == null) {
                    C19OG c19og2 = c19ogArr[1];
                    if (c19og2.LJFF != null) {
                        C19OL c19olLJII = C19OF.LJII(c19og2);
                        if (c19olLJII != null) {
                            C19OF.LIZIZ(this.LJIIIIZZ, c19olLJII, -this.LIZIZ.mListAnchors[1].LJ());
                            C19OF.LIZIZ(this.LJII, this.LJIIIIZZ, -this.LJ.LJI);
                            return;
                        }
                        return;
                    }
                    if ((c19oa5 instanceof C19MY) || c19oa5.mParent == null || c19oa5.getAnchor(C19OV.CENTER).LJFF != null) {
                        return;
                    }
                    C19OA c19oa6 = this.LIZIZ;
                    C19OF.LIZIZ(this.LJII, c19oa6.mParent.horizontalRun.LJII, c19oa6.getX());
                    C19OF.LIZIZ(this.LJIIIIZZ, this.LJII, this.LJ.LJI);
                    return;
                }
                if (c19ogArr[1].LJFF == null) {
                    C19OL c19olLJII2 = C19OF.LJII(c19og);
                    if (c19olLJII2 != null) {
                        C19OF.LIZIZ(this.LJII, c19olLJII2, this.LIZIZ.mListAnchors[0].LJ());
                        C19OF.LIZIZ(this.LJIIIIZZ, this.LJII, this.LJ.LJI);
                        return;
                    }
                    return;
                }
                if (c19oa5.isInHorizontalChain()) {
                    this.LJII.LJFF = this.LIZIZ.mListAnchors[0].LJ();
                    this.LJIIIIZZ.LJFF = -this.LIZIZ.mListAnchors[1].LJ();
                    return;
                }
                C19OL c19olLJII3 = C19OF.LJII(this.LIZIZ.mListAnchors[0]);
                if (c19olLJII3 != null) {
                    C19OF.LIZIZ(this.LJII, c19olLJII3, this.LIZIZ.mListAnchors[0].LJ());
                }
                C19OL c19olLJII4 = C19OF.LJII(this.LIZIZ.mListAnchors[1]);
                if (c19olLJII4 != null) {
                    C19OF.LIZIZ(this.LJIIIIZZ, c19olLJII4, -this.LIZIZ.mListAnchors[1].LJ());
                }
                this.LJII.LIZIZ = true;
                this.LJIIIIZZ.LIZIZ = true;
                return;
            }
        }
        if (this.LIZLLL == C19O3.MATCH_CONSTRAINT) {
            C19OA c19oa7 = this.LIZIZ;
            int i = c19oa7.mMatchConstraintDefaultWidth;
            if (i == 2) {
                C19OA c19oa8 = c19oa7.mParent;
                if (c19oa8 != null) {
                    C19OX c19ox2 = c19oa8.verticalRun.LJ;
                    ((ArrayList) c19ox.LJIIJJI).add(c19ox2);
                    ((ArrayList) c19ox2.LJIIJ).add(this.LJ);
                    C19OX c19ox3 = this.LJ;
                    c19ox3.LIZIZ = true;
                    ((ArrayList) c19ox3.LJIIJ).add(this.LJII);
                    ((ArrayList) this.LJ.LJIIJ).add(this.LJIIIIZZ);
                }
            } else if (i == 3) {
                if (c19oa7.mMatchConstraintDefaultHeight == 3) {
                    this.LJII.LIZ = this;
                    this.LJIIIIZZ.LIZ = this;
                    C19OE c19oe = c19oa7.verticalRun;
                    c19oe.LJII.LIZ = this;
                    c19oe.LJIIIIZZ.LIZ = this;
                    c19ox.LIZ = this;
                    if (c19oa7.isInVerticalChain()) {
                        ((ArrayList) this.LJ.LJIIJJI).add(this.LIZIZ.verticalRun.LJ);
                        ((ArrayList) this.LIZIZ.verticalRun.LJ.LJIIJ).add(this.LJ);
                        C19OE c19oe2 = this.LIZIZ.verticalRun;
                        c19oe2.LJ.LIZ = this;
                        ((ArrayList) this.LJ.LJIIJJI).add(c19oe2.LJII);
                        ((ArrayList) this.LJ.LJIIJJI).add(this.LIZIZ.verticalRun.LJIIIIZZ);
                        ((ArrayList) this.LIZIZ.verticalRun.LJII.LJIIJ).add(this.LJ);
                        ((ArrayList) this.LIZIZ.verticalRun.LJIIIIZZ.LJIIJ).add(this.LJ);
                    } else if (this.LIZIZ.isInHorizontalChain()) {
                        ((ArrayList) this.LIZIZ.verticalRun.LJ.LJIIJJI).add(this.LJ);
                        ((ArrayList) this.LJ.LJIIJ).add(this.LIZIZ.verticalRun.LJ);
                    } else {
                        ((ArrayList) this.LIZIZ.verticalRun.LJ.LJIIJJI).add(this.LJ);
                    }
                } else {
                    C19OX c19ox4 = c19oa7.verticalRun.LJ;
                    ((ArrayList) c19ox.LJIIJJI).add(c19ox4);
                    ((ArrayList) c19ox4.LJIIJ).add(this.LJ);
                    ((ArrayList) this.LIZIZ.verticalRun.LJII.LJIIJ).add(this.LJ);
                    ((ArrayList) this.LIZIZ.verticalRun.LJIIIIZZ.LJIIJ).add(this.LJ);
                    C19OX c19ox5 = this.LJ;
                    c19ox5.LIZIZ = true;
                    ((ArrayList) c19ox5.LJIIJ).add(this.LJII);
                    ((ArrayList) this.LJ.LJIIJ).add(this.LJIIIIZZ);
                    ((ArrayList) this.LJII.LJIIJJI).add(this.LJ);
                    ((ArrayList) this.LJIIIIZZ.LJIIJJI).add(this.LJ);
                }
            }
        }
        C19OA c19oa9 = this.LIZIZ;
        C19OG[] c19ogArr2 = c19oa9.mListAnchors;
        C19OG c19og3 = c19ogArr2[0];
        if (c19og3.LJFF == null) {
            C19OG c19og4 = c19ogArr2[1];
            if (c19og4.LJFF != null) {
                C19OL c19olLJII5 = C19OF.LJII(c19og4);
                if (c19olLJII5 != null) {
                    C19OF.LIZIZ(this.LJIIIIZZ, c19olLJII5, -this.LIZIZ.mListAnchors[1].LJ());
                    LIZJ(this.LJII, this.LJIIIIZZ, -1, this.LJ);
                    return;
                }
                return;
            }
            if ((c19oa9 instanceof C19MY) || (c19oa2 = c19oa9.mParent) == null) {
                return;
            }
            C19OF.LIZIZ(this.LJII, c19oa2.horizontalRun.LJII, c19oa9.getX());
            LIZJ(this.LJIIIIZZ, this.LJII, 1, this.LJ);
            return;
        }
        if (c19ogArr2[1].LJFF == null) {
            C19OL c19olLJII6 = C19OF.LJII(c19og3);
            if (c19olLJII6 != null) {
                C19OF.LIZIZ(this.LJII, c19olLJII6, this.LIZIZ.mListAnchors[0].LJ());
                LIZJ(this.LJIIIIZZ, this.LJII, 1, this.LJ);
                return;
            }
            return;
        }
        if (c19oa9.isInHorizontalChain()) {
            this.LJII.LJFF = this.LIZIZ.mListAnchors[0].LJ();
            this.LJIIIIZZ.LJFF = -this.LIZIZ.mListAnchors[1].LJ();
            return;
        }
        C19OL c19olLJII7 = C19OF.LJII(this.LIZIZ.mListAnchors[0]);
        C19OL c19olLJII8 = C19OF.LJII(this.LIZIZ.mListAnchors[1]);
        c19olLJII7.LIZIZ(this);
        c19olLJII8.LIZIZ(this);
        this.LJIIIZ = C18JW.CENTER;
    }

    @Override // X.C19OF
    public final void LJ() {
        C19OL c19ol = this.LJII;
        if (c19ol.LJIIIZ) {
            this.LIZIZ.mX = c19ol.LJI;
        }
    }

    @Override // X.C19OF
    public final boolean LJIIJ() {
        return this.LIZLLL != C19O3.MATCH_CONSTRAINT || this.LIZIZ.mMatchConstraintDefaultWidth == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HorizontalRun ");
        sbLIZ.append(this.LIZIZ.mDebugName);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19OD(C19OA c19oa) {
        super(c19oa);
        this.LJII.LJ = C19OW.LEFT;
        this.LJIIIIZZ.LJ = C19OW.RIGHT;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02a2  */
    @Override // X.C19OF, X.InterfaceC21531119Ob
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.InterfaceC21531119Ob r21) {
        /*
            Method dump skipped, instruction units count: 1009
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19OD.LIZ(X.19Ob):void");
    }

    public static void LJIIL(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    iArr[0] = i6;
                    iArr[1] = (int) ((i6 * f) + 0.5f);
                    return;
                }
                return;
            }
            iArr[0] = (int) ((i7 * f) + 0.5f);
            iArr[1] = i7;
            return;
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else {
            if (i9 > i7) {
                return;
            }
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }
}
