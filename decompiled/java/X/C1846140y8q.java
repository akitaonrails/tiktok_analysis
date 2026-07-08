package X;

import Y.ARunnableS110S0100000_10;
import Y.ARunnableS127S0100000_27;
import Y.AUListenerS275S0100000_27;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.0y8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846140y8q extends HorizontalScrollView {
    public static final C1085640eME LLLF = new C1085640eME(16);
    public int LL;
    public Integer LLILLJJLI;
    public float LLILLL;
    public RectF LLILZ;
    public RectF LLILZIL;
    public final C1846150y8r LLILZLL;
    public final C1846200y8w LLIZ;
    public ColorStateList LLIZLLLIL;
    public final int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public final ArrayList<C676930Qgt> LLJILJILJ;
    public C676930Qgt LLJILLL;
    public final int LLJJ;
    public boolean LLJJI;
    public Drawable LLJJIII;
    public final int LLJJIJI;
    public final ArrayList<InterfaceC1846180y8u> LLJJIJIIJIL;
    public Function1<? super C676930Qgt, Unit> LLJJIJIL;
    public C677140QhE LLJJJ;
    public ValueAnimator LLJJJIL;
    public ViewPager LLJJJJ;
    public PagerAdapter LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final C1085650eMF LLJLL;
    public boolean LLJLLIL;
    public final String LLJLLL;
    public final C1864970ydD LLJZ;
    public int LLJZIJLIL;
    public boolean LLL;

    public final void LJIIIZ() {
        C1845990y8b c1845990y8b;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        this.LLJLLIL = true;
        C531650Kt9 it2 = C13LZ.LJIILJJIL(0, this.LLILZLL.getChildCount()).iterator();
        while (it2.LLILLL) {
            View childAt = this.LLILZLL.getChildAt(it2.nextInt());
            if ((childAt instanceof C1845990y8b) && (c1845990y8b = (C1845990y8b) childAt) != null) {
                ViewGroup.LayoutParams layoutParams3 = c1845990y8b.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = -2;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1845990y8b);
                    c1845990y8b.setLayoutParams(layoutParams3);
                }
                TuxTextView tuxTextView = c1845990y8b.LLILLL;
                if (tuxTextView != null && (layoutParams2 = tuxTextView.getLayoutParams()) != null) {
                    layoutParams2.width = -2;
                    TuxTextView tuxTextView2 = c1845990y8b.LLILLL;
                    if (tuxTextView2 != null) {
                        C786410Ut5.R6(tuxTextView2, layoutParams2);
                    }
                }
                LinearLayout linearLayout = c1845990y8b.LLILLJJLI;
                if (linearLayout != null && (layoutParams = linearLayout.getLayoutParams()) != null) {
                    layoutParams.width = -2;
                    LinearLayout linearLayout2 = c1845990y8b.LLILLJJLI;
                    if (linearLayout2 != null) {
                        C786410Ut5.d6(linearLayout2, layoutParams);
                    }
                }
                TuxTextView tuxTextView3 = c1845990y8b.LLILLL;
                if (tuxTextView3 != null) {
                    tuxTextView3.requestLayout();
                }
                LinearLayout linearLayout3 = c1845990y8b.LLILLJJLI;
                if (linearLayout3 != null) {
                    linearLayout3.requestLayout();
                }
                c1845990y8b.requestLayout();
            }
        }
        this.LLILZLL.requestLayout();
        requestLayout();
    }

    private final C1846170y8t getAdapterChangeListener() {
        return (C1846170y8t) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    private final C677020Qh2 getPageChangeListener() {
        return (C677020Qh2) this.LLJJL.getValue();
    }

    private final C1846190y8v getPagerAdapterObserver() {
        return (C1846190y8v) this.LLJJJJLIIL.getValue();
    }

    private final int getTabScrollRange() {
        return Math.max(0, ((this.LLILZLL.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public final void LIZJ() {
        C426750GoL.LJIIL(this.LLILZLL, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LL)))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LL)))), null, 26);
        this.LLILZLL.setGravity(this.LLILLJJLI == null ? 1 : 8388611);
        int childCount = this.LLILZLL.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.LLILZLL.getChildAt(i).requestLayout();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C676930Qgt LJFF() {
        C676930Qgt c676930Qgt = (C676930Qgt) LLLF.LIZIZ();
        if (c676930Qgt == null) {
            c676930Qgt = new C676930Qgt();
        }
        c676930Qgt.LIZJ = this;
        C1845990y8b c1845990y8b = (C1845990y8b) this.LLJLL.LIZIZ();
        if (c1845990y8b == null) {
            c1845990y8b = new C1845990y8b(this, getContext());
        }
        c1845990y8b.setTab(c676930Qgt);
        c1845990y8b.setFocusable(true);
        if (TextUtils.isEmpty(null)) {
            c1845990y8b.setContentDescription(c676930Qgt.LIZ);
        } else {
            c1845990y8b.setContentDescription(null);
        }
        q0.LJIJ(c1845990y8b, this.LLJZ);
        c676930Qgt.LIZLLL = c1845990y8b;
        return c676930Qgt;
    }

    public final void LJII() {
        for (int childCount = this.LLILZLL.getChildCount() - 1; -1 < childCount; childCount--) {
            LJIIIIZZ(childCount);
        }
        Iterator<C676930Qgt> it2 = this.LLJILJILJ.iterator();
        while (it2.hasNext()) {
            C676930Qgt next = it2.next();
            it2.remove();
            next.LIZJ = null;
            next.LIZLLL = null;
            next.LIZ = null;
            next.LJ = null;
            next.LIZIZ = -1;
            LLLF.LIZ(next);
        }
        this.LLJILLL = null;
    }

    public final void LJIILIIL() {
        int iLIZIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer num = this.LLILLJJLI;
        if (num == null) {
            iLIZIZ = 0;
        } else {
            int iIntValue = num.intValue() - 20;
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
        }
        int childCount = this.LLILZLL.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = this.LLILZLL.getChildAt(i);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    int i2 = (num == null || i >= childCount + (-1)) ? 0 : iLIZIZ;
                    if (marginLayoutParams.getMarginEnd() != i2) {
                        marginLayoutParams.setMarginEnd(i2);
                        C786410Ut5.W5(childAt, marginLayoutParams);
                    }
                }
            }
            i++;
        }
    }

    public final int getSelectedTabPosition() {
        C676930Qgt c676930Qgt = this.LLJILLL;
        if (c676930Qgt != null) {
            return c676930Qgt.LIZIZ;
        }
        return -1;
    }

    public final int getTabCount() {
        return this.LLJILJILJ.size();
    }

    public final void LJI() {
        int currentItem;
        LJII();
        PagerAdapter pagerAdapter = this.LLJJJJJIL;
        if (pagerAdapter == null) {
            return;
        }
        int count = pagerAdapter.getCount();
        for (int i = 0; i < count; i++) {
            C676930Qgt c676930QgtLJFF = LJFF();
            c676930QgtLJFF.LIZ(pagerAdapter.LJIJJLI(i));
            LIZ(c676930QgtLJFF, this.LLJILJILJ.size(), false);
        }
        ViewPager viewPager = this.LLJJJJ;
        if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
            LJIIJ(LJ(currentItem), true);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getLeftFadingEdgeStrength() {
        if (!(getLayoutDirection() == 1 && this.LLJLIL) && (getLayoutDirection() == 1 || !this.LLJL)) {
            return 0.0f;
        }
        return super.getLeftFadingEdgeStrength();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getRightFadingEdgeStrength() {
        if (!(getLayoutDirection() == 1 && this.LLJL) && (getLayoutDirection() == 1 || !this.LLJLIL)) {
            return 0.0f;
        }
        return super.getRightFadingEdgeStrength();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final boolean getHasEndFadingEdge() {
        return this.LLJLIL;
    }

    public final boolean getHasStartFadingEdge() {
        return this.LLJL;
    }

    public final Drawable getTabSelectedIndicator() {
        return this.LLJJIII;
    }

    public final boolean getUseTextWidth() {
        return this.LLJLILLLLZIIL;
    }

    public final ViewPager getViewPager() {
        return this.LLJJJJ;
    }

    private final void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.LLILZLL.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.LLILZLL.getChildAt(i2);
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

    private final void setTabIndicatorFullWidth(boolean z) {
        this.LLILZLL.LIZ();
        this.LLILZLL.postInvalidateOnAnimation();
    }

    public final void LIZIZ(int i) {
        ValueAnimator valueAnimator;
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            C1846150y8r c1846150y8r = this.LLILZLL;
            int childCount = c1846150y8r.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (c1846150y8r.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iLIZLLL = LIZLLL(i, 0.0f);
            if (scrollX != iLIZLLL) {
                if (this.LLJJJIL == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    valueAnimator2.setInterpolator(C194V.LIZIZ);
                    valueAnimator2.setDuration(this.LLJJIJI);
                    valueAnimator2.addUpdateListener(new AUListenerS275S0100000_27(this, 25));
                    this.LLJJJIL = valueAnimator2;
                }
                ValueAnimator valueAnimator3 = this.LLJJJIL;
                if (valueAnimator3 != null) {
                    valueAnimator3.setIntValues(scrollX, iLIZLLL);
                }
                ValueAnimator valueAnimator4 = this.LLJJJIL;
                if (valueAnimator4 != null) {
                    valueAnimator4.start();
                }
            }
            C1846150y8r c1846150y8r2 = this.LLILZLL;
            int i3 = this.LLJJIJI;
            ValueAnimator valueAnimator5 = c1846150y8r2.LL;
            if (valueAnimator5 != null && valueAnimator5.isRunning() && (valueAnimator = c1846150y8r2.LL) != null) {
                valueAnimator.cancel();
            }
            c1846150y8r2.LIZJ(true, i, i3);
            return;
        }
        LJIIL(i, 0.0f, true, true);
    }

    public final C676930Qgt LJ(int i) {
        if (i >= 0 && i < getTabCount()) {
            return (C676930Qgt) ListProtector.get(this.LLJILJILJ, i);
        }
        return null;
    }

    public final void LJIIIIZZ(int i) {
        C1845990y8b c1845990y8b = (C1845990y8b) this.LLILZLL.getChildAt(i);
        C1846150y8r c1846150y8r = this.LLILZLL;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1846150y8r, null);
        c1846150y8r.removeViewAt(i);
        LJIILIIL();
        c1845990y8b.setTab(null);
        c1845990y8b.setSelected(false);
        this.LLJLL.LIZ(c1845990y8b);
        this.LLJLLIL = true;
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.LLJLLIL = true;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(C20093113jd.LIZIZ(1, getTabCount(), 1, false));
    }

    public final void setFixedTabTextSpacing(Integer num) {
        Integer numValueOf;
        int i;
        if (num != null) {
            int iIntValue = num.intValue();
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            numValueOf = Integer.valueOf(iIntValue);
        } else {
            numValueOf = null;
        }
        if (Intrinsics.LJFF(this.LLILLJJLI, numValueOf)) {
            return;
        }
        this.LLILLJJLI = numValueOf;
        LJIILIIL();
        C1846150y8r c1846150y8r = this.LLILZLL;
        if (this.LLILLJJLI == null) {
            i = 1;
        } else {
            i = 8388611;
        }
        c1846150y8r.setGravity(i);
        LJIIIZ();
        HandlerHook.viewPost(this, new ARunnableS110S0100000_10(this, 23));
    }

    public final void setHasEndFadingEdge(boolean z) {
        this.LLJLIL = z;
        invalidate();
    }

    public final void setHasStartFadingEdge(boolean z) {
        this.LLJL = z;
        invalidate();
    }

    public final void setHorizontalPadding(int i) {
        this.LL = i;
        LIZJ();
    }

    public final void setOnTabClickListener(Function1<? super C676930Qgt, Unit> function1) {
        this.LLJJIJIL = function1;
    }

    public final void setParentMaxWidth(int i) {
        if (i <= 0) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null && layoutParams.width == i) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = i;
        } else {
            layoutParams2 = null;
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams2);
        LJIIIZ();
        HandlerHook.viewPost(this, new ARunnableS110S0100000_10(this, 23));
    }

    public final void setTabSelectedIndicator(Drawable drawable) {
        this.LLJJIII = drawable;
    }

    public final void setUseTextWidth(boolean z) {
        this.LLJLILLLLZIIL = z;
        invalidate();
    }

    public final void setViewPager(ViewPager viewPager) {
        this.LLJJJJ = viewPager;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.0QhE, java.lang.Object] */
    public final void setupWithViewPager(final ViewPager viewPager) {
        ViewPager viewPager2 = this.LLJJJJ;
        if (viewPager2 != null) {
            viewPager2.removeOnPageChangeListener(getPageChangeListener());
            viewPager2.removeOnAdapterChangeListener(getAdapterChangeListener());
        }
        C677140QhE c677140QhE = this.LLJJJ;
        if (c677140QhE != null) {
            this.LLJJIJIIJIL.remove(c677140QhE);
            this.LLJJJ = null;
        }
        if (viewPager != null) {
            this.LLJJJJ = viewPager;
            C677020Qh2 pageChangeListener = getPageChangeListener();
            pageChangeListener.LLILLL = 0;
            pageChangeListener.LLILLJJLI = 0;
            viewPager.addOnPageChangeListener(getPageChangeListener());
            ?? r1 = new InterfaceC1846180y8u(viewPager) { // from class: X.0QhE
                public final ViewPager LIZ;

                @Override // X.InterfaceC1846180y8u
                public final void LIZ() {
                }

                @Override // X.InterfaceC1846180y8u
                public final void LIZIZ() {
                }

                {
                    this.LIZ = viewPager;
                }

                @Override // X.InterfaceC1846180y8u
                public final void LIZJ(C676930Qgt c676930Qgt) {
                    this.LIZ.setCurrentItem(c676930Qgt.LIZIZ);
                }
            };
            this.LLJJJ = r1;
            if (!this.LLJJIJIIJIL.contains(r1)) {
                this.LLJJIJIIJIL.add((InterfaceC1846180y8u) r1);
            }
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                LJIIJJI(adapter, true);
            }
            getAdapterChangeListener().LL = true;
            viewPager.addOnAdapterChangeListener(getAdapterChangeListener());
            LJIIL(viewPager.getCurrentItem(), 0.0f, true, true);
            return;
        }
        this.LLJJJJ = null;
        LJIIJJI(null, false);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* JADX WARN: Type inference failed for: r0v55, types: [X.0y8w] */
    public C1846140y8q(Context context, AttributeSet attributeSet) {
        EnumC094600Xg enumC094600Xg;
        float fFloatValue;
        super(context, attributeSet, R.attr.yx);
        this.LL = 16;
        this.LLILZ = new RectF();
        this.LLILZIL = new RectF();
        this.LLJILJILJ = new ArrayList<>();
        this.LLJJI = true;
        this.LLJJIII = new GradientDrawable();
        this.LLJJIJIIJIL = new ArrayList<>();
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 233));
        this.LLJJL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 111));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 232));
        this.LLJL = true;
        this.LLJLIL = true;
        this.LLJLL = new C1085650eMF(12);
        this.LLJZ = new C1864970ydD(this, 1);
        setHorizontalScrollBarEnabled(false);
        C1846150y8r c1846150y8r = new C1846150y8r(this, context);
        this.LLILZLL = c1846150y8r;
        addView(c1846150y8r, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxTabBar, R.attr.yx, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTabBar__tux_tabBarBackgroundColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTabBar__tux_tabBarIndicatorColor, 0);
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTabBar__tux_tabBarTextColor, 0);
        int color4 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTabBar__tux_tabBarTextSelectColor, 0);
        this.LLJI = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTabBar__tux_tabBarSeparatorColor, 0);
        if (((Number) C107100ar.LIZ.getValue()).intValue() == 1) {
            enumC094600Xg = EnumC094600Xg.FONT_STYLE_1;
        } else {
            enumC094600Xg = EnumC094600Xg.DEFAULT_STYLE;
        }
        if (enumC094600Xg == EnumC094600Xg.FONT_STYLE_1) {
            this.LLJ = 42;
        } else {
            this.LLJ = 32;
        }
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTabBar_tux_tabVariant, 0);
        this.LLJJ = i;
        this.LLJJI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxTabBar_tux_tabShowSeparator, true);
        setHasStartFadingEdge(typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxTabBar_tux_tabHasStartFadingEdge, true));
        setHasEndFadingEdge(typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxTabBar_tux_tabHasEndFadingEdge, true));
        this.LLJLLL = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxTabBar_tux_tabRoleDescription);
        typedArrayObtainStyledAttributes.recycle();
        Float fLJFF = C1308910kAL.LJFF(R.attr.a36, context);
        if (fLJFF != null) {
            fFloatValue = fLJFF.floatValue();
        } else {
            fFloatValue = 0.2f;
        }
        int iLJIIL = C2441009hQ.LJIIL(color3, (int) (fFloatValue * Color.alpha(color3)));
        setBackgroundColor(color);
        this.LLIZLLLIL = new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{color4, iLJIIL, color3});
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
        c384050F3z.LIZ = Integer.valueOf(color2);
        this.LLJJIII = c384050F3z.LIZ(context);
        c1846150y8r.setSelectedIndicatorHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        setTabIndicatorFullWidth(i == 0);
        this.LLJJIJI = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        this.LLIZ = new Object() { // from class: X.0y8w
            public static final /* synthetic */ int LIZ = 0;
        };
        setFadingEdgeLength(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)));
        setHorizontalFadingEdgeEnabled(true);
        LIZJ();
        this.LLJZIJLIL = -1;
        this.LLL = true;
    }

    public final int LIZLLL(int i, float f) {
        View childAt;
        View childAt2 = this.LLILZLL.getChildAt(i);
        int width = 0;
        if (childAt2 == null) {
            return 0;
        }
        int i2 = i + 1;
        if (i2 < this.LLILZLL.getChildCount()) {
            childAt = this.LLILZLL.getChildAt(i2);
        } else {
            childAt = null;
        }
        int width2 = childAt2.getWidth();
        if (childAt != null) {
            width = childAt.getWidth();
        }
        int left = (childAt2.getLeft() + (width2 / 2)) - (getWidth() / 2);
        int i3 = (int) ((width2 + width) * 0.5f * f);
        if (getLayoutDirection() == 0) {
            return left + i3;
        }
        return left - i3;
    }

    public final void LJIIJ(C676930Qgt c676930Qgt, boolean z) {
        int i;
        int size;
        int size2;
        C676930Qgt c676930Qgt2 = this.LLJILLL;
        if (c676930Qgt2 == c676930Qgt) {
            if (c676930Qgt2 != null && c676930Qgt != null) {
                int size3 = this.LLJJIJIIJIL.size() - 1;
                if (size3 >= 0) {
                    while (true) {
                        int i2 = size3 - 1;
                        InterfaceC1846180y8u interfaceC1846180y8u = (InterfaceC1846180y8u) ListProtector.get(this.LLJJIJIIJIL, size3);
                        if (interfaceC1846180y8u != null) {
                            interfaceC1846180y8u.LIZ();
                        }
                        if (i2 < 0) {
                            break;
                        } else {
                            size3 = i2;
                        }
                    }
                }
                LIZIZ(c676930Qgt.LIZIZ);
                return;
            }
            return;
        }
        if (c676930Qgt != null) {
            i = c676930Qgt.LIZIZ;
        } else {
            i = -1;
        }
        if (z) {
            if ((c676930Qgt2 == null || c676930Qgt2.LIZIZ == -1) && i != -1) {
                LJIIL(i, 0.0f, true, true);
            } else {
                LIZIZ(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.LLJILLL = c676930Qgt;
        if (c676930Qgt2 != null && this.LLJJIJIIJIL.size() - 1 >= 0) {
            while (true) {
                int i3 = size2 - 1;
                InterfaceC1846180y8u interfaceC1846180y8u2 = (InterfaceC1846180y8u) ListProtector.get(this.LLJJIJIIJIL, size2);
                if (interfaceC1846180y8u2 != null) {
                    interfaceC1846180y8u2.LIZIZ();
                }
                if (i3 < 0) {
                    break;
                } else {
                    size2 = i3;
                }
            }
        }
        if (c676930Qgt == null || this.LLJJIJIIJIL.size() - 1 < 0) {
            return;
        }
        while (true) {
            int i4 = size - 1;
            InterfaceC1846180y8u interfaceC1846180y8u3 = (InterfaceC1846180y8u) ListProtector.get(this.LLJJIJIIJIL, size);
            if (interfaceC1846180y8u3 != null) {
                interfaceC1846180y8u3.LIZJ(c676930Qgt);
            }
            if (i4 >= 0) {
                size = i4;
            } else {
                return;
            }
        }
    }

    public final void LJIIJJI(PagerAdapter pagerAdapter, boolean z) {
        PagerAdapter pagerAdapter2 = this.LLJJJJJIL;
        if (pagerAdapter2 != null) {
            pagerAdapter2.LJJIJIIJIL(getPagerAdapterObserver());
        }
        this.LLJJJJJIL = pagerAdapter;
        if (z && pagerAdapter != null) {
            pagerAdapter.LJJII(getPagerAdapterObserver());
        }
        LJI();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View childAt;
        Integer numValueOf;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(iLIZIZ + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= iLIZIZ) {
            getChildAt(0).setMinimumHeight(iLIZIZ);
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt2 = getChildAt(0);
            if (childAt2.getMeasuredWidth() < getMeasuredWidth()) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt2.getLayoutParams().height));
            }
        }
        if (this.LLL && (childAt = getChildAt(0)) != null && (numValueOf = Integer.valueOf(childAt.getMeasuredWidth())) != null) {
            if (numValueOf.intValue() != this.LLJZIJLIL) {
                int iIntValue = numValueOf.intValue();
                this.LLJZIJLIL = iIntValue;
                if (iIntValue > getMeasuredWidth() && getLayoutDirection() == 1 && isLaidOut()) {
                    this.LLL = false;
                    HandlerHook.viewPost(this, new ARunnableS127S0100000_27(this, 15));
                }
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ(C676930Qgt c676930Qgt, int i, boolean z) {
        C1846140y8q c1846140y8q;
        if (c676930Qgt.LIZJ == this) {
            this.LLJLLIL = true;
            c676930Qgt.LIZIZ = i;
            ListProtector.add(this.LLJILJILJ, i, c676930Qgt);
            int size = this.LLJILJILJ.size();
            while (true) {
                i++;
                if (i >= size) {
                    break;
                } else {
                    ((C676930Qgt) ListProtector.get(this.LLJILJILJ, i)).LIZIZ = i;
                }
            }
            C1845990y8b c1845990y8b = c676930Qgt.LIZLLL;
            if (c1845990y8b != null) {
                c1845990y8b.setSelected(false);
                c1845990y8b.setActivated(false);
                C1846150y8r c1846150y8r = this.LLILZLL;
                int i2 = c676930Qgt.LIZIZ;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                layoutParams.weight = 0.0f;
                c1846150y8r.addView(c1845990y8b, i2, layoutParams);
                LJIILIIL();
            }
            if (z && (c1846140y8q = c676930Qgt.LIZJ) != null) {
                c1846140y8q.LJIIJ(c676930Qgt, true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void LJIIL(int i, float f, boolean z, boolean z2) {
        int iLIZLLL;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        int iLIZIZ = C814420VxA.LIZIZ(i + f);
        if (iLIZIZ >= 0 && iLIZIZ < this.LLILZLL.getChildCount()) {
            if (z2) {
                C1846150y8r c1846150y8r = this.LLILZLL;
                ValueAnimator valueAnimator3 = c1846150y8r.LL;
                if (valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator2 = c1846150y8r.LL) != null) {
                    valueAnimator2.cancel();
                }
                c1846150y8r.LLILLJJLI = i;
                c1846150y8r.LLILLL = f;
                c1846150y8r.LIZIZ(c1846150y8r.getChildAt(i), c1846150y8r.getChildAt(c1846150y8r.LLILLJJLI + 1), c1846150y8r.LLILLL);
            }
            ValueAnimator valueAnimator4 = this.LLJJJIL;
            if (valueAnimator4 != null && valueAnimator4.isRunning() && (valueAnimator = this.LLJJJIL) != null) {
                valueAnimator.cancel();
            }
            if (i < 0) {
                iLIZLLL = 0;
            } else {
                iLIZLLL = LIZLLL(i, f);
            }
            scrollTo(iLIZLLL, 0);
            if (z) {
                setSelectedTabView(iLIZIZ);
            }
        }
    }
}
