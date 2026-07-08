package X;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.15oo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20634815oo extends AbstractC1338480kw2 {
    public RecyclerView LIZ;
    public final C1349540lDs LIZIZ = new AbstractC1585810rMx() { // from class: X.0lDs
        public boolean LL;

        @Override // X.AbstractC1585810rMx
        public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        }

        @Override // X.AbstractC1585810rMx
        public final void LJJIIJ(RecyclerView recyclerView, int i) {
            if (i == 0) {
                if (!this.LL) {
                    this.LL = this.LLILLJJLI.LIZLLL();
                    return;
                } else {
                    this.LL = false;
                    return;
                }
            }
            if (i != 1) {
                return;
            }
            this.LL = false;
        }
    };

    public abstract int[] LIZIZ(RecyclerView.LayoutManager layoutManager, View view);

    public abstract View LIZJ(RecyclerView.LayoutManager layoutManager);

    public final boolean LIZLLL() {
        RecyclerView.LayoutManager layoutManager;
        View viewLIZJ;
        RecyclerView recyclerView = this.LIZ;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewLIZJ = LIZJ(layoutManager)) == null) {
            return false;
        }
        int[] iArrLIZIZ = LIZIZ(layoutManager, viewLIZJ);
        int i = iArrLIZIZ[0];
        if (i == 0 && iArrLIZIZ[1] == 0) {
            return false;
        }
        this.LIZ.smoothScrollBy(i, iArrLIZIZ[1]);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1338480kw2
    public final boolean LIZ(int i, int i2) {
        RecyclerView.LayoutManager layoutManager;
        C20635215os c20635215os;
        RecyclerView recyclerView;
        View viewLJI;
        int position;
        boolean z;
        boolean z2;
        RecyclerView recyclerView2 = this.LIZ;
        if (recyclerView2 == null || (layoutManager = recyclerView2.getLayoutManager()) == 0 || this.LIZ.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.LIZ.getMinFlingVelocity();
        if ((Math.abs(i2) <= minFlingVelocity && Math.abs(i) <= minFlingVelocity) || !(layoutManager instanceof InterfaceC20634915op) || (recyclerView = (c20635215os = (C20635215os) this).LIZ) == null) {
            return false;
        }
        C20748216Gy c20748216Gy = new C20748216Gy(c20635215os, recyclerView.getContext(), 6);
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0) {
            return false;
        }
        if (layoutManager.canScrollVertically()) {
            viewLJI = C20635215os.LJI(layoutManager, c20635215os.LJIIIIZZ(layoutManager));
        } else {
            if (!layoutManager.canScrollHorizontally()) {
                return false;
            }
            viewLJI = C20635215os.LJI(layoutManager, c20635215os.LJII(layoutManager));
        }
        if (viewLJI == null || (position = layoutManager.getPosition(viewLJI)) == -1) {
            return false;
        }
        if (!layoutManager.canScrollHorizontally() ? i2 > 0 : i > 0) {
            z = true;
        } else {
            z = false;
        }
        PointF pointFComputeScrollVectorForPosition = ((InterfaceC20634915op) layoutManager).computeScrollVectorForPosition(itemCount - 1);
        if (pointFComputeScrollVectorForPosition != null && (pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f)) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = c20635215os.LIZJ;
        int i4 = c20635215os.LIZLLL;
        int i5 = position / (i3 * i4);
        int i6 = i3 * i4;
        int i7 = i5 * i6;
        if (z2) {
            if (z) {
                i7 -= i6;
            }
        } else {
            i7 += i6;
            if (!z) {
                i7--;
            }
        }
        if (i7 == -1) {
            return false;
        }
        c20748216Gy.LIZ = i7;
        layoutManager.startSmoothScroll(c20748216Gy);
        return true;
    }
}
