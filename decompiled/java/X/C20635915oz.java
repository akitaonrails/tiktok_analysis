package X;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.15oz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20635915oz extends AbstractC20634115oh {
    public C21679719sx LIZLLL;
    public C21679619sw LJ;

    @Override // X.AbstractC20634115oh
    public View LJFF(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return LJIIIZ(layoutManager, LJIIJJI(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return LJIIIZ(layoutManager, LJIIJ(layoutManager));
        }
        return null;
    }

    public final AbstractC21679819sy LJIIJ(RecyclerView.LayoutManager layoutManager) {
        C21679619sw c21679619sw = this.LJ;
        if (c21679619sw == null || c21679619sw.LIZ != layoutManager) {
            this.LJ = new C21679619sw(layoutManager);
        }
        return this.LJ;
    }

    public final AbstractC21679819sy LJIIJJI(RecyclerView.LayoutManager layoutManager) {
        C21679719sx c21679719sx = this.LIZLLL;
        if (c21679719sx == null || c21679719sx.LIZ != layoutManager) {
            this.LIZLLL = new C21679719sx(layoutManager);
        }
        return this.LIZLLL;
    }

    public static final View LJIIIZ(RecyclerView.LayoutManager layoutManager, AbstractC21679819sy abstractC21679819sy) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int iLJIIJ = abstractC21679819sy.LJIIJ() + (abstractC21679819sy.LJIIJJI() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = layoutManager.getChildAt(i2);
            int iAbs = Math.abs((abstractC21679819sy.LJ(childAt) + (abstractC21679819sy.LIZJ(childAt) / 2)) - iLJIIJ);
            if (iAbs < i) {
                view = childAt;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // X.AbstractC20634115oh
    public int[] LIZJ(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            AbstractC21679819sy abstractC21679819syLJIIJ = LJIIJ(layoutManager);
            iArr[0] = (abstractC21679819syLJIIJ.LJ(view) + (abstractC21679819syLJIIJ.LIZJ(view) / 2)) - (abstractC21679819syLJIIJ.LJIIJ() + (abstractC21679819syLJIIJ.LJIIJJI() / 2));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            AbstractC21679819sy abstractC21679819syLJIIJJI = LJIIJJI(layoutManager);
            iArr[1] = (abstractC21679819syLJIIJJI.LJ(view) + (abstractC21679819syLJIIJJI.LIZJ(view) / 2)) - (abstractC21679819syLJIIJJI.LJIIJ() + (abstractC21679819syLJIIJJI.LJIIJJI() / 2));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20634115oh
    public int LJI(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int itemCount;
        View viewLJFF;
        int position;
        int i3;
        PointF pointFComputeScrollVectorForPosition;
        int iLJIIIIZZ;
        int iLJIIIIZZ2;
        if (!(layoutManager instanceof InterfaceC20634915op) || (itemCount = layoutManager.getItemCount()) == 0 || (viewLJFF = LJFF(layoutManager)) == null || (position = layoutManager.getPosition(viewLJFF)) == -1 || (pointFComputeScrollVectorForPosition = ((InterfaceC20634915op) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return -1;
        }
        int i4 = 0;
        if (layoutManager.canScrollHorizontally()) {
            iLJIIIIZZ = LJIIIIZZ(layoutManager, LJIIJ(layoutManager), i, 0);
            if (pointFComputeScrollVectorForPosition.x < 0.0f) {
                iLJIIIIZZ = -iLJIIIIZZ;
            }
        } else {
            iLJIIIIZZ = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iLJIIIIZZ2 = LJIIIIZZ(layoutManager, LJIIJJI(layoutManager), 0, i2);
            if (pointFComputeScrollVectorForPosition.y < 0.0f) {
                iLJIIIIZZ2 = -iLJIIIIZZ2;
            }
        } else {
            iLJIIIIZZ2 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iLJIIIIZZ = iLJIIIIZZ2;
        }
        if (iLJIIIIZZ == 0) {
            return -1;
        }
        int i5 = position + iLJIIIIZZ;
        if (i5 >= 0) {
            i4 = i5;
        }
        if (i4 < itemCount) {
            return i4;
        }
        return i3;
    }

    public final int LJIIIIZZ(RecyclerView.LayoutManager layoutManager, AbstractC21679819sy abstractC21679819sy, int i, int i2) {
        int i3;
        int iMax;
        int i4 = Integer.MIN_VALUE;
        this.LIZIZ.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.LIZIZ.getFinalX(), this.LIZIZ.getFinalY()};
        int childCount = layoutManager.getChildCount();
        float f = 1.0f;
        if (childCount != 0) {
            View view = null;
            int i5 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = layoutManager.getChildAt(i6);
                int position = layoutManager.getPosition(childAt);
                if (position != -1) {
                    if (position < i5) {
                        view = childAt;
                        i5 = position;
                    }
                    if (position > i4) {
                        view2 = childAt;
                        i4 = position;
                    }
                }
            }
            if (view != null && view2 != null && (iMax = Math.max(abstractC21679819sy.LIZIZ(view), abstractC21679819sy.LIZIZ(view2)) - Math.min(abstractC21679819sy.LJ(view), abstractC21679819sy.LJ(view2))) != 0) {
                f = (iMax * 1.0f) / ((i4 - i5) + 1);
                if (f <= 0.0f) {
                    return 0;
                }
            }
        }
        if (Math.abs(iArr[0]) > Math.abs(iArr[1])) {
            i3 = iArr[0];
        } else {
            i3 = iArr[1];
        }
        return Math.round(i3 / f);
    }
}
