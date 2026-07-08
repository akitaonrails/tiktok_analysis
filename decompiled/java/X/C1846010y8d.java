package X;

import Y.ARunnableS35S0101000_24;
import Y.AUListenerS275S0100000_27;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
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
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS62S0001000_24;
import u4.q0;

/* JADX INFO: renamed from: X.0y8d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846010y8d extends HorizontalScrollView {
    public static final C1085640eME LLJL = new C1085640eME(16);
    public final C1846020y8e LL;
    public final C1845980y8a LLILLJJLI;
    public final ColorStateList LLILLL;
    public final int LLILZ;
    public final ArrayList<C1845850y8N> LLILZIL;
    public C1845850y8N LLILZLL;
    public boolean LLIZ;
    public Drawable LLIZLLLIL;
    public final int LLJ;
    public boolean LLJI;
    public final ArrayList<InterfaceC1846000y8c> LLJIJIL;
    public C1845900y8S LLJILJIL;
    public ValueAnimator LLJILJILJ;
    public ViewPager LLJILLL;
    public PagerAdapter LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final int LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public final C1085650eMF LLJJJJ;
    public final int[] LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public final String LLJJL;
    public final C20094413jq LLJJLIIIJLLLLLLLZ;

    public C1846010y8d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void setupWithViewPager(ViewPager viewPager) {
        LJIIIZ(this, viewPager);
    }

    private final C1846030y8f getAdapterChangeListener() {
        return (C1846030y8f) this.LLJJIJI.getValue();
    }

    private final C1557480qdG getPageChangeListener() {
        return (C1557480qdG) this.LLJJIII.getValue();
    }

    private final C1846040y8g getPagerAdapterObserver() {
        return (C1846040y8g) this.LLJJI.getValue();
    }

    private final int getTabScrollRange() {
        return Math.max(0, ((this.LL.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public final void LIZLLL() {
        if (this.LLJILJILJ == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setInterpolator(new C12DM());
            valueAnimator.setDuration(this.LLJ);
            valueAnimator.addUpdateListener(new AUListenerS275S0100000_27(this, 3));
            this.LLJILJILJ = valueAnimator;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJFF() {
        for (int childCount = this.LL.getChildCount() - 1; -1 < childCount; childCount--) {
            C1845910y8T c1845910y8T = (C1845910y8T) this.LL.getChildAt(childCount);
            C1846020y8e c1846020y8e = this.LL;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1846020y8e, null);
            c1846020y8e.removeViewAt(childCount);
            c1845910y8T.setTab$explore_release(null);
            c1845910y8T.setSelected(false);
            this.LLJJJJ.LIZ(c1845910y8T);
            this.LLJJJJLIIL = true;
            requestLayout();
        }
        Iterator<C1845850y8N> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            C1845850y8N next = it2.next();
            it2.remove();
            next.LIZLLL = null;
            next.LJ = null;
            next.LIZ = null;
            next.LIZIZ = null;
            next.LIZJ = -1;
            LLJL.LIZ(next);
        }
        this.LLILZLL = null;
        PagerAdapter pagerAdapter = this.LLJJ;
        if (pagerAdapter == null) {
            return;
        }
        int count = pagerAdapter.getCount();
        for (int i = 0; i < count; i++) {
            final C1845850y8N c1845850y8N = (C1845850y8N) LLJL.LIZIZ();
            if (c1845850y8N == null) {
                c1845850y8N = new C1845850y8N();
            }
            c1845850y8N.LIZLLL = this;
            final C1845910y8T c1845910y8T2 = (C1845910y8T) this.LLJJJJ.LIZIZ();
            if (c1845910y8T2 == null) {
                c1845910y8T2 = new C1845910y8T(this, getContext());
            }
            c1845910y8T2.setTab$explore_release(c1845850y8N);
            c1845910y8T2.setFocusable(true);
            c1845910y8T2.setClipChildren(false);
            c1845910y8T2.setClipToPadding(false);
            if (TextUtils.isEmpty(null)) {
                c1845910y8T2.setContentDescription(c1845850y8N.LIZIZ);
            } else {
                c1845910y8T2.setContentDescription(null);
            }
            int i2 = C20094413jq.LJIIZILJ;
            q0.LJIJ(c1845910y8T2, this.LLJJLIIIJLLLLLLLZ);
            C2211631BhB.LIZJ(c1845910y8T2, new AbstractC2211791BhR(c1845910y8T2, c1845850y8N) { // from class: X.0y8M
                public Function0<String> LJ;
                public final C1864800ycw LJFF;
                public final C1845860y8O LJI;
                public final float LJII = 0.7f;

                @Override // X.AbstractC2211791BhR
                public final int LIZJ() {
                    return 0;
                }

                @Override // X.AbstractC2211791BhR
                public final Function0<String> LIZLLL() {
                    return this.LJ;
                }

                @Override // X.AbstractC2211791BhR
                public final /* bridge */ /* synthetic */ InterfaceC2211921Bhe LJ() {
                    return this.LJI;
                }

                @Override // X.AbstractC2211791BhR
                public final /* bridge */ /* synthetic */ InterfaceC2211931Bhf LJFF() {
                    return this.LJFF;
                }

                @Override // X.AbstractC2211791BhR
                public final float LJIIL() {
                    return this.LJII;
                }

                @Override // X.AbstractC2211791BhR
                public final void LJIILL(Function0<String> function0) {
                    this.LJ = function0;
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [X.0y8O] */
                {
                    this.LJ = new AwS571S0100000_27(c1845910y8T2, 244);
                    this.LJFF = new C1864800ycw(c1845850y8N, 0);
                    this.LJI = new InterfaceC2211921Bhe() { // from class: X.0y8O
                        @Override // X.InterfaceC2211921Bhe
                        public final void LIZ(long j) {
                            c1845850y8N.LJFF = false;
                        }
                    };
                }
            });
            c1845850y8N.LJ = c1845910y8T2;
            c1845850y8N.LIZ(pagerAdapter.LJIJJLI(i));
            int size = this.LLILZIL.size();
            if (c1845850y8N.LIZLLL != this) {
                throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
            }
            this.LLJJJJLIIL = true;
            c1845850y8N.LIZJ = size;
            ListProtector.add(this.LLILZIL, size, c1845850y8N);
            int size2 = this.LLILZIL.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                } else {
                    ((C1845850y8N) ListProtector.get(this.LLILZIL, size)).LIZJ = size;
                }
            }
            C1845910y8T c1845910y8T3 = c1845850y8N.LJ;
            if (c1845910y8T3 != null) {
                c1845910y8T3.setSelected(false);
                c1845910y8T3.setActivated(false);
                C1846020y8e c1846020y8e2 = this.LL;
                int i3 = c1845850y8N.LIZJ;
                c1846020y8e2.addView(c1845910y8T3, i3, LIZJ(i3));
            }
        }
        ViewPager viewPager = this.LLJILLL;
        if (viewPager != null && count > 0) {
            int currentItem = viewPager.getCurrentItem();
            C2153908cD c2153908cD = C2153908cD.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("populateFromPagerAdapter ===> ");
            sbLIZ.append(currentItem);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2153908cD.getClass();
            C2153908cD.LIZJ(3, strLIZIZ, "explore_tab_bar");
            if (currentItem == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            LJI(LJ(currentItem), true);
        }
    }

    public final int getSelectedTabPosition() {
        C1845850y8N c1845850y8N = this.LLILZLL;
        if (c1845850y8N != null) {
            return c1845850y8N.LIZJ;
        }
        return -1;
    }

    public final int getTabCount() {
        return this.LLILZIL.size();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getLeftFadingEdgeStrength() {
        if (!(getLayoutDirection() == 1 && this.LLJJJIL) && (getLayoutDirection() == 1 || !this.LLJJJ)) {
            return 0.0f;
        }
        return super.getLeftFadingEdgeStrength();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getRightFadingEdgeStrength() {
        if (!(getLayoutDirection() == 1 && this.LLJJJ) && (getLayoutDirection() == 1 || !this.LLJJJIL)) {
            return 0.0f;
        }
        return super.getRightFadingEdgeStrength();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public final C1845850y8N getCurrentSelectedTab() {
        return this.LLILZLL;
    }

    public final boolean getHasEndFadingEdge() {
        return this.LLJJJIL;
    }

    public final boolean getHasStartFadingEdge() {
        return this.LLJJJ;
    }

    public final Drawable getTabSelectedIndicator() {
        return this.LLIZLLLIL;
    }

    public final ViewPager getViewPager() {
        return this.LLJILLL;
    }

    public static LinearLayout.LayoutParams LIZJ(int i) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.weight = 0.0f;
        if (i != -1 && i != 0) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int marginEnd = layoutParams.getMarginEnd();
            int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            layoutParams.setMarginStart(iLIZIZ);
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i2;
            layoutParams.setMarginEnd(marginEnd);
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i3;
        }
        return layoutParams;
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
        this.LLJI = z;
        this.LL.LIZ();
        this.LL.postInvalidateOnAnimation();
    }

    public final void LIZ(int i) {
        ValueAnimator valueAnimator;
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            C1846020y8e c1846020y8e = this.LL;
            int childCount = c1846020y8e.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (c1846020y8e.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iLIZIZ = LIZIZ(i, 0.0f);
            if (scrollX != iLIZIZ) {
                LIZLLL();
                ValueAnimator valueAnimator2 = this.LLJILJILJ;
                if (valueAnimator2 != null) {
                    valueAnimator2.setIntValues(scrollX, iLIZIZ);
                }
                ValueAnimator valueAnimator3 = this.LLJILJILJ;
                if (valueAnimator3 != null) {
                    valueAnimator3.start();
                }
            }
            C1846020y8e c1846020y8e2 = this.LL;
            int i3 = this.LLJ;
            ValueAnimator valueAnimator4 = c1846020y8e2.LL;
            if (valueAnimator4 != null && valueAnimator4.isRunning() && (valueAnimator = c1846020y8e2.LL) != null) {
                valueAnimator.cancel();
            }
            c1846020y8e2.LIZJ(true, i, i3);
            return;
        }
        HandlerHook.viewPost(this, new ARunnableS35S0101000_24(this, i, 0));
    }

    public final C1845850y8N LJ(int i) {
        if (i >= 0 && i < getTabCount()) {
            return (C1845850y8N) ListProtector.get(this.LLILZIL, i);
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
        this.LLJJJIL = z;
        invalidate();
    }

    public final void setHasStartFadingEdge(boolean z) {
        this.LLJJJ = z;
        invalidate();
    }

    public final void setScrollAnimatorListener$explore_release(Animator.AnimatorListener animatorListener) {
        LIZLLL();
        ValueAnimator valueAnimator = this.LLJILJILJ;
        if (valueAnimator != null) {
            valueAnimator.addListener(animatorListener);
        }
    }

    public final void setShouldDisableScrollAnimate$explore_release(boolean z) {
        this.LLIZ = z;
    }

    public final void setTabSelectedIndicator(Drawable drawable) {
        this.LLIZLLLIL = drawable;
    }

    public final void setViewPager(ViewPager viewPager) {
        this.LLJILLL = viewPager;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.0y8S, java.lang.Object] */
    public static void LJIIIZ(C1846010y8d c1846010y8d, final ViewPager viewPager) {
        ViewPager viewPager2 = c1846010y8d.LLJILLL;
        if (viewPager2 != null) {
            viewPager2.removeOnPageChangeListener(c1846010y8d.getPageChangeListener());
            viewPager2.removeOnAdapterChangeListener(c1846010y8d.getAdapterChangeListener());
        }
        C1845900y8S c1845900y8S = c1846010y8d.LLJILJIL;
        if (c1845900y8S != null) {
            c1846010y8d.LLJIJIL.remove(c1845900y8S);
            c1846010y8d.LLJILJIL = null;
        }
        if (viewPager != null) {
            c1846010y8d.LLJILLL = viewPager;
            C1557480qdG pageChangeListener = c1846010y8d.getPageChangeListener();
            pageChangeListener.LLILLL = 0;
            pageChangeListener.LLILLJJLI = 0;
            viewPager.addOnPageChangeListener(c1846010y8d.getPageChangeListener());
            ?? r1 = new InterfaceC1846000y8c(viewPager) { // from class: X.0y8S
                public final ViewPager LIZ;

                @Override // X.InterfaceC1846000y8c
                public final void LIZ(C1845850y8N c1845850y8N) {
                }

                @Override // X.InterfaceC1846000y8c
                public final void LIZIZ() {
                }

                {
                    this.LIZ = viewPager;
                }

                @Override // X.InterfaceC1846000y8c
                public final void LIZJ(C1845850y8N c1845850y8N) {
                    this.LIZ.setCurrentItem(c1845850y8N.LIZJ);
                }
            };
            c1846010y8d.LLJILJIL = r1;
            if (!c1846010y8d.LLJIJIL.contains(r1)) {
                c1846010y8d.LLJIJIL.add((InterfaceC1846000y8c) r1);
            }
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                c1846010y8d.LJII(adapter, true);
            }
            c1846010y8d.getAdapterChangeListener().LL = true;
            viewPager.addOnAdapterChangeListener(c1846010y8d.getAdapterChangeListener());
            c1846010y8d.LJIIIIZZ(viewPager.getCurrentItem(), 0.0f, true, true);
            return;
        }
        c1846010y8d.LLJILLL = null;
        c1846010y8d.LJII(null, false);
    }

    public final int LIZIZ(int i, float f) {
        View childAt;
        int width;
        View childAt2 = this.LL.getChildAt(i);
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
        } else {
            width = 0;
        }
        int left = (childAt2.getLeft() + (width2 / 2)) - (getWidth() / 2);
        getLocationOnScreen(this.LLJJJJJIL);
        int iLIZIZ = left - ((C497820Jfg.LIZIZ(getContext()) / 2) - (this.LLJJJJJIL[0] + (getWidth() / 2)));
        int i3 = (int) ((width2 + width) * 0.5f * f);
        if (getLayoutDirection() == 0) {
            return iLIZIZ + i3;
        }
        return iLIZIZ - i3;
    }

    public final void LJI(C1845850y8N c1845850y8N, boolean z) {
        int i;
        int size;
        int size2;
        C1845850y8N c1845850y8N2 = this.LLILZLL;
        if (c1845850y8N2 == c1845850y8N) {
            if (c1845850y8N2 != null && c1845850y8N != null) {
                int size3 = this.LLJIJIL.size() - 1;
                if (size3 >= 0) {
                    while (true) {
                        int i2 = size3 - 1;
                        InterfaceC1846000y8c interfaceC1846000y8c = (InterfaceC1846000y8c) ListProtector.get(this.LLJIJIL, size3);
                        if (interfaceC1846000y8c != null) {
                            interfaceC1846000y8c.LIZ(c1845850y8N);
                        }
                        if (i2 < 0) {
                            break;
                        } else {
                            size3 = i2;
                        }
                    }
                }
                LIZ(c1845850y8N.LIZJ);
                C2153908cD c2153908cD = C2153908cD.LIZ;
                AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(134);
                c2153908cD.getClass();
                C2153908cD.LIZIZ("explore_tab_bar", aFwS213S0000000_24);
                return;
            }
            return;
        }
        if (c1845850y8N != null) {
            i = c1845850y8N.LIZJ;
        } else {
            i = -1;
        }
        if (z) {
            if ((c1845850y8N2 == null || c1845850y8N2.LIZJ == -1) && i != -1) {
                if (!this.LLIZ) {
                    LJIIIIZZ(i, 0.0f, true, true);
                    C2153908cD c2153908cD2 = C2153908cD.LIZ;
                    AwS62S0001000_24 awS62S0001000_24 = new AwS62S0001000_24(i, 3);
                    c2153908cD2.getClass();
                    C2153908cD.LIZIZ("explore_tab_bar", awS62S0001000_24);
                }
            } else {
                LIZ(i);
                C2153908cD c2153908cD3 = C2153908cD.LIZ;
                AwS62S0001000_24 awS62S0001000_242 = new AwS62S0001000_24(i, 4);
                c2153908cD3.getClass();
                C2153908cD.LIZIZ("explore_tab_bar", awS62S0001000_242);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.LLILZLL = c1845850y8N;
        if (c1845850y8N2 != null && this.LLJIJIL.size() - 1 >= 0) {
            while (true) {
                int i3 = size2 - 1;
                InterfaceC1846000y8c interfaceC1846000y8c2 = (InterfaceC1846000y8c) ListProtector.get(this.LLJIJIL, size2);
                if (interfaceC1846000y8c2 != null) {
                    interfaceC1846000y8c2.LIZIZ();
                }
                if (i3 < 0) {
                    break;
                } else {
                    size2 = i3;
                }
            }
        }
        if (c1845850y8N == null || this.LLJIJIL.size() - 1 < 0) {
            return;
        }
        while (true) {
            int i4 = size - 1;
            InterfaceC1846000y8c interfaceC1846000y8c3 = (InterfaceC1846000y8c) ListProtector.get(this.LLJIJIL, size);
            if (interfaceC1846000y8c3 != null) {
                interfaceC1846000y8c3.LIZJ(c1845850y8N);
            }
            if (i4 >= 0) {
                size = i4;
            } else {
                return;
            }
        }
    }

    public final void LJII(PagerAdapter pagerAdapter, boolean z) {
        PagerAdapter pagerAdapter2 = this.LLJJ;
        if (pagerAdapter2 != null) {
            pagerAdapter2.LJJIJIIJIL(getPagerAdapterObserver());
        }
        this.LLJJ = pagerAdapter;
        if (z && pagerAdapter != null) {
            pagerAdapter.LJJII(getPagerAdapterObserver());
        }
        LJFF();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)) + getPaddingTop() + getPaddingBottom(), 1073741824);
        super.onMeasure(i, iMakeMeasureSpec);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(iMakeMeasureSpec, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1846010y8d(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        float fFloatValue;
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.yx;
        } else {
            i2 = 0;
        }
        super(context, attributeSet2, i2);
        this.LLILZ = 52;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a00, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, context);
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, context);
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = 0;
        }
        this.LLILZIL = new ArrayList<>();
        this.LLIZLLLIL = new GradientDrawable();
        this.LLJIJIL = new ArrayList<>();
        this.LLJJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 243));
        this.LLJJIII = C452501pT.LIZIZ(new AwS568S0100000_24(this, 365));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 242));
        this.LLJJIJIIJIL = C497820Jfg.LIZIZ(context);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZ(context);
        this.LLJJJ = true;
        this.LLJJJIL = true;
        this.LLJJJJ = new C1085650eMF(12);
        this.LLJJJJJIL = new int[2];
        C1397760mTe c1397760mTe = new C1397760mTe();
        c1397760mTe.LJIIIZ = new AwS606S0100000_27(this, 103);
        this.LLJJLIIIJLLLLLLLZ = c1397760mTe.LIZ();
        setHorizontalScrollBarEnabled(false);
        C1846020y8e c1846020y8e = new C1846020y8e(this, context);
        this.LL = c1846020y8e;
        addView(c1846020y8e, 0, new FrameLayout.LayoutParams(-2, -1));
        setHasStartFadingEdge(true);
        setHasEndFadingEdge(true);
        this.LLJJL = "";
        Float fLJFF = C1308910kAL.LJFF(R.attr.a36, context);
        if (fLJFF != null) {
            fFloatValue = fLJFF.floatValue();
        } else {
            fFloatValue = 0.2f;
        }
        int iLJIIL = C2441009hQ.LJIIL(iIntValue2, (int) (fFloatValue * Color.alpha(iIntValue2)));
        setBackgroundColor(0);
        this.LLILLL = new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{iIntValue3, iLJIIL, iIntValue2});
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
        c384050F3z2.LIZ = Integer.valueOf(iIntValue);
        this.LLIZLLLIL = c384050F3z2.LIZ(context);
        c1846020y8e.setSelectedIndicatorHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        setTabIndicatorFullWidth(true);
        this.LLJ = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        C1845980y8a c1845980y8a = new C1845980y8a();
        this.LLILLJJLI = c1845980y8a;
        setFadingEdgeLength(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)));
        setHorizontalFadingEdgeEnabled(true);
        C426750GoL.LJIIL(c1846020y8e, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0))), null, 26);
        c1845980y8a.LIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c1846020y8e.setGravity(8388611);
        int childCount = c1846020y8e.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            this.LL.getChildAt(i3).requestLayout();
        }
    }

    public final void LJIIIIZZ(int i, float f, boolean z, boolean z2) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        int iLIZIZ = C814420VxA.LIZIZ(i + f);
        if (iLIZIZ >= 0 && iLIZIZ < this.LL.getChildCount()) {
            if (z2) {
                C1846020y8e c1846020y8e = this.LL;
                ValueAnimator valueAnimator3 = c1846020y8e.LL;
                if (valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator2 = c1846020y8e.LL) != null) {
                    valueAnimator2.cancel();
                }
                c1846020y8e.LLILLJJLI = i;
                c1846020y8e.LLILLL = f;
                c1846020y8e.LIZIZ(c1846020y8e.getChildAt(i), c1846020y8e.getChildAt(c1846020y8e.LLILLJJLI + 1), c1846020y8e.LLILLL);
            }
            ValueAnimator valueAnimator4 = this.LLJILJILJ;
            if (valueAnimator4 != null && valueAnimator4.isRunning() && (valueAnimator = this.LLJILJILJ) != null) {
                valueAnimator.cancel();
            }
            int iLIZIZ2 = LIZIZ(i, f);
            C2153908cD c2153908cD = C2153908cD.LIZ;
            if (i < 0) {
                iLIZIZ2 = 0;
            }
            scrollTo(iLIZIZ2, 0);
            if (z) {
                setSelectedTabView(iLIZIZ);
                return;
            }
            return;
        }
        C2153908cD c2153908cD2 = C2153908cD.LIZ;
    }
}
