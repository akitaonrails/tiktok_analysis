package X;

import Y.AUListenerS280S0100000_33;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.19YA, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@InterfaceC21561419Zs
public class C19YA extends HorizontalScrollView {
    public static final InterfaceC20015613Te<C12H3> sTabPool = new C1085640eME(16);
    public C19YG indicatorDrawProxy;
    public boolean isAutoFillWhenScrollable;
    public boolean isDefaultAddTab;
    public boolean isEnableDynamicTabMode;
    public boolean isForceHideIndicatorView;
    public boolean isHideIndicatorView;
    public boolean isSupportCustomIndicator;
    public C19YE mAdapterChangeListener;
    public int mContentInsetStart;
    public InterfaceC19561911g9 mCurrentVpSelectedListener;
    public float mIndicatorCornerX;
    public float mIndicatorCornerY;
    public int mMode;
    public int mOriginalScreenOrientation;
    public C19642311t7 mPageChangeListener;
    public PagerAdapter mPagerAdapter;
    public DataSetObserver mPagerAdapterObserver;
    public int mRequestedTabMaxWidth;
    public int mRequestedTabMinWidth;
    public ValueAnimator mScrollAnimator;
    public final int mScrollableTabMinWidth;
    public InterfaceC19561911g9 mSelectedListener;
    public final ArrayList<InterfaceC19561911g9> mSelectedListeners;
    public C12H3 mSelectedTab;
    public boolean mSetupViewPagerImplicitly;
    public final int mTabBackgroundResId;
    public int mTabEdgeExtraMargin;
    public int mTabGravity;
    public int mTabMargin;
    public int mTabMaxWidth;
    public int mTabPaddingBottom;
    public int mTabPaddingEnd;
    public int mTabPaddingStart;
    public int mTabPaddingTop;
    public C19YB mTabStrip;
    public int mTabTextAppearance;
    public ColorStateList mTabTextColors;
    public float mTabTextMultiLineSize;
    public float mTabTextSize;
    public final InterfaceC20015613Te<C19YC> mTabViewPool;
    public final ArrayList<C12H3> mTabs;
    public int mTotalTab;
    public ViewPager mViewPager;
    public int maxFixedTabSize;
    public InterfaceC1638460sjs onTabClickListener;

    public void setIndicatorDrawProxy(C19YG c19yg) {
    }

    private void applyModeAndGravity() {
        this.mTabStrip.setPaddingRelative(this.mMode == 0 ? Math.max(0, this.mContentInsetStart - this.mTabPaddingStart) : 0, 0, 0, 0);
        int i = this.mMode;
        if (i == 0) {
            this.mTabStrip.setGravity(8388611);
        } else if (i == 1) {
            this.mTabStrip.setGravity(1);
        }
        updateTabViews(true);
    }

    private void ensureScrollAnimator() {
        if (this.mScrollAnimator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.mScrollAnimator = valueAnimator;
            valueAnimator.setInterpolator(C194X.LIZ);
            this.mScrollAnimator.setDuration(300L);
            this.mScrollAnimator.addUpdateListener(new AUListenerS280S0100000_33(this, 25));
        }
    }

    private int getDefaultHeight() {
        int size = this.mTabs.size();
        for (int i = 0; i < size; i++) {
            C12H3 c12h3 = (C12H3) ListProtector.get(this.mTabs, i);
            if (c12h3 != null && c12h3.LIZIZ != null && !TextUtils.isEmpty(c12h3.LIZJ)) {
                return 72;
            }
        }
        return 48;
    }

    private float getScrollPosition() {
        return r2.LLILLL + this.mTabStrip.LLILZ;
    }

    private int getTabMinWidth() {
        int i = this.mRequestedTabMinWidth;
        if (i != -1) {
            return i;
        }
        if (this.mMode == 0) {
            return this.mScrollableTabMinWidth;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.mTabStrip.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void updateAllTabs() {
        int size = this.mTabs.size();
        for (int i = 0; i < size; i++) {
            ((C12H3) ListProtector.get(this.mTabs, i)).LIZIZ();
        }
    }

    public void clearOnTabSelectedListeners() {
        this.mSelectedListeners.clear();
    }

    public int getSelectedTabPosition() {
        C12H3 c12h3 = this.mSelectedTab;
        if (c12h3 != null) {
            return c12h3.LIZLLL;
        }
        return -1;
    }

    public int getTabCount() {
        return this.mTabs.size();
    }

    public C12H3 newTab() {
        C12H3 c12h3LIZIZ = sTabPool.LIZIZ();
        if (c12h3LIZIZ == null) {
            c12h3LIZIZ = new C12H3();
        }
        c12h3LIZIZ.LJI = this;
        c12h3LIZIZ.LJII = createTabView(c12h3LIZIZ);
        return c12h3LIZIZ;
    }

    public void populateFromPagerAdapter() {
        int currentItem;
        if (this.isDefaultAddTab) {
            removeAllTabs();
            PagerAdapter pagerAdapter = this.mPagerAdapter;
            if (pagerAdapter != null) {
                int count = pagerAdapter.getCount();
                tryChangeTabMode(count);
                for (int i = 0; i < count; i++) {
                    C12H3 c12h3NewTab = newTab();
                    c12h3NewTab.LIZJ = this.mPagerAdapter.LJIJJLI(i);
                    c12h3NewTab.LIZIZ();
                    addTab(c12h3NewTab, false);
                }
                ViewPager viewPager = this.mViewPager;
                if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                    return;
                }
                selectTab(getTabAt(currentItem));
            }
        }
    }

    public void removeAllTabs() {
        for (int childCount = this.mTabStrip.getChildCount() - 1; childCount >= 0; childCount--) {
            removeTabViewAt(childCount);
        }
        Iterator<C12H3> it2 = this.mTabs.iterator();
        while (it2.hasNext()) {
            C12H3 next = it2.next();
            it2.remove();
            next.LJI = null;
            next.LJII = null;
            next.LIZ = null;
            next.LIZIZ = null;
            next.LIZJ = null;
            next.LIZLLL = -1;
            next.LJ = null;
            sTabPool.LIZ(next);
        }
        this.mSelectedTab = null;
    }

    public void unSelectTab() {
        if (this.mSelectedTab == null) {
            return;
        }
        C19YB c19yb = this.mTabStrip;
        ValueAnimator valueAnimator = c19yb.LLJI;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            c19yb.LLJI.cancel();
        }
        c19yb.LLILLL = -1;
        c19yb.LLILZ = 0.0f;
        c19yb.LIZIZ();
        dispatchTabUnselected(this.mSelectedTab);
        this.mSelectedTab = null;
    }

    private boolean isRTL() {
        return getLayoutDirection() == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mViewPager == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                setupWithViewPager((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.mSetupViewPagerImplicitly) {
            setupWithViewPager(null);
            this.mSetupViewPagerImplicitly = false;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public C12H3 getCurSelectedTab() {
        return this.mSelectedTab;
    }

    public int getTabGravity() {
        return this.mTabGravity;
    }

    public int getTabMaxWidth() {
        return this.mTabMaxWidth;
    }

    public int getTabMode() {
        return this.mMode;
    }

    public ColorStateList getTabTextColors() {
        return this.mTabTextColors;
    }

    public C19YA(Context context) {
        this(context, null);
    }

    private void addTabFromItemView(C19YI c19yi) {
        C12H3 c12h3NewTab = newTab();
        c19yi.getClass();
        if (!TextUtils.isEmpty(c19yi.getContentDescription())) {
            c19yi.getContentDescription();
            c12h3NewTab.LIZIZ();
        }
        addTab(c12h3NewTab);
    }

    private void addViewInternal(View view) {
        if (view instanceof C19YI) {
            addTabFromItemView((C19YI) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void animateToTab(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            C19YB c19yb = this.mTabStrip;
            int childCount = c19yb.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (c19yb.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iCalculateScrollXForTab = calculateScrollXForTab(i, 0.0f);
            if (scrollX != iCalculateScrollXForTab) {
                ensureScrollAnimator();
                this.mScrollAnimator.setIntValues(scrollX, iCalculateScrollXForTab);
                this.mScrollAnimator.start();
            }
            this.mTabStrip.LIZ(i, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            return;
        }
        setScrollPosition(i, 0.0f, true);
    }

    private LinearLayout.LayoutParams createLayoutParamsForTabs(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams, i);
        return layoutParams;
    }

    private C19YC createTabView(C12H3 c12h3) {
        C19YC c19yc;
        InterfaceC20015613Te<C19YC> interfaceC20015613Te = this.mTabViewPool;
        if (interfaceC20015613Te == null || (c19yc = interfaceC20015613Te.LIZIZ()) == null) {
            c19yc = new C19YC(this, getContext());
        }
        c19yc.setTab(c12h3);
        c19yc.setFocusable(true);
        c19yc.setMinimumWidth(getTabMinWidth());
        return c19yc;
    }

    private void dispatchTabReselected(C12H3 c12h3) {
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            ((InterfaceC19561911g9) ListProtector.get(this.mSelectedListeners, size)).LIZIZ(c12h3);
        }
    }

    private void dispatchTabUnselected(C12H3 c12h3) {
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            ((InterfaceC19561911g9) ListProtector.get(this.mSelectedListeners, size)).LIZ(c12h3);
        }
    }

    private void removeTabViewAt(int i) {
        C19YC c19yc = (C19YC) this.mTabStrip.getChildAt(i);
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_sticker_widget_tablayout_TabLayout_com_bytedance_tt_reliability_monitor_viewchecker_RemoveViewCausedNPEChecker_removeViewAt(this.mTabStrip, i);
        if (c19yc != null) {
            c19yc.setTab(null);
            c19yc.setSelected(false);
            this.mTabViewPool.LIZ(c19yc);
        }
        requestLayout();
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.mTabStrip.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.mTabStrip.getChildAt(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    private void tryChangeTabMode(int i) {
        if (this.isEnableDynamicTabMode) {
            if (i > this.maxFixedTabSize) {
                setTabMode(0);
            } else {
                setTabMode(1);
            }
        }
    }

    public void addOnTabSelectedListener(InterfaceC19561911g9 interfaceC19561911g9) {
        if (!this.mSelectedListeners.contains(interfaceC19561911g9)) {
            this.mSelectedListeners.add(interfaceC19561911g9);
        }
    }

    public void addTab(C12H3 c12h3) {
        addTab(c12h3, this.mTabs.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        addViewInternal(view);
    }

    public int dpToPx(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    public C12H3 getTabAt(int i) {
        if (i >= 0 && i < getTabCount()) {
            return (C12H3) ListProtector.get(this.mTabs, i);
        }
        return null;
    }

    public View getTabView(int i) {
        return this.mTabStrip.getChildAt(i);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo == null) {
            return;
        }
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(C20093113jd.LIZ(1, this.mTabs.size()));
    }

    public void removeOnTabSelectedListener(InterfaceC19561911g9 interfaceC19561911g9) {
        this.mSelectedListeners.remove(interfaceC19561911g9);
    }

    public void removeTab(C12H3 c12h3) {
        if (c12h3.LJI == this) {
            removeTabAt(c12h3.LIZLLL);
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    public void removeTabAt(int i) {
        int i2;
        C12H3 c12h3 = this.mSelectedTab;
        if (c12h3 != null) {
            i2 = c12h3.LIZLLL;
        } else {
            i2 = 0;
        }
        removeTabViewAt(i);
        C12H3 c12h32 = (C12H3) ListProtector.remove(this.mTabs, i);
        C12H3 c12h33 = null;
        if (c12h32 != null) {
            c12h32.LJI = null;
            c12h32.LJII = null;
            c12h32.LIZ = null;
            c12h32.LIZIZ = null;
            c12h32.LIZJ = null;
            c12h32.LIZLLL = -1;
            c12h32.LJ = null;
            sTabPool.LIZ(c12h32);
        }
        int size = this.mTabs.size();
        for (int i3 = i; i3 < size; i3++) {
            ((C12H3) ListProtector.get(this.mTabs, i3)).LIZLLL = i3;
        }
        if (i2 == i) {
            if (!this.mTabs.isEmpty()) {
                c12h33 = (C12H3) ListProtector.get(this.mTabs, Math.max(0, i - 1));
            }
            selectTab(c12h33);
        }
    }

    public void selectTab(C12H3 c12h3) {
        selectTab(c12h3, true, false);
    }

    public void setAutoFillWhenScrollable(boolean z) {
        this.isAutoFillWhenScrollable = z;
    }

    public void setDefaultAddTab(boolean z) {
        this.isDefaultAddTab = z;
    }

    public void setFixedIndicatorWidth(int i) {
        this.mTabStrip.LLILZIL = i;
    }

    public void setForceHideIndicatorView(boolean z) {
        this.isForceHideIndicatorView = z;
    }

    public void setHideIndicatorView(boolean z) {
        this.isHideIndicatorView = z;
    }

    public void setOnTabClickListener(InterfaceC1638460sjs interfaceC1638460sjs) {
        this.onTabClickListener = interfaceC1638460sjs;
    }

    public void setOnTabSelectedListener(InterfaceC19561911g9 interfaceC19561911g9) {
        InterfaceC19561911g9 interfaceC19561911g92 = this.mSelectedListener;
        if (interfaceC19561911g92 != null) {
            removeOnTabSelectedListener(interfaceC19561911g92);
        }
        this.mSelectedListener = interfaceC19561911g9;
        if (interfaceC19561911g9 != null) {
            addOnTabSelectedListener(interfaceC19561911g9);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        ensureScrollAnimator();
        this.mScrollAnimator.addListener(animatorListener);
    }

    public void setSelectedTabIndicatorColor(int i) {
        C19YB c19yb = this.mTabStrip;
        if (c19yb.LLILLJJLI.getColor() != i) {
            c19yb.LLILLJJLI.setColor(i);
            c19yb.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorCornerRadius(float f) {
        setSelectedTabIndicatorCornerRadius(f, f);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        C19YB c19yb = this.mTabStrip;
        if (c19yb.LL != i) {
            c19yb.LL = i;
            c19yb.postInvalidateOnAnimation();
        }
    }

    public void setSupportCustomIndicator(boolean z) {
        this.isSupportCustomIndicator = z;
    }

    public void setTabEdgeExtraMargin(int i) {
        this.mTabEdgeExtraMargin = i;
    }

    public void setTabGravity(int i) {
        if (this.mTabGravity != i) {
            this.mTabGravity = i;
            applyModeAndGravity();
        }
    }

    public void setTabMargin(int i) {
        setTabMarginByPixel(dpToPx(i));
    }

    public void setTabMarginByPixel(int i) {
        this.mTabMargin = i;
        for (int i2 = 0; i2 < getTabCount(); i2++) {
            View childAt = this.mTabStrip.getChildAt(i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int i3 = this.mTabMargin;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i3;
            C786410Ut5.W5(childAt, marginLayoutParams);
            childAt.invalidate();
        }
    }

    public void setTabMode(int i) {
        if (i != this.mMode) {
            this.mMode = i;
            applyModeAndGravity();
        }
    }

    public void setTabStripLeftMargin(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.mTabStrip.getLayoutParams();
        layoutParams.leftMargin = i;
        INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_sticker_widget_tablayout_TabLayout_com_ss_android_ugc_aweme_nxet_inject_ViewHooksLancet_setLayoutParams(this.mTabStrip, layoutParams);
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.mTabTextColors != colorStateList) {
            this.mTabTextColors = colorStateList;
            updateAllTabs();
        }
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        setPagerAdapter(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    public void updateTabViews(boolean z) {
        for (int i = 0; i < this.mTabStrip.getChildCount(); i++) {
            View childAt = this.mTabStrip.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            updateTabViewLayoutParams((LinearLayout.LayoutParams) childAt.getLayoutParams(), i);
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public C19YA(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_sticker_widget_tablayout_TabLayout_com_bytedance_tt_reliability_monitor_viewchecker_RemoveViewCausedNPEChecker_removeViewAt(C19YB c19yb, int i) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c19yb, null);
        c19yb.removeViewAt(i);
    }

    public static void INVOKEVIRTUAL_com_ss_android_ugc_aweme_shortvideo_sticker_widget_tablayout_TabLayout_com_ss_android_ugc_aweme_nxet_inject_ViewHooksLancet_setLayoutParams(C19YB c19yb, ViewGroup.LayoutParams layoutParams) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19yb);
        c19yb.setLayoutParams(layoutParams);
    }

    private void addTabView(C12H3 c12h3, int i) {
        this.mTabStrip.addView(c12h3.LJII, c12h3.LIZLLL, createLayoutParamsForTabs(i));
    }

    private int calculateScrollXForTab(int i, float f) {
        View childAt;
        int width;
        int width2 = 0;
        if (this.mMode != 0) {
            return 0;
        }
        View childAt2 = this.mTabStrip.getChildAt(i);
        int i2 = i + 1;
        if (i2 < this.mTabStrip.getChildCount()) {
            childAt = this.mTabStrip.getChildAt(i2);
        } else {
            childAt = null;
        }
        if (childAt2 != null) {
            width = childAt2.getWidth();
        } else {
            width = 0;
        }
        if (childAt != null) {
            width2 = childAt.getWidth();
        }
        int left = (childAt2.getLeft() + (width / 2)) - (getWidth() / 2);
        int i3 = (int) ((width + width2 + (this.mTabMargin * 4)) * 0.5f * f);
        if (getLayoutDirection() == 0) {
            return left + i3;
        }
        return left - i3;
    }

    private void configureTab(C12H3 c12h3, int i) {
        c12h3.LIZLLL = i;
        ListProtector.add(this.mTabs, i, c12h3);
        int size = this.mTabs.size();
        while (true) {
            i++;
            if (i < size) {
                ((C12H3) ListProtector.get(this.mTabs, i)).LIZLLL = i;
            } else {
                return;
            }
        }
    }

    public static ColorStateList createColorStateList(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private void dispatchTabSelected(C12H3 c12h3, boolean z) {
        for (int size = this.mSelectedListeners.size() - 1; size >= 0; size--) {
            ((InterfaceC19561911g9) ListProtector.get(this.mSelectedListeners, size)).LIZJ(c12h3, z);
        }
    }

    private void updateTabViewLayoutParams(LinearLayout.LayoutParams layoutParams, int i) {
        if (this.mMode == 1 && this.mTabGravity == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        int i2 = this.mTabMargin;
        if (i2 != 0) {
            if (this.mTabEdgeExtraMargin > 0) {
                if (isRTL()) {
                    if (i == 0) {
                        layoutParams.rightMargin = this.mTabMargin + this.mTabEdgeExtraMargin;
                    } else {
                        layoutParams.rightMargin = this.mTabMargin;
                    }
                    int i3 = this.mTotalTab;
                    if (i3 > 0 && i == i3 - 1) {
                        layoutParams.leftMargin = this.mTabMargin + this.mTabEdgeExtraMargin;
                        return;
                    } else {
                        layoutParams.leftMargin = this.mTabMargin;
                        return;
                    }
                }
                if (i == 0) {
                    layoutParams.leftMargin = this.mTabMargin + this.mTabEdgeExtraMargin;
                } else {
                    layoutParams.leftMargin = this.mTabMargin;
                }
                int i4 = this.mTotalTab;
                if (i4 > 0 && i == i4 - 1) {
                    layoutParams.rightMargin = this.mTabMargin + this.mTabEdgeExtraMargin;
                    return;
                } else {
                    layoutParams.rightMargin = this.mTabMargin;
                    return;
                }
            }
            layoutParams.leftMargin = i2;
            layoutParams.rightMargin = i2;
        }
    }

    public void addTab(C12H3 c12h3, int i) {
        addTab(c12h3, i, this.mTabs.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        addViewInternal(view);
    }

    public void configDynamicTabMode(boolean z, int i) {
        this.isEnableDynamicTabMode = z;
        this.maxFixedTabSize = i;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iDpToPx = dpToPx(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(iDpToPx, 1073741824);
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(iDpToPx, View.MeasureSpec.getSize(i2)), 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iDpToPx2 = this.mRequestedTabMaxWidth;
            if (iDpToPx2 <= 0) {
                iDpToPx2 = size - dpToPx(56);
            }
            this.mTabMaxWidth = iDpToPx2;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.mMode;
            if (i3 != 0) {
                if (i3 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    public void setPagerAdapter(PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.mPagerAdapter;
        if (pagerAdapter2 != null && (dataSetObserver = this.mPagerAdapterObserver) != null) {
            pagerAdapter2.LJJIJIIJIL(dataSetObserver);
        }
        this.mPagerAdapter = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.mPagerAdapterObserver == null) {
                this.mPagerAdapterObserver = new DataSetObserver() { // from class: X.19YF
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        this.LIZ.populateFromPagerAdapter();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        this.LIZ.populateFromPagerAdapter();
                    }
                };
            }
            pagerAdapter.LJJII(this.mPagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    public void setSelectedTabIndicatorCornerRadius(float f, float f2) {
        C19YB c19yb = this.mTabStrip;
        c19yb.getClass();
        if (f >= 0.0f && f2 >= 0.0f) {
            if (c19yb.LLIZLLLIL != f || c19yb.LLJ != f2) {
                c19yb.LLIZLLLIL = f;
                c19yb.LLJ = f2;
                c19yb.postInvalidateOnAnimation();
            }
        }
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(createColorStateList(i, i2));
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) {
        setupWithViewPager(viewPager, z, false);
    }

    public void smoothSelectTab(C12H3 c12h3, boolean z) {
        int i;
        C12H3 c12h32 = this.mSelectedTab;
        if (c12h32 == c12h3) {
            if (c12h32 != null) {
                dispatchTabReselected(c12h3);
                smoothScrollTo(calculateScrollXForTab(c12h3.LIZLLL, 0.0f), 0);
                return;
            }
            return;
        }
        if (c12h3 != null) {
            i = c12h3.LIZLLL;
        } else {
            i = -1;
        }
        if (z) {
            if ((c12h32 == null || c12h32.LIZLLL == -1) && i != -1) {
                setScrollPosition(i, 0.0f, true);
            } else {
                animateToTab(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        if (c12h32 != null) {
            dispatchTabUnselected(c12h32);
        }
        this.mSelectedTab = c12h3;
        if (c12h3 == null) {
            return;
        }
        dispatchTabSelected(c12h3, false);
    }

    public void updateTabWidthThreshold(int i, int i2) {
        this.mRequestedTabMinWidth = i;
        this.mRequestedTabMaxWidth = i2;
    }

    public void addTab(C12H3 c12h3, boolean z) {
        addTab(c12h3, this.mTabs.size(), z);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    public C19YA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mTabs = new ArrayList<>();
        this.mTabMaxWidth = Integer.MAX_VALUE;
        this.mSelectedListeners = new ArrayList<>();
        this.isDefaultAddTab = true;
        this.isSupportCustomIndicator = true;
        this.mTabViewPool = new C1085650eMF(12);
        this.mTotalTab = 0;
        this.mTabEdgeExtraMargin = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C19YH.LIZ);
        boolean z = !typedArrayObtainStyledAttributes.hasValue(0);
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            setHorizontalScrollBarEnabled(false);
            C19YB c19yb = new C19YB(this, context);
            this.mTabStrip = c19yb;
            super.addView(c19yb, 0, new FrameLayout.LayoutParams(-2, -1));
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.TabLayout, i, R.style.a2k);
            C19YB c19yb2 = this.mTabStrip;
            int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TabLayout_tabIndicatorHeight, 0);
            if (c19yb2.LL != dimensionPixelSize) {
                c19yb2.LL = dimensionPixelSize;
                c19yb2.postInvalidateOnAnimation();
            }
            C19YB c19yb3 = this.mTabStrip;
            int color = typedArrayObtainStyledAttributes2.getColor(R$styleable.TabLayout_tabIndicatorColor, 0);
            if (c19yb3.LLILLJJLI.getColor() != color) {
                c19yb3.LLILLJJLI.setColor(color);
                c19yb3.postInvalidateOnAnimation();
            }
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TabLayout_tabPadding, 0);
            this.mTabPaddingBottom = dimensionPixelSize2;
            this.mTabPaddingEnd = dimensionPixelSize2;
            this.mTabPaddingTop = dimensionPixelSize2;
            this.mTabPaddingStart = dimensionPixelSize2;
            this.mTabPaddingStart = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingStart, dimensionPixelSize2);
            this.mTabPaddingTop = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingTop, this.mTabPaddingTop);
            this.mTabPaddingEnd = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingEnd, this.mTabPaddingEnd);
            this.mTabPaddingBottom = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingBottom, this.mTabPaddingBottom);
            int resourceId = typedArrayObtainStyledAttributes2.getResourceId(R$styleable.TabLayout_tabTextAppearance, R.style.qb);
            this.mTabTextAppearance = resourceId;
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(resourceId, R$styleable.TextAppearance);
            try {
                this.mTabTextSize = typedArrayObtainStyledAttributes3.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, 0);
                this.mTabTextColors = typedArrayObtainStyledAttributes3.getColorStateList(R$styleable.TextAppearance_android_textColor);
                typedArrayObtainStyledAttributes3.recycle();
                if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.TabLayout_tabTextColor)) {
                    this.mTabTextColors = typedArrayObtainStyledAttributes2.getColorStateList(R$styleable.TabLayout_tabTextColor);
                }
                if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.TabLayout_tabSelectedTextColor)) {
                    this.mTabTextColors = createColorStateList(this.mTabTextColors.getDefaultColor(), typedArrayObtainStyledAttributes2.getColor(R$styleable.TabLayout_tabSelectedTextColor, 0));
                }
                this.mRequestedTabMinWidth = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TabLayout_tabMinWidth, -1);
                this.mRequestedTabMaxWidth = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TabLayout_tabMaxWidth, -1);
                this.mTabBackgroundResId = typedArrayObtainStyledAttributes2.getResourceId(R$styleable.TabLayout_tabBackground, 0);
                this.mContentInsetStart = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TabLayout_tabContentStart, 0);
                this.mMode = typedArrayObtainStyledAttributes2.getInt(R$styleable.TabLayout_tabMode, 1);
                this.mTabGravity = typedArrayObtainStyledAttributes2.getInt(R$styleable.TabLayout_tabGravity, 0);
                typedArrayObtainStyledAttributes2.recycle();
                Resources resources = getResources();
                this.mTabTextMultiLineSize = resources.getDimensionPixelSize(R.dimen.rd);
                this.mScrollableTabMinWidth = resources.getDimensionPixelSize(R.dimen.rb);
                this.mIndicatorCornerX = C11VU.LIZIZ(1.5f, getContext());
                this.mIndicatorCornerY = C11VU.LIZIZ(1.5f, getContext());
                this.mOriginalScreenOrientation = getResources().getConfiguration().orientation;
                applyModeAndGravity();
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                typedArrayObtainStyledAttributes3.recycle();
                throw th;
            }
        }
        throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
    }

    private void setupWithViewPager(final ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.mViewPager;
        if (viewPager2 != null) {
            C19642311t7 c19642311t7 = this.mPageChangeListener;
            if (c19642311t7 != null) {
                viewPager2.removeOnPageChangeListener(c19642311t7);
            }
            C19YE c19ye = this.mAdapterChangeListener;
            if (c19ye != null) {
                this.mViewPager.removeOnAdapterChangeListener(c19ye);
            }
        }
        InterfaceC19561911g9 interfaceC19561911g9 = this.mCurrentVpSelectedListener;
        if (interfaceC19561911g9 != null) {
            removeOnTabSelectedListener(interfaceC19561911g9);
            this.mCurrentVpSelectedListener = null;
        }
        if (viewPager != null) {
            this.mViewPager = viewPager;
            if (this.mPageChangeListener == null) {
                this.mPageChangeListener = new C19642311t7(this);
            }
            C19642311t7 c19642311t72 = this.mPageChangeListener;
            c19642311t72.LLILLL = 0;
            c19642311t72.LLILLJJLI = 0;
            viewPager.addOnPageChangeListener(c19642311t72);
            InterfaceC19561911g9 interfaceC19561911g92 = new InterfaceC19561911g9(viewPager) { // from class: X.113x
                public final ViewPager LIZ;

                @Override // X.InterfaceC19561911g9
                public final void LIZ(C12H3 c12h3) {
                }

                @Override // X.InterfaceC19561911g9
                public final void LIZIZ(C12H3 c12h3) {
                }

                {
                    this.LIZ = viewPager;
                }

                @Override // X.InterfaceC19561911g9
                public final void LIZJ(C12H3 c12h3, boolean z3) {
                    this.LIZ.setCurrentItem(c12h3.LIZLLL);
                }
            };
            this.mCurrentVpSelectedListener = interfaceC19561911g92;
            addOnTabSelectedListener(interfaceC19561911g92);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                setPagerAdapter(adapter, z);
            }
            if (this.mAdapterChangeListener == null) {
                this.mAdapterChangeListener = new C19YE(this);
            }
            C19YE c19ye2 = this.mAdapterChangeListener;
            c19ye2.LL = z;
            viewPager.addOnAdapterChangeListener(c19ye2);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.mViewPager = null;
            setPagerAdapter(null, false);
        }
        this.mSetupViewPagerImplicitly = z2;
    }

    public void addTab(C12H3 c12h3, int i, boolean z) {
        if (c12h3.LJI == this) {
            configureTab(c12h3, i);
            addTabView(c12h3, i);
            if (z) {
                c12h3.LIZ();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    public void selectTab(C12H3 c12h3, boolean z, boolean z2) {
        int i;
        C12H3 c12h32 = this.mSelectedTab;
        if (c12h32 == c12h3) {
            if (c12h32 != null) {
                dispatchTabReselected(c12h3);
                animateToTab(c12h3.LIZLLL);
                return;
            }
            return;
        }
        if (c12h3 != null) {
            i = c12h3.LIZLLL;
        } else {
            i = -1;
        }
        if (z) {
            if ((c12h32 == null || c12h32.LIZLLL == -1) && i != -1) {
                setScrollPosition(i, 0.0f, true);
            } else {
                animateToTab(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        if (c12h32 != null) {
            dispatchTabUnselected(c12h32);
        }
        this.mSelectedTab = c12h3;
        if (c12h3 != null) {
            dispatchTabSelected(c12h3, z2);
        }
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void addTab(C12H3 c12h3, boolean z, int i) {
        this.mTotalTab = i;
        addTab(c12h3, this.mTabs.size(), z);
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int iRound = Math.round(i + f);
        if (iRound >= 0 && iRound < this.mTabStrip.getChildCount()) {
            if (z2) {
                C19YB c19yb = this.mTabStrip;
                ValueAnimator valueAnimator = c19yb.LLJI;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    c19yb.LLJI.cancel();
                }
                c19yb.LLILLL = i;
                c19yb.LLILZ = f;
                c19yb.LIZIZ();
            }
            ValueAnimator valueAnimator2 = this.mScrollAnimator;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.mScrollAnimator.cancel();
            }
            scrollTo(calculateScrollXForTab(i, f), 0);
            if (z) {
                setSelectedTabView(iRound);
            }
        }
    }

    @Override // android.view.View
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, 80, i8, z);
    }
}
