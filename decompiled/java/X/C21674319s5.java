package X;

import com.google.android.flexbox.FlexboxLayoutManager;

/* JADX INFO: renamed from: X.19s5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21674319s5 {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public final /* synthetic */ FlexboxLayoutManager LJII;

    public final void LIZIZ() {
        this.LIZ = -1;
        this.LIZIZ = -1;
        this.LIZJ = Integer.MIN_VALUE;
        this.LJFF = false;
        this.LJI = false;
        if (this.LJII.LJIIJJI()) {
            FlexboxLayoutManager flexboxLayoutManager = this.LJII;
            int i = flexboxLayoutManager.LLILLJJLI;
            if (i == 0) {
                this.LJ = flexboxLayoutManager.LL == 1;
                return;
            } else {
                this.LJ = i == 2;
                return;
            }
        }
        FlexboxLayoutManager flexboxLayoutManager2 = this.LJII;
        int i2 = flexboxLayoutManager2.LLILLJJLI;
        if (i2 == 0) {
            this.LJ = flexboxLayoutManager2.LL == 3;
        } else {
            this.LJ = i2 == 2;
        }
    }

    public final void LIZ() {
        if (!this.LJII.LJIIJJI()) {
            FlexboxLayoutManager flexboxLayoutManager = this.LJII;
            if (flexboxLayoutManager.LLILZLL) {
                this.LIZJ = this.LJ ? flexboxLayoutManager.LLJILLL.LJI() : flexboxLayoutManager.getWidth() - this.LJII.LLJILLL.LJIIJ();
                return;
            }
        }
        this.LIZJ = this.LJ ? this.LJII.LLJILLL.LJI() : this.LJII.LLJILLL.LJIIJ();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorInfo{mPosition=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mFlexLinePosition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mCoordinate=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mPerpendicularCoordinate=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mLayoutFromEnd=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", mValid=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", mAssignedFromSavedState=");
        sbLIZ.append(this.LJI);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C21674319s5(FlexboxLayoutManager flexboxLayoutManager) {
        this.LJII = flexboxLayoutManager;
    }
}
