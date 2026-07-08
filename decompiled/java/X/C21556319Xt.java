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
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.19Xt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
@InterfaceC21561419Zs
public class C21556319Xt extends HorizontalScrollView {
    public static final C12DM LLL = new C12DM();
    public static final C1085640eME LLLF = new C1085640eME(16);
    public final ArrayList<C21556219Xs> LL;
    public C21556219Xs LLILLJJLI;
    public final C21556419Xu LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public ColorStateList LLJI;
    public final float LLJIJIL;
    public final float LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public final int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public boolean LLJJJIL;
    public InterfaceC21556819Xy LLJJJJ;
    public final ArrayList<InterfaceC21556819Xy> LLJJJJJIL;
    public C1811470xEv LLJJJJLIIL;
    public ValueAnimator LLJJL;
    public ViewPager LLJJLIIIJLLLLLLLZ;
    public PagerAdapter LLJL;
    public C21556919Xz LLJLIL;
    public C21556519Xv LLJLILLLLZIIL;
    public C21556719Xx LLJLL;
    public boolean LLJLLIL;
    public float LLJLLL;
    public final C1085650eMF LLJZ;
    public final int LLJZIJLIL;

    public void setOnTabClickListener(C19Y0 c19y0) {
    }

    private int getDefaultHeight() {
        int size = this.LL.size();
        for (int i = 0; i < size; i++) {
            C21556219Xs c21556219Xs = (C21556219Xs) ListProtector.get(this.LL, i);
            if (c21556219Xs != null && c21556219Xs.LIZ != null && !TextUtils.isEmpty(c21556219Xs.LIZIZ)) {
                return 72;
            }
        }
        return 48;
    }

    private float getScrollPosition() {
        return r2.LLILLL + this.LLILLL.LLILZ;
    }

    private int getTabMinWidth() {
        int i = this.LLJJ;
        if (i != -1) {
            return i;
        }
        if (this.LLJJIJIL == 0) {
            return this.LLJJIII;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.LLILLL.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public final void LJFF() {
        this.LLILLL.setPaddingRelative(this.LLJJIJIL == 0 ? Math.max(0, this.LLJJIJI - this.LLILZIL) : 0, 0, 0, 0);
        int i = this.LLJJIJIL;
        if (i == 0) {
            this.LLILLL.setGravity(8388611);
        } else if (i == 1) {
            this.LLILLL.setGravity(1);
        }
        LJIIZILJ(true);
    }

    public final void LJII() {
        if (this.LLJJL == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LLJJL = valueAnimator;
            valueAnimator.setInterpolator(LLL);
            this.LLJJL.setDuration(200L);
            this.LLJJL.addUpdateListener(new AUListenerS280S0100000_33(this, 7));
        }
    }

    public final void LJIIJJI() {
        for (int childCount = this.LLILLL.getChildCount() - 1; childCount >= 0; childCount--) {
            C21556119Xr c21556119Xr = (C21556119Xr) this.LLILLL.getChildAt(childCount);
            C21556419Xu c21556419Xu = this.LLILLL;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c21556419Xu, null);
            c21556419Xu.removeViewAt(childCount);
            if (c21556119Xr != null) {
                c21556119Xr.setTab(null);
                c21556119Xr.setSelected(false);
                this.LLJZ.LIZ(c21556119Xr);
            }
            requestLayout();
        }
        Iterator<C21556219Xs> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            C21556219Xs next = it2.next();
            it2.remove();
            next.LJI = null;
            next.LJII = null;
            next.LIZ = null;
            next.LIZIZ = null;
            next.LIZJ = null;
            next.LIZLLL = -1;
            next.LJ = null;
            next.LJFF = -1;
            LLLF.LIZ(next);
        }
        this.LLILLJJLI = null;
    }

    public int getSelectedTabPosition() {
        C21556219Xs c21556219Xs = this.LLILLJJLI;
        if (c21556219Xs != null) {
            return c21556219Xs.LIZLLL;
        }
        return -1;
    }

    public int getTabCount() {
        return this.LL.size();
    }

    public int getTabStripLeftPadding() {
        return this.LLILLL.getPaddingLeft();
    }

    public int getTabStripRightPadding() {
        return this.LLILLL.getPaddingRight();
    }

    public void LJIIJ() {
        int currentItem;
        LJIIJJI();
        PagerAdapter pagerAdapter = this.LLJL;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                C21556219Xs c21556219XsLJIIIZ = LJIIIZ(this.LLJJJ);
                c21556219XsLJIIIZ.LIZIZ = this.LLJL.LJIJJLI(i);
                c21556219XsLJIIIZ.LIZ();
                LIZJ(c21556219XsLJIIIZ, false);
            }
            ViewPager viewPager = this.LLJJLIIIJLLLLLLLZ;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            Map<String, Object> map = C1338270kvh.LIZ;
            LJIIL(LJIIIIZZ(currentItem), true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLJJLIIIJLLLLLLLZ == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                LJIILL((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLJLLIL) {
            setupWithViewPager(null);
            this.LLJLLIL = false;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public int getTabGravity() {
        return this.LLJJIJIIJIL;
    }

    public int getTabMaxWidth() {
        return this.LLJILLL;
    }

    public int getTabMode() {
        return this.LLJJIJIL;
    }

    public ColorStateList getTabTextColors() {
        return this.LLJI;
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

    public final void LIZIZ(InterfaceC21556819Xy interfaceC21556819Xy) {
        if (!this.LLJJJJJIL.contains(interfaceC21556819Xy)) {
            this.LLJJJJJIL.add(interfaceC21556819Xy);
        }
    }

    public final void LIZLLL(View view) {
        if (view instanceof C19Y1) {
            C21556219Xs c21556219XsLJIIIZ = LJIIIZ(0);
            view.getClass();
            if (!TextUtils.isEmpty(view.getContentDescription())) {
                c21556219XsLJIIIZ.LIZJ = view.getContentDescription();
                c21556219XsLJIIIZ.LIZ();
            }
            LIZJ(c21556219XsLJIIIZ, this.LL.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void LJ(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            C21556419Xu c21556419Xu = this.LLILLL;
            int childCount = c21556419Xu.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (c21556419Xu.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iLJI = LJI(i, 0.0f);
            if (scrollX != iLJI) {
                LJII();
                this.LLJJL.setIntValues(scrollX, iLJI);
                this.LLJJL.start();
            }
            this.LLILLL.LIZ(i, 200);
            return;
        }
        LJIILJJIL(i, 0.0f, true, true);
    }

    public final C21556219Xs LJIIIIZZ(int i) {
        if (i >= 0 && i < getTabCount()) {
            return (C21556219Xs) ListProtector.get(this.LL, i);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C21556219Xs LJIIIZ(int i) {
        C21556119Xr c21556119Xr;
        C21556219Xs c21556219Xs = (C21556219Xs) LLLF.LIZIZ();
        if (c21556219Xs == null) {
            c21556219Xs = new C21556219Xs();
        }
        c21556219Xs.LJI = this;
        if (c21556219Xs.LJII == null) {
            C1085650eMF c1085650eMF = this.LLJZ;
            if (c1085650eMF == null || (c21556119Xr = (C21556119Xr) c1085650eMF.LIZIZ()) == null) {
                c21556119Xr = new C21556119Xr(this, getContext());
            }
            c21556119Xr.setFocusable(true);
            c21556119Xr.setMinimumWidth(getTabMinWidth());
            c21556219Xs.LJII = c21556119Xr;
        }
        if (i > 0) {
            C21556119Xr c21556119Xr2 = c21556219Xs.LJII;
            if (c21556219Xs != c21556119Xr2.LL) {
                c21556119Xr2.LL = c21556219Xs;
            }
            if (c21556219Xs.LJFF == i && c21556219Xs.LJ != null) {
                return c21556219Xs;
            }
            c21556219Xs.LJFF = i;
            c21556219Xs.LJ = C786410Ut5.Td(C786410Ut5.ne(c21556119Xr2.getContext()), i, c21556219Xs.LJII, false);
            c21556219Xs.LIZ();
            return c21556219Xs;
        }
        c21556219Xs.LJII.setTab(c21556219Xs);
        return c21556219Xs;
    }

    public final void LJIILLIIL(LinearLayout.LayoutParams layoutParams) {
        if (this.LLJJIJIL == 1 && this.LLJJIJIIJIL == 0) {
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

    public final void LJIIZILJ(boolean z) {
        for (int i = 0; i < this.LLILLL.getChildCount(); i++) {
            View childAt = this.LLILLL.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LJIILLIIL((LinearLayout.LayoutParams) childAt.getLayoutParams());
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
        this.LLJJJIL = z;
    }

    public void setContentInsetStart(int i) {
        this.LLJJIJI = i;
    }

    public void setCustomTabViewResId(int i) {
        this.LLJJJ = i;
    }

    public void setOnTabSelectedListener(InterfaceC21556819Xy interfaceC21556819Xy) {
        InterfaceC21556819Xy interfaceC21556819Xy2 = this.LLJJJJ;
        if (interfaceC21556819Xy2 != null) {
            this.LLJJJJJIL.remove(interfaceC21556819Xy2);
        }
        this.LLJJJJ = interfaceC21556819Xy;
        if (interfaceC21556819Xy != null) {
            LIZIZ(interfaceC21556819Xy);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        LJII();
        this.LLJJL.addListener(animatorListener);
    }

    public void setSelectedTabHorizontalPadding(int i) {
        this.LLILLL.LLJILJIL = i;
    }

    public void setSelectedTabIndicatorColor(int i) {
        C21556419Xu c21556419Xu = this.LLILLL;
        if (c21556419Xu.LLILLJJLI.getColor() != i) {
            c21556419Xu.LLILLJJLI.setColor(i);
            c21556419Xu.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        C21556419Xu c21556419Xu = this.LLILLL;
        if (c21556419Xu.LL != i) {
            c21556419Xu.LL = i;
            c21556419Xu.postInvalidateOnAnimation();
        }
    }

    public void setTabBackgroundResId(int i) {
        this.LLJILJILJ = i;
    }

    public void setTabGravity(int i) {
        if (this.LLJJIJIIJIL != i) {
            this.LLJJIJIIJIL = i;
            LJFF();
        }
    }

    public void setTabMargin(int i) {
        float f = i;
        this.LLILZ = (int) C497740JfY.LIZIZ(f);
        for (int i2 = 0; i2 < getTabCount(); i2++) {
            View childAt = this.LLILLL.getChildAt(i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = (int) C497740JfY.LIZIZ(f);
            marginLayoutParams.rightMargin = (int) C497740JfY.LIZIZ(f);
            C786410Ut5.W5(childAt, marginLayoutParams);
        }
    }

    public void setTabMaxWidth(int i) {
        this.LLJJI = i;
    }

    public void setTabMinWidth(int i) {
        this.LLJJ = i;
    }

    public void setTabMode(String str) {
        str.getClass();
        if (!str.equals("scrollable")) {
            if (str.equals("fixed") && this.LLJJIJIL != 1) {
                this.LLJJIJIL = 1;
                LJFF();
                return;
            }
            return;
        }
        if (this.LLJJIJIL == 0) {
            return;
        }
        this.LLJJIJIL = 0;
        LJFF();
    }

    public void setTabPaddingBottom(int i) {
        this.LLIZLLLIL = i;
    }

    public void setTabPaddingEnd(int i) {
        this.LLIZ = i;
    }

    public void setTabPaddingStart(int i) {
        this.LLILZIL = i;
    }

    public void setTabPaddingTop(int i) {
        this.LLILZLL = i;
    }

    public void setTabTextAppearance(int i) {
        this.LLJ = i;
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.LLJI != colorStateList) {
            this.LLJI = colorStateList;
            int size = this.LL.size();
            for (int i = 0; i < size; i++) {
                ((C21556219Xs) ListProtector.get(this.LL, i)).LIZ();
            }
        }
    }

    public void setTabViewLayoutWeight(Float f) {
        this.LLJLLL = f.floatValue();
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        LJIILIIL(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        LJIILL(viewPager, false);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void setTabMode(int i) {
        if (i != this.LLJJIJIL) {
            this.LLJJIJIL = i;
            LJFF();
        }
    }

    public C21556319Xt(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new ArrayList<>();
        this.LLJILLL = Integer.MAX_VALUE;
        this.LLJJJJJIL = new ArrayList<>();
        this.LLJLLL = 0.0f;
        this.LLJZ = new C1085650eMF(12);
        setHorizontalScrollBarEnabled(false);
        C21556419Xu c21556419Xu = new C21556419Xu(this, context);
        this.LLILLL = c21556419Xu;
        super.addView(c21556419Xu, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TabLayout, 0, R.style.a2k);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabIndicatorHeight, 0);
        if (c21556419Xu.LL != dimensionPixelSize) {
            c21556419Xu.LL = dimensionPixelSize;
            c21556419Xu.postInvalidateOnAnimation();
        }
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TabLayout_tabIndicatorColor, 0);
        if (c21556419Xu.LLILLJJLI.getColor() != color) {
            c21556419Xu.LLILLJJLI.setColor(color);
            c21556419Xu.postInvalidateOnAnimation();
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPadding, 0);
        this.LLILZIL = dimensionPixelSize2;
        this.LLILZLL = dimensionPixelSize2;
        this.LLIZ = dimensionPixelSize2;
        this.LLIZLLLIL = dimensionPixelSize2;
        this.LLILZIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingStart, dimensionPixelSize2);
        this.LLILZLL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingTop, this.LLILZLL);
        this.LLIZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingEnd, this.LLIZ);
        this.LLIZLLLIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingBottom, this.LLIZLLLIL);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TabLayout_tabTextAppearance, R.style.qb);
        this.LLJ = resourceId;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, R$styleable.TextAppearance);
        try {
            this.LLJIJIL = typedArrayObtainStyledAttributes2.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, 0);
            this.LLJI = typedArrayObtainStyledAttributes2.getColorStateList(R$styleable.TextAppearance_android_textColor);
            typedArrayObtainStyledAttributes2.recycle();
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.TabLayout_tabTextColor)) {
                this.LLJI = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.TabLayout_tabTextColor);
            }
            if (typedArrayObtainStyledAttributes.hasValue(R$styleable.TabLayout_tabSelectedTextColor)) {
                this.LLJI = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{typedArrayObtainStyledAttributes.getColor(R$styleable.TabLayout_tabSelectedTextColor, 0), this.LLJI.getDefaultColor()});
            }
            this.LLJJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabMinWidth, -1);
            this.LLJJI = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabMaxWidth, -1);
            this.LLJILJILJ = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TabLayout_tabBackground, 0);
            this.LLJJIJI = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabContentStart, 0);
            this.LLJJIJIL = typedArrayObtainStyledAttributes.getInt(R$styleable.TabLayout_tabMode, 1);
            this.LLJJIJIIJIL = typedArrayObtainStyledAttributes.getInt(R$styleable.TabLayout_tabGravity, 0);
            typedArrayObtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.LLJILJIL = resources.getDimensionPixelSize(R.dimen.rd);
            this.LLJJIII = resources.getDimensionPixelSize(R.dimen.rb);
            C497740JfY.LIZIZ(1.5f);
            C497740JfY.LIZIZ(1.5f);
            this.LLJZIJLIL = getResources().getConfiguration().orientation;
            LJFF();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public final void LIZJ(C21556219Xs c21556219Xs, boolean z) {
        LinearLayout.LayoutParams layoutParams;
        int size = this.LL.size();
        if (c21556219Xs.LJI == this) {
            c21556219Xs.LIZLLL = size;
            ListProtector.add(this.LL, size, c21556219Xs);
            int size2 = this.LL.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                } else {
                    ((C21556219Xs) ListProtector.get(this.LL, size)).LIZLLL = size;
                }
            }
            C21556119Xr c21556119Xr = c21556219Xs.LJII;
            C21556419Xu c21556419Xu = this.LLILLL;
            int i = c21556219Xs.LIZLLL;
            if (this.LLJLLL > 0.0f) {
                layoutParams = new LinearLayout.LayoutParams(-2, -1, this.LLJLLL);
            } else {
                layoutParams = new LinearLayout.LayoutParams(-2, -1);
            }
            LJIILLIIL(layoutParams);
            c21556419Xu.addView(c21556119Xr, i, layoutParams);
            if (z) {
                C21556319Xt c21556319Xt = c21556219Xs.LJI;
                if (c21556319Xt != null) {
                    c21556319Xt.LJIIL(c21556219Xs, true);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final int LJI(int i, float f) {
        View childAt;
        int width;
        int width2 = 0;
        if (this.LLJJIJIL != 0) {
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

    public final void LJIIL(C21556219Xs c21556219Xs, boolean z) {
        int i;
        C21556219Xs c21556219Xs2 = this.LLILLJJLI;
        if (c21556219Xs2 == c21556219Xs) {
            if (c21556219Xs2 != null) {
                for (int size = this.LLJJJJJIL.size() - 1; size >= 0; size--) {
                    ((InterfaceC21556819Xy) ListProtector.get(this.LLJJJJJIL, size)).LIZ();
                }
                LJ(c21556219Xs.LIZLLL);
                return;
            }
            return;
        }
        if (c21556219Xs != null) {
            i = c21556219Xs.LIZLLL;
        } else {
            i = -1;
        }
        if (z) {
            if ((c21556219Xs2 == null || c21556219Xs2.LIZLLL == -1) && i != -1) {
                LJIILJJIL(i, 0.0f, true, true);
            } else {
                LJ(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        if (c21556219Xs2 != null) {
            int size2 = this.LLJJJJJIL.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                } else {
                    ((InterfaceC21556819Xy) ListProtector.get(this.LLJJJJJIL, size2)).LIZJ(c21556219Xs2);
                }
            }
        }
        this.LLILLJJLI = c21556219Xs;
        if (c21556219Xs != null) {
            for (int size3 = this.LLJJJJJIL.size() - 1; size3 >= 0; size3--) {
                ((InterfaceC21556819Xy) ListProtector.get(this.LLJJJJJIL, size3)).LIZIZ(c21556219Xs);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.19Xz] */
    public void LJIILIIL(PagerAdapter pagerAdapter, boolean z) {
        C21556919Xz c21556919Xz;
        PagerAdapter pagerAdapter2 = this.LLJL;
        if (pagerAdapter2 != null && (c21556919Xz = this.LLJLIL) != null) {
            pagerAdapter2.LJJIJIIJIL(c21556919Xz);
        }
        this.LLJL = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.LLJLIL == null) {
                this.LLJLIL = new DataSetObserver() { // from class: X.19Xz
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        this.LIZ.LJIIJ();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        this.LIZ.LJIIJ();
                    }
                };
            }
            pagerAdapter.LJJII(this.LLJLIL);
        }
        LJIIJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0xEv, X.19Xy] */
    public final void LJIILL(final ViewPager viewPager, boolean z) {
        ViewPager viewPager2 = this.LLJJLIIIJLLLLLLLZ;
        if (viewPager2 != null) {
            C21556519Xv c21556519Xv = this.LLJLILLLLZIIL;
            if (c21556519Xv != null) {
                viewPager2.removeOnPageChangeListener(c21556519Xv);
            }
            C21556719Xx c21556719Xx = this.LLJLL;
            if (c21556719Xx != null) {
                this.LLJJLIIIJLLLLLLLZ.removeOnAdapterChangeListener(c21556719Xx);
            }
        }
        C1811470xEv c1811470xEv = this.LLJJJJLIIL;
        if (c1811470xEv != null) {
            this.LLJJJJJIL.remove(c1811470xEv);
            this.LLJJJJLIIL = null;
        }
        if (viewPager != null) {
            this.LLJJLIIIJLLLLLLLZ = viewPager;
            if (this.LLJLILLLLZIIL == null) {
                this.LLJLILLLLZIIL = new C21556519Xv(this);
            }
            C21556519Xv c21556519Xv2 = this.LLJLILLLLZIIL;
            c21556519Xv2.LLILLJJLI = 0;
            c21556519Xv2.LLILLL = 0;
            viewPager.addOnPageChangeListener(c21556519Xv2);
            ?? r0 = new InterfaceC21556819Xy(viewPager) { // from class: X.0xEv
                public final ViewPager LIZ;

                @Override // X.InterfaceC21556819Xy
                public final void LIZ() {
                }

                @Override // X.InterfaceC21556819Xy
                public final void LIZJ(C21556219Xs c21556219Xs) {
                }

                {
                    this.LIZ = viewPager;
                }

                @Override // X.InterfaceC21556819Xy
                public final void LIZIZ(C21556219Xs c21556219Xs) {
                    this.LIZ.setCurrentItem(c21556219Xs.LIZLLL);
                }
            };
            this.LLJJJJLIIL = r0;
            LIZIZ(r0);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                LJIILIIL(adapter, true);
            }
            if (this.LLJLL == null) {
                this.LLJLL = new C21556719Xx(this);
            }
            C21556719Xx c21556719Xx2 = this.LLJLL;
            c21556719Xx2.LL = true;
            viewPager.addOnAdapterChangeListener(c21556719Xx2);
            LJIILJJIL(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.LLJJLIIIJLLLLLLLZ = null;
            LJIILIIL(null, false);
        }
        this.LLJLLIL = z;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        LIZLLL(view);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iLIZIZ = ((int) C497740JfY.LIZIZ(getDefaultHeight())) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(iLIZIZ, 1073741824);
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(iLIZIZ, View.MeasureSpec.getSize(i2)), 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iLIZIZ2 = this.LLJJI;
            if (iLIZIZ2 <= 0) {
                iLIZIZ2 = size - ((int) C497740JfY.LIZIZ(56.0f));
            }
            this.LLJILLL = iLIZIZ2;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.LLJJIJIL;
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

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        LIZLLL(view);
    }

    public final void LJIILJJIL(int i, float f, boolean z, boolean z2) {
        int iRound = Math.round(i + f);
        if (iRound >= 0 && iRound < this.LLILLL.getChildCount()) {
            if (z2) {
                C21556419Xu c21556419Xu = this.LLILLL;
                ValueAnimator valueAnimator = c21556419Xu.LLIZ;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    c21556419Xu.LLIZ.cancel();
                }
                c21556419Xu.LLILLL = i;
                c21556419Xu.LLILZ = f;
                c21556419Xu.LIZIZ();
            }
            ValueAnimator valueAnimator2 = this.LLJJL;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.LLJJL.cancel();
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
