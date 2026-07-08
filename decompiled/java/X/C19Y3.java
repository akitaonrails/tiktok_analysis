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
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.19Y3, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@InterfaceC21561419Zs
public class C19Y3 extends HorizontalScrollView {
    public static final C12DM LLL = new C12DM();
    public static final C1085640eME LLLF = new C1085640eME(16);
    public final ArrayList<C19Y5> LL;
    public C19Y5 LLILLJJLI;
    public final C19Y4 LLILLL;
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
    public InterfaceC20516715Px LLJJJJ;
    public final ArrayList<InterfaceC20516715Px> LLJJJJJIL;
    public C19504211Sm LLJJJJLIIL;
    public ValueAnimator LLJJL;
    public ViewPager LLJJLIIIJLLLLLLLZ;
    public PagerAdapter LLJL;
    public C19Y7 LLJLIL;
    public C20514715Pd LLJLILLLLZIIL;
    public C19Y6 LLJLL;
    public boolean LLJLLIL;
    public final String LLJLLL;
    public InterfaceC1245470iW1 LLJZ;
    public final C1085650eMF LLJZIJLIL;

    private int getDefaultHeight() {
        int size = this.LL.size();
        for (int i = 0; i < size; i++) {
            C19Y5 c19y5 = (C19Y5) ListProtector.get(this.LL, i);
            if (c19y5 != null && c19y5.LIZIZ != null && !TextUtils.isEmpty(c19y5.LIZJ)) {
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
        LJIJJ(true);
    }

    public final void LJIIIIZZ() {
        if (this.LLJJL == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LLJJL = valueAnimator;
            valueAnimator.setInterpolator(LLL);
            this.LLJJL.setDuration(200L);
            this.LLJJL.addUpdateListener(new AUListenerS280S0100000_33(this, 10));
        }
    }

    public final void LJIIL() {
        for (int childCount = this.LLILLL.getChildCount() - 1; childCount >= 0; childCount--) {
            C19Y2 c19y2 = (C19Y2) this.LLILLL.getChildAt(childCount);
            C19Y4 c19y4 = this.LLILLL;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c19y4, null);
            c19y4.removeViewAt(childCount);
            if (c19y2 != null) {
                c19y2.setTab(null);
                c19y2.setSelected(false);
                this.LLJZIJLIL.LIZ(c19y2);
            }
            requestLayout();
        }
        Iterator<C19Y5> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            C19Y5 next = it2.next();
            it2.remove();
            next.LJII = null;
            next.LJIIIIZZ = null;
            next.LIZ = null;
            next.LIZIZ = null;
            next.LIZJ = null;
            next.LIZLLL = null;
            next.LJ = -1;
            next.LJFF = null;
            next.LJI = -1;
            LLLF.LIZ(next);
        }
        this.LLILLJJLI = null;
    }

    public int getSelectedTabPosition() {
        C19Y5 c19y5 = this.LLILLJJLI;
        if (c19y5 != null) {
            return c19y5.LJ;
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

    public final void LJIIJJI() {
        int currentItem;
        LJIIL();
        PagerAdapter pagerAdapter = this.LLJL;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                C19Y5 c19y5LJIIJ = LJIIJ(this.LLJJJ);
                c19y5LJIIJ.LIZJ = this.LLJL.LJIJJLI(i);
                c19y5LJIIJ.LIZJ();
                LIZJ(c19y5LJIIJ, false);
            }
            ViewPager viewPager = this.LLJJLIIIJLLLLLLLZ;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            LJIILIIL(LJIIIZ(currentItem), true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLJJLIIIJLLLLLLLZ == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                LJIJ((ViewPager) parent, true);
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

    public final void LIZIZ(InterfaceC20516715Px interfaceC20516715Px) {
        if (!this.LLJJJJJIL.contains(interfaceC20516715Px)) {
            this.LLJJJJJIL.add(interfaceC20516715Px);
        }
    }

    public final void LIZLLL(View view) {
        if (view instanceof C19Y9) {
            C19Y5 c19y5LJIIJ = LJIIJ(0);
            view.getClass();
            if (!TextUtils.isEmpty(view.getContentDescription())) {
                c19y5LJIIJ.LIZLLL = view.getContentDescription();
                c19y5LJIIJ.LIZJ();
            }
            LIZJ(c19y5LJIIJ, this.LL.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void LJ(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            C19Y4 c19y4 = this.LLILLL;
            int childCount = c19y4.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (c19y4.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iLJI = LJI(i, 0.0f);
            if (scrollX != iLJI) {
                LJIIIIZZ();
                this.LLJJL.setIntValues(scrollX, iLJI);
                this.LLJJL.start();
            }
            this.LLILLL.LIZ(i, 200);
            return;
        }
        LJIILL(i, 0.0f, true, true);
    }

    public final int LJII(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    public final C19Y5 LJIIIZ(int i) {
        if (i >= 0 && i < getTabCount()) {
            return (C19Y5) ListProtector.get(this.LL, i);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C19Y5 LJIIJ(int i) {
        C19Y2 c19y2;
        C19Y5 c19y5 = (C19Y5) LLLF.LIZIZ();
        if (c19y5 == null) {
            c19y5 = new C19Y5();
        }
        c19y5.LJII = this;
        if (c19y5.LJIIIIZZ == null) {
            C1085650eMF c1085650eMF = this.LLJZIJLIL;
            if (c1085650eMF == null || (c19y2 = (C19Y2) c1085650eMF.LIZIZ()) == null) {
                c19y2 = new C19Y2(this, getContext());
            }
            c19y2.setFocusable(true);
            c19y2.setMinimumWidth(getTabMinWidth());
            c19y5.LJIIIIZZ = c19y2;
        }
        if (i > 0) {
            C19Y2 c19y22 = c19y5.LJIIIIZZ;
            if (c19y5 != c19y22.LL) {
                c19y22.LL = c19y5;
            }
            if (c19y5.LJI == i && c19y5.LJFF != null) {
                return c19y5;
            }
            c19y5.LJI = i;
            c19y5.LJFF = C786410Ut5.Td(C786410Ut5.ne(c19y22.getContext()), i, c19y5.LJIIIIZZ, false);
            c19y5.LIZJ();
            return c19y5;
        }
        c19y5.LJIIIIZZ.setTab(c19y5);
        return c19y5;
    }

    public final void LJIJI(LinearLayout.LayoutParams layoutParams) {
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

    public final void LJIJJ(boolean z) {
        for (int i = 0; i < this.LLILLL.getChildCount(); i++) {
            View childAt = this.LLILLL.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LJIJI((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        LIZLLL(view);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(C20093113jd.LIZ(1, this.LL.size()));
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

    public void setMarginBetweenTabs(int i) {
        this.LLILZ = LJII(i);
        for (int i2 = 0; i2 < getTabCount(); i2++) {
            View childAt = this.LLILLL.getChildAt(i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (i2 != 0) {
                marginLayoutParams.leftMargin = LJII(i);
            }
            if (i2 != getTabCount() - 1) {
                marginLayoutParams.rightMargin = LJII(i);
            }
            C786410Ut5.W5(childAt, marginLayoutParams);
        }
    }

    public void setOnTabClickListener(InterfaceC1245470iW1 interfaceC1245470iW1) {
        this.LLJZ = interfaceC1245470iW1;
    }

    public void setOnTabSelectedListener(InterfaceC20516715Px interfaceC20516715Px) {
        InterfaceC20516715Px interfaceC20516715Px2 = this.LLJJJJ;
        if (interfaceC20516715Px2 != null) {
            this.LLJJJJJIL.remove(interfaceC20516715Px2);
        }
        this.LLJJJJ = interfaceC20516715Px;
        if (interfaceC20516715Px != null) {
            LIZIZ(interfaceC20516715Px);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        LJIIIIZZ();
        this.LLJJL.addListener(animatorListener);
    }

    public void setSelectedTabHorizontalPadding(int i) {
        this.LLILLL.LLJILJIL = i;
    }

    public void setSelectedTabIndicatorColor(int i) {
        C19Y4 c19y4 = this.LLILLL;
        if (c19y4.LLILLJJLI.getColor() != i) {
            c19y4.LLILLJJLI.setColor(i);
            c19y4.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        C19Y4 c19y4 = this.LLILLL;
        if (c19y4.LL != i) {
            c19y4.LL = i;
            c19y4.postInvalidateOnAnimation();
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
        this.LLILZ = LJII(i);
        for (int i2 = 0; i2 < getTabCount(); i2++) {
            View childAt = this.LLILLL.getChildAt(i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = LJII(i);
            marginLayoutParams.rightMargin = LJII(i);
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
                ((C19Y5) ListProtector.get(this.LL, i)).LIZJ();
            }
        }
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        LJIILJJIL(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        LJIJ(viewPager, false);
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

    public C19Y3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new ArrayList<>();
        this.LLJILLL = Integer.MAX_VALUE;
        this.LLJJJJJIL = new ArrayList<>();
        this.LLJLLL = C20642515q3.LJI(2131823349);
        this.LLJZIJLIL = new C1085650eMF(12);
        setHorizontalScrollBarEnabled(false);
        C19Y4 c19y4 = new C19Y4(this, context);
        this.LLILLL = c19y4;
        super.addView(c19y4, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TabLayout, 0, R.style.a2k);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TabLayout_tabIndicatorHeight, 0);
        if (c19y4.LL != dimensionPixelSize) {
            c19y4.LL = dimensionPixelSize;
            c19y4.postInvalidateOnAnimation();
        }
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TabLayout_tabIndicatorColor, 0);
        if (c19y4.LLILLJJLI.getColor() != color) {
            c19y4.LLILLJJLI.setColor(color);
            c19y4.postInvalidateOnAnimation();
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
            C12ES.LIZJ(1.5f, getContext());
            C12ES.LIZJ(1.5f, getContext());
            getResources().getConfiguration();
            LJFF();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public final void LIZJ(C19Y5 c19y5, boolean z) {
        int size = this.LL.size();
        if (c19y5.LJII == this) {
            c19y5.LJ = size;
            ListProtector.add(this.LL, size, c19y5);
            int size2 = this.LL.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                } else {
                    ((C19Y5) ListProtector.get(this.LL, size)).LJ = size;
                }
            }
            C19Y2 c19y2 = c19y5.LJIIIIZZ;
            C19Y4 c19y4 = this.LLILLL;
            int i = c19y5.LJ;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            LJIJI(layoutParams);
            c19y4.addView(c19y2, i, layoutParams);
            if (z) {
                c19y5.LIZ();
                return;
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

    public final void LJIILIIL(C19Y5 c19y5, boolean z) {
        int i;
        C19Y5 c19y52 = this.LLILLJJLI;
        if (c19y52 == c19y5) {
            if (c19y52 != null) {
                for (int size = this.LLJJJJJIL.size() - 1; size >= 0; size--) {
                    ((InterfaceC20516715Px) ListProtector.get(this.LLJJJJJIL, size)).LIZ(c19y5);
                }
                LJ(c19y5.LJ);
                return;
            }
            return;
        }
        if (c19y5 != null) {
            i = c19y5.LJ;
        } else {
            i = -1;
        }
        if (z) {
            if ((c19y52 == null || c19y52.LJ == -1) && i != -1) {
                LJIILL(i, 0.0f, true, true);
            } else {
                LJ(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        if (c19y52 != null) {
            for (int size2 = this.LLJJJJJIL.size() - 1; size2 >= 0; size2--) {
                ((InterfaceC20516715Px) ListProtector.get(this.LLJJJJJIL, size2)).LIZIZ(c19y52);
            }
        }
        this.LLILLJJLI = c19y5;
        if (c19y5 != null) {
            for (int size3 = this.LLJJJJJIL.size() - 1; size3 >= 0; size3--) {
                ((InterfaceC20516715Px) ListProtector.get(this.LLJJJJJIL, size3)).LIZJ(c19y5);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.19Y7] */
    public final void LJIILJJIL(PagerAdapter pagerAdapter, boolean z) {
        C19Y7 c19y7;
        PagerAdapter pagerAdapter2 = this.LLJL;
        if (pagerAdapter2 != null && (c19y7 = this.LLJLIL) != null) {
            pagerAdapter2.LJJIJIIJIL(c19y7);
        }
        this.LLJL = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.LLJLIL == null) {
                this.LLJLIL = new DataSetObserver() { // from class: X.19Y7
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
            pagerAdapter.LJJII(this.LLJLIL);
        }
        LJIIJJI();
    }

    public final void LJIILLIIL(int i, int i2) {
        this.LLILLL.setPadding(i, 0, i2, 0);
    }

    public final void LJIIZILJ(int i, int i2) {
        setTabTextColors(new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.11Sm, X.15Px] */
    public final void LJIJ(final ViewPager viewPager, boolean z) {
        ViewPager viewPager2 = this.LLJJLIIIJLLLLLLLZ;
        if (viewPager2 != null) {
            C20514715Pd c20514715Pd = this.LLJLILLLLZIIL;
            if (c20514715Pd != null) {
                viewPager2.removeOnPageChangeListener(c20514715Pd);
            }
            C19Y6 c19y6 = this.LLJLL;
            if (c19y6 != null) {
                this.LLJJLIIIJLLLLLLLZ.removeOnAdapterChangeListener(c19y6);
            }
        }
        C19504211Sm c19504211Sm = this.LLJJJJLIIL;
        if (c19504211Sm != null) {
            this.LLJJJJJIL.remove(c19504211Sm);
            this.LLJJJJLIIL = null;
        }
        if (viewPager != null) {
            this.LLJJLIIIJLLLLLLLZ = viewPager;
            if (this.LLJLILLLLZIIL == null) {
                this.LLJLILLLLZIIL = new C20514715Pd(this);
            }
            C20514715Pd c20514715Pd2 = this.LLJLILLLLZIIL;
            c20514715Pd2.LLILLJJLI = 0;
            c20514715Pd2.LLILLL = 0;
            viewPager.addOnPageChangeListener(c20514715Pd2);
            ?? r0 = new InterfaceC20516715Px(viewPager) { // from class: X.11Sm
                public final ViewPager LIZ;

                @Override // X.InterfaceC20516715Px
                public final void LIZ(C19Y5 c19y5) {
                }

                @Override // X.InterfaceC20516715Px
                public final void LIZIZ(C19Y5 c19y5) {
                }

                {
                    this.LIZ = viewPager;
                }

                @Override // X.InterfaceC20516715Px
                public final void LIZJ(C19Y5 c19y5) {
                    this.LIZ.setCurrentItem(c19y5.LJ);
                }
            };
            this.LLJJJJLIIL = r0;
            LIZIZ(r0);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                LJIILJJIL(adapter, true);
            }
            if (this.LLJLL == null) {
                this.LLJLL = new C19Y6(this);
            }
            C19Y6 c19y62 = this.LLJLL;
            c19y62.LL = true;
            viewPager.addOnAdapterChangeListener(c19y62);
            LJIILL(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.LLJJLIIIJLLLLLLLZ = null;
            LJIILJJIL(null, false);
        }
        this.LLJLLIL = z;
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
            int iLJII2 = this.LLJJI;
            if (iLJII2 <= 0) {
                iLJII2 = size - LJII(56);
            }
            this.LLJILLL = iLJII2;
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

    public final void LJIILL(int i, float f, boolean z, boolean z2) {
        int iRound = Math.round(i + f);
        if (iRound >= 0 && iRound < this.LLILLL.getChildCount()) {
            if (z2) {
                C19Y4 c19y4 = this.LLILLL;
                ValueAnimator valueAnimator = c19y4.LLIZ;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    c19y4.LLIZ.cancel();
                }
                c19y4.LLILLL = i;
                c19y4.LLILZ = f;
                c19y4.LIZIZ();
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
