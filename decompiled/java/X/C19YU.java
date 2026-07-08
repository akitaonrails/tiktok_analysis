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

/* JADX INFO: renamed from: X.19YU, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@InterfaceC21561419Zs
public class C19YU extends HorizontalScrollView {
    public static final C1085640eME LLJZ = new C1085640eME(16);
    public static final C12DM LLJZIJLIL = new C12DM();
    public static final int[] LLL = {R.attr.bip};
    public final ArrayList<C1888650zFP> LL;
    public C1888650zFP LLILLJJLI;
    public final C19YV LLILLL;
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
    public InterfaceC1883670z7N LLJJIJIIJIL;
    public final ArrayList<InterfaceC1883670z7N> LLJJIJIL;
    public C1883970z7r LLJJJ;
    public ValueAnimator LLJJJIL;
    public ViewPager LLJJJJ;
    public PagerAdapter LLJJJJJIL;
    public C21558019Yk LLJJJJLIIL;
    public C19YW LLJJL;
    public C21557519Yf LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public final C1085650eMF LLJLLIL;
    public final int LLJLLL;

    public void setIndicatorDrawProxy(InterfaceC21558619Yq interfaceC21558619Yq) {
    }

    public void setOnTabClickListener(InterfaceC21558719Yr interfaceC21558719Yr) {
    }

    private int getDefaultHeight() {
        int size = this.LL.size();
        for (int i = 0; i < size; i++) {
            C1888650zFP c1888650zFP = (C1888650zFP) ListProtector.get(this.LL, i);
            if (c1888650zFP != null && c1888650zFP.LIZIZ != null && !TextUtils.isEmpty(c1888650zFP.LIZJ)) {
                return 72;
            }
        }
        return 48;
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

    public final void LJFF() {
        this.LLILLL.setPaddingRelative(this.LLJJIII == 0 ? Math.max(0, this.LLJJ - this.LLILZIL) : 0, 0, 0, 0);
        int i = this.LLJJIII;
        if (i == 0) {
            this.LLILLL.setGravity(8388611);
        } else if (i == 1) {
            this.LLILLL.setGravity(1);
        }
        LJIJ(true);
    }

    public final void LJIIIIZZ() {
        if (this.LLJJJIL == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LLJJJIL = valueAnimator;
            valueAnimator.setInterpolator(LLJZIJLIL);
            this.LLJJJIL.setDuration(300L);
            this.LLJJJIL.addUpdateListener(new AUListenerS280S0100000_33(this, 3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1888650zFP LJIIJ() {
        C19YT c19yt;
        C1888650zFP c1888650zFP = (C1888650zFP) LLJZ.LIZIZ();
        if (c1888650zFP == null) {
            c1888650zFP = new C1888650zFP();
        }
        c1888650zFP.LJI = this;
        C1085650eMF c1085650eMF = this.LLJLLIL;
        if (c1085650eMF == null || (c19yt = (C19YT) c1085650eMF.LIZIZ()) == null) {
            c19yt = new C19YT(this, getContext());
        }
        c19yt.setTab(c1888650zFP);
        c19yt.setFocusable(true);
        c19yt.setMinimumWidth(getTabMinWidth());
        c1888650zFP.LJII = c19yt;
        return c1888650zFP;
    }

    public final void LJIIJJI() {
        int currentItem;
        if (this.LLJLIL) {
            LJIIL();
            PagerAdapter pagerAdapter = this.LLJJJJJIL;
            if (pagerAdapter != null) {
                int count = pagerAdapter.getCount();
                for (int i = 0; i < count; i++) {
                    C1888650zFP c1888650zFPLJIIJ = LJIIJ();
                    c1888650zFPLJIIJ.LIZJ = this.LLJJJJJIL.LJIJJLI(i);
                    C19YT c19yt = c1888650zFPLJIIJ.LJII;
                    if (c19yt != null) {
                        c19yt.LIZ();
                    }
                    LIZJ(c1888650zFPLJIIJ, this.LL.size(), false);
                }
                ViewPager viewPager = this.LLJJJJ;
                if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                    return;
                }
                LJIILIIL(LJIIIZ(currentItem), true, false, false);
            }
        }
    }

    public final void LJIIL() {
        for (int childCount = this.LLILLL.getChildCount() - 1; childCount >= 0; childCount--) {
            C19YT c19yt = (C19YT) this.LLILLL.getChildAt(childCount);
            C19YV c19yv = this.LLILLL;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c19yv, null);
            c19yv.removeViewAt(childCount);
            if (c19yt != null) {
                c19yt.setTab(null);
                c19yt.setSelected(false);
                this.LLJLLIL.LIZ(c19yt);
            }
            requestLayout();
        }
        Iterator<C1888650zFP> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            C1888650zFP next = it2.next();
            it2.remove();
            next.LJI = null;
            next.LJII = null;
            next.LIZ = null;
            next.LIZIZ = null;
            next.LIZJ = null;
            next.LIZLLL = -1;
            next.LJ = null;
            LLJZ.LIZ(next);
        }
        this.LLILLJJLI = null;
    }

    public int getSelectedTabPosition() {
        C1888650zFP c1888650zFP = this.LLILLJJLI;
        if (c1888650zFP != null) {
            return c1888650zFP.LIZLLL;
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
                LJIILLIIL((ViewPager) parent, true, true);
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

    public C1888650zFP getCurSelectedTab() {
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

    public final void LIZIZ(InterfaceC1883670z7N interfaceC1883670z7N) {
        if (!this.LLJJIJIL.contains(interfaceC1883670z7N)) {
            this.LLJJIJIL.add(interfaceC1883670z7N);
        }
    }

    public final void LIZLLL(View view) {
        if (view instanceof C21559119Yv) {
            C1888650zFP c1888650zFPLJIIJ = LJIIJ();
            view.getClass();
            if (!TextUtils.isEmpty(view.getContentDescription())) {
                view.getContentDescription();
                C19YT c19yt = c1888650zFPLJIIJ.LJII;
                if (c19yt != null) {
                    c19yt.LIZ();
                }
            }
            LIZJ(c1888650zFPLJIIJ, this.LL.size(), this.LL.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void LJ(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            C19YV c19yv = this.LLILLL;
            int childCount = c19yv.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (c19yv.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iLJI = LJI(i, 0.0f);
            if (scrollX != iLJI) {
                LJIIIIZZ();
                this.LLJJJIL.setIntValues(scrollX, iLJI);
                this.LLJJJIL.start();
            }
            this.LLILLL.LIZ(i, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            return;
        }
        LJIILL(i, 0.0f, true, true);
    }

    public final int LJII(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    public final C1888650zFP LJIIIZ(int i) {
        if (i >= 0 && i < getTabCount()) {
            return (C1888650zFP) ListProtector.get(this.LL, i);
        }
        return null;
    }

    public final void LJIIZILJ(LinearLayout.LayoutParams layoutParams) {
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

    public final void LJIJ(boolean z) {
        for (int i = 0; i < this.LLILLL.getChildCount(); i++) {
            View childAt = this.LLILLL.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LJIIZILJ((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        LIZLLL(view);
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

    public void setHideIndicatorView(boolean z) {
        this.LLJLILLLLZIIL = z;
    }

    public void setOnTabSelectedListener(InterfaceC1883670z7N interfaceC1883670z7N) {
        InterfaceC1883670z7N interfaceC1883670z7N2 = this.LLJJIJIIJIL;
        if (interfaceC1883670z7N2 != null) {
            this.LLJJIJIL.remove(interfaceC1883670z7N2);
        }
        this.LLJJIJIIJIL = interfaceC1883670z7N;
        if (interfaceC1883670z7N != null) {
            LIZIZ(interfaceC1883670z7N);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        LJIIIIZZ();
        this.LLJJJIL.addListener(animatorListener);
    }

    public void setSelectedTabIndicatorColor(int i) {
        C19YV c19yv = this.LLILLL;
        if (c19yv.LLILLJJLI.getColor() != i) {
            c19yv.LLILLJJLI.setColor(i);
            c19yv.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorCornerRadius(float f) {
        C19YV c19yv = this.LLILLL;
        c19yv.getClass();
        if (f >= 0.0f) {
            if (c19yv.LLIZLLLIL != f || c19yv.LLJ != f) {
                c19yv.LLIZLLLIL = f;
                c19yv.LLJ = f;
                c19yv.postInvalidateOnAnimation();
            }
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        C19YV c19yv = this.LLILLL;
        if (c19yv.LL != i) {
            c19yv.LL = i;
            c19yv.postInvalidateOnAnimation();
        }
    }

    public void setSupportCustomIndicator(boolean z) {
        this.LLJLL = z;
    }

    public void setTabGravity(int i) {
        if (this.LLJJI != i) {
            this.LLJJI = i;
            LJFF();
        }
    }

    public void setTabMargin(int i) {
        this.LLILZ = LJII(i);
        for (int i2 = 0; i2 < getTabCount(); i2++) {
            View childAt = this.LLILLL.getChildAt(i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = LJII(i);
            marginLayoutParams.rightMargin = LJII(i);
            C786410Ut5.W5(childAt, marginLayoutParams);
            childAt.invalidate();
        }
    }

    public void setTabMode(int i) {
        if (i != this.LLJJIII) {
            this.LLJJIII = i;
            LJFF();
        }
    }

    public void setTabStripLeftPadding(int i) {
        C19YV c19yv = this.LLILLL;
        c19yv.setPadding(i, c19yv.getPaddingTop(), this.LLILLL.getPaddingRight(), this.LLILLL.getPaddingBottom());
    }

    public void setTabStripRightPadding(int i) {
        C19YV c19yv = this.LLILLL;
        c19yv.setPadding(c19yv.getPaddingLeft(), this.LLILLL.getPaddingTop(), i, this.LLILLL.getPaddingBottom());
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.LLJ != colorStateList) {
            this.LLJ = colorStateList;
            int size = this.LL.size();
            for (int i = 0; i < size; i++) {
                C19YT c19yt = ((C1888650zFP) ListProtector.get(this.LL, i)).LJII;
                if (c19yt != null) {
                    c19yt.LIZ();
                }
            }
        }
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        LJIILJJIL(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        LJIILLIIL(viewPager, true, false);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public C19YU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final int LJI(int i, float f) {
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

    /* JADX WARN: Type inference failed for: r0v2, types: [X.19Yk] */
    public final void LJIILJJIL(PagerAdapter pagerAdapter, boolean z) {
        C21558019Yk c21558019Yk;
        PagerAdapter pagerAdapter2 = this.LLJJJJJIL;
        if (pagerAdapter2 != null && (c21558019Yk = this.LLJJJJLIIL) != null) {
            pagerAdapter2.LJJIJIIJIL(c21558019Yk);
        }
        this.LLJJJJJIL = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.LLJJJJLIIL == null) {
                this.LLJJJJLIIL = new DataSetObserver() { // from class: X.19Yk
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        this.LIZ.LJIIJJI();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        this.LIZ.LJIIJJI();
                    }
                };
            }
            pagerAdapter.LJJII(this.LLJJJJLIIL);
        }
        LJIIJJI();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        LIZLLL(view);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iLJII = LJII(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(iLJII, 1073741824);
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(iLJII, View.MeasureSpec.getSize(i2)), 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iLJII2 = this.LLJILJILJ;
            if (iLJII2 <= 0) {
                iLJII2 = size - LJII(56);
            }
            this.LLJIJIL = iLJII2;
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
        LIZLLL(view);
    }

    public C19YU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new ArrayList<>();
        this.LLJIJIL = Integer.MAX_VALUE;
        this.LLJJIJIL = new ArrayList<>();
        this.LLJLIL = true;
        this.LLJLL = true;
        this.LLJLLIL = new C1085650eMF(12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(LLL);
        boolean z = !typedArrayObtainStyledAttributes.hasValue(0);
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            setHorizontalScrollBarEnabled(false);
            C19YV c19yv = new C19YV(this, context);
            this.LLILLL = c19yv;
            super.addView(c19yv, 0, new FrameLayout.LayoutParams(-2, -1));
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.TabLayout, i, R.style.a2k);
            int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TabLayout_tabIndicatorHeight, 0);
            if (c19yv.LL != dimensionPixelSize) {
                c19yv.LL = dimensionPixelSize;
                c19yv.postInvalidateOnAnimation();
            }
            int color = typedArrayObtainStyledAttributes2.getColor(R$styleable.TabLayout_tabIndicatorColor, 0);
            if (c19yv.LLILLJJLI.getColor() != color) {
                c19yv.LLILLJJLI.setColor(color);
                c19yv.postInvalidateOnAnimation();
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
                C497740JfY.LIZIZ(1.5f);
                C497740JfY.LIZIZ(1.5f);
                this.LLJLLL = getResources().getConfiguration().orientation;
                LJFF();
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                typedArrayObtainStyledAttributes3.recycle();
                throw th;
            }
        }
        throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
    }

    public final void LIZJ(C1888650zFP c1888650zFP, int i, boolean z) {
        if (c1888650zFP.LJI == this) {
            c1888650zFP.LIZLLL = i;
            ListProtector.add(this.LL, i, c1888650zFP);
            int size = this.LL.size();
            while (true) {
                i++;
                if (i >= size) {
                    break;
                } else {
                    ((C1888650zFP) ListProtector.get(this.LL, i)).LIZLLL = i;
                }
            }
            C19YT c19yt = c1888650zFP.LJII;
            C19YV c19yv = this.LLILLL;
            int i2 = c1888650zFP.LIZLLL;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            LJIIZILJ(layoutParams);
            c19yv.addView(c19yt, i2, layoutParams);
            if (z) {
                c1888650zFP.LIZ(false);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0z7N, X.0z7r] */
    public final void LJIILLIIL(final ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.LLJJJJ;
        if (viewPager2 != null) {
            C19YW c19yw = this.LLJJL;
            if (c19yw != null) {
                viewPager2.removeOnPageChangeListener(c19yw);
            }
            C21557519Yf c21557519Yf = this.LLJJLIIIJLLLLLLLZ;
            if (c21557519Yf != null) {
                this.LLJJJJ.removeOnAdapterChangeListener(c21557519Yf);
            }
        }
        C1883970z7r c1883970z7r = this.LLJJJ;
        if (c1883970z7r != null) {
            this.LLJJIJIL.remove(c1883970z7r);
            this.LLJJJ = null;
        }
        if (viewPager != null) {
            this.LLJJJJ = viewPager;
            if (this.LLJJL == null) {
                this.LLJJL = new C19YW(this);
            }
            C19YW c19yw2 = this.LLJJL;
            c19yw2.LLILLL = 0;
            c19yw2.LLILLJJLI = 0;
            viewPager.addOnPageChangeListener(c19yw2);
            ?? r0 = new InterfaceC1883670z7N(viewPager) { // from class: X.0z7r
                public final ViewPager LIZ;

                @Override // X.InterfaceC1883670z7N
                public final void LIZ(C1888650zFP c1888650zFP) {
                }

                @Override // X.InterfaceC1883670z7N
                public final void LIZJ(C1888650zFP c1888650zFP) {
                }

                {
                    this.LIZ = viewPager;
                }

                @Override // X.InterfaceC1883670z7N
                public final void LIZIZ(C1888650zFP c1888650zFP, boolean z3, boolean z4) {
                    this.LIZ.setCurrentItem(c1888650zFP.LIZLLL);
                }
            };
            this.LLJJJ = r0;
            LIZIZ(r0);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                LJIILJJIL(adapter, z);
            }
            if (this.LLJJLIIIJLLLLLLLZ == null) {
                this.LLJJLIIIJLLLLLLLZ = new C21557519Yf(this);
            }
            C21557519Yf c21557519Yf2 = this.LLJJLIIIJLLLLLLLZ;
            c21557519Yf2.LL = z;
            viewPager.addOnAdapterChangeListener(c21557519Yf2);
            LJIILL(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.LLJJJJ = null;
            LJIILJJIL(null, false);
        }
        this.LLJL = z2;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        LIZLLL(view);
    }

    public final void LJIILIIL(C1888650zFP c1888650zFP, boolean z, boolean z2, boolean z3) {
        int i;
        C1888650zFP c1888650zFP2 = this.LLILLJJLI;
        if (c1888650zFP2 == c1888650zFP) {
            if (c1888650zFP2 != null) {
                for (int size = this.LLJJIJIL.size() - 1; size >= 0; size--) {
                    ((InterfaceC1883670z7N) ListProtector.get(this.LLJJIJIL, size)).LIZJ(c1888650zFP);
                }
                LJ(c1888650zFP.LIZLLL);
                return;
            }
            return;
        }
        if (c1888650zFP != null) {
            i = c1888650zFP.LIZLLL;
        } else {
            i = -1;
        }
        if (z) {
            if ((c1888650zFP2 == null || c1888650zFP2.LIZLLL == -1) && i != -1) {
                LJIILL(i, 0.0f, true, true);
            } else {
                LJ(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        if (c1888650zFP2 != null) {
            for (int size2 = this.LLJJIJIL.size() - 1; size2 >= 0; size2--) {
                ((InterfaceC1883670z7N) ListProtector.get(this.LLJJIJIL, size2)).LIZ(c1888650zFP2);
            }
        }
        this.LLILLJJLI = c1888650zFP;
        if (c1888650zFP != null) {
            for (int size3 = this.LLJJIJIL.size() - 1; size3 >= 0; size3--) {
                ((InterfaceC1883670z7N) ListProtector.get(this.LLJJIJIL, size3)).LIZIZ(c1888650zFP, z2, z3);
            }
        }
    }

    public final void LJIILL(int i, float f, boolean z, boolean z2) {
        int iRound = Math.round(i + f);
        if (iRound >= 0 && iRound < this.LLILLL.getChildCount()) {
            if (z2) {
                C19YV c19yv = this.LLILLL;
                ValueAnimator valueAnimator = c19yv.LLJI;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    c19yv.LLJI.cancel();
                }
                c19yv.LLILLL = i;
                c19yv.LLILZ = f;
                c19yv.LIZIZ();
            }
            ValueAnimator valueAnimator2 = this.LLJJJIL;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.LLJJJIL.cancel();
            }
            scrollTo(LJI(i, f), 0);
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
