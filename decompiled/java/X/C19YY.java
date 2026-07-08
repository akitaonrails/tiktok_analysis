package X;

import Y.AUListenerS280S0100000_33;
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
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
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

/* JADX INFO: renamed from: X.19YY, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@InterfaceC21561419Zs
public class C19YY extends HorizontalScrollView {
    public static final C1085640eME LLL = new C1085640eME(16);
    public final ArrayList<C21557119Yb> LL;
    public C21557119Yb LLILLJJLI;
    public final C19YZ LLILLL;
    public int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public final int LLIZ;
    public final int LLIZLLLIL;
    public ColorStateList LLJ;
    public final int LLJI;
    public int LLJIJIL;
    public final int LLJILJIL;
    public final int LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;
    public InterfaceC21558219Ym LLJJIJIIJIL;
    public final ArrayList<InterfaceC21558219Ym> LLJJIJIL;
    public C21557819Yi LLJJJ;
    public ValueAnimator LLJJJIL;
    public ViewPager LLJJJJ;
    public PagerAdapter LLJJJJJIL;
    public C21558319Yn LLJJJJLIIL;
    public C21557019Ya LLJJL;
    public C21557619Yg LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public boolean LLJLLIL;
    public InterfaceC21558119Yl LLJLLL;
    public final C1085650eMF LLJZ;
    public final int LLJZIJLIL;

    public void setIndicatorDrawProxy(InterfaceC21558819Ys interfaceC21558819Ys) {
    }

    public void setOnTabClickListener(InterfaceC21558919Yt interfaceC21558919Yt) {
    }

    private int getDefaultHeight() {
        int size = this.LL.size();
        for (int i = 0; i < size; i++) {
            C21557119Yb c21557119Yb = (C21557119Yb) ListProtector.get(this.LL, i);
            if (c21557119Yb != null && c21557119Yb.LIZ != null && !TextUtils.isEmpty(c21557119Yb.LIZIZ)) {
                return 72;
            }
        }
        return 48;
    }

    private float getScrollPosition() {
        return r2.LLILLL + this.LLILLL.LLILZ;
    }

    private int getTabMinWidth() {
        int i = this.LLJILJIL;
        if (i != -1) {
            return i;
        }
        if (this.LLJJIII == 0) {
            return this.LLJILLL;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.LLILLL.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public final void LJI() {
        this.LLILLL.setPaddingRelative(this.LLJJIII == 0 ? Math.max(0, this.LLJJ - this.LLILZIL) : 0, 0, 0, 0);
        int i = this.LLJJIII;
        if (i == 0) {
            this.LLILLL.setGravity(8388611);
        } else if (i == 1) {
            this.LLILLL.setGravity(1);
        }
        LJIJI(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C21557119Yb LJIIJJI() {
        C19YX c19yx;
        C21557119Yb c21557119Yb = (C21557119Yb) LLL.LIZIZ();
        if (c21557119Yb == null) {
            c21557119Yb = new C21557119Yb();
        }
        c21557119Yb.LJFF = this;
        C1085650eMF c1085650eMF = this.LLJZ;
        if (c1085650eMF == null || (c19yx = (C19YX) c1085650eMF.LIZIZ()) == null) {
            c19yx = new C19YX(this, getContext());
        }
        c19yx.setTab(c21557119Yb);
        c19yx.setFocusable(true);
        c19yx.setMinimumWidth(getTabMinWidth());
        c21557119Yb.LJI = c19yx;
        return c21557119Yb;
    }

    public final void LJIIL() {
        int currentItem;
        if (this.LLJLIL) {
            LJIILIIL();
            PagerAdapter pagerAdapter = this.LLJJJJJIL;
            if (pagerAdapter != null) {
                int count = pagerAdapter.getCount();
                for (int i = 0; i < count; i++) {
                    C21557119Yb c21557119YbLJIIJJI = LJIIJJI();
                    c21557119YbLJIIJJI.LIZIZ = this.LLJJJJJIL.LJIJJLI(i);
                    c21557119YbLJIIJJI.LIZJ();
                    LIZLLL(c21557119YbLJIIJJI, false);
                }
                ViewPager viewPager = this.LLJJJJ;
                if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                    return;
                }
                LJIILJJIL(LJIIIZ(currentItem), true, false);
            }
        }
    }

    public final void LJIILIIL() {
        for (int childCount = this.LLILLL.getChildCount() - 1; childCount >= 0; childCount--) {
            C19YX c19yx = (C19YX) this.LLILLL.getChildAt(childCount);
            C19YZ c19yz = this.LLILLL;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c19yz, null);
            c19yz.removeViewAt(childCount);
            if (c19yx != null) {
                c19yx.setTab(null);
                c19yx.setSelected(false);
                this.LLJZ.LIZ(c19yx);
            }
            requestLayout();
        }
        Iterator<C21557119Yb> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            C21557119Yb next = it2.next();
            it2.remove();
            next.LJFF = null;
            next.LJI = null;
            next.LIZ = null;
            next.LIZIZ = null;
            next.LIZJ = -1;
            next.LIZLLL = null;
            LLL.LIZ(next);
        }
        this.LLILLJJLI = null;
    }

    public int getSelectedTabPosition() {
        C21557119Yb c21557119Yb = this.LLILLJJLI;
        if (c21557119Yb != null) {
            return c21557119Yb.LIZJ;
        }
        return -1;
    }

    public int getTabCount() {
        return this.LL.size();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLJJJJ == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                LJIIZILJ((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLJL) {
            setupWithViewPager(null);
            this.LLJL = false;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public C21557119Yb getCurSelectedTab() {
        return this.LLILLJJLI;
    }

    public int getTabGravity() {
        return this.LLJJI;
    }

    public int getTabMaxWidth() {
        return this.LLJIJIL;
    }

    public int getTabMode() {
        return this.LLJJIII;
    }

    public ColorStateList getTabTextColors() {
        return this.LLJ;
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.LLILLL.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.LLILLL.getChildAt(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    public void LIZIZ(InterfaceC21558219Ym interfaceC21558219Ym) {
        if (!this.LLJJIJIL.contains(interfaceC21558219Ym)) {
            this.LLJJIJIL.add(interfaceC21558219Ym);
        }
    }

    public final void LIZJ(C21557119Yb c21557119Yb) {
        LIZLLL(c21557119Yb, this.LL.isEmpty());
    }

    public final void LJ(View view) {
        if (view instanceof C21559219Yw) {
            C21557119Yb c21557119YbLJIIJJI = LJIIJJI();
            view.getClass();
            if (!TextUtils.isEmpty(view.getContentDescription())) {
                view.getContentDescription();
                c21557119YbLJIIJJI.LIZJ();
            }
            LIZJ(c21557119YbLJIIJJI);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void LJFF(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            C19YZ c19yz = this.LLILLL;
            int childCount = c19yz.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (c19yz.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iLJII = LJII(i, 0.0f);
            if (scrollX != iLJII) {
                if (this.LLJJJIL == null) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.LLJJJIL = valueAnimator;
                    valueAnimator.setInterpolator(C194W.LIZ);
                    this.LLJJJIL.setDuration(300L);
                    this.LLJJJIL.addUpdateListener(new AUListenerS280S0100000_33(this, 58));
                }
                this.LLJJJIL.setIntValues(scrollX, iLJII);
                this.LLJJJIL.start();
            }
            this.LLILLL.LIZ(i, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            return;
        }
        LJIILLIIL(i, 0.0f, true, true);
    }

    public final int LJIIIIZZ(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    public final C21557119Yb LJIIIZ(int i) {
        if (i >= 0 && i < getTabCount()) {
            return (C21557119Yb) ListProtector.get(this.LL, i);
        }
        return null;
    }

    public final View LJIIJ(int i) {
        return this.LLILLL.getChildAt(i);
    }

    public final void LJIJ(LinearLayout.LayoutParams layoutParams) {
        if (this.LLJJIII == 1 && this.LLJJI == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        int i = this.LLILZ;
        if (i != 0) {
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = i;
        }
    }

    public final void LJIJI(boolean z) {
        for (int i = 0; i < this.LLILLL.getChildCount(); i++) {
            View childAt = this.LLILLL.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LJIJ((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        LJ(view);
    }

    public void setAutoFillWhenScrollable(boolean z) {
        this.LLJJIJI = z;
    }

    public void setDefaultAddTab(boolean z) {
        this.LLJLIL = z;
    }

    public void setFixedIndicatorWidth(int i) {
        this.LLILLL.LLILZIL = i;
    }

    public void setForceHideIndicatorView(boolean z) {
        this.LLJLL = z;
    }

    public void setHideIndicatorView(boolean z) {
        this.LLJLILLLLZIIL = z;
    }

    public void setIndicatorSizeProxy(InterfaceC21558119Yl interfaceC21558119Yl) {
        this.LLJLLL = interfaceC21558119Yl;
    }

    public void setOnTabSelectedListener(InterfaceC21558219Ym interfaceC21558219Ym) {
        InterfaceC21558219Ym interfaceC21558219Ym2 = this.LLJJIJIIJIL;
        if (interfaceC21558219Ym2 != null) {
            this.LLJJIJIL.remove(interfaceC21558219Ym2);
        }
        this.LLJJIJIIJIL = interfaceC21558219Ym;
        if (interfaceC21558219Ym != null) {
            LIZIZ(interfaceC21558219Ym);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        C19YZ c19yz = this.LLILLL;
        if (c19yz.LLILLJJLI.getColor() != i) {
            c19yz.LLILLJJLI.setColor(i);
            c19yz.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorCornerRadius(float f) {
        C19YZ c19yz = this.LLILLL;
        c19yz.getClass();
        if (f >= 0.0f) {
            if (c19yz.LLIZLLLIL != f || c19yz.LLJ != f) {
                c19yz.LLIZLLLIL = f;
                c19yz.LLJ = f;
                c19yz.postInvalidateOnAnimation();
            }
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        C19YZ c19yz = this.LLILLL;
        if (c19yz.LL != i) {
            c19yz.LL = i;
            c19yz.postInvalidateOnAnimation();
        }
    }

    public void setSupportCustomIndicator(boolean z) {
        this.LLJLLIL = z;
    }

    public void setTabGravity(int i) {
        if (this.LLJJI != i) {
            this.LLJJI = i;
            LJI();
        }
    }

    public void setTabMargin(int i) {
        this.LLILZ = LJIIIIZZ(i);
        for (int i2 = 0; i2 < getTabCount(); i2++) {
            View childAt = this.LLILLL.getChildAt(i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = LJIIIIZZ(i);
            marginLayoutParams.rightMargin = LJIIIIZZ(i);
            C786410Ut5.W5(childAt, marginLayoutParams);
            childAt.invalidate();
        }
    }

    public void setTabMode(int i) {
        if (i != this.LLJJIII) {
            this.LLJJIII = i;
            LJI();
        }
    }

    public void setTabStripLeftMargin(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LLILLL.getLayoutParams();
        layoutParams.leftMargin = i;
        C19YZ c19yz = this.LLILLL;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19yz);
        c19yz.setLayoutParams(layoutParams);
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.LLJ != colorStateList) {
            this.LLJ = colorStateList;
            int size = this.LL.size();
            for (int i = 0; i < size; i++) {
                ((C21557119Yb) ListProtector.get(this.LL, i)).LIZJ();
            }
        }
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        LJIILL(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        LJIIZILJ(viewPager, false);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public C19YY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new ArrayList<>();
        this.LLJIJIL = Integer.MAX_VALUE;
        this.LLJJIJIL = new ArrayList<>();
        this.LLJLIL = true;
        this.LLJLLIL = true;
        this.LLJLLL = null;
        this.LLJZ = new C1085650eMF(12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C21559019Yu.LIZ);
        boolean z = !typedArrayObtainStyledAttributes.hasValue(0);
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            setHorizontalScrollBarEnabled(false);
            C19YZ c19yz = new C19YZ(this, context);
            this.LLILLL = c19yz;
            super.addView(c19yz, 0, new FrameLayout.LayoutParams(-2, -1));
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.TabLayout, 0, R.style.a2k);
            int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TabLayout_tabIndicatorHeight, 0);
            if (c19yz.LL != dimensionPixelSize) {
                c19yz.LL = dimensionPixelSize;
                c19yz.postInvalidateOnAnimation();
            }
            int color = typedArrayObtainStyledAttributes2.getColor(R$styleable.TabLayout_tabIndicatorColor, 0);
            if (c19yz.LLILLJJLI.getColor() != color) {
                c19yz.LLILLJJLI.setColor(color);
                c19yz.postInvalidateOnAnimation();
            }
            int dimensionPixelSize2 = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TabLayout_tabPadding, 0);
            this.LLIZLLLIL = dimensionPixelSize2;
            this.LLIZ = dimensionPixelSize2;
            this.LLILZLL = dimensionPixelSize2;
            this.LLILZIL = dimensionPixelSize2;
            this.LLILZIL = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingStart, dimensionPixelSize2);
            this.LLILZLL = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingTop, dimensionPixelSize2);
            this.LLIZ = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingEnd, dimensionPixelSize2);
            this.LLIZLLLIL = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingBottom, dimensionPixelSize2);
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(typedArrayObtainStyledAttributes2.getResourceId(R$styleable.TabLayout_tabTextAppearance, R.style.qb), R$styleable.TextAppearance);
            try {
                typedArrayObtainStyledAttributes3.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, 0);
                this.LLJ = typedArrayObtainStyledAttributes3.getColorStateList(R$styleable.TextAppearance_android_textColor);
                typedArrayObtainStyledAttributes3.recycle();
                if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.TabLayout_tabTextColor)) {
                    this.LLJ = typedArrayObtainStyledAttributes2.getColorStateList(R$styleable.TabLayout_tabTextColor);
                }
                if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.TabLayout_tabSelectedTextColor)) {
                    this.LLJ = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{typedArrayObtainStyledAttributes2.getColor(R$styleable.TabLayout_tabSelectedTextColor, 0), this.LLJ.getDefaultColor()});
                }
                this.LLJILJIL = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TabLayout_tabMinWidth, -1);
                this.LLJILJILJ = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TabLayout_tabMaxWidth, -1);
                this.LLJI = typedArrayObtainStyledAttributes2.getResourceId(R$styleable.TabLayout_tabBackground, 0);
                this.LLJJ = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TabLayout_tabContentStart, 0);
                this.LLJJIII = typedArrayObtainStyledAttributes2.getInt(R$styleable.TabLayout_tabMode, 1);
                this.LLJJI = typedArrayObtainStyledAttributes2.getInt(R$styleable.TabLayout_tabGravity, 0);
                typedArrayObtainStyledAttributes2.recycle();
                Resources resources = getResources();
                resources.getDimensionPixelSize(R.dimen.rd);
                this.LLJILLL = resources.getDimensionPixelSize(R.dimen.rb);
                C12ES.LIZJ(1.5f, getContext());
                C12ES.LIZJ(1.5f, getContext());
                this.LLJZIJLIL = getResources().getConfiguration().orientation;
                LJI();
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                typedArrayObtainStyledAttributes3.recycle();
                throw th;
            }
        }
        throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
    }

    public final void LIZLLL(C21557119Yb c21557119Yb, boolean z) {
        int size = this.LL.size();
        if (c21557119Yb.LJFF == this) {
            c21557119Yb.LIZJ = size;
            ListProtector.add(this.LL, size, c21557119Yb);
            int size2 = this.LL.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                } else {
                    ((C21557119Yb) ListProtector.get(this.LL, size)).LIZJ = size;
                }
            }
            C19YX c19yx = c21557119Yb.LJI;
            C19YZ c19yz = this.LLILLL;
            int i = c21557119Yb.LIZJ;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            LJIJ(layoutParams);
            c19yz.addView(c19yx, i, layoutParams);
            if (z) {
                c21557119Yb.LIZ();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final int LJII(int i, float f) {
        View childAt;
        int width;
        int width2 = 0;
        if (this.LLJJIII != 0) {
            return 0;
        }
        View childAt2 = this.LLILLL.getChildAt(i);
        int i2 = i + 1;
        if (i2 < this.LLILLL.getChildCount()) {
            childAt = this.LLILLL.getChildAt(i2);
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
        int i3 = (int) ((width + width2 + (this.LLILZ * 4)) * 0.5f * f);
        if (getLayoutDirection() == 0) {
            return left + i3;
        }
        return left - i3;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.19Yn] */
    public final void LJIILL(PagerAdapter pagerAdapter, boolean z) {
        C21558319Yn c21558319Yn;
        PagerAdapter pagerAdapter2 = this.LLJJJJJIL;
        if (pagerAdapter2 != null && (c21558319Yn = this.LLJJJJLIIL) != null) {
            pagerAdapter2.LJJIJIIJIL(c21558319Yn);
        }
        this.LLJJJJJIL = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.LLJJJJLIIL == null) {
                this.LLJJJJLIIL = new DataSetObserver() { // from class: X.19Yn
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        this.LIZ.LJIIL();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        this.LIZ.LJIIL();
                    }
                };
            }
            pagerAdapter.LJJII(this.LLJJJJLIIL);
        }
        LJIIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.19Yi, X.19Ym] */
    public final void LJIIZILJ(final ViewPager viewPager, boolean z) {
        ViewPager viewPager2 = this.LLJJJJ;
        if (viewPager2 != null) {
            C21557019Ya c21557019Ya = this.LLJJL;
            if (c21557019Ya != null) {
                viewPager2.removeOnPageChangeListener(c21557019Ya);
            }
            C21557619Yg c21557619Yg = this.LLJJLIIIJLLLLLLLZ;
            if (c21557619Yg != null) {
                this.LLJJJJ.removeOnAdapterChangeListener(c21557619Yg);
            }
        }
        C21557819Yi c21557819Yi = this.LLJJJ;
        if (c21557819Yi != null) {
            this.LLJJIJIL.remove(c21557819Yi);
            this.LLJJJ = null;
        }
        if (viewPager != null) {
            this.LLJJJJ = viewPager;
            if (this.LLJJL == null) {
                this.LLJJL = new C21557019Ya(this);
            }
            C21557019Ya c21557019Ya2 = this.LLJJL;
            c21557019Ya2.LLILLL = 0;
            c21557019Ya2.LLILLJJLI = 0;
            viewPager.addOnPageChangeListener(c21557019Ya2);
            ?? r0 = new InterfaceC21558219Ym(viewPager) { // from class: X.19Yi
                public final ViewPager LIZ;

                @Override // X.InterfaceC21558219Ym
                public final void LIZIZ(C21557119Yb c21557119Yb) {
                }

                @Override // X.InterfaceC21558219Ym
                public final void LIZJ(C21557119Yb c21557119Yb) {
                }

                {
                    this.LIZ = viewPager;
                }

                @Override // X.InterfaceC21558219Ym
                public final void LIZ(C21557119Yb c21557119Yb, boolean z2) {
                    this.LIZ.setCurrentItem(c21557119Yb.LIZJ);
                }
            };
            this.LLJJJ = r0;
            LIZIZ(r0);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                LJIILL(adapter, true);
            }
            if (this.LLJJLIIIJLLLLLLLZ == null) {
                this.LLJJLIIIJLLLLLLLZ = new C21557619Yg(this);
            }
            C21557619Yg c21557619Yg2 = this.LLJJLIIIJLLLLLLLZ;
            c21557619Yg2.LL = true;
            viewPager.addOnAdapterChangeListener(c21557619Yg2);
            LJIILLIIL(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.LLJJJJ = null;
            LJIILL(null, false);
        }
        this.LLJL = z;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        LJ(view);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iLJIIIIZZ = LJIIIIZZ(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(iLJIIIIZZ, 1073741824);
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(iLJIIIIZZ, View.MeasureSpec.getSize(i2)), 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iLJIIIIZZ2 = this.LLJILJILJ;
            if (iLJIIIIZZ2 <= 0) {
                iLJIIIIZZ2 = size - LJIIIIZZ(56);
            }
            this.LLJIJIL = iLJIIIIZZ2;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.LLJJIII;
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

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        LJ(view);
    }

    public final void LJIILJJIL(C21557119Yb c21557119Yb, boolean z, boolean z2) {
        int i;
        C21557119Yb c21557119Yb2 = this.LLILLJJLI;
        if (c21557119Yb2 == c21557119Yb) {
            if (c21557119Yb2 != null) {
                for (int size = this.LLJJIJIL.size() - 1; size >= 0; size--) {
                    ((InterfaceC21558219Ym) ListProtector.get(this.LLJJIJIL, size)).LIZIZ(c21557119Yb);
                }
                LJFF(c21557119Yb.LIZJ);
                return;
            }
            return;
        }
        if (c21557119Yb != null) {
            i = c21557119Yb.LIZJ;
        } else {
            i = -1;
        }
        if (z) {
            if ((c21557119Yb2 == null || c21557119Yb2.LIZJ == -1) && i != -1) {
                LJIILLIIL(i, 0.0f, true, true);
            } else {
                LJFF(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        if (c21557119Yb2 != null) {
            for (int size2 = this.LLJJIJIL.size() - 1; size2 >= 0; size2--) {
                ((InterfaceC21558219Ym) ListProtector.get(this.LLJJIJIL, size2)).LIZJ(c21557119Yb2);
            }
        }
        this.LLILLJJLI = c21557119Yb;
        if (c21557119Yb != null) {
            for (int size3 = this.LLJJIJIL.size() - 1; size3 >= 0; size3--) {
                ((InterfaceC21558219Ym) ListProtector.get(this.LLJJIJIL, size3)).LIZ(c21557119Yb, z2);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        LJ(view);
    }

    public final void LJIILLIIL(int i, float f, boolean z, boolean z2) {
        int iRound = Math.round(i + f);
        if (iRound >= 0 && iRound < this.LLILLL.getChildCount()) {
            if (z2) {
                C19YZ c19yz = this.LLILLL;
                ValueAnimator valueAnimator = c19yz.LLJI;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    c19yz.LLJI.cancel();
                }
                c19yz.LLILLL = i;
                c19yz.LLILZ = f;
                c19yz.LIZIZ();
            }
            ValueAnimator valueAnimator2 = this.LLJJJIL;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.LLJJJIL.cancel();
            }
            scrollTo(LJII(i, f), 0);
            if (z) {
                setSelectedTabView(iRound);
            }
        }
    }

    @Override // android.view.View
    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, 80, i8, z);
    }
}
