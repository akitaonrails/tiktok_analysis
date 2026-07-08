package androidx.recyclerview.widget;

import X.AbstractC21679819sy;
import X.C21673319rv;
import X.C21673819s0;
import X.C21673919s1;
import X.C21674119s3;
import X.C21675919sL;
import X.C21681419tE;
import X.C21681519tF;
import X.C21681719tH;
import X.C21682119tL;
import X.C2188811AlT;
import X.C2189641Amo;
import X.InterfaceC20634915op;
import X.InterfaceC21677219sY;
import X.InterfaceC21688919uR;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes34.dex */
public class LinearLayoutManager extends RecyclerView.LayoutManager implements InterfaceC21688919uR, InterfaceC20634915op {
    public final C21681419tE mAnchorInfo;
    public int mInitialPrefetchItemCount;
    public boolean mLastStackFromEnd;
    public final C21682119tL mLayoutChunkResult;
    public C21681519tF mLayoutState;
    public int mOrientation;
    public AbstractC21679819sy mOrientationHelper;
    public SavedState mPendingSavedState;
    public int mPendingScrollPosition;
    public int mPendingScrollPositionOffset;
    public boolean mRecycleChildrenOnDetach;
    public int[] mReusableIntPair;
    public boolean mReverseLayout;
    public boolean mShouldReverseLayout;
    public boolean mSmoothScrollbarEnabled;
    public boolean mStackFromEnd;

    private View findFirstPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(0, getChildCount());
    }

    private void logChildren() {
        for (int i = 0; i < getChildCount(); i++) {
            getChildAt(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    public void onAnchorReady(C21673319rv c21673319rv, C21673919s1 c21673919s1, C21681419tE c21681419tE, int i) {
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToEnd() {
        return this.mShouldReverseLayout ? findFirstPartiallyOrCompletelyInvisibleChild() : findLastPartiallyOrCompletelyInvisibleChild();
    }

    private View findPartiallyOrCompletelyInvisibleChildClosestToStart() {
        return this.mShouldReverseLayout ? findLastPartiallyOrCompletelyInvisibleChild() : findFirstPartiallyOrCompletelyInvisibleChild();
    }

    private View getChildClosestToEnd() {
        return getChildAt(this.mShouldReverseLayout ? 0 : getChildCount() - 1);
    }

    private View getChildClosestToStart() {
        return getChildAt(this.mShouldReverseLayout ? getChildCount() - 1 : 0);
    }

    private void resolveShouldLayoutReverse() {
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            this.mShouldReverseLayout = this.mReverseLayout;
        } else {
            this.mShouldReverseLayout = !this.mReverseLayout;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.mOrientation == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        return this.mOrientation == 1;
    }

    public C21681519tF createLayoutState() {
        return new C21681519tF();
    }

    public void ensureLayoutState() {
        if (this.mLayoutState == null) {
            this.mLayoutState = createLayoutState();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public Parcelable onSaveInstanceState() {
        if (this.mPendingSavedState != null) {
            return new SavedState(this.mPendingSavedState);
        }
        SavedState savedState = new SavedState();
        if (getChildCount() <= 0) {
            savedState.LL = -1;
            return savedState;
        }
        ensureLayoutState();
        boolean z = this.mLastStackFromEnd ^ this.mShouldReverseLayout;
        savedState.LLILLL = z;
        if (z) {
            View childClosestToEnd = getChildClosestToEnd();
            savedState.LLILLJJLI = this.mOrientationHelper.LJI() - this.mOrientationHelper.LIZIZ(childClosestToEnd);
            savedState.LL = getPosition(childClosestToEnd);
            return savedState;
        }
        View childClosestToStart = getChildClosestToStart();
        savedState.LL = getPosition(childClosestToStart);
        savedState.LLILLJJLI = this.mOrientationHelper.LJ(childClosestToStart) - this.mOrientationHelper.LJIIJ();
        return savedState;
    }

    public boolean resolveIsInfinite() {
        return this.mOrientationHelper.LJIIIIZZ() == 0 && this.mOrientationHelper.LJFF() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return this.mPendingSavedState == null && this.mLastStackFromEnd == this.mStackFromEnd;
    }

    private View findLastPartiallyOrCompletelyInvisibleChild() {
        return findOnePartiallyOrCompletelyInvisibleChild(getChildCount() - 1, -1);
    }

    public int findFirstCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), true, false);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findFirstVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(0, getChildCount(), false, true);
        if (viewFindOneVisibleChild == null) {
            return -1;
        }
        return getPosition(viewFindOneVisibleChild);
    }

    public int findLastCompletelyVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, true, false);
        if (viewFindOneVisibleChild != null) {
            return getPosition(viewFindOneVisibleChild);
        }
        return -1;
    }

    public int findLastVisibleItemPosition() {
        View viewFindOneVisibleChild = findOneVisibleChild(getChildCount() - 1, -1, false, true);
        if (viewFindOneVisibleChild != null) {
            return getPosition(viewFindOneVisibleChild);
        }
        return -1;
    }

    public boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean shouldMeasureTwice() {
        return (getHeightMode() == 1073741824 || getWidthMode() == 1073741824 || !hasFlexibleChildInBothOrientations()) ? false : true;
    }

    public void validateChildOrder() {
        if (getChildCount() < 1) {
            return;
        }
        int position = getPosition(getChildAt(0));
        int iLJ = this.mOrientationHelper.LJ(getChildAt(0));
        if (this.mShouldReverseLayout) {
            for (int i = 1; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                int position2 = getPosition(childAt);
                int iLJ2 = this.mOrientationHelper.LJ(childAt);
                if (position2 < position) {
                    logChildren();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("detected invalid position. loc invalid? ");
                    sbLIZ.append(iLJ2 < iLJ);
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                }
                if (iLJ2 > iLJ) {
                    logChildren();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            int position3 = getPosition(childAt2);
            int iLJ3 = this.mOrientationHelper.LJ(childAt2);
            if (position3 < position) {
                logChildren();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("detected invalid position. loc invalid? ");
                sbLIZ2.append(iLJ3 < iLJ);
                throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (iLJ3 < iLJ) {
                logChildren();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2189641Amo(9);
        public int LL;
        public int LLILLJJLI;
        public boolean LLILLL;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.LL = parcel.readInt();
            this.LLILLJJLI = parcel.readInt();
            this.LLILLL = parcel.readInt() == 1;
        }

        public SavedState(SavedState savedState) {
            this.LL = savedState.LL;
            this.LLILLJJLI = savedState.LLILLJJLI;
            this.LLILLL = savedState.LLILLL;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.LL);
            parcel.writeInt(this.LLILLJJLI);
            parcel.writeInt(this.LLILLL ? 1 : 0);
        }
    }

    public int getInitialPrefetchItemCount() {
        return this.mInitialPrefetchItemCount;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public boolean getRecycleChildrenOnDetach() {
        return this.mRecycleChildrenOnDetach;
    }

    public boolean getReverseLayout() {
        return this.mReverseLayout;
    }

    public boolean getStackFromEnd() {
        return this.mStackFromEnd;
    }

    public boolean isSmoothScrollbarEnabled() {
        return this.mSmoothScrollbarEnabled;
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private int computeScrollExtent(C21673919s1 c21673919s1) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C21681719tH.LIZ(c21673919s1, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private int computeScrollOffset(C21673919s1 c21673919s1) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C21681719tH.LIZIZ(c21673919s1, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled, this.mShouldReverseLayout);
    }

    private int computeScrollRange(C21673919s1 c21673919s1) {
        if (getChildCount() == 0) {
            return 0;
        }
        ensureLayoutState();
        return C21681719tH.LIZJ(c21673919s1, this.mOrientationHelper, findFirstVisibleChildClosestToStart(!this.mSmoothScrollbarEnabled, true), findFirstVisibleChildClosestToEnd(!this.mSmoothScrollbarEnabled, true), this, this.mSmoothScrollbarEnabled);
    }

    private void updateLayoutStateToFillEnd(C21681419tE c21681419tE) {
        updateLayoutStateToFillEnd(c21681419tE.LIZIZ, c21681419tE.LIZJ);
    }

    private void updateLayoutStateToFillStart(C21681419tE c21681419tE) {
        updateLayoutStateToFillStart(c21681419tE.LIZIZ, c21681419tE.LIZJ);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void assertNotInLayoutOrScroll(String str) {
        if (this.mPendingSavedState == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(C21673919s1 c21673919s1) {
        return computeScrollExtent(c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(C21673919s1 c21673919s1) {
        return computeScrollOffset(c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(C21673919s1 c21673919s1) {
        return computeScrollRange(c21673919s1);
    }

    @Override // X.InterfaceC20634915op
    public PointF computeScrollVectorForPosition(int i) {
        if (getChildCount() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < getPosition(getChildAt(0))) {
            z = true;
        }
        if (z != this.mShouldReverseLayout) {
            i2 = -1;
        }
        if (this.mOrientation == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(C21673919s1 c21673919s1) {
        return computeScrollExtent(c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(C21673919s1 c21673919s1) {
        return computeScrollOffset(c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(C21673919s1 c21673919s1) {
        return computeScrollRange(c21673919s1);
    }

    public int convertFocusDirectionToLayoutDirection(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130 && this.mOrientation == 1) {
                                return 1;
                            }
                            return Integer.MIN_VALUE;
                        }
                        if (this.mOrientation == 0) {
                            return 1;
                        }
                        return Integer.MIN_VALUE;
                    }
                    if (this.mOrientation == 1) {
                        return -1;
                    }
                    return Integer.MIN_VALUE;
                }
                if (this.mOrientation == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            }
            if (this.mOrientation != 1 && isLayoutRTL()) {
                return -1;
            }
            return 1;
        }
        if (this.mOrientation == 1 || !isLayoutRTL()) {
            return -1;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public View findViewByPosition(int i) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        int position = i - getPosition(getChildAt(0));
        if (position >= 0 && position < childCount) {
            View childAt = getChildAt(position);
            if (getPosition(childAt) == i) {
                return childAt;
            }
        }
        return super.findViewByPosition(i);
    }

    public int getExtraLayoutSpace(C21673919s1 c21673919s1) {
        if (c21673919s1.LIZ == -1) {
            return 0;
        }
        return this.mOrientationHelper.LJIIJJI();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            accessibilityEvent.setFromIndex(findFirstVisibleItemPosition());
            accessibilityEvent.setToIndex(findLastVisibleItemPosition());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(C21673919s1 c21673919s1) {
        super.onLayoutCompleted(c21673919s1);
        this.mPendingSavedState = null;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo.LIZLLL();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.mPendingSavedState = savedState;
            if (this.mPendingScrollPosition != -1) {
                savedState.LL = -1;
            }
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.LL = -1;
        }
        requestLayout();
    }

    public void setInitialPrefetchItemCount(int i) {
        this.mInitialPrefetchItemCount = i;
    }

    public void setOrientation(int i) {
        if (i != 0 && i != 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("invalid orientation:");
            sbLIZ.append(i);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        assertNotInLayoutOrScroll(null);
        if (i != this.mOrientation || this.mOrientationHelper == null) {
            AbstractC21679819sy abstractC21679819syLIZ = AbstractC21679819sy.LIZ(i, this);
            this.mOrientationHelper = abstractC21679819syLIZ;
            this.mAnchorInfo.LIZ = abstractC21679819syLIZ;
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setRecycleChildrenOnDetach(boolean z) {
        this.mRecycleChildrenOnDetach = z;
    }

    public void setReverseLayout(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (z == this.mReverseLayout) {
            return;
        }
        this.mReverseLayout = z;
        requestLayout();
    }

    public void setSmoothScrollbarEnabled(boolean z) {
        this.mSmoothScrollbarEnabled = z;
    }

    public void setStackFromEnd(boolean z) {
        assertNotInLayoutOrScroll(null);
        if (this.mStackFromEnd == z) {
            return;
        }
        this.mStackFromEnd = z;
        requestLayout();
    }

    private void recycleByLayoutState(C21673319rv c21673319rv, C21681519tF c21681519tF) {
        if (c21681519tF.LIZ && !c21681519tF.LJIIJJI) {
            int i = c21681519tF.LJI;
            int i2 = c21681519tF.LJIIIIZZ;
            if (c21681519tF.LJFF == -1) {
                recycleViewsFromEnd(c21673319rv, i, i2);
            } else {
                recycleViewsFromStart(c21673319rv, i, i2);
            }
        }
    }

    private boolean updateAnchorFromPendingData(C21673919s1 c21673919s1, C21681419tE c21681419tE) {
        int i;
        boolean z;
        int iLJ;
        boolean z2 = false;
        if (!c21673919s1.LJI && (i = this.mPendingScrollPosition) != -1) {
            if (i >= 0 && i < c21673919s1.LIZIZ()) {
                int i2 = this.mPendingScrollPosition;
                c21681419tE.LIZIZ = i2;
                SavedState savedState = this.mPendingSavedState;
                if (savedState != null && savedState.LL >= 0) {
                    boolean z3 = savedState.LLILLL;
                    c21681419tE.LIZLLL = z3;
                    if (z3) {
                        c21681419tE.LIZJ = this.mOrientationHelper.LJI() - this.mPendingSavedState.LLILLJJLI;
                        return true;
                    }
                    c21681419tE.LIZJ = this.mOrientationHelper.LJIIJ() + this.mPendingSavedState.LLILLJJLI;
                    return true;
                }
                if (this.mPendingScrollPositionOffset == Integer.MIN_VALUE) {
                    View viewFindViewByPosition = findViewByPosition(i2);
                    if (viewFindViewByPosition != null) {
                        if (this.mOrientationHelper.LIZJ(viewFindViewByPosition) > this.mOrientationHelper.LJIIJJI()) {
                            c21681419tE.LIZ();
                            return true;
                        }
                        if (this.mOrientationHelper.LJ(viewFindViewByPosition) - this.mOrientationHelper.LJIIJ() < 0) {
                            c21681419tE.LIZJ = this.mOrientationHelper.LJIIJ();
                            c21681419tE.LIZLLL = false;
                            return true;
                        }
                        if (this.mOrientationHelper.LJI() - this.mOrientationHelper.LIZIZ(viewFindViewByPosition) < 0) {
                            c21681419tE.LIZJ = this.mOrientationHelper.LJI();
                            c21681419tE.LIZLLL = true;
                            return true;
                        }
                        if (c21681419tE.LIZLLL) {
                            iLJ = this.mOrientationHelper.LIZIZ(viewFindViewByPosition) + this.mOrientationHelper.LJIIL();
                        } else {
                            iLJ = this.mOrientationHelper.LJ(viewFindViewByPosition);
                        }
                        c21681419tE.LIZJ = iLJ;
                        return true;
                    }
                    if (getChildCount() > 0) {
                        if (this.mPendingScrollPosition < getPosition(getChildAt(0))) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z == this.mShouldReverseLayout) {
                            z2 = true;
                        }
                        c21681419tE.LIZLLL = z2;
                    }
                    c21681419tE.LIZ();
                    return true;
                }
                boolean z4 = this.mShouldReverseLayout;
                c21681419tE.LIZLLL = z4;
                if (z4) {
                    c21681419tE.LIZJ = this.mOrientationHelper.LJI() - this.mPendingScrollPositionOffset;
                    return true;
                }
                c21681419tE.LIZJ = this.mOrientationHelper.LJIIJ() + this.mPendingScrollPositionOffset;
                return true;
            }
            this.mPendingScrollPosition = -1;
            this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        }
        return false;
    }

    private void updateLayoutStateToFillEnd(int i, int i2) {
        int i3;
        this.mLayoutState.LIZJ = this.mOrientationHelper.LJI() - i2;
        C21681519tF c21681519tF = this.mLayoutState;
        if (this.mShouldReverseLayout) {
            i3 = -1;
        } else {
            i3 = 1;
        }
        c21681519tF.LJ = i3;
        c21681519tF.LIZLLL = i;
        c21681519tF.LJFF = 1;
        c21681519tF.LIZIZ = i2;
        c21681519tF.LJI = Integer.MIN_VALUE;
    }

    private void updateLayoutStateToFillStart(int i, int i2) {
        int i3;
        this.mLayoutState.LIZJ = i2 - this.mOrientationHelper.LJIIJ();
        C21681519tF c21681519tF = this.mLayoutState;
        c21681519tF.LIZLLL = i;
        if (this.mShouldReverseLayout) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        c21681519tF.LJ = i3;
        c21681519tF.LJFF = -1;
        c21681519tF.LIZIZ = i2;
        c21681519tF.LJI = Integer.MIN_VALUE;
    }

    public void calculateExtraLayoutSpace(C21673919s1 c21673919s1, int[] iArr) {
        int i;
        int extraLayoutSpace = getExtraLayoutSpace(c21673919s1);
        if (this.mLayoutState.LJFF == -1) {
            i = 0;
        } else {
            i = extraLayoutSpace;
            extraLayoutSpace = 0;
        }
        iArr[0] = extraLayoutSpace;
        iArr[1] = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectInitialPrefetchPositions(int i, InterfaceC21677219sY interfaceC21677219sY) {
        boolean z;
        int i2;
        int i3;
        SavedState savedState = this.mPendingSavedState;
        int i4 = 1;
        if (savedState != null && (i2 = savedState.LL) >= 0) {
            z = savedState.LLILLL;
        } else {
            resolveShouldLayoutReverse();
            z = this.mShouldReverseLayout;
            i2 = this.mPendingScrollPosition;
            if (i2 == -1) {
                if (z) {
                    i2 = i - 1;
                    i4 = -1;
                } else {
                    i2 = 0;
                }
            }
            for (i3 = 0; i3 < this.mInitialPrefetchItemCount && i2 >= 0 && i2 < i; i3++) {
                ((C21673819s0) interfaceC21677219sY).LIZ(i2, 0);
                i2 += i4;
            }
            return;
        }
        if (z) {
            i4 = -1;
        }
        while (i3 < this.mInitialPrefetchItemCount) {
            ((C21673819s0) interfaceC21677219sY).LIZ(i2, 0);
            i2 += i4;
        }
    }

    public View findFirstVisibleChildClosestToEnd(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(0, getChildCount(), z, z2);
        }
        return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
    }

    public View findFirstVisibleChildClosestToStart(boolean z, boolean z2) {
        if (this.mShouldReverseLayout) {
            return findOneVisibleChild(getChildCount() - 1, -1, z, z2);
        }
        return findOneVisibleChild(0, getChildCount(), z, z2);
    }

    public View findOnePartiallyOrCompletelyInvisibleChild(int i, int i2) {
        int i3;
        int i4;
        ensureLayoutState();
        if (i2 <= i && i2 >= i) {
            return getChildAt(i);
        }
        if (this.mOrientationHelper.LJ(getChildAt(i)) < this.mOrientationHelper.LJIIJ()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.LIZ(i, i2, i3, i4);
        }
        return this.mVerticalBoundCheck.LIZ(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(RecyclerView recyclerView, C21673319rv c21673319rv) {
        super.onDetachedFromWindow(recyclerView, c21673319rv);
        if (this.mRecycleChildrenOnDetach) {
            removeAndRecycleAllViews(c21673319rv);
            c21673319rv.LIZLLL();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int iFixLayoutEndGap;
        int i6;
        View viewFindViewByPosition;
        int iLJ;
        int iLJI;
        int i7;
        int i8 = -1;
        if ((this.mPendingSavedState != null || this.mPendingScrollPosition != -1) && c21673919s1.LIZIZ() == 0) {
            removeAndRecycleAllViews(c21673319rv);
            return;
        }
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null && (i7 = savedState.LL) >= 0) {
            this.mPendingScrollPosition = i7;
        }
        ensureLayoutState();
        this.mLayoutState.LIZ = false;
        resolveShouldLayoutReverse();
        View focusedChild = getFocusedChild();
        C21681419tE c21681419tE = this.mAnchorInfo;
        if (c21681419tE.LJ && this.mPendingScrollPosition == -1 && this.mPendingSavedState == null) {
            if (focusedChild != null && (this.mOrientationHelper.LJ(focusedChild) >= this.mOrientationHelper.LJI() || this.mOrientationHelper.LIZIZ(focusedChild) <= this.mOrientationHelper.LJIIJ())) {
                this.mAnchorInfo.LIZJ(getPosition(focusedChild), focusedChild);
            }
        } else {
            c21681419tE.LIZLLL();
            C21681419tE c21681419tE2 = this.mAnchorInfo;
            c21681419tE2.LIZLLL = this.mShouldReverseLayout ^ this.mStackFromEnd;
            updateAnchorInfoForLayout(c21673319rv, c21673919s1, c21681419tE2);
            this.mAnchorInfo.LJ = true;
        }
        C21681519tF c21681519tF = this.mLayoutState;
        if (c21681519tF.LJIIIZ >= 0) {
            i = 1;
        } else {
            i = -1;
        }
        c21681519tF.LJFF = i;
        int[] iArr = this.mReusableIntPair;
        iArr[0] = 0;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c21673919s1, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]) + this.mOrientationHelper.LJIIJ();
        int iMax2 = Math.max(0, this.mReusableIntPair[1]) + this.mOrientationHelper.LJII();
        if (c21673919s1.LJI && (i6 = this.mPendingScrollPosition) != -1 && this.mPendingScrollPositionOffset != Integer.MIN_VALUE && (viewFindViewByPosition = findViewByPosition(i6)) != null) {
            if (this.mShouldReverseLayout) {
                iLJI = this.mOrientationHelper.LJI() - this.mOrientationHelper.LIZIZ(viewFindViewByPosition);
                iLJ = this.mPendingScrollPositionOffset;
            } else {
                iLJ = this.mOrientationHelper.LJ(viewFindViewByPosition) - this.mOrientationHelper.LJIIJ();
                iLJI = this.mPendingScrollPositionOffset;
            }
            int i9 = iLJI - iLJ;
            if (i9 > 0) {
                iMax += i9;
            } else {
                iMax2 -= i9;
            }
        }
        C21681419tE c21681419tE3 = this.mAnchorInfo;
        if (!c21681419tE3.LIZLLL ? !this.mShouldReverseLayout : this.mShouldReverseLayout) {
            i8 = 1;
        }
        onAnchorReady(c21673319rv, c21673919s1, c21681419tE3, i8);
        detachAndScrapAttachedViews(c21673319rv);
        this.mLayoutState.LJIIJJI = resolveIsInfinite();
        this.mLayoutState.getClass();
        this.mLayoutState.LJIIIIZZ = 0;
        C21681419tE c21681419tE4 = this.mAnchorInfo;
        if (c21681419tE4.LIZLLL) {
            updateLayoutStateToFillStart(c21681419tE4);
            C21681519tF c21681519tF2 = this.mLayoutState;
            c21681519tF2.LJII = iMax;
            fill(c21673319rv, c21681519tF2, c21673919s1, false);
            C21681519tF c21681519tF3 = this.mLayoutState;
            i3 = c21681519tF3.LIZIZ;
            int i10 = c21681519tF3.LIZLLL;
            int i11 = c21681519tF3.LIZJ;
            if (i11 > 0) {
                iMax2 += i11;
            }
            updateLayoutStateToFillEnd(this.mAnchorInfo);
            C21681519tF c21681519tF4 = this.mLayoutState;
            c21681519tF4.LJII = iMax2;
            c21681519tF4.LIZLLL += c21681519tF4.LJ;
            fill(c21673319rv, c21681519tF4, c21673919s1, false);
            C21681519tF c21681519tF5 = this.mLayoutState;
            i2 = c21681519tF5.LIZIZ;
            int i12 = c21681519tF5.LIZJ;
            if (i12 > 0) {
                updateLayoutStateToFillStart(i10, i3);
                C21681519tF c21681519tF6 = this.mLayoutState;
                c21681519tF6.LJII = i12;
                fill(c21673319rv, c21681519tF6, c21673919s1, false);
                i3 = this.mLayoutState.LIZIZ;
            }
        } else {
            updateLayoutStateToFillEnd(c21681419tE4);
            C21681519tF c21681519tF7 = this.mLayoutState;
            c21681519tF7.LJII = iMax2;
            fill(c21673319rv, c21681519tF7, c21673919s1, false);
            C21681519tF c21681519tF8 = this.mLayoutState;
            i2 = c21681519tF8.LIZIZ;
            int i13 = c21681519tF8.LIZLLL;
            int i14 = c21681519tF8.LIZJ;
            if (i14 > 0) {
                iMax += i14;
            }
            updateLayoutStateToFillStart(this.mAnchorInfo);
            C21681519tF c21681519tF9 = this.mLayoutState;
            c21681519tF9.LJII = iMax;
            c21681519tF9.LIZLLL += c21681519tF9.LJ;
            fill(c21673319rv, c21681519tF9, c21673919s1, false);
            C21681519tF c21681519tF10 = this.mLayoutState;
            i3 = c21681519tF10.LIZIZ;
            int i15 = c21681519tF10.LIZJ;
            if (i15 > 0) {
                updateLayoutStateToFillEnd(i13, i2);
                C21681519tF c21681519tF11 = this.mLayoutState;
                c21681519tF11.LJII = i15;
                fill(c21673319rv, c21681519tF11, c21673919s1, false);
                i2 = this.mLayoutState.LIZIZ;
            }
        }
        if (getChildCount() > 0) {
            if (this.mShouldReverseLayout ^ this.mStackFromEnd) {
                int iFixLayoutEndGap2 = fixLayoutEndGap(i2, c21673319rv, c21673919s1, true);
                i4 = i3 + iFixLayoutEndGap2;
                i5 = i2 + iFixLayoutEndGap2;
                iFixLayoutEndGap = fixLayoutStartGap(i4, c21673319rv, c21673919s1, false);
            } else {
                int iFixLayoutStartGap = fixLayoutStartGap(i3, c21673319rv, c21673919s1, true);
                i4 = i3 + iFixLayoutStartGap;
                i5 = i2 + iFixLayoutStartGap;
                iFixLayoutEndGap = fixLayoutEndGap(i5, c21673319rv, c21673919s1, false);
            }
            i3 = i4 + iFixLayoutEndGap;
            i2 = i5 + iFixLayoutEndGap;
        }
        layoutForPredictiveAnimations(c21673319rv, c21673919s1, i3, i2);
        if (!c21673919s1.LJI) {
            AbstractC21679819sy abstractC21679819sy = this.mOrientationHelper;
            abstractC21679819sy.LIZIZ = abstractC21679819sy.LJIIJJI();
        } else {
            this.mAnchorInfo.LIZLLL();
        }
        this.mLastStackFromEnd = this.mStackFromEnd;
    }

    public void scrollToPositionWithOffset(int i, int i2) {
        this.mPendingScrollPosition = i;
        this.mPendingScrollPositionOffset = i2;
        SavedState savedState = this.mPendingSavedState;
        if (savedState != null) {
            savedState.LL = -1;
        }
        requestLayout();
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.mOrientation = 1;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo = new C21681419tE();
        this.mLayoutChunkResult = new C21682119tL();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        setOrientation(i);
        setReverseLayout(z);
    }

    private void recycleChildren(C21673319rv c21673319rv, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                removeAndRecycleViewAt(i3, c21673319rv);
            }
            return;
        }
        while (i > i2) {
            removeAndRecycleViewAt(i, c21673319rv);
            i--;
        }
    }

    private void recycleViewsFromEnd(C21673319rv c21673319rv, int i, int i2) {
        int childCount = getChildCount();
        if (i < 0) {
            return;
        }
        int iLJFF = (this.mOrientationHelper.LJFF() - i) + i2;
        if (this.mShouldReverseLayout) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (this.mOrientationHelper.LJ(childAt) < iLJFF || this.mOrientationHelper.LJIILJJIL(childAt) < iLJFF) {
                    recycleChildren(c21673319rv, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = childCount - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            if (this.mOrientationHelper.LJ(childAt2) < iLJFF || this.mOrientationHelper.LJIILJJIL(childAt2) < iLJFF) {
                recycleChildren(c21673319rv, i4, i5);
                return;
            }
        }
    }

    private void recycleViewsFromStart(C21673319rv c21673319rv, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int childCount = getChildCount();
        if (this.mShouldReverseLayout) {
            int i4 = childCount - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View childAt = getChildAt(i5);
                if (this.mOrientationHelper.LIZIZ(childAt) > i3 || this.mOrientationHelper.LJIILIIL(childAt) > i3) {
                    recycleChildren(c21673319rv, i4, i5);
                    return;
                }
            }
            return;
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (this.mOrientationHelper.LIZIZ(childAt2) > i3 || this.mOrientationHelper.LJIILIIL(childAt2) > i3) {
                recycleChildren(c21673319rv, 0, i6);
                return;
            }
        }
    }

    private boolean updateAnchorFromChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1, C21681419tE c21681419tE) {
        View viewFindReferenceChild;
        boolean z;
        boolean z2 = false;
        if (getChildCount() == 0) {
            return false;
        }
        View focusedChild = getFocusedChild();
        if (focusedChild != null) {
            c21681419tE.getClass();
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) focusedChild.getLayoutParams();
            if (!layoutParams.isItemRemoved() && layoutParams.getViewLayoutPosition() >= 0 && layoutParams.getViewLayoutPosition() < c21673919s1.LIZIZ()) {
                c21681419tE.LIZJ(getPosition(focusedChild), focusedChild);
                return true;
            }
        }
        boolean z3 = this.mLastStackFromEnd;
        boolean z4 = this.mStackFromEnd;
        if (z3 != z4 || (viewFindReferenceChild = findReferenceChild(c21673319rv, c21673919s1, c21681419tE.LIZLLL, z4)) == null) {
            return false;
        }
        c21681419tE.LIZIZ(getPosition(viewFindReferenceChild), viewFindReferenceChild);
        if (!c21673919s1.LJI && supportsPredictiveItemAnimations()) {
            int iLJ = this.mOrientationHelper.LJ(viewFindReferenceChild);
            int iLIZIZ = this.mOrientationHelper.LIZIZ(viewFindReferenceChild);
            int iLJIIJ = this.mOrientationHelper.LJIIJ();
            int iLJI = this.mOrientationHelper.LJI();
            if (iLIZIZ <= iLJIIJ && iLJ < iLJIIJ) {
                z = true;
            } else {
                z = false;
            }
            if (iLJ >= iLJI && iLIZIZ > iLJI) {
                z2 = true;
            }
            if (z || z2) {
                if (c21681419tE.LIZLLL) {
                    iLJIIJ = iLJI;
                }
                c21681419tE.LIZJ = iLJIIJ;
            }
        }
        return true;
    }

    private void updateAnchorInfoForLayout(C21673319rv c21673319rv, C21673919s1 c21673919s1, C21681419tE c21681419tE) {
        int iLIZIZ;
        if (updateAnchorFromPendingData(c21673919s1, c21681419tE) || updateAnchorFromChildren(c21673319rv, c21673919s1, c21681419tE)) {
            return;
        }
        c21681419tE.LIZ();
        if (this.mStackFromEnd) {
            iLIZIZ = c21673919s1.LIZIZ() - 1;
        } else {
            iLIZIZ = 0;
        }
        c21681419tE.LIZIZ = iLIZIZ;
    }

    public void collectPrefetchPositionsForLayoutState(C21673919s1 c21673919s1, C21681519tF c21681519tF, InterfaceC21677219sY interfaceC21677219sY) {
        int i = c21681519tF.LIZLLL;
        if (i >= 0 && i < c21673919s1.LIZIZ()) {
            ((C21673819s0) interfaceC21677219sY).LIZ(i, Math.max(0, c21681519tF.LJI));
        }
    }

    public int scrollBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        int i2;
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        ensureLayoutState();
        this.mLayoutState.LIZ = true;
        if (i > 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int iAbs = Math.abs(i);
        updateLayoutState(i2, iAbs, true, c21673919s1);
        C21681519tF c21681519tF = this.mLayoutState;
        int iFill = c21681519tF.LJI + fill(c21673319rv, c21681519tF, c21673919s1, false);
        if (iFill < 0) {
            return 0;
        }
        if (iAbs > iFill) {
            i = i2 * iFill;
        }
        this.mOrientationHelper.LJIILL(-i);
        this.mLayoutState.LJIIIZ = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (this.mOrientation == 1) {
            return 0;
        }
        return scrollBy(i, c21673319rv, c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        if (this.mOrientation == 0) {
            return 0;
        }
        return scrollBy(i, c21673319rv, c21673919s1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        C21674119s3 c21674119s3 = new C21674119s3(recyclerView.getContext());
        c21674119s3.LIZ = i;
        startSmoothScroll(c21674119s3);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.mOrientation = 1;
        this.mSmoothScrollbarEnabled = true;
        this.mPendingScrollPosition = -1;
        this.mPendingScrollPositionOffset = Integer.MIN_VALUE;
        this.mAnchorInfo = new C21681419tE();
        this.mLayoutChunkResult = new C21682119tL();
        this.mInitialPrefetchItemCount = 2;
        this.mReusableIntPair = new int[2];
        C21675919sL properties = RecyclerView.LayoutManager.getProperties(context, attributeSet, i, i2);
        setOrientation(properties.LIZ);
        setReverseLayout(properties.LIZJ);
        setStackFromEnd(properties.LIZLLL);
    }

    private int fixLayoutEndGap(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1, boolean z) {
        int iLJI;
        int iLJI2 = this.mOrientationHelper.LJI() - i;
        if (iLJI2 > 0) {
            int i2 = -scrollBy(-iLJI2, c21673319rv, c21673919s1);
            int i3 = i + i2;
            if (z && (iLJI = this.mOrientationHelper.LJI() - i3) > 0) {
                this.mOrientationHelper.LJIILL(iLJI);
                return iLJI + i2;
            }
            return i2;
        }
        return 0;
    }

    private int fixLayoutStartGap(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1, boolean z) {
        int iLJIIJ;
        int iLJIIJ2 = i - this.mOrientationHelper.LJIIJ();
        if (iLJIIJ2 > 0) {
            int i2 = -scrollBy(iLJIIJ2, c21673319rv, c21673919s1);
            int i3 = i + i2;
            if (z && (iLJIIJ = i3 - this.mOrientationHelper.LJIIJ()) > 0) {
                this.mOrientationHelper.LJIILL(-iLJIIJ);
                return i2 - iLJIIJ;
            }
            return i2;
        }
        return 0;
    }

    private void layoutForPredictiveAnimations(C21673319rv c21673319rv, C21673919s1 c21673919s1, int i, int i2) {
        boolean z;
        if (c21673919s1.LJIIJ && getChildCount() != 0 && !c21673919s1.LJI && supportsPredictiveItemAnimations()) {
            List<RecyclerView.ViewHolder> list = c21673319rv.LIZLLL;
            int size = list.size();
            int position = getPosition(getChildAt(0));
            int iLIZJ = 0;
            int iLIZJ2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) ListProtector.get(list, i3);
                if (!viewHolder.isRemoved()) {
                    if (viewHolder.getLayoutPosition() < position) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z != this.mShouldReverseLayout) {
                        iLIZJ += this.mOrientationHelper.LIZJ(viewHolder.itemView);
                    } else {
                        iLIZJ2 += this.mOrientationHelper.LIZJ(viewHolder.itemView);
                    }
                }
            }
            this.mLayoutState.LJIIJ = list;
            if (iLIZJ > 0) {
                updateLayoutStateToFillStart(getPosition(getChildClosestToStart()), i);
                C21681519tF c21681519tF = this.mLayoutState;
                c21681519tF.LJII = iLIZJ;
                c21681519tF.LIZJ = 0;
                c21681519tF.LIZ(null);
                fill(c21673319rv, this.mLayoutState, c21673919s1, false);
            }
            if (iLIZJ2 > 0) {
                updateLayoutStateToFillEnd(getPosition(getChildClosestToEnd()), i2);
                C21681519tF c21681519tF2 = this.mLayoutState;
                c21681519tF2.LJII = iLIZJ2;
                c21681519tF2.LIZJ = 0;
                c21681519tF2.LIZ(null);
                fill(c21673319rv, this.mLayoutState, c21673919s1, false);
            }
            this.mLayoutState.LJIIJ = null;
        }
    }

    private void updateLayoutState(int i, int i2, boolean z, C21673919s1 c21673919s1) {
        int i3;
        int iLJIIJ;
        this.mLayoutState.LJIIJJI = resolveIsInfinite();
        this.mLayoutState.LJFF = i;
        int[] iArr = this.mReusableIntPair;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        calculateExtraLayoutSpace(c21673919s1, iArr);
        int iMax = Math.max(0, this.mReusableIntPair[0]);
        int iMax2 = Math.max(0, this.mReusableIntPair[1]);
        if (i == 1) {
            z2 = true;
        }
        C21681519tF c21681519tF = this.mLayoutState;
        if (z2) {
            i3 = iMax2;
        } else {
            i3 = iMax;
        }
        c21681519tF.LJII = i3;
        if (!z2) {
            iMax = iMax2;
        }
        c21681519tF.LJIIIIZZ = iMax;
        if (z2) {
            c21681519tF.LJII = i3 + this.mOrientationHelper.LJII();
            View childClosestToEnd = getChildClosestToEnd();
            C21681519tF c21681519tF2 = this.mLayoutState;
            if (this.mShouldReverseLayout) {
                i4 = -1;
            }
            c21681519tF2.LJ = i4;
            int position = getPosition(childClosestToEnd);
            C21681519tF c21681519tF3 = this.mLayoutState;
            c21681519tF2.LIZLLL = position + c21681519tF3.LJ;
            c21681519tF3.LIZIZ = this.mOrientationHelper.LIZIZ(childClosestToEnd);
            iLJIIJ = this.mOrientationHelper.LIZIZ(childClosestToEnd) - this.mOrientationHelper.LJI();
        } else {
            View childClosestToStart = getChildClosestToStart();
            this.mLayoutState.LJII += this.mOrientationHelper.LJIIJ();
            C21681519tF c21681519tF4 = this.mLayoutState;
            if (!this.mShouldReverseLayout) {
                i4 = -1;
            }
            c21681519tF4.LJ = i4;
            int position2 = getPosition(childClosestToStart);
            C21681519tF c21681519tF5 = this.mLayoutState;
            c21681519tF4.LIZLLL = position2 + c21681519tF5.LJ;
            c21681519tF5.LIZIZ = this.mOrientationHelper.LJ(childClosestToStart);
            iLJIIJ = (-this.mOrientationHelper.LJ(childClosestToStart)) + this.mOrientationHelper.LJIIJ();
        }
        C21681519tF c21681519tF6 = this.mLayoutState;
        c21681519tF6.LIZJ = i2;
        if (z) {
            c21681519tF6.LIZJ = i2 - iLJIIJ;
        }
        c21681519tF6.LJI = iLJIIJ;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void collectAdjacentPrefetchPositions(int i, int i2, C21673919s1 c21673919s1, InterfaceC21677219sY interfaceC21677219sY) {
        int i3;
        if (this.mOrientation != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            ensureLayoutState();
            if (i > 0) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            updateLayoutState(i3, Math.abs(i), true, c21673919s1);
            collectPrefetchPositionsForLayoutState(c21673919s1, this.mLayoutState, interfaceC21677219sY);
        }
    }

    public int fill(C21673319rv c21673319rv, C21681519tF c21681519tF, C21673919s1 c21673919s1, boolean z) {
        int i;
        int i2 = c21681519tF.LIZJ;
        int i3 = c21681519tF.LJI;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                c21681519tF.LJI = i3 + i2;
            }
            recycleByLayoutState(c21673319rv, c21681519tF);
        }
        int i4 = c21681519tF.LIZJ + c21681519tF.LJII;
        C21682119tL c21682119tL = this.mLayoutChunkResult;
        while (true) {
            if ((!c21681519tF.LJIIJJI && i4 <= 0) || (i = c21681519tF.LIZLLL) < 0 || i >= c21673919s1.LIZIZ()) {
                break;
            }
            c21682119tL.LIZ = 0;
            c21682119tL.LIZIZ = false;
            c21682119tL.LIZJ = false;
            c21682119tL.LIZLLL = false;
            layoutChunk(c21673319rv, c21673919s1, c21681519tF, c21682119tL);
            if (!c21682119tL.LIZIZ) {
                int i5 = c21681519tF.LIZIZ;
                int i6 = c21682119tL.LIZ;
                c21681519tF.LIZIZ = i5 + (c21681519tF.LJFF * i6);
                if (!c21682119tL.LIZJ || c21681519tF.LJIIJ != null || !c21673919s1.LJI) {
                    c21681519tF.LIZJ -= i6;
                    i4 -= i6;
                }
                int i7 = c21681519tF.LJI;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    c21681519tF.LJI = i8;
                    int i9 = c21681519tF.LIZJ;
                    if (i9 < 0) {
                        c21681519tF.LJI = i8 + i9;
                    }
                    recycleByLayoutState(c21673319rv, c21681519tF);
                }
                if (z && c21682119tL.LIZLLL) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - c21681519tF.LIZJ;
    }

    public View findOneVisibleChild(int i, int i2, boolean z, boolean z2) {
        int i3;
        ensureLayoutState();
        int i4 = 320;
        if (z) {
            i3 = 24579;
        } else {
            i3 = 320;
        }
        if (!z2) {
            i4 = 0;
        }
        if (this.mOrientation == 0) {
            return this.mHorizontalBoundCheck.LIZ(i, i2, i3, i4);
        }
        return this.mVerticalBoundCheck.LIZ(i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View findReferenceChild(X.C21673319rv r15, X.C21673919s1 r16, boolean r17, boolean r18) {
        /*
            r14 = this;
            r14.ensureLayoutState()
            int r8 = r14.getChildCount()
            r0 = 1
            if (r18 == 0) goto L71
            int r9 = r14.getChildCount()
            int r9 = r9 - r0
            r8 = -1
            r13 = -1
        L11:
            int r7 = r16.LIZIZ()
            X.19sy r0 = r14.mOrientationHelper
            int r6 = r0.LJIIJ()
            X.19sy r0 = r14.mOrientationHelper
            int r5 = r0.LJI()
            r12 = 0
            r11 = r12
            r10 = r12
        L24:
            if (r9 == r8) goto L74
            android.view.View r4 = r14.getChildAt(r9)
            int r1 = r14.getPosition(r4)
            X.19sy r0 = r14.mOrientationHelper
            int r3 = r0.LJ(r4)
            X.19sy r0 = r14.mOrientationHelper
            int r2 = r0.LIZIZ(r4)
            if (r1 < 0) goto L4d
            if (r1 >= r7) goto L4d
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r0 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r0
            boolean r0 = r0.isItemRemoved()
            if (r0 == 0) goto L4f
            if (r10 != 0) goto L4d
            r10 = r4
        L4d:
            int r9 = r9 + r13
            goto L24
        L4f:
            if (r2 > r6) goto L60
            if (r3 >= r6) goto L60
            r1 = 1
        L54:
            if (r3 < r5) goto L5e
            if (r2 <= r5) goto L5e
            r0 = 1
        L59:
            if (r1 != 0) goto L62
            if (r0 != 0) goto L62
            return r4
        L5e:
            r0 = 0
            goto L59
        L60:
            r1 = 0
            goto L54
        L62:
            if (r17 == 0) goto L6a
            if (r0 != 0) goto L6f
            if (r12 != 0) goto L4d
        L68:
            r12 = r4
            goto L4d
        L6a:
            if (r1 != 0) goto L6f
            if (r12 != 0) goto L4d
            goto L68
        L6f:
            r11 = r4
            goto L4d
        L71:
            r9 = 0
            r13 = 1
            goto L11
        L74:
            if (r12 != 0) goto L7a
            if (r11 == 0) goto L79
            return r11
        L79:
            return r10
        L7a:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.findReferenceChild(X.19rv, X.19s1, boolean, boolean):android.view.View");
    }

    public void layoutChunk(C21673319rv c21673319rv, C21673919s1 c21673919s1, C21681519tF c21681519tF, C21682119tL c21682119tL) {
        boolean z;
        int paddingTop;
        int iLIZLLL;
        int paddingLeft;
        int iLIZLLL2;
        boolean z2;
        View viewLIZIZ = c21681519tF.LIZIZ(c21673319rv);
        if (viewLIZIZ == null) {
            c21682119tL.LIZIZ = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewLIZIZ.getLayoutParams();
        if (c21681519tF.LJIIJ == null) {
            boolean z3 = this.mShouldReverseLayout;
            if (c21681519tF.LJFF == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                addView(viewLIZIZ);
            } else {
                addView(viewLIZIZ, 0);
            }
        } else {
            boolean z4 = this.mShouldReverseLayout;
            if (c21681519tF.LJFF == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                addDisappearingView(viewLIZIZ);
            } else {
                addDisappearingView(viewLIZIZ, 0);
            }
        }
        measureChildWithMargins(viewLIZIZ, 0, 0);
        c21682119tL.LIZ = this.mOrientationHelper.LIZJ(viewLIZIZ);
        if (this.mOrientation == 1) {
            if (isLayoutRTL()) {
                iLIZLLL2 = getWidth() - getPaddingRight();
                paddingLeft = iLIZLLL2 - this.mOrientationHelper.LIZLLL(viewLIZIZ);
            } else {
                paddingLeft = getPaddingLeft();
                iLIZLLL2 = this.mOrientationHelper.LIZLLL(viewLIZIZ) + paddingLeft;
            }
            if (c21681519tF.LJFF == -1) {
                iLIZLLL = c21681519tF.LIZIZ;
                paddingTop = iLIZLLL - c21682119tL.LIZ;
            } else {
                paddingTop = c21681519tF.LIZIZ;
                iLIZLLL = c21682119tL.LIZ + paddingTop;
            }
        } else {
            paddingTop = getPaddingTop();
            iLIZLLL = this.mOrientationHelper.LIZLLL(viewLIZIZ) + paddingTop;
            if (c21681519tF.LJFF == -1) {
                iLIZLLL2 = c21681519tF.LIZIZ;
                paddingLeft = iLIZLLL2 - c21682119tL.LIZ;
            } else {
                paddingLeft = c21681519tF.LIZIZ;
                iLIZLLL2 = c21682119tL.LIZ + paddingLeft;
            }
        }
        layoutDecoratedWithMargins(viewLIZIZ, paddingLeft, paddingTop, iLIZLLL2, iLIZLLL);
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            c21682119tL.LIZJ = true;
        }
        c21682119tL.LIZLLL = viewLIZIZ.hasFocusable();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051 A[RETURN] */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onFocusSearchFailed(android.view.View r6, int r7, X.C21673319rv r8, X.C21673919s1 r9) {
        /*
            r5 = this;
            r5.resolveShouldLayoutReverse()
            int r0 = r5.getChildCount()
            r4 = 0
            if (r0 != 0) goto Lb
            return r4
        Lb:
            int r3 = r5.convertFocusDirectionToLayoutDirection(r7)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r2) goto L14
            return r4
        L14:
            r5.ensureLayoutState()
            X.19sy r0 = r5.mOrientationHelper
            int r0 = r0.LJIIJJI()
            float r1 = (float) r0
            r0 = 1051372203(0x3eaaaaab, float:0.33333334)
            float r1 = r1 * r0
            int r1 = (int) r1
            r0 = 0
            r5.updateLayoutState(r3, r1, r0, r9)
            X.19tF r1 = r5.mLayoutState
            r1.LJI = r2
            r1.LIZ = r0
            r0 = 1
            r5.fill(r8, r1, r9, r0)
            r0 = -1
            if (r3 != r0) goto L45
            android.view.View r2 = r5.findPartiallyOrCompletelyInvisibleChildClosestToStart()
        L38:
            android.view.View r1 = r5.getChildClosestToStart()
        L3c:
            boolean r0 = r1.hasFocusable()
            if (r0 == 0) goto L51
            if (r2 != 0) goto L50
            return r4
        L45:
            android.view.View r2 = r5.findPartiallyOrCompletelyInvisibleChildClosestToEnd()
            if (r3 == r0) goto L38
            android.view.View r1 = r5.getChildClosestToEnd()
            goto L3c
        L50:
            return r1
        L51:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.onFocusSearchFailed(android.view.View, int, X.19rv, X.19s1):android.view.View");
    }

    @Override // X.InterfaceC21688919uR
    public void prepareForDrop(View view, View view2, int i, int i2) {
        byte b;
        assertNotInLayoutOrScroll("Cannot drop a view during a scroll or layout calculation");
        ensureLayoutState();
        resolveShouldLayoutReverse();
        int position = getPosition(view);
        int position2 = getPosition(view2);
        if (position < position2) {
            b = 1;
        } else {
            b = -1;
        }
        if (this.mShouldReverseLayout) {
            if (b == 1) {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.LJI() - (this.mOrientationHelper.LJ(view2) + this.mOrientationHelper.LIZJ(view)));
                return;
            } else {
                scrollToPositionWithOffset(position2, this.mOrientationHelper.LJI() - this.mOrientationHelper.LIZIZ(view2));
                return;
            }
        }
        if (b == -1) {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.LJ(view2));
        } else {
            scrollToPositionWithOffset(position2, this.mOrientationHelper.LIZIZ(view2) - this.mOrientationHelper.LIZJ(view));
        }
    }
}
