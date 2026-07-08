package androidx.viewpager.widget;

import X.C0TVI;
import X.C14K9;
import X.C15D7;
import X.C20094213jo;
import X.C20267414Sa;
import X.C21593819f6;
import X.C21594019f8;
import X.C21594219fA;
import X.C2188231AkX;
import X.C2188811AlT;
import X.C2413309cx;
import X.C788530UwV;
import X.C800330VaR;
import X.InterfaceC1846340y9A;
import X.InterfaceC21561419Zs;
import X.InterfaceC469360Ias;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import u4.q0;

/* JADX INFO: loaded from: classes34.dex */
public class ViewPager extends ViewGroup {
    public int mActivePointerId;
    public PagerAdapter mAdapter;
    public List<InterfaceC1846340y9A> mAdapterChangeListeners;
    public int mBottomPageBounds;
    public boolean mCalledSuper;
    public int mChildHeightMeasureSpec;
    public int mChildWidthMeasureSpec;
    public int mCloseEnough;
    public int mCurItem;
    public int mDecorChildCount;
    public int mDefaultGutterSize;
    public int mDrawingOrder;
    public ArrayList<View> mDrawingOrderedChildren;
    public final Runnable mEndScrollRunnable;
    public int mExpectedAdapterCount;
    public long mFakeDragBeginTime;
    public boolean mFakeDragging;
    public boolean mFirstLayout;
    public float mFirstOffset;
    public int mFlingDistance;
    public int mGutterSize;
    public boolean mInLayout;
    public float mInitialMotionX;
    public float mInitialMotionY;
    public InterfaceC469360Ias mInternalPageChangeListener;
    public boolean mIsBeingDragged;
    public boolean mIsScrollStarted;
    public boolean mIsUnableToDrag;
    public final ArrayList<C21593819f6> mItems;
    public float mLastMotionX;
    public float mLastMotionY;
    public float mLastOffset;
    public EdgeEffect mLeftEdge;
    public Drawable mMarginDrawable;
    public int mMaximumVelocity;
    public int mMinimumVelocity;
    public boolean mNeedCalculatePageOffsets;
    public C21594019f8 mObserver;
    public int mOffscreenPageLimit;
    public InterfaceC469360Ias mOnPageChangeListener;
    public List<InterfaceC469360Ias> mOnPageChangeListeners;
    public int mPageMargin;
    public C15D7 mPageTransformer;
    public int mPageTransformerLayerType;
    public boolean mPopulatePending;
    public Parcelable mRestoredAdapterState;
    public ClassLoader mRestoredClassLoader;
    public int mRestoredCurItem;
    public EdgeEffect mRightEdge;
    public int mScrollState;
    public Scroller mScroller;
    public boolean mScrollingCacheEnabled;
    public final C21593819f6 mTempItem;
    public final Rect mTempRect;
    public int mTopPageBounds;
    public int mTouchSlop;
    public VelocityTracker mVelocityTracker;
    public static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    public static final Comparator<C21593819f6> COMPARATOR = new Comparator<C21593819f6>() { // from class: X.19f7
        @Override // java.util.Comparator
        public final int compare(C21593819f6 c21593819f6, C21593819f6 c21593819f62) {
            return c21593819f6.LIZIZ - c21593819f62.LIZIZ;
        }
    };
    public static final Interpolator sInterpolator = new Interpolator() { // from class: X.19f9
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    public static final C20267414Sa sPositionComparator = new Comparator<View>() { // from class: X.14Sa
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) view.getLayoutParams();
            ViewPager.LayoutParams layoutParams2 = (ViewPager.LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.LIZ;
            if (z != layoutParams2.LIZ) {
                if (z) {
                    return 1;
                }
                return -1;
            }
            return layoutParams.position - layoutParams2.position;
        }
    };

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void removeNonDecorViews() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).LIZ) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        q0.LJIJ(this, new C20094213jo() { // from class: X.147Q
            /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
            @Override // X.C20094213jo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onInitializeAccessibilityEvent(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
                /*
                    r2 = this;
                    super.onInitializeAccessibilityEvent(r3, r4)
                    java.lang.Class<androidx.viewpager.widget.ViewPager> r0 = androidx.viewpager.widget.ViewPager.class
                    java.lang.String r0 = r0.getName()
                    r4.setClassName(r0)
                    androidx.viewpager.widget.ViewPager r0 = r2.LIZ
                    androidx.viewpager.widget.PagerAdapter r0 = r0.mAdapter
                    if (r0 == 0) goto L40
                    int r1 = r0.getCount()
                    r0 = 1
                    if (r1 <= r0) goto L40
                L19:
                    r4.setScrollable(r0)
                    int r1 = r4.getEventType()
                    r0 = 4096(0x1000, float:5.74E-42)
                    if (r1 != r0) goto L3f
                    androidx.viewpager.widget.ViewPager r0 = r2.LIZ
                    androidx.viewpager.widget.PagerAdapter r0 = r0.mAdapter
                    if (r0 == 0) goto L3f
                    int r0 = r0.getCount()
                    r4.setItemCount(r0)
                    androidx.viewpager.widget.ViewPager r0 = r2.LIZ
                    int r0 = r0.mCurItem
                    r4.setFromIndex(r0)
                    androidx.viewpager.widget.ViewPager r0 = r2.LIZ
                    int r0 = r0.mCurItem
                    r4.setToIndex(r0)
                L3f:
                    return
                L40:
                    r0 = 0
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C147Q.onInitializeAccessibilityEvent(android.view.View, android.view.accessibility.AccessibilityEvent):void");
            }

            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                boolean z;
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
                PagerAdapter pagerAdapter = this.LIZ.mAdapter;
                if (pagerAdapter != null && pagerAdapter.getCount() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                accessibilityNodeInfoCompat.setScrollable(z);
                if (this.LIZ.canScrollHorizontally(1)) {
                    accessibilityNodeInfoCompat.addAction(SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                }
                if (this.LIZ.canScrollHorizontally(-1)) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
            }

            @Override // X.C20094213jo
            public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                if (super.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
                if (i != 4096) {
                    if (i != 8192 || !this.LIZ.canScrollHorizontally(-1)) {
                        return false;
                    }
                    ViewPager viewPager = this.LIZ;
                    viewPager.setCurrentItem(viewPager.mCurItem - 1);
                    return true;
                }
                if (!this.LIZ.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager2 = this.LIZ;
                viewPager2.setCurrentItem(viewPager2.mCurItem + 1);
                return true;
            }
        });
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        C14K9.LJIJJ(this, new C0TVI() { // from class: X.14KB
            public final Rect LL = new Rect();

            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                C20246014Ju c20246014JuLJIIL = q0.LJIIL(view, c20246014Ju);
                if (c20246014JuLJIIL.LJII()) {
                    return c20246014JuLJIIL;
                }
                Rect rect = this.LL;
                rect.left = c20246014JuLJIIL.LIZLLL();
                rect.top = c20246014JuLJIIL.LJFF();
                rect.right = c20246014JuLJIIL.LJ();
                rect.bottom = c20246014JuLJIIL.LIZJ();
                int childCount = this.LLILLJJLI.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C20246014Ju c20246014JuLIZJ = q0.LIZJ(this.LLILLJJLI.getChildAt(i), c20246014JuLJIIL);
                    rect.left = Math.min(c20246014JuLIZJ.LIZLLL(), rect.left);
                    rect.top = Math.min(c20246014JuLIZJ.LJFF(), rect.top);
                    rect.right = Math.min(c20246014JuLIZJ.LJ(), rect.right);
                    rect.bottom = Math.min(c20246014JuLIZJ.LIZJ(), rect.bottom);
                }
                return c20246014JuLJIIL.LJIIIZ(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        androidx_viewpager_widget_ViewPager_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_setViewPagerAdapter(this, pagerAdapter);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.19cC
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new ViewPager.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ViewPager.SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final ViewPager.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new ViewPager.SavedState(parcel, classLoader);
            }
        };
        public int LL;
        public Parcelable LLILLJJLI;
        public final ClassLoader LLILLL;

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FragmentPager.SavedState{");
            sbLIZ.append(Integer.toHexString(System.identityHashCode(this)));
            sbLIZ.append(" position=");
            sbLIZ.append(this.LL);
            sbLIZ.append("}");
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.LL = parcel.readInt();
            this.LLILLJJLI = parcel.readParcelable(classLoader);
            this.LLILLL = classLoader;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LL);
            parcel.writeParcelable(this.LLILLJJLI, i);
        }
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.mFakeDragBeginTime = jUptimeMillis;
        return true;
    }

    public void clearOnPageChangeListeners() {
        List<InterfaceC469360Ias> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void dataSetChanged() {
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        boolean z = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count;
        int iMax = this.mCurItem;
        int i = 0;
        boolean z2 = false;
        while (i < this.mItems.size()) {
            C21593819f6 c21593819f6 = (C21593819f6) ListProtector.get(this.mItems, i);
            int iLJIJJ = this.mAdapter.LJIJJ(c21593819f6.LIZ);
            if (iLJIJJ != -1) {
                if (iLJIJJ == -2) {
                    ListProtector.remove(this.mItems, i);
                    i--;
                    if (!z2) {
                        this.mAdapter.LJJIJIIJI(this);
                        z2 = true;
                    }
                    this.mAdapter.LJIIZILJ(this, c21593819f6.LIZIZ, c21593819f6.LIZ);
                    int i2 = this.mCurItem;
                    if (i2 == c21593819f6.LIZIZ) {
                        iMax = Math.max(0, Math.min(i2, count - 1));
                    }
                } else {
                    int i3 = c21593819f6.LIZIZ;
                    if (i3 != iLJIJJ) {
                        if (i3 == this.mCurItem) {
                            iMax = iLJIJJ;
                        }
                        c21593819f6.LIZIZ = iLJIJJ;
                    }
                }
                z = true;
            }
            i++;
        }
        if (z2) {
            this.mAdapter.LJIJI(this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i4).getLayoutParams();
                if (!layoutParams.LIZ) {
                    layoutParams.LIZJ = 0.0f;
                }
            }
            setCurrentItemInternal(iMax, false, true);
            requestLayout();
        }
    }

    public void endFakeDrag() {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.mAdapter != null) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C21593819f6 c21593819f6InfoForCurrentScrollPosition = infoForCurrentScrollPosition();
            setCurrentItemInternal(determineTargetPage(c21593819f6InfoForCurrentScrollPosition.LIZIZ, ((scrollX / clientWidth) - c21593819f6InfoForCurrentScrollPosition.LJ) / c21593819f6InfoForCurrentScrollPosition.LIZLLL, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
        }
        endDrag();
        this.mFakeDragging = false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public boolean pageLeft() {
        int i = this.mCurItem;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    public boolean pageRight() {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter == null || this.mCurItem >= pagerAdapter.getCount() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    public void populate() {
        populate(this.mCurItem);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private C21593819f6 infoForCurrentScrollPosition() {
        float scrollX;
        float f;
        int i;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        if (clientWidth > 0) {
            scrollX = getScrollX() / clientWidth;
            f = this.mPageMargin / clientWidth;
        } else {
            scrollX = 0.0f;
            f = 0.0f;
        }
        C21593819f6 c21593819f6 = null;
        int i2 = 0;
        boolean z = true;
        int i3 = -1;
        float f3 = 0.0f;
        while (i2 < this.mItems.size()) {
            C21593819f6 c21593819f62 = (C21593819f6) ListProtector.get(this.mItems, i2);
            if (!z && c21593819f62.LIZIZ != (i = i3 + 1)) {
                c21593819f62 = this.mTempItem;
                c21593819f62.LJ = f2 + f3 + f;
                c21593819f62.LIZIZ = i;
                c21593819f62.LIZLLL = this.mAdapter.LJIL(i);
                i2--;
            }
            f2 = c21593819f62.LJ;
            float f4 = c21593819f62.LIZLLL + f2 + f;
            if (!z && scrollX < f2) {
                return c21593819f6;
            }
            if (scrollX < f4 || i2 == this.mItems.size() - 1) {
                return c21593819f62;
            }
            i3 = c21593819f62.LIZIZ;
            f3 = c21593819f62.LIZLLL;
            i2++;
            z = false;
            c21593819f6 = c21593819f62;
        }
        return c21593819f6;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.LL = this.mCurItem;
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            savedState.LLILLJJLI = pagerAdapter.LJJIIJ();
        }
        return savedState;
    }

    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    public ViewPager(Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mTempItem = new C21593819f6();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new Runnable() { // from class: X.10ma
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.LL.setScrollState(0);
                    this.LL.populate();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }

    private void completeScroll(boolean z) {
        boolean z2;
        if (this.mScrollState == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        } else {
            z2 = false;
        }
        this.mPopulatePending = false;
        for (int i = 0; i < this.mItems.size(); i++) {
            C21593819f6 c21593819f6 = (C21593819f6) ListProtector.get(this.mItems, i);
            if (c21593819f6.LIZJ) {
                c21593819f6.LIZJ = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                postOnAnimation(this.mEndScrollRunnable);
            } else {
                this.mEndScrollRunnable.run();
            }
        }
    }

    private void dispatchOnPageSelected(int i) {
        InterfaceC469360Ias interfaceC469360Ias = this.mOnPageChangeListener;
        if (interfaceC469360Ias != null) {
            interfaceC469360Ias.onPageSelected(i);
        }
        List<InterfaceC469360Ias> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC469360Ias interfaceC469360Ias2 = (InterfaceC469360Ias) ListProtector.get(this.mOnPageChangeListeners, i2);
                if (interfaceC469360Ias2 != null) {
                    interfaceC469360Ias2.onPageSelected(i);
                }
            }
        }
        InterfaceC469360Ias interfaceC469360Ias3 = this.mInternalPageChangeListener;
        if (interfaceC469360Ias3 != null) {
            interfaceC469360Ias3.onPageSelected(i);
        }
    }

    private void dispatchOnScrollStateChanged(int i) {
        InterfaceC469360Ias interfaceC469360Ias = this.mOnPageChangeListener;
        if (interfaceC469360Ias != null) {
            interfaceC469360Ias.onPageScrollStateChanged(i);
        }
        List<InterfaceC469360Ias> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC469360Ias interfaceC469360Ias2 = (InterfaceC469360Ias) ListProtector.get(this.mOnPageChangeListeners, i2);
                if (interfaceC469360Ias2 != null) {
                    interfaceC469360Ias2.onPageScrollStateChanged(i);
                }
            }
        }
        InterfaceC469360Ias interfaceC469360Ias3 = this.mInternalPageChangeListener;
        if (interfaceC469360Ias3 != null) {
            interfaceC469360Ias3.onPageScrollStateChanged(i);
        }
    }

    private void enableLayers(boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (z) {
                i = this.mPageTransformerLayerType;
            } else {
                i = 0;
            }
            getChildAt(i2).setLayerType(i, null);
        }
    }

    public static boolean isDecorView(View view) {
        if (view.getClass().getAnnotation(InterfaceC21561419Zs.class) != null) {
            return true;
        }
        return false;
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
            this.mLastMotionX = motionEvent.getX(i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean pageScrolled(int i) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C21593819f6 c21593819f6InfoForCurrentScrollPosition = infoForCurrentScrollPosition();
        int clientWidth = getClientWidth();
        int i2 = this.mPageMargin;
        int i3 = clientWidth + i2;
        float f = i2;
        float f2 = clientWidth;
        int i4 = c21593819f6InfoForCurrentScrollPosition.LIZIZ;
        float f3 = ((i / f2) - c21593819f6InfoForCurrentScrollPosition.LJ) / (c21593819f6InfoForCurrentScrollPosition.LIZLLL + (f / f2));
        this.mCalledSuper = false;
        onPageScrolled(i4, f3, (int) (i3 * f3));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean performDrag(float f) {
        boolean z;
        boolean z2;
        float f2 = this.mLastMotionX - f;
        this.mLastMotionX = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.mFirstOffset * clientWidth;
        float f4 = this.mLastOffset * clientWidth;
        boolean z3 = false;
        C21593819f6 c21593819f6 = (C21593819f6) ListProtector.get(this.mItems, 0);
        ArrayList<C21593819f6> arrayList = this.mItems;
        C21593819f6 c21593819f62 = (C21593819f6) ListProtector.get(arrayList, arrayList.size() - 1);
        if (c21593819f6.LIZIZ != 0) {
            f3 = c21593819f6.LJ * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c21593819f62.LIZIZ != this.mAdapter.getCount() - 1) {
            f4 = c21593819f62.LJ * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.mLeftEdge.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.mRightEdge.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.mLastMotionX += scrollX - i;
        scrollTo(i, getScrollY());
        pageScrolled(i);
        return z3;
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    public void addOnAdapterChangeListener(InterfaceC1846340y9A interfaceC1846340y9A) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(interfaceC1846340y9A);
    }

    public void addOnPageChangeListener(InterfaceC469360Ias interfaceC469360Ias) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(interfaceC469360Ias);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C21593819f6 c21593819f6InfoForChild;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c21593819f6InfoForChild = infoForChild(childAt)) != null && c21593819f6InfoForChild.LIZIZ == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.19f8] */
    public void androidx_viewpager_widget_ViewPager__setAdapter$___twin___(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.mAdapter;
        if (pagerAdapter2 != null) {
            pagerAdapter2.LJJIIZI(null);
            this.mAdapter.LJJIJIIJI(this);
            for (int i = 0; i < this.mItems.size(); i++) {
                C21593819f6 c21593819f6 = (C21593819f6) ListProtector.get(this.mItems, i);
                this.mAdapter.LJIIZILJ(this, c21593819f6.LIZIZ, c21593819f6.LIZ);
            }
            this.mAdapter.LJIJI(this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.mAdapter;
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (pagerAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new DataSetObserver() { // from class: X.19f8
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        this.LIZ.dataSetChanged();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        this.LIZ.dataSetChanged();
                    }
                };
            }
            this.mAdapter.LJJIIZI(this.mObserver);
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.LJJIII(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z) {
                populate();
            } else {
                requestLayout();
            }
        }
        List<InterfaceC1846340y9A> list = this.mAdapterChangeListeners;
        if (list != null && !list.isEmpty()) {
            int size = this.mAdapterChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((InterfaceC1846340y9A) ListProtector.get(this.mAdapterChangeListeners, i2)).LIZIZ(this, pagerAdapter3, pagerAdapter);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean arrowScroll(int r7) {
        /*
            r6 = this;
            android.view.View r3 = r6.findFocus()
            r5 = 1
            r2 = 0
            r4 = 0
            if (r3 == r6) goto L2a
            if (r3 == 0) goto L2b
            android.view.ViewParent r1 = r3.getParent()
        Lf:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1a
            if (r1 == r6) goto L2b
            android.view.ViewParent r1 = r1.getParent()
            goto Lf
        L1a:
            android.view.ViewParent r1 = r3.getParent()
        L1e:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2a
            r1.getClass()
            android.view.ViewParent r1 = r1.getParent()
            goto L1e
        L2a:
            r3 = r4
        L2b:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r4 = r0.findNextFocus(r6, r3, r7)
            r1 = 66
            r0 = 17
            if (r4 == 0) goto L84
            if (r4 == r3) goto L84
            if (r7 != r0) goto L64
            android.graphics.Rect r0 = r6.mTempRect
            android.graphics.Rect r0 = r6.getChildRectInPagerCoordinates(r0, r4)
            int r1 = r0.left
            android.graphics.Rect r0 = r6.mTempRect
            android.graphics.Rect r0 = r6.getChildRectInPagerCoordinates(r0, r3)
            int r0 = r0.left
            if (r3 == 0) goto L5f
            if (r1 < r0) goto L5f
            boolean r2 = r6.pageLeft()
        L55:
            if (r2 == 0) goto L5e
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r0)
        L5e:
            return r2
        L5f:
            boolean r2 = r4.requestFocus()
            goto L55
        L64:
            if (r7 != r1) goto L5e
            android.graphics.Rect r0 = r6.mTempRect
            android.graphics.Rect r0 = r6.getChildRectInPagerCoordinates(r0, r4)
            int r1 = r0.left
            android.graphics.Rect r0 = r6.mTempRect
            android.graphics.Rect r0 = r6.getChildRectInPagerCoordinates(r0, r3)
            int r0 = r0.left
            if (r3 == 0) goto L7f
            if (r1 > r0) goto L7f
            boolean r2 = r6.pageRight()
            goto L55
        L7f:
            boolean r2 = r4.requestFocus()
            goto L55
        L84:
            if (r7 == r0) goto L92
            if (r7 == r5) goto L92
            if (r7 == r1) goto L8d
            r0 = 2
            if (r7 != r0) goto L5e
        L8d:
            boolean r2 = r6.pageRight()
            goto L55
        L92:
            boolean r2 = r6.pageLeft()
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.arrowScroll(int):boolean");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX <= ((int) (clientWidth * this.mFirstOffset))) {
                return false;
            }
            return true;
        }
        if (i <= 0 || scrollX >= ((int) (clientWidth * this.mLastOffset))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !executeKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C21593819f6 c21593819f6InfoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c21593819f6InfoForChild = infoForChild(childAt)) != null && c21593819f6InfoForChild.LIZIZ == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.mAdapter) != null && pagerAdapter.getCount() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                zDraw = false | this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.mRightEdge.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                zDraw |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
            if (zDraw) {
                postInvalidateOnAnimation();
                return;
            }
            return;
        }
        this.mLeftEdge.finish();
        this.mRightEdge.finish();
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return arrowScroll(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return arrowScroll(1);
                        }
                        return false;
                    }
                    return false;
                }
                if (keyEvent.hasModifiers(2)) {
                    return pageRight();
                }
                return arrowScroll(66);
            }
            if (keyEvent.hasModifiers(2)) {
                return pageLeft();
            }
            return arrowScroll(17);
        }
        return false;
    }

    public void fakeDragBy(float f) {
        if (this.mFakeDragging) {
            if (this.mAdapter == null) {
                return;
            }
            this.mLastMotionX += f;
            float scrollX = getScrollX() - f;
            float clientWidth = getClientWidth();
            float f2 = this.mFirstOffset * clientWidth;
            float f3 = this.mLastOffset * clientWidth;
            C21593819f6 c21593819f6 = (C21593819f6) ListProtector.get(this.mItems, 0);
            C21593819f6 c21593819f62 = (C21593819f6) ListProtector.get(this.mItems, r1.size() - 1);
            if (c21593819f6.LIZIZ != 0) {
                f2 = c21593819f6.LJ * clientWidth;
            }
            if (c21593819f62.LIZIZ != this.mAdapter.getCount() - 1) {
                f3 = c21593819f62.LJ * clientWidth;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.mLastMotionX += scrollX - i;
            scrollTo(i, getScrollY());
            pageScrolled(i);
            MotionEvent motionEventObtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
            this.mVelocityTracker.addMovement(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public C21593819f6 infoForAnyChild(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent != null && (parent instanceof View)) {
                    view = (View) parent;
                } else {
                    return null;
                }
            } else {
                return infoForChild(view);
            }
        }
    }

    public C21593819f6 infoForChild(View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            C21593819f6 c21593819f6 = (C21593819f6) ListProtector.get(this.mItems, i);
            if (this.mAdapter.LJJIFFI(view, c21593819f6.LIZ)) {
                return c21593819f6;
            }
        }
        return null;
    }

    public C21593819f6 infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            C21593819f6 c21593819f6 = (C21593819f6) ListProtector.get(this.mItems, i2);
            if (c21593819f6.LIZIZ == i) {
                return c21593819f6;
            }
        }
        return null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            int scrollX = getScrollX();
            float width = getWidth();
            float f2 = this.mPageMargin / width;
            int i2 = 0;
            C21593819f6 c21593819f6 = (C21593819f6) ListProtector.get(this.mItems, 0);
            float f3 = c21593819f6.LJ;
            int size = this.mItems.size();
            int i3 = ((C21593819f6) ListProtector.get(this.mItems, size - 1)).LIZIZ;
            for (int i4 = c21593819f6.LIZIZ; i4 < i3; i4++) {
                while (true) {
                    i = c21593819f6.LIZIZ;
                    if (i4 <= i || i2 >= size) {
                        break;
                    }
                    i2++;
                    c21593819f6 = (C21593819f6) ListProtector.get(this.mItems, i2);
                }
                if (i4 == i) {
                    float f4 = c21593819f6.LJ;
                    float f5 = c21593819f6.LIZLLL;
                    f = (f4 + f5) * width;
                    f3 = f4 + f5 + f2;
                } else {
                    float fLJIL = this.mAdapter.LJIL(i4);
                    f = (f3 + fLJIL) * width;
                    f3 += fLJIL + f2;
                }
                if (this.mPageMargin + f > scrollX) {
                    this.mMarginDrawable.setBounds(Math.round(f), this.mTopPageBounds, Math.round(this.mPageMargin + f), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                }
                if (f > scrollX + r9) {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.mIsBeingDragged) {
                    return true;
                }
                if (this.mIsUnableToDrag) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        onSecondaryPointerUp(motionEvent);
                    }
                } else {
                    int i = this.mActivePointerId;
                    if (i != -1) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i);
                        float x = motionEvent.getX(iFindPointerIndex);
                        float f2 = x - this.mLastMotionX;
                        float fAbs = Math.abs(f2);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y - this.mInitialMotionY);
                        if (f2 != 0.0f && !isGutterDrag(this.mLastMotionX, f2) && canScroll(this, false, (int) f2, (int) x, (int) y)) {
                            this.mLastMotionX = x;
                            this.mLastMotionY = y;
                            this.mIsUnableToDrag = true;
                            return false;
                        }
                        int i2 = this.mTouchSlop;
                        if (fAbs > i2 && fAbs * 0.5f > fAbs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            setScrollState(1);
                            float f3 = this.mInitialMotionX;
                            float f4 = this.mTouchSlop;
                            if (f2 > 0.0f) {
                                f = f3 + f4;
                            } else {
                                f = f3 - f4;
                            }
                            this.mLastMotionX = f;
                            this.mLastMotionY = y;
                            setScrollingCacheEnabled(true);
                        } else if (fAbs2 > i2) {
                            this.mIsUnableToDrag = true;
                        }
                        if (this.mIsBeingDragged && performDrag(x)) {
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                float x2 = motionEvent.getX();
                this.mInitialMotionX = x2;
                this.mLastMotionX = x2;
                float y2 = motionEvent.getY();
                this.mInitialMotionY = y2;
                this.mLastMotionY = y2;
                this.mActivePointerId = motionEvent.getPointerId(0);
                this.mIsUnableToDrag = false;
                this.mIsScrollStarted = true;
                this.mScroller.computeScrollOffset();
                if (this.mScrollState == 2 && Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough) {
                    this.mScroller.abortAnimation();
                    this.mPopulatePending = false;
                    populate();
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                } else {
                    completeScroll(false);
                    this.mIsBeingDragged = false;
                }
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            return this.mIsBeingDragged;
        }
        resetTouch();
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mSuperState);
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            pagerAdapter.LJJIII(savedState.LLILLJJLI, savedState.LLILLL);
            setCurrentItemInternal(savedState.LL, false, true);
        } else {
            this.mRestoredCurItem = savedState.LL;
            this.mRestoredAdapterState = savedState.LLILLJJLI;
            this.mRestoredClassLoader = savedState.LLILLL;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0122  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00db A[PHI: r7 r8 r14
      0x00db: PHI (r7v4 int) = (r7v1 int), (r7v3 int), (r7v6 int) binds: [B:54:0x00d0, B:51:0x00ba, B:44:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x00db: PHI (r8v4 int) = (r8v3 int), (r8v2 int), (r8v6 int) binds: [B:54:0x00d0, B:51:0x00ba, B:44:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x00db: PHI (r14v4 float) = (r14v2 float), (r14v3 float), (r14v1 float) binds: [B:54:0x00d0, B:51:0x00ba, B:44:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void populate(int r18) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.populate(int):void");
    }

    public void removeOnAdapterChangeListener(InterfaceC1846340y9A interfaceC1846340y9A) {
        List<InterfaceC1846340y9A> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(interfaceC1846340y9A);
        }
    }

    public void removeOnPageChangeListener(InterfaceC469360Ias interfaceC469360Ias) {
        List<InterfaceC469360Ias> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(interfaceC469360Ias);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view);
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setCurrentItem(int i) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, !this.mFirstLayout, false);
    }

    public InterfaceC469360Ias setInternalPageChangeListener(InterfaceC469360Ias interfaceC469360Ias) {
        InterfaceC469360Ias interfaceC469360Ias2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = interfaceC469360Ias;
        return interfaceC469360Ias2;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    public void setOnPageChangeListener(InterfaceC469360Ias interfaceC469360Ias) {
        this.mOnPageChangeListener = interfaceC469360Ias;
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setScrollState(int i) {
        boolean z;
        if (this.mScrollState == i) {
            return;
        }
        this.mScrollState = i;
        if (this.mPageTransformer != null) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            enableLayers(z);
        }
        dispatchOnScrollStateChanged(i);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.mMarginDrawable) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C800330VaR.LIZIZ(getContext(), i));
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {
        public boolean LIZ;
        public final int LIZIZ;
        public float LIZJ;
        public boolean LIZLLL;
        public int LJ;
        public int position;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.LIZIZ = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new C21593819f6();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new Runnable() { // from class: X.10ma
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    this.LL.setScrollState(0);
                    this.LL.populate();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
        this.mScrollState = 0;
        initViewPager();
    }

    public static void androidx_viewpager_widget_ViewPager_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_setViewPagerAdapter(ViewPager viewPager, PagerAdapter pagerAdapter) {
        if (viewPager != null) {
            C21594219fA c21594219fA = C788530UwV.LIZIZ;
            viewPager.removeOnPageChangeListener(c21594219fA);
            viewPager.addOnPageChangeListener(c21594219fA);
        }
        if (C788530UwV.LIZ("setViewPagerAdapter")) {
            C2413309cx.LIZ(new C2188231AkX());
        }
        viewPager.androidx_viewpager_widget_ViewPager__setAdapter$___twin___(pagerAdapter);
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        Object parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            View view2 = (View) parent;
            rect.left += view2.getLeft();
            rect.right += view2.getRight();
            rect.top += view2.getTop();
            rect.bottom += view2.getBottom();
            parent = view2.getParent();
        }
        return rect;
    }

    private boolean isGutterDrag(float f, float f2) {
        if (f >= this.mGutterSize || f2 <= 0.0f) {
            if (f > getWidth() - this.mGutterSize && f2 < 0.0f) {
                return true;
            }
            return false;
        }
        return true;
    }

    public C21593819f6 addNewItem(int i, int i2) {
        C21593819f6 c21593819f6 = new C21593819f6();
        c21593819f6.LIZIZ = i;
        c21593819f6.LIZ = this.mAdapter.LJJI(i, this);
        c21593819f6.LIZLLL = this.mAdapter.LJIL(i);
        if (i2 >= 0 && i2 < this.mItems.size()) {
            ListProtector.add(this.mItems, i2, c21593819f6);
            return c21593819f6;
        }
        this.mItems.add(c21593819f6);
        return c21593819f6;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) ListProtector.get(this.mDrawingOrderedChildren, i2)).getLayoutParams()).LJ;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        boolean z;
        int i3;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) != null && layoutParams2.LIZ) {
                int i6 = layoutParams2.LIZIZ;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                if (i8 != 48 && i8 != 80) {
                    z = false;
                } else {
                    z = true;
                }
                if (i7 != 3 && i7 != 5) {
                    z2 = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else if (z2) {
                    i3 = 1073741824;
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) layoutParams2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) layoutParams2).height;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = measuredHeight;
                    }
                } else {
                    i11 = measuredHeight;
                    i5 = i3;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.LIZ)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * layoutParams.LIZJ), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C21593819f6 c21593819f6InfoForChild;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            childCount = -1;
            i3 = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c21593819f6InfoForChild = infoForChild(childAt)) != null && c21593819f6InfoForChild.LIZIZ == this.mCurItem && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    public void setPageTransformer(boolean z, C15D7 c15d7) {
        setPageTransformer(z, c15d7, 2);
    }

    public void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 0);
    }

    private void calculatePageOffsets(C21593819f6 c21593819f6, int i, C21593819f6 c21593819f62) {
        float f;
        float f2;
        float f3;
        int i2;
        int i3;
        C21593819f6 c21593819f63;
        C21593819f6 c21593819f64;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f = this.mPageMargin / clientWidth;
        } else {
            f = 0.0f;
        }
        if (c21593819f62 != null) {
            int i4 = c21593819f62.LIZIZ;
            int i5 = c21593819f6.LIZIZ;
            if (i4 < i5) {
                float fLJIL = c21593819f62.LJ + c21593819f62.LIZLLL + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= c21593819f6.LIZIZ && i7 < this.mItems.size()) {
                    Object obj = ListProtector.get(this.mItems, i7);
                    while (true) {
                        c21593819f64 = (C21593819f6) obj;
                        if (i6 <= c21593819f64.LIZIZ || i7 >= this.mItems.size() - 1) {
                            break;
                        }
                        i7++;
                        obj = ListProtector.get(this.mItems, i7);
                    }
                    while (i6 < c21593819f64.LIZIZ) {
                        fLJIL += this.mAdapter.LJIL(i6) + f;
                        i6++;
                    }
                    c21593819f64.LJ = fLJIL;
                    fLJIL += c21593819f64.LIZLLL + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.mItems.size() - 1;
                float fLJIL2 = c21593819f62.LJ;
                int i8 = i4 - 1;
                while (i8 >= c21593819f6.LIZIZ && size >= 0) {
                    Object obj2 = ListProtector.get(this.mItems, size);
                    while (true) {
                        c21593819f63 = (C21593819f6) obj2;
                        if (i8 >= c21593819f63.LIZIZ || size <= 0) {
                            break;
                        }
                        size--;
                        obj2 = ListProtector.get(this.mItems, size);
                    }
                    while (i8 > c21593819f63.LIZIZ) {
                        fLJIL2 -= this.mAdapter.LJIL(i8) + f;
                        i8--;
                    }
                    fLJIL2 -= c21593819f63.LIZLLL + f;
                    c21593819f63.LJ = fLJIL2;
                    i8--;
                }
            }
        }
        int size2 = this.mItems.size();
        float fLJIL3 = c21593819f6.LJ;
        int i9 = c21593819f6.LIZIZ;
        int i10 = i9 - 1;
        if (i9 == 0) {
            f2 = fLJIL3;
        } else {
            f2 = -3.4028235E38f;
        }
        this.mFirstOffset = f2;
        int i11 = count - 1;
        if (i9 == i11) {
            f3 = (c21593819f6.LIZLLL + fLJIL3) - 1.0f;
        } else {
            f3 = Float.MAX_VALUE;
        }
        this.mLastOffset = f3;
        int i12 = i - 1;
        while (i12 >= 0) {
            C21593819f6 c21593819f65 = (C21593819f6) ListProtector.get(this.mItems, i12);
            while (true) {
                i3 = c21593819f65.LIZIZ;
                if (i10 <= i3) {
                    break;
                }
                fLJIL3 -= this.mAdapter.LJIL(i10) + f;
                i10--;
            }
            fLJIL3 -= c21593819f65.LIZLLL + f;
            c21593819f65.LJ = fLJIL3;
            if (i3 == 0) {
                this.mFirstOffset = fLJIL3;
            }
            i12--;
            i10--;
        }
        float fLJIL4 = c21593819f6.LJ + c21593819f6.LIZLLL + f;
        int i13 = c21593819f6.LIZIZ + 1;
        int i14 = i + 1;
        while (i14 < size2) {
            C21593819f6 c21593819f66 = (C21593819f6) ListProtector.get(this.mItems, i14);
            while (true) {
                i2 = c21593819f66.LIZIZ;
                if (i13 >= i2) {
                    break;
                }
                fLJIL4 += this.mAdapter.LJIL(i13) + f;
                i13++;
            }
            if (i2 == i11) {
                this.mLastOffset = (c21593819f66.LIZLLL + fLJIL4) - 1.0f;
            }
            c21593819f66.LJ = fLJIL4;
            fLJIL4 += c21593819f66.LIZLLL + f;
            i14++;
            i13++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    private void dispatchOnPageScrolled(int i, float f, int i2) {
        InterfaceC469360Ias interfaceC469360Ias = this.mOnPageChangeListener;
        if (interfaceC469360Ias != null) {
            interfaceC469360Ias.onPageScrolled(i, f, i2);
        }
        List<InterfaceC469360Ias> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC469360Ias interfaceC469360Ias2 = (InterfaceC469360Ias) ListProtector.get(this.mOnPageChangeListeners, i3);
                if (interfaceC469360Ias2 != null) {
                    interfaceC469360Ias2.onPageScrolled(i, f, i2);
                }
            }
        }
        InterfaceC469360Ias interfaceC469360Ias3 = this.mInternalPageChangeListener;
        if (interfaceC469360Ias3 != null) {
            interfaceC469360Ias3.onPageScrolled(i, f, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C21593819f6 c21593819f6InfoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (c21593819f6InfoForChild = infoForChild(childAt)) != null && c21593819f6InfoForChild.LIZIZ == this.mCurItem) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean zIsDecorView = layoutParams2.LIZ | isDecorView(view);
        layoutParams2.LIZ = zIsDecorView;
        if (this.mInLayout) {
            if (!zIsDecorView) {
                layoutParams2.LIZLLL = true;
                addViewInLayout(view, i, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPageScrolled(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.mDecorChildCount
            r6 = 0
            r5 = 1
            if (r0 <= 0) goto L69
            int r10 = r11.getScrollX()
            int r7 = r11.getPaddingLeft()
            int r9 = r11.getPaddingRight()
            int r8 = r11.getWidth()
            int r4 = r11.getChildCount()
            r3 = 0
        L1b:
            if (r3 >= r4) goto L69
            android.view.View r2 = r11.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r1 = (androidx.viewpager.widget.ViewPager.LayoutParams) r1
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L44
            int r0 = r1.LIZIZ
            r1 = r0 & 7
            if (r1 == r5) goto L5a
            r0 = 3
            if (r1 == r0) goto L54
            r0 = 5
            if (r1 == r0) goto L47
            r0 = r7
        L38:
            int r7 = r7 + r10
            int r1 = r2.getLeft()
            int r7 = r7 - r1
            if (r7 == 0) goto L43
            r2.offsetLeftAndRight(r7)
        L43:
            r7 = r0
        L44:
            int r3 = r3 + 1
            goto L1b
        L47:
            int r1 = r8 - r9
            int r0 = r2.getMeasuredWidth()
            int r1 = r1 - r0
            int r0 = r2.getMeasuredWidth()
            int r9 = r9 + r0
            goto L66
        L54:
            int r0 = r2.getWidth()
            int r0 = r0 + r7
            goto L38
        L5a:
            int r0 = r2.getMeasuredWidth()
            int r0 = r8 - r0
            int r0 = r0 / 2
            int r1 = java.lang.Math.max(r0, r7)
        L66:
            r0 = r7
            r7 = r1
            goto L38
        L69:
            r11.dispatchOnPageScrolled(r12, r13, r14)
            X.15D7 r0 = r11.mPageTransformer
            if (r0 == 0) goto L9c
            int r4 = r11.getScrollX()
            int r3 = r11.getChildCount()
        L78:
            if (r6 >= r3) goto L9c
            android.view.View r2 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r0 = r0.LIZ
            if (r0 != 0) goto L99
            int r0 = r2.getLeft()
            int r0 = r0 - r4
            float r1 = (float) r0
            int r0 = r11.getClientWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            X.15D7 r0 = r11.mPageTransformer
            r0.LIZ(r2, r1)
        L99:
            int r6 = r6 + 1
            goto L78
        L9c:
            r11.mCalledSuper = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onPageScrolled(int, float, int):void");
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    public void setPageTransformer(boolean z, C15D7 c15d7, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i2 = 1;
        if (c15d7 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.mPageTransformer != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 != z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mPageTransformer = c15d7;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i2 = 2;
            }
            this.mDrawingOrder = i2;
            this.mPageTransformerLayerType = i;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z4) {
            populate();
        }
    }

    public void smoothScrollTo(int i, int i2, int i3) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            if (this.mIsScrollStarted) {
                scrollX = this.mScroller.getCurrX();
            } else {
                scrollX = this.mScroller.getStartX();
            }
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i6 = clientWidth / 2;
        float f = clientWidth;
        float f2 = i6;
        float fDistanceInfluenceForSnapDuration = f2 + (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i4) * 1.0f) / f)) * f2);
        int iAbs2 = Math.abs(i3);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fDistanceInfluenceForSnapDuration / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i4) / ((f * this.mAdapter.LJIL(this.mCurItem)) + this.mPageMargin)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(scrollX, scrollY, i4, i5, iMin);
        postInvalidateOnAnimation();
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
        float f2;
        if (Math.abs(i3) > this.mFlingDistance && Math.abs(i2) > this.mMinimumVelocity) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            if (i >= this.mCurItem) {
                f2 = 0.4f;
            } else {
                f2 = 0.6f;
            }
            i += (int) (f + f2);
        }
        if (this.mItems.size() > 0) {
            return Math.max(((C21593819f6) ListProtector.get(this.mItems, 0)).LIZIZ, Math.min(i, ((C21593819f6) ListProtector.get(this.mItems, r1.size() - 1)).LIZIZ));
        }
        return i;
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        float fMin;
        if (i2 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
            return;
        }
        C21593819f6 c21593819f6InfoForPosition = infoForPosition(this.mCurItem);
        if (c21593819f6InfoForPosition != null) {
            fMin = Math.min(c21593819f6InfoForPosition.LJ, this.mLastOffset);
        } else {
            fMin = 0.0f;
        }
        int paddingLeft = (int) (fMin * ((i - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft == getScrollX()) {
            return;
        }
        completeScroll(false);
        scrollTo(paddingLeft, getScrollY());
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) {
        int clientWidth;
        C21593819f6 c21593819f6InfoForPosition = infoForPosition(i);
        if (c21593819f6InfoForPosition != null) {
            clientWidth = (int) (getClientWidth() * Math.max(this.mFirstOffset, Math.min(c21593819f6InfoForPosition.LJ, this.mLastOffset)));
        } else {
            clientWidth = 0;
        }
        if (z) {
            smoothScrollTo(clientWidth, 0, i2);
            if (z2) {
                dispatchOnPageSelected(i);
                return;
            }
            return;
        }
        if (z2) {
            dispatchOnPageSelected(i);
        }
        completeScroll(false);
        scrollTo(clientWidth, 0);
        pageScrolled(clientWidth);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.mPageMargin;
            recomputeScrollPosition(i, i3, i5, i5);
        }
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        PagerAdapter pagerAdapter = this.mAdapter;
        boolean z3 = false;
        if (pagerAdapter != null && pagerAdapter.getCount() > 0) {
            if (!z2 && this.mCurItem == i && this.mItems.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i < 0) {
                i = 0;
            } else if (i >= this.mAdapter.getCount()) {
                i = this.mAdapter.getCount() - 1;
            }
            int i3 = this.mOffscreenPageLimit;
            int i4 = this.mCurItem;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.mItems.size(); i5++) {
                    ((C21593819f6) ListProtector.get(this.mItems, i5)).LIZJ = true;
                }
            }
            if (this.mCurItem != i) {
                z3 = true;
            }
            if (this.mFirstLayout) {
                this.mCurItem = i;
                if (z3) {
                    dispatchOnPageSelected(i);
                }
                requestLayout();
                return;
            }
            populate(i);
            scrollToItem(i, z, i2, z3);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z && view.canScrollHorizontally(-i)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r16, int r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }
}
