package X;

import android.view.View;
import com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx;

/* JADX INFO: renamed from: X.19ti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21684419ti {
    public int LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public final /* synthetic */ ExposeLinearLayoutManagerEx LIZLLL;

    public final void LIZ() {
        this.LIZIZ = this.LIZJ ? this.LIZLLL.mOrientationHelper.LJFF() : this.LIZLLL.mOrientationHelper.LJII();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AnchorInfo{mPosition=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mCoordinate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mLayoutFromEnd=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C21684419ti(ExposeLinearLayoutManagerEx exposeLinearLayoutManagerEx) {
        this.LIZLLL = exposeLinearLayoutManagerEx;
    }

    public final void LIZIZ(View view) {
        int iLJIIIIZZ;
        if (this.LIZJ) {
            int iLIZ = this.LIZLLL.mOrientationHelper.LIZ(view) + this.LIZLLL.computeAlignOffset(view, this.LIZJ, true);
            AbstractC21684819tm abstractC21684819tm = this.LIZLLL.mOrientationHelper;
            if (Integer.MIN_VALUE == abstractC21684819tm.LIZIZ) {
                iLJIIIIZZ = 0;
            } else {
                iLJIIIIZZ = abstractC21684819tm.LJIIIIZZ() - abstractC21684819tm.LIZIZ;
            }
            this.LIZIZ = iLIZ + iLJIIIIZZ;
        } else {
            this.LIZIZ = this.LIZLLL.mOrientationHelper.LIZLLL(view) + this.LIZLLL.computeAlignOffset(view, this.LIZJ, true);
        }
        this.LIZ = this.LIZLLL.getPosition(view);
    }
}
