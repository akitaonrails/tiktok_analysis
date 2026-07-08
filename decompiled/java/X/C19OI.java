package X;

import com.tts.oecverify.BdTuring;
import java.util.HashMap;

/* JADX INFO: renamed from: X.19OI, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19OI extends C19OA {
    public float LIZ = -1.0f;
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public C19OG LIZLLL = this.mTop;
    public int LJ;
    public boolean LJFF;

    @Override // X.C19OA
    public final boolean allowedInBarrier() {
        return true;
    }

    @Override // X.C19OA
    public final String getType() {
        return "Guideline";
    }

    public C19OI() {
        this.mAnchors.clear();
        this.mAnchors.add(this.LIZLLL);
        int length = this.mListAnchors.length;
        for (int i = 0; i < length; i++) {
            this.mListAnchors[i] = this.LIZLLL;
        }
    }

    @Override // X.C19OA
    public final boolean isResolvedHorizontally() {
        return this.LJFF;
    }

    @Override // X.C19OA
    public final boolean isResolvedVertically() {
        return this.LJFF;
    }

    public final void LIZLLL(int i) {
        this.LIZLLL.LJIIJJI(i);
        this.LJFF = true;
    }

    public final void LJ(int i) {
        if (this.LJ == i) {
            return;
        }
        this.LJ = i;
        this.mAnchors.clear();
        if (this.LJ == 1) {
            this.LIZLLL = this.mLeft;
        } else {
            this.LIZLLL = this.mTop;
        }
        this.mAnchors.add(this.LIZLLL);
        int length = this.mListAnchors.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.mListAnchors[i2] = this.LIZLLL;
        }
    }

    @Override // X.C19OA
    public final C19OG getAnchor(C19OV c19ov) {
        switch (C19OU.LIZ[c19ov.ordinal()]) {
            case 1:
            case 2:
                if (this.LJ == 1) {
                    return this.LIZLLL;
                }
                break;
            case 3:
            case 4:
                if (this.LJ == 0) {
                    return this.LIZLLL;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
                return null;
        }
        throw new AssertionError(c19ov.name());
    }

    @Override // X.C19OA
    public final void addToSolver(C21531219Oc c21531219Oc, boolean z) {
        boolean z2;
        C19OA c19oa = this.mParent;
        if (c19oa == null) {
            return;
        }
        Object anchor = c19oa.getAnchor(C19OV.LEFT);
        Object anchor2 = c19oa.getAnchor(C19OV.RIGHT);
        C19OA c19oa2 = this.mParent;
        boolean z3 = true;
        if (c19oa2 != null && c19oa2.mListDimensionBehaviors[0] == C19O3.WRAP_CONTENT) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.LJ == 0) {
            anchor = c19oa.getAnchor(C19OV.TOP);
            anchor2 = c19oa.getAnchor(C19OV.BOTTOM);
            C19OA c19oa3 = this.mParent;
            if (c19oa3 == null || c19oa3.mListDimensionBehaviors[1] != C19O3.WRAP_CONTENT) {
                z3 = false;
            }
            z2 = z3;
        }
        if (this.LJFF) {
            C19OG c19og = this.LIZLLL;
            if (c19og.LIZJ) {
                C21531519Of c21531519OfLJIIJ = c21531219Oc.LJIIJ(c19og);
                c21531219Oc.LIZLLL(c21531519OfLJIIJ, this.LIZLLL.LIZLLL());
                if (this.LIZIZ != -1) {
                    if (z2) {
                        c21531219Oc.LJFF(c21531219Oc.LJIIJ(anchor2), c21531519OfLJIIJ, 0, 5);
                    }
                } else if (this.LIZJ != -1 && z2) {
                    C21531519Of c21531519OfLJIIJ2 = c21531219Oc.LJIIJ(anchor2);
                    c21531219Oc.LJFF(c21531519OfLJIIJ, c21531219Oc.LJIIJ(anchor), 0, 5);
                    c21531219Oc.LJFF(c21531519OfLJIIJ2, c21531519OfLJIIJ, 0, 5);
                }
                this.LJFF = false;
                return;
            }
        }
        if (this.LIZIZ != -1) {
            C21531519Of c21531519OfLJIIJ3 = c21531219Oc.LJIIJ(this.LIZLLL);
            c21531219Oc.LJ(c21531519OfLJIIJ3, c21531219Oc.LJIIJ(anchor), this.LIZIZ, 8);
            if (z2) {
                c21531219Oc.LJFF(c21531219Oc.LJIIJ(anchor2), c21531519OfLJIIJ3, 0, 5);
                return;
            }
            return;
        }
        if (this.LIZJ != -1) {
            C21531519Of c21531519OfLJIIJ4 = c21531219Oc.LJIIJ(this.LIZLLL);
            C21531519Of c21531519OfLJIIJ5 = c21531219Oc.LJIIJ(anchor2);
            c21531219Oc.LJ(c21531519OfLJIIJ4, c21531519OfLJIIJ5, -this.LIZJ, 8);
            if (!z2) {
                return;
            }
            c21531219Oc.LJFF(c21531519OfLJIIJ4, c21531219Oc.LJIIJ(anchor), 0, 5);
            c21531219Oc.LJFF(c21531519OfLJIIJ5, c21531519OfLJIIJ4, 0, 5);
            return;
        }
        if (this.LIZ == -1.0f) {
            return;
        }
        C21531519Of c21531519OfLJIIJ6 = c21531219Oc.LJIIJ(this.LIZLLL);
        C21531519Of c21531519OfLJIIJ7 = c21531219Oc.LJIIJ(anchor2);
        float f = this.LIZ;
        C21531319Od c21531319OdLJIIJJI = c21531219Oc.LJIIJJI();
        c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519OfLJIIJ6, -1.0f);
        c21531319OdLJIIJJI.LIZLLL.LJIIJ(c21531519OfLJIIJ7, f);
        c21531219Oc.LIZJ(c21531319OdLJIIJJI);
    }

    @Override // X.C19OA
    public final void copy(C19OA c19oa, HashMap<C19OA, C19OA> map) {
        super.copy(c19oa, map);
        C19OI c19oi = (C19OI) c19oa;
        this.LIZ = c19oi.LIZ;
        this.LIZIZ = c19oi.LIZIZ;
        this.LIZJ = c19oi.LIZJ;
        LJ(c19oi.LJ);
    }

    @Override // X.C19OA
    public final void updateFromSolver(C21531219Oc c21531219Oc, boolean z) {
        if (this.mParent == null) {
            return;
        }
        C19OG c19og = this.LIZLLL;
        c21531219Oc.getClass();
        int iLJIILIIL = C21531219Oc.LJIILIIL(c19og);
        if (this.LJ == 1) {
            this.mX = iLJIILIIL;
            this.mY = 0;
            setHeight(this.mParent.getHeight());
            setWidth(0);
            return;
        }
        this.mX = 0;
        this.mY = iLJIILIIL;
        setWidth(this.mParent.getWidth());
        setHeight(0);
    }
}
