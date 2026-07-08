package X;

import Y.ARunnableS122S0100000_22;
import Y.AUListenerS275S0100000_27;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
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
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import u4.q0;

/* JADX INFO: renamed from: X.0y8y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846220y8y extends HorizontalScrollView {
    public static final C1085640eME LLJZ = new C1085640eME(16);
    public final C1846240y90 LL;
    public final C1846290y95 LLILLJJLI;
    public final ColorStateList LLILLL;
    public int LLILZ;
    public final int LLILZIL;
    public final ArrayList<C1425810nCt> LLILZLL;
    public C1425810nCt LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public Drawable LLJIJIL;
    public final int LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public final ArrayList<InterfaceC1846270y93> LLJJ;
    public C1425390nCD LLJJI;
    public ValueAnimator LLJJIII;
    public ViewPager LLJJIJI;
    public PagerAdapter LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public Function0<Unit> LLJJJJ;
    public boolean LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public int LLJJL;
    public final C1085650eMF LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public final String LLJLIL;
    public final C20094413jq LLJLILLLLZIIL;
    public final Set<String> LLJLL;
    public final Set<String> LLJLLIL;
    public Function1<? super String, Unit> LLJLLL;

    public final void LJIIJ() {
        this.LLJL = true;
        requestLayout();
        invalidate();
        if (getLayoutDirection() == 1) {
            HandlerHook.viewPost(this, new ARunnableS122S0100000_22(this, 33));
        }
    }

    public final void setupWithViewPager(ViewPager viewPager) {
        LJIILLIIL(this, viewPager);
    }

    private final C1846260y92 getAdapterChangeListener() {
        return (C1846260y92) this.LLJJJIL.getValue();
    }

    private final C1425200nBu getPageChangeListener() {
        return (C1425200nBu) this.LLJJJ.getValue();
    }

    private final C1846280y94 getPagerAdapterObserver() {
        return (C1846280y94) this.LLJJIJIL.getValue();
    }

    private final int getTabScrollRange() {
        return Math.max(0, ((this.LL.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public final void LIZLLL() {
        if (this.LLJ == 1) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            C426750GoL.LJIIL(this.LL, Integer.valueOf(iLIZIZ), null, Integer.valueOf(iLIZIZ), null, 26);
            C1846290y95 c1846290y95 = this.LLILLJJLI;
            if (c1846290y95 != null) {
                c1846290y95.LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            }
            this.LL.setGravity(8388611);
        } else {
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            C426750GoL.LJIIL(this.LL, Integer.valueOf(iLIZIZ2), null, Integer.valueOf(iLIZIZ2), null, 26);
            C1846290y95 c1846290y952 = this.LLILLJJLI;
            if (c1846290y952 != null) {
                c1846290y952.LIZ = 0;
            }
            this.LL.setGravity(1);
        }
        LJIIZILJ();
    }

    public final void LJFF() {
        if (this.LLJLL.isEmpty()) {
            return;
        }
        Rect rect = new Rect();
        if (getGlobalVisibleRect(rect)) {
            Iterator<String> it2 = this.LLJLL.iterator();
            while (it2.hasNext()) {
                String next = it2.next();
                int size = this.LLILZLL.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (Intrinsics.LJFF(((C1425810nCt) ListProtector.get(this.LLILZLL, i)).LIZ, next)) {
                        View childAt = this.LL.getChildAt(i);
                        if (childAt != null) {
                            Rect rect2 = new Rect();
                            if (childAt.getGlobalVisibleRect(rect2) && Rect.intersects(rect, rect2)) {
                                it2.remove();
                                this.LLJLLIL.add(next);
                                Function1<? super String, Unit> function1 = this.LLJLLL;
                                if (function1 != null) {
                                    function1.invoke(next);
                                }
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    public final void LJI() {
        if (this.LLJJIII == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setInterpolator(C194V.LIZIZ);
            valueAnimator.setDuration(this.LLJILJIL);
            valueAnimator.addUpdateListener(new AUListenerS275S0100000_27(this, 10));
            this.LLJJIII = valueAnimator;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1425810nCt LJIIIIZZ() {
        C1425810nCt c1425810nCt = (C1425810nCt) LLJZ.LIZIZ();
        if (c1425810nCt == null) {
            c1425810nCt = new C1425810nCt();
        }
        c1425810nCt.LJIIIIZZ = this;
        C1846230y8z c1846230y8z = (C1846230y8z) this.LLJJLIIIJLLLLLLLZ.LIZIZ();
        if (c1846230y8z == null) {
            c1846230y8z = new C1846230y8z(this, getContext());
        }
        c1846230y8z.setTab(c1425810nCt);
        c1846230y8z.setFocusable(true);
        if (TextUtils.isEmpty(null)) {
            c1846230y8z.setContentDescription(c1425810nCt.LJ);
        } else {
            c1846230y8z.setContentDescription(null);
        }
        int i = C20094413jq.LJIIZILJ;
        q0.LJIJ(c1846230y8z, this.LLJLILLLLZIIL);
        c1425810nCt.LJIIIZ = c1846230y8z;
        return c1425810nCt;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public final void LJIIIZ() {
        int currentItem;
        Function0<Unit> function0 = this.LLJJJJ;
        if (function0 != null) {
            function0.invoke();
            return;
        }
        LJIIJJI();
        PagerAdapter pagerAdapter = this.LLJJIJIIJIL;
        if (pagerAdapter == 0) {
            return;
        }
        int count = pagerAdapter.getCount();
        int i = this.LLIZLLLIL;
        if (i == 1) {
            if (pagerAdapter instanceof InterfaceC1846300y96) {
                for (int i2 = 0; i2 < count; i2++) {
                    C1425810nCt c1425810nCtLJIIIIZZ = LJIIIIZZ();
                    c1425810nCtLJIIIIZZ.LJ(((InterfaceC1846300y96) pagerAdapter).LIZ(), null, null);
                    LIZIZ(this, c1425810nCtLJIIIIZZ, 2);
                }
            }
        } else if (i == 0) {
            for (int i3 = 0; i3 < count; i3++) {
                C1425810nCt c1425810nCtLJIIIIZZ2 = LJIIIIZZ();
                c1425810nCtLJIIIIZZ2.LJFF(pagerAdapter.LJIJJLI(i3));
                LIZIZ(this, c1425810nCtLJIIIIZZ2, 2);
            }
        }
        ViewPager viewPager = this.LLJJIJI;
        if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
            LJIIL(LJII(currentItem), true, false);
        }
    }

    public final void LJIIJJI() {
        for (int childCount = this.LL.getChildCount() - 1; -1 < childCount; childCount--) {
            C1846230y8z c1846230y8z = (C1846230y8z) this.LL.getChildAt(childCount);
            C1846240y90 c1846240y90 = this.LL;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1846240y90, null);
            c1846240y90.removeViewAt(childCount);
            c1846230y8z.setTab(null);
            c1846230y8z.setSelected(false);
            this.LLJJLIIIJLLLLLLLZ.LIZ(c1846230y8z);
            this.LLJL = true;
            requestLayout();
        }
        Iterator<C1425810nCt> it2 = this.LLILZLL.iterator();
        while (it2.hasNext()) {
            C1425810nCt next = it2.next();
            it2.remove();
            C1846220y8y c1846220y8y = next.LJIIIIZZ;
            if (c1846220y8y != null) {
                c1846220y8y.LLJJ.remove(next);
            }
            next.LJIIIIZZ = null;
            next.LJIIIZ = null;
            next.LIZ = null;
            next.LIZIZ = null;
            next.LJFF = null;
            next.LJ = null;
            next.LJI = -1;
            LLJZ.LIZ(next);
        }
        this.LLIZ = null;
        this.LLJLL.clear();
        this.LLJLLIL.clear();
        this.LLJLLL = null;
    }

    public final void LJIIZILJ() {
        int childCount = this.LL.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.LL.getChildAt(i).requestLayout();
        }
    }

    public final int getSelectedTabPosition() {
        C1425810nCt c1425810nCt = this.LLIZ;
        if (c1425810nCt != null) {
            return c1425810nCt.LJI;
        }
        return -1;
    }

    public final int getTabCount() {
        return this.LLILZLL.size();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getLeftFadingEdgeStrength() {
        if (!(getLayoutDirection() == 1 && this.LLJJJJLIIL) && (getLayoutDirection() == 1 || !this.LLJJJJJIL)) {
            return 0.0f;
        }
        return super.getLeftFadingEdgeStrength();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getRightFadingEdgeStrength() {
        if (!(getLayoutDirection() == 1 && this.LLJJJJJIL) && (getLayoutDirection() == 1 || !this.LLJJJJLIIL)) {
            return 0.0f;
        }
        return super.getRightFadingEdgeStrength();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final int getFixedIndicatorWidthDp() {
        return this.LLJJL;
    }

    public final boolean getHasEndFadingEdge() {
        return this.LLJJJJLIIL;
    }

    public final boolean getHasStartFadingEdge() {
        return this.LLJJJJJIL;
    }

    public final Function0<Unit> getOnPopulateFromPagerAdapter() {
        return this.LLJJJJ;
    }

    public final Drawable getTabSelectedIndicator() {
        return this.LLJIJIL;
    }

    public final ViewPager getViewPager() {
        return this.LLJJIJI;
    }

    private final void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.LL.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.LL.getChildAt(i2);
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
        this.LLJILJILJ = z;
        this.LL.LIZ();
        this.LL.postInvalidateOnAnimation();
    }

    public final void LIZ(InterfaceC1846270y93 interfaceC1846270y93) {
        if (!this.LLJJ.contains(interfaceC1846270y93)) {
            this.LLJJ.add(interfaceC1846270y93);
        }
    }

    public final void LIZJ(int i) {
        ValueAnimator valueAnimator;
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            C1846240y90 c1846240y90 = this.LL;
            int childCount = c1846240y90.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (c1846240y90.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iLJ = LJ(i, 0.0f);
            if (scrollX != iLJ) {
                LJI();
                ValueAnimator valueAnimator2 = this.LLJJIII;
                if (valueAnimator2 != null) {
                    valueAnimator2.setIntValues(scrollX, iLJ);
                }
                ValueAnimator valueAnimator3 = this.LLJJIII;
                if (valueAnimator3 != null) {
                    valueAnimator3.start();
                }
            }
            C1846240y90 c1846240y902 = this.LL;
            int i3 = this.LLJILJIL;
            ValueAnimator valueAnimator4 = c1846240y902.LL;
            if (valueAnimator4 != null && valueAnimator4.isRunning() && (valueAnimator = c1846240y902.LL) != null) {
                valueAnimator.cancel();
            }
            c1846240y902.LIZJ(true, i, i3);
            return;
        }
        LJIILL(i, 0.0f, true, true);
    }

    public final C1425810nCt LJII(int i) {
        if (i >= 0 && i < getTabCount()) {
            return (C1425810nCt) ListProtector.get(this.LLILZLL, i);
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.LLJL = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(C20093113jd.LIZIZ(1, getTabCount(), 1, false));
    }

    public final void setEditTabType(int i) {
        this.LLILZ = i;
        this.LLJILLL = true;
        C426750GoL.LJIIL(this.LL, 0, null, 0, null, 26);
        this.LLJI = false;
        this.LL.invalidate();
    }

    public final void setFixedIndicatorWidthDp(int i) {
        this.LLJJL = i;
        invalidate();
    }

    public final void setHasEndFadingEdge(boolean z) {
        this.LLJJJJLIIL = z;
        invalidate();
    }

    public final void setHasStartFadingEdge(boolean z) {
        this.LLJJJJJIL = z;
        invalidate();
    }

    public final void setIsTabIndicatorFullWidth(boolean z) {
        this.LLJILJILJ = z;
        invalidate();
    }

    public final void setLayoutVariant(int i) {
        if (this.LLJ != i) {
            this.LLJ = i;
            this.LLJL = true;
            LIZLLL();
            requestLayout();
            invalidate();
        }
    }

    public final void setOnPopulateFromPagerAdapter(Function0<Unit> function0) {
        this.LLJJJJ = function0;
    }

    public final void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        LJI();
        ValueAnimator valueAnimator = this.LLJJIII;
        if (valueAnimator != null) {
            valueAnimator.addListener(animatorListener);
        }
    }

    public final void setTabExposureListener(Function1<? super String, Unit> function1) {
        this.LLJLLL = function1;
    }

    public final void setTabSelectedIndicator(Drawable drawable) {
        this.LLJIJIL = drawable;
    }

    public final void setTabVariant(int i) {
        boolean z;
        this.LLIZLLLIL = i;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        setTabIndicatorFullWidth(z);
        requestLayout();
        invalidate();
    }

    public final void setViewPager(ViewPager viewPager) {
        this.LLJJIJI = viewPager;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public C1846220y8y(Context context, AttributeSet attributeSet) {
        float fFloatValue;
        super(context, attributeSet, R.attr.yx);
        this.LLILZLL = new ArrayList<>();
        this.LLJI = true;
        this.LLJIJIL = new GradientDrawable();
        this.LLJJ = new ArrayList<>();
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 625));
        this.LLJJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 280));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 624));
        this.LLJJJJJIL = true;
        this.LLJJJJLIIL = true;
        this.LLJJL = -1;
        this.LLJJLIIIJLLLLLLLZ = new C1085650eMF(12);
        C1397760mTe c1397760mTe = new C1397760mTe();
        c1397760mTe.LJIIIZ = new AwS606S0100000_27(this, 33);
        this.LLJLILLLLZIIL = c1397760mTe.LIZ();
        setHorizontalScrollBarEnabled(false);
        C1846240y90 c1846240y90 = new C1846240y90(this, context);
        this.LL = c1846240y90;
        addView(c1846240y90, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxTabBar, R.attr.yx, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTabBar__tux_tabBarBackgroundColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTabBar__tux_tabBarIndicatorColor, 0);
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTabBar__tux_tabBarTextColor, 0);
        int color4 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTabBar__tux_tabBarTextSelectColor, 0);
        this.LLILZIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTabBar__tux_tabBarSeparatorColor, 0);
        this.LLILZ = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTabBar__tux_tabBarTextFont, 0);
        this.LLIZLLLIL = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTabBar_tux_tabVariant, 0);
        this.LLJ = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxTabBar_tux_tabLayoutVariant, 0);
        this.LLJI = typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxTabBar_tux_tabShowSeparator, true);
        setHasStartFadingEdge(typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxTabBar_tux_tabHasStartFadingEdge, true));
        setHasEndFadingEdge(typedArrayObtainStyledAttributes.getBoolean(R$styleable.TuxTabBar_tux_tabHasEndFadingEdge, true));
        this.LLJLIL = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxTabBar_tux_tabRoleDescription);
        typedArrayObtainStyledAttributes.recycle();
        Float fLJFF = C1308910kAL.LJFF(R.attr.a36, context);
        if (fLJFF != null) {
            fFloatValue = fLJFF.floatValue();
        } else {
            fFloatValue = 0.2f;
        }
        int iLJIIL = C2441009hQ.LJIIL(color3, (int) (fFloatValue * Color.alpha(color3)));
        setBackgroundColor(color);
        this.LLILLL = new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{color4, iLJIIL, color3});
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
        c384050F3z.LIZ = Integer.valueOf(color2);
        this.LLJIJIL = c384050F3z.LIZ(context);
        c1846240y90.setSelectedIndicatorHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        setTabIndicatorFullWidth(this.LLIZLLLIL == 0);
        this.LLJILJIL = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        this.LLILLJJLI = new C1846290y95();
        setFadingEdgeLength(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)));
        setHorizontalFadingEdgeEnabled(true);
        LIZLLL();
        this.LLJLL = new LinkedHashSet();
        this.LLJLLIL = new LinkedHashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0nCD, X.0y93] */
    public static void LJIILLIIL(C1846220y8y c1846220y8y, final ViewPager viewPager) {
        ViewPager viewPager2 = c1846220y8y.LLJJIJI;
        if (viewPager2 != null) {
            viewPager2.removeOnPageChangeListener(c1846220y8y.getPageChangeListener());
            viewPager2.removeOnAdapterChangeListener(c1846220y8y.getAdapterChangeListener());
        }
        C1425390nCD c1425390nCD = c1846220y8y.LLJJI;
        if (c1425390nCD != null) {
            c1846220y8y.LLJJ.remove(c1425390nCD);
            c1846220y8y.LLJJI = null;
        }
        if (viewPager != null) {
            c1846220y8y.LLJJIJI = viewPager;
            C1425200nBu pageChangeListener = c1846220y8y.getPageChangeListener();
            pageChangeListener.LLILLL = 0;
            pageChangeListener.LLILLJJLI = 0;
            viewPager.addOnPageChangeListener(c1846220y8y.getPageChangeListener());
            ?? r0 = new InterfaceC1846270y93(viewPager) { // from class: X.0nCD
                public final ViewPager LIZ;

                @Override // X.InterfaceC1846270y93
                public final void LIZ() {
                }

                @Override // X.InterfaceC1846270y93
                public final void LIZIZ() {
                }

                {
                    this.LIZ = viewPager;
                }

                @Override // X.InterfaceC1846270y93
                public final void LIZJ(C1425810nCt c1425810nCt) {
                    this.LIZ.setCurrentItem(c1425810nCt.LJI);
                }
            };
            c1846220y8y.LLJJI = r0;
            c1846220y8y.LIZ(r0);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                c1846220y8y.LJIILJJIL(adapter, true);
            }
            c1846220y8y.getAdapterChangeListener().LL = true;
            viewPager.addOnAdapterChangeListener(c1846220y8y.getAdapterChangeListener());
            c1846220y8y.LJIILL(viewPager.getCurrentItem(), 0.0f, true, true);
            return;
        }
        c1846220y8y.LLJJIJI = null;
        c1846220y8y.LJIILJJIL(null, false);
    }

    public final int LJ(int i, float f) {
        View childAt;
        View childAt2 = this.LL.getChildAt(i);
        int width = 0;
        if (childAt2 == null) {
            return 0;
        }
        int i2 = i + 1;
        if (i2 < this.LL.getChildCount()) {
            childAt = this.LL.getChildAt(i2);
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

    public final void LJIILJJIL(PagerAdapter pagerAdapter, boolean z) {
        PagerAdapter pagerAdapter2 = this.LLJJIJIIJIL;
        if (pagerAdapter2 != null) {
            pagerAdapter2.LJJIJIIJIL(getPagerAdapterObserver());
        }
        this.LLJJIJIIJIL = pagerAdapter;
        if (z && pagerAdapter != null) {
            pagerAdapter.LJJII(getPagerAdapterObserver());
        }
        LJIIIZ();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
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
            View childAt = getChildAt(0);
            if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
        if (this.LLIZLLLIL == 1) {
            View childAt2 = getChildAt(0);
            if (childAt2.getMeasuredWidth() >= getMeasuredWidth() - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), i2);
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
    public static void LIZIZ(C1846220y8y c1846220y8y, C1425810nCt c1425810nCt, int i) {
        int size;
        boolean zIsEmpty;
        C1846220y8y c1846220y8y2;
        if ((i & 2) != 0) {
            size = c1846220y8y.LLILZLL.size();
        } else {
            size = 0;
        }
        if ((i & 4) != 0) {
            zIsEmpty = c1846220y8y.LLILZLL.isEmpty();
        } else {
            zIsEmpty = false;
        }
        c1846220y8y.getClass();
        if (c1425810nCt.LJIIIIZZ == c1846220y8y) {
            c1846220y8y.LLJL = true;
            c1425810nCt.LJI = size;
            ListProtector.add(c1846220y8y.LLILZLL, size, c1425810nCt);
            int size2 = c1846220y8y.LLILZLL.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                } else {
                    ((C1425810nCt) ListProtector.get(c1846220y8y.LLILZLL, size)).LJI = size;
                }
            }
            C1846230y8z c1846230y8z = c1425810nCt.LJIIIZ;
            if (c1846230y8z != null) {
                c1846230y8z.setSelected(false);
                c1846230y8z.setActivated(false);
                C1846240y90 c1846240y90 = c1846220y8y.LL;
                int i2 = c1425810nCt.LJI;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                layoutParams.weight = 0.0f;
                c1846240y90.addView(c1846230y8z, i2, layoutParams);
            }
            if (zIsEmpty && (c1846220y8y2 = c1425810nCt.LJIIIIZZ) != null) {
                c1846220y8y2.LJIIL(c1425810nCt, true, false);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d A[LOOP:1: B:27:0x004c->B:31:0x005d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0068 A[EDGE_INSN: B:47:0x0068->B:36:0x0068 BREAK  A[LOOP:1: B:27:0x004c->B:31:0x005d], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(X.C1425810nCt r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            X.0nCt r4 = r5.LLIZ
            r3 = -1
            if (r4 != r6) goto L26
            if (r4 == 0) goto L8c
            if (r6 == 0) goto L8c
            java.util.ArrayList<X.0y93> r0 = r5.LLJJ
            int r0 = r0.size()
            int r2 = r0 + (-1)
            if (r2 < 0) goto L87
        L13:
            int r1 = r2 + (-1)
            java.util.ArrayList<X.0y93> r0 = r5.LLJJ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            X.0y93 r0 = (X.InterfaceC1846270y93) r0
            if (r0 == 0) goto L22
            r0.LIZ()
        L22:
            if (r1 < 0) goto L87
            r2 = r1
            goto L13
        L26:
            if (r6 == 0) goto L66
            int r2 = r6.LJI
        L2a:
            if (r7 == 0) goto L63
            if (r4 == 0) goto L32
            int r0 = r4.LJI
            if (r0 != r3) goto L5f
        L32:
            if (r2 == r3) goto L5f
            r1 = 0
            r0 = 1
            r5.LJIILL(r2, r1, r0, r0)
        L39:
            if (r2 == r3) goto L3e
            r5.setSelectedTabView(r2)
        L3e:
            r5.LLIZ = r6
            if (r4 == 0) goto L68
            java.util.ArrayList<X.0y93> r0 = r5.LLJJ
            int r0 = r0.size()
            int r2 = r0 + (-1)
            if (r2 < 0) goto L68
        L4c:
            int r1 = r2 + (-1)
            java.util.ArrayList<X.0y93> r0 = r5.LLJJ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            X.0y93 r0 = (X.InterfaceC1846270y93) r0
            if (r0 == 0) goto L5b
            r0.LIZIZ()
        L5b:
            if (r1 < 0) goto L68
            r2 = r1
            goto L4c
        L5f:
            r5.LIZJ(r2)
            goto L39
        L63:
            if (r8 == 0) goto L3e
            goto L39
        L66:
            r2 = -1
            goto L2a
        L68:
            if (r6 == 0) goto L8c
            java.util.ArrayList<X.0y93> r0 = r5.LLJJ
            int r0 = r0.size()
            int r2 = r0 + (-1)
            if (r2 < 0) goto L8c
        L74:
            int r1 = r2 + (-1)
            java.util.ArrayList<X.0y93> r0 = r5.LLJJ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r2)
            X.0y93 r0 = (X.InterfaceC1846270y93) r0
            if (r0 == 0) goto L83
            r0.LIZJ(r6)
        L83:
            if (r1 < 0) goto L8c
            r2 = r1
            goto L74
        L87:
            int r0 = r6.LJI
            r5.LIZJ(r0)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1846220y8y.LJIIL(X.0nCt, boolean, boolean):void");
    }

    public final void LJIILL(int i, float f, boolean z, boolean z2) {
        int iLJ;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        int iLIZIZ = C814420VxA.LIZIZ(i + f);
        if (iLIZIZ >= 0 && iLIZIZ < this.LL.getChildCount()) {
            if (z2) {
                C1846240y90 c1846240y90 = this.LL;
                ValueAnimator valueAnimator3 = c1846240y90.LL;
                if (valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator2 = c1846240y90.LL) != null) {
                    valueAnimator2.cancel();
                }
                c1846240y90.LLILLJJLI = i;
                c1846240y90.LLILLL = f;
                c1846240y90.LIZIZ(c1846240y90.getChildAt(i), c1846240y90.getChildAt(c1846240y90.LLILLJJLI + 1), c1846240y90.LLILLL);
            }
            ValueAnimator valueAnimator4 = this.LLJJIII;
            if (valueAnimator4 != null && valueAnimator4.isRunning() && (valueAnimator = this.LLJJIII) != null) {
                valueAnimator.cancel();
            }
            if (i < 0) {
                iLJ = 0;
            } else {
                iLJ = LJ(i, f);
            }
            scrollTo(iLJ, 0);
            if (z) {
                setSelectedTabView(iLIZIZ);
            }
        }
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (!this.LLJLL.isEmpty()) {
            LJFF();
        }
    }
}
