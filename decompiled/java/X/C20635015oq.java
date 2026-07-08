package X;

import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.15oq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20635015oq extends AbstractC20634115oh {
    public final boolean LIZLLL;
    public final int LJ;
    public final int LJFF = 1;
    public final int LJI = 1;
    public C21679619sw LJII;
    public C21679719sx LJIIIIZZ;
    public RecyclerView LJIIIZ;

    @Override // X.AbstractC20634115oh
    public final void LIZIZ(RecyclerView recyclerView) {
        super.LIZIZ(recyclerView);
        this.LJIIIZ = recyclerView;
    }

    @Override // X.AbstractC20634115oh
    public final AbstractC21674019s2 LIZLLL(RecyclerView.LayoutManager layoutManager) {
        Context context = null;
        if (!(layoutManager instanceof InterfaceC20634915op)) {
            return null;
        }
        RecyclerView recyclerView = this.LJIIIZ;
        if (recyclerView != null) {
            context = recyclerView.getContext();
        }
        return new C20748216Gy(this, context, 5);
    }

    @Override // X.AbstractC20634115oh
    public final View LJFF(RecyclerView.LayoutManager layoutManager) {
        boolean z;
        if (layoutManager instanceof LinearLayoutManager) {
            AbstractC21679819sy abstractC21679819syLJIIIZ = LJIIIZ(layoutManager);
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager.canScrollHorizontally() && abstractC21679819syLJIIIZ != null) {
                int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (iFindFirstVisibleItemPosition != -1 && !z) {
                    View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                    if (abstractC21679819syLJIIIZ.LIZIZ(viewFindViewByPosition) >= abstractC21679819syLJIIIZ.LIZJ(viewFindViewByPosition) / 2 && abstractC21679819syLJIIIZ.LIZIZ(viewFindViewByPosition) > 0) {
                        return viewFindViewByPosition;
                    }
                    if (linearLayoutManager.findLastCompletelyVisibleItemPosition() != linearLayoutManager.getItemCount() - 1) {
                        return linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition + 1);
                    }
                }
            }
        }
        return null;
    }

    public final AbstractC21679819sy LJIIIZ(RecyclerView.LayoutManager layoutManager) {
        if (this.LJII == null) {
            this.LJII = new C21679619sw(layoutManager);
        }
        return this.LJII;
    }

    public C20635015oq(boolean z, int i) {
        this.LIZLLL = z;
        this.LJ = i;
    }

    @Override // X.AbstractC20634115oh
    public final int[] LIZJ(RecyclerView.LayoutManager layoutManager, View view) {
        int[] iArr = new int[2];
        AbstractC21679819sy abstractC21679819syLJIIIZ = LJIIIZ(layoutManager);
        if (layoutManager.canScrollHorizontally() && abstractC21679819syLJIIIZ != null) {
            if (!this.LIZLLL) {
                iArr[0] = abstractC21679819syLJIIIZ.LJ(view) - abstractC21679819syLJIIIZ.LJIIJ();
                return iArr;
            }
            iArr[0] = -((this.LJ - abstractC21679819syLJIIIZ.LJIIJ()) - abstractC21679819syLJIIIZ.LIZIZ(view));
            return iArr;
        }
        iArr[0] = 0;
        return iArr;
    }

    public final View LJIIIIZZ(RecyclerView.LayoutManager layoutManager, AbstractC21679819sy abstractC21679819sy) {
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
        if (!this.LIZLLL) {
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
            int i4 = this.LJ;
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20634115oh
    public final int LJI(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        AbstractC21679819sy abstractC21679819syLJIIIZ;
        View viewLJIIIIZZ;
        int position;
        int childCount;
        int position2;
        boolean z;
        int i3;
        int i4;
        PointF pointFComputeScrollVectorForPosition;
        View view = null;
        if (!this.LIZLLL) {
            int itemCount = layoutManager.getItemCount();
            if (itemCount == 0) {
                return -1;
            }
            AbstractC21679819sy abstractC21679819syLJIIIZ2 = LJIIIZ(layoutManager);
            if (layoutManager.canScrollHorizontally() && abstractC21679819syLJIIIZ2 != null && (childCount = layoutManager.getChildCount()) != 0) {
                int i5 = Integer.MAX_VALUE;
                for (int i6 = 0; i6 < childCount; i6++) {
                    View childAt = layoutManager.getChildAt(i6);
                    int iLJ = abstractC21679819syLJIIIZ2.LJ(childAt);
                    if (iLJ < i5) {
                        view = childAt;
                        i5 = iLJ;
                    }
                }
                if (view == null || (position2 = layoutManager.getPosition(view)) == -1) {
                    return -1;
                }
                int i7 = position2 / (this.LJFF * this.LJI);
                if (!layoutManager.canScrollHorizontally() ? i2 > 0 : i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if ((layoutManager instanceof InterfaceC20634915op) && (pointFComputeScrollVectorForPosition = ((InterfaceC20634915op) layoutManager).computeScrollVectorForPosition(itemCount - 1)) != null && (pointFComputeScrollVectorForPosition.x < 0.0f || pointFComputeScrollVectorForPosition.y < 0.0f)) {
                    if (z) {
                        i7--;
                        i3 = this.LJFF;
                        i4 = this.LJI;
                    } else {
                        i3 = this.LJFF;
                        i4 = this.LJI;
                    }
                } else if (z) {
                    i7++;
                    i3 = this.LJFF;
                    i4 = this.LJI;
                } else {
                    i3 = this.LJFF;
                    i4 = this.LJI;
                }
                return i7 * i3 * i4;
            }
            return -1;
        }
        if (layoutManager.getItemCount() == 0) {
            return -1;
        }
        if (layoutManager.canScrollVertically()) {
            if (this.LJIIIIZZ == null) {
                this.LJIIIIZZ = new C21679719sx(layoutManager);
            }
            C21679719sx c21679719sx = this.LJIIIIZZ;
            if (c21679719sx != null) {
                viewLJIIIIZZ = LJIIIIZZ(layoutManager, c21679719sx);
                if (viewLJIIIIZZ != null || (position = layoutManager.getPosition(viewLJIIIIZZ)) == -1) {
                    return -1;
                }
                return position;
            }
        } else if (layoutManager.canScrollHorizontally() && (abstractC21679819syLJIIIZ = LJIIIZ(layoutManager)) != null) {
            viewLJIIIIZZ = LJIIIIZZ(layoutManager, abstractC21679819syLJIIIZ);
            if (viewLJIIIIZZ != null) {
                return -1;
            }
        }
        return -1;
    }
}
