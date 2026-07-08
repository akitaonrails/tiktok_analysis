package com.bytedance.android.ec.vlayout;

import X.AbstractC21673619ry;
import X.AbstractC21684819tm;
import X.C1777790wMb;
import X.C20064213ey;
import X.C20104213lQ;
import X.C21673319rv;
import X.C21673919s1;
import X.C21684219tg;
import X.C21684419ti;
import X.C21684519tj;
import X.C21684619tk;
import X.C21684719tl;
import X.C2188811AlT;
import X.InterfaceC21685319tr;
import android.content.Context;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: loaded from: classes34.dex */
public class VirtualLayoutManager extends ExposeLinearLayoutManagerEx {
    public AbstractC21684819tm LL;
    public RecyclerView LLILLJJLI;
    public int LLILLL;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return false;
    }

    @Override // com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx
    public final boolean isEnableMarginOverLap() {
        return false;
    }

    @Override // com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean supportsPredictiveItemAnimations() {
        return false;
    }

    static {
        new C20064213ey() { // from class: X.13ez
        };
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new C21684719tl();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final int getOrientation() {
        return super.getOrientation();
    }

    @Override // com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx
    public final void validateChildOrderExpose() {
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iLIZLLL = this.LL.LIZLLL(getChildAt(0));
        if (this.mShouldReverseLayoutExpose) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int iLIZLLL2 = this.LL.LIZLLL(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("detected invalid position. loc invalid? ");
                    sbLIZ.append(iLIZLLL2 < iLIZLLL);
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (iLIZLLL2 > iLIZLLL) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int iLIZLLL3 = this.LL.LIZLLL(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("detected invalid position. loc invalid? ");
                sbLIZ2.append(iLIZLLL3 < iLIZLLL);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (iLIZLLL3 < iLIZLLL) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof C21684719tl;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void detachAndScrapAttachedViews(C21673319rv c21673319rv) throws Throwable {
        RecyclerView.ViewHolder childViewHolder;
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 0) {
                View childAt = getChildAt(childCount);
                RecyclerView recyclerView = this.LLILLJJLI;
                if (recyclerView != null) {
                    childViewHolder = recyclerView.getChildViewHolder(childAt);
                } else {
                    childViewHolder = null;
                }
                if ((childViewHolder instanceof InterfaceC21685319tr) && ((InterfaceC21685319tr) childViewHolder).LIZ()) {
                    C20104213lQ.LIZ(childViewHolder, 6);
                }
            } else {
                super.detachAndScrapAttachedViews(c21673319rv);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final View findViewByPosition(int i) {
        View viewFindViewByPosition = super.findViewByPosition(i);
        if (viewFindViewByPosition != null && getPosition(viewFindViewByPosition) == i) {
            return viewFindViewByPosition;
        }
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && getPosition(childAt) == i) {
                return childAt;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C21684719tl) {
            return new C21684719tl((RecyclerView.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof RecyclerView.LayoutParams) {
            return new C21684719tl((RecyclerView.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C21684719tl((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C21684719tl(layoutParams);
    }

    @Override // com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx
    public final void hideView(View view) throws Throwable {
        super.hideView(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        throw null;
    }

    @Override // com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.LLILLJJLI = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsChanged(RecyclerView recyclerView) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onScrollStateChanged(int i) {
        super.onScrollStateChanged(i);
        findFirstVisibleItemPosition();
        findLastVisibleItemPosition();
        throw null;
    }

    @Override // com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i) {
        super.scrollToPosition(i);
    }

    @Override // com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager
    public final void setOrientation(int i) {
        AbstractC21684819tm c21684519tj;
        if (i != 0) {
            if (i == 1) {
                c21684519tj = new C21684619tk(this);
            } else {
                throw new IllegalArgumentException("invalid orientation");
            }
        } else {
            c21684519tj = new C21684519tj(this);
        }
        this.LL = c21684519tj;
        super.setOrientation(i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setReverseLayout(boolean z) {
        if (!z) {
            super.setReverseLayout(false);
            return;
        }
        throw new UnsupportedOperationException("VirtualLayoutManager does not support reverse layout in current version.");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z) {
        if (!z) {
            super.setStackFromEnd(false);
            return;
        }
        throw new UnsupportedOperationException("VirtualLayoutManager does not support stack from end.");
    }

    @Override // com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx
    public final void showView(View view) throws Throwable {
        super.showView(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void detachAndScrapView(View view, C21673319rv c21673319rv) {
        super.detachAndScrapView(view, c21673319rv);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void detachAndScrapViewAt(int i, C21673319rv c21673319rv) throws Throwable {
        RecyclerView.ViewHolder childViewHolder;
        View childAt = getChildAt(i);
        RecyclerView recyclerView = this.LLILLJJLI;
        if (recyclerView != null) {
            childViewHolder = recyclerView.getChildViewHolder(childAt);
        } else {
            childViewHolder = null;
        }
        if ((childViewHolder instanceof InterfaceC21685319tr) && ((InterfaceC21685319tr) childViewHolder).LIZ()) {
            C20104213lQ.LIZ(childViewHolder, 4);
        }
        super.detachAndScrapViewAt(i, c21673319rv);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(final Context context, final AttributeSet attributeSet) {
        return new C21684719tl(context, attributeSet) { // from class: X.19tn
        };
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void moveView(int i, int i2) {
        super.moveView(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(AbstractC21673619ry abstractC21673619ry, AbstractC21673619ry abstractC21673619ry2) {
        super.onAdapterChanged(abstractC21673619ry, abstractC21673619ry2);
    }

    @Override // com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx
    public final void onAnchorReady(C21673919s1 c21673919s1, C21684419ti c21684419ti) {
        super.onAnchorReady(c21673919s1, c21684419ti);
        throw null;
    }

    @Override // com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onDetachedFromWindow(RecyclerView recyclerView, C21673319rv c21673319rv) {
        super.onDetachedFromWindow(recyclerView, c21673319rv);
        throw null;
    }

    @Override // com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        Trace.beginSection("VLM onLayoutChildren");
        int i = this.LLILLL;
        if (i != 0) {
            this.LLILLL = i + 1;
            try {
                try {
                    super.onLayoutChildren(c21673319rv, c21673919s1);
                    LJIIL(Integer.MAX_VALUE, c21673319rv, c21673919s1);
                    Trace.endSection();
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJIIL(Integer.MAX_VALUE, c21673319rv, c21673919s1);
                throw th;
            }
        }
        throw null;
    }

    @Override // com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx, androidx.recyclerview.widget.LinearLayoutManager
    public final void scrollToPositionWithOffset(int i, int i2) {
        super.scrollToPositionWithOffset(i, i2);
    }

    public final void LJIIL(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int i2 = this.LLILLL - 1;
        this.LLILLL = i2;
        if (i2 > 0) {
            return;
        }
        this.LLILLL = 0;
        findFirstVisibleItemPosition();
        findLastVisibleItemPosition();
        throw null;
    }

    @Override // com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx
    public final int computeAlignOffset(View view, boolean z, boolean z2) {
        return computeAlignOffset(getPosition(view), z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void measureChild(View view, int i, int i2) {
        calculateItemDecorationsForChild(view, null);
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void measureChildWithMargins(View view, int i, int i2) {
        calculateItemDecorationsForChild(view, null);
        if (getOrientation() != 1 && getOrientation() != 0) {
            view.measure(i, i2);
            return;
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        onItemsChanged(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        onItemsChanged(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        onItemsChanged(recyclerView);
    }

    @Override // com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx
    public final void recycleChildren(C21673319rv c21673319rv, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            View childAt = getChildAt(i2 - 1);
            getPosition(getChildAt(i));
            getPosition(childAt);
            for (int i3 = i; i3 < i2; i3++) {
                if (getPosition(getChildAt(i)) == -1) {
                    removeAndRecycleViewAt(i, c21673319rv);
                } else {
                    throw null;
                }
            }
            return;
        }
        View childAt2 = getChildAt(i);
        getPosition(getChildAt(i2 + 1));
        getPosition(childAt2);
        while (i > i2) {
            if (getPosition(getChildAt(i)) == -1) {
                removeAndRecycleViewAt(i, c21673319rv);
                i--;
            } else {
                throw null;
            }
        }
    }

    @Override // com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx
    public final int scrollInternalBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        Trace.beginSection("VLM scroll");
        int i2 = this.LLILLL;
        if (i2 != 0) {
            this.LLILLL = i2 + 1;
            int iScrollInternalBy = 0;
            try {
                try {
                    iScrollInternalBy = super.scrollInternalBy(i, c21673319rv, c21673919s1);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (ExposeLinearLayoutManagerEx.isLocalTest) {
                        throw e;
                    }
                }
                LJIIL(iScrollInternalBy, c21673319rv, c21673919s1);
                Trace.endSection();
                return iScrollInternalBy;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJIIL(iScrollInternalBy, c21673319rv, c21673919s1);
                throw th;
            }
        }
        throw null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        super.smoothScrollToPosition(recyclerView, c21673919s1, i);
    }

    @Override // com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx
    public final int computeAlignOffset(int i, boolean z, boolean z2) {
        if (i == -1) {
            return 0;
        }
        throw null;
    }

    @Override // com.bytedance.android.ec.vlayout.ExposeLinearLayoutManagerEx
    public final void layoutChunk(C21673319rv c21673319rv, C21673919s1 c21673919s1, C21684219tg c21684219tg, C1777790wMb c1777790wMb) {
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        onItemsChanged(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onMeasure(C21673319rv c21673319rv, C21673919s1 c21673919s1, int i, int i2) {
        super.onMeasure(c21673319rv, c21673919s1, i, i2);
    }
}
