package X;

import android.view.View;

/* JADX INFO: renamed from: X.19tE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21681419tE {
    public AbstractC21679819sy LIZ;
    public int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public final void LIZLLL() {
        this.LIZIZ = -1;
        this.LIZJ = Integer.MIN_VALUE;
        this.LIZLLL = false;
        this.LJ = false;
    }

    public final void LIZ() {
        this.LIZJ = this.LIZLLL ? this.LIZ.LJI() : this.LIZ.LJIIJ();
    }

    public C21681419tE() {
        LIZLLL();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorInfo{mPosition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mCoordinate=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mLayoutFromEnd=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mValid=");
        sbLIZ.append(this.LJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZIZ(int i, View view) {
        if (this.LIZLLL) {
            this.LIZJ = this.LIZ.LIZIZ(view) + this.LIZ.LJIIL();
        } else {
            this.LIZJ = this.LIZ.LJ(view);
        }
        this.LIZIZ = i;
    }

    public final void LIZJ(int i, View view) {
        int iLJIIL = this.LIZ.LJIIL();
        if (iLJIIL >= 0) {
            LIZIZ(i, view);
            return;
        }
        this.LIZIZ = i;
        if (this.LIZLLL) {
            int iLJI = (this.LIZ.LJI() - iLJIIL) - this.LIZ.LIZIZ(view);
            this.LIZJ = this.LIZ.LJI() - iLJI;
            if (iLJI > 0) {
                int iLIZJ = this.LIZJ - this.LIZ.LIZJ(view);
                int iLJIIJ = this.LIZ.LJIIJ();
                int iMin = iLIZJ - (iLJIIJ + Math.min(this.LIZ.LJ(view) - iLJIIJ, 0));
                if (iMin < 0) {
                    this.LIZJ += Math.min(iLJI, -iMin);
                    return;
                }
                return;
            }
            return;
        }
        int iLJ = this.LIZ.LJ(view);
        int iLJIIJ2 = iLJ - this.LIZ.LJIIJ();
        this.LIZJ = iLJ;
        if (iLJIIJ2 <= 0) {
            return;
        }
        int iLJI2 = (this.LIZ.LJI() - Math.min(0, (this.LIZ.LJI() - iLJIIL) - this.LIZ.LIZIZ(view))) - (iLJ + this.LIZ.LIZJ(view));
        if (iLJI2 >= 0) {
            return;
        }
        this.LIZJ -= Math.min(iLJIIJ2, -iLJI2);
    }
}
