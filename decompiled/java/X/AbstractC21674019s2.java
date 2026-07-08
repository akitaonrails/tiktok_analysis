package X;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.19s2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21674019s2 {
    public RecyclerView LIZIZ;
    public RecyclerView.LayoutManager LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public View LJFF;
    public int LIZ = -1;
    public final C21675319sF LJI = new C21675319sF();

    public abstract void LIZLLL(int i, int i2, C21675319sF c21675319sF);

    public abstract void LJ();

    public abstract void LJFF();

    public abstract void LJI(View view, C21673919s1 c21673919s1, C21675319sF c21675319sF);

    public final int LIZIZ() {
        return this.LIZIZ.mLayout.getChildCount();
    }

    public final void LJII() {
        if (this.LJ) {
            this.LJ = false;
            LJFF();
            this.LIZIZ.mState.LIZ = -1;
            this.LJFF = null;
            this.LIZ = -1;
            this.LIZLLL = false;
            this.LIZJ.onSmoothScrollerStopped(this);
            this.LIZJ = null;
            this.LIZIZ = null;
        }
    }

    public PointF LIZ(int i) {
        Object obj = this.LIZJ;
        if (obj instanceof InterfaceC20634915op) {
            return ((InterfaceC20634915op) obj).computeScrollVectorForPosition(i);
        }
        return null;
    }

    public final void LIZJ(int i, int i2) {
        PointF pointFLIZ;
        RecyclerView recyclerView = this.LIZIZ;
        if (this.LIZ == -1 || recyclerView == null) {
            LJII();
        }
        if (this.LIZLLL && this.LJFF == null && this.LIZJ != null && (pointFLIZ = LIZ(this.LIZ)) != null) {
            float f = pointFLIZ.x;
            if (f != 0.0f || pointFLIZ.y != 0.0f) {
                recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(pointFLIZ.y), null);
            }
        }
        boolean z = false;
        this.LIZLLL = false;
        View view = this.LJFF;
        if (view != null) {
            if (this.LIZIZ.getChildLayoutPosition(view) == this.LIZ) {
                LJI(this.LJFF, recyclerView.mState, this.LJI);
                this.LJI.LIZ(recyclerView);
                LJII();
            } else {
                this.LJFF = null;
            }
        }
        if (this.LJ) {
            LIZLLL(i, i2, this.LJI);
            C21675319sF c21675319sF = this.LJI;
            if (c21675319sF.LIZLLL >= 0) {
                z = true;
            }
            c21675319sF.LIZ(recyclerView);
            if (z && this.LJ) {
                this.LIZLLL = true;
                recyclerView.mViewFlinger.LIZJ();
            }
        }
    }
}
