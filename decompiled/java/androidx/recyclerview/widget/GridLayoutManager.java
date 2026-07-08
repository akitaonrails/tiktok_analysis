package androidx.recyclerview.widget;

import X.AbstractC214823195h;
import X.C20092913jb;
import X.C21673319rv;
import X.C21673819s0;
import X.C21673919s1;
import X.C21681419tE;
import X.C21681519tF;
import X.C21681919tJ;
import X.C2188811AlT;
import X.InterfaceC21677219sY;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes34.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean LL;
    public int LLILLJJLI;
    public int[] LLILLL;
    public View[] LLILZ;
    public final SparseIntArray LLILZIL;
    public final SparseIntArray LLILZLL;
    public AbstractC214823195h LLIZ;
    public final Rect LLIZLLLIL;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return this.mOrientation == 0 ? new C21681919tJ(-2, -1) : new C21681919tJ(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && !this.LL;
    }

    public final void LJIJJ() {
        int height;
        int paddingTop;
        if (getOrientation() == 1) {
            height = getWidth() - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        LJIIL(height - paddingTop);
    }

    public final void LJIIL(int i) {
        int i2;
        int[] iArr = this.LLILLL;
        int i3 = this.LLILLJJLI;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 > 0 && i3 - i4 < i6) {
                i2 = i5 + 1;
                i4 -= i3;
            } else {
                i2 = i5;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.LLILLL = iArr;
    }

    public final void LJIJ(int i) {
        if (i == this.LLILLJJLI) {
            return;
        }
        this.LL = true;
        if (i >= 1) {
            this.LLILLJJLI = i;
            this.LLIZ.LJI();
            requestLayout();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Span count should be at least 1. Provided ");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public void LJIJI(AbstractC214823195h abstractC214823195h) {
        this.LLIZ = abstractC214823195h;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof C21681919tJ;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollOffset(C21673919s1 c21673919s1) {
        return super.computeHorizontalScrollOffset(c21673919s1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeHorizontalScrollRange(C21673919s1 c21673919s1) {
        return super.computeHorizontalScrollRange(c21673919s1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(C21673919s1 c21673919s1) {
        return super.computeVerticalScrollOffset(c21673919s1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(C21673919s1 c21673919s1) {
        return super.computeVerticalScrollRange(c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C21681919tJ((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C21681919tJ(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsChanged(RecyclerView recyclerView) {
        this.LLIZ.LJI();
        this.LLIZ.LIZIZ.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(C21673919s1 c21673919s1) {
        super.onLayoutCompleted(c21673919s1);
        this.LL = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setStackFromEnd(boolean z) {
        if (!z) {
            super.setStackFromEnd(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.LLILLJJLI = -1;
        this.LLILZIL = new SparseIntArray();
        this.LLILZLL = new SparseIntArray();
        this.LLIZ = new AbstractC214823195h() { // from class: X.157C
            @Override // X.AbstractC214823195h
            public final int LJFF(int i2) {
                return 1;
            }

            @Override // X.AbstractC214823195h
            public final int LJ(int i2, int i3) {
                return i2 % i3;
            }
        };
        this.LLIZLLLIL = new Rect();
        LJIJ(i);
    }

    public final int LJIILIIL(int i, int i2) {
        if (this.mOrientation == 1 && isLayoutRTL()) {
            int[] iArr = this.LLILLL;
            int i3 = this.LLILLJJLI;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.LLILLL;
        return iArr2[i2 + i] - iArr2[i];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new C21681919tJ(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getColumnCountForAccessibility(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (this.mOrientation == 1) {
            return this.LLILLJJLI;
        }
        if (c21673919s1.LIZIZ() < 1) {
            return 0;
        }
        return LJIILJJIL(c21673919s1.LIZIZ() - 1, c21673319rv, c21673919s1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int getRowCountForAccessibility(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (this.mOrientation == 0) {
            return this.LLILLJJLI;
        }
        if (c21673919s1.LIZIZ() < 1) {
            return 0;
        }
        return LJIILJJIL(c21673919s1.LIZIZ() - 1, c21673319rv, c21673919s1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (c21673919s1.LJI) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                C21681919tJ c21681919tJ = (C21681919tJ) getChildAt(i).getLayoutParams();
                int viewLayoutPosition = c21681919tJ.getViewLayoutPosition();
                this.LLILZIL.put(viewLayoutPosition, c21681919tJ.LLILLJJLI);
                this.LLILZLL.put(viewLayoutPosition, c21681919tJ.LL);
            }
        }
        super.onLayoutChildren(c21673319rv, c21673919s1);
        this.LLILZIL.clear();
        this.LLILZLL.clear();
    }

    public final int LJIILJJIL(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (!c21673919s1.LJI) {
            return this.LLIZ.LIZIZ(i, this.LLILLJJLI);
        }
        int iLJ = c21673319rv.LJ(i);
        if (iLJ == -1) {
            return 0;
        }
        return this.LLIZ.LIZIZ(iLJ, this.LLILLJJLI);
    }

    public final int LJIILL(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (!c21673919s1.LJI) {
            return this.LLIZ.LIZJ(i, this.LLILLJJLI);
        }
        int i2 = this.LLILZLL.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iLJ = c21673319rv.LJ(i);
        if (iLJ == -1) {
            return 0;
        }
        return this.LLIZ.LIZJ(iLJ, this.LLILLJJLI);
    }

    public final int LJIILLIIL(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (!c21673919s1.LJI) {
            return this.LLIZ.LJFF(i);
        }
        int i2 = this.LLILZIL.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iLJ = c21673319rv.LJ(i);
        if (iLJ == -1) {
            return 1;
        }
        return this.LLIZ.LJFF(iLJ);
    }

    public final void LJIIZILJ(int i, View view, boolean z) {
        int childMeasureSpec;
        int childMeasureSpec2;
        boolean zShouldMeasureChild;
        C21681919tJ c21681919tJ = (C21681919tJ) view.getLayoutParams();
        Rect rect = c21681919tJ.mDecorInsets;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c21681919tJ).topMargin + ((ViewGroup.MarginLayoutParams) c21681919tJ).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c21681919tJ).leftMargin + ((ViewGroup.MarginLayoutParams) c21681919tJ).rightMargin;
        int iLJIILIIL = LJIILIIL(c21681919tJ.LL, c21681919tJ.LLILLJJLI);
        if (this.mOrientation == 1) {
            childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(iLJIILIIL, i, i3, ((ViewGroup.MarginLayoutParams) c21681919tJ).width, false);
            childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(this.mOrientationHelper.LJIIJJI(), getHeightMode(), i2, ((ViewGroup.MarginLayoutParams) c21681919tJ).height, true);
        } else {
            childMeasureSpec = RecyclerView.LayoutManager.getChildMeasureSpec(iLJIILIIL, i, i2, ((ViewGroup.MarginLayoutParams) c21681919tJ).height, false);
            childMeasureSpec2 = RecyclerView.LayoutManager.getChildMeasureSpec(this.mOrientationHelper.LJIIJJI(), getWidthMode(), i3, ((ViewGroup.MarginLayoutParams) c21681919tJ).width, true);
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            zShouldMeasureChild = shouldReMeasureChild(view, childMeasureSpec2, childMeasureSpec, layoutParams);
        } else {
            zShouldMeasureChild = shouldMeasureChild(view, childMeasureSpec2, childMeasureSpec, layoutParams);
        }
        if (zShouldMeasureChild) {
            view.measure(childMeasureSpec2, childMeasureSpec);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void collectPrefetchPositionsForLayoutState(C21673919s1 c21673919s1, C21681519tF c21681519tF, InterfaceC21677219sY interfaceC21677219sY) {
        int i;
        int iLJFF = this.LLILLJJLI;
        for (int i2 = 0; i2 < this.LLILLJJLI && (i = c21681519tF.LIZLLL) >= 0 && i < c21673919s1.LIZIZ() && iLJFF > 0; i2++) {
            int i3 = c21681519tF.LIZLLL;
            ((C21673819s0) interfaceC21677219sY).LIZ(i3, Math.max(0, c21681519tF.LJI));
            iLJFF -= this.LLIZ.LJFF(i3);
            c21681519tF.LIZLLL += c21681519tF.LJ;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityNodeInfo(C21673319rv c21673319rv, C21673919s1 c21673919s1, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(c21673319rv, c21673919s1, accessibilityNodeInfoCompat);
        accessibilityNodeInfoCompat.setClassName(GridView.class.getName());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        this.LLIZ.LJI();
        this.LLIZ.LIZIZ.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        this.LLIZ.LJI();
        this.LLIZ.LIZIZ.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        LJIJJ();
        View[] viewArr = this.LLILZ;
        if (viewArr == null || viewArr.length != this.LLILLJJLI) {
            this.LLILZ = new View[this.LLILLJJLI];
        }
        return super.scrollHorizontallyBy(i, c21673319rv, c21673919s1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        LJIJJ();
        View[] viewArr = this.LLILZ;
        if (viewArr == null || viewArr.length != this.LLILLJJLI) {
            this.LLILZ = new View[this.LLILLJJLI];
        }
        return super.scrollVerticallyBy(i, c21673319rv, c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void setMeasuredDimension(Rect rect, int i, int i2) {
        int iChooseSize;
        int iChooseSize2;
        if (this.LLILLL == null) {
            super.setMeasuredDimension(rect, i, i2);
        }
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.mOrientation == 1) {
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, rect.height() + paddingTop, getMinimumHeight());
            int[] iArr = this.LLILLL;
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i, iArr[iArr.length - 1] + paddingLeft, getMinimumWidth());
        } else {
            iChooseSize = RecyclerView.LayoutManager.chooseSize(i, rect.width() + paddingLeft, getMinimumWidth());
            int[] iArr2 = this.LLILLL;
            iChooseSize2 = RecyclerView.LayoutManager.chooseSize(i2, iArr2[iArr2.length - 1] + paddingTop, getMinimumHeight());
        }
        setMeasuredDimension(iChooseSize, iChooseSize2);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.LLILLJJLI = -1;
        this.LLILZIL = new SparseIntArray();
        this.LLILZLL = new SparseIntArray();
        this.LLIZ = new AbstractC214823195h() { // from class: X.157C
            @Override // X.AbstractC214823195h
            public final int LJFF(int i22) {
                return 1;
            }

            @Override // X.AbstractC214823195h
            public final int LJ(int i22, int i3) {
                return i22 % i3;
            }
        };
        this.LLIZLLLIL = new Rect();
        LJIJ(RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2).LIZIZ);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View findReferenceChild(C21673319rv c21673319rv, C21673919s1 c21673919s1, boolean z, boolean z2) {
        int childCount;
        int childCount2 = getChildCount();
        int i = 1;
        if (z2) {
            childCount = getChildCount() - 1;
            childCount2 = -1;
            i = -1;
        } else {
            childCount = 0;
        }
        int iLIZIZ = c21673919s1.LIZIZ();
        ensureLayoutState();
        int iLJIIJ = this.mOrientationHelper.LJIIJ();
        int iLJI = this.mOrientationHelper.LJI();
        View view = null;
        View view2 = null;
        while (childCount != childCount2) {
            View childAt = getChildAt(childCount);
            int position = getPosition(childAt);
            if (position >= 0 && position < iLIZIZ && LJIILL(position, c21673319rv, c21673919s1) == 0) {
                if (((RecyclerView.LayoutParams) childAt.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = childAt;
                    }
                } else {
                    if (this.mOrientationHelper.LJ(childAt) < iLJI && this.mOrientationHelper.LIZIZ(childAt) >= iLJIIJ) {
                        return childAt;
                    }
                    if (view == null) {
                        view = childAt;
                    }
                }
            }
            childCount += i;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x00a9, code lost:
    
        if (r11 == (-1)) goto L44;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void layoutChunk(X.C21673319rv r19, X.C21673919s1 r20, X.C21681519tF r21, X.C21682119tL r22) {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.layoutChunk(X.19rv, X.19s1, X.19tF, X.19tL):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void onAnchorReady(C21673319rv c21673319rv, C21673919s1 c21673919s1, C21681419tE c21681419tE, int i) {
        boolean z;
        super.onAnchorReady(c21673319rv, c21673919s1, c21681419tE, i);
        LJIJJ();
        if (c21673919s1.LIZIZ() > 0 && !c21673919s1.LJI) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            int iLJIILL = LJIILL(c21681419tE.LIZIZ, c21673319rv, c21673919s1);
            if (!z) {
                int iLIZIZ = c21673919s1.LIZIZ() - 1;
                int i2 = c21681419tE.LIZIZ;
                while (i2 < iLIZIZ) {
                    int i3 = i2 + 1;
                    int iLJIILL2 = LJIILL(i3, c21673319rv, c21673919s1);
                    if (iLJIILL2 <= iLJIILL) {
                        break;
                    }
                    i2 = i3;
                    iLJIILL = iLJIILL2;
                }
                c21681419tE.LIZIZ = i2;
            } else {
                while (iLJIILL > 0) {
                    int i4 = c21681419tE.LIZIZ;
                    if (i4 <= 0) {
                        break;
                    }
                    int i5 = i4 - 1;
                    c21681419tE.LIZIZ = i5;
                    iLJIILL = LJIILL(i5, c21673319rv, c21673919s1);
                }
            }
        }
        View[] viewArr = this.LLILZ;
        if (viewArr == null || viewArr.length != this.LLILLJJLI) {
            this.LLILZ = new View[this.LLILLJJLI];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onFocusSearchFailed(android.view.View r25, int r26, X.C21673319rv r27, X.C21673919s1 r28) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.onFocusSearchFailed(android.view.View, int, X.19rv, X.19s1):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onInitializeAccessibilityNodeInfoForItem(C21673319rv c21673319rv, C21673919s1 c21673919s1, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C21681919tJ)) {
            super.onInitializeAccessibilityNodeInfoForItem(view, accessibilityNodeInfoCompat);
            return;
        }
        C21681919tJ c21681919tJ = (C21681919tJ) layoutParams;
        int iLJIILJJIL = LJIILJJIL(c21681919tJ.getViewLayoutPosition(), c21673319rv, c21673919s1);
        if (this.mOrientation == 0) {
            accessibilityNodeInfoCompat.setCollectionItemInfo(C20092913jb.LIZ(c21681919tJ.LL, c21681919tJ.LLILLJJLI, iLJIILJJIL, 1, false));
        } else {
            accessibilityNodeInfoCompat.setCollectionItemInfo(C20092913jb.LIZ(iLJIILJJIL, 1, c21681919tJ.LL, c21681919tJ.LLILLJJLI, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        this.LLIZ.LJI();
        this.LLIZ.LIZIZ.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.LLIZ.LJI();
        this.LLIZ.LIZIZ.clear();
    }

    public GridLayoutManager(int i, int i2, Context context, boolean z) {
        super(context, i2, z);
        this.LLILLJJLI = -1;
        this.LLILZIL = new SparseIntArray();
        this.LLILZLL = new SparseIntArray();
        this.LLIZ = new AbstractC214823195h() { // from class: X.157C
            @Override // X.AbstractC214823195h
            public final int LJFF(int i22) {
                return 1;
            }

            @Override // X.AbstractC214823195h
            public final int LJ(int i22, int i3) {
                return i22 % i3;
            }
        };
        this.LLIZLLLIL = new Rect();
        LJIJ(i);
    }
}
