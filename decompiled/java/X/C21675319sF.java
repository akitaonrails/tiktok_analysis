package X;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.19sF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21675319sF {
    public boolean LJFF;
    public int LIZLLL = -1;
    public int LIZ = 0;
    public int LIZIZ = 0;
    public int LIZJ = Integer.MIN_VALUE;
    public Interpolator LJ = null;

    public final void LIZ(RecyclerView recyclerView) {
        int i = this.LIZLLL;
        if (i >= 0) {
            this.LIZLLL = -1;
            recyclerView.jumpToPositionForSmoothScroller(i);
            this.LJFF = false;
        } else if (this.LJFF) {
            Interpolator interpolator = this.LJ;
            if (interpolator != null && this.LIZJ < 1) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i2 = this.LIZJ;
            if (i2 >= 1) {
                recyclerView.mViewFlinger.LIZLLL(this.LIZ, this.LIZIZ, interpolator, i2);
                this.LJFF = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
    }

    public final void LIZIZ(int i, int i2, Interpolator interpolator, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LJ = interpolator;
        this.LJFF = true;
    }
}
