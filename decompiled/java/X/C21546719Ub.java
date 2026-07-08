package X;

import Y.AAListenerS343S0100000_33;
import Y.AUListenerS280S0100000_33;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
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

/* JADX INFO: renamed from: X.19Ub, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
@InterfaceC21561419Zs
public class C21546719Ub extends HorizontalScrollView {
    public static final C1085640eME LLLLIIIILLL = new C1085640eME(16);
    public final ArrayList<C763970Txz> LL;
    public C763970Txz LLILLJJLI;
    public final RectF LLILLL;
    public final C21546919Ud LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public final int LLJIJIL;
    public ColorStateList LLJILJIL;
    public ColorStateList LLJILJILJ;
    public ColorStateList LLJILLL;
    public ColorStateList LLJJ;
    public ColorStateList LLJJI;
    public Drawable LLJJIII;
    public float LLJJIJI;
    public final float LLJJIJIIJIL;
    public final int LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public final int LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public final int LLJLIL;
    public int LLJLILLLLZIIL;
    public final int LLJLL;
    public int LLJLLIL;
    public int LLJLLL;
    public Boolean LLJZ;
    public int LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public InterfaceC20485215Du LLLFFI;
    public final ArrayList<InterfaceC20485215Du> LLLFZ;
    public C0U72 LLLI;
    public ValueAnimator LLLII;
    public ViewPager LLLIIII;
    public PagerAdapter LLLIIIIL;
    public C21547319Uh LLLIIIL;
    public C480240IsQ LLLIIL;
    public C21547219Ug LLLIILIL;
    public boolean LLLIL;
    public final C1085650eMF LLLILZ;
    public final Rect LLLILZJ;
    public InterfaceC21547419Ui LLLILZLLLI;
    public final SparseBooleanArray LLLIZZ;
    public boolean LLLJ;
    public boolean LLLJIL;
    public boolean LLLJL;
    public boolean LLLL;
    public ChoreographerFrameCallbackC2189671Amr LLLLII;

    public final void LJIJ() {
        for (int i = 0; i < this.LLILZ.getChildCount(); i++) {
            View childAt = this.LLILZ.getChildAt(i);
            if (childAt != null) {
                childAt.setPaddingRelative(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI);
            }
        }
    }

    private int getDefaultHeight() {
        int size = this.LL.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C763970Txz c763970Txz = (C763970Txz) ListProtector.get(this.LL, i);
            if (c763970Txz == null || c763970Txz.LIZIZ == null || TextUtils.isEmpty(c763970Txz.LIZJ)) {
                i++;
            } else if (!this.LLL) {
                return this.LLJL;
            }
        }
        return this.LLJJLIIIJLLLLLLLZ;
    }

    private int getTabMinWidth() {
        int i = this.LLJJJJ;
        if (i != -1) {
            return i;
        }
        if (this.LLJZIJLIL == 0) {
            return this.LLJJJJLIIL;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.LLILZ.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public final void LJ() {
        this.LLILZ.setPaddingRelative(this.LLJZIJLIL == 0 ? Math.max(0, this.LLJLIL - this.LLIZ) : 0, 0, 0, 0);
        int i = this.LLJZIJLIL;
        if (i == 0) {
            this.LLILZ.setGravity(8388611);
        } else if (i == 1) {
            this.LLILZ.setGravity(1);
        }
        LJIJI(true);
    }

    public final void LJFF() {
        C21546819Uc c21546819Uc;
        boolean localVisibleRect;
        if (this.LLLJ && this.LLLILZLLLI != null) {
            for (int i = 0; i < getTabCount(); i++) {
                C763970Txz c763970TxzLJIIJ = LJIIJ(i);
                if (c763970TxzLJIIJ != null && (c21546819Uc = c763970TxzLJIIJ.LJIIIIZZ) != null && (localVisibleRect = c21546819Uc.getLocalVisibleRect(this.LLLILZJ)) != this.LLLIZZ.get(i, false)) {
                    this.LLLIZZ.put(i, localVisibleRect);
                    if (localVisibleRect) {
                        this.LLLILZLLLI.P7(i);
                    } else {
                        this.LLLILZLLLI.O7();
                    }
                }
            }
        }
    }

    public final void LJIIIZ() {
        if (this.LLLII == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LLLII = valueAnimator;
            valueAnimator.setInterpolator(C194V.LIZIZ);
            this.LLLII.setDuration(this.LLJLL);
            this.LLLII.addUpdateListener(new AUListenerS280S0100000_33(this, 1));
            this.LLLII.addListener(new AAListenerS343S0100000_33(this, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C763970Txz LJIIJJI() {
        C21546819Uc c21546819Uc;
        C763970Txz c763970Txz = (C763970Txz) LLLLIIIILLL.LIZIZ();
        if (c763970Txz == null) {
            c763970Txz = new C763970Txz();
        }
        c763970Txz.LJII = this;
        C1085650eMF c1085650eMF = this.LLLILZ;
        if (c1085650eMF == null || (c21546819Uc = (C21546819Uc) c1085650eMF.LIZIZ()) == null) {
            c21546819Uc = new C21546819Uc(this, getContext());
        }
        c21546819Uc.setTab(c763970Txz);
        c21546819Uc.setFocusable(true);
        c21546819Uc.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c763970Txz.LJ)) {
            c21546819Uc.setContentDescription(c763970Txz.LIZJ);
        } else {
            c21546819Uc.setContentDescription(c763970Txz.LJ);
        }
        c763970Txz.LJIIIIZZ = c21546819Uc;
        return c763970Txz;
    }

    public final void LJIILIIL() {
        for (int childCount = this.LLILZ.getChildCount() - 1; childCount >= 0; childCount--) {
            C21546819Uc c21546819Uc = (C21546819Uc) this.LLILZ.getChildAt(childCount);
            C21546919Ud c21546919Ud = this.LLILZ;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c21546919Ud, null);
            c21546919Ud.removeViewAt(childCount);
            if (c21546819Uc != null) {
                c21546819Uc.setTab(null);
                c21546819Uc.setSelected(false);
                this.LLLILZ.LIZ(c21546819Uc);
            }
            requestLayout();
        }
        Iterator<C763970Txz> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            C763970Txz next = it2.next();
            it2.remove();
            next.LJII = null;
            next.LJIIIIZZ = null;
            next.LIZ = null;
            next.LIZIZ = null;
            next.LIZJ = null;
            next.LJ = null;
            next.LJFF = -1;
            next.LJI = null;
            next.LIZLLL = true;
            LLLLIIIILLL.LIZ(next);
        }
        this.LLILLJJLI = null;
    }

    public int getSelectedTabPosition() {
        C763970Txz c763970Txz = this.LLILLJJLI;
        if (c763970Txz != null) {
            return c763970Txz.LJFF;
        }
        return -1;
    }

    public int getTabCount() {
        return this.LL.size();
    }

    public final void LJIIL() {
        int currentItem;
        LJIILIIL();
        PagerAdapter pagerAdapter = this.LLLIIIIL;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                C763970Txz c763970TxzLJIIJJI = LJIIJJI();
                c763970TxzLJIIJJI.LIZLLL(this.LLLIIIIL.LJIJJLI(i));
                LIZIZ(this.LL.size(), c763970TxzLJIIJJI, false);
            }
            ViewPager viewPager = this.LLLIIII;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            LJIILJJIL(LJIIJ(currentItem), true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLLIIII == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                LJIIZILJ((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLLIL) {
            setupWithViewPager(null);
            this.LLLIL = false;
        }
        if (!this.LLLJL || this.LLLLII == null) {
            return;
        }
        C786410Ut5.v2().removeFrameCallback(this.LLLLII);
        this.LLLLII = null;
        this.LLLL = false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public int getTabGravity() {
        return this.LLJLILLLLZIIL;
    }

    public ColorStateList getTabIconTint() {
        return this.LLJILJILJ;
    }

    public int getTabIndicatorGravity() {
        return this.LLJLLIL;
    }

    public int getTabMaxWidth() {
        return this.LLJJJ;
    }

    public int getTabMode() {
        return this.LLJZIJLIL;
    }

    public ColorStateList getTabRippleColor() {
        return this.LLJILLL;
    }

    public Drawable getTabSelectedIndicator() {
        return this.LLJJIII;
    }

    public ColorStateList getTabTextColors() {
        return this.LLJILJIL;
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.LLILZ.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.LLILZ.getChildAt(i2);
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

    public final void LIZ(InterfaceC20485215Du interfaceC20485215Du) {
        if (!this.LLLFZ.contains(interfaceC20485215Du)) {
            this.LLLFZ.add(interfaceC20485215Du);
        }
    }

    public final void LIZJ(View view) {
        if (view instanceof C19UN) {
            C763970Txz c763970TxzLJIIJJI = LJIIJJI();
            view.getClass();
            if (!TextUtils.isEmpty(view.getContentDescription())) {
                c763970TxzLJIIJJI.LJ = view.getContentDescription();
                c763970TxzLJIIJJI.LJ();
            }
            LIZIZ(this.LL.size(), c763970TxzLJIIJJI, this.LL.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void LIZLLL(int i) {
        if (i != -1) {
            if (getWindowToken() != null && isLaidOut()) {
                C21546919Ud c21546919Ud = this.LLILZ;
                int childCount = c21546919Ud.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (c21546919Ud.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iLJI = LJI(i, 0.0f);
                if (scrollX != iLJI) {
                    LJIIIZ();
                    this.LLLII.setIntValues(scrollX, iLJI);
                    this.LLLII.start();
                }
                this.LLILZ.LIZ(i, this.LLJLL);
                return;
            }
            LJIILLIIL(i, 0.0f, true, true);
        }
    }

    public final int LJIIIIZZ(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    public final C763970Txz LJIIJ(int i) {
        if (i >= 0 && i < getTabCount()) {
            return (C763970Txz) ListProtector.get(this.LL, i);
        }
        return null;
    }

    public final void LJIJI(boolean z) {
        for (int i = 0; i < this.LLILZ.getChildCount(); i++) {
            View childAt = this.LLILZ.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.LLJZIJLIL == 1 && this.LLJLILLLLZIIL == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        LIZJ(view);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C21546819Uc c21546819Uc;
        Drawable drawable;
        for (int i = 0; i < this.LLILZ.getChildCount(); i++) {
            View childAt = this.LLILZ.getChildAt(i);
            if ((childAt instanceof C21546819Uc) && (drawable = (c21546819Uc = (C21546819Uc) childAt).LLIZ) != null) {
                drawable.setBounds(c21546819Uc.getLeft(), c21546819Uc.getTop(), c21546819Uc.getRight(), c21546819Uc.getBottom());
                c21546819Uc.LLIZ.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void setDefaultHeight(int i) {
        this.LLJJLIIIJLLLLLLLZ = i;
        requestLayout();
    }

    public void setDefaultHeightWithTextIcon(int i) {
        this.LLJL = LJIIIIZZ(i);
        requestLayout();
    }

    public void setInlineLabel(boolean z) {
        if (this.LLL != z) {
            this.LLL = z;
            for (int i = 0; i < this.LLILZ.getChildCount(); i++) {
                View childAt = this.LLILZ.getChildAt(i);
                if (childAt instanceof C21546819Uc) {
                    C21546819Uc c21546819Uc = (C21546819Uc) childAt;
                    c21546819Uc.setOrientation(!c21546819Uc.LLJ.LLL ? 1 : 0);
                    if (c21546819Uc.LLILZIL == null && c21546819Uc.LLILZLL == null) {
                        c21546819Uc.LIZJ(c21546819Uc.LLILLJJLI, c21546819Uc.LLILLL);
                    } else {
                        c21546819Uc.LIZJ(c21546819Uc.LLILZIL, c21546819Uc.LLILZLL);
                    }
                }
            }
            LJ();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setOnTabSelectedListener(InterfaceC20485215Du interfaceC20485215Du) {
        InterfaceC20485215Du interfaceC20485215Du2 = this.LLLFFI;
        if (interfaceC20485215Du2 != null) {
            this.LLLFZ.remove(interfaceC20485215Du2);
        }
        this.LLLFFI = interfaceC20485215Du;
        if (interfaceC20485215Du != null) {
            LIZ(interfaceC20485215Du);
        }
    }

    public void setRequestedTabMaxWidth(int i) {
        this.LLJJJJJIL = i;
        requestLayout();
    }

    public void setRequestedTabMinWidth(int i) {
        this.LLJJJJ = i;
        requestLayout();
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        LJIIIZ();
        this.LLLII.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C14MI.LIZ(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.LLILZ.setSelectedIndicatorColor(i);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.LLJLLIL != i) {
            this.LLJLLIL = i;
            this.LLILZ.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.LLILZ.setSelectedIndicatorHeight(i);
    }

    public void setSelectedTabIndicatorMarginBottom(int i) {
        if (this.LLJLLL != i) {
            this.LLJLLL = i;
        }
    }

    public void setSelectedTabIndicatorWidth(int i) {
        this.LLILZ.setSelectedIndicatorWidth(i);
    }

    public void setShouldOptimizeFluency(boolean z) {
        this.LLLJL = z;
    }

    public void setTabGap(int i) {
        this.LLJJL = i;
        for (int i2 = 0; i2 < this.LLILZ.getChildCount(); i2++) {
            View childAt = this.LLILZ.getChildAt(i2);
            if (childAt != null && i != 0 && i2 > 0) {
                ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).setMarginStart(i);
            }
        }
    }

    public void setTabGravity(int i) {
        if (this.LLJLILLLLZIIL != i) {
            this.LLJLILLLLZIIL = i;
            LJ();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.LLJILJILJ != colorStateList) {
            this.LLJILJILJ = colorStateList;
            int size = this.LL.size();
            for (int i = 0; i < size; i++) {
                ((C763970Txz) ListProtector.get(this.LL, i)).LJ();
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C838410Wul.LIZIZ(i, getContext()));
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.LLLF = z;
        this.LLILZ.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.LLJZIJLIL) {
            this.LLJZIJLIL = i;
            LJ();
        }
    }

    public void setTabPaddingBottom(int i) {
        this.LLJI = i;
        LJIJ();
    }

    public void setTabPaddingEnd(int i) {
        this.LLJ = i;
        LJIJ();
    }

    public void setTabPaddingStart(int i) {
        this.LLIZ = i;
        LJ();
        LJIJ();
    }

    public void setTabPaddingTop(int i) {
        this.LLIZLLLIL = i;
        LJIJ();
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.LLJILLL != colorStateList) {
            this.LLJILLL = colorStateList;
            for (int i = 0; i < this.LLILZ.getChildCount(); i++) {
                View childAt = this.LLILZ.getChildAt(i);
                if (childAt instanceof C21546819Uc) {
                    ((C21546819Uc) childAt).LIZIZ(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C838410Wul.LIZIZ(i, getContext()));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.LLJILJIL != colorStateList) {
            this.LLJILJIL = colorStateList;
            int size = this.LL.size();
            for (int i = 0; i < size; i++) {
                ((C763970Txz) ListProtector.get(this.LL, i)).LJ();
            }
        }
    }

    public void setTabVisibilityChangeListener(InterfaceC21547419Ui interfaceC21547419Ui) {
        this.LLLILZLLLI = interfaceC21547419Ui;
    }

    public void setTabWidth(int i) {
        this.LLJJJIL = i;
        requestLayout();
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        LJIILL(pagerAdapter, false);
    }

    public void setTitleIncludeFontPadding(boolean z) {
        Boolean bool = this.LLJZ;
        if (bool == null || bool.booleanValue() != z) {
            this.LLJZ = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setUnboundedRipple(boolean z) {
        if (this.LLLFF != z) {
            this.LLLFF = z;
            for (int i = 0; i < this.LLILZ.getChildCount(); i++) {
                View childAt = this.LLILZ.getChildAt(i);
                if (childAt instanceof C21546819Uc) {
                    ((C21546819Uc) childAt).LIZIZ(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        LJIIZILJ(viewPager, false);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.LLJJIII != drawable) {
            this.LLJJIII = drawable;
            this.LLILZ.postInvalidateOnAnimation();
        }
    }

    public C21546719Ub(Context context, AttributeSet attributeSet) {
        int color;
        int color2;
        int color3;
        int color4;
        super(context, attributeSet, R.attr.fqk);
        this.LLLILZJ = new Rect();
        this.LLLIZZ = new SparseBooleanArray();
        this.LLLJ = false;
        this.LLLJIL = false;
        this.LLLJL = false;
        this.LLLL = false;
        this.LLLLII = null;
        this.LLJJLIIIJLLLLLLLZ = LJIIIIZZ(48);
        this.LLJL = LJIIIIZZ(72);
        this.LL = new ArrayList<>();
        this.LLILLL = new RectF();
        this.LLJJJ = Integer.MAX_VALUE;
        this.LLLFZ = new ArrayList<>();
        this.LLLILZ = new C1085650eMF(12);
        setHorizontalScrollBarEnabled(false);
        C21546919Ud c21546919Ud = new C21546919Ud(this, context);
        this.LLILZ = c21546919Ud;
        super.addView(c21546919Ud, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayLIZLLL = C19PG.LIZLLL(context, attributeSet, R$styleable.LiveTabLayout, R.attr.fqk, R.style.a2k, R$styleable.TabLayout_tabTextAppearance);
        c21546919Ud.setSelectedIndicatorHeight(typedArrayLIZLLL.getDimensionPixelSize(R$styleable.LiveTabLayout_tabIndicatorHeight, -1));
        c21546919Ud.setClipChildren(typedArrayLIZLLL.getBoolean(R$styleable.LiveTabLayout_slidingTabIndicatorClipChildren, c21546919Ud.getClipChildren()));
        c21546919Ud.setClipToPadding(typedArrayLIZLLL.getBoolean(R$styleable.LiveTabLayout_slidingTabIndicatorClipToPadding, c21546919Ud.getClipToPadding()));
        setSelectedTabIndicator(C19RN.LIZLLL(context, typedArrayLIZLLL, R$styleable.LiveTabLayout_tabIndicator));
        setSelectedTabIndicatorGravity(typedArrayLIZLLL.getInt(R$styleable.LiveTabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(typedArrayLIZLLL.getBoolean(R$styleable.LiveTabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.LiveTabLayout_tabPadding, 0);
        this.LLJI = dimensionPixelSize;
        this.LLJ = dimensionPixelSize;
        this.LLIZLLLIL = dimensionPixelSize;
        this.LLIZ = dimensionPixelSize;
        this.LLIZ = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.LiveTabLayout_tabPaddingStart, dimensionPixelSize);
        this.LLIZLLLIL = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.LiveTabLayout_tabPaddingTop, this.LLIZLLLIL);
        this.LLJ = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.LiveTabLayout_tabPaddingEnd, this.LLJ);
        this.LLJI = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.LiveTabLayout_tabPaddingBottom, this.LLJI);
        int resourceId = typedArrayLIZLLL.getResourceId(R$styleable.LiveTabLayout_tabTextAppearance, R.style.qb);
        this.LLJIJIL = resourceId;
        this.LLJJLIIIJLLLLLLLZ = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.LiveTabLayout_tabDefaultHeight, this.LLJJLIIIJLLLLLLLZ);
        this.LLJL = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.LiveTabLayout_tabDefaultHeightWidthTextIcon, this.LLJL);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId, R$styleable.TextAppearance);
        try {
            this.LLJJIJI = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, 0);
            this.LLJILJIL = C19RN.LIZ(context, typedArrayObtainStyledAttributes, R$styleable.TextAppearance_android_textColor);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayLIZLLL.hasValue(R$styleable.LiveTabLayout_tabTextColor)) {
                this.LLJILJIL = C19RN.LIZ(context, typedArrayLIZLLL, R$styleable.LiveTabLayout_tabTextColor);
            }
            if (typedArrayLIZLLL.hasValue(R$styleable.LiveTabLayout_tabSelectedTextColor)) {
                this.LLJILJIL = LJII(this.LLJILJIL.getDefaultColor(), typedArrayLIZLLL.getColor(R$styleable.LiveTabLayout_tabSelectedTextColor, 0));
            }
            this.LLJJL = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.LiveTabLayout_tabGap, 0);
            this.LLJILJILJ = C19RN.LIZ(context, typedArrayLIZLLL, R$styleable.LiveTabLayout_tabIconTint);
            C21551419Vw.LIZLLL(typedArrayLIZLLL.getInt(R$styleable.LiveTabLayout_tabIconTintMode, -1), null);
            this.LLJILLL = C19RN.LIZ(context, typedArrayLIZLLL, R$styleable.LiveTabLayout_tabRippleColor);
            this.LLJLL = typedArrayLIZLLL.getInt(R$styleable.LiveTabLayout_tabIndicatorAnimationDuration, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            this.LLJJJJ = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.LiveTabLayout_tabMinWidth, -1);
            this.LLJJJJJIL = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.LiveTabLayout_tabMaxWidth, -1);
            this.LLJJIJIL = typedArrayLIZLLL.getResourceId(R$styleable.LiveTabLayout_tabBackground, 0);
            this.LLJLIL = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.LiveTabLayout_tabContentStart, 0);
            this.LLJZIJLIL = typedArrayLIZLLL.getInt(R$styleable.LiveTabLayout_tabMode, 1);
            this.LLJLILLLLZIIL = typedArrayLIZLLL.getInt(R$styleable.LiveTabLayout_tabGravity, 0);
            this.LLL = typedArrayLIZLLL.getBoolean(R$styleable.LiveTabLayout_tabInlineLabel, false);
            this.LLLFF = typedArrayLIZLLL.getBoolean(R$styleable.LiveTabLayout_tabUnboundedRipple, false);
            Resources resources = getResources();
            this.LLJJIJIIJIL = resources.getDimensionPixelSize(R.dimen.rd);
            this.LLJJJJLIIL = resources.getDimensionPixelSize(R.dimen.rb);
            LJ();
            if (typedArrayLIZLLL.hasValue(R$styleable.LiveTabLayout_tabTextColorOnLight)) {
                color = typedArrayLIZLLL.getColor(R$styleable.LiveTabLayout_tabTextColorOnLight, 0);
            } else {
                color = 0;
            }
            if (typedArrayLIZLLL.hasValue(R$styleable.LiveTabLayout_tabSelectedTextColorOnLight)) {
                color2 = typedArrayLIZLLL.getColor(R$styleable.LiveTabLayout_tabSelectedTextColorOnLight, 0);
            } else {
                color2 = 0;
            }
            if (color != 0 || color2 != 0) {
                this.LLJJ = LJII(color, color2);
            }
            if (typedArrayLIZLLL.hasValue(R$styleable.LiveTabLayout_tabTextColorOnDark)) {
                color3 = typedArrayLIZLLL.getColor(R$styleable.LiveTabLayout_tabTextColorOnDark, 0);
            } else {
                color3 = 0;
            }
            if (typedArrayLIZLLL.hasValue(R$styleable.LiveTabLayout_tabSelectedTextColorOnDark)) {
                color4 = typedArrayLIZLLL.getColor(R$styleable.LiveTabLayout_tabSelectedTextColorOnDark, 0);
            } else {
                color4 = 0;
            }
            if (color3 != 0 || color4 != 0) {
                this.LLJJI = LJII(color3, color4);
            }
            this.LLILZIL = typedArrayLIZLLL.getColor(R$styleable.LiveTabLayout_tabIndicatorColorOnLight, 0);
            this.LLILZLL = typedArrayLIZLLL.getColor(R$styleable.LiveTabLayout_tabIndicatorColorOnDark, 0);
            typedArrayLIZLLL.recycle();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static ColorStateList LJII(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    public final int LJI(int i, float f) {
        View childAt;
        int width;
        int width2;
        int left = 0;
        if (this.LLJZIJLIL != 0) {
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
        int i3 = (int) ((width + width2) * 0.5f * f);
        if (getLayoutDirection() == 0) {
            return width3 + i3;
        }
        return width3 - i3;
    }

    public final void LJIILJJIL(C763970Txz c763970Txz, boolean z) {
        int i;
        C763970Txz c763970Txz2 = this.LLILLJJLI;
        if (c763970Txz2 == c763970Txz) {
            if (c763970Txz2 != null) {
                for (int size = this.LLLFZ.size() - 1; size >= 0; size--) {
                    ((InterfaceC20485215Du) ListProtector.get(this.LLLFZ, size)).LIZ();
                }
                LIZLLL(c763970Txz.LJFF);
                return;
            }
            return;
        }
        if (c763970Txz != null) {
            i = c763970Txz.LJFF;
        } else {
            i = -1;
        }
        if (z) {
            if ((c763970Txz2 == null || c763970Txz2.LJFF == -1) && i != -1) {
                LJIILLIIL(i, 0.0f, true, true);
            } else {
                LIZLLL(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.LLILLJJLI = c763970Txz;
        if (c763970Txz2 != null) {
            for (int size2 = this.LLLFZ.size() - 1; size2 >= 0; size2--) {
                ((InterfaceC20485215Du) ListProtector.get(this.LLLFZ, size2)).LIZLLL(c763970Txz2);
            }
        }
        if (c763970Txz != null) {
            for (int size3 = this.LLLFZ.size() - 1; size3 >= 0; size3--) {
                InterfaceC20485215Du interfaceC20485215Du = (InterfaceC20485215Du) ListProtector.get(this.LLLFZ, size3);
                if (interfaceC20485215Du instanceof InterfaceC482230Ivd) {
                    ((InterfaceC482230Ivd) interfaceC20485215Du).LIZJ(c763970Txz, this.LLLJIL);
                } else {
                    interfaceC20485215Du.LIZIZ(c763970Txz);
                }
            }
            this.LLLJIL = false;
        }
        C763970Txz c763970Txz3 = this.LLILLJJLI;
        for (C763970Txz c763970Txz4 : this.LL) {
            boolean z2 = c763970Txz3.LIZLLL;
            C21546819Uc c21546819Uc = c763970Txz4.LJIIIIZZ;
            if (c21546819Uc != null) {
                if (z2) {
                    ColorStateList colorStateList = c21546819Uc.LLJ.LLJJ;
                    if (colorStateList != null) {
                        c21546819Uc.LLILLJJLI.setTextColor(colorStateList);
                    }
                } else {
                    ColorStateList colorStateList2 = c21546819Uc.LLJ.LLJJI;
                    if (colorStateList2 != null) {
                        c21546819Uc.LLILLJJLI.setTextColor(colorStateList2);
                    }
                }
            }
        }
        if (this.LLILLJJLI.LIZLLL) {
            setSelectedTabIndicatorColor(this.LLILZIL);
        } else {
            setSelectedTabIndicatorColor(this.LLILZLL);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.19Uh] */
    public final void LJIILL(PagerAdapter pagerAdapter, boolean z) {
        C21547319Uh c21547319Uh;
        PagerAdapter pagerAdapter2 = this.LLLIIIIL;
        if (pagerAdapter2 != null && (c21547319Uh = this.LLLIIIL) != null) {
            pagerAdapter2.LJJIJIIJIL(c21547319Uh);
        }
        this.LLLIIIIL = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.LLLIIIL == null) {
                this.LLLIIIL = new DataSetObserver() { // from class: X.19Uh
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
            pagerAdapter.LJJII(this.LLLIIIL);
        }
        LJIIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0U72, X.15Du] */
    public final void LJIIZILJ(final ViewPager viewPager, boolean z) {
        ViewPager viewPager2 = this.LLLIIII;
        if (viewPager2 != null) {
            C480240IsQ c480240IsQ = this.LLLIIL;
            if (c480240IsQ != null) {
                viewPager2.removeOnPageChangeListener(c480240IsQ);
            }
            C21547219Ug c21547219Ug = this.LLLIILIL;
            if (c21547219Ug != null) {
                this.LLLIIII.removeOnAdapterChangeListener(c21547219Ug);
            }
        }
        C0U72 c0u72 = this.LLLI;
        if (c0u72 != null) {
            this.LLLFZ.remove(c0u72);
            this.LLLI = null;
        }
        if (viewPager != null) {
            this.LLLIIII = viewPager;
            if (this.LLLIIL == null) {
                this.LLLIIL = new C480240IsQ(this);
            }
            C480240IsQ c480240IsQ2 = this.LLLIIL;
            c480240IsQ2.LLILLL = 0;
            c480240IsQ2.LLILLJJLI = 0;
            viewPager.addOnPageChangeListener(c480240IsQ2);
            ?? r0 = new InterfaceC20485215Du(viewPager) { // from class: X.0U72
                public final ViewPager LIZ;

                @Override // X.InterfaceC20485215Du
                public final void LIZ() {
                }

                @Override // X.InterfaceC20485215Du
                public final void LIZLLL(C763970Txz c763970Txz) {
                }

                {
                    this.LIZ = viewPager;
                }

                @Override // X.InterfaceC20485215Du
                public final void LIZIZ(C763970Txz c763970Txz) {
                    this.LIZ.setCurrentItem(c763970Txz.LJFF);
                }
            };
            this.LLLI = r0;
            LIZ(r0);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                LJIILL(adapter, true);
            }
            if (this.LLLIILIL == null) {
                this.LLLIILIL = new C21547219Ug(this);
            }
            C21547219Ug c21547219Ug2 = this.LLLIILIL;
            c21547219Ug2.LL = true;
            viewPager.addOnAdapterChangeListener(c21547219Ug2);
            LJIILLIIL(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.LLLIIII = null;
            LJIILL(null, false);
        }
        this.LLLIL = z;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        LIZJ(view);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int defaultHeight = getDefaultHeight() + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(defaultHeight, 1073741824);
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(defaultHeight, View.MeasureSpec.getSize(i2)), 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iLJIIIIZZ = this.LLJJJJJIL;
            if (iLJIIIIZZ <= 0) {
                iLJIIIIZZ = size - LJIIIIZZ(56);
            }
            this.LLJJJ = iLJIIIIZZ;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i3 = this.LLJZIJLIL;
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
    public final void LIZIZ(int i, C763970Txz c763970Txz, boolean z) {
        if (c763970Txz.LJII == this) {
            c763970Txz.LJFF = i;
            ListProtector.add(this.LL, i, c763970Txz);
            int size = this.LL.size();
            while (true) {
                i++;
                if (i >= size) {
                    break;
                } else {
                    ((C763970Txz) ListProtector.get(this.LL, i)).LJFF = i;
                }
            }
            C21546819Uc c21546819Uc = c763970Txz.LJIIIIZZ;
            C21546919Ud c21546919Ud = this.LLILZ;
            int i2 = c763970Txz.LJFF;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.LLJZIJLIL == 1 && this.LLJLILLLLZIIL == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            int i3 = this.LLJJL;
            if (i3 != 0 && c763970Txz.LJFF > 0) {
                layoutParams.setMarginStart(i3);
            }
            c21546919Ud.addView(c21546819Uc, i2, layoutParams);
            if (z) {
                c763970Txz.LIZ();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        LIZJ(view);
    }

    public final void LJIILLIIL(int i, float f, boolean z, boolean z2) {
        int iRound = Math.round(i + f);
        if (iRound >= 0 && iRound < this.LLILZ.getChildCount()) {
            if (z2) {
                C21546919Ud c21546919Ud = this.LLILZ;
                ValueAnimator valueAnimator = c21546919Ud.LLJ;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    c21546919Ud.LLJ.cancel();
                }
                c21546919Ud.LLILZIL = i;
                c21546919Ud.LLILZLL = f;
                c21546919Ud.LIZLLL();
            }
            ValueAnimator valueAnimator2 = this.LLLII;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.LLLII.cancel();
            }
            scrollTo(LJI(i, f), 0);
            if (z) {
                setSelectedTabView(iRound);
            }
        }
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        LJFF();
    }
}
