package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.15ow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20635615ow extends C20635515ov {
    public final boolean LJIIIIZZ;
    public final int LJIIIZ;

    public C20635615ow(boolean z, int i) {
        this.LJIIIIZZ = z;
        this.LJIIIZ = i;
    }

    @Override // X.C20635515ov, X.C20635115or, X.AbstractC20634115oh
    public final int[] LIZJ(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        int i = 0;
        do {
            iArr[i] = 0;
            i++;
        } while (i < 2);
        if (layoutManager.canScrollHorizontally()) {
            if (!this.LJIIIIZZ) {
                iArr[0] = LJIILIIL(view, LJIIJ(layoutManager));
            } else {
                iArr[0] = -LJIILIIL(view, LJIIJ(layoutManager));
            }
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            if (this.LJFF == null) {
                this.LJFF = new C21679719sx(layoutManager);
            }
            iArr[1] = LJIILIIL(view, this.LJFF);
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // X.C20635515ov
    public final View LJIIL(RecyclerView.LayoutManager layoutManager, AbstractC21679819sy abstractC21679819sy) {
        int iLJIIJ;
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).findLastCompletelyVisibleItemPosition() == r0.getItemCount() - 1) {
                return null;
            }
        }
        int i = 0;
        if (layoutManager.getClipToPadding()) {
            iLJIIJ = abstractC21679819sy.LJIIJ();
        } else {
            iLJIIJ = 0;
        }
        int i2 = Integer.MAX_VALUE;
        if (!this.LJIIIIZZ) {
            int i3 = childCount - 1;
            if (i3 >= 0) {
                while (true) {
                    View childAt = layoutManager.getChildAt(i);
                    int iAbs = Math.abs(abstractC21679819sy.LJ(childAt) - iLJIIJ);
                    if (iAbs < i2) {
                        view = childAt;
                        i2 = iAbs;
                    }
                    if (i == i3) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            int i4 = this.LJIIIZ;
            int i5 = childCount - 1;
            if (i5 >= 0) {
                while (true) {
                    View childAt2 = layoutManager.getChildAt(i);
                    int iAbs2 = Math.abs((i4 - abstractC21679819sy.LIZIZ(childAt2)) - iLJIIJ);
                    if (iAbs2 < i2) {
                        view = childAt2;
                        i2 = iAbs2;
                    }
                    if (i == i5) {
                        break;
                    }
                    i++;
                }
            }
        }
        return view;
    }

    public final int LJIILIIL(View view, AbstractC21679819sy abstractC21679819sy) {
        if (!this.LJIIIIZZ) {
            return abstractC21679819sy.LJ(view) - abstractC21679819sy.LJIIJ();
        }
        return (this.LJIIIZ - abstractC21679819sy.LJIIJ()) - abstractC21679819sy.LIZIZ(view);
    }

    @Override // X.C20635115or, X.AbstractC20634115oh
    public final int LJI(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        View viewLJIIL;
        int position;
        if (!this.LJIIIIZZ) {
            return super.LJI(layoutManager, i, i2);
        }
        if (layoutManager.getItemCount() == 0) {
            return -1;
        }
        if (layoutManager.canScrollVertically()) {
            if (this.LJFF == null) {
                this.LJFF = new C21679719sx(layoutManager);
            }
            viewLJIIL = LJIIL(layoutManager, this.LJFF);
        } else {
            if (layoutManager.canScrollHorizontally()) {
                viewLJIIL = LJIIL(layoutManager, LJIIJ(layoutManager));
            }
            return -1;
        }
        if (viewLJIIL == null || (position = layoutManager.getPosition(viewLJIIL)) == -1) {
            return -1;
        }
        return position;
    }
}
