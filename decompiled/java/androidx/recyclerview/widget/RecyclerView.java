package androidx.recyclerview.widget;

import X.AbstractC1338480kw2;
import X.AbstractC1343480l46;
import X.AbstractC1585810rMx;
import X.AbstractC21673619ry;
import X.AbstractC21673719rz;
import X.AbstractC21674019s2;
import X.AbstractC471570IeR;
import X.C08C0;
import X.C08IF;
import X.C09RD;
import X.C09RE;
import X.C0A9Y;
import X.C0C64;
import X.C0DXR;
import X.C1318260kPQ;
import X.C1697810uHb;
import X.C19737612Kg;
import X.C1AF0;
import X.C1ETA;
import X.C1ETB;
import X.C20070813g2;
import X.C20081213hi;
import X.C20087713il;
import X.C20087813im;
import X.C20093113jd;
import X.C20094913jv;
import X.C20097913kP;
import X.C21581319d5;
import X.C21645019nM;
import X.C21673319rv;
import X.C21673819s0;
import X.C21673919s1;
import X.C21674419s6;
import X.C21674519s7;
import X.C21674719s9;
import X.C21674819sA;
import X.C21675619sI;
import X.C21675919sL;
import X.C21676219sO;
import X.C21676319sP;
import X.C21676719sT;
import X.C2188221AkW;
import X.C2188811AlT;
import X.C2413309cx;
import X.C2514909tL;
import X.C423520Gj8;
import X.C688970R0t;
import X.C786410Ut5;
import X.C788530UwV;
import X.C788540UwW;
import X.InterfaceC1354050lL9;
import X.InterfaceC1811800xFS;
import X.InterfaceC20088013io;
import X.InterfaceC20097013kG;
import X.InterfaceC21676019sM;
import X.InterfaceC21676519sR;
import X.InterfaceC21676819sU;
import X.InterfaceC21677219sY;
import X.InterfaceC21677319sZ;
import X.InterfaceC21677419sa;
import X.RunnableC21673419rw;
import X.RunnableC21673519rx;
import X.ViewOnAttachStateChangeListenerC438390HGz;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ttpobfuscated.e3;
import u4.q0;

/* JADX INFO: loaded from: classes34.dex */
public class RecyclerView extends ViewGroup implements InterfaceC1354050lL9, InterfaceC20097013kG {
    public static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    public static boolean sDebugAssertionsEnabled;
    public static final C21581319d5 sDefaultEdgeEffectFactory;
    public static final Interpolator sQuinticInterpolator;
    public static boolean sVerboseLoggingEnabled;
    public C20094913jv mAccessibilityDelegate;
    public final AccessibilityManager mAccessibilityManager;
    public AbstractC21673619ry mAdapter;
    public AdapterHelper mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    public EdgeEffect mBottomGlow;
    public InterfaceC1811800xFS mChildDrawingOrderCallback;
    public ChildHelper mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    public boolean mDispatchItemsChangedEvent;
    public int mDispatchScrollCounter;
    public int mEatenAccessibilityChangeFlags;
    public C688970R0t mEdgeEffectFactory;
    public boolean mEnableFastScroller;
    public boolean mFirstLayoutComplete;
    public RunnableC21673419rw mGapWorker;
    public boolean mHasFixedSize;
    public boolean mIgnoreMotionEventTillDown;
    public int mInitialTouchX;
    public int mInitialTouchY;
    public int mInterceptRequestLayoutDepth;
    public InterfaceC21676019sM mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public AbstractC21673719rz mItemAnimator;
    public InterfaceC21677319sZ mItemAnimatorListener;
    public Runnable mItemAnimatorRunner;
    public final ArrayList<C0DXR> mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    public int mLastAutoMeasureNonExactMeasuredHeight;
    public int mLastAutoMeasureNonExactMeasuredWidth;
    public boolean mLastAutoMeasureSkippedDueToExact;
    public int mLastTouchX;
    public int mLastTouchY;
    public LayoutManager mLayout;
    public int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    public EdgeEffect mLeftGlow;
    public final int mMaxFlingVelocity;
    public final int mMinFlingVelocity;
    public final int[] mMinMaxLayoutPositions;
    public final int[] mNestedOffsets;
    public final C21674519s7 mObserver;
    public List<InterfaceC21676519sR> mOnChildAttachStateListeners;
    public AbstractC1338480kw2 mOnFlingListener;
    public final ArrayList<InterfaceC21676019sM> mOnItemTouchListeners;
    public final List<ViewHolder> mPendingAccessibilityImportanceChange;
    public SavedState mPendingSavedState;
    public final float mPhysicalCoef;
    public boolean mPostedAnimatorRunner;
    public C21673819s0 mPrefetchRegistry;
    public boolean mPreserveFocusAfterLayout;
    public final C21673319rv mRecycler;
    public InterfaceC21676819sU mRecyclerListener;
    public final List<InterfaceC21676819sU> mRecyclerListeners;
    public final int[] mReusableIntPair;
    public EdgeEffect mRightGlow;
    public float mScaledHorizontalScrollFactor;
    public float mScaledVerticalScrollFactor;
    public AbstractC1585810rMx mScrollListener;
    public List<AbstractC1585810rMx> mScrollListeners;
    public final int[] mScrollOffset;
    public int mScrollPointerId;
    public int mScrollState;
    public C1318260kPQ mScrollingChildHelper;
    public final C21673919s1 mState;
    public final Rect mTempRect;
    public final Rect mTempRect2;
    public final RectF mTempRectF;
    public EdgeEffect mTopGlow;
    public int mTouchSlop;
    public final Runnable mUpdateChildViewsRunnable;
    public VelocityTracker mVelocityTracker;
    public final RunnableC21673519rx mViewFlinger;
    public final InterfaceC21677419sa mViewInfoProcessCallback;
    public final C21674419s6 mViewInfoStore;
    public static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    public static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    public static final boolean POST_UPDATES_ON_ANIMATION = true;
    public static final boolean ALLOW_THREAD_GAP_WORK = true;
    public static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    public static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    public static abstract class LayoutManager {
        public boolean mAutoMeasure;
        public ChildHelper mChildHelper;
        public int mHeight;
        public int mHeightMode;
        public C1ETB mHorizontalBoundCheck;
        public final C1ETA mHorizontalBoundCheckCallback;
        public boolean mIsAttachedToWindow;
        public boolean mItemPrefetchEnabled;
        public boolean mMeasurementCacheEnabled;
        public int mPrefetchMaxCountObserved;
        public boolean mPrefetchMaxObservedInInitialPrefetch;
        public RecyclerView mRecyclerView;
        public boolean mRequestedSimpleAnimations;
        public AbstractC21674019s2 mSmoothScroller;
        public C1ETB mVerticalBoundCheck;
        public final C1ETA mVerticalBoundCheckCallback;
        public int mWidth;
        public int mWidthMode;

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public void collectAdjacentPrefetchPositions(int i, int i2, C21673919s1 c21673919s1, InterfaceC21677219sY interfaceC21677219sY) {
        }

        public void collectInitialPrefetchPositions(int i, InterfaceC21677219sY interfaceC21677219sY) {
        }

        public int computeHorizontalScrollExtent(C21673919s1 c21673919s1) {
            return 0;
        }

        public int computeHorizontalScrollOffset(C21673919s1 c21673919s1) {
            return 0;
        }

        public int computeHorizontalScrollRange(C21673919s1 c21673919s1) {
            return 0;
        }

        public int computeVerticalScrollExtent(C21673919s1 c21673919s1) {
            return 0;
        }

        public int computeVerticalScrollOffset(C21673919s1 c21673919s1) {
            return 0;
        }

        public int computeVerticalScrollRange(C21673919s1 c21673919s1) {
            return 0;
        }

        public abstract LayoutParams generateDefaultLayoutParams();

        public int getBaseline() {
            return -1;
        }

        public int getColumnCountForAccessibility(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
            return -1;
        }

        public int getRowCountForAccessibility(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
            return -1;
        }

        public int getSelectionModeForAccessibility(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
            return 0;
        }

        public boolean isLayoutHierarchical(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
            return false;
        }

        public void onAdapterChanged(AbstractC21673619ry abstractC21673619ry, AbstractC21673619ry abstractC21673619ry2) {
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public View onFocusSearchFailed(View view, int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
            return null;
        }

        public void onInitializeAccessibilityNodeInfoForItem(C21673319rv c21673319rv, C21673919s1 c21673919s1, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        }

        public View onInterceptFocusSearch(View view, int i) {
            return null;
        }

        public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        }

        public void onLayoutChildren(C21673319rv c21673319rv, C21673919s1 c21673919s1) {
        }

        public void onLayoutCompleted(C21673919s1 c21673919s1) {
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i) {
        }

        public boolean performAccessibilityActionForItem(C21673319rv c21673319rv, C21673919s1 c21673919s1, View view, int i, Bundle bundle) {
            return false;
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
            return 0;
        }

        public int scrollVerticallyBy(int i, C21673319rv c21673319rv, C21673919s1 c21673919s1) {
            return 0;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, C21673919s1 c21673919s1, int i) {
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public int getChildCount() {
            ChildHelper childHelper = this.mChildHelper;
            if (childHelper != null) {
                return childHelper.getChildCount();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.isHidden(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getItemCount() {
            AbstractC21673619ry adapter;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
                return 0;
            }
            return adapter.getItemCount();
        }

        public int getLayoutDirection() {
            return this.mRecyclerView.getLayoutDirection();
        }

        public int getMinimumHeight() {
            return this.mRecyclerView.getMinimumHeight();
        }

        public int getMinimumWidth() {
            return this.mRecyclerView.getMinimumWidth();
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingEnd();
            }
            return 0;
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingStart();
            }
            return 0;
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public boolean isSmoothScrolling() {
            AbstractC21674019s2 abstractC21674019s2 = this.mSmoothScroller;
            return abstractC21674019s2 != null && abstractC21674019s2.LJ;
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void stopSmoothScroller() {
            AbstractC21674019s2 abstractC21674019s2 = this.mSmoothScroller;
            if (abstractC21674019s2 != null) {
                abstractC21674019s2.LJII();
            }
        }

        public LayoutManager() {
            C1ETA c1eta = new C1ETA() { // from class: X.19sD
                @Override // X.C1ETA
                public final int LIZIZ() {
                    return this.LIZ.getWidth() - this.LIZ.getPaddingRight();
                }

                @Override // X.C1ETA
                public final int LIZLLL() {
                    return this.LIZ.getPaddingLeft();
                }

                @Override // X.C1ETA
                public final int LIZ(View view) {
                    return this.LIZ.getDecoratedRight(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).rightMargin;
                }

                @Override // X.C1ETA
                public final int LIZJ(View view) {
                    return this.LIZ.getDecoratedLeft(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin;
                }

                @Override // X.C1ETA
                public final View getChildAt(int i) {
                    return this.LIZ.getChildAt(i);
                }
            };
            this.mHorizontalBoundCheckCallback = c1eta;
            C1ETA c1eta2 = new C1ETA() { // from class: X.19sE
                @Override // X.C1ETA
                public final int LIZIZ() {
                    return this.LIZ.getHeight() - this.LIZ.getPaddingBottom();
                }

                @Override // X.C1ETA
                public final int LIZLLL() {
                    return this.LIZ.getPaddingTop();
                }

                @Override // X.C1ETA
                public final int LIZ(View view) {
                    return this.LIZ.getDecoratedBottom(view) + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
                }

                @Override // X.C1ETA
                public final int LIZJ(View view) {
                    return this.LIZ.getDecoratedTop(view) - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).topMargin;
                }

                @Override // X.C1ETA
                public final View getChildAt(int i) {
                    return this.LIZ.getChildAt(i);
                }
            };
            this.mVerticalBoundCheckCallback = c1eta2;
            this.mHorizontalBoundCheck = new C1ETB(c1eta);
            this.mVerticalBoundCheck = new C1ETB(c1eta2);
            this.mRequestedSimpleAnimations = false;
            this.mIsAttachedToWindow = false;
            this.mAutoMeasure = false;
            this.mMeasurementCacheEnabled = true;
            this.mItemPrefetchEnabled = true;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.removeViewAt(childCount);
            }
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(View view) {
            attachView(view, -1);
        }

        public void detachAndScrapAttachedViews(C21673319rv c21673319rv) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(c21673319rv, childCount, getChildAt(childCount));
            }
        }

        public void detachView(View view) {
            int iIndexOfChild = this.mChildHelper.indexOfChild(view);
            if (iIndexOfChild >= 0) {
                detachViewInternal(iIndexOfChild, view);
            }
        }

        public void detachViewAt(int i) {
            detachViewInternal(i, getChildAt(i));
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void endAnimation(View view) {
            AbstractC21673719rz abstractC21673719rz = this.mRecyclerView.mItemAnimator;
            if (abstractC21673719rz != null) {
                abstractC21673719rz.LJIIJJI(RecyclerView.getChildViewHolderInt(view));
            }
        }

        public View findContainingItemView(View view) {
            View viewFindContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.isHidden(viewFindContainingItemView)) {
                return null;
            }
            return viewFindContainingItemView;
        }

        public View findViewByPosition(int i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.LJI || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new LayoutParams(layoutParams);
        }

        public int getBottomDecorationHeight(View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.bottom;
        }

        public View getChildAt(int i) {
            ChildHelper childHelper = this.mChildHelper;
            if (childHelper != null) {
                return childHelper.getChildAt(i);
            }
            return null;
        }

        public int getDecoratedBottom(View view) {
            return view.getBottom() + getBottomDecorationHeight(view);
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(View view) {
            return view.getRight() + getRightDecorationWidth(view);
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public int getItemViewType(View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLeftDecorationWidth(View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.left;
        }

        public int getPosition(View view) {
            return ((LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
        }

        public int getRightDecorationWidth(View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.right;
        }

        public int getTopDecorationHeight(View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.top;
        }

        public void ignoreView(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent == recyclerView && recyclerView.indexOfChild(view) != -1) {
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                childViewHolderInt.addFlags(128);
                this.mRecyclerView.mViewInfoStore.LIZLLL(childViewHolderInt);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("View should be fully attached to be ignored");
                sbLIZ.append(this.mRecyclerView.exceptionLabel());
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }

        public void offsetChildrenHorizontal(int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void offsetChildrenVertical(int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, accessibilityNodeInfoCompat);
        }

        public void onSmoothScrollerStopped(AbstractC21674019s2 abstractC21674019s2) {
            if (this.mSmoothScroller == abstractC21674019s2) {
                this.mSmoothScroller = null;
            }
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.postOnAnimation(runnable);
            }
        }

        public void removeAndRecycleAllViews(C21673319rv c21673319rv) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, c21673319rv);
                }
            }
        }

        public void removeAndRecycleScrapInt(C21673319rv c21673319rv) {
            int size = c21673319rv.LIZ.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = ((ViewHolder) ListProtector.get(c21673319rv.LIZ, i)).itemView;
                ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(view, false);
                    }
                    AbstractC21673719rz abstractC21673719rz = this.mRecyclerView.mItemAnimator;
                    if (abstractC21673719rz != null) {
                        abstractC21673719rz.LJIIJJI(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    ViewHolder childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    c21673319rv.LJIIL(childViewHolderInt2);
                }
            }
            c21673319rv.LIZ.clear();
            ArrayList<ViewHolder> arrayList = c21673319rv.LIZIZ;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(View view) {
            this.mChildHelper.removeView(view);
        }

        public void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                this.mChildHelper.removeViewAt(i);
            }
        }

        public void scrollToPosition(int i) {
            boolean z = RecyclerView.sDebugAssertionsEnabled;
        }

        public void setAutoMeasureEnabled(boolean z) {
            this.mAutoMeasure = z;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if (z != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.LJIIZILJ();
                }
            }
        }

        public void setMeasurementCacheEnabled(boolean z) {
            this.mMeasurementCacheEnabled = z;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public void startSmoothScroll(AbstractC21674019s2 abstractC21674019s2) {
            AbstractC21674019s2 abstractC21674019s22 = this.mSmoothScroller;
            if (abstractC21674019s22 != null && abstractC21674019s2 != abstractC21674019s22 && abstractC21674019s22.LJ) {
                abstractC21674019s22.LJII();
            }
            this.mSmoothScroller = abstractC21674019s2;
            RecyclerView recyclerView = this.mRecyclerView;
            abstractC21674019s2.getClass();
            RunnableC21673519rx runnableC21673519rx = recyclerView.mViewFlinger;
            runnableC21673519rx.LLIZ.removeCallbacks(runnableC21673519rx);
            runnableC21673519rx.LLILLL.abortAnimation();
            abstractC21674019s2.LIZIZ = recyclerView;
            abstractC21674019s2.LIZJ = this;
            int i = abstractC21674019s2.LIZ;
            if (i != -1) {
                recyclerView.mState.LIZ = i;
                abstractC21674019s2.LJ = true;
                abstractC21674019s2.LIZLLL = true;
                abstractC21674019s2.LJFF = recyclerView.mLayout.findViewByPosition(i);
                abstractC21674019s2.LJ();
                abstractC21674019s2.LIZIZ.mViewFlinger.LIZJ();
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public void stopIgnoringView(View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        private void detachViewInternal(int i, View view) {
            this.mChildHelper.detachViewFromParent(i);
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i = left - paddingLeft;
            int iMin = Math.min(0, i);
            int i2 = top - paddingTop;
            int iMin2 = Math.min(0, i2);
            int i3 = iWidth - width;
            int iMax = Math.max(0, i3);
            int iMax2 = Math.max(0, iHeight - height);
            if (getLayoutDirection() == 1) {
                if (iMax == 0) {
                    iMax = Math.max(iMin, i3);
                }
            } else {
                if (iMin == 0) {
                    iMin = Math.min(i, iMax);
                }
                iMax = iMin;
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i2, iMax2);
            }
            iArr[0] = iMax;
            iArr[1] = iMin2;
            return iArr;
        }

        public void addDisappearingView(View view, int i) {
            addViewInt(view, i, true);
        }

        public void addView(View view, int i) {
            addViewInt(view, i, false);
        }

        public void attachView(View view, int i) {
            attachView(view, i, (LayoutParams) view.getLayoutParams());
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public void detachAndScrapView(View view, C21673319rv c21673319rv) {
            scrapOrRecycleView(c21673319rv, this.mChildHelper.indexOfChild(view), view);
        }

        public void detachAndScrapViewAt(int i, C21673319rv c21673319rv) {
            scrapOrRecycleView(c21673319rv, i, getChildAt(i));
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, C21673319rv c21673319rv) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, c21673319rv);
        }

        public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public void moveView(int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                detachViewAt(i);
                attachView(childAt, i2);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Cannot move a child from non-existing index:");
                sbLIZ.append(i);
                sbLIZ.append(this.mRecyclerView.toString());
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, C21673319rv c21673319rv) {
            onDetachedFromWindow(recyclerView);
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && !this.mChildHelper.isHidden(childViewHolderInt.itemView)) {
                RecyclerView recyclerView = this.mRecyclerView;
                onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, accessibilityNodeInfoCompat);
            }
        }

        public boolean performAccessibilityAction(int i, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        public void removeAndRecycleView(View view, C21673319rv c21673319rv) {
            removeView(view);
            c21673319rv.LJIIJJI(view);
        }

        public void removeAndRecycleViewAt(int i, C21673319rv c21673319rv) {
            View childAt = getChildAt(i);
            removeViewAt(i);
            c21673319rv.LJIIJJI(childAt);
        }

        public void setMeasureSpecs(int i, int i2) {
            this.mWidth = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mHeightMode = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mHeight = 0;
            }
        }

        public void setMeasuredDimension(int i, int i2) {
            this.mRecyclerView.setMeasuredDimension(i, i2);
        }

        public void setMeasuredDimensionFromChildren(int i, int i2) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i8 = rect.left;
                if (i8 < i6) {
                    i6 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i5) {
                    i5 = i11;
                }
            }
            this.mRecyclerView.mTempRect.set(i6, i4, i3, i5);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i, i2);
        }

        private void addViewInt(View view, int i, boolean z) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!z && !childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.LIZJ(childViewHolderInt);
            } else {
                C21674419s6 c21674419s6 = this.mRecyclerView.mViewInfoStore;
                C21675619sI c21675619sILIZ = c21674419s6.LIZ.get(childViewHolderInt);
                if (c21675619sILIZ == null) {
                    c21675619sILIZ = C21675619sI.LIZ();
                    c21674419s6.LIZ.put(childViewHolderInt, c21675619sILIZ);
                }
                c21675619sILIZ.LIZ |= 1;
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (!childViewHolderInt.wasReturnedFromScrap() && !childViewHolderInt.isScrap()) {
                if (view.getParent() == this.mRecyclerView) {
                    int iIndexOfChild = this.mChildHelper.indexOfChild(view);
                    if (i == -1) {
                        i = this.mChildHelper.getChildCount();
                    }
                    if (iIndexOfChild != -1) {
                        if (iIndexOfChild != i) {
                            this.mRecyclerView.mLayout.moveView(iIndexOfChild, i);
                        }
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        sbLIZ.append(this.mRecyclerView.indexOfChild(view));
                        sbLIZ.append(this.mRecyclerView.exceptionLabel());
                        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    this.mChildHelper.addView(view, i, false);
                    layoutParams.mInsetsDirty = true;
                    AbstractC21674019s2 abstractC21674019s2 = this.mSmoothScroller;
                    if (abstractC21674019s2 != null && abstractC21674019s2.LJ && abstractC21674019s2.LIZIZ.getChildLayoutPosition(view) == abstractC21674019s2.LIZ) {
                        abstractC21674019s2.LJFF = view;
                    }
                }
            } else {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.attachViewToParent(view, i, view.getLayoutParams(), false);
            }
            if (layoutParams.mPendingInvalidate) {
                childViewHolderInt.itemView.invalidate();
                layoutParams.mPendingInvalidate = false;
            }
        }

        public static int chooseSize(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    return Math.max(i2, i3);
                }
                return size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            if (rect.left - i >= width || rect.right - i <= paddingLeft || rect.top - i2 >= height || rect.bottom - i2 <= paddingTop) {
                return false;
            }
            return true;
        }

        public static boolean isMeasurementUpToDate(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode != 1073741824 || size != i) {
                    return false;
                }
                return true;
            }
            if (size < i) {
                return false;
            }
            return true;
        }

        private void scrapOrRecycleView(C21673319rv c21673319rv, int i, View view) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.shouldIgnore()) {
                return;
            }
            if (childViewHolderInt.isInvalid() && !childViewHolderInt.isRemoved() && !this.mRecyclerView.mAdapter.mHasStableIds) {
                removeViewAt(i);
                c21673319rv.LJIIL(childViewHolderInt);
            } else {
                detachViewAt(i);
                c21673319rv.LJIILIIL(view);
                this.mRecyclerView.mViewInfoStore.LIZJ(childViewHolderInt);
            }
        }

        public void attachView(View view, int i, LayoutParams layoutParams) {
            ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                C21674419s6 c21674419s6 = this.mRecyclerView.mViewInfoStore;
                C21675619sI c21675619sILIZ = c21674419s6.LIZ.get(childViewHolderInt);
                if (c21675619sILIZ == null) {
                    c21675619sILIZ = C21675619sI.LIZ();
                    c21674419s6.LIZ.put(childViewHolderInt, c21675619sILIZ);
                }
                c21675619sILIZ.LIZ |= 1;
            } else {
                this.mRecyclerView.mViewInfoStore.LIZJ(childViewHolderInt);
            }
            this.mChildHelper.attachViewToParent(view, i, layoutParams, childViewHolderInt.isRemoved());
        }

        public void getTransformedBoundingBox(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.mRecyclerView != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean isViewPartiallyVisible(View view, boolean z, boolean z2) {
            boolean z3;
            if (this.mHorizontalBoundCheck.LIZIZ(view) && this.mVerticalBoundCheck.LIZIZ(view)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z) {
                return z3;
            }
            return !z3;
        }

        public void measureChild(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i4 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i4 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i3, ((ViewGroup.MarginLayoutParams) layoutParams).width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void onInitializeAccessibilityEvent(C21673319rv c21673319rv, C21673919s1 c21673919s1, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                AbstractC21673619ry abstractC21673619ry = this.mRecyclerView.mAdapter;
                if (abstractC21673619ry != null) {
                    accessibilityEvent.setItemCount(abstractC21673619ry.getItemCount());
                }
            }
        }

        public void onInitializeAccessibilityNodeInfo(C21673319rv c21673319rv, C21673919s1 c21673919s1, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                accessibilityNodeInfoCompat.addAction(8192);
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                accessibilityNodeInfoCompat.addAction(SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                accessibilityNodeInfoCompat.setScrollable(true);
            }
            accessibilityNodeInfoCompat.setCollectionInfo(C20093113jd.LIZIZ(getRowCountForAccessibility(c21673319rv, c21673919s1), getColumnCountForAccessibility(c21673319rv, c21673919s1), getSelectionModeForAccessibility(c21673319rv, c21673919s1), isLayoutHierarchical(c21673319rv, c21673919s1)));
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            if (!isSmoothScrolling() && !recyclerView.isComputingLayout()) {
                return false;
            }
            return true;
        }

        public boolean performAccessibilityActionForItem(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        public void setMeasuredDimension(Rect rect, int i, int i2) {
            setMeasuredDimension(chooseSize(i, rect.width() + getPaddingLeft() + getPaddingRight(), getMinimumWidth()), chooseSize(i2, rect.height() + getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:5:0x000a A[PHI: r3
          0x000a: PHI (r3v5 int) = (r3v0 int), (r3v2 int), (r3v0 int) binds: [B:8:0x0011, B:11:0x0016, B:4:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                if (r4 == 0) goto L11
                if (r3 < 0) goto L1f
            La:
                r2 = 1073741824(0x40000000, float:2.0)
            Lc:
                int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r0
            L11:
                if (r3 >= 0) goto La
                r0 = -1
                if (r3 != r0) goto L18
                r3 = r1
                goto La
            L18:
                r0 = -2
                if (r3 != r0) goto L1f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1
                goto Lc
            L1f:
                r3 = 0
                goto Lc
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(int, int, int, boolean):int");
        }

        public static C21675919sL getProperties(Context context, AttributeSet attributeSet, int i, int i2) {
            C21675919sL c21675919sL = new C21675919sL();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RecyclerView, i, i2);
            c21675919sL.LIZ = typedArrayObtainStyledAttributes.getInt(R$styleable.RecyclerView_android_orientation, 1);
            c21675919sL.LIZIZ = typedArrayObtainStyledAttributes.getInt(R$styleable.RecyclerView_spanCount, 1);
            c21675919sL.LIZJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RecyclerView_reverseLayout, false);
            c21675919sL.LIZLLL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RecyclerView_stackFromEnd, false);
            typedArrayObtainStyledAttributes.recycle();
            return c21675919sL;
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
            onItemsUpdated(recyclerView, i, i2);
        }

        public void onMeasure(C21673319rv c21673319rv, C21673919s1 c21673919s1, int i, int i2) {
            this.mRecyclerView.defaultOnMeasure(i, i2);
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, C21673919s1 c21673919s1, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[PHI: r4
          0x008d: PHI (r4v6 int) = (r4v3 int), (r4v9 int) binds: [B:28:0x007e, B:18:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean performAccessibilityAction(X.C21673319rv r9, X.C21673919s1 r10, int r11, android.os.Bundle r12) {
            /*
                r8 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r8.mRecyclerView
                r2 = 0
                if (r0 != 0) goto L6
                return r2
            L6:
                int r4 = r8.getHeight()
                int r3 = r8.getWidth()
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                androidx.recyclerview.widget.RecyclerView r0 = r8.mRecyclerView
                android.graphics.Matrix r0 = r0.getMatrix()
                boolean r0 = r0.isIdentity()
                if (r0 == 0) goto L2f
                androidx.recyclerview.widget.RecyclerView r0 = r8.mRecyclerView
                boolean r0 = r0.getGlobalVisibleRect(r1)
                if (r0 == 0) goto L2f
                int r4 = r1.height()
                int r3 = r1.width()
            L2f:
                r0 = 4096(0x1000, float:5.74E-42)
                r7 = 1
                if (r11 == r0) goto L66
                r0 = 8192(0x2000, float:1.148E-41)
                if (r11 != r0) goto L63
                androidx.recyclerview.widget.RecyclerView r0 = r8.mRecyclerView
                r1 = -1
                boolean r0 = r0.canScrollVertically(r1)
                if (r0 == 0) goto L64
                int r0 = r8.getPaddingTop()
                int r4 = r4 - r0
                int r0 = r8.getPaddingBottom()
                int r4 = r4 - r0
                int r4 = -r4
            L4c:
                androidx.recyclerview.widget.RecyclerView r0 = r8.mRecyclerView
                boolean r0 = r0.canScrollHorizontally(r1)
                if (r0 == 0) goto L8d
                int r0 = r8.getPaddingLeft()
                int r3 = r3 - r0
                int r0 = r8.getPaddingRight()
                int r3 = r3 - r0
                int r3 = -r3
            L5f:
                if (r4 != 0) goto L8f
                if (r3 != 0) goto L8f
            L63:
                return r2
            L64:
                r4 = 0
                goto L4c
            L66:
                androidx.recyclerview.widget.RecyclerView r0 = r8.mRecyclerView
                boolean r0 = r0.canScrollVertically(r7)
                if (r0 == 0) goto L8b
                int r0 = r8.getPaddingTop()
                int r4 = r4 - r0
                int r0 = r8.getPaddingBottom()
                int r4 = r4 - r0
            L78:
                androidx.recyclerview.widget.RecyclerView r0 = r8.mRecyclerView
                boolean r0 = r0.canScrollHorizontally(r7)
                if (r0 == 0) goto L8d
                int r0 = r8.getPaddingLeft()
                int r3 = r3 - r0
                int r0 = r8.getPaddingRight()
                int r3 = r3 - r0
                goto L5f
            L8b:
                r4 = 0
                goto L78
            L8d:
                r3 = 0
                goto L5f
            L8f:
                androidx.recyclerview.widget.RecyclerView r2 = r8.mRecyclerView
                r5 = 0
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                r2.smoothScrollBy(r3, r4, r5, r6, r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.performAccessibilityAction(X.19rv, X.19s1, int, android.os.Bundle):boolean");
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
        }

        public boolean shouldMeasureChild(View view, int i, int i2, LayoutParams layoutParams) {
            if (!view.isLayoutRequested() && this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) {
                return false;
            }
            return true;
        }

        public boolean shouldReMeasureChild(View view, int i, int i2, LayoutParams layoutParams) {
            if (this.mMeasurementCacheEnabled && isMeasurementUpToDate(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) && isMeasurementUpToDate(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height)) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r0 = 0
                int r4 = java.lang.Math.max(r0, r4)
                r3 = -2
                r2 = -1
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1f
                if (r7 >= 0) goto L32
                if (r7 != r2) goto L18
                if (r5 == r1) goto L30
                if (r5 == 0) goto L18
                if (r5 == r0) goto L30
            L18:
                r5 = 0
                r7 = 0
            L1a:
                int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r0
            L1f:
                if (r7 >= 0) goto L32
                if (r7 == r2) goto L30
                if (r7 != r3) goto L18
                if (r5 == r1) goto L2c
                if (r5 == r0) goto L2c
                r7 = r4
                r5 = 0
                goto L1a
            L2c:
                r7 = r4
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L1a
            L30:
                r7 = r4
                goto L1a
            L32:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.LayoutManager.getChildMeasureSpec(int, int, int, int, boolean):int");
        }

        public void layoutDecorated(View view, int i, int i2, int i3, int i4) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.mDecorInsets;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i = childRectangleOnScreenScrollAmount[0];
            int i2 = childRectangleOnScreenScrollAmount[1];
            if ((z2 && !isFocusedChildVisibleAfterScrolling(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
                return true;
            }
            recyclerView.smoothScrollBy(i, i2);
            return true;
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public final Rect mDecorInsets;
        public boolean mInsetsDirty;
        public boolean mPendingInvalidate;
        public ViewHolder mViewHolder;

        public int getAbsoluteAdapterPosition() {
            return this.mViewHolder.getAbsoluteAdapterPosition();
        }

        public int getBindingAdapterPosition() {
            return this.mViewHolder.getBindingAdapterPosition();
        }

        public int getViewAdapterPosition() {
            return this.mViewHolder.getBindingAdapterPosition();
        }

        public int getViewLayoutPosition() {
            return this.mViewHolder.getLayoutPosition();
        }

        public int getViewPosition() {
            return this.mViewHolder.getPosition();
        }

        public boolean isItemChanged() {
            return this.mViewHolder.isUpdated();
        }

        public boolean isItemRemoved() {
            return this.mViewHolder.isRemoved();
        }

        public boolean isViewInvalid() {
            return this.mViewHolder.isInvalid();
        }

        public boolean viewNeedsUpdate() {
            return this.mViewHolder.needsUpdate();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mDecorInsets = new Rect();
            this.mInsetsDirty = true;
            this.mPendingInvalidate = false;
        }
    }

    /* JADX INFO: loaded from: classes30.dex */
    public static class RecycledViewPool {
        public SparseArray<ScrapData> mScrap = new SparseArray<>();
        public int mAttachCountForClearing = 0;
        public Set<AbstractC21673619ry<?>> mAttachedAdaptersForPoolingContainer = Collections.newSetFromMap(new IdentityHashMap());

        public static class ScrapData {
            public final ArrayList<ViewHolder> mScrapHeap = new ArrayList<>();
            public int mMaxScrap = 5;
            public long mCreateRunningAverageNs = 0;
            public long mBindRunningAverageNs = 0;
        }

        public void clear() {
            for (int i = 0; i < this.mScrap.size(); i++) {
                ScrapData scrapDataValueAt = this.mScrap.valueAt(i);
                Iterator<ViewHolder> it2 = scrapDataValueAt.mScrapHeap.iterator();
                while (it2.hasNext()) {
                    C20087713il.LIZ(it2.next().itemView);
                }
                scrapDataValueAt.mScrapHeap.clear();
            }
        }

        public void putRecycledView(ViewHolder viewHolder) {
            androidx_recyclerview_widget_RecyclerView$RecycledViewPool_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_putRecycledView(this, viewHolder);
        }

        public int size() {
            int size = 0;
            for (int i = 0; i < this.mScrap.size(); i++) {
                ArrayList<ViewHolder> arrayList = this.mScrap.valueAt(i).mScrapHeap;
                if (arrayList != null) {
                    size += arrayList.size();
                }
            }
            return size;
        }

        public void attach() {
            this.mAttachCountForClearing++;
        }

        public void detach() {
            this.mAttachCountForClearing--;
        }

        private ScrapData getScrapDataForType(int i) {
            ScrapData scrapData = this.mScrap.get(i);
            if (scrapData == null) {
                ScrapData scrapData2 = new ScrapData();
                this.mScrap.put(i, scrapData2);
                return scrapData2;
            }
            return scrapData;
        }

        public void androidx_recyclerview_widget_RecyclerView$RecycledViewPool__putRecycledView$___twin___(ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            ArrayList<ViewHolder> arrayList = getScrapDataForType(itemViewType).mScrapHeap;
            if (this.mScrap.get(itemViewType).mMaxScrap <= arrayList.size()) {
                C20087713il.LIZ(viewHolder.itemView);
            } else {
                if (RecyclerView.sDebugAssertionsEnabled && arrayList.contains(viewHolder)) {
                    throw new IllegalArgumentException("this scrap item already exists");
                }
                viewHolder.resetInternal();
                arrayList.add(viewHolder);
            }
        }

        public void attachForPoolingContainer(AbstractC21673619ry<?> abstractC21673619ry) {
            this.mAttachedAdaptersForPoolingContainer.add(abstractC21673619ry);
        }

        public ViewHolder getRecycledView(int i) {
            ScrapData scrapData = this.mScrap.get(i);
            if (scrapData != null && !scrapData.mScrapHeap.isEmpty()) {
                ArrayList<ViewHolder> arrayList = scrapData.mScrapHeap;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (!((ViewHolder) ListProtector.get(arrayList, size)).isAttachedToTransitionOverlay()) {
                        return (ViewHolder) ListProtector.remove(arrayList, size);
                    }
                }
                return null;
            }
            return null;
        }

        public int getRecycledViewCount(int i) {
            return getScrapDataForType(i).mScrapHeap.size();
        }

        public static void androidx_recyclerview_widget_RecyclerView$RecycledViewPool_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_putRecycledView(RecycledViewPool recycledViewPool, ViewHolder viewHolder) {
            if (Looper.getMainLooper().getThread() != C786410Ut5.u3()) {
                C1AF0.LJ(new RuntimeException("putRecycledView in child thread ---> "));
            }
            recycledViewPool.androidx_recyclerview_widget_RecyclerView$RecycledViewPool__putRecycledView$___twin___(viewHolder);
        }

        public void detachForPoolingContainer(AbstractC21673619ry<?> abstractC21673619ry, boolean z) {
            this.mAttachedAdaptersForPoolingContainer.remove(abstractC21673619ry);
            if (this.mAttachedAdaptersForPoolingContainer.size() == 0 && !z) {
                for (int i = 0; i < this.mScrap.size(); i++) {
                    SparseArray<ScrapData> sparseArray = this.mScrap;
                    ArrayList<ViewHolder> arrayList = sparseArray.get(sparseArray.keyAt(i)).mScrapHeap;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        C20087713il.LIZ(((ViewHolder) ListProtector.get(arrayList, i2)).itemView);
                    }
                }
            }
        }

        public void factorInBindTime(int i, long j) {
            ScrapData scrapDataForType = getScrapDataForType(i);
            scrapDataForType.mBindRunningAverageNs = runningAverage(scrapDataForType.mBindRunningAverageNs, j);
        }

        public void factorInCreateTime(int i, long j) {
            ScrapData scrapDataForType = getScrapDataForType(i);
            scrapDataForType.mCreateRunningAverageNs = runningAverage(scrapDataForType.mCreateRunningAverageNs, j);
        }

        public long runningAverage(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return ((j / 4) * 3) + (j2 / 4);
        }

        public void setMaxRecycledViews(int i, int i2) {
            ScrapData scrapDataForType = getScrapDataForType(i);
            scrapDataForType.mMaxScrap = i2;
            ArrayList<ViewHolder> arrayList = scrapDataForType.mScrapHeap;
            while (arrayList.size() > i2) {
                ListProtector.remove(arrayList, arrayList.size() - 1);
            }
        }

        public void onAdapterChanged(AbstractC21673619ry<?> abstractC21673619ry, AbstractC21673619ry<?> abstractC21673619ry2, boolean z) {
            if (abstractC21673619ry != null) {
                detach();
            }
            if (!z && this.mAttachCountForClearing == 0) {
                clear();
            }
            if (abstractC21673619ry2 != null) {
                attach();
            }
        }

        public boolean willBindInTime(int i, long j, long j2) {
            long j3 = getScrapDataForType(i).mBindRunningAverageNs;
            if (j3 != 0 && j + j3 >= j2) {
                return false;
            }
            return true;
        }

        public boolean willCreateInTime(int i, long j, long j2) {
            long j3 = getScrapDataForType(i).mCreateRunningAverageNs;
            if (j3 != 0 && j + j3 >= j2) {
                return false;
            }
            return true;
        }
    }

    public static abstract class ViewHolder {
        public static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        public final View itemView;
        public AbstractC21673619ry<? extends ViewHolder> mBindingAdapter;
        public int mFlags;
        public boolean mInChangeScrap;
        public int mIsRecyclableCount;
        public WeakReference<RecyclerView> mNestedRecyclerView;
        public RecyclerView mOwnerRecyclerView;
        public List<Object> mPayloads;
        public C21673319rv mScrapContainer;
        public ViewHolder mShadowedHolder;
        public ViewHolder mShadowingHolder;
        public List<Object> mUnmodifiedPayloads;
        public int mWasImportantForAccessibilityBeforeHidden;
        public int mPosition = -1;
        public int mOldPosition = -1;
        public long mItemId = -1;
        public int mItemViewType = -1;
        public int mPreLayoutPosition = -1;
        public int mPendingAccessibilityState = -1;

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && this.itemView.hasTransientState();
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            AbstractC21673619ry adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !this.itemView.hasTransientState();
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void resetInternal() {
            if (RecyclerView.sDebugAssertionsEnabled && isTmpDetached()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Attempting to reset temp-detached ViewHolder: ");
                sbLIZ.append(this);
                sbLIZ.append(". ViewHolders should be fully detached before resetting.");
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public void unScrap() {
            this.mScrapContainer.LJIILLIIL(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }

        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public String toString() {
            String name;
            if (getClass().isAnonymousClass()) {
                name = "ViewHolder";
            } else {
                Class<?> cls = getClass();
                name = C2514909tL.LIZ ? cls.getName() : cls.getSimpleName();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(name);
            sbLIZ.append("{");
            sbLIZ.append(Integer.toHexString(hashCode()));
            sbLIZ.append(" position=");
            sbLIZ.append(this.mPosition);
            sbLIZ.append(" id=");
            sbLIZ.append(this.mItemId);
            sbLIZ.append(", oldPos=");
            sbLIZ.append(this.mOldPosition);
            sbLIZ.append(", pLpos:");
            sbLIZ.append(this.mPreLayoutPosition);
            StringBuilder sb = new StringBuilder(C2188811AlT.LIZIZ(sbLIZ));
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(" not recyclable(");
                sbLIZ2.append(this.mIsRecyclableCount);
                sbLIZ2.append(")");
                sb.append(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final AbstractC21673619ry<? extends ViewHolder> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        public ViewHolder(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else {
                if ((1024 & this.mFlags) != 0) {
                    return;
                }
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public boolean hasAnyOfTheFlags(int i) {
            if ((i & this.mFlags) != 0) {
                return true;
            }
            return false;
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = this.itemView.getImportantForAccessibility();
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public final void setIsRecyclable(boolean z) {
            int i;
            int i2 = this.mIsRecyclableCount;
            if (z) {
                i = i2 - 1;
            } else {
                i = i2 + 1;
            }
            this.mIsRecyclableCount = i;
            if (i < 0) {
                this.mIsRecyclableCount = 0;
                if (RecyclerView.sDebugAssertionsEnabled) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                    sbLIZ.append(this);
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else if (!z) {
                if (i == 1) {
                    this.mFlags |= 16;
                }
            } else if (i == 0) {
                this.mFlags &= -17;
            }
            boolean z2 = RecyclerView.sDebugAssertionsEnabled;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).mInsetsDirty = true;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public void setScrapContainer(C21673319rv c21673319rv, boolean z) {
            this.mScrapContainer = c21673319rv;
            this.mInChangeScrap = z;
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.19d5] */
    static {
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new Interpolator() { // from class: X.19sQ
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
        sDefaultEdgeEffectFactory = new C688970R0t() { // from class: X.19d5
            @Override // X.C688970R0t
            public final EdgeEffect LIZ(RecyclerView recyclerView, int i) {
                return new EdgeEffect(recyclerView.getContext());
            }
        };
    }

    private void dispatchLayoutStep3() {
        androidx_recyclerview_widget_RecyclerView_com_ss_android_ugc_aweme_lancet_RecyclerViewDispatchLayoutStep3CatchLancet_dispatchLayoutStep3(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    public boolean removeAnimatingView(View view) {
        return androidx_recyclerview_widget_RecyclerView_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_removeAnimatingView(this, view);
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
    }

    public void setAdapter(AbstractC21673619ry abstractC21673619ry) {
        androidx_recyclerview_widget_RecyclerView_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_setRecyclerViewAdapter(this, abstractC21673619ry);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(SpeechEngineDefines.ASR_WORK_MODE_OFFLINE);
        accessibilityEventObtain.setContentChangeTypes(i);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void dispatchLayoutStep1() {
        C21675619sI c21675619sI;
        this.mState.LIZ(1);
        fillRemainingScrollValues(this.mState);
        this.mState.LJIIIIZZ = false;
        startInterceptRequestLayout();
        C21674419s6 c21674419s6 = this.mViewInfoStore;
        c21674419s6.LIZ.clear();
        c21674419s6.LIZIZ.LIZIZ();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        C21673919s1 c21673919s1 = this.mState;
        c21673919s1.LJII = c21673919s1.LJIIIZ && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        c21673919s1.LJI = c21673919s1.LJIIJ;
        c21673919s1.LJ = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.LJIIIZ) {
            int childCount = this.mChildHelper.getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.mHasStableIds)) {
                    AbstractC21673719rz abstractC21673719rz = this.mItemAnimator;
                    AbstractC21673719rz.LJI(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    abstractC21673719rz.getClass();
                    C21676319sP c21676319sP = new C21676319sP();
                    View view = childViewHolderInt.itemView;
                    c21676319sP.LIZ = view.getLeft();
                    c21676319sP.LIZIZ = view.getTop();
                    view.getRight();
                    view.getBottom();
                    C21674419s6 c21674419s62 = this.mViewInfoStore;
                    C21675619sI c21675619sILIZ = c21674419s62.LIZ.get(childViewHolderInt);
                    if (c21675619sILIZ == null) {
                        c21675619sILIZ = C21675619sI.LIZ();
                        c21674419s62.LIZ.put(childViewHolderInt, c21675619sILIZ);
                    }
                    c21675619sILIZ.LIZIZ = c21676319sP;
                    c21675619sILIZ.LIZ |= 4;
                    if (this.mState.LJII && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.LIZIZ.LJIIIZ(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.LJIIJ) {
            saveOldPositions();
            C21673919s1 c21673919s12 = this.mState;
            boolean z = c21673919s12.LJFF;
            c21673919s12.LJFF = false;
            this.mLayout.onLayoutChildren(this.mRecycler, c21673919s12);
            this.mState.LJFF = z;
            for (int i2 = 0; i2 < this.mChildHelper.getChildCount(); i2++) {
                ViewHolder childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.getChildAt(i2));
                if (!childViewHolderInt2.shouldIgnore() && ((c21675619sI = this.mViewInfoStore.LIZ.get(childViewHolderInt2)) == null || (c21675619sI.LIZ & 4) == 0)) {
                    AbstractC21673719rz.LJI(childViewHolderInt2);
                    boolean zHasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                    AbstractC21673719rz abstractC21673719rz2 = this.mItemAnimator;
                    childViewHolderInt2.getUnmodifiedPayloads();
                    abstractC21673719rz2.getClass();
                    C21676319sP c21676319sP2 = new C21676319sP();
                    View view2 = childViewHolderInt2.itemView;
                    c21676319sP2.LIZ = view2.getLeft();
                    c21676319sP2.LIZIZ = view2.getTop();
                    view2.getRight();
                    view2.getBottom();
                    if (zHasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, c21676319sP2);
                    } else {
                        C21674419s6 c21674419s63 = this.mViewInfoStore;
                        C21675619sI c21675619sILIZ2 = c21674419s63.LIZ.get(childViewHolderInt2);
                        if (c21675619sILIZ2 == null) {
                            c21675619sILIZ2 = C21675619sI.LIZ();
                            c21674419s63.LIZ.put(childViewHolderInt2, c21675619sILIZ2);
                        }
                        c21675619sILIZ2.LIZ |= 2;
                        c21675619sILIZ2.LIZIZ = c21676319sP2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.LIZLLL = 2;
    }

    private View findNextViewToFocus() {
        ViewHolder viewHolderFindViewHolderForAdapterPosition;
        C21673919s1 c21673919s1 = this.mState;
        int i = c21673919s1.LJIIJJI;
        if (i == -1) {
            i = 0;
        }
        int iLIZIZ = c21673919s1.LIZIZ();
        for (int i2 = i; i2 < iLIZIZ; i2++) {
            ViewHolder viewHolderFindViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (viewHolderFindViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (viewHolderFindViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return viewHolderFindViewHolderForAdapterPosition2.itemView;
            }
        }
        for (int iMin = Math.min(iLIZIZ, i) - 1; iMin >= 0 && (viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(iMin)) != null; iMin--) {
            if (viewHolderFindViewHolderForAdapterPosition.itemView.hasFocusable()) {
                return viewHolderFindViewHolderForAdapterPosition.itemView;
            }
        }
        return null;
    }

    private C1318260kPQ getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C1318260kPQ(this);
        }
        return this.mScrollingChildHelper;
    }

    private boolean hasUpdatedView() {
        int childCount = this.mChildHelper.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    private void initAutofill() {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || C20081213hi.LIZJ(this) != 0 || i < 26) {
            return;
        }
        C20081213hi.LJIIL(this, 8);
    }

    private void initChildrenHelper() {
        this.mChildHelper = new ChildHelper(new C21674819sA(this));
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.reset();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.preProcess();
        } else {
            this.mAdapterHelper.consumeUpdatesInOnePass();
        }
        boolean z = false;
        boolean z2 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        C21673919s1 c21673919s1 = this.mState;
        boolean z3 = this.mFirstLayoutComplete && this.mItemAnimator != null && (this.mDataSetHasChangedAfterLayout ? this.mAdapter.mHasStableIds : z2 || this.mLayout.mRequestedSimpleAnimations);
        c21673919s1.LJIIIZ = z3;
        if (z3 && z2 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z = true;
        }
        c21673919s1.LJIIJ = z;
    }

    private void recoverFocusFromState() {
        View viewFindNextViewToFocus;
        View viewFindViewById;
        ViewHolder viewHolderFindViewHolderForItemId;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.isHidden(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.getChildCount() == 0) {
                requestFocus();
                return;
            }
        }
        long j = this.mState.LJIIL;
        if (j != -1 && this.mAdapter.mHasStableIds && (viewHolderFindViewHolderForItemId = findViewHolderForItemId(j)) != null && !this.mChildHelper.isHidden(viewHolderFindViewHolderForItemId.itemView) && viewHolderFindViewHolderForItemId.itemView.hasFocusable()) {
            viewFindNextViewToFocus = viewHolderFindViewHolderForItemId.itemView;
        } else if (this.mChildHelper.getChildCount() <= 0) {
            return;
        } else {
            viewFindNextViewToFocus = findNextViewToFocus();
        }
        if (viewFindNextViewToFocus != null) {
            int i = this.mState.LJIILIIL;
            if (i != -1 && (viewFindViewById = viewFindNextViewToFocus.findViewById(i)) != null && viewFindViewById.isFocusable()) {
                viewFindNextViewToFocus = viewFindViewById;
            }
            viewFindNextViewToFocus.requestFocus();
        }
    }

    private void releaseGlows() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    private void resetFocusInfo() {
        C21673919s1 c21673919s1 = this.mState;
        c21673919s1.LJIIL = -1L;
        c21673919s1.LJIIJJI = -1;
        c21673919s1.LJIILIIL = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View focusedChild;
        ViewHolder viewHolderFindContainingViewHolder;
        if (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null || (focusedChild = getFocusedChild()) == null || (viewHolderFindContainingViewHolder = findContainingViewHolder(focusedChild)) == null) {
            resetFocusInfo();
            return;
        }
        this.mState.LJIIL = this.mAdapter.mHasStableIds ? viewHolderFindContainingViewHolder.getItemId() : -1L;
        this.mState.LJIIJJI = this.mDataSetHasChangedAfterLayout ? -1 : viewHolderFindContainingViewHolder.isRemoved() ? viewHolderFindContainingViewHolder.mOldPosition : viewHolderFindContainingViewHolder.getAbsoluteAdapterPosition();
        this.mState.LJIILIIL = getDeepestFocusedViewWithId(viewHolderFindContainingViewHolder.itemView);
    }

    private void stopScrollersInternal() {
        RunnableC21673519rx runnableC21673519rx = this.mViewFlinger;
        runnableC21673519rx.LLIZ.removeCallbacks(runnableC21673519rx);
        runnableC21673519rx.LLILLL.abortAnimation();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.stopSmoothScroller();
        }
    }

    public void androidx_recyclerview_widget_RecyclerView__dispatchLayoutStep3$___twin___() {
        this.mState.LIZ(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C21673919s1 c21673919s1 = this.mState;
        c21673919s1.LIZLLL = 1;
        if (c21673919s1.LJIIIZ) {
            for (int childCount = this.mChildHelper.getChildCount() - 1; childCount >= 0; childCount--) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(childCount));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    C21676319sP c21676319sP = new C21676319sP();
                    View view = childViewHolderInt.itemView;
                    c21676319sP.LIZ = view.getLeft();
                    c21676319sP.LIZIZ = view.getTop();
                    view.getRight();
                    view.getBottom();
                    ViewHolder viewHolderLJ = this.mViewInfoStore.LIZIZ.LJ(changedHolderKey);
                    if (viewHolderLJ == null || viewHolderLJ.shouldIgnore()) {
                        this.mViewInfoStore.LIZ(childViewHolderInt, c21676319sP);
                    } else {
                        C21675619sI c21675619sI = this.mViewInfoStore.LIZ.get(viewHolderLJ);
                        boolean z = (c21675619sI == null || (c21675619sI.LIZ & 1) == 0) ? false : true;
                        C21675619sI c21675619sI2 = this.mViewInfoStore.LIZ.get(childViewHolderInt);
                        boolean z2 = (c21675619sI2 == null || (c21675619sI2.LIZ & 1) == 0) ? false : true;
                        if (z && viewHolderLJ == childViewHolderInt) {
                            this.mViewInfoStore.LIZ(childViewHolderInt, c21676319sP);
                        } else {
                            C21676319sP c21676319sPLIZIZ = this.mViewInfoStore.LIZIZ(viewHolderLJ, 4);
                            this.mViewInfoStore.LIZ(childViewHolderInt, c21676319sP);
                            C21676319sP c21676319sPLIZIZ2 = this.mViewInfoStore.LIZIZ(childViewHolderInt, 8);
                            if (c21676319sPLIZIZ == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, viewHolderLJ);
                            } else {
                                animateChange(viewHolderLJ, childViewHolderInt, c21676319sPLIZIZ, c21676319sPLIZIZ2, z, z2);
                            }
                        }
                    }
                }
            }
            C21674419s6 c21674419s6 = this.mViewInfoStore;
            InterfaceC21677419sa interfaceC21677419sa = this.mViewInfoProcessCallback;
            int i = c21674419s6.LIZ.LLILLL;
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                ViewHolder viewHolderLJFF = c21674419s6.LIZ.LJFF(i);
                C21675619sI c21675619sILJI = c21674419s6.LIZ.LJI(i);
                int i2 = c21675619sILJI.LIZ;
                if ((i2 & 3) == 3) {
                    RecyclerView recyclerView = ((C21676719sT) interfaceC21677419sa).LIZ;
                    recyclerView.mLayout.removeAndRecycleView(viewHolderLJFF.itemView, recyclerView.mRecycler);
                } else if ((i2 & 1) != 0) {
                    C21676319sP c21676319sP2 = c21675619sILJI.LIZIZ;
                    if (c21676319sP2 == null) {
                        RecyclerView recyclerView2 = ((C21676719sT) interfaceC21677419sa).LIZ;
                        recyclerView2.mLayout.removeAndRecycleView(viewHolderLJFF.itemView, recyclerView2.mRecycler);
                    } else {
                        C21676319sP c21676319sP3 = c21675619sILJI.LIZJ;
                        C21676719sT c21676719sT = (C21676719sT) interfaceC21677419sa;
                        c21676719sT.LIZ.mRecycler.LJIILLIIL(viewHolderLJFF);
                        c21676719sT.LIZ.animateDisappearance(viewHolderLJFF, c21676319sP2, c21676319sP3);
                    }
                } else if ((i2 & 14) == 14) {
                    ((C21676719sT) interfaceC21677419sa).LIZ.animateAppearance(viewHolderLJFF, c21675619sILJI.LIZIZ, c21675619sILJI.LIZJ);
                } else if ((i2 & 12) == 12) {
                    C21676319sP c21676319sP4 = c21675619sILJI.LIZIZ;
                    C21676319sP c21676319sP5 = c21675619sILJI.LIZJ;
                    C21676719sT c21676719sT2 = (C21676719sT) interfaceC21677419sa;
                    c21676719sT2.getClass();
                    viewHolderLJFF.setIsRecyclable(false);
                    RecyclerView recyclerView3 = c21676719sT2.LIZ;
                    if (recyclerView3.mDataSetHasChangedAfterLayout) {
                        if (recyclerView3.mItemAnimator.LIZLLL(viewHolderLJFF, viewHolderLJFF, c21676319sP4, c21676319sP5)) {
                            c21676719sT2.LIZ.postAnimationRunner();
                        }
                    } else if (recyclerView3.mItemAnimator.LJFF(viewHolderLJFF, c21676319sP4, c21676319sP5)) {
                        c21676719sT2.LIZ.postAnimationRunner();
                    }
                } else if ((i2 & 4) != 0) {
                    C21676319sP c21676319sP6 = c21675619sILJI.LIZIZ;
                    C21676719sT c21676719sT3 = (C21676719sT) interfaceC21677419sa;
                    c21676719sT3.LIZ.mRecycler.LJIILLIIL(viewHolderLJFF);
                    c21676719sT3.LIZ.animateDisappearance(viewHolderLJFF, c21676319sP6, null);
                } else if ((i2 & 8) != 0) {
                    ((C21676719sT) interfaceC21677419sa).LIZ.animateAppearance(viewHolderLJFF, c21675619sILJI.LIZIZ, c21675619sILJI.LIZJ);
                }
                c21675619sILJI.LIZ = 0;
                c21675619sILJI.LIZIZ = null;
                c21675619sILJI.LIZJ = null;
                C21675619sI.LIZLLL.LIZ(c21675619sILJI);
            }
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        C21673919s1 c21673919s12 = this.mState;
        c21673919s12.LIZIZ = c21673919s12.LJ;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        c21673919s12.LJIIIZ = false;
        c21673919s12.LJIIJ = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<ViewHolder> arrayList = this.mRecycler.LIZIZ;
        if (arrayList != null) {
            arrayList.clear();
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager.mPrefetchMaxObservedInInitialPrefetch) {
            layoutManager.mPrefetchMaxCountObserved = 0;
            layoutManager.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.LJIIZILJ();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        C21674419s6 c21674419s62 = this.mViewInfoStore;
        c21674419s62.LIZ.clear();
        c21674419s62.LIZIZ.LIZIZ();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    public void clearOldPositions() {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i = 0; i < unfilteredChildCount; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        C21673319rv c21673319rv = this.mRecycler;
        int size = c21673319rv.LIZJ.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ViewHolder) ListProtector.get(c21673319rv.LIZJ, i2)).clearOldPosition();
        }
        int size2 = c21673319rv.LIZ.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((ViewHolder) ListProtector.get(c21673319rv.LIZ, i3)).clearOldPosition();
        }
        ArrayList<ViewHolder> arrayList = c21673319rv.LIZIZ;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ((ViewHolder) ListProtector.get(c21673319rv.LIZIZ, i4)).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<InterfaceC21676519sR> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<AbstractC1585810rMx> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, X.InterfaceC1354050lL9
    public int computeVerticalScrollOffset() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    @Override // android.view.View, X.InterfaceC1354050lL9
    public int computeVerticalScrollRange() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i = C08C0.LIZ;
            Trace.beginSection("RV FullInvalidate");
            dispatchLayout();
            Trace.endSection();
            return;
        }
        if (this.mAdapterHelper.hasPendingUpdates()) {
            if (!this.mAdapterHelper.hasAnyUpdateTypes(4) || this.mAdapterHelper.hasAnyUpdateTypes(11)) {
                if (this.mAdapterHelper.hasPendingUpdates()) {
                    int i2 = C08C0.LIZ;
                    Trace.beginSection("RV FullInvalidate");
                    dispatchLayout();
                    Trace.endSection();
                    return;
                }
                return;
            }
            int i3 = C08C0.LIZ;
            Trace.beginSection("RV PartialInvalidate");
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.preProcess();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.consumePostponedUpdates();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            Trace.endSection();
        }
    }

    public void dispatchLayout() {
        if (this.mAdapter == null || this.mLayout == null) {
            return;
        }
        this.mState.LJIIIIZZ = false;
        boolean z = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.LIZLLL == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else if (this.mAdapterHelper.hasUpdates() || z || this.mLayout.getWidth() != getWidth() || this.mLayout.getHeight() != getHeight()) {
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            this.mLayout.setExactMeasureSpecsFrom(this);
        }
        androidx_recyclerview_widget_RecyclerView_com_ss_android_ugc_aweme_lancet_RecyclerViewDispatchLayoutStep3CatchLancet_dispatchLayoutStep3(this);
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = (ViewHolder) ListProtector.get(this.mPendingAccessibilityImportanceChange, size);
            if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore() && (i = viewHolder.mPendingAccessibilityState) != -1) {
                viewHolder.itemView.setImportantForAccessibility(i);
                viewHolder.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        EdgeEffect edgeEffectLIZ = this.mEdgeEffectFactory.LIZ(this, 3);
        this.mBottomGlow = edgeEffectLIZ;
        if (this.mClipToPadding) {
            edgeEffectLIZ.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectLIZ.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        EdgeEffect edgeEffectLIZ = this.mEdgeEffectFactory.LIZ(this, 0);
        this.mLeftGlow = edgeEffectLIZ;
        if (this.mClipToPadding) {
            edgeEffectLIZ.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectLIZ.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        EdgeEffect edgeEffectLIZ = this.mEdgeEffectFactory.LIZ(this, 2);
        this.mRightGlow = edgeEffectLIZ;
        if (this.mClipToPadding) {
            edgeEffectLIZ.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectLIZ.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        EdgeEffect edgeEffectLIZ = this.mEdgeEffectFactory.LIZ(this, 1);
        this.mTopGlow = edgeEffectLIZ;
        if (this.mClipToPadding) {
            edgeEffectLIZ.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectLIZ.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateDefaultLayoutParams();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecyclerView has no LayoutManager");
        sbLIZ.append(exceptionLabel());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.view.View
    public int getBaseline() {
        LayoutManager layoutManager = this.mLayout;
        return layoutManager != null ? layoutManager.getBaseline() : super.getBaseline();
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public RecycledViewPool getRecycledViewPool() {
        return this.mRecycler.LJFF();
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.hasPendingUpdates();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new AdapterHelper(new C21674719s9(this));
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        AbstractC21673719rz abstractC21673719rz = this.mItemAnimator;
        return abstractC21673719rz != null && abstractC21673719rz.LJIIZILJ();
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    public void markItemDecorInsetsDirty() {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i = 0; i < unfilteredChildCount; i++) {
            ((LayoutParams) this.mChildHelper.getUnfilteredChildAt(i).getLayoutParams()).mInsetsDirty = true;
        }
        C21673319rv c21673319rv = this.mRecycler;
        int size = c21673319rv.LIZJ.size();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutParams layoutParams = (LayoutParams) ((ViewHolder) ListProtector.get(c21673319rv.LIZJ, i2)).itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.mInsetsDirty = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i = 0; i < unfilteredChildCount; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        C21673319rv c21673319rv = this.mRecycler;
        int size = c21673319rv.LIZJ.size();
        for (int i2 = 0; i2 < size; i2++) {
            ViewHolder viewHolder = (ViewHolder) ListProtector.get(c21673319rv.LIZJ, i2);
            if (viewHolder != null) {
                viewHolder.addFlags(6);
                viewHolder.addChangePayload(null);
            }
        }
        AbstractC21673619ry abstractC21673619ry = c21673319rv.LJIIIIZZ.mAdapter;
        if (abstractC21673619ry == null || !abstractC21673619ry.mHasStableIds) {
            c21673319rv.LJIIIZ();
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.LL = savedState2.LL;
            return savedState;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            savedState.LL = layoutManager.onSaveInstanceState();
            return savedState;
        }
        savedState.LL = null;
        return savedState;
    }

    public void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        postOnAnimation(this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    public void removeAndRecycleViews() {
        AbstractC21673719rz abstractC21673719rz = this.mItemAnimator;
        if (abstractC21673719rz != null) {
            abstractC21673719rz.LJIIL();
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.LIZLLL();
    }

    public void repositionShadowingViews() {
        ViewHolder viewHolder;
        int childCount = this.mChildHelper.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.mChildHelper.getChildAt(i);
            ViewHolder childViewHolder = getChildViewHolder(childAt);
            if (childViewHolder != null && (viewHolder = childViewHolder.mShadowingHolder) != null) {
                View view = viewHolder.itemView;
                int left = childAt.getLeft();
                int top = childAt.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i = 0; i < unfilteredChildCount; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("view holder cannot have position -1 unless it is removed");
                sbLIZ.append(exceptionLabel());
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.LIZ(6);
        this.mAdapterHelper.consumeUpdatesInOnePass();
        this.mState.LJ = this.mAdapter.getItemCount();
        this.mState.LIZJ = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.LL;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        C21673919s1 c21673919s1 = this.mState;
        c21673919s1.LJI = false;
        this.mLayout.onLayoutChildren(this.mRecycler, c21673919s1);
        C21673919s1 c21673919s12 = this.mState;
        c21673919s12.LJFF = false;
        c21673919s12.LJIIIZ = c21673919s12.LJIIIZ && this.mItemAnimator != null;
        c21673919s12.LIZLLL = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    public String exceptionLabel() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" ");
        sbLIZ.append(super.toString());
        sbLIZ.append(", adapter:");
        sbLIZ.append(this.mAdapter);
        sbLIZ.append(", layout:");
        sbLIZ.append(this.mLayout);
        sbLIZ.append(", context:");
        sbLIZ.append(getContext());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().LJIIIIZZ(0);
    }

    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().LIZLLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r2 = 0
            r4.mLayoutOrScrollCounter = r2
            r1 = 1
            r4.mIsAttached = r1
            boolean r0 = r4.mFirstLayoutComplete
            if (r0 == 0) goto L78
            boolean r0 = r4.isLayoutRequested()
            if (r0 != 0) goto L78
        L13:
            r4.mFirstLayoutComplete = r1
            X.19rv r0 = r4.mRecycler
            r0.LJIIIIZZ()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r4.mLayout
            if (r0 == 0) goto L21
            r0.dispatchAttachedToWindow(r4)
        L21:
            r4.mPostedAnimatorRunner = r2
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L7f
            java.lang.ThreadLocal<X.19rw> r3 = X.RunnableC21673419rw.LLILZIL
            java.lang.Object r0 = r3.get()
            X.19rw r0 = (X.RunnableC21673419rw) r0
            r4.mGapWorker = r0
            if (r0 != 0) goto L5c
            X.19rw r0 = new X.19rw
            r0.<init>()
            r4.mGapWorker = r0
            android.view.Display r1 = r4.getDisplay()
            boolean r0 = r4.isInEditMode()
            if (r0 != 0) goto L75
            if (r1 == 0) goto L75
            float r1 = r1.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L75
        L50:
            X.19rw r2 = r4.mGapWorker
            r0 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r0 = r0 / r1
            long r0 = (long) r0
            r2.LLILLL = r0
            r3.set(r2)
        L5c:
            X.19rw r1 = r4.mGapWorker
            r1.getClass()
            boolean r0 = androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled
            if (r0 == 0) goto L7a
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r1.LL
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L7a
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "RecyclerView already present in worker list!"
            r1.<init>(r0)
            throw r1
        L75:
            r1 = 1114636288(0x42700000, float:60.0)
            goto L50
        L78:
            r1 = 0
            goto L13
        L7a:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView> r0 = r1.LL
            r0.add(r4)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        RunnableC21673419rw runnableC21673419rw;
        super.onDetachedFromWindow();
        AbstractC21673719rz abstractC21673719rz = this.mItemAnimator;
        if (abstractC21673719rz != null) {
            abstractC21673719rz.LJIIL();
        }
        stopScroll();
        this.mIsAttached = false;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        while (C21675619sI.LIZLLL.LIZIZ() != null) {
        }
        C21673319rv c21673319rv = this.mRecycler;
        for (int i = 0; i < c21673319rv.LIZJ.size(); i++) {
            C20087713il.LIZ(((ViewHolder) ListProtector.get(c21673319rv.LIZJ, i)).itemView);
        }
        AbstractC21673619ry<?> abstractC21673619ry = c21673319rv.LJIIIIZZ.mAdapter;
        RecycledViewPool recycledViewPool = c21673319rv.LJI;
        if (recycledViewPool != null) {
            recycledViewPool.detachForPoolingContainer(abstractC21673619ry, false);
        }
        Iterator<View> it2 = new C09RD(this).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (!c09re.hasNext()) {
                break;
            }
            C20087813im c20087813imLIZIZ = C20087713il.LIZIZ((View) c09re.next());
            for (int iLJIIJ = C1697810uHb.LJIIJ(c20087813imLIZIZ.LIZ); -1 < iLJIIJ; iLJIIJ--) {
                ((InterfaceC20088013io) ListProtector.get(c20087813imLIZIZ.LIZ, iLJIIJ)).onRelease();
            }
        }
        if (!ALLOW_THREAD_GAP_WORK || (runnableC21673419rw = this.mGapWorker) == null) {
            return;
        }
        boolean zRemove = runnableC21673419rw.LL.remove(this);
        if (sDebugAssertionsEnabled && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().LJIIJJI(0);
    }

    public AbstractC21673619ry getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public C20094913jv getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public C688970R0t getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public AbstractC21673719rz getItemAnimator() {
        return this.mItemAnimator;
    }

    public LayoutManager getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public AbstractC1338480kw2 getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.19ed
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new RecyclerView.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecyclerView.SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final RecyclerView.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new RecyclerView.SavedState(parcel, classLoader);
            }
        };
        public Parcelable LL;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.LL = parcel.readParcelable(classLoader == null ? LayoutManager.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.LL, 0);
        }
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void addAnimatingView(ViewHolder viewHolder) {
        boolean z;
        View view = viewHolder.itemView;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.mRecycler.LJIILLIIL(getChildViewHolder(view));
        if (viewHolder.isTmpDetached()) {
            this.mChildHelper.attachViewToParent(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.mChildHelper.addView(view, true);
        } else {
            this.mChildHelper.hide(view);
        }
    }

    public static void androidx_recyclerview_widget_RecyclerView_com_ss_android_ugc_aweme_lancet_RecyclerViewDispatchLayoutStep3CatchLancet_dispatchLayoutStep3(RecyclerView recyclerView) {
        if (((Boolean) C0A9Y.LIZ.getValue()).booleanValue()) {
            try {
                recyclerView.androidx_recyclerview_widget_RecyclerView__dispatchLayoutStep3$___twin___();
                return;
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJFF(e, "ViewHolder.shouldIgnore");
                return;
            }
        }
        recyclerView.androidx_recyclerview_widget_RecyclerView__dispatchLayoutStep3$___twin___();
    }

    public static void clearNestedRecyclerViewIfNotNested(ViewHolder viewHolder) {
        WeakReference<RecyclerView> weakReference = viewHolder.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == viewHolder.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                if (parent instanceof View) {
                    recyclerView = (View) parent;
                } else {
                    recyclerView = null;
                }
            }
            viewHolder.mNestedRecyclerView = null;
        }
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        InterfaceC21676019sM interfaceC21676019sM = this.mInterceptingOnItemTouchListener;
        if (interfaceC21676019sM == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        interfaceC21676019sM.LJIIJ(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            InterfaceC21676019sM interfaceC21676019sM = (InterfaceC21676019sM) ListProtector.get(this.mOnItemTouchListeners, i);
            if (interfaceC21676019sM.LJJIFFI(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = interfaceC21676019sM;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int childCount = this.mChildHelper.getChildCount();
        if (childCount == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < childCount; i3++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(i3));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewFindNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (recyclerViewFindNestedRecyclerView != null) {
                return recyclerViewFindNestedRecyclerView;
            }
        }
        return null;
    }

    public static ViewHolder getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).mViewHolder;
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private float getSplineFlingDistance(int i) {
        double dLog = Math.log((Math.abs(i) * 0.35f) / (this.mPhysicalCoef * 0.015f));
        float f = DECELERATION_RATE;
        return (float) (((double) (this.mPhysicalCoef * 0.015f)) * Math.exp((((double) f) / (((double) f) - 1.0d)) * dLog));
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        sDebugAssertionsEnabled = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        sVerboseLoggingEnabled = z;
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null && C20097913kP.LIZJ(edgeEffect) != 0.0f && !canScrollHorizontally(-1)) {
            C20097913kP.LJFF(this.mLeftGlow, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && C20097913kP.LIZJ(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
            C20097913kP.LJFF(this.mRightGlow, 0.0f, motionEvent.getY() / getHeight());
            z = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && C20097913kP.LIZJ(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
            C20097913kP.LJFF(this.mTopGlow, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && C20097913kP.LIZJ(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
            C20097913kP.LJFF(this.mBottomGlow, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z;
    }

    public void addItemDecoration(C0DXR c0dxr) {
        addItemDecoration(c0dxr, -1);
    }

    public void addOnChildAttachStateChangeListener(InterfaceC21676519sR interfaceC21676519sR) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(interfaceC21676519sR);
    }

    public void addOnItemTouchListener(InterfaceC21676019sM interfaceC21676019sM) {
        this.mOnItemTouchListeners.add(interfaceC21676019sM);
    }

    public void addOnScrollListener(AbstractC1585810rMx abstractC1585810rMx) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(abstractC1585810rMx);
    }

    public void addRecyclerListener(InterfaceC21676819sU interfaceC21676819sU) {
        boolean z;
        if (interfaceC21676819sU != null) {
            z = true;
        } else {
            z = false;
        }
        C08IF.LIZ("'listener' arg cannot be null.", z);
        this.mRecyclerListeners.add(interfaceC21676819sU);
    }

    public boolean androidx_recyclerview_widget_RecyclerView__removeAnimatingView$___twin___(View view) {
        startInterceptRequestLayout();
        boolean zRemoveViewIfHidden = this.mChildHelper.removeViewIfHidden(view);
        if (zRemoveViewIfHidden) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.LJIILLIIL(childViewHolderInt);
            this.mRecycler.LJIIL(childViewHolderInt);
        }
        stopInterceptRequestLayout(!zRemoveViewIfHidden);
        return zRemoveViewIfHidden;
    }

    public void androidx_recyclerview_widget_RecyclerView__setAdapter$___twin___(AbstractC21673619ry abstractC21673619ry) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC21673619ry, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void assertInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (str == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Cannot call this method unless RecyclerView is computing a layout or scrolling");
                sbLIZ.append(exceptionLabel());
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(exceptionLabel());
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                sbLIZ.append(exceptionLabel());
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            throw new IllegalStateException(str);
        }
    }

    public boolean canReuseUpdatedViewHolder(ViewHolder viewHolder) {
        AbstractC21673719rz abstractC21673719rz = this.mItemAnimator;
        if (abstractC21673719rz != null && !abstractC21673719rz.LJIIIIZZ(viewHolder, viewHolder.getUnmodifiedPayloads())) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof LayoutParams) && this.mLayout.checkLayoutParams((LayoutParams) layoutParams)) {
            return true;
        }
        return false;
    }

    public int consumeFlingInHorizontalStretch(int i) {
        return consumeFlingInStretch(i, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i) {
        return consumeFlingInStretch(i, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void dispatchChildAttached(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        AbstractC21673619ry abstractC21673619ry = this.mAdapter;
        if (abstractC21673619ry != null && childViewHolderInt != null) {
            abstractC21673619ry.onViewAttachedToWindow(childViewHolderInt);
        }
        List<InterfaceC21676519sR> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((InterfaceC21676519sR) ListProtector.get(this.mOnChildAttachStateListeners, size)).g5(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        AbstractC21673619ry abstractC21673619ry = this.mAdapter;
        if (abstractC21673619ry != null && childViewHolderInt != null) {
            abstractC21673619ry.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<InterfaceC21676519sR> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((InterfaceC21676519sR) ListProtector.get(this.mOnChildAttachStateListeners, size)).m3(view);
            }
        }
    }

    public void dispatchOnScrollStateChanged(int i) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.onScrollStateChanged(i);
        }
        onScrollStateChanged(i);
        AbstractC1585810rMx abstractC1585810rMx = this.mScrollListener;
        if (abstractC1585810rMx != null) {
            abstractC1585810rMx.LJJIIJ(this, i);
        }
        List<AbstractC1585810rMx> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((AbstractC1585810rMx) ListProtector.get(this.mScrollListeners, size)).LJJIIJ(this, i);
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z;
        int paddingTop;
        boolean z2;
        boolean z3;
        int paddingBottom;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z4 = false;
        for (int i = 0; i < size; i++) {
            ((C0DXR) ListProtector.get(this.mItemDecorations, i)).LIZLLL(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int iSave = canvas.save();
            if (this.mClipToPadding) {
                paddingBottom = getPaddingBottom();
            } else {
                paddingBottom = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z = true;
            } else {
                z = false;
            }
            canvas.restoreToCount(iSave);
        } else {
            z = false;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            z |= z3;
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            if (this.mClipToPadding) {
                paddingTop = getPaddingTop();
            } else {
                paddingTop = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z2 = true;
            } else {
                z2 = false;
            }
            z |= z2;
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(iSave4);
        }
        if (z || (this.mItemAnimator != null && this.mItemDecorations.size() > 0 && this.mItemAnimator.LJIIZILJ())) {
            postInvalidateOnAnimation();
        }
    }

    public final void fillRemainingScrollValues(C21673919s1 c21673919s1) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.LLILLL;
            overScroller.getFinalX();
            overScroller.getCurrX();
            c21673919s1.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        c21673919s1.getClass();
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent != this) {
            return null;
        }
        return view;
    }

    public ViewHolder findContainingViewHolder(View view) {
        View viewFindContainingItemView = findContainingItemView(view);
        if (viewFindContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(viewFindContainingItemView);
    }

    public ViewHolder findViewHolderForAdapterPosition(int i) {
        ViewHolder viewHolder = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i2 = 0; i2 < unfilteredChildCount; i2++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                if (this.mChildHelper.isHidden(childViewHolderInt.itemView)) {
                    viewHolder = childViewHolderInt;
                } else {
                    return childViewHolderInt;
                }
            }
        }
        return viewHolder;
    }

    public ViewHolder findViewHolderForItemId(long j) {
        AbstractC21673619ry abstractC21673619ry = this.mAdapter;
        ViewHolder viewHolder = null;
        if (abstractC21673619ry != null && abstractC21673619ry.mHasStableIds) {
            int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
            for (int i = 0; i < unfilteredChildCount; i++) {
                ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                    if (this.mChildHelper.isHidden(childViewHolderInt.itemView)) {
                        viewHolder = childViewHolderInt;
                    } else {
                        return childViewHolderInt;
                    }
                }
            }
        }
        return viewHolder;
    }

    public ViewHolder findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    public ViewHolder findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(getContext(), attributeSet);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecyclerView has no LayoutManager");
        sbLIZ.append(exceptionLabel());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public int getAdapterPositionInRecyclerView(ViewHolder viewHolder) {
        if (!viewHolder.hasAnyOfTheFlags(524) && viewHolder.isBound()) {
            return this.mAdapterHelper.applyPendingUpdatesToPosition(viewHolder.mPosition);
        }
        return -1;
    }

    public long getChangedHolderKey(ViewHolder viewHolder) {
        if (this.mAdapter.mHasStableIds) {
            return viewHolder.getItemId();
        }
        return viewHolder.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public long getChildItemId(View view) {
        ViewHolder childViewHolderInt;
        AbstractC21673619ry abstractC21673619ry = this.mAdapter;
        if (abstractC21673619ry == null || !abstractC21673619ry.mHasStableIds || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public ViewHolder getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("View ");
            sbLIZ.append(view);
            sbLIZ.append(" is not a direct child of ");
            sbLIZ.append(this);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return getChildViewHolderInt(view);
    }

    public Rect getItemDecorInsetsForChild(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.mInsetsDirty) {
            return layoutParams.mDecorInsets;
        }
        if (this.mState.LJI && (layoutParams.isItemChanged() || layoutParams.isViewInvalid())) {
            return layoutParams.mDecorInsets;
        }
        Rect rect = layoutParams.mDecorInsets;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            ((C0DXR) ListProtector.get(this.mItemDecorations, i)).LIZIZ(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.mInsetsDirty = false;
        return rect;
    }

    public C0DXR getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return (C0DXR) ListProtector.get(this.mItemDecorations, i);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append(" is an invalid index for size ");
        sbLIZ.append(itemDecorationCount);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().LJIIIIZZ(i);
    }

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i);
        awakenScrollBars();
    }

    public void offsetChildrenHorizontal(int i) {
        int childCount = this.mChildHelper.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            this.mChildHelper.getChildAt(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        int childCount = this.mChildHelper.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            this.mChildHelper.getChildAt(i2).offsetTopAndBottom(i);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            ((C0DXR) ListProtector.get(this.mItemDecorations, i)).LIZJ(canvas, this, this.mState);
        }
    }

    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            if (sDebugAssertionsEnabled && i < 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("layout or scroll counter cannot go below zero.Some calls are not matching");
                sbLIZ.append(exceptionLabel());
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d A[PHI: r1 r3
      0x003d: PHI (r1v8 float) = (r1v3 float), (r1v9 float) binds: [B:33:0x0072, B:19:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x003d: PHI (r3v5 float) = (r3v0 float), (r3v6 float) binds: [B:33:0x0072, B:19:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041 A[PHI: r1 r3
      0x0041: PHI (r1v5 float) = (r1v8 float), (r1v9 float) binds: [B:21:0x003f, B:19:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x0041: PHI (r3v3 float) = (r3v5 float), (r3v6 float) binds: [B:21:0x003f, B:19:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            r4 = 0
            if (r0 != 0) goto L6
            return r4
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r4
        Lb:
            int r1 = r6.getAction()
            r0 = 8
            if (r1 != r0) goto L4d
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L50
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L4e
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r3 = -r0
        L2b:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            boolean r0 = r0.canScrollHorizontally()
            if (r0 == 0) goto L68
            r0 = 10
            float r1 = r6.getAxisValue(r0)
        L39:
            int r0 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r0 != 0) goto L41
        L3d:
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 == 0) goto L4d
        L41:
            float r0 = r5.mScaledHorizontalScrollFactor
            float r1 = r1 * r0
            int r2 = (int) r1
            float r0 = r5.mScaledVerticalScrollFactor
            float r3 = r3 * r0
            int r1 = (int) r3
            r0 = 1
            r5.nestedScrollByInternal(r2, r1, r6, r0)
        L4d:
            return r4
        L4e:
            r3 = 0
            goto L2b
        L50:
            int r1 = r6.getSource()
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L4d
            r0 = 26
            float r1 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L6a
            float r3 = -r1
        L68:
            r1 = 0
            goto L39
        L6a:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r5.mLayout
            boolean r0 = r0.canScrollHorizontally()
            if (r0 == 0) goto L4d
            r3 = 0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return false;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                onPointerUp(motionEvent);
                            }
                        } else {
                            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                            int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.mLastTouchX = x;
                            this.mInitialTouchX = x;
                            int y = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.mLastTouchY = y;
                            this.mInitialTouchY = y;
                        }
                    } else {
                        cancelScroll();
                    }
                } else {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (iFindPointerIndex < 0) {
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.mScrollState != 1) {
                        int i = x2 - this.mInitialTouchX;
                        int i2 = y2 - this.mInitialTouchY;
                        if (zCanScrollHorizontally && Math.abs(i) > this.mTouchSlop) {
                            this.mLastTouchX = x2;
                            z = true;
                        } else {
                            z = false;
                        }
                        if (zCanScrollVertically && Math.abs(i2) > this.mTouchSlop) {
                            this.mLastTouchY = y2;
                        } else if (z) {
                        }
                        setScrollState(1);
                    }
                }
            } else {
                this.mVelocityTracker.clear();
                stopNestedScroll(0);
            }
        } else {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i3 = zCanScrollHorizontally;
            if (zCanScrollVertically) {
                i3 = (zCanScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i3, 0);
        }
        if (this.mScrollState != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.mSuperState);
        requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7 A[PHI: r1
      0x00c7: PHI (r1v13 int) = (r1v12 int), (r1v16 int) binds: [B:79:0x015c, B:49:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015c A[PHI: r1
      0x015c: PHI (r1v12 int) = (r1v7 int), (r1v16 int) binds: [B:46:0x00ba, B:49:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0169 A[PHI: r6
      0x0169: PHI (r6v12 int) = (r6v7 int), (r6v16 int) binds: [B:41:0x00ac, B:44:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void removeItemDecoration(C0DXR c0dxr) {
        boolean z;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(c0dxr);
        if (this.mItemDecorations.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z = true;
            } else {
                z = false;
            }
            setWillNotDraw(z);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append(" is an invalid index for size ");
        sbLIZ.append(itemDecorationCount);
        throw new IndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void removeOnChildAttachStateChangeListener(InterfaceC21676519sR interfaceC21676519sR) {
        List<InterfaceC21676519sR> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(interfaceC21676519sR);
    }

    public void removeOnItemTouchListener(InterfaceC21676019sM interfaceC21676019sM) {
        this.mOnItemTouchListeners.remove(interfaceC21676019sM);
        if (this.mInterceptingOnItemTouchListener == interfaceC21676019sM) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(AbstractC1585810rMx abstractC1585810rMx) {
        List<AbstractC1585810rMx> list = this.mScrollListeners;
        if (list != null) {
            list.remove(abstractC1585810rMx);
        }
    }

    public void removeRecyclerListener(InterfaceC21676819sU interfaceC21676819sU) {
        this.mRecyclerListeners.remove(interfaceC21676819sU);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC21676019sM) ListProtector.get(this.mOnItemTouchListeners, i)).LJIIZILJ(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void scrollToPosition(int i) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            return;
        }
        layoutManager.scrollToPosition(i);
        awakenScrollBars();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C20094913jv c20094913jv) {
        this.mAccessibilityDelegate = c20094913jv;
        q0.LJIJ(this, c20094913jv);
    }

    public void setChildDrawingOrderCallback(InterfaceC1811800xFS interfaceC1811800xFS) {
        boolean z;
        if (interfaceC1811800xFS == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = interfaceC1811800xFS;
        if (interfaceC1811800xFS != null) {
            z = true;
        } else {
            z = false;
        }
        setChildrenDrawingOrderEnabled(z);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C688970R0t c688970R0t) {
        c688970R0t.getClass();
        this.mEdgeEffectFactory = c688970R0t;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(AbstractC21673719rz abstractC21673719rz) {
        AbstractC21673719rz abstractC21673719rz2 = this.mItemAnimator;
        if (abstractC21673719rz2 != null) {
            abstractC21673719rz2.LJIIL();
            this.mItemAnimator.LL = null;
        }
        this.mItemAnimator = abstractC21673719rz;
        if (abstractC21673719rz != null) {
            abstractC21673719rz.LL = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i) {
        C21673319rv c21673319rv = this.mRecycler;
        c21673319rv.LJ = i;
        c21673319rv.LJIIZILJ();
    }

    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(LayoutManager layoutManager) {
        if (layoutManager == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            AbstractC21673719rz abstractC21673719rz = this.mItemAnimator;
            if (abstractC21673719rz != null) {
                abstractC21673719rz.LJIIL();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            this.mRecycler.LIZLLL();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            this.mRecycler.LIZLLL();
        }
        this.mChildHelper.removeAllViewsUnfiltered();
        this.mLayout = layoutManager;
        if (layoutManager != null) {
            if (layoutManager.mRecyclerView == null) {
                layoutManager.setRecyclerView(this);
                if (this.mIsAttached) {
                    this.mLayout.dispatchAttachedToWindow(this);
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LayoutManager ");
                sbLIZ.append(layoutManager);
                sbLIZ.append(" is already attached to a RecyclerView:");
                sbLIZ.append(layoutManager.mRecyclerView.exceptionLabel());
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        this.mRecycler.LJIIZILJ();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().LJIIIZ(z);
    }

    public void setOnFlingListener(AbstractC1338480kw2 abstractC1338480kw2) {
        this.mOnFlingListener = abstractC1338480kw2;
    }

    public void setOnScrollListener(AbstractC1585810rMx abstractC1585810rMx) {
        this.mScrollListener = abstractC1585810rMx;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(RecycledViewPool recycledViewPool) {
        C21673319rv c21673319rv = this.mRecycler;
        AbstractC21673619ry<?> abstractC21673619ry = c21673319rv.LJIIIIZZ.mAdapter;
        RecycledViewPool recycledViewPool2 = c21673319rv.LJI;
        if (recycledViewPool2 != null) {
            recycledViewPool2.detachForPoolingContainer(abstractC21673619ry, false);
        }
        RecycledViewPool recycledViewPool3 = c21673319rv.LJI;
        if (recycledViewPool3 != null) {
            recycledViewPool3.detach();
        }
        c21673319rv.LJI = recycledViewPool;
        if (recycledViewPool != null && c21673319rv.LJIIIIZZ.getAdapter() != null) {
            c21673319rv.LJI.attach();
        }
        c21673319rv.LJIIIIZZ();
    }

    public void setRecyclerListener(InterfaceC21676819sU interfaceC21676819sU) {
        this.mRecyclerListener = interfaceC21676819sU;
    }

    public void setScrollState(int i) {
        if (i == this.mScrollState) {
            return;
        }
        this.mScrollState = i;
        if (i != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i);
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(AbstractC1343480l46 abstractC1343480l46) {
        this.mRecycler.LJII = abstractC1343480l46;
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int contentChangeTypes;
        int i = 0;
        if (!isComputingLayout()) {
            return false;
        }
        if (accessibilityEvent != null && (contentChangeTypes = accessibilityEvent.getContentChangeTypes()) != 0) {
            i = contentChangeTypes;
        }
        this.mEatenAccessibilityChangeFlags |= i;
        return true;
    }

    public void smoothScrollToPosition(int i) {
        LayoutManager layoutManager;
        if (this.mLayoutSuppressed || (layoutManager = this.mLayout) == null) {
            return;
        }
        layoutManager.smoothScrollToPosition(this, this.mState, i);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().LJIIJ(i, 0);
    }

    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (!sDebugAssertionsEnabled) {
                this.mInterceptRequestLayoutDepth = 1;
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.");
                sbLIZ.append(exceptionLabel());
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().LJIIJJI(i);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            return layoutManager.generateLayoutParams(layoutParams);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecyclerView has no LayoutManager");
        sbLIZ.append(exceptionLabel());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.zhiliaoapp.musically.R.attr.fea);
    }

    public static void androidx_recyclerview_widget_RecyclerView_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_setRecyclerViewAdapter(RecyclerView recyclerView, AbstractC21673619ry abstractC21673619ry) {
        if (recyclerView != null) {
            C788540UwW c788540UwW = C788530UwV.LIZJ;
            recyclerView.removeOnScrollListener(c788540UwW);
            recyclerView.addOnScrollListener(c788540UwW);
        }
        if (C788530UwV.LIZ("setRecyclerViewAdapter")) {
            C2413309cx.LIZ(new C2188221AkW());
        }
        recyclerView.androidx_recyclerview_widget_RecyclerView__setAdapter$___twin___(abstractC21673619ry);
    }

    public static boolean androidx_recyclerview_widget_RecyclerView_com_ss_android_ugc_aweme_lancet_RecyclerViewLancet_removeAnimatingView(RecyclerView recyclerView, View view) {
        try {
            return recyclerView.androidx_recyclerview_widget_RecyclerView__removeAnimatingView$___twin___(view);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            PrintStream printStream = System.err;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Fix RecyclerView removeAnimatingView crash ---->\n");
            sbLIZ.append(e);
            printStream.println(C2188811AlT.LIZIZ(sbLIZ));
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "rv_item_animator_illegal_argument_fix", true, false)) {
                try {
                    ViewHolder viewHolder = (ViewHolder) Reflect.on((Class<?>) RecyclerView.class).call("getChildViewHolderInt", new Class[]{View.class}, view).get();
                    if (viewHolder != null) {
                        try {
                            if (((Boolean) Reflect.on(viewHolder).call("isTmpDetached").get()).booleanValue()) {
                                try {
                                    Reflect.on(recyclerView).call("removeDetachedView", new Class[]{View.class, Boolean.TYPE}, view, Boolean.FALSE).get();
                                    System.err.println("removeDetachedView success,fix finished!!!");
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    PrintStream printStream2 = System.err;
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("removeDetachedView failed:");
                                    sbLIZ2.append(th);
                                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                                }
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                    }
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                }
                return recyclerView.androidx_recyclerview_widget_RecyclerView__removeAnimatingView$___twin___(view);
            }
            throw e;
        }
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        if (iArr[0] == i && iArr[1] == i2) {
            return false;
        }
        return true;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.mDecorInsets;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(context.getPackageName());
            sbLIZ.append(str);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        if (str.contains(e3.d)) {
            return str;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(RecyclerView.class.getPackage().getName());
        sbLIZ2.append('.');
        sbLIZ2.append(str);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    private int releaseHorizontalGlow(int i, float f) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f2 = 0.0f;
        if (edgeEffect != null && C20097913kP.LIZJ(edgeEffect) != 0.0f) {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f3 = -C20097913kP.LJFF(this.mLeftGlow, -width, 1.0f - height);
                if (C20097913kP.LIZJ(this.mLeftGlow) == 0.0f) {
                    this.mLeftGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && C20097913kP.LIZJ(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float fLJFF = C20097913kP.LJFF(this.mRightGlow, width, height);
                    if (C20097913kP.LIZJ(this.mRightGlow) == 0.0f) {
                        this.mRightGlow.onRelease();
                    }
                    f2 = fLJFF;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getWidth());
    }

    private int releaseVerticalGlow(int i, float f) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f2 = 0.0f;
        if (edgeEffect != null && C20097913kP.LIZJ(edgeEffect) != 0.0f) {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f3 = -C20097913kP.LJFF(this.mTopGlow, -height, width);
                if (C20097913kP.LIZJ(this.mTopGlow) == 0.0f) {
                    this.mTopGlow.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && C20097913kP.LIZJ(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float fLJFF = C20097913kP.LJFF(this.mBottomGlow, height, 1.0f - width);
                    if (C20097913kP.LIZJ(this.mBottomGlow) == 0.0f) {
                        this.mBottomGlow.onRelease();
                    }
                    f2 = fLJFF;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getHeight());
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3;
        boolean z;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.mInsetsDirty) {
                Rect rect = layoutParams2.mDecorInsets;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        LayoutManager layoutManager = this.mLayout;
        Rect rect3 = this.mTempRect;
        boolean z2 = !this.mFirstLayoutComplete;
        if (view2 == null) {
            z = true;
        } else {
            z = false;
        }
        layoutManager.requestChildRectangleOnScreen(this, view, rect3, z2, z);
    }

    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            postInvalidateOnAnimation();
        }
    }

    public void addItemDecoration(C0DXR c0dxr, int i) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(c0dxr);
        } else {
            ListProtector.add(this.mItemDecorations, i, c0dxr);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.mLeftGlow.onRelease();
            zIsFinished = this.mLeftGlow.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            zIsFinished |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            zIsFinished |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            zIsFinished |= this.mBottomGlow.isFinished();
        }
        if (zIsFinished) {
            postInvalidateOnAnimation();
        }
    }

    public void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(LayoutManager.chooseSize(i, getPaddingLeft() + getPaddingRight(), getMinimumWidth()), LayoutManager.chooseSize(i2, getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().LIZIZ(f, f2);
    }

    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        AbstractC1585810rMx abstractC1585810rMx = this.mScrollListener;
        if (abstractC1585810rMx != null) {
            abstractC1585810rMx.LJJIIZI(this, i, i2);
        }
        List<AbstractC1585810rMx> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((AbstractC1585810rMx) ListProtector.get(this.mScrollListeners, size)).LJJIIZI(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public View findChildViewUnder(float f, float f2) {
        for (int childCount = this.mChildHelper.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.mChildHelper.getChildAt(childCount);
            float translationX = childAt.getTranslationX();
            float translationY = childAt.getTranslationY();
            if (f >= childAt.getLeft() + translationX && f <= childAt.getRight() + translationX && f2 >= childAt.getTop() + translationY && f2 <= childAt.getBottom() + translationY) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.recyclerview.widget.RecyclerView.ViewHolder findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.ChildHelper r0 = r5.mChildHelper
            int r4 = r0.getUnfilteredChildCount()
            r1 = 0
            r3 = 0
        L8:
            if (r3 >= r4) goto L39
            androidx.recyclerview.widget.ChildHelper r0 = r5.mChildHelper
            android.view.View r0 = r0.getUnfilteredChildAt(r3)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = getChildViewHolderInt(r0)
            if (r2 == 0) goto L22
            boolean r0 = r2.isRemoved()
            if (r0 != 0) goto L22
            if (r7 == 0) goto L25
            int r0 = r2.mPosition
            if (r0 == r6) goto L2c
        L22:
            int r3 = r3 + 1
            goto L8
        L25:
            int r0 = r2.getLayoutPosition()
            if (r0 == r6) goto L2c
            goto L22
        L2c:
            androidx.recyclerview.widget.ChildHelper r1 = r5.mChildHelper
            android.view.View r0 = r2.itemView
            boolean r0 = r1.isHidden(r0)
            if (r0 == 0) goto L38
            r1 = r2
            goto L22
        L38:
            return r2
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    public boolean fling(int i, int i2) {
        int iMax;
        int i3;
        boolean z;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || this.mLayoutSuppressed) {
            return false;
        }
        int iCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (iCanScrollHorizontally == 0 || Math.abs(i) < this.mMinFlingVelocity) {
            i = 0;
        }
        if (!zCanScrollVertically || Math.abs(i2) < this.mMinFlingVelocity) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        if (i != 0) {
            EdgeEffect edgeEffect = this.mLeftGlow;
            if (edgeEffect != null && C20097913kP.LIZJ(edgeEffect) != 0.0f) {
                int i4 = -i;
                if (shouldAbsorb(this.mLeftGlow, i4, getWidth())) {
                    this.mLeftGlow.onAbsorb(i4);
                    i = 0;
                }
                iMax = i;
                i = 0;
            } else {
                EdgeEffect edgeEffect2 = this.mRightGlow;
                if (edgeEffect2 != null && C20097913kP.LIZJ(edgeEffect2) != 0.0f) {
                    if (shouldAbsorb(this.mRightGlow, i, getWidth())) {
                        this.mRightGlow.onAbsorb(i);
                        i = 0;
                    }
                    iMax = i;
                    i = 0;
                }
                iMax = 0;
            }
        } else {
            iMax = 0;
        }
        if (i2 != 0) {
            EdgeEffect edgeEffect3 = this.mTopGlow;
            if (edgeEffect3 != null && C20097913kP.LIZJ(edgeEffect3) != 0.0f) {
                int i5 = -i2;
                if (shouldAbsorb(this.mTopGlow, i5, getHeight())) {
                    this.mTopGlow.onAbsorb(i5);
                    i2 = 0;
                }
                i3 = 0;
            } else {
                EdgeEffect edgeEffect4 = this.mBottomGlow;
                if (edgeEffect4 != null && C20097913kP.LIZJ(edgeEffect4) != 0.0f) {
                    if (shouldAbsorb(this.mBottomGlow, i2, getHeight())) {
                        this.mBottomGlow.onAbsorb(i2);
                        i2 = 0;
                    }
                    i3 = 0;
                }
                i3 = i2;
                i2 = 0;
            }
        } else {
            i3 = i2;
            i2 = 0;
        }
        if (iMax != 0 || i2 != 0) {
            int i6 = this.mMaxFlingVelocity;
            iMax = Math.max(-i6, Math.min(iMax, i6));
            int i7 = this.mMaxFlingVelocity;
            i2 = Math.max(-i7, Math.min(i2, i7));
            this.mViewFlinger.LIZIZ(iMax, i2);
        }
        if (i == 0 && i3 == 0) {
            if (iMax == 0 && i2 == 0) {
                return false;
            }
            return true;
        }
        float f = i;
        float f2 = i3;
        if (!dispatchNestedPreFling(f, f2)) {
            if (iCanScrollHorizontally == 0 && !zCanScrollVertically) {
                z = false;
            } else {
                z = true;
            }
            dispatchNestedFling(f, f2, z);
            AbstractC1338480kw2 abstractC1338480kw2 = this.mOnFlingListener;
            if (abstractC1338480kw2 != null && abstractC1338480kw2.LIZ(i, i3)) {
                return true;
            }
            if (z) {
                if (zCanScrollVertically) {
                    iCanScrollHorizontally = (iCanScrollHorizontally == true ? 1 : 0) | 2;
                }
                startNestedScroll(iCanScrollHorizontally, 1);
                int i8 = this.mMaxFlingVelocity;
                int iMax2 = Math.max(-i8, Math.min(i, i8));
                int i9 = this.mMaxFlingVelocity;
                this.mViewFlinger.LIZIZ(iMax2, Math.max(-i9, Math.min(i3, i9)));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0044 A[PHI: r10
      0x0044: PHI (r10v2 int) = (r10v0 int), (r10v7 int) binds: [B:20:0x0030, B:29:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006b A[PHI: r10
      0x006b: PHI (r10v6 int) = (r10v3 int), (r10v7 int) binds: [B:46:0x0069, B:29:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View focusSearch(android.view.View r9, int r10) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        InterfaceC1811800xFS interfaceC1811800xFS = this.mChildDrawingOrderCallback;
        if (interfaceC1811800xFS == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return interfaceC1811800xFS.LIZ(i, i2);
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public void nestedScrollBy(int i, int i2) {
        nestedScrollByInternal(i, i2, null, 1);
    }

    public void offsetPositionRecordsForInsert(int i, int i2) {
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i3 = 0; i3 < unfilteredChildCount; i3++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                childViewHolderInt.offsetPosition(i2, false);
                this.mState.LJFF = true;
            }
        }
        C21673319rv c21673319rv = this.mRecycler;
        int size = c21673319rv.LIZJ.size();
        for (int i4 = 0; i4 < size; i4++) {
            ViewHolder viewHolder = (ViewHolder) ListProtector.get(c21673319rv.LIZJ, i4);
            if (viewHolder != null && viewHolder.mPosition >= i) {
                viewHolder.offsetPosition(i2, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < unfilteredChildCount; i11++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i11));
            if (childViewHolderInt != null && (i9 = childViewHolderInt.mPosition) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i5, false);
                }
                this.mState.LJFF = true;
            }
        }
        C21673319rv c21673319rv = this.mRecycler;
        c21673319rv.getClass();
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i10 = 1;
            i7 = i2;
        }
        int size = c21673319rv.LIZJ.size();
        for (int i12 = 0; i12 < size; i12++) {
            ViewHolder viewHolder = (ViewHolder) ListProtector.get(c21673319rv.LIZJ, i12);
            if (viewHolder != null && (i8 = viewHolder.mPosition) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    viewHolder.offsetPosition(i2 - i, false);
                } else {
                    viewHolder.offsetPosition(i10, false);
                }
            }
        }
        requestLayout();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (layoutManager.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (!z && this.mAdapter != null) {
                if (this.mState.LIZLLL == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.setMeasureSpecs(i, i2);
                this.mState.LJIIIIZZ = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i, i2);
                if (this.mLayout.shouldMeasureTwice()) {
                    this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.LJIIIIZZ = true;
                    dispatchLayoutStep2();
                    this.mLayout.setMeasuredDimensionFromChildren(i, i2);
                }
                this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
                this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
                return;
            }
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            C21673919s1 c21673919s1 = this.mState;
            if (c21673919s1.LJIIJ) {
                c21673919s1.LJI = true;
            } else {
                this.mAdapterHelper.consumeUpdatesInOnePass();
                this.mState.LJI = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.LJIIJ) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        AbstractC21673619ry abstractC21673619ry = this.mAdapter;
        if (abstractC21673619ry != null) {
            this.mState.LJ = abstractC21673619ry.getItemCount();
        } else {
            this.mState.LJ = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i, i2);
        stopInterceptRequestLayout(false);
        this.mState.LJI = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public void recordAnimationInfoIfBouncedHiddenView(ViewHolder viewHolder, C21676319sP c21676319sP) {
        viewHolder.setFlags(0, 8192);
        if (this.mState.LJII && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            this.mViewInfoStore.LIZIZ.LJIIIZ(getChangedHolderKey(viewHolder), viewHolder);
        }
        C21674419s6 c21674419s6 = this.mViewInfoStore;
        C21675619sI c21675619sILIZ = c21674419s6.LIZ.get(viewHolder);
        if (c21675619sILIZ == null) {
            c21675619sILIZ = C21675619sI.LIZ();
            c21674419s6.LIZ.put(viewHolder, c21675619sILIZ);
        }
        c21675619sILIZ.LIZIZ = c21676319sP;
        c21675619sILIZ.LIZ |= 4;
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z) {
        ViewHolder childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sbLIZ.append(childViewHolderInt);
                sbLIZ.append(exceptionLabel());
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else if (sDebugAssertionsEnabled) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("No ViewHolder found for child: ");
            sbLIZ2.append(view);
            sbLIZ2.append(exceptionLabel());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.View
    public void scrollBy(int i, int i2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || this.mLayoutSuppressed) {
            return;
        }
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollHorizontally || zCanScrollVertically) {
            if (!zCanScrollHorizontally) {
                i = 0;
            }
            if (!zCanScrollVertically) {
                i2 = 0;
            }
            scrollByInternal(i, i2, null, 0);
        }
    }

    public boolean setChildImportantForAccessibilityInternal(ViewHolder viewHolder, int i) {
        if (isComputingLayout()) {
            viewHolder.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(viewHolder);
            return false;
        }
        viewHolder.itemView.setImportantForAccessibility(i);
        return true;
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, null);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().LJIIJ(i, i2);
    }

    public void swapAdapter(AbstractC21673619ry abstractC21673619ry, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(abstractC21673619ry, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.19s7] */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        C21673819s0 c21673819s0;
        float fLIZ;
        float fLIZ2;
        boolean z;
        super(context, attributeSet, i);
        this.mObserver = new AbstractC471570IeR() { // from class: X.19s7
            @Override // X.AbstractC471570IeR
            public final void LIZ() {
                this.LIZ.assertNotInLayoutOrScroll(null);
                RecyclerView recyclerView = this.LIZ;
                recyclerView.mState.LJFF = true;
                recyclerView.processDataSetCompletelyChanged(true);
                if (this.LIZ.mAdapterHelper.hasPendingUpdates()) {
                    return;
                }
                this.LIZ.requestLayout();
            }

            @Override // X.AbstractC471570IeR
            public final void LJI() {
                AbstractC21673619ry abstractC21673619ry;
                RecyclerView recyclerView = this.LIZ;
                if (recyclerView.mPendingSavedState == null || (abstractC21673619ry = recyclerView.mAdapter) == null || !abstractC21673619ry.canRestoreState()) {
                    return;
                }
                this.LIZ.requestLayout();
            }

            public final void LJII() {
                if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                    RecyclerView recyclerView = this.LIZ;
                    if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                        recyclerView.postOnAnimation(recyclerView.mUpdateChildViewsRunnable);
                        return;
                    }
                }
                RecyclerView recyclerView2 = this.LIZ;
                recyclerView2.mAdapterUpdateDuringMeasure = true;
                recyclerView2.requestLayout();
            }

            @Override // X.AbstractC471570IeR
            public final void LIZLLL(int i2, int i3) {
                this.LIZ.assertNotInLayoutOrScroll(null);
                if (this.LIZ.mAdapterHelper.onItemRangeInserted(i2, i3)) {
                    LJII();
                }
            }

            @Override // X.AbstractC471570IeR
            public final void LJ(int i2, int i3) {
                this.LIZ.assertNotInLayoutOrScroll(null);
                if (this.LIZ.mAdapterHelper.onItemRangeMoved(i2, i3, 1)) {
                    LJII();
                }
            }

            @Override // X.AbstractC471570IeR
            public final void LJFF(int i2, int i3) {
                this.LIZ.assertNotInLayoutOrScroll(null);
                if (this.LIZ.mAdapterHelper.onItemRangeRemoved(i2, i3)) {
                    LJII();
                }
            }

            @Override // X.AbstractC471570IeR
            public final void LIZJ(int i2, int i3, Object obj) {
                this.LIZ.assertNotInLayoutOrScroll(null);
                if (this.LIZ.mAdapterHelper.onItemRangeChanged(i2, i3, obj)) {
                    LJII();
                }
            }
        };
        this.mRecycler = new C21673319rv(this);
        this.mViewInfoStore = new C21674419s6();
        this.mUpdateChildViewsRunnable = new Runnable() { // from class: X.19sC
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                try {
                    RecyclerView recyclerView = this.LL;
                    if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                        return;
                    }
                    RecyclerView recyclerView2 = this.LL;
                    if (!recyclerView2.mIsAttached) {
                        recyclerView2.requestLayout();
                    } else if (recyclerView2.mLayoutSuppressed) {
                        recyclerView2.mLayoutWasDefered = true;
                    } else {
                        recyclerView2.consumePendingUpdateOperations();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
            }
        };
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new C423520Gj8();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new RunnableC21673519rx(this);
        if (ALLOW_THREAD_GAP_WORK) {
            c21673819s0 = new C21673819s0();
        } else {
            c21673819s0 = null;
        }
        this.mPrefetchRegistry = c21673819s0;
        this.mState = new C21673919s1();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C21676219sO(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new Runnable() { // from class: X.19sG
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    AbstractC21673719rz abstractC21673719rz = this.LL.mItemAnimator;
                    if (abstractC21673719rz != null) {
                        abstractC21673719rz.LJIJI();
                    }
                    this.LL.mPostedAnimatorRunner = false;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (!C2179971ATj.LIZ(th)) {
                        throw th;
                    }
                }
            }
        };
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new C21676719sT(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            Method method = C19737612Kg.LIZ;
            fLIZ = C20070813g2.LIZ(viewConfiguration);
        } else {
            fLIZ = C19737612Kg.LIZ(viewConfiguration, context);
        }
        this.mScaledHorizontalScrollFactor = fLIZ;
        if (i2 >= 26) {
            fLIZ2 = C20070813g2.LIZIZ(viewConfiguration);
        } else {
            fLIZ2 = C19737612Kg.LIZ(viewConfiguration, context);
        }
        this.mScaledVerticalScrollFactor = fLIZ2;
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        if (getOverScrollMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        this.mItemAnimator.LL = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) C786410Ut5.H2(getContext(), "accessibility");
        setAccessibilityDelegateCompat(new C20094913jv(this));
        int[] iArr = R$styleable.RecyclerView;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        q0.LJIIZILJ(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.RecyclerView_layoutManager);
        if (typedArrayObtainStyledAttributes.getInt(R$styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RecyclerView_android_clipToPadding, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(R$styleable.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z2;
        if (z2) {
            initFastScroller((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(R$styleable.RecyclerView_fastScrollVerticalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(R$styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(R$styleable.RecyclerView_fastScrollHorizontalThumbDrawable), typedArrayObtainStyledAttributes.getDrawable(R$styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        typedArrayObtainStyledAttributes.recycle();
        createLayoutManager(context, strXd, attributeSet, i, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        q0.LJIIZILJ(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z3 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
        C20087713il.LIZJ(this, true);
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    private void handleMissingPreInfoForChangeError(long j, ViewHolder viewHolder, ViewHolder viewHolder2) {
        int childCount = this.mChildHelper.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getChildAt(i));
            if (childViewHolderInt != viewHolder && getChangedHolderKey(childViewHolderInt) == j) {
                AbstractC21673619ry abstractC21673619ry = this.mAdapter;
                if (abstractC21673619ry != null && abstractC21673619ry.mHasStableIds) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                    sbLIZ.append(childViewHolderInt);
                    sbLIZ.append(" \n View Holder 2:");
                    sbLIZ.append(viewHolder);
                    sbLIZ.append(exceptionLabel());
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                sbLIZ2.append(childViewHolderInt);
                sbLIZ2.append(" \n View Holder 2:");
                sbLIZ2.append(viewHolder);
                sbLIZ2.append(exceptionLabel());
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        int i3;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        byte b = -1;
        if (this.mLayout.getLayoutDirection() == 1) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        Rect rect = this.mTempRect;
        int i4 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            if ((i6 > i7 || i4 >= i7) && i4 > i5) {
                i3 = -1;
            } else {
                i3 = 0;
            }
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            b = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                b = 0;
            }
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130) {
                                if (b <= 0) {
                                    return false;
                                }
                                return true;
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Invalid direction: ");
                            sbLIZ.append(i);
                            sbLIZ.append(exceptionLabel());
                            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        if (i3 <= 0) {
                            return false;
                        }
                        return true;
                    }
                    if (b >= 0) {
                        return false;
                    }
                    return true;
                }
                if (i3 >= 0) {
                    return false;
                }
                return true;
            }
            if (b <= 0 && (b != 0 || i3 * i2 <= 0)) {
                return false;
            }
            return true;
        }
        if (b >= 0 && (b != 0 || i3 * i2 >= 0)) {
            return false;
        }
        return true;
    }

    private void setAdapterInternal(AbstractC21673619ry<?> abstractC21673619ry, boolean z, boolean z2) {
        AbstractC21673619ry abstractC21673619ry2 = this.mAdapter;
        if (abstractC21673619ry2 != null) {
            abstractC21673619ry2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.reset();
        AbstractC21673619ry<?> abstractC21673619ry3 = this.mAdapter;
        this.mAdapter = abstractC21673619ry;
        if (abstractC21673619ry != null) {
            abstractC21673619ry.registerAdapterDataObserver(this.mObserver);
            abstractC21673619ry.onAttachedToRecyclerView(this);
        }
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager != null) {
            layoutManager.onAdapterChanged(abstractC21673619ry3, this.mAdapter);
        }
        C21673319rv c21673319rv = this.mRecycler;
        AbstractC21673619ry<?> abstractC21673619ry4 = this.mAdapter;
        c21673319rv.LIZLLL();
        RecycledViewPool recycledViewPool = c21673319rv.LJI;
        if (recycledViewPool != null) {
            recycledViewPool.detachForPoolingContainer(abstractC21673619ry3, true);
        }
        c21673319rv.LJFF().onAdapterChanged(abstractC21673619ry3, abstractC21673619ry4, z);
        c21673319rv.LJIIIIZZ();
        this.mState.LJFF = true;
    }

    private boolean shouldAbsorb(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        if (getSplineFlingDistance(-i) < C20097913kP.LIZJ(edgeEffect) * i2) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || !layoutManager.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void animateAppearance(ViewHolder viewHolder, C21676319sP c21676319sP, C21676319sP c21676319sP2) {
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.LIZJ(viewHolder, c21676319sP, c21676319sP2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(ViewHolder viewHolder, C21676319sP c21676319sP, C21676319sP c21676319sP2) {
        addAnimatingView(viewHolder);
        viewHolder.setIsRecyclable(false);
        if (this.mItemAnimator.LJ(viewHolder, c21676319sP, c21676319sP2)) {
            postAnimationRunner();
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().LIZ(f, f2, z);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        for (int i4 = 0; i4 < unfilteredChildCount; i4++) {
            ViewHolder childViewHolderInt = getChildViewHolderInt(this.mChildHelper.getUnfilteredChildAt(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i5 = childViewHolderInt.mPosition;
                if (i5 >= i3) {
                    childViewHolderInt.offsetPosition(-i2, z);
                    this.mState.LJFF = true;
                } else if (i5 >= i) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.LJFF = true;
                }
            }
        }
        C21673319rv c21673319rv = this.mRecycler;
        int size = c21673319rv.LIZJ.size();
        while (true) {
            size--;
            if (size >= 0) {
                ViewHolder viewHolder = (ViewHolder) ListProtector.get(c21673319rv.LIZJ, size);
                if (viewHolder != null) {
                    int i6 = viewHolder.mPosition;
                    if (i6 >= i3) {
                        viewHolder.offsetPosition(-i2, z);
                    } else if (i6 >= i) {
                        viewHolder.addFlags(8);
                        c21673319rv.LJIIJ(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z);
    }

    public void scrollStep(int i, int i2, int[] iArr) {
        int iScrollHorizontallyBy;
        int iScrollVerticallyBy;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i3 = C08C0.LIZ;
        Trace.beginSection("RV Scroll");
        fillRemainingScrollValues(this.mState);
        if (i != 0) {
            iScrollHorizontallyBy = this.mLayout.scrollHorizontallyBy(i, this.mRecycler, this.mState);
        } else {
            iScrollHorizontallyBy = 0;
        }
        if (i2 != 0) {
            iScrollVerticallyBy = this.mLayout.scrollVerticallyBy(i2, this.mRecycler, this.mState);
        } else {
            iScrollVerticallyBy = 0;
        }
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = iScrollHorizontallyBy;
            iArr[1] = iScrollVerticallyBy;
        }
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int i4;
        int unfilteredChildCount = this.mChildHelper.getUnfilteredChildCount();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < unfilteredChildCount; i6++) {
            View unfilteredChildAt = this.mChildHelper.getUnfilteredChildAt(i6);
            ViewHolder childViewHolderInt = getChildViewHolderInt(unfilteredChildAt);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i4 = childViewHolderInt.mPosition) >= i && i4 < i5) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((LayoutParams) unfilteredChildAt.getLayoutParams()).mInsetsDirty = true;
            }
        }
        C21673319rv c21673319rv = this.mRecycler;
        int size = c21673319rv.LIZJ.size();
        while (true) {
            size--;
            if (size >= 0) {
                ViewHolder viewHolder = (ViewHolder) ListProtector.get(c21673319rv.LIZJ, size);
                if (viewHolder != null && (i3 = viewHolder.mPosition) >= i && i3 < i5) {
                    viewHolder.addFlags(2);
                    c21673319rv.LJIIJ(size);
                }
            } else {
                return;
            }
        }
    }

    private int consumeFlingInStretch(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0) {
            if (edgeEffect != null && C20097913kP.LIZJ(edgeEffect) != 0.0f) {
                int iRound = Math.round(((-i2) / 4.0f) * C20097913kP.LJFF(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
                if (iRound != i) {
                    edgeEffect.finish();
                }
                return i - iRound;
            }
            return i;
        }
        if (i < 0 && edgeEffect2 != null && C20097913kP.LIZJ(edgeEffect2) != 0.0f) {
            float f = i2;
            int iRound2 = Math.round((f / 4.0f) * C20097913kP.LJFF(edgeEffect2, (i * 4.0f) / f, 0.5f));
            if (iRound2 != i) {
                edgeEffect2.finish();
            }
            return i - iRound2;
        }
        return i;
    }

    private void nestedScrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        float y;
        float x;
        int i5;
        int i6;
        int i7;
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        int i8 = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zCanScrollHorizontally = layoutManager.canScrollHorizontally();
        boolean zCanScrollVertically = this.mLayout.canScrollVertically();
        if (zCanScrollVertically) {
            i4 = (zCanScrollHorizontally ? 1 : 0) | 2;
        } else {
            i4 = zCanScrollHorizontally ? 1 : 0;
        }
        if (motionEvent == null) {
            y = getHeight() / 2.0f;
            x = getWidth() / 2.0f;
        } else {
            y = motionEvent.getY();
            x = motionEvent.getX();
        }
        int iReleaseHorizontalGlow = i - releaseHorizontalGlow(i, y);
        int iReleaseVerticalGlow = i2 - releaseVerticalGlow(i2, x);
        startNestedScroll(i4, i3);
        if (zCanScrollHorizontally) {
            i5 = iReleaseHorizontalGlow;
        } else {
            i5 = 0;
        }
        if (zCanScrollVertically) {
            i6 = iReleaseVerticalGlow;
        } else {
            i6 = 0;
        }
        if (dispatchNestedPreScroll(i5, i6, this.mReusableIntPair, this.mScrollOffset, i3)) {
            int[] iArr2 = this.mReusableIntPair;
            iReleaseHorizontalGlow -= iArr2[0];
            iReleaseVerticalGlow -= iArr2[1];
        }
        if (zCanScrollHorizontally) {
            i7 = iReleaseHorizontalGlow;
        } else {
            i7 = 0;
        }
        if (zCanScrollVertically) {
            i8 = iReleaseVerticalGlow;
        }
        scrollByInternal(i7, i8, motionEvent, i3);
        RunnableC21673419rw runnableC21673419rw = this.mGapWorker;
        if (runnableC21673419rw != null && (iReleaseHorizontalGlow != 0 || iReleaseVerticalGlow != 0)) {
            runnableC21673419rw.LIZJ(this, iReleaseHorizontalGlow, iReleaseVerticalGlow);
        }
        stopNestedScroll(i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void pullGlows(float r6, float r7, float r8, float r9) {
        /*
            r5 = this;
            r4 = 0
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 >= 0) goto L61
            r5.ensureLeftGlow()
            android.widget.EdgeEffect r2 = r5.mLeftGlow
            float r1 = -r7
            int r0 = r5.getWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = r5.getHeight()
            float r0 = (float) r0
            float r8 = r8 / r0
            float r0 = r3 - r8
            X.C20097913kP.LJFF(r2, r1, r0)
        L1e:
            r1 = 1
        L1f:
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 >= 0) goto L3c
            r5.ensureTopGlow()
            android.widget.EdgeEffect r2 = r5.mTopGlow
            float r1 = -r9
            int r0 = r5.getHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = r5.getWidth()
            float r0 = (float) r0
            float r6 = r6 / r0
            X.C20097913kP.LJFF(r2, r1, r6)
        L38:
            r5.postInvalidateOnAnimation()
        L3b:
            return
        L3c:
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 <= 0) goto L56
            r5.ensureBottomGlow()
            android.widget.EdgeEffect r1 = r5.mBottomGlow
            int r0 = r5.getHeight()
            float r0 = (float) r0
            float r9 = r9 / r0
            int r0 = r5.getWidth()
            float r0 = (float) r0
            float r6 = r6 / r0
            float r3 = r3 - r6
            X.C20097913kP.LJFF(r1, r9, r3)
            goto L38
        L56:
            if (r1 != 0) goto L38
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 != 0) goto L38
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L3b
            goto L38
        L61:
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 <= 0) goto L7b
            r5.ensureRightGlow()
            android.widget.EdgeEffect r2 = r5.mRightGlow
            int r0 = r5.getWidth()
            float r0 = (float) r0
            float r1 = r7 / r0
            int r0 = r5.getHeight()
            float r0 = (float) r0
            float r8 = r8 / r0
            X.C20097913kP.LJFF(r2, r1, r8)
            goto L1e
        L7b:
            r1 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().LIZJ(i, i2, iArr, iArr2);
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C21645019nM(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.x8), resources.getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.x_), resources.getDimensionPixelOffset(com.zhiliaoapp.musically.R.dimen.x9));
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Trying to set fast scroller without both required drawables.");
            sbLIZ.append(exceptionLabel());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            invalidateGlows();
        }
    }

    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i, i2, iArr);
            int[] iArr2 = this.mReusableIntPair;
            i5 = iArr2[0];
            i4 = iArr2[1];
            i6 = i - i5;
            i7 = i2 - i4;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i4, i6, i7, this.mScrollOffset, i3, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i8 = iArr4[0];
        int i9 = i6 - i8;
        int i10 = iArr4[1];
        int i11 = i7 - i10;
        if (i8 == 0 && i10 == 0) {
            z = false;
        } else {
            z = true;
        }
        int i12 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i13 = iArr5[0];
        this.mLastTouchX = i12 - i13;
        int i14 = this.mLastTouchY;
        int i15 = iArr5[1];
        this.mLastTouchY = i14 - i15;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i13;
        iArr6[1] = iArr6[1] + i15;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && (motionEvent.getSource() & 8194) != 8194) {
                pullGlows(motionEvent.getX(), i9, motionEvent.getY(), i11);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (i5 != 0 || i4 != 0) {
            dispatchOnScrolled(i5, i4);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (z || i5 != 0 || i4 != 0) {
            return true;
        }
        return false;
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String strTrim = str.trim();
            if (!strTrim.isEmpty()) {
                String fullClassName = getFullClassName(context, strTrim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> clsAsSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(LayoutManager.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        TryCatchGuardChecker.doCheck(e);
                        try {
                            constructor = clsAsSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            e2.initCause(e);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(attributeSet.getPositionDescription());
                            sbLIZ.append(": Error creating LayoutManager ");
                            sbLIZ.append(fullClassName);
                            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ), e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((LayoutManager) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(attributeSet.getPositionDescription());
                    sbLIZ2.append(": Class is not a LayoutManager ");
                    sbLIZ2.append(fullClassName);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2), e3);
                } catch (ClassNotFoundException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(attributeSet.getPositionDescription());
                    sbLIZ3.append(": Unable to find LayoutManager ");
                    sbLIZ3.append(fullClassName);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3), e4);
                } catch (IllegalAccessException e5) {
                    TryCatchGuardChecker.doCheck(e5);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(attributeSet.getPositionDescription());
                    sbLIZ4.append(": Cannot access non-public constructor ");
                    sbLIZ4.append(fullClassName);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ4), e5);
                } catch (InstantiationException e6) {
                    TryCatchGuardChecker.doCheck(e6);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(attributeSet.getPositionDescription());
                    sbLIZ5.append(": Could not instantiate the LayoutManager: ");
                    sbLIZ5.append(fullClassName);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ5), e6);
                } catch (InvocationTargetException e7) {
                    TryCatchGuardChecker.doCheck(e7);
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append(attributeSet.getPositionDescription());
                    sbLIZ6.append(": Could not instantiate the LayoutManager: ");
                    sbLIZ6.append(fullClassName);
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ6), e7);
                }
            }
        }
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().LIZLLL(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().LJ(i, i2, i3, i4, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = C08C0.LIZ;
        Trace.beginSection("RV OnLayout");
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        LayoutManager layoutManager = this.mLayout;
        if (layoutManager == null || this.mLayoutSuppressed) {
            return;
        }
        int i4 = 0;
        if (!layoutManager.canScrollHorizontally()) {
            i = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i2 = 0;
        }
        if (i != 0 || i2 != 0) {
            if (i3 != Integer.MIN_VALUE && i3 <= 0) {
                scrollBy(i, i2);
                return;
            }
            if (z) {
                if (i != 0) {
                    i4 = 1;
                }
                if (i2 != 0) {
                    i4 |= 2;
                }
                startNestedScroll(i4, 1);
            }
            this.mViewFlinger.LIZLLL(i, i2, interpolator, i3);
        }
    }

    private void animateChange(ViewHolder viewHolder, ViewHolder viewHolder2, C21676319sP c21676319sP, C21676319sP c21676319sP2, boolean z, boolean z2) {
        viewHolder.setIsRecyclable(false);
        if (z) {
            addAnimatingView(viewHolder);
        }
        if (viewHolder != viewHolder2) {
            if (z2) {
                addAnimatingView(viewHolder2);
            }
            viewHolder.mShadowedHolder = viewHolder2;
            addAnimatingView(viewHolder);
            this.mRecycler.LJIILLIIL(viewHolder);
            viewHolder2.setIsRecyclable(false);
            viewHolder2.mShadowingHolder = viewHolder;
        }
        if (this.mItemAnimator.LIZLLL(viewHolder, viewHolder2, c21676319sP, c21676319sP2)) {
            postAnimationRunner();
        }
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().LJFF(i, i2, i3, i4, iArr, i5);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().LJI(i, i2, i3, i4, iArr, i5, iArr2);
    }
}
