package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
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

/* JADX INFO: renamed from: X.19U1, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@InterfaceC21561419Zs
public class C19U1 extends HorizontalScrollView {
    public static final int DEF_STYLE_RES = 2131887122;
    public static final InterfaceC20015613Te<C19U0> tabPool = new C1085640eME(16);
    public C19UA adapterChangeListener;
    public int contentInsetStart;
    public InterfaceC1586460rO0 currentVpSelectedListener;
    public boolean inlineLabel;
    public int mode;
    public C20587315h9 pageChangeListener;
    public PagerAdapter pagerAdapter;
    public DataSetObserver pagerAdapterObserver;
    public final int requestedTabMaxWidth;
    public final int requestedTabMinWidth;
    public ValueAnimator scrollAnimator;
    public final int scrollableTabMinWidth;
    public InterfaceC1586460rO0 selectedListener;
    public final ArrayList<InterfaceC1586460rO0> selectedListeners;
    public C19U0 selectedTab;
    public boolean setupViewPagerImplicitly;
    public final C19U2 slidingTabIndicator;
    public final int tabBackgroundResId;
    public int tabGravity;
    public ColorStateList tabIconTint;
    public PorterDuff.Mode tabIconTintMode;
    public int tabIndicatorAnimationDuration;
    public int tabIndicatorAnimationMode;
    public boolean tabIndicatorFullWidth;
    public int tabIndicatorGravity;
    public C19U3 tabIndicatorInterpolator;
    public int tabMaxWidth;
    public int tabPaddingBottom;
    public int tabPaddingEnd;
    public int tabPaddingStart;
    public int tabPaddingTop;
    public ColorStateList tabRippleColorStateList;
    public Drawable tabSelectedIndicator;
    public int tabSelectedIndicatorColor;
    public int tabTextAppearance;
    public ColorStateList tabTextColors;
    public float tabTextMultiLineSize;
    public float tabTextSize;
    public final InterfaceC20015613Te<C21546519Tz> tabViewPool;
    public final ArrayList<C19U0> tabs;
    public boolean unboundedRipple;
    public ViewPager viewPager;

    private void applyModeAndGravity() {
        int i = this.mode;
        this.slidingTabIndicator.setPaddingRelative((i == 0 || i == 2) ? Math.max(0, this.contentInsetStart - this.tabPaddingStart) : 0, 0, 0, 0);
        int i2 = this.mode;
        if (i2 == 0) {
            applyGravityForModeScrollable(this.tabGravity);
        } else if (i2 == 1 || i2 == 2) {
            this.slidingTabIndicator.setGravity(1);
        }
        updateTabViews(true);
    }

    private LinearLayout.LayoutParams createLayoutParamsForTabs() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    private void ensureScrollAnimator() {
        if (this.scrollAnimator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.scrollAnimator = valueAnimator;
            valueAnimator.setInterpolator(C194V.LIZIZ);
            this.scrollAnimator.setDuration(this.tabIndicatorAnimationDuration);
            this.scrollAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0eOr
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.LL.scrollTo(((Integer) valueAnimator2.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private int getDefaultHeight() {
        int size = this.tabs.size();
        for (int i = 0; i < size; i++) {
            C19U0 c19u0 = (C19U0) ListProtector.get(this.tabs, i);
            if (c19u0 != null && c19u0.LIZIZ != null && !TextUtils.isEmpty(c19u0.LIZJ)) {
                return !this.inlineLabel ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.requestedTabMinWidth;
        if (i != -1) {
            return i;
        }
        int i2 = this.mode;
        if (i2 == 0 || i2 == 2) {
            return this.scrollableTabMinWidth;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.slidingTabIndicator.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void updateAllTabs() {
        int size = this.tabs.size();
        for (int i = 0; i < size; i++) {
            ((C19U0) ListProtector.get(this.tabs, i)).LJI();
        }
    }

    public void clearOnTabSelectedListeners() {
        this.selectedListeners.clear();
    }

    public C19U0 createTabFromPool() {
        C19U0 c19u0LIZIZ = tabPool.LIZIZ();
        return c19u0LIZIZ == null ? new C19U0() : c19u0LIZIZ;
    }

    public int getSelectedTabPosition() {
        C19U0 c19u0 = this.selectedTab;
        if (c19u0 != null) {
            return c19u0.LJ;
        }
        return -1;
    }

    public int getTabCount() {
        return this.tabs.size();
    }

    public void removeAllTabs() {
        for (int childCount = this.slidingTabIndicator.getChildCount() - 1; childCount >= 0; childCount--) {
            removeTabViewAt(childCount);
        }
        Iterator<C19U0> it2 = this.tabs.iterator();
        while (it2.hasNext()) {
            C19U0 next = it2.next();
            it2.remove();
            next.LJII = null;
            next.LJIIIIZZ = null;
            next.LIZ = null;
            next.LIZIZ = null;
            next.LJIIIZ = -1;
            next.LIZJ = null;
            next.LIZLLL = null;
            next.LJ = -1;
            next.LJFF = null;
            releaseFromTabPool(next);
        }
        this.selectedTab = null;
    }

    public C19U0 newTab() {
        C19U0 c19u0CreateTabFromPool = createTabFromPool();
        c19u0CreateTabFromPool.LJII = this;
        C21546519Tz c21546519TzCreateTabView = createTabView(c19u0CreateTabFromPool);
        c19u0CreateTabFromPool.LJIIIIZZ = c21546519TzCreateTabView;
        int i = c19u0CreateTabFromPool.LJIIIZ;
        if (i != -1) {
            c21546519TzCreateTabView.setId(i);
        }
        return c19u0CreateTabFromPool;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C21539119Rd.LIZJ(this);
        if (this.viewPager == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                setupWithViewPager((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.setupViewPagerImplicitly) {
            setupWithViewPager(null);
            this.setupViewPagerImplicitly = false;
        }
    }

    public void populateFromPagerAdapter() {
        int currentItem;
        removeAllTabs();
        PagerAdapter pagerAdapter = this.pagerAdapter;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                C19U0 c19u0NewTab = newTab();
                c19u0NewTab.LJFF(this.pagerAdapter.LJIJJLI(i));
                addTab(c19u0NewTab, false);
            }
            ViewPager viewPager = this.viewPager;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            selectTab(getTabAt(currentItem));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public int getTabGravity() {
        return this.tabGravity;
    }

    public ColorStateList getTabIconTint() {
        return this.tabIconTint;
    }

    public int getTabIndicatorAnimationMode() {
        return this.tabIndicatorAnimationMode;
    }

    public int getTabIndicatorGravity() {
        return this.tabIndicatorGravity;
    }

    public int getTabMaxWidth() {
        return this.tabMaxWidth;
    }

    public int getTabMode() {
        return this.mode;
    }

    public ColorStateList getTabRippleColor() {
        return this.tabRippleColorStateList;
    }

    public Drawable getTabSelectedIndicator() {
        return this.tabSelectedIndicator;
    }

    public ColorStateList getTabTextColors() {
        return this.tabTextColors;
    }

    public boolean hasUnboundedRipple() {
        return this.unboundedRipple;
    }

    public boolean isInlineLabel() {
        return this.inlineLabel;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.tabIndicatorFullWidth;
    }

    public C19U1(Context context) {
        this(context, null);
    }

    public static void INVOKEVIRTUAL_com_google_android_material_tabs_TabLayout_com_ss_android_ugc_profile_platform_framework_aweme_profile_tab_profiletab_view_ProfileTabProxy_proxy(C19U1 c19u1) {
        if (c19u1 instanceof C1257500ipQ) {
            return;
        }
        c19u1.populateFromPagerAdapter();
    }

    private void addTabFromItemView(C19UN c19un) {
        C19U0 c19u0NewTab = newTab();
        c19un.getClass();
        if (!TextUtils.isEmpty(c19un.getContentDescription())) {
            c19u0NewTab.LIZLLL = c19un.getContentDescription();
            c19u0NewTab.LJI();
        }
        addTab(c19u0NewTab);
    }

    private void addTabView(C19U0 c19u0) {
        C21546519Tz c21546519Tz = c19u0.LJIIIIZZ;
        c21546519Tz.setSelected(false);
        c21546519Tz.setActivated(false);
        this.slidingTabIndicator.addView(c21546519Tz, c19u0.LJ, createLayoutParamsForTabs());
    }

    private void addViewInternal(View view) {
        if (view instanceof C19UN) {
            addTabFromItemView((C19UN) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void animateToTab(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut() && !this.slidingTabIndicator.childrenNeedLayout()) {
            int scrollX = getScrollX();
            int iCalculateScrollXForTab = calculateScrollXForTab(i, 0.0f);
            if (scrollX != iCalculateScrollXForTab) {
                ensureScrollAnimator();
                this.scrollAnimator.setIntValues(scrollX, iCalculateScrollXForTab);
                this.scrollAnimator.start();
            }
            this.slidingTabIndicator.animateIndicatorToPosition(i, this.tabIndicatorAnimationDuration);
            return;
        }
        setScrollPosition(i, 0.0f, true);
    }

    private void applyGravityForModeScrollable(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
            } else {
                this.slidingTabIndicator.setGravity(1);
                return;
            }
        }
        this.slidingTabIndicator.setGravity(8388611);
    }

    private C21546519Tz createTabView(C19U0 c19u0) {
        C21546519Tz c21546519Tz;
        InterfaceC20015613Te<C21546519Tz> interfaceC20015613Te = this.tabViewPool;
        if (interfaceC20015613Te == null || (c21546519Tz = interfaceC20015613Te.LIZIZ()) == null) {
            c21546519Tz = new C21546519Tz(this, getContext());
        }
        c21546519Tz.setTab(c19u0);
        c21546519Tz.setFocusable(true);
        c21546519Tz.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c19u0.LIZLLL)) {
            c21546519Tz.setContentDescription(c19u0.LIZJ);
            return c21546519Tz;
        }
        c21546519Tz.setContentDescription(c19u0.LIZLLL);
        return c21546519Tz;
    }

    private void dispatchTabReselected(C19U0 c19u0) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            ((InterfaceC1586460rO0) ListProtector.get(this.selectedListeners, size)).ih(c19u0);
        }
    }

    private void dispatchTabSelected(C19U0 c19u0) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            ((InterfaceC1586460rO0) ListProtector.get(this.selectedListeners, size)).Oq(c19u0);
        }
    }

    private void dispatchTabUnselected(C19U0 c19u0) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            ((InterfaceC1586460rO0) ListProtector.get(this.selectedListeners, size)).Yn(c19u0);
        }
    }

    private void removeTabViewAt(int i) {
        C21546519Tz c21546519Tz = (C21546519Tz) this.slidingTabIndicator.getChildAt(i);
        INVOKEVIRTUAL_com_google_android_material_tabs_TabLayout_com_bytedance_tt_reliability_monitor_viewchecker_RemoveViewCausedNPEChecker_removeViewAt(this.slidingTabIndicator, i);
        if (c21546519Tz != null) {
            c21546519Tz.reset();
            this.tabViewPool.LIZ(c21546519Tz);
        }
        requestLayout();
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.slidingTabIndicator.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.slidingTabIndicator.getChildAt(i2);
                boolean z2 = true;
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
                if (i2 != i) {
                    z2 = false;
                }
                childAt.setActivated(z2);
            }
        }
    }

    private void updateTabViewLayoutParams(LinearLayout.LayoutParams layoutParams) {
        if (this.mode == 1 && this.tabGravity == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    public void addOnTabSelectedListener(InterfaceC1586460rO0 interfaceC1586460rO0) {
        if (!this.selectedListeners.contains(interfaceC1586460rO0)) {
            this.selectedListeners.add(interfaceC1586460rO0);
        }
    }

    public void addTab(C19U0 c19u0) {
        addTab(c19u0, this.tabs.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        addViewInternal(view);
    }

    public C19U0 getTabAt(int i) {
        if (i >= 0 && i < getTabCount()) {
            return (C19U0) ListProtector.get(this.tabs, i);
        }
        return null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
            View childAt = this.slidingTabIndicator.getChildAt(i);
            if (childAt instanceof C21546519Tz) {
                ((C21546519Tz) childAt).drawBackground(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(C20093113jd.LIZIZ(1, getTabCount(), 1, false));
    }

    public boolean releaseFromTabPool(C19U0 c19u0) {
        return tabPool.LIZ(c19u0);
    }

    public void removeOnTabSelectedListener(InterfaceC1586460rO0 interfaceC1586460rO0) {
        this.selectedListeners.remove(interfaceC1586460rO0);
    }

    public void removeTab(C19U0 c19u0) {
        if (c19u0.LJII == this) {
            removeTabAt(c19u0.LJ);
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    public void removeTabAt(int i) {
        int i2;
        C19U0 c19u0 = this.selectedTab;
        if (c19u0 != null) {
            i2 = c19u0.LJ;
        } else {
            i2 = 0;
        }
        removeTabViewAt(i);
        C19U0 c19u02 = (C19U0) ListProtector.remove(this.tabs, i);
        C19U0 c19u03 = null;
        if (c19u02 != null) {
            c19u02.LJII = null;
            c19u02.LJIIIIZZ = null;
            c19u02.LIZ = null;
            c19u02.LIZIZ = null;
            c19u02.LJIIIZ = -1;
            c19u02.LIZJ = null;
            c19u02.LIZLLL = null;
            c19u02.LJ = -1;
            c19u02.LJFF = null;
            releaseFromTabPool(c19u02);
        }
        int size = this.tabs.size();
        for (int i3 = i; i3 < size; i3++) {
            ((C19U0) ListProtector.get(this.tabs, i3)).LJ = i3;
        }
        if (i2 == i) {
            if (!this.tabs.isEmpty()) {
                c19u03 = (C19U0) ListProtector.get(this.tabs, Math.max(0, i - 1));
            }
            selectTab(c19u03);
        }
    }

    public void selectTab(C19U0 c19u0) {
        selectTab(c19u0, true);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C21539119Rd.LIZIZ(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.inlineLabel != z) {
            this.inlineLabel = z;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof C21546519Tz) {
                    ((C21546519Tz) childAt).updateOrientation();
                }
            }
            applyModeAndGravity();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setOnTabSelectedListener(InterfaceC1586460rO0 interfaceC1586460rO0) {
        InterfaceC1586460rO0 interfaceC1586460rO02 = this.selectedListener;
        if (interfaceC1586460rO02 != null) {
            removeOnTabSelectedListener(interfaceC1586460rO02);
        }
        this.selectedListener = interfaceC1586460rO0;
        if (interfaceC1586460rO0 != null) {
            addOnTabSelectedListener(interfaceC1586460rO0);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        ensureScrollAnimator();
        this.scrollAnimator.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C14MI.LIZ(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.tabSelectedIndicatorColor = i;
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.tabIndicatorGravity != i) {
            this.tabIndicatorGravity = i;
            this.slidingTabIndicator.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.slidingTabIndicator.setSelectedIndicatorHeight(i);
    }

    public void setTabGravity(int i) {
        if (this.tabGravity != i) {
            this.tabGravity = i;
            applyModeAndGravity();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.tabIconTint != colorStateList) {
            this.tabIconTint = colorStateList;
            updateAllTabs();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C838410Wul.LIZIZ(i, getContext()));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.tabIndicatorAnimationMode = i;
        if (i != 0) {
            if (i == 1) {
                this.tabIndicatorInterpolator = new C19U3() { // from class: X.19U4
                    @Override // X.C19U3
                    public final void LIZIZ(C19U1 c19u1, View view, View view2, float f, Drawable drawable) {
                        boolean z;
                        float fSin;
                        float fCos;
                        RectF rectFLIZ = C19U3.LIZ(c19u1, view);
                        RectF rectFLIZ2 = C19U3.LIZ(c19u1, view2);
                        if (rectFLIZ.left < rectFLIZ2.left) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            double d = (((double) f) * 3.141592653589793d) / 2.0d;
                            fSin = (float) (1.0d - Math.cos(d));
                            fCos = (float) Math.sin(d);
                        } else {
                            double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
                            fSin = (float) Math.sin(d2);
                            fCos = (float) (1.0d - Math.cos(d2));
                        }
                        drawable.setBounds(C194V.LIZ(fSin, (int) rectFLIZ.left, (int) rectFLIZ2.left), drawable.getBounds().top, C194V.LIZ(fCos, (int) rectFLIZ.right, (int) rectFLIZ2.right), drawable.getBounds().bottom);
                    }
                };
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(i);
            sbLIZ.append(" is not a valid TabIndicatorAnimationMode");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.tabIndicatorInterpolator = new C19U3();
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.tabIndicatorFullWidth = z;
        this.slidingTabIndicator.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.mode) {
            this.mode = i;
            applyModeAndGravity();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.tabRippleColorStateList != colorStateList) {
            this.tabRippleColorStateList = colorStateList;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof C21546519Tz) {
                    ((C21546519Tz) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C838410Wul.LIZIZ(i, getContext()));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.tabTextColors != colorStateList) {
            this.tabTextColors = colorStateList;
            updateAllTabs();
        }
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        setPagerAdapter(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.unboundedRipple != z) {
            this.unboundedRipple = z;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof C21546519Tz) {
                    ((C21546519Tz) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    public void updateTabViews(boolean z) {
        for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
            View childAt = this.slidingTabIndicator.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            updateTabViewLayoutParams((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void addOnTabSelectedListener(InterfaceC1584740rLE interfaceC1584740rLE) {
        addOnTabSelectedListener((InterfaceC1586460rO0) interfaceC1584740rLE);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void removeOnTabSelectedListener(InterfaceC1584740rLE interfaceC1584740rLE) {
        removeOnTabSelectedListener((InterfaceC1586460rO0) interfaceC1584740rLE);
    }

    public void setOnTabSelectedListener(InterfaceC1584740rLE interfaceC1584740rLE) {
        setOnTabSelectedListener((InterfaceC1586460rO0) interfaceC1584740rLE);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.tabSelectedIndicator != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.tabSelectedIndicator = drawable;
        }
    }

    public C19U1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.fqk);
    }

    public static void INVOKEVIRTUAL_com_google_android_material_tabs_TabLayout_com_bytedance_tt_reliability_monitor_viewchecker_RemoveViewCausedNPEChecker_removeViewAt(C19U2 c19u2, int i) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c19u2, null);
        c19u2.removeViewAt(i);
    }

    private int calculateScrollXForTab(int i, float f) {
        View childAt;
        int width;
        int i2 = this.mode;
        int width2 = 0;
        if (i2 != 0 && i2 != 2) {
            return 0;
        }
        View childAt2 = this.slidingTabIndicator.getChildAt(i);
        int i3 = i + 1;
        if (i3 < this.slidingTabIndicator.getChildCount()) {
            childAt = this.slidingTabIndicator.getChildAt(i3);
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
        int i4 = (int) ((width + width2) * 0.5f * f);
        if (getLayoutDirection() == 0) {
            return left + i4;
        }
        return left - i4;
    }

    private void configureTab(C19U0 c19u0, int i) {
        c19u0.LJ = i;
        ListProtector.add(this.tabs, i, c19u0);
        int size = this.tabs.size();
        while (true) {
            i++;
            if (i < size) {
                ((C19U0) ListProtector.get(this.tabs, i)).LJ = i;
            } else {
                return;
            }
        }
    }

    public static ColorStateList createColorStateList(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    public void addTab(C19U0 c19u0, int i) {
        addTab(c19u0, i, this.tabs.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        addViewInternal(view);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r1 = r6.getContext()
            int r0 = r6.getDefaultHeight()
            float r0 = X.C21551419Vw.LIZIZ(r0, r1)
            int r2 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r5 = 0
            r4 = 1
            if (r1 == r0) goto L94
            if (r1 != 0) goto L2c
            int r0 = r6.getPaddingTop()
            int r2 = r2 + r0
            int r0 = r6.getPaddingBottom()
            int r2 = r2 + r0
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
        L2c:
            int r1 = android.view.View.MeasureSpec.getSize(r7)
            int r0 = android.view.View.MeasureSpec.getMode(r7)
            if (r0 == 0) goto L49
            int r0 = r6.requestedTabMaxWidth
            if (r0 > 0) goto L47
            float r2 = (float) r1
            android.content.Context r1 = r6.getContext()
            r0 = 56
            float r0 = X.C21551419Vw.LIZIZ(r0, r1)
            float r2 = r2 - r0
            int r0 = (int) r2
        L47:
            r6.tabMaxWidth = r0
        L49:
            super.onMeasure(r7, r8)
            int r0 = r6.getChildCount()
            if (r0 != r4) goto L5f
            android.view.View r2 = r6.getChildAt(r5)
            int r1 = r6.mode
            if (r1 == 0) goto L60
            if (r1 == r4) goto L6b
            r0 = 2
            if (r1 == r0) goto L60
        L5f:
            return
        L60:
            int r1 = r2.getMeasuredWidth()
            int r0 = r6.getMeasuredWidth()
            if (r1 >= r0) goto L5f
            goto L75
        L6b:
            int r1 = r2.getMeasuredWidth()
            int r0 = r6.getMeasuredWidth()
            if (r1 == r0) goto L5f
        L75:
            int r1 = r6.getPaddingTop()
            int r0 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            int r0 = r0.height
            int r1 = android.widget.HorizontalScrollView.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r2.measure(r0, r1)
            return
        L94:
            int r0 = r6.getChildCount()
            if (r0 != r4) goto L2c
            int r0 = android.view.View.MeasureSpec.getSize(r8)
            if (r0 < r2) goto L2c
            android.view.View r0 = r6.getChildAt(r5)
            r0.setMinimumHeight(r2)
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19U1.onMeasure(int, int):void");
    }

    public void selectTab(C19U0 c19u0, boolean z) {
        int i;
        C19U0 c19u02 = this.selectedTab;
        if (c19u02 == c19u0) {
            if (c19u02 != null) {
                dispatchTabReselected(c19u0);
                animateToTab(c19u0.LJ);
                return;
            }
            return;
        }
        if (c19u0 != null) {
            i = c19u0.LJ;
        } else {
            i = -1;
        }
        if (z) {
            if ((c19u02 == null || c19u02.LJ == -1) && i != -1) {
                setScrollPosition(i, 0.0f, true);
            } else {
                animateToTab(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.selectedTab = c19u0;
        if (c19u02 != null) {
            dispatchTabUnselected(c19u02);
        }
        if (c19u0 == null) {
            return;
        }
        dispatchTabSelected(c19u0);
    }

    public void setPagerAdapter(PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.pagerAdapter;
        if (pagerAdapter2 != null && (dataSetObserver = this.pagerAdapterObserver) != null) {
            pagerAdapter2.LJJIJIIJIL(dataSetObserver);
        }
        this.pagerAdapter = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.pagerAdapterObserver == null) {
                this.pagerAdapterObserver = new DataSetObserver() { // from class: X.19UE
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        C19U1 c19u1 = this.LIZ;
                        if (c19u1 instanceof C1257500ipQ) {
                            return;
                        }
                        c19u1.populateFromPagerAdapter();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        C19U1 c19u1 = this.LIZ;
                        if (c19u1 instanceof C1257500ipQ) {
                            return;
                        }
                        c19u1.populateFromPagerAdapter();
                    }
                };
            }
            pagerAdapter.LJJII(this.pagerAdapterObserver);
        }
        INVOKEVIRTUAL_com_google_android_material_tabs_TabLayout_com_ss_android_ugc_profile_platform_framework_aweme_profile_tab_profiletab_view_ProfileTabProxy_proxy(this);
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(createColorStateList(i, i2));
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) {
        setupWithViewPager(viewPager, z, false);
    }

    public void addTab(C19U0 c19u0, boolean z) {
        addTab(c19u0, this.tabs.size(), z);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19U1(Context context, AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(C1369550lk9.LIZ(context, attributeSet, i, i2), attributeSet, i);
        this.tabs = new ArrayList<>();
        this.tabSelectedIndicator = new GradientDrawable();
        this.tabSelectedIndicatorColor = 0;
        this.tabMaxWidth = Integer.MAX_VALUE;
        this.selectedListeners = new ArrayList<>();
        this.tabViewPool = new C1085650eMF(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        C19U2 c19u2 = new C19U2(this, context2);
        this.slidingTabIndicator = c19u2;
        super.addView(c19u2, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayLIZLLL = C19PG.LIZLLL(context2, attributeSet, R$styleable.TabLayout, i, i2, R$styleable.TabLayout_tabTextAppearance);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C21538919Rb c21538919Rb = new C21538919Rb();
            c21538919Rb.LJIIJJI(ColorStateList.valueOf(colorDrawable.getColor()));
            c21538919Rb.LJIIIIZZ(context2);
            c21538919Rb.LJIIJ(C14K9.LJIIIIZZ(this));
            setBackground(c21538919Rb);
        }
        setSelectedTabIndicator(C19RN.LIZLLL(context2, typedArrayLIZLLL, R$styleable.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(typedArrayLIZLLL.getColor(R$styleable.TabLayout_tabIndicatorColor, 0));
        c19u2.setSelectedIndicatorHeight(typedArrayLIZLLL.getDimensionPixelSize(R$styleable.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(typedArrayLIZLLL.getInt(R$styleable.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(typedArrayLIZLLL.getBoolean(R$styleable.TabLayout_tabIndicatorFullWidth, true));
        setTabIndicatorAnimationMode(typedArrayLIZLLL.getInt(R$styleable.TabLayout_tabIndicatorAnimationMode, 0));
        int dimensionPixelSize = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.TabLayout_tabPadding, 0);
        this.tabPaddingBottom = dimensionPixelSize;
        this.tabPaddingEnd = dimensionPixelSize;
        this.tabPaddingTop = dimensionPixelSize;
        this.tabPaddingStart = dimensionPixelSize;
        this.tabPaddingStart = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.tabPaddingTop = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingTop, this.tabPaddingTop);
        this.tabPaddingEnd = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingEnd, this.tabPaddingEnd);
        this.tabPaddingBottom = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingBottom, this.tabPaddingBottom);
        int resourceId = typedArrayLIZLLL.getResourceId(R$styleable.TabLayout_tabTextAppearance, R.style.qb);
        this.tabTextAppearance = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, R$styleable.TextAppearance);
        try {
            this.tabTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, 0);
            this.tabTextColors = C19RN.LIZ(context2, typedArrayObtainStyledAttributes, R$styleable.TextAppearance_android_textColor);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayLIZLLL.hasValue(R$styleable.TabLayout_tabTextColor)) {
                this.tabTextColors = C19RN.LIZ(context2, typedArrayLIZLLL, R$styleable.TabLayout_tabTextColor);
            }
            if (typedArrayLIZLLL.hasValue(R$styleable.TabLayout_tabSelectedTextColor)) {
                this.tabTextColors = createColorStateList(this.tabTextColors.getDefaultColor(), typedArrayLIZLLL.getColor(R$styleable.TabLayout_tabSelectedTextColor, 0));
            }
            this.tabIconTint = C19RN.LIZ(context2, typedArrayLIZLLL, R$styleable.TabLayout_tabIconTint);
            this.tabIconTintMode = C21551419Vw.LIZLLL(typedArrayLIZLLL.getInt(R$styleable.TabLayout_tabIconTintMode, -1), null);
            this.tabRippleColorStateList = C19RN.LIZ(context2, typedArrayLIZLLL, R$styleable.TabLayout_tabRippleColor);
            this.tabIndicatorAnimationDuration = typedArrayLIZLLL.getInt(R$styleable.TabLayout_tabIndicatorAnimationDuration, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            this.requestedTabMinWidth = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.TabLayout_tabMinWidth, -1);
            this.requestedTabMaxWidth = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.TabLayout_tabMaxWidth, -1);
            this.tabBackgroundResId = typedArrayLIZLLL.getResourceId(R$styleable.TabLayout_tabBackground, 0);
            this.contentInsetStart = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.TabLayout_tabContentStart, 0);
            this.mode = typedArrayLIZLLL.getInt(R$styleable.TabLayout_tabMode, 1);
            this.tabGravity = typedArrayLIZLLL.getInt(R$styleable.TabLayout_tabGravity, 0);
            this.inlineLabel = typedArrayLIZLLL.getBoolean(R$styleable.TabLayout_tabInlineLabel, false);
            this.unboundedRipple = typedArrayLIZLLL.getBoolean(R$styleable.TabLayout_tabUnboundedRipple, false);
            typedArrayLIZLLL.recycle();
            Resources resources = getResources();
            this.tabTextMultiLineSize = resources.getDimensionPixelSize(R.dimen.rd);
            this.scrollableTabMinWidth = resources.getDimensionPixelSize(R.dimen.rb);
            applyModeAndGravity();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void setupWithViewPager(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            C20587315h9 c20587315h9 = this.pageChangeListener;
            if (c20587315h9 != null) {
                viewPager2.removeOnPageChangeListener(c20587315h9);
            }
            C19UA c19ua = this.adapterChangeListener;
            if (c19ua != null) {
                this.viewPager.removeOnAdapterChangeListener(c19ua);
            }
        }
        InterfaceC1586460rO0 interfaceC1586460rO0 = this.currentVpSelectedListener;
        if (interfaceC1586460rO0 != null) {
            removeOnTabSelectedListener(interfaceC1586460rO0);
            this.currentVpSelectedListener = null;
        }
        if (viewPager != null) {
            this.viewPager = viewPager;
            if (this.pageChangeListener == null) {
                this.pageChangeListener = new C20587315h9(this);
            }
            C20587315h9 c20587315h92 = this.pageChangeListener;
            c20587315h92.LLILLL = 0;
            c20587315h92.LLILLJJLI = 0;
            viewPager.addOnPageChangeListener(c20587315h92);
            C766990U6v c766990U6v = new C766990U6v(viewPager);
            this.currentVpSelectedListener = c766990U6v;
            addOnTabSelectedListener((InterfaceC1586460rO0) c766990U6v);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                setPagerAdapter(adapter, z);
            }
            if (this.adapterChangeListener == null) {
                this.adapterChangeListener = new C19UA(this);
            }
            C19UA c19ua2 = this.adapterChangeListener;
            c19ua2.LL = z;
            viewPager.addOnAdapterChangeListener(c19ua2);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.viewPager = null;
            setPagerAdapter(null, false);
        }
        this.setupViewPagerImplicitly = z2;
    }

    public void addTab(C19U0 c19u0, int i, boolean z) {
        if (c19u0.LJII == this) {
            configureTab(c19u0, i);
            addTabView(c19u0);
            if (z) {
                c19u0.LIZIZ();
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

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int iRound = Math.round(i + f);
        if (iRound >= 0 && iRound < this.slidingTabIndicator.getChildCount()) {
            if (z2) {
                this.slidingTabIndicator.setIndicatorPositionFromTabPosition(i, f);
            }
            ValueAnimator valueAnimator = this.scrollAnimator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.scrollAnimator.cancel();
            }
            scrollTo(calculateScrollXForTab(i, f), 0);
            if (z) {
                setSelectedTabView(iRound);
            }
        }
    }
}
