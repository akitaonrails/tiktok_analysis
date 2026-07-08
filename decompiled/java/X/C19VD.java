package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.LinearLayoutCompat;
import java.util.Iterator;

/* JADX INFO: renamed from: X.19VD, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19VD extends LinearLayoutCompat implements InterfaceC21548019Uo, InterfaceC21549819Vg {
    public C19V6 LLJJI;
    public Context LLJJIII;
    public int LLJJIJI;
    public boolean LLJJIJIIJIL;
    public ActionMenuPresenter LLJJIJIL;
    public InterfaceC21549519Vd LLJJJ;
    public C19VX LLJJJIL;
    public boolean LLJJJJ;
    public int LLJJJJJIL;
    public final int LLJJJJLIIL;
    public final int LLJJL;
    public InterfaceC21550919Vr LLJJLIIIJLLLLLLLZ;

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: LJ */
    public final C16GA generateDefaultLayoutParams() {
        C19VN c19vn = new C19VN();
        ((LinearLayout.LayoutParams) c19vn).gravity = 16;
        return c19vn;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C19VN c19vn = new C19VN();
        ((LinearLayout.LayoutParams) c19vn).gravity = 16;
        return c19vn;
    }

    public Menu getMenu() {
        if (this.LLJJI == null) {
            Context context = getContext();
            C19V6 c19v6 = new C19V6(context);
            this.LLJJI = c19v6;
            c19v6.LJ = new C19VX() { // from class: X.19VC
                @Override // X.C19VX
                public final void LIZIZ(C19V6 c19v62) {
                    C19VX c19vx = this.LL.LLJJJIL;
                    if (c19vx != null) {
                        c19vx.LIZIZ(c19v62);
                    }
                }

                @Override // X.C19VX
                public final boolean LIZ(C19V6 c19v62, MenuItem menuItem) {
                    InterfaceC21550919Vr interfaceC21550919Vr = this.LL.LLJJLIIIJLLLLLLLZ;
                    if (interfaceC21550919Vr == null) {
                        return false;
                    }
                    C21550419Vm c21550419Vm = (C21550419Vm) interfaceC21550919Vr;
                    Iterator<InterfaceC21506819Es> it2 = c21550419Vm.LIZ.LLJLLL.LIZIZ.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (it2.next().LIZLLL(menuItem)) {
                                break;
                            }
                        } else {
                            InterfaceC21551019Vs interfaceC21551019Vs = c21550419Vm.LIZ.LLJZIJLIL;
                            if (interfaceC21551019Vs == null || !((C21550319Vl) interfaceC21551019Vs).LIZ.LIZIZ.onMenuItemSelected(0, menuItem)) {
                                return false;
                            }
                        }
                    }
                    return true;
                }
            };
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.LLJJIJIL = actionMenuPresenter;
            actionMenuPresenter.LLJILJILJ = true;
            actionMenuPresenter.LLJILLL = true;
            InterfaceC21549519Vd interfaceC21549519Vd = this.LLJJJ;
            if (interfaceC21549519Vd == null) {
                interfaceC21549519Vd = new InterfaceC21549519Vd() { // from class: X.19Vf
                    @Override // X.InterfaceC21549519Vd
                    public final void LIZ(C19V6 c19v62, boolean z) {
                    }

                    @Override // X.InterfaceC21549519Vd
                    public final boolean LIZIZ(C19V6 c19v62) {
                        return false;
                    }
                };
            }
            actionMenuPresenter.LLILZIL = interfaceC21549519Vd;
            this.LLJJI.LIZIZ(this.LLJJIJIL, this.LLJJIII);
            ActionMenuPresenter actionMenuPresenter2 = this.LLJJIJIL;
            actionMenuPresenter2.LLIZLLLIL = this;
            this.LLJJI = actionMenuPresenter2.LLILLL;
        }
        return this.LLJJI;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.LLJJIJIL;
        C21514319Hp c21514319Hp = actionMenuPresenter.LLJI;
        if (c21514319Hp != null) {
            return c21514319Hp.getDrawable();
        }
        if (actionMenuPresenter.LLJILJIL) {
            return actionMenuPresenter.LLJIJIL;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.LLJJIJIL;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.LJIIJJI();
            C19VI c19vi = actionMenuPresenter.LLJJJ;
            if (c19vi == null || !c19vi.LIZIZ()) {
                return;
            }
            c19vi.LJIIIZ.dismiss();
        }
    }

    public int getPopupTheme() {
        return this.LLJJIJI;
    }

    public static C19VN LJIIIIZZ(ViewGroup.LayoutParams layoutParams) {
        C19VN c19vn;
        if (layoutParams != null) {
            if (layoutParams instanceof C19VN) {
                c19vn = new C19VN((C19VN) layoutParams);
            } else {
                c19vn = new C19VN(layoutParams);
            }
            if (((LinearLayout.LayoutParams) c19vn).gravity <= 0) {
                ((LinearLayout.LayoutParams) c19vn).gravity = 16;
            }
            return c19vn;
        }
        C19VN c19vn2 = new C19VN();
        ((LinearLayout.LayoutParams) c19vn2).gravity = 16;
        return c19vn2;
    }

    @Override // X.InterfaceC21548019Uo
    public final boolean LIZ(C21548219Uq c21548219Uq) {
        return this.LLJJI.LJIILLIIL(c21548219Uq, null, 0);
    }

    @Override // X.InterfaceC21549819Vg
    public final void LIZIZ(C19V6 c19v6) {
        this.LLJJI = c19v6;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: LJFF */
    public final C16GA generateLayoutParams(AttributeSet attributeSet) {
        return new C19VN(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: LJI */
    public final /* bridge */ /* synthetic */ C16GA generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return LJIIIIZZ(layoutParams);
    }

    public final boolean LJIIIZ(int i) {
        boolean zLJIILJJIL = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC21550219Vk)) {
            zLJIILJJIL = false | ((InterfaceC21550219Vk) childAt).LJIILJJIL();
        }
        if (i > 0 && (childAt2 instanceof InterfaceC21550219Vk)) {
            return zLJIILJJIL | ((InterfaceC21550219Vk) childAt2).LIZIZ();
        }
        return zLJIILJJIL;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C19VN;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C19VN(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.LLJJIJIL;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.LJII(false);
            if (this.LLJJIJIL.LJIIL()) {
                this.LLJJIJIL.LJIIJJI();
                this.LLJJIJIL.LJIILIIL();
            }
        }
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.LLJJIJIL.LLJJIJI = z;
    }

    public void setOnMenuItemClickListener(InterfaceC21550919Vr interfaceC21550919Vr) {
        this.LLJJLIIIJLLLLLLLZ = interfaceC21550919Vr;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        ActionMenuPresenter actionMenuPresenter = this.LLJJIJIL;
        C21514319Hp c21514319Hp = actionMenuPresenter.LLJI;
        if (c21514319Hp != null) {
            c21514319Hp.setImageDrawable(drawable);
        } else {
            actionMenuPresenter.LLJILJIL = true;
            actionMenuPresenter.LLJIJIL = drawable;
        }
    }

    public void setOverflowReserved(boolean z) {
        this.LLJJIJIIJIL = z;
    }

    public void setPopupTheme(int i) {
        if (this.LLJJIJI != i) {
            this.LLJJIJI = i;
            if (i == 0) {
                this.LLJJIII = getContext();
            } else {
                this.LLJJIII = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.LLJJIJIL = actionMenuPresenter;
        actionMenuPresenter.LLIZLLLIL = this;
        this.LLJJI = actionMenuPresenter.LLILLL;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return LJIIIIZZ(layoutParams);
    }

    public C19VD(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.LLJJJJLIIL = (int) (56.0f * f);
        this.LLJJL = (int) (f * 4.0f);
        this.LLJJIII = context;
        this.LLJJIJI = 0;
    }

    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean, int] */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        ?? r0;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        ViewOnClickListenerC21547919Un viewOnClickListenerC21547919Un;
        C19V6 c19v6;
        boolean z7 = this.LLJJJJ;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJJJ = z;
        if (z7 != z) {
            this.LLJJJJJIL = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.LLJJJJ && (c19v6 = this.LLJJI) != null && size != this.LLJJJJJIL) {
            this.LLJJJJJIL = size;
            c19v6.LJIILL(true);
        }
        int childCount = getChildCount();
        if (this.LLJJJJ) {
            if (childCount > 0) {
                int mode = View.MeasureSpec.getMode(i2);
                int size2 = View.MeasureSpec.getSize(i);
                int size3 = View.MeasureSpec.getSize(i2);
                int paddingLeft = getPaddingLeft() + getPaddingRight();
                int paddingTop = getPaddingTop() + getPaddingBottom();
                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingTop, -2);
                int i6 = size2 - paddingLeft;
                int i7 = this.LLJJJJLIIL;
                int i8 = i6 / i7;
                int i9 = i6 % i7;
                if (i8 == 0) {
                    setMeasuredDimension(i6, 0);
                    return;
                }
                int i10 = i7 + (i9 / i8);
                int childCount2 = getChildCount();
                int iMax = 0;
                int i11 = 0;
                int iMax2 = 0;
                boolean z8 = false;
                int i12 = 0;
                long j = 0;
                for (int i13 = 0; i13 < childCount2; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt.getVisibility() != 8) {
                        boolean z9 = childAt instanceof ViewOnClickListenerC21547919Un;
                        i11++;
                        if (z9) {
                            int i14 = this.LLJJL;
                            r0 = 0;
                            childAt.setPadding(i14, 0, i14, 0);
                        } else {
                            r0 = 0;
                        }
                        C19VN c19vn = (C19VN) childAt.getLayoutParams();
                        c19vn.LJFF = r0;
                        c19vn.LIZJ = r0;
                        c19vn.LIZIZ = r0;
                        c19vn.LIZLLL = r0;
                        ((LinearLayout.LayoutParams) c19vn).leftMargin = r0;
                        ((LinearLayout.LayoutParams) c19vn).rightMargin = r0;
                        if (z9 && ((ViewOnClickListenerC21547919Un) childAt).LJJJI()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c19vn.LJ = z4;
                        if (c19vn.LIZ) {
                            i4 = 1;
                        } else {
                            i4 = i8;
                        }
                        C19VN c19vn2 = (C19VN) childAt.getLayoutParams();
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingTop, View.MeasureSpec.getMode(childMeasureSpec));
                        if (z9 && (viewOnClickListenerC21547919Un = (ViewOnClickListenerC21547919Un) childAt) != null && viewOnClickListenerC21547919Un.LJJJI()) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (i4 > 0 && (!z5 || i4 >= 2)) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(i4 * i10, Integer.MIN_VALUE), iMakeMeasureSpec);
                            int measuredWidth = childAt.getMeasuredWidth();
                            i5 = measuredWidth / i10;
                            if (measuredWidth % i10 != 0) {
                                i5++;
                            }
                            if (z5 && i5 < 2) {
                                i5 = 2;
                            }
                        } else {
                            i5 = 0;
                        }
                        if (!c19vn2.LIZ && z5) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        c19vn2.LIZLLL = z6;
                        c19vn2.LIZIZ = i5;
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i5, 1073741824), iMakeMeasureSpec);
                        iMax2 = Math.max(iMax2, i5);
                        if (c19vn.LIZLLL) {
                            i12++;
                        }
                        if (c19vn.LIZ) {
                            z8 = true;
                        }
                        i8 -= i5;
                        iMax = Math.max(iMax, childAt.getMeasuredHeight());
                        if (i5 == 1) {
                            j |= (long) (1 << i13);
                        }
                    }
                }
                if (z8 && i11 == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z10 = false;
                if (i12 > 0) {
                    while (i8 > 0) {
                        int i15 = Integer.MAX_VALUE;
                        int i16 = 0;
                        long j2 = 0;
                        for (int i17 = 0; i17 < childCount2; i17++) {
                            C19VN c19vn3 = (C19VN) getChildAt(i17).getLayoutParams();
                            if (c19vn3.LIZLLL) {
                                int i18 = c19vn3.LIZIZ;
                                if (i18 < i15) {
                                    j2 = 1 << i17;
                                    i15 = i18;
                                    i16 = 1;
                                } else if (i18 == i15) {
                                    j2 |= 1 << i17;
                                    i16++;
                                }
                            }
                        }
                        j |= j2;
                        if (i16 > i8) {
                            break;
                        }
                        int i19 = i15 + 1;
                        for (int i20 = 0; i20 < childCount2; i20++) {
                            View childAt2 = getChildAt(i20);
                            C19VN c19vn4 = (C19VN) childAt2.getLayoutParams();
                            long j3 = 1 << i20;
                            if ((j2 & j3) == 0) {
                                if (c19vn4.LIZIZ == i19) {
                                    j |= j3;
                                }
                            } else {
                                if (z2 && c19vn4.LJ && i8 == 1) {
                                    int i21 = this.LLJJL;
                                    childAt2.setPadding(i21 + i10, 0, i21, 0);
                                }
                                c19vn4.LIZIZ++;
                                c19vn4.LJFF = true;
                                i8--;
                            }
                        }
                        z10 = true;
                    }
                }
                if (!z8 && i11 == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (i8 > 0 && j != 0 && (i8 < i11 - 1 || z3 || iMax2 > 1)) {
                    float fBitCount = Long.bitCount(j);
                    if (!z3) {
                        if ((j & 1) != 0 && !((C19VN) getChildAt(0).getLayoutParams()).LJ) {
                            fBitCount -= 0.5f;
                        }
                        int i22 = childCount2 - 1;
                        if ((j & ((long) (1 << i22))) != 0 && !((C19VN) getChildAt(i22).getLayoutParams()).LJ) {
                            fBitCount -= 0.5f;
                        }
                    }
                    if (fBitCount > 0.0f) {
                        i3 = (int) ((i8 * i10) / fBitCount);
                    } else {
                        i3 = 0;
                    }
                    for (int i23 = 0; i23 < childCount2; i23++) {
                        if ((j & ((long) (1 << i23))) != 0) {
                            View childAt3 = getChildAt(i23);
                            C19VN c19vn5 = (C19VN) childAt3.getLayoutParams();
                            if (childAt3 instanceof ViewOnClickListenerC21547919Un) {
                                c19vn5.LIZJ = i3;
                                c19vn5.LJFF = true;
                                if (i23 == 0 && !c19vn5.LJ) {
                                    ((LinearLayout.LayoutParams) c19vn5).leftMargin = (-i3) / 2;
                                }
                                z10 = true;
                            } else if (c19vn5.LIZ) {
                                c19vn5.LIZJ = i3;
                                c19vn5.LJFF = true;
                                ((LinearLayout.LayoutParams) c19vn5).rightMargin = (-i3) / 2;
                                z10 = true;
                            } else {
                                if (i23 != 0) {
                                    ((LinearLayout.LayoutParams) c19vn5).leftMargin = i3 / 2;
                                }
                                if (i23 != childCount2 - 1) {
                                    ((LinearLayout.LayoutParams) c19vn5).rightMargin = i3 / 2;
                                }
                            }
                        }
                    }
                }
                if (z10) {
                    for (int i24 = 0; i24 < childCount2; i24++) {
                        View childAt4 = getChildAt(i24);
                        C19VN c19vn6 = (C19VN) childAt4.getLayoutParams();
                        if (c19vn6.LJFF) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec((c19vn6.LIZIZ * i10) + c19vn6.LIZJ, 1073741824), childMeasureSpec);
                        }
                    }
                }
                if (mode == 1073741824) {
                    iMax = size3;
                }
                setMeasuredDimension(i6, iMax);
                return;
            }
        } else {
            for (int i25 = 0; i25 < childCount; i25++) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i25).getLayoutParams();
                layoutParams.rightMargin = 0;
                layoutParams.leftMargin = 0;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int width;
        int paddingLeft;
        if (!this.LLJJJJ) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C19VN c19vn = (C19VN) childAt.getLayoutParams();
                if (c19vn.LIZ) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (LJIIIZ(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z2) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c19vn).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c19vn).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c19vn).leftMargin) + ((LinearLayout.LayoutParams) c19vn).rightMargin;
                    LJIIIZ(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        if (i14 > 0) {
            i5 = paddingRight / i14;
        } else {
            i5 = 0;
        }
        int iMax = Math.max(0, i5);
        if (z2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C19VN c19vn2 = (C19VN) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c19vn2.LIZ) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c19vn2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c19vn2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C19VN c19vn3 = (C19VN) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c19vn3.LIZ) {
                int i19 = paddingLeft2 + ((LinearLayout.LayoutParams) c19vn3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = i19 + measuredWidth4 + ((LinearLayout.LayoutParams) c19vn3).rightMargin + iMax;
            }
        }
    }
}
