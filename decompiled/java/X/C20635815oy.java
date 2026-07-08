package X;

import Y.AsS56S0100000_31;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.15oy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20635815oy extends C20635115or {
    public int LJFF;
    public boolean LJI;
    public C21679719sx LJII;
    public C21679619sw LJIIIIZZ;
    public boolean LJIIJJI;
    public RecyclerView LJIIL;
    public int LJIIIZ = -1;
    public int LJIIJ = -1;
    public final AsS56S0100000_31 LJIILIIL = new AsS56S0100000_31(this, 9);

    @Override // X.AbstractC20634115oh
    public final void LIZIZ(RecyclerView recyclerView) {
        if (recyclerView != null) {
            this.LJIIL = recyclerView;
            this.LJIIJJI = C426750GoL.LIZLLL(recyclerView.getContext());
            recyclerView.addOnScrollListener(this.LJIILIIL);
        } else {
            RecyclerView recyclerView2 = this.LJIIL;
            if (recyclerView2 != null) {
                recyclerView2.removeOnScrollListener(this.LJIILIIL);
            }
            this.LJIIL = null;
        }
        super.LIZIZ(recyclerView);
    }

    @Override // X.C20635115or, X.AbstractC20634115oh
    public final View LJFF(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            C21679719sx c21679719sx = this.LJII;
            if (c21679719sx == null) {
                c21679719sx = new C21679719sx(layoutManager);
                this.LJII = c21679719sx;
            }
            return LJIIL(layoutManager, c21679719sx);
        }
        if (layoutManager.canScrollHorizontally()) {
            C21679619sw c21679619sw = this.LJIIIIZZ;
            if (c21679619sw == null) {
                c21679619sw = new C21679619sw(layoutManager);
                this.LJIIIIZZ = c21679619sw;
            }
            return LJIIL(layoutManager, c21679619sw);
        }
        return null;
    }

    @Override // X.C20635115or, X.AbstractC20634115oh
    public final int[] LIZJ(RecyclerView.LayoutManager layoutManager, View view) {
        int iLJ;
        int iLJIIJ;
        int iLJ2;
        int iLJIIJ2;
        int[] iArr = new int[2];
        int i = 0;
        do {
            iArr[i] = 0;
            i++;
        } while (i < 2);
        if (layoutManager.canScrollHorizontally()) {
            C21679619sw c21679619sw = this.LJIIIIZZ;
            if (c21679619sw == null) {
                c21679619sw = new C21679619sw(layoutManager);
                this.LJIIIIZZ = c21679619sw;
            }
            if (this.LJIIJJI) {
                iLJ2 = c21679619sw.LIZIZ(view);
                iLJIIJ2 = c21679619sw.LJI();
            } else {
                iLJ2 = c21679619sw.LJ(view);
                iLJIIJ2 = c21679619sw.LJIIJ();
            }
            iArr[0] = iLJ2 - iLJIIJ2;
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            C21679719sx c21679719sx = this.LJII;
            if (c21679719sx == null) {
                c21679719sx = new C21679719sx(layoutManager);
                this.LJII = c21679719sx;
            }
            if (this.LJIIJJI) {
                iLJ = c21679719sx.LIZIZ(view);
                iLJIIJ = c21679719sx.LJI();
            } else {
                iLJ = c21679719sx.LJ(view);
                iLJIIJ = c21679719sx.LJIIJ();
            }
            iArr[1] = iLJ - iLJIIJ;
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final View LJIIL(RecyclerView.LayoutManager layoutManager, AbstractC21679819sy abstractC21679819sy) {
        int iAbs;
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int iFindLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
            int iFindFirstCompletelyVisibleItemPosition = linearLayoutManager.findFirstCompletelyVisibleItemPosition();
            if (iFindLastCompletelyVisibleItemPosition == linearLayoutManager.getItemCount() - 1) {
                return linearLayoutManager.findViewByPosition(iFindFirstCompletelyVisibleItemPosition);
            }
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            if (this.LJIIJJI) {
                iAbs = Math.abs(abstractC21679819sy.LIZIZ(childAt) - abstractC21679819sy.LJI());
            } else {
                iAbs = Math.abs(abstractC21679819sy.LJ(childAt) - abstractC21679819sy.LJIIJ());
            }
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }
}
