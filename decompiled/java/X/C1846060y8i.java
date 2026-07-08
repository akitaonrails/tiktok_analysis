package X;

import Y.AUListenerS275S0100000_27;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
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
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import u4.q0;

/* JADX INFO: renamed from: X.0y8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846060y8i extends HorizontalScrollView {
    public static final C1085640eME LLJL = new C1085640eME(16);
    public final C1846070y8j LL;
    public final C1840210xzH LLILLJJLI;
    public ColorStateList LLILLL;
    public final int LLILZ;
    public int LLILZIL;
    public final ArrayList<C1845940y8W> LLILZLL;
    public C1845940y8W LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public Drawable LLJIJIL;
    public final int LLJILJIL;
    public boolean LLJILJILJ;
    public final ArrayList<InterfaceC1846110y8n> LLJILLL;
    public C1812000xFm LLJJ;
    public ValueAnimator LLJJI;
    public ViewPager LLJJIII;
    public PagerAdapter LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public final C1085650eMF LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final String LLJJL;
    public final C20094413jq LLJJLIIIJLLLLLLLZ;

    public C1846060y8i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void setupWithViewPager(ViewPager viewPager) {
        LJIJI(this, viewPager);
    }

    private final C1846080y8k getAdapterChangeListener() {
        return (C1846080y8k) this.LLJJJ.getValue();
    }

    private final C1194910hCT getPageChangeListener() {
        return (C1194910hCT) this.LLJJIJIL.getValue();
    }

    private final C1846100y8m getPagerAdapterObserver() {
        return (C1846100y8m) this.LLJJIJIIJIL.getValue();
    }

    private final int getTabScrollRange() {
        return Math.max(0, ((this.LL.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public final void LJ() {
        if (this.LLJ == 1) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
            C426750GoL.LJIIL(this.LL, Integer.valueOf(iLIZIZ), null, Integer.valueOf(iLIZIZ), null, 26);
            C1840210xzH c1840210xzH = this.LLILLJJLI;
            if (c1840210xzH != null) {
                c1840210xzH.LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            }
            this.LL.setGravity(8388611);
        } else {
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            C426750GoL.LJIIL(this.LL, Integer.valueOf(iLIZIZ2), null, Integer.valueOf(iLIZIZ2), null, 26);
            C1840210xzH c1840210xzH2 = this.LLILLJJLI;
            if (c1840210xzH2 != null) {
                c1840210xzH2.LIZ = 0;
            }
            this.LL.setGravity(1);
        }
        int childCount = this.LL.getChildCount();
        for (int i = 0; i < childCount; i++) {
            this.LL.getChildAt(i).requestLayout();
        }
    }

    public final void LJI() {
        if (this.LLJJI == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setInterpolator(new C12DM());
            valueAnimator.setDuration(this.LLJILJIL);
            valueAnimator.addUpdateListener(new AUListenerS275S0100000_27(this, 2));
            this.LLJJI = valueAnimator;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1845940y8W LJIIIZ() {
        C1845940y8W c1845940y8W = (C1845940y8W) LLJL.LIZIZ();
        if (c1845940y8W == null) {
            c1845940y8W = new C1845940y8W();
        }
        c1845940y8W.LJ = this;
        C1845930y8V c1845930y8V = (C1845930y8V) this.LLJJJJJIL.LIZIZ();
        if (c1845930y8V == null) {
            c1845930y8V = new C1845930y8V(this, getContext());
        }
        c1845930y8V.setTab(c1845940y8W);
        c1845930y8V.setFocusable(true);
        c1845930y8V.setClipChildren(false);
        c1845930y8V.setClipToPadding(false);
        if (TextUtils.isEmpty(null)) {
            c1845930y8V.setContentDescription(c1845940y8W.LIZJ);
        } else {
            c1845930y8V.setContentDescription(null);
        }
        int i = C20094413jq.LJIIZILJ;
        q0.LJIJ(c1845930y8V, this.LLJJLIIIJLLLLLLLZ);
        c1845940y8W.LJFF = c1845930y8V;
        return c1845940y8W;
    }

    public final void LJIIJJI() {
        for (int childCount = this.LL.getChildCount() - 1; -1 < childCount; childCount--) {
            LJIILJJIL(childCount);
        }
        Iterator<C1845940y8W> it2 = this.LLILZLL.iterator();
        while (it2.hasNext()) {
            C1845940y8W next = it2.next();
            it2.remove();
            next.LJ = null;
            next.LJFF = null;
            next.LIZ = null;
            next.LIZIZ = null;
            next.LIZJ = null;
            next.LIZLLL = -1;
            LLJL.LIZ(next);
        }
        this.LLIZ = null;
    }

    public final int getSelectedTabPosition() {
        C1845940y8W c1845940y8W = this.LLIZ;
        if (c1845940y8W != null) {
            return c1845940y8W.LIZLLL;
        }
        return -1;
    }

    public final int getTabCount() {
        return this.LLILZLL.size();
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
    public final void LJIIJ() {
        int currentItem;
        LJIIJJI();
        PagerAdapter pagerAdapter = this.LLJJIJI;
        if (pagerAdapter == 0) {
            return;
        }
        int count = pagerAdapter.getCount();
        int i = this.LLIZLLLIL;
        if (i == 1) {
            if (pagerAdapter instanceof InterfaceC1846120y8o) {
                for (int i2 = 0; i2 < count; i2++) {
                    C1845940y8W c1845940y8WLJIIIZ = LJIIIZ();
                    c1845940y8WLJIIIZ.LIZIZ = Integer.valueOf(((InterfaceC1846120y8o) pagerAdapter).LIZ());
                    C1846060y8i c1846060y8i = c1845940y8WLJIIIZ.LJ;
                    if (c1846060y8i != null) {
                        int childCount = c1846060y8i.LL.getChildCount();
                        for (int i3 = 0; i3 < childCount; i3++) {
                            c1846060y8i.LL.getChildAt(i3).requestLayout();
                        }
                    }
                    C1845930y8V c1845930y8V = c1845940y8WLJIIIZ.LJFF;
                    if (c1845930y8V != null) {
                        c1845930y8V.LIZ();
                    }
                    LIZIZ(c1845940y8WLJIIIZ, this.LLILZLL.size(), false);
                }
            }
        } else if (i == 0) {
            for (int i4 = 0; i4 < count; i4++) {
                C1845940y8W c1845940y8WLJIIIZ2 = LJIIIZ();
                c1845940y8WLJIIIZ2.LIZIZ(pagerAdapter.LJIJJLI(i4));
                LIZIZ(c1845940y8WLJIIIZ2, this.LLILZLL.size(), false);
            }
        }
        ViewPager viewPager = this.LLJJIII;
        if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
            LJIILL(LJII(currentItem), true);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getLeftFadingEdgeStrength() {
        if (!(getLayoutDirection() == 1 && this.LLJJJJ) && (getLayoutDirection() == 1 || !this.LLJJJIL)) {
            return 0.0f;
        }
        return super.getLeftFadingEdgeStrength();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getRightFadingEdgeStrength() {
        if (!(getLayoutDirection() == 1 && this.LLJJJIL) && (getLayoutDirection() == 1 || !this.LLJJJJ)) {
            return 0.0f;
        }
        return super.getRightFadingEdgeStrength();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final boolean getHasEndFadingEdge() {
        return this.LLJJJJ;
    }

    public final boolean getHasStartFadingEdge() {
        return this.LLJJJIL;
    }

    public final Drawable getTabSelectedIndicator() {
        return this.LLJIJIL;
    }

    public final ViewPager getViewPager() {
        return this.LLJJIII;
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

    public final void LIZ(InterfaceC1846110y8n interfaceC1846110y8n) {
        if (!this.LLJILLL.contains(interfaceC1846110y8n)) {
            this.LLJILLL.add(interfaceC1846110y8n);
        }
    }

    public final void LIZLLL(int i) {
        ValueAnimator valueAnimator;
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            C1846070y8j c1846070y8j = this.LL;
            int childCount = c1846070y8j.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (c1846070y8j.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iLJFF = LJFF(i, 0.0f);
            if (scrollX != iLJFF) {
                LJI();
                ValueAnimator valueAnimator2 = this.LLJJI;
                if (valueAnimator2 != null) {
                    valueAnimator2.setIntValues(scrollX, iLJFF);
                }
                ValueAnimator valueAnimator3 = this.LLJJI;
                if (valueAnimator3 != null) {
                    valueAnimator3.start();
                }
            }
            C1846070y8j c1846070y8j2 = this.LL;
            int i3 = this.LLJILJIL;
            ValueAnimator valueAnimator4 = c1846070y8j2.LL;
            if (valueAnimator4 != null && valueAnimator4.isRunning() && (valueAnimator = c1846070y8j2.LL) != null) {
                valueAnimator.cancel();
            }
            c1846070y8j2.LIZJ(true, i, i3);
            return;
        }
        try {
            LJIJ(i, 0.0f, true, true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final C1845940y8W LJII(int i) {
        if (i >= 0 && i < getTabCount()) {
            return (C1845940y8W) ListProtector.get(this.LLILZLL, i);
        }
        return null;
    }

    public final void LJIIIIZZ(int i) {
        if (i >= this.LLILZLL.size()) {
            return;
        }
        C426750GoL.LIZJ(((ViewGroup) this.LL.getChildAt(i)).getChildAt(0));
    }

    public final void LJIIL(InterfaceC1846110y8n interfaceC1846110y8n) {
        this.LLJILLL.remove(interfaceC1846110y8n);
    }

    public final void LJIILIIL(int i) {
        int i2;
        C1845940y8W c1845940y8W = this.LLIZ;
        if (c1845940y8W != null) {
            i2 = c1845940y8W.LIZLLL;
        } else {
            i2 = 0;
        }
        LJIILJJIL(i);
        C1845940y8W c1845940y8W2 = (C1845940y8W) ListProtector.remove(this.LLILZLL, i);
        C1845940y8W c1845940y8W3 = null;
        c1845940y8W2.LJ = null;
        c1845940y8W2.LJFF = null;
        c1845940y8W2.LIZ = null;
        c1845940y8W2.LIZIZ = null;
        c1845940y8W2.LIZJ = null;
        c1845940y8W2.LIZLLL = -1;
        LLJL.LIZ(c1845940y8W2);
        int size = this.LLILZLL.size();
        for (int i3 = i; i3 < size; i3++) {
            ((C1845940y8W) ListProtector.get(this.LLILZLL, i3)).LIZLLL = i3;
        }
        if (i2 == i) {
            if (!this.LLILZLL.isEmpty()) {
                c1845940y8W3 = (C1845940y8W) ListProtector.get(this.LLILZLL, Math.max(0, i - 1));
            }
            LJIILL(c1845940y8W3, true);
        }
    }

    public final void LJIILJJIL(int i) {
        C1845930y8V c1845930y8V = (C1845930y8V) this.LL.getChildAt(i);
        LJIIIIZZ(i);
        C1846070y8j c1846070y8j = this.LL;
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1846070y8j, null);
        c1846070y8j.removeViewAt(i);
        c1845930y8V.setTab(null);
        c1845930y8V.setSelected(false);
        this.LLJJJJJIL.LIZ(c1845930y8V);
        this.LLJJJJLIIL = true;
        requestLayout();
    }

    public final void LJIJJLI(boolean z) {
        this.LLJI = z;
        this.LL.invalidate();
    }

    public final void LJIL(int i) {
        TypedArray typedArrayObtainStyledAttributes = C1388190mED.LJ(i, getContext()).obtainStyledAttributes(null, R$styleable.TuxTabBar, R.attr.yx, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTabBar__tux_tabBarBackgroundColor, 0);
        int color2 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTabBar__tux_tabBarIndicatorColor, 0);
        int color3 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTabBar__tux_tabBarTextColor, 0);
        int color4 = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTabBar__tux_tabBarTextSelectColor, 0);
        this.LLILZIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxTabBar__tux_tabBarSeparatorColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.LLILLL = new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{color4, C2441009hQ.LJIIL(color3, (int) (C427690Gpr.LIZIZ(getContext()) * Color.alpha(color3))), color3});
        setBackgroundColor(color);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
        c384050F3z.LIZ = Integer.valueOf(color2);
        this.LLJIJIL = c384050F3z.LIZ(getContext());
        this.LL.setSelectedIndicatorHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        int childCount = this.LL.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.LL.getChildAt(i2);
            if (childAt instanceof C1845930y8V) {
                ((C1845930y8V) childAt).LIZ();
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.LLJJJJLIIL = true;
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

    public final void setHasEndFadingEdge(boolean z) {
        this.LLJJJJ = z;
        invalidate();
    }

    public final void setHasStartFadingEdge(boolean z) {
        this.LLJJJIL = z;
        invalidate();
    }

    public final void setLayoutVariant(int i) {
        if (this.LLJ != i) {
            this.LLJ = i;
            this.LLJJJJLIIL = true;
            LJ();
            requestLayout();
            invalidate();
        }
    }

    public final void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        LJI();
        ValueAnimator valueAnimator = this.LLJJI;
        if (valueAnimator != null) {
            valueAnimator.addListener(animatorListener);
        }
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
        this.LLJJIII = viewPager;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0xFm, X.0y8n] */
    public static void LJIJI(C1846060y8i c1846060y8i, final ViewPager viewPager) {
        ViewPager viewPager2 = c1846060y8i.LLJJIII;
        if (viewPager2 != null) {
            viewPager2.removeOnPageChangeListener(c1846060y8i.getPageChangeListener());
            viewPager2.removeOnAdapterChangeListener(c1846060y8i.getAdapterChangeListener());
        }
        C1812000xFm c1812000xFm = c1846060y8i.LLJJ;
        if (c1812000xFm != null) {
            c1846060y8i.LJIIL(c1812000xFm);
            c1846060y8i.LLJJ = null;
        }
        if (viewPager != null) {
            c1846060y8i.LLJJIII = viewPager;
            C1194910hCT pageChangeListener = c1846060y8i.getPageChangeListener();
            pageChangeListener.LLILLL = 0;
            pageChangeListener.LLILLJJLI = 0;
            viewPager.addOnPageChangeListener(c1846060y8i.getPageChangeListener());
            ?? r0 = new InterfaceC1846110y8n(viewPager) { // from class: X.0xFm
                public final ViewPager LIZ;

                @Override // X.InterfaceC1846110y8n
                public final void LIZ(C1845940y8W c1845940y8W) {
                }

                @Override // X.InterfaceC1846110y8n
                public final void LIZJ(C1845940y8W c1845940y8W) {
                }

                {
                    this.LIZ = viewPager;
                }

                @Override // X.InterfaceC1846110y8n
                public final void LIZIZ(C1845940y8W c1845940y8W) {
                    this.LIZ.setCurrentItem(c1845940y8W.LIZLLL);
                }
            };
            c1846060y8i.LLJJ = r0;
            c1846060y8i.LIZ(r0);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                c1846060y8i.LJIIZILJ(adapter, true);
            }
            c1846060y8i.getAdapterChangeListener().LL = true;
            viewPager.addOnAdapterChangeListener(c1846060y8i.getAdapterChangeListener());
            try {
                c1846060y8i.LJIJ(viewPager.getCurrentItem(), 0.0f, true, true);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        c1846060y8i.LLJJIII = null;
        c1846060y8i.LJIIZILJ(null, false);
    }

    public final int LJFF(int i, float f) {
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

    public final void LJIILL(C1845940y8W c1845940y8W, boolean z) {
        int i;
        int size;
        int size2;
        C1845940y8W c1845940y8W2 = this.LLIZ;
        if (c1845940y8W2 == c1845940y8W) {
            if (c1845940y8W2 != null && c1845940y8W != null) {
                int size3 = this.LLJILLL.size() - 1;
                if (size3 >= 0) {
                    while (true) {
                        int i2 = size3 - 1;
                        InterfaceC1846110y8n interfaceC1846110y8n = (InterfaceC1846110y8n) ListProtector.get(this.LLJILLL, size3);
                        if (interfaceC1846110y8n != null) {
                            interfaceC1846110y8n.LIZ(c1845940y8W);
                        }
                        if (i2 < 0) {
                            break;
                        } else {
                            size3 = i2;
                        }
                    }
                }
                LIZLLL(c1845940y8W.LIZLLL);
                return;
            }
            return;
        }
        if (c1845940y8W != null) {
            i = c1845940y8W.LIZLLL;
        } else {
            i = -1;
        }
        if (z) {
            if ((c1845940y8W2 == null || c1845940y8W2.LIZLLL == -1) && i != -1) {
                try {
                    LJIJ(i, 0.0f, true, true);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                LIZLLL(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.LLIZ = c1845940y8W;
        if (c1845940y8W2 != null && this.LLJILLL.size() - 1 >= 0) {
            while (true) {
                int i3 = size2 - 1;
                InterfaceC1846110y8n interfaceC1846110y8n2 = (InterfaceC1846110y8n) ListProtector.get(this.LLJILLL, size2);
                if (interfaceC1846110y8n2 != null) {
                    interfaceC1846110y8n2.LIZJ(c1845940y8W2);
                }
                if (i3 < 0) {
                    break;
                } else {
                    size2 = i3;
                }
            }
        }
        if (c1845940y8W == null || this.LLJILLL.size() - 1 < 0) {
            return;
        }
        while (true) {
            int i4 = size - 1;
            InterfaceC1846110y8n interfaceC1846110y8n3 = (InterfaceC1846110y8n) ListProtector.get(this.LLJILLL, size);
            if (interfaceC1846110y8n3 != null) {
                interfaceC1846110y8n3.LIZIZ(c1845940y8W);
            }
            if (i4 >= 0) {
                size = i4;
            } else {
                return;
            }
        }
    }

    public final void LJIIZILJ(PagerAdapter pagerAdapter, boolean z) {
        PagerAdapter pagerAdapter2 = this.LLJJIJI;
        if (pagerAdapter2 != null) {
            pagerAdapter2.LJJIJIIJIL(getPagerAdapterObserver());
        }
        this.LLJJIJI = pagerAdapter;
        if (z && pagerAdapter != null) {
            pagerAdapter.LJJII(getPagerAdapterObserver());
        }
        LJIIJ();
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

    /* JADX WARN: Illegal instructions before constructor call */
    public C1846060y8i(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.yx;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        this.LLILZLL = new ArrayList<>();
        this.LLJI = true;
        this.LLJIJIL = new GradientDrawable();
        this.LLJILLL = new ArrayList<>();
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 204));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS562S0100000_18(this, 85));
        this.LLJJJ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 203));
        this.LLJJJIL = true;
        this.LLJJJJ = true;
        this.LLJJJJJIL = new C1085650eMF(12);
        C1397760mTe c1397760mTe = new C1397760mTe();
        c1397760mTe.LJIIIZ = new AwS606S0100000_27(this, 72);
        this.LLJJLIIIJLLLLLLLZ = c1397760mTe.LIZ();
        setHorizontalScrollBarEnabled(false);
        C1846070y8j c1846070y8j = new C1846070y8j(this, context);
        this.LL = c1846070y8j;
        addView(c1846070y8j, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxTabBar, i2, 0);
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
        this.LLJJL = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.TuxTabBar_tux_tabRoleDescription);
        typedArrayObtainStyledAttributes.recycle();
        int iLJIIL = C2441009hQ.LJIIL(color3, (int) (C427690Gpr.LIZIZ(context) * Color.alpha(color3)));
        setBackgroundColor(color);
        this.LLILLL = new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{color4, iLJIIL, color3});
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
        c384050F3z.LIZ = Integer.valueOf(color2);
        this.LLJIJIL = c384050F3z.LIZ(context);
        c1846070y8j.setSelectedIndicatorHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        setTabIndicatorFullWidth(this.LLIZLLLIL == 0);
        this.LLJILJIL = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        this.LLILLJJLI = new C1840210xzH();
        setFadingEdgeLength(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30)));
        setHorizontalFadingEdgeEnabled(true);
        LJ();
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
    public final void LIZIZ(C1845940y8W c1845940y8W, int i, boolean z) {
        if (c1845940y8W.LJ == this) {
            this.LLJJJJLIIL = true;
            c1845940y8W.LIZLLL = i;
            ListProtector.add(this.LLILZLL, i, c1845940y8W);
            int size = this.LLILZLL.size();
            while (true) {
                i++;
                if (i >= size) {
                    break;
                } else {
                    ((C1845940y8W) ListProtector.get(this.LLILZLL, i)).LIZLLL = i;
                }
            }
            C1845930y8V c1845930y8V = c1845940y8W.LJFF;
            if (c1845930y8V != null) {
                c1845930y8V.setSelected(false);
                c1845930y8V.setActivated(false);
                C1846070y8j c1846070y8j = this.LL;
                int i2 = c1845940y8W.LIZLLL;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                layoutParams.weight = 0.0f;
                c1846070y8j.addView(c1845930y8V, i2, layoutParams);
            }
            if (z) {
                c1845940y8W.LIZ();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void LJIJ(int i, float f, boolean z, boolean z2) {
        int iLIZIZ;
        int iLJFF;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        if (!Float.isNaN(f) && (iLIZIZ = C814420VxA.LIZIZ(i + f)) >= 0 && iLIZIZ < this.LL.getChildCount()) {
            if (z2) {
                C1846070y8j c1846070y8j = this.LL;
                ValueAnimator valueAnimator3 = c1846070y8j.LL;
                if (valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator2 = c1846070y8j.LL) != null) {
                    valueAnimator2.cancel();
                }
                c1846070y8j.LLILLJJLI = i;
                c1846070y8j.LLILLL = f;
                c1846070y8j.LIZIZ(c1846070y8j.getChildAt(i), c1846070y8j.getChildAt(c1846070y8j.LLILLJJLI + 1), c1846070y8j.LLILLL);
            }
            ValueAnimator valueAnimator4 = this.LLJJI;
            if (valueAnimator4 != null && valueAnimator4.isRunning() && (valueAnimator = this.LLJJI) != null) {
                valueAnimator.cancel();
            }
            if (i < 0) {
                iLJFF = 0;
            } else {
                iLJFF = LJFF(i, f);
            }
            scrollTo(iLJFF, 0);
            if (z) {
                setSelectedTabView(iLIZIZ);
            }
        }
    }

    public static void LJIJJ(C1846060y8i c1846060y8i, int i, InterfaceC426790GoP interfaceC426790GoP, float f, float f2, int i2) {
        float f3 = f;
        float f4 = 0.0f;
        if ((i2 & 16) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 32) == 0) {
            f4 = f2;
        }
        if (i < c1846060y8i.LLILZLL.size()) {
            ViewGroup viewGroup = (ViewGroup) c1846060y8i.LL.getChildAt(i);
            View childAt = viewGroup.getChildAt(0);
            for (ViewGroup viewGroup2 : C1697810uHb.LJIIJJI(viewGroup, c1846060y8i.LL)) {
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
            }
            if (interfaceC426790GoP instanceof C426780GoO) {
                C426780GoO c426780GoO = (C426780GoO) interfaceC426790GoP;
                C426750GoL.LIZ(childAt, 1, 0, c426780GoO.LIZIZ, c426780GoO.LIZ, f4 + 17.0f, f3, null, 0, null, null, 194);
            } else if (interfaceC426790GoP instanceof C426800GoQ) {
                C426750GoL.LIZ(childAt, 2, 0, 0, 0, f4 + 17.0f, f3, null, ((C426800GoQ) interfaceC426790GoP).LIZ, null, null, 78);
            } else if (interfaceC426790GoP instanceof C07Y3) {
                C426750GoL.LIZ(childAt, 3, 0, 0, 0, f4 + 17.0f, f3, ((C07Y3) interfaceC426790GoP).LIZ.toString(), 0, null, null, 142);
            } else {
                if (interfaceC426790GoP instanceof C1914007ec) {
                    C426750GoL.LIZ(childAt, 0, ((C1914007ec) interfaceC426790GoP).LIZ, 0, 0, f4 + 17.0f, f3, null, 0, null, null, 204);
                    return;
                }
                throw new C1954807lC();
            }
        }
    }
}
