package X;

import Y.AUListenerS279S0100000_32;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.19YK, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@InterfaceC21561419Zs
public class C19YK extends HorizontalScrollView implements InterfaceC1353150lJh {
    public static final C12DM LLLF = new C12DM();
    public static final C1085640eME LLLFF = new C1085640eME(16);
    public InterfaceC1353160lJi LL;
    public final ArrayList<C1383090m5z> LLILLJJLI;
    public C1383090m5z LLILLL;
    public final C19YL LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public ColorStateList LLJI;
    public int LLJIJIL;
    public float LLJILJIL;
    public final float LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public final int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public C19YO LLJJJJJIL;
    public final ArrayList<C19YO> LLJJJJLIIL;
    public C1376980lw8 LLJJL;
    public ValueAnimator LLJJLIIIJLLLLLLLZ;
    public ViewPager LLJL;
    public PagerAdapter LLJLIL;
    public C19YP LLJLILLLLZIIL;
    public C19YM LLJLL;
    public C19YN LLJLLIL;
    public boolean LLJLLL;
    public InterfaceC1344620l5w LLJZ;
    public final C1085650eMF LLJZIJLIL;
    public final int LLL;

    private int getDefaultHeight() {
        int size = this.LLILLJJLI.size();
        for (int i = 0; i < size; i++) {
            C1383090m5z c1383090m5z = (C1383090m5z) ListProtector.get(this.LLILLJJLI, i);
            if (c1383090m5z != null && c1383090m5z.LIZ != null && !TextUtils.isEmpty(c1383090m5z.LIZIZ)) {
                return 72;
            }
        }
        return 48;
    }

    private float getScrollPosition() {
        return r2.LLILLL + this.LLILZ.LLILZ;
    }

    private int getTabMinWidth() {
        int i = this.LLJJI;
        if (i != -1) {
            return i;
        }
        if (this.LLJJJ == 0) {
            return this.LLJJIJI;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.LLILZ.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public final void LJ() {
        this.LLILZ.setPaddingRelative(this.LLJJJ == 0 ? Math.max(0, this.LLJJIJIIJIL - this.LLILZLL) : 0, 0, 0, 0);
        int i = this.LLJJJ;
        if (i == 0) {
            this.LLILZ.setGravity(8388611);
        } else if (i == 1) {
            this.LLILZ.setGravity(1);
        }
        LJIILLIIL(true);
    }

    public final void LJII() {
        if (this.LLJJLIIIJLLLLLLLZ == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LLJJLIIIJLLLLLLLZ = valueAnimator;
            valueAnimator.setInterpolator(LLLF);
            this.LLJJLIIIJLLLLLLLZ.setDuration(200L);
            this.LLJJLIIIJLLLLLLLZ.addUpdateListener(new AUListenerS279S0100000_32(this, 5));
        }
    }

    public final void LJIIJ() {
        int currentItem;
        for (int childCount = this.LLILZ.getChildCount() - 1; childCount >= 0; childCount--) {
            C19YJ c19yj = (C19YJ) this.LLILZ.getChildAt(childCount);
            C19YL c19yl = this.LLILZ;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c19yl, null);
            c19yl.removeViewAt(childCount);
            if (c19yj != null) {
                c19yj.setTab(null);
                c19yj.setSelected(false);
                this.LLJZIJLIL.LIZ(c19yj);
            }
            requestLayout();
        }
        Iterator<C1383090m5z> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            C1383090m5z next = it2.next();
            it2.remove();
            next.LJI = null;
            next.LJII = null;
            next.LIZ = null;
            next.LIZIZ = null;
            next.LIZJ = null;
            next.LIZLLL = -1;
            next.LJ = null;
            next.LJFF = -1;
            LLLFF.LIZ(next);
        }
        this.LLILLL = null;
        PagerAdapter pagerAdapter = this.LLJLIL;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                C1383090m5z c1383090m5zLJIIIZ = LJIIIZ(this.LLJJJIL);
                c1383090m5zLJIIIZ.LIZIZ = this.LLJLIL.LJIJJLI(i);
                c1383090m5zLJIIIZ.LIZIZ();
                Object obj = this.LLJLIL;
                if (obj instanceof C19YQ) {
                    if (C295780Bia.LIZIZ) {
                        c1383090m5zLJIIIZ.LIZ = ((C19YQ) obj).LIZIZ(i, getContext());
                        c1383090m5zLJIIIZ.LIZIZ();
                    } else {
                        c1383090m5zLJIIIZ.LIZ = ((C19YQ) obj).LJIIJ(i);
                        c1383090m5zLJIIIZ.LIZIZ();
                    }
                }
                LIZIZ(c1383090m5zLJIIIZ, false);
            }
            ViewPager viewPager = this.LLJL;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            LJIIJJI(LJIIIIZZ(currentItem), true);
        }
    }

    public int getSelectedTabPosition() {
        C1383090m5z c1383090m5z = this.LLILLL;
        if (c1383090m5z != null) {
            return c1383090m5z.LIZLLL;
        }
        return -1;
    }

    public int getTabCount() {
        return this.LLILLJJLI.size();
    }

    public int getTabStripLeftPadding() {
        return this.LLILZ.getPaddingLeft();
    }

    public int getTabStripRightPadding() {
        return this.LLILZ.getPaddingRight();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLJL == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                LJIILJJIL((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLJLLL) {
            setupWithViewPager(null);
            this.LLJLLL = false;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public int getTabGravity() {
        return this.LLJJIJIL;
    }

    public int getTabMaxWidth() {
        return this.LLJJ;
    }

    public int getTabMode() {
        return this.LLJJJ;
    }

    public ColorStateList getTabTextColors() {
        return this.LLJI;
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.LLILZ.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.LLILZ.getChildAt(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    public final void LIZJ(View view) {
        if (view instanceof C19YS) {
            C1383090m5z c1383090m5zLJIIIZ = LJIIIZ(0);
            view.getClass();
            if (!TextUtils.isEmpty(view.getContentDescription())) {
                c1383090m5zLJIIIZ.LIZJ = view.getContentDescription();
                c1383090m5zLJIIIZ.LIZIZ();
            }
            LIZIZ(c1383090m5zLJIIIZ, this.LLILLJJLI.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void LIZLLL(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            C19YL c19yl = this.LLILZ;
            int childCount = c19yl.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (c19yl.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iLJFF = LJFF(i, 0.0f);
            if (scrollX != iLJFF) {
                LJII();
                this.LLJJLIIIJLLLLLLLZ.setIntValues(scrollX, iLJFF);
                this.LLJJLIIIJLLLLLLLZ.start();
            }
            this.LLILZ.LIZ(i, 200);
            return;
        }
        LJIILIIL(i, 0.0f, true, true);
    }

    public final int LJI(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    public final C1383090m5z LJIIIIZZ(int i) {
        if (i >= 0 && i < getTabCount()) {
            return (C1383090m5z) ListProtector.get(this.LLILLJJLI, i);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1383090m5z LJIIIZ(int i) {
        C19YJ c19yj;
        C1383090m5z c1383090m5z = (C1383090m5z) LLLFF.LIZIZ();
        if (c1383090m5z == null) {
            c1383090m5z = new C1383090m5z();
        }
        c1383090m5z.LJI = this;
        if (c1383090m5z.LJII == null) {
            C1085650eMF c1085650eMF = this.LLJZIJLIL;
            if (c1085650eMF == null || (c19yj = (C19YJ) c1085650eMF.LIZIZ()) == null) {
                c19yj = new C19YJ(this, getContext());
            }
            c19yj.setFocusable(true);
            c19yj.setMinimumWidth(getTabMinWidth());
            c1383090m5z.LJII = c19yj;
        }
        if (i > 0) {
            C19YJ c19yj2 = c1383090m5z.LJII;
            if (c1383090m5z != c19yj2.LL) {
                c19yj2.LL = c1383090m5z;
            }
            if (c1383090m5z.LJFF == i && c1383090m5z.LJ != null) {
                return c1383090m5z;
            }
            c1383090m5z.LJFF = i;
            c1383090m5z.LJ = C786410Ut5.Td(C786410Ut5.ne(c19yj2.getContext()), i, c1383090m5z.LJII, false);
            c1383090m5z.LIZIZ();
            return c1383090m5z;
        }
        c1383090m5z.LJII.setTab(c1383090m5z);
        return c1383090m5z;
    }

    public final void LJIILL(LinearLayout.LayoutParams layoutParams) {
        if (this.LLJJJ == 1 && this.LLJJIJIL == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        int i = this.LLILZIL;
        if (i != 0) {
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = i;
        }
    }

    public final void LJIILLIIL(boolean z) {
        for (int i = 0; i < this.LLILZ.getChildCount(); i++) {
            View childAt = this.LLILZ.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LJIILL((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        LIZJ(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && this.LL == null) {
            ViewParent parent = getParent();
            while (true) {
                if (parent == null) {
                    break;
                }
                if (parent instanceof InterfaceC1353160lJi) {
                    ((InterfaceC1353160lJi) parent).LIZIZ();
                    break;
                }
                parent = parent.getParent();
            }
            InterfaceC1353160lJi interfaceC1353160lJi = (InterfaceC1353160lJi) parent;
            this.LL = interfaceC1353160lJi;
            if (interfaceC1353160lJi != null) {
                interfaceC1353160lJi.LIZ(this);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setAutoFillWhenScrollable(boolean z) {
        this.LLJJJJ = z;
    }

    public void setContentInsetStart(int i) {
        this.LLJJIJIIJIL = i;
    }

    public void setCustomTabViewResId(int i) {
        this.LLJJJIL = i;
    }

    public void setOnTabClickListener(InterfaceC1344620l5w interfaceC1344620l5w) {
        this.LLJZ = interfaceC1344620l5w;
    }

    public void setOnTabSelectedListener(C19YO c19yo) {
        C19YO c19yo2 = this.LLJJJJJIL;
        if (c19yo2 != null) {
            this.LLJJJJLIIL.remove(c19yo2);
        }
        this.LLJJJJJIL = c19yo;
        if (c19yo != null && !this.LLJJJJLIIL.contains(c19yo)) {
            this.LLJJJJLIIL.add(c19yo);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        LJII();
        this.LLJJLIIIJLLLLLLLZ.addListener(animatorListener);
    }

    public void setSelectedTabHorizontalPadding(int i) {
        this.LLILZ.LLJILJIL = i;
    }

    public void setSelectedTabIndicatorColor(int i) {
        C19YL c19yl = this.LLILZ;
        if (c19yl.LLILLJJLI.getColor() != i) {
            c19yl.LLILLJJLI.setColor(i);
            c19yl.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        C19YL c19yl = this.LLILZ;
        if (c19yl.LL != i) {
            c19yl.LL = i;
            c19yl.postInvalidateOnAnimation();
        }
    }

    public void setTabBackgroundResId(int i) {
        this.LLJILLL = i;
    }

    public void setTabGravity(int i) {
        if (this.LLJJIJIL != i) {
            this.LLJJIJIL = i;
            LJ();
        }
    }

    public void setTabMargin(int i) {
        this.LLILZIL = LJI(i);
        for (int i2 = 0; i2 < getTabCount(); i2++) {
            View childAt = this.LLILZ.getChildAt(i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = LJI(i);
            marginLayoutParams.rightMargin = LJI(i);
            C786410Ut5.W5(childAt, marginLayoutParams);
        }
    }

    public void setTabMaxWidth(int i) {
        this.LLJJIII = i;
    }

    public void setTabMinWidth(int i) {
        this.LLJJI = i;
    }

    public void setTabMode(String str) {
        str.getClass();
        if (!str.equals("scrollable")) {
            if (str.equals("fixed") && this.LLJJJ != 1) {
                this.LLJJJ = 1;
                LJ();
                return;
            }
            return;
        }
        if (this.LLJJJ == 0) {
            return;
        }
        this.LLJJJ = 0;
        LJ();
    }

    public void setTabPaddingBottom(int i) {
        this.LLJ = i;
    }

    public void setTabPaddingEnd(int i) {
        this.LLIZLLLIL = i;
    }

    public void setTabPaddingStart(int i) {
        this.LLILZLL = i;
    }

    public void setTabPaddingTop(int i) {
        this.LLIZ = i;
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.LLJI != colorStateList) {
            this.LLJI = colorStateList;
            int size = this.LLILLJJLI.size();
            for (int i = 0; i < size; i++) {
                ((C1383090m5z) ListProtector.get(this.LLILLJJLI, i)).LIZIZ();
            }
        }
    }

    public void setTabTuxFont(int i) {
        this.LLJIJIL = i;
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        LJIIL(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        LJIILJJIL(viewPager, false);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void setTabMode(int i) {
        if (i != this.LLJJJ) {
            this.LLJJJ = i;
            LJ();
        }
    }

    public C19YK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = new ArrayList<>();
        this.LLJJ = Integer.MAX_VALUE;
        this.LLJJJJLIIL = new ArrayList<>();
        this.LLJZIJLIL = new C1085650eMF(12);
        setHorizontalScrollBarEnabled(false);
        C19YL c19yl = new C19YL(this, context);
        this.LLILZ = c19yl;
        super.addView(c19yl, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TabLayout, 0, R.style.a2k);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabIndicatorHeight, 0);
        if (c19yl.LL != dimensionPixelSize) {
            c19yl.LL = dimensionPixelSize;
            c19yl.postInvalidateOnAnimation();
        }
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TabLayout_tabIndicatorColor, 0);
        if (c19yl.LLILLJJLI.getColor() != color) {
            c19yl.LLILLJJLI.setColor(color);
            c19yl.postInvalidateOnAnimation();
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPadding, 0);
        this.LLILZLL = dimensionPixelSize2;
        this.LLIZ = dimensionPixelSize2;
        this.LLIZLLLIL = dimensionPixelSize2;
        this.LLJ = dimensionPixelSize2;
        this.LLILZLL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingStart, dimensionPixelSize2);
        this.LLIZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingTop, this.LLIZ);
        this.LLIZLLLIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingEnd, this.LLIZLLLIL);
        this.LLJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabPaddingBottom, this.LLJ);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.TabLayout_tabTextColor)) {
            this.LLJI = typedArrayObtainStyledAttributes.getColorStateList(R$styleable.TabLayout_tabTextColor);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.TabLayout_tabSelectedTextColor)) {
            this.LLJI = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{typedArrayObtainStyledAttributes.getColor(R$styleable.TabLayout_tabSelectedTextColor, 0), this.LLJI.getDefaultColor()});
        }
        this.LLJJI = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabMinWidth, -1);
        this.LLJJIII = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabMaxWidth, -1);
        this.LLJILLL = typedArrayObtainStyledAttributes.getResourceId(R$styleable.TabLayout_tabBackground, 0);
        this.LLJJIJIIJIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabContentStart, 0);
        this.LLJJJ = typedArrayObtainStyledAttributes.getInt(R$styleable.TabLayout_tabMode, 1);
        this.LLJJIJIL = typedArrayObtainStyledAttributes.getInt(R$styleable.TabLayout_tabGravity, 0);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.CommentDmtTabLayout, 0, 0);
        this.LLJIJIL = typedArrayObtainStyledAttributes2.getInt(R$styleable.CommentDmtTabLayout_tux_font, 0);
        typedArrayObtainStyledAttributes2.recycle();
        Resources resources = getResources();
        this.LLJILJILJ = resources.getDimensionPixelSize(R.dimen.rd);
        this.LLJJIJI = resources.getDimensionPixelSize(R.dimen.rb);
        C12ES.LIZJ(1.5f, getContext());
        C12ES.LIZJ(1.5f, getContext());
        this.LLL = getResources().getConfiguration().orientation;
        LJ();
    }

    public final void LIZIZ(C1383090m5z c1383090m5z, boolean z) {
        int size = this.LLILLJJLI.size();
        if (c1383090m5z.LJI == this) {
            c1383090m5z.LIZLLL = size;
            ListProtector.add(this.LLILLJJLI, size, c1383090m5z);
            int size2 = this.LLILLJJLI.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                } else {
                    ((C1383090m5z) ListProtector.get(this.LLILLJJLI, size)).LIZLLL = size;
                }
            }
            C19YJ c19yj = c1383090m5z.LJII;
            C19YL c19yl = this.LLILZ;
            int i = c1383090m5z.LIZLLL;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            LJIILL(layoutParams);
            c19yl.addView(c19yj, i, layoutParams);
            if (z) {
                c1383090m5z.LIZ();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final int LJFF(int i, float f) {
        View childAt;
        int width;
        int width2;
        int left = 0;
        if (this.LLJJJ != 0) {
            return 0;
        }
        View childAt2 = this.LLILZ.getChildAt(i);
        int i2 = i + 1;
        if (i2 < this.LLILZ.getChildCount()) {
            childAt = this.LLILZ.getChildAt(i2);
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
        } else {
            width2 = 0;
        }
        if (childAt2 != null) {
            left = childAt2.getLeft();
        }
        int width3 = (left + (width / 2)) - (getWidth() / 2);
        int i3 = (int) ((width + width2 + (this.LLILZIL * 4)) * 0.5f * f);
        if (getLayoutDirection() == 0) {
            return width3 + i3;
        }
        return width3 - i3;
    }

    public final void LJIIJJI(C1383090m5z c1383090m5z, boolean z) {
        int i;
        C1383090m5z c1383090m5z2 = this.LLILLL;
        if (c1383090m5z2 == c1383090m5z) {
            if (c1383090m5z2 != null) {
                for (int size = this.LLJJJJLIIL.size() - 1; size >= 0; size--) {
                    ((C19YO) ListProtector.get(this.LLJJJJLIIL, size)).LIZ();
                }
                LIZLLL(c1383090m5z.LIZLLL);
                return;
            }
            return;
        }
        if (c1383090m5z != null) {
            i = c1383090m5z.LIZLLL;
        } else {
            i = -1;
        }
        if (z) {
            if ((c1383090m5z2 == null || c1383090m5z2.LIZLLL == -1) && i != -1) {
                LJIILIIL(i, 0.0f, true, true);
            } else {
                LIZLLL(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        if (c1383090m5z2 != null) {
            for (int size2 = this.LLJJJJLIIL.size() - 1; size2 >= 0; size2--) {
                ((C19YO) ListProtector.get(this.LLJJJJLIIL, size2)).LIZIZ(c1383090m5z2);
            }
        }
        this.LLILLL = c1383090m5z;
        if (c1383090m5z != null) {
            for (int size3 = this.LLJJJJLIIL.size() - 1; size3 >= 0; size3--) {
                ((C19YO) ListProtector.get(this.LLJJJJLIIL, size3)).LIZJ(c1383090m5z);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.19YP] */
    public final void LJIIL(PagerAdapter pagerAdapter, boolean z) {
        C19YP c19yp;
        PagerAdapter pagerAdapter2 = this.LLJLIL;
        if (pagerAdapter2 != null && (c19yp = this.LLJLILLLLZIIL) != null) {
            pagerAdapter2.LJJIJIIJIL(c19yp);
        }
        this.LLJLIL = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.LLJLILLLLZIIL == null) {
                this.LLJLILLLLZIIL = new DataSetObserver() { // from class: X.19YP
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
            pagerAdapter.LJJII(this.LLJLILLLLZIIL);
        }
        LJIIJ();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.0lw8, java.lang.Object] */
    public final void LJIILJJIL(final ViewPager viewPager, boolean z) {
        ViewPager viewPager2 = this.LLJL;
        if (viewPager2 != null) {
            C19YM c19ym = this.LLJLL;
            if (c19ym != null) {
                viewPager2.removeOnPageChangeListener(c19ym);
            }
            C19YN c19yn = this.LLJLLIL;
            if (c19yn != null) {
                this.LLJL.removeOnAdapterChangeListener(c19yn);
            }
        }
        C1376980lw8 c1376980lw8 = this.LLJJL;
        if (c1376980lw8 != null) {
            this.LLJJJJLIIL.remove(c1376980lw8);
            this.LLJJL = null;
        }
        if (viewPager != null) {
            this.LLJL = viewPager;
            if (this.LLJLL == null) {
                this.LLJLL = new C19YM(this);
            }
            C19YM c19ym2 = this.LLJLL;
            c19ym2.LLILLJJLI = 0;
            c19ym2.LLILLL = 0;
            viewPager.addOnPageChangeListener(c19ym2);
            ?? r1 = new C19YO(viewPager) { // from class: X.0lw8
                public final ViewPager LIZ;

                @Override // X.C19YO
                public final void LIZ() {
                }

                @Override // X.C19YO
                public final void LIZIZ(C1383090m5z c1383090m5z) {
                }

                {
                    this.LIZ = viewPager;
                }

                @Override // X.C19YO
                public final void LIZJ(C1383090m5z c1383090m5z) {
                    this.LIZ.setCurrentItem(c1383090m5z.LIZLLL);
                }
            };
            this.LLJJL = r1;
            if (!this.LLJJJJLIIL.contains(r1)) {
                this.LLJJJJLIIL.add((C19YO) r1);
            }
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                LJIIL(adapter, true);
            }
            if (this.LLJLLIL == null) {
                this.LLJLLIL = new C19YN(this);
            }
            C19YN c19yn2 = this.LLJLLIL;
            c19yn2.LL = true;
            viewPager.addOnAdapterChangeListener(c19yn2);
            LJIILIIL(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.LLJL = null;
            LJIIL(null, false);
        }
        this.LLJLLL = z;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        LIZJ(view);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iLJI = LJI(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(iLJI, 1073741824);
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(iLJI, View.MeasureSpec.getSize(i2)), 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iLJI2 = this.LLJJIII;
            if (iLJI2 <= 0) {
                iLJI2 = size - LJI(56);
            }
            this.LLJJ = iLJI2;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.LLJJJ;
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
        LIZJ(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        LIZJ(view);
    }

    public final void LJIILIIL(int i, float f, boolean z, boolean z2) {
        int iRound = Math.round(i + f);
        if (iRound >= 0 && iRound < this.LLILZ.getChildCount()) {
            if (z2) {
                C19YL c19yl = this.LLILZ;
                ValueAnimator valueAnimator = c19yl.LLIZ;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    c19yl.LLIZ.cancel();
                }
                c19yl.LLILLL = i;
                c19yl.LLILZ = f;
                c19yl.LIZIZ();
            }
            ValueAnimator valueAnimator2 = this.LLJJLIIIJLLLLLLLZ;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.LLJJLIIIJLLLLLLLZ.cancel();
            }
            scrollTo(LJFF(i, f), 0);
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
