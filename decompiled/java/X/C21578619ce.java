package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.NestedScrollView$SavedState;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import u4.q0;

/* JADX INFO: renamed from: X.19ce, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21578619ce extends FrameLayout implements InterfaceC1318440kPi, InterfaceC20097013kG, InterfaceC1354050lL9 {
    public int mActivePointerId;
    public final C1318260kPQ mChildHelper;
    public View mChildToScrollTo;
    public C21578719cf mDifferentialMotionFlingController;
    public final C21579019ci mDifferentialMotionFlingTarget;
    public EdgeEffect mEdgeGlowBottom;
    public EdgeEffect mEdgeGlowTop;
    public boolean mFillViewport;
    public boolean mIsBeingDragged;
    public boolean mIsLaidOut;
    public boolean mIsLayoutDirty;
    public int mLastMotionY;
    public long mLastScroll;
    public int mLastScrollerY;
    public int mMaximumVelocity;
    public int mMinimumVelocity;
    public int mNestedYOffset;
    public InterfaceC1809520xBm mOnScrollChangeListener;
    public final C1317550kOH mParentHelper;
    public final float mPhysicalCoeff;
    public NestedScrollView$SavedState mSavedState;
    public final int[] mScrollConsumed;
    public final int[] mScrollOffset;
    public OverScroller mScroller;
    public boolean mSmoothScrollingEnabled;
    public final Rect mTempRect;
    public int mTouchSlop;
    public VelocityTracker mVelocityTracker;
    public float mVerticalScrollFactor;
    public static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final C1318910kQT ACCESSIBILITY_DELEGATE = new C20094213jo() { // from class: X.0kQT
        @Override // X.C20094213jo
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            C21578619ce c21578619ce = (C21578619ce) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (c21578619ce.getScrollRange() > 0) {
                z = true;
            } else {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            accessibilityEvent.setScrollX(c21578619ce.getScrollX());
            accessibilityEvent.setScrollY(c21578619ce.getScrollY());
            accessibilityEvent.setMaxScrollX(c21578619ce.getScrollX());
            accessibilityEvent.setMaxScrollY(c21578619ce.getScrollRange());
        }

        @Override // X.C20094213jo
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            C21578619ce c21578619ce = (C21578619ce) view;
            accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
            if (c21578619ce.isEnabled() && (scrollRange = c21578619ce.getScrollRange()) > 0) {
                accessibilityNodeInfoCompat.setScrollable(true);
                if (c21578619ce.getScrollY() > 0) {
                    accessibilityNodeInfoCompat.addAction(C20092413jW.LJIILL);
                    accessibilityNodeInfoCompat.addAction(C20092413jW.LJJIFFI);
                }
                if (c21578619ce.getScrollY() < scrollRange) {
                    accessibilityNodeInfoCompat.addAction(C20092413jW.LJIILJJIL);
                    accessibilityNodeInfoCompat.addAction(C20092413jW.LJJIII);
                }
            }
        }

        @Override // X.C20094213jo
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            C21578619ce c21578619ce = (C21578619ce) view;
            if (!c21578619ce.isEnabled()) {
                return false;
            }
            int height = c21578619ce.getHeight();
            Rect rect = new Rect();
            if (c21578619ce.getMatrix().isIdentity() && c21578619ce.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i != 8192 && i != 16908344) {
                    if (i != 16908346) {
                        return false;
                    }
                } else {
                    int iMax = Math.max(c21578619ce.getScrollY() - ((height - c21578619ce.getPaddingBottom()) - c21578619ce.getPaddingTop()), 0);
                    if (iMax == c21578619ce.getScrollY()) {
                        return false;
                    }
                    c21578619ce.smoothScrollTo(0, iMax, true);
                    return true;
                }
            }
            int iMin = Math.min(c21578619ce.getScrollY() + ((height - c21578619ce.getPaddingBottom()) - c21578619ce.getPaddingTop()), c21578619ce.getScrollRange());
            if (iMin == c21578619ce.getScrollY()) {
                return false;
            }
            c21578619ce.smoothScrollTo(0, iMin, true);
            return true;
        }
    };
    public static final int[] SCROLLVIEW_STYLEABLE = {R.attr.fillViewport};

    public static int clamp(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    private void endTouchDrag() {
        this.mActivePointerId = -1;
        this.mIsBeingDragged = false;
        recycleVelocityTracker();
        stopNestedScroll(0);
        this.mEdgeGlowTop.onRelease();
        this.mEdgeGlowBottom.onRelease();
    }

    @Override // android.view.View, X.InterfaceC1354050lL9
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // X.InterfaceC1318370kPb
    public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.mIsLayoutDirty = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    private void abortAnimatedScroll() {
        this.mScroller.abortAnimation();
        stopNestedScroll(1);
    }

    private void initOrResetVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void initScrollView() {
        this.mScroller = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMinimumVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void initVelocityTrackerIfNotExists() {
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
    }

    private void recycleVelocityTracker() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.mScroller.isFinished()) {
            return;
        }
        this.mScroller.computeScrollOffset();
        int currY = this.mScroller.getCurrY();
        int iConsumeFlingInVerticalStretch = consumeFlingInVerticalStretch(currY - this.mLastScrollerY);
        this.mLastScrollerY = currY;
        int[] iArr = this.mScrollConsumed;
        iArr[1] = 0;
        dispatchNestedPreScroll(0, iConsumeFlingInVerticalStretch, iArr, null, 1);
        int i = iConsumeFlingInVerticalStretch - this.mScrollConsumed[1];
        int scrollRange = getScrollRange();
        if (i != 0) {
            int scrollY = getScrollY();
            overScrollByCompat(0, i, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i2 = i - scrollY2;
            int[] iArr2 = this.mScrollConsumed;
            iArr2[1] = 0;
            dispatchNestedScroll(0, scrollY2, 0, i2, this.mScrollOffset, 1, iArr2);
            int i3 = i2 - this.mScrollConsumed[1];
            if (i3 != 0) {
                int overScrollMode = getOverScrollMode();
                if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i3 < 0) {
                        if (this.mEdgeGlowTop.isFinished()) {
                            this.mEdgeGlowTop.onAbsorb((int) this.mScroller.getCurrVelocity());
                        }
                    } else if (this.mEdgeGlowBottom.isFinished()) {
                        this.mEdgeGlowBottom.onAbsorb((int) this.mScroller.getCurrVelocity());
                    }
                }
                abortAnimatedScroll();
            }
        }
        if (this.mScroller.isFinished()) {
            stopNestedScroll(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1317550kOH c1317550kOH = this.mParentHelper;
        return c1317550kOH.LIZIZ | c1317550kOH.LIZ;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.mVerticalScrollFactor == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.mVerticalScrollFactor = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.mVerticalScrollFactor;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.mChildHelper.LIZLLL;
    }

    private boolean canOverScroll() {
        int overScrollMode = getOverScrollMode();
        return overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0);
    }

    private boolean canScroll() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, X.InterfaceC1354050lL9
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mIsLaidOut = false;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        NestedScrollView$SavedState nestedScrollView$SavedState = new NestedScrollView$SavedState(super.onSaveInstanceState());
        nestedScrollView$SavedState.scrollPosition = getScrollY();
        return nestedScrollView$SavedState;
    }

    public boolean isFillViewport() {
        return this.mFillViewport;
    }

    public boolean isSmoothScrollingEnabled() {
        return this.mSmoothScrollingEnabled;
    }

    public C21578619ce(Context context) {
        this(context, null);
    }

    private void doScrollY(int i) {
        if (i != 0) {
            if (this.mSmoothScrollingEnabled) {
                smoothScrollBy(0, i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    private boolean edgeEffectFling(int i) {
        if (C20097913kP.LIZJ(this.mEdgeGlowTop) != 0.0f) {
            if (shouldAbsorb(this.mEdgeGlowTop, i)) {
                this.mEdgeGlowTop.onAbsorb(i);
                return true;
            }
            fling(-i);
            return true;
        }
        if (C20097913kP.LIZJ(this.mEdgeGlowBottom) != 0.0f) {
            int i2 = -i;
            if (shouldAbsorb(this.mEdgeGlowBottom, i2)) {
                this.mEdgeGlowBottom.onAbsorb(i2);
                return true;
            }
            fling(i2);
            return true;
        }
        return false;
    }

    private float getSplineFlingDistance(int i) {
        double dLog = Math.log((Math.abs(i) * 0.35f) / (this.mPhysicalCoeff * 0.015f));
        float f = DECELERATION_RATE;
        return (float) (((double) (this.mPhysicalCoeff * 0.015f)) * Math.exp((((double) f) / (((double) f) - 1.0d)) * dLog));
    }

    private boolean isOffScreen(View view) {
        return !isWithinDeltaOfScreen(view, 0, getHeight());
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.mLastMotionY = (int) motionEvent.getY(i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void runAnimatedScroll(boolean z) {
        if (z) {
            startNestedScroll(2, 1);
        } else {
            stopNestedScroll(1);
        }
        this.mLastScrollerY = getScrollY();
        postInvalidateOnAnimation();
    }

    private void scrollToChild(View view) {
        view.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(this.mTempRect);
        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
        }
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z;
        if (C20097913kP.LIZJ(this.mEdgeGlowTop) != 0.0f) {
            C20097913kP.LJFF(this.mEdgeGlowTop, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (C20097913kP.LIZJ(this.mEdgeGlowBottom) != 0.0f) {
            C20097913kP.LJFF(this.mEdgeGlowBottom, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public boolean arrowScroll(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus != null && isWithinDeltaOfScreen(viewFindNextFocus, maxScrollAmount, getHeight())) {
            viewFindNextFocus.getDrawingRect(this.mTempRect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.mTempRect);
            scrollBy(computeScrollDeltaToGetChildRectOnScreen(this.mTempRect), 0, 1, true);
            viewFindNextFocus.requestFocus(i);
        } else {
            if (i == 33) {
                if (getScrollY() < maxScrollAmount) {
                    maxScrollAmount = getScrollY();
                }
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            scrollBy(maxScrollAmount, 0, 1, true);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && isOffScreen(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        int i;
        int i2;
        int i3;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i = i4 - verticalFadingEdgeLength;
        } else {
            i = i4;
        }
        int i5 = rect.bottom;
        if (i5 > i && rect.top > scrollY) {
            if (rect.height() > height) {
                i3 = rect.top - scrollY;
            } else {
                i3 = rect.bottom - i;
            }
            return Math.min(i3, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        }
        if (rect.top >= scrollY || i5 >= i) {
            return 0;
        }
        if (rect.height() > height) {
            i2 = 0 - (i - rect.bottom);
        } else {
            i2 = 0 - (scrollY - rect.top);
        }
        return Math.max(i2, -getScrollY());
    }

    public int consumeFlingInVerticalStretch(int i) {
        int height = getHeight();
        if (i > 0) {
            if (C20097913kP.LIZJ(this.mEdgeGlowTop) != 0.0f) {
                int iRound = Math.round(((-height) / 4.0f) * C20097913kP.LJFF(this.mEdgeGlowTop, ((-i) * 4.0f) / height, 0.5f));
                if (iRound != i) {
                    this.mEdgeGlowTop.finish();
                }
                return i - iRound;
            }
            return i;
        }
        if (i < 0 && C20097913kP.LIZJ(this.mEdgeGlowBottom) != 0.0f) {
            float f = height;
            int iRound2 = Math.round((f / 4.0f) * C20097913kP.LJFF(this.mEdgeGlowBottom, (i * 4.0f) / f, 0.5f));
            if (iRound2 != i) {
                this.mEdgeGlowBottom.finish();
            }
            return i - iRound2;
        }
        return i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !executeKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.mEdgeGlowTop.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (C21547519Uj.LIZ(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (C21547519Uj.LIZ(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.mEdgeGlowTop.setSize(width, height);
            if (this.mEdgeGlowTop.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (!this.mEdgeGlowBottom.isFinished()) {
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int iMax = Math.max(getScrollRange(), scrollY) + height2;
            if (C21547519Uj.LIZ(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                paddingLeft2 = 0 + getPaddingLeft();
            }
            if (C21547519Uj.LIZ(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                iMax -= getPaddingBottom();
            }
            canvas.translate(paddingLeft2 - width2, iMax);
            canvas.rotate(180.0f, width2, 0.0f);
            this.mEdgeGlowBottom.setSize(width2, height2);
            if (this.mEdgeGlowBottom.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave2);
        }
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        this.mTempRect.setEmpty();
        int i = 130;
        if (!canScroll()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) {
                return false;
            }
            return true;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        if (keyCode != 92) {
                            if (keyCode != 93) {
                                if (keyCode != 122) {
                                    if (keyCode == 123) {
                                        pageScroll(130);
                                    }
                                } else {
                                    pageScroll(33);
                                    return false;
                                }
                            } else {
                                return fullScroll(130);
                            }
                        } else {
                            return fullScroll(33);
                        }
                    } else {
                        if (keyEvent.isShiftPressed()) {
                            i = 33;
                        }
                        pageScroll(i);
                        return false;
                    }
                } else {
                    if (keyEvent.isAltPressed()) {
                        return fullScroll(130);
                    }
                    return arrowScroll(130);
                }
            } else {
                if (keyEvent.isAltPressed()) {
                    return fullScroll(33);
                }
                return arrowScroll(33);
            }
        }
        return false;
    }

    public void fling(int i) {
        if (getChildCount() > 0) {
            this.mScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            runAnimatedScroll(true);
        }
    }

    public boolean fullScroll(int i) {
        boolean z;
        int childCount;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        Rect rect = this.mTempRect;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.mTempRect.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.mTempRect;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.mTempRect;
        return scrollAndFocus(i, rect3.top, rect3.bottom);
    }

    public boolean hasNestedScrollingParent(int i) {
        return this.mChildHelper.LJIIIIZZ(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instruction units count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21578619ce.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21578619ce.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof NestedScrollView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        NestedScrollView$SavedState nestedScrollView$SavedState = (NestedScrollView$SavedState) parcelable;
        super.onRestoreInstanceState(nestedScrollView$SavedState.getSuperState());
        this.mSavedState = nestedScrollView$SavedState;
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        initVelocityTrackerIfNotExists();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mNestedYOffset = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.mNestedYOffset);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                onSecondaryPointerUp(motionEvent);
                                this.mLastMotionY = (int) motionEvent.getY(motionEvent.findPointerIndex(this.mActivePointerId));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.mLastMotionY = (int) motionEvent.getY(actionIndex);
                            this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.mIsBeingDragged && getChildCount() > 0 && this.mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            postInvalidateOnAnimation();
                        }
                        endTouchDrag();
                    }
                } else {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (iFindPointerIndex != -1) {
                        int y = (int) motionEvent.getY(iFindPointerIndex);
                        int i = this.mLastMotionY - y;
                        int iReleaseVerticalGlow = i - releaseVerticalGlow(i, motionEvent.getX(iFindPointerIndex));
                        if (!this.mIsBeingDragged && Math.abs(iReleaseVerticalGlow) > this.mTouchSlop) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.mIsBeingDragged = true;
                            iReleaseVerticalGlow = iReleaseVerticalGlow > 0 ? iReleaseVerticalGlow - this.mTouchSlop : iReleaseVerticalGlow + this.mTouchSlop;
                        }
                        if (this.mIsBeingDragged) {
                            int iScrollBy = scrollBy(iReleaseVerticalGlow, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.mLastMotionY = y - iScrollBy;
                            this.mNestedYOffset += iScrollBy;
                        }
                    }
                }
            } else {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.mMaximumVelocity);
                int yVelocity = (int) velocityTracker.getYVelocity(this.mActivePointerId);
                if (Math.abs(yVelocity) >= this.mMinimumVelocity) {
                    if (!edgeEffectFling(yVelocity)) {
                        int i2 = -yVelocity;
                        float f = i2;
                        if (!dispatchNestedPreFling(0.0f, f)) {
                            dispatchNestedFling(0.0f, f, true);
                            fling(i2);
                        }
                    }
                } else if (this.mScroller.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                endTouchDrag();
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.mIsBeingDragged && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.mScroller.isFinished()) {
                abortAnimatedScroll();
            }
            initializeTouchDrag((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.mVelocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public boolean pageScroll(int i) {
        boolean z;
        if (i == 130) {
            z = true;
        } else {
            z = false;
        }
        int height = getHeight();
        if (z) {
            this.mTempRect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.mTempRect;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.mTempRect.top = getScrollY() - height;
            Rect rect2 = this.mTempRect;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.mTempRect;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return scrollAndFocus(i, i2, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            recycleVelocityTracker();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void setFillViewport(boolean z) {
        if (z != this.mFillViewport) {
            this.mFillViewport = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.mChildHelper.LJIIIZ(z);
    }

    public void setOnScrollChangeListener(InterfaceC1809520xBm interfaceC1809520xBm) {
        this.mOnScrollChangeListener = interfaceC1809520xBm;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.mSmoothScrollingEnabled = z;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return startNestedScroll(i, 0);
    }

    @Override // X.InterfaceC20097013kG
    public void stopNestedScroll(int i) {
        this.mChildHelper.LJIIJJI(i);
    }

    public C21578619ce(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.zhiliaoapp.musically.R.attr.f61);
    }

    private boolean inChild(int i, int i2) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        if (i2 < childAt.getTop() - scrollY || i2 >= childAt.getBottom() - scrollY || i < childAt.getLeft() || i >= childAt.getRight()) {
            return false;
        }
        return true;
    }

    private void initializeTouchDrag(int i, int i2) {
        this.mLastMotionY = i;
        this.mActivePointerId = i2;
        startNestedScroll(2, 0);
    }

    public static boolean isViewDescendantOf(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        if ((parent instanceof ViewGroup) && isViewDescendantOf((View) parent, view2)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int releaseVerticalGlow(int r5, float r6) {
        /*
            r4 = this;
            int r0 = r4.getWidth()
            float r0 = (float) r0
            float r6 = r6 / r0
            float r3 = (float) r5
            int r0 = r4.getHeight()
            float r0 = (float) r0
            float r3 = r3 / r0
            android.widget.EdgeEffect r0 = r4.mEdgeGlowTop
            float r0 = X.C20097913kP.LIZJ(r0)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L40
            android.widget.EdgeEffect r1 = r4.mEdgeGlowTop
            float r0 = -r3
            float r0 = X.C20097913kP.LJFF(r1, r0, r6)
            float r1 = -r0
            android.widget.EdgeEffect r0 = r4.mEdgeGlowTop
            float r0 = X.C20097913kP.LIZJ(r0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2f
            android.widget.EdgeEffect r0 = r4.mEdgeGlowTop
            r0.onRelease()
        L2f:
            r2 = r1
        L30:
            int r0 = r4.getHeight()
            float r0 = (float) r0
            float r2 = r2 * r0
            int r0 = java.lang.Math.round(r2)
            if (r0 == 0) goto L3f
            r4.invalidate()
        L3f:
            return r0
        L40:
            android.widget.EdgeEffect r0 = r4.mEdgeGlowBottom
            float r0 = X.C20097913kP.LIZJ(r0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L30
            android.widget.EdgeEffect r1 = r4.mEdgeGlowBottom
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r6
            float r1 = X.C20097913kP.LJFF(r1, r3, r0)
            android.widget.EdgeEffect r0 = r4.mEdgeGlowBottom
            float r0 = X.C20097913kP.LIZJ(r0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2f
            android.widget.EdgeEffect r0 = r4.mEdgeGlowBottom
            r0.onRelease()
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21578619ce.releaseVerticalGlow(int, float):int");
    }

    private boolean scrollToChildRect(Rect rect, boolean z) {
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
            if (z) {
                scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
                return true;
            }
            smoothScrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
            return true;
        }
        return false;
    }

    private boolean shouldAbsorb(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        if (getSplineFlingDistance(-i) < C20097913kP.LIZJ(edgeEffect) * getHeight()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.mChildHelper.LIZIZ(f, f2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mFillViewport && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        View viewFindNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (viewFindNextFocusFromRect == null || isOffScreen(viewFindNextFocusFromRect)) {
            return false;
        }
        return viewFindNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // X.InterfaceC1318370kPb
    public void onStopNestedScroll(View view, int i) {
        this.mParentHelper.LIZIZ(i);
        stopNestedScroll(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mIsLayoutDirty) {
            scrollToChild(view2);
        } else {
            this.mChildToScrollTo = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iClamp = clamp(i, width, width2);
            int iClamp2 = clamp(i2, height, height2);
            if (iClamp != getScrollX() || iClamp2 != getScrollY()) {
                super.scrollTo(iClamp, iClamp2);
            }
        }
    }

    public final void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, 250, false);
    }

    public final void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 250, false);
    }

    @Override // X.InterfaceC20097013kG
    public boolean startNestedScroll(int i, int i2) {
        return this.mChildHelper.LJIIJ(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public C21578619ce(Context context, AttributeSet attributeSet, int i) {
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        super(context, attributeSet, i);
        this.mTempRect = new Rect();
        this.mIsLayoutDirty = true;
        this.mIsLaidOut = false;
        this.mChildToScrollTo = null;
        this.mIsBeingDragged = false;
        this.mSmoothScrollingEnabled = true;
        this.mActivePointerId = -1;
        this.mScrollOffset = new int[2];
        this.mScrollConsumed = new int[2];
        C21579019ci c21579019ci = new C21579019ci(this);
        this.mDifferentialMotionFlingTarget = c21579019ci;
        this.mDifferentialMotionFlingController = new C21578719cf(getContext(), c21579019ci);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            edgeEffect = C20087513ij.LIZ(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.mEdgeGlowTop = edgeEffect;
        if (i2 >= 31) {
            edgeEffect2 = C20087513ij.LIZ(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.mEdgeGlowBottom = edgeEffect2;
        this.mPhysicalCoeff = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        initScrollView();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SCROLLVIEW_STYLEABLE, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.mParentHelper = new C1317550kOH();
        this.mChildHelper = new C1318260kPQ(this);
        setNestedScrollingEnabled(true);
        q0.LJIJ(this, ACCESSIBILITY_DELEGATE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.view.View findFocusableViewInBounds(boolean r11, int r12, int r13) {
        /*
            r10 = this;
            r0 = 2
            java.util.ArrayList r9 = r10.getFocusables(r0)
            int r8 = r9.size()
            r7 = 0
            r6 = 0
            r5 = 0
        Lc:
            if (r6 >= r8) goto L4f
            java.lang.Object r4 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r9, r6)
            android.view.View r4 = (android.view.View) r4
            int r3 = r4.getTop()
            int r2 = r4.getBottom()
            if (r12 >= r2) goto L29
            if (r3 >= r13) goto L29
            if (r12 >= r3) goto L4d
            if (r2 >= r13) goto L4d
            r1 = 1
        L25:
            if (r7 != 0) goto L2c
            r7 = r4
            r5 = r1
        L29:
            int r6 = r6 + 1
            goto Lc
        L2c:
            if (r11 == 0) goto L45
            int r0 = r7.getTop()
            if (r3 < r0) goto L4b
        L34:
            r0 = 0
        L35:
            if (r5 == 0) goto L3d
            if (r1 == 0) goto L29
            if (r0 == 0) goto L29
        L3b:
            r7 = r4
            goto L29
        L3d:
            if (r1 == 0) goto L42
            r7 = r4
            r5 = 1
            goto L29
        L42:
            if (r0 == 0) goto L29
            goto L3b
        L45:
            int r0 = r7.getBottom()
            if (r2 <= r0) goto L34
        L4b:
            r0 = 1
            goto L35
        L4d:
            r1 = 0
            goto L25
        L4f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21578619ce.findFocusableViewInBounds(boolean, int, int):android.view.View");
    }

    private boolean isWithinDeltaOfScreen(View view, int i, int i2) {
        view.getDrawingRect(this.mTempRect);
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        if (this.mTempRect.bottom + i >= getScrollY() && this.mTempRect.top - i <= getScrollY() + i2) {
            return true;
        }
        return false;
    }

    private void onNestedScrollInternal(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.mChildHelper.LJI(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    private boolean scrollAndFocus(int i, int i2, int i3) {
        boolean z;
        int i4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = false;
        if (i == 33) {
            z = true;
        } else {
            z = false;
        }
        View viewFindFocusableViewInBounds = findFocusableViewInBounds(z, i2, i3);
        if (viewFindFocusableViewInBounds == null) {
            viewFindFocusableViewInBounds = this;
        }
        if (i2 < scrollY || i3 > i5) {
            if (z) {
                i4 = i2 - scrollY;
            } else {
                i4 = i3 - i5;
            }
            scrollBy(i4, 0, 1, true);
            z2 = true;
        }
        if (viewFindFocusableViewInBounds != findFocus()) {
            viewFindFocusableViewInBounds.requestFocus(i);
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.mChildHelper.LIZ(f, f2, z);
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i, int i2) {
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC1318530kPr
    public void onNestedScrollAccepted(View view, View view2, int i) {
        onNestedScrollAccepted(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return onStartNestedScroll(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return scrollToChildRect(rect, z);
    }

    public final void smoothScrollBy(int i, int i2, int i3) {
        smoothScrollBy(i, i2, i3, false);
    }

    public void smoothScrollTo(int i, int i2, boolean z) {
        smoothScrollTo(i, i2, 250, z);
    }

    public final void smoothScrollTo(int i, int i2, int i3) {
        smoothScrollTo(i, i2, i3, false);
    }

    private int scrollBy(int i, int i2, int i3, boolean z) {
        int i4;
        boolean z2;
        if (i3 == 1) {
            startNestedScroll(2, i3);
        }
        int i5 = i;
        if (dispatchNestedPreScroll(0, i5, this.mScrollConsumed, this.mScrollOffset, i3)) {
            i5 -= this.mScrollConsumed[1];
            i4 = this.mScrollOffset[1];
        } else {
            i4 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        if (canOverScroll() && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z3 = false;
        if (overScrollByCompat(0, i5, 0, scrollY, 0, scrollRange, 0, 0, true) && !hasNestedScrollingParent(i3)) {
            z3 = true;
        }
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.mScrollConsumed;
        iArr[1] = 0;
        dispatchNestedScroll(0, scrollY2, 0, i5 - scrollY2, this.mScrollOffset, i3, iArr);
        int i6 = i4 + this.mScrollOffset[1];
        int i7 = i5 - this.mScrollConsumed[1];
        int i8 = scrollY + i7;
        if (i8 < 0) {
            if (z2) {
                C20097913kP.LJFF(this.mEdgeGlowTop, (-i7) / getHeight(), i2 / getWidth());
                if (!this.mEdgeGlowBottom.isFinished()) {
                    this.mEdgeGlowBottom.onRelease();
                }
            }
        } else if (i8 > scrollRange && z2) {
            C20097913kP.LJFF(this.mEdgeGlowBottom, i7 / getHeight(), 1.0f - (i2 / getWidth()));
            if (!this.mEdgeGlowTop.isFinished()) {
                this.mEdgeGlowTop.onRelease();
            }
        }
        if (this.mEdgeGlowTop.isFinished() && this.mEdgeGlowBottom.isFinished()) {
            if (z3 && i3 == 0) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                }
            }
            return i6;
        }
        postInvalidateOnAnimation();
        if (i3 == 1) {
            stopNestedScroll(i3);
            this.mEdgeGlowTop.onRelease();
            this.mEdgeGlowBottom.onRelease();
            return i6;
        }
        return i6;
    }

    private void smoothScrollBy(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.mLastScroll > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.mScroller.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, i3);
            runAnimatedScroll(z);
        } else {
            if (!this.mScroller.isFinished()) {
                abortAnimatedScroll();
            }
            scrollBy(i, i2);
        }
        this.mLastScroll = AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!z) {
            dispatchNestedFling(0.0f, f2, true);
            fling((int) f2);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        onNestedPreScroll(view, i, i2, iArr, 0);
    }

    @Override // X.InterfaceC1318370kPb
    public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        this.mParentHelper.LIZ(i, i2);
        startNestedScroll(2, i2);
    }

    @Override // android.view.View
    public void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        InterfaceC1809520xBm interfaceC1809520xBm = this.mOnScrollChangeListener;
        if (interfaceC1809520xBm != null) {
            interfaceC1809520xBm.LIZ(this, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus != null && this != viewFindFocus && isWithinDeltaOfScreen(viewFindFocus, 0, i4)) {
            viewFindFocus.getDrawingRect(this.mTempRect);
            offsetDescendantRectToMyCoords(viewFindFocus, this.mTempRect);
            doScrollY(computeScrollDeltaToGetChildRectOnScreen(this.mTempRect));
        }
    }

    public void smoothScrollTo(int i, int i2, int i3, boolean z) {
        smoothScrollBy(i - getScrollX(), i2 - getScrollY(), i3, z);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.mChildHelper.LIZLLL(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.mChildHelper.LJ(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = 0;
        this.mIsLayoutDirty = false;
        View view = this.mChildToScrollTo;
        if (view != null && isViewDescendantOf(view, this)) {
            scrollToChild(this.mChildToScrollTo);
        }
        this.mChildToScrollTo = null;
        if (!this.mIsLaidOut) {
            if (this.mSavedState != null) {
                scrollTo(getScrollX(), this.mSavedState.scrollPosition);
                this.mSavedState = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iClamp = clamp(scrollY, paddingTop, measuredHeight);
            if (iClamp != scrollY) {
                scrollTo(getScrollX(), iClamp);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.mIsLaidOut = true;
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        dispatchNestedPreScroll(i, i2, iArr, null, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        onNestedScrollInternal(i4, 0, null);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return this.mChildHelper.LJFF(i, i2, i3, i4, iArr, i5);
    }

    @Override // X.InterfaceC1318370kPb
    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        onNestedScrollInternal(i4, i5, null);
    }

    public void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        this.mChildHelper.LJI(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScrollInternal(i4, i5, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[PHI: r1
      0x0031: PHI (r1v10 boolean) = (r1v2 boolean), (r1v11 boolean) binds: [B:12:0x002b, B:14:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean overScrollByCompat(int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, boolean r22) {
        /*
            r13 = this;
            r2 = r20
            r3 = r21
            r8 = r17
            r7 = r16
            int r5 = r13.getOverScrollMode()
            int r1 = r13.computeHorizontalScrollRange()
            int r0 = r13.computeHorizontalScrollExtent()
            r9 = 0
            r4 = 1
            if (r1 <= r0) goto L76
            r6 = 1
        L19:
            int r1 = r13.computeVerticalScrollRange()
            int r0 = r13.computeVerticalScrollExtent()
            if (r1 <= r0) goto L74
            r0 = 1
        L24:
            if (r5 == 0) goto L2a
            if (r5 != r4) goto L72
            if (r6 == 0) goto L72
        L2a:
            r1 = 1
            if (r5 == 0) goto L31
        L2d:
            if (r5 != r4) goto L70
            if (r0 == 0) goto L70
        L31:
            r0 = 1
        L32:
            int r7 = r7 + r14
            if (r1 != 0) goto L36
            r2 = 0
        L36:
            int r8 = r8 + r15
            if (r0 != 0) goto L3a
            r3 = 0
        L3a:
            int r1 = -r2
            int r2 = r2 + r18
            int r0 = -r3
            int r3 = r3 + r19
            if (r7 <= r2) goto L69
            r7 = r2
            r2 = 1
        L44:
            if (r8 <= r3) goto L62
            r8 = r3
            r1 = 1
        L48:
            boolean r0 = r13.hasNestedScrollingParent(r4)
            if (r0 != 0) goto L59
            android.widget.OverScroller r6 = r13.mScroller
            int r12 = r13.getScrollRange()
            r10 = r9
            r11 = r9
            r6.springBack(r7, r8, r9, r10, r11, r12)
        L59:
            r13.onOverScrolled(r7, r8, r2, r1)
            if (r2 != 0) goto L60
            if (r1 == 0) goto L61
        L60:
            r9 = 1
        L61:
            return r9
        L62:
            if (r8 >= r0) goto L67
            r1 = 1
            r8 = r0
            goto L48
        L67:
            r1 = 0
            goto L59
        L69:
            if (r7 >= r1) goto L6e
            r2 = 1
            r7 = r1
            goto L44
        L6e:
            r2 = 0
            goto L44
        L70:
            r0 = 0
            goto L32
        L72:
            r1 = 0
            goto L2d
        L74:
            r0 = 0
            goto L24
        L76:
            r6 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21578619ce.overScrollByCompat(int, int, int, int, int, int, int, int, boolean):boolean");
    }
}
