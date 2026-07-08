package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.navigation.NavigationView$SavedState;
import com.ss.android.ugc.aweme.app.R$styleable;
import u4.q0;

/* JADX INFO: renamed from: X.19Ts, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21545819Ts extends C20246914Kd {
    public static final int[] LLJILJIL = {R.attr.state_checked};
    public static final int[] LLJILJILJ = {-16842910};
    public final C19US LLILZLL;
    public final C19U6 LLIZ;
    public final int LLIZLLLIL;
    public final int[] LLJ;
    public C19QR LLJI;
    public ViewTreeObserverOnGlobalLayoutListenerC21546119Tv LLJIJIL;

    public void setNavigationItemSelectedListener(C19UM c19um) {
    }

    private MenuInflater getMenuInflater() {
        if (this.LLJI == null) {
            this.LLJI = new C19QR(getContext());
        }
        return this.LLJI;
    }

    public MenuItem getCheckedItem() {
        return this.LLIZ.LLILZIL.LLILLJJLI;
    }

    public int getHeaderCount() {
        return this.LLIZ.LLILLJJLI.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.LLIZ.LLJIJIL;
    }

    public int getItemHorizontalPadding() {
        return this.LLIZ.LLJILJIL;
    }

    public int getItemIconPadding() {
        return this.LLIZ.LLJILJILJ;
    }

    public ColorStateList getItemIconTintList() {
        return this.LLIZ.LLJI;
    }

    public int getItemMaxLines() {
        return this.LLIZ.LLJJIII;
    }

    public ColorStateList getItemTextColor() {
        return this.LLIZ.LLJ;
    }

    @Override // X.C20246914Kd, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C21539119Rd.LIZJ(this);
    }

    @Override // X.C20246914Kd, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C786410Ut5.C3(getViewTreeObserver(), this.LLJIJIL);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        NavigationView$SavedState navigationView$SavedState = new NavigationView$SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        navigationView$SavedState.menuState = bundle;
        LJIJJLI(bundle);
        return navigationView$SavedState;
    }

    public Menu getMenu() {
        return this.LLILZLL;
    }

    @Override // X.C20246914Kd
    public final void LIZ(C20246014Ju c20246014Ju) {
        int i;
        C19U6 c19u6 = this.LLIZ;
        c19u6.getClass();
        int iLJFF = c20246014Ju.LJFF();
        if (c19u6.LLJJIJI != iLJFF) {
            c19u6.LLJJIJI = iLJFF;
            if (c19u6.LLILLJJLI.getChildCount() == 0 && c19u6.LLJJI) {
                i = c19u6.LLJJIJI;
            } else {
                i = 0;
            }
            C20691815y0 c20691815y0 = c19u6.LL;
            c20691815y0.setPadding(0, i, 0, c20691815y0.getPaddingBottom());
        }
        C20691815y0 c20691815y02 = c19u6.LL;
        c20691815y02.setPadding(0, c20691815y02.getPaddingTop(), 0, c20246014Ju.LIZJ());
        q0.LIZJ(c19u6.LLILLJJLI, c20246014Ju);
    }

    public final ColorStateList LIZIZ(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListLIZIZ = C838410Wul.LIZIZ(typedValue.resourceId, getContext());
        if (!getContext().getTheme().resolveAttribute(com.zhiliaoapp.musically.R.attr.bip, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateListLIZIZ.getDefaultColor();
        int[] iArr = LLJILJILJ;
        return new ColorStateList(new int[][]{iArr, LLJILJIL, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListLIZIZ.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof NavigationView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        NavigationView$SavedState navigationView$SavedState = (NavigationView$SavedState) parcelable;
        super.onRestoreInstanceState(navigationView$SavedState.mSuperState);
        LJIJI(navigationView$SavedState.menuState);
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.LLIZ.LLILZIL.LLLI((C21548219Uq) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C21539119Rd.LIZIZ(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        C19U6 c19u6 = this.LLIZ;
        c19u6.LLJIJIL = drawable;
        c19u6.LJII(false);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(C800330VaR.LIZIZ(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        C19U6 c19u6 = this.LLIZ;
        c19u6.LLJILJIL = i;
        c19u6.LJII(false);
    }

    public void setItemHorizontalPaddingResource(int i) {
        C19U6 c19u6 = this.LLIZ;
        c19u6.LLJILJIL = getResources().getDimensionPixelSize(i);
        c19u6.LJII(false);
    }

    public void setItemIconPadding(int i) {
        C19U6 c19u6 = this.LLIZ;
        c19u6.LLJILJILJ = i;
        c19u6.LJII(false);
    }

    public void setItemIconPaddingResource(int i) {
        C19U6 c19u6 = this.LLIZ;
        c19u6.LLJILJILJ = getResources().getDimensionPixelSize(i);
        c19u6.LJII(false);
    }

    public void setItemIconSize(int i) {
        C19U6 c19u6 = this.LLIZ;
        if (c19u6.LLJILLL != i) {
            c19u6.LLJILLL = i;
            c19u6.LLJJ = true;
            c19u6.LJII(false);
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        C19U6 c19u6 = this.LLIZ;
        c19u6.LLJI = colorStateList;
        c19u6.LJII(false);
    }

    public void setItemMaxLines(int i) {
        C19U6 c19u6 = this.LLIZ;
        c19u6.LLJJIII = i;
        c19u6.LJII(false);
    }

    public void setItemTextAppearance(int i) {
        C19U6 c19u6 = this.LLIZ;
        c19u6.LLIZ = i;
        c19u6.LLIZLLLIL = true;
        c19u6.LJII(false);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        C19U6 c19u6 = this.LLIZ;
        c19u6.LLJ = colorStateList;
        c19u6.LJII(false);
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        C19U6 c19u6 = this.LLIZ;
        if (c19u6 != null) {
            c19u6.LLJJIJIL = i;
            C20691815y0 c20691815y0 = c19u6.LL;
            if (c20691815y0 != null) {
                c20691815y0.setOverScrollMode(i);
            }
        }
    }

    public void setCheckedItem(int i) {
        MenuItem menuItemFindItem = findItem(i);
        if (menuItemFindItem != null) {
            this.LLIZ.LLILZIL.LLLI((C21548219Uq) menuItemFindItem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [X.19Tv] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.19US, X.19V6, android.view.Menu] */
    public C21545819Ts(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListLIZIZ;
        int iLJIIIIZZ;
        boolean z;
        ColorStateList colorStateListLIZIZ2;
        super(C1369550lk9.LIZ(context, attributeSet, com.zhiliaoapp.musically.R.attr.f5s, com.zhiliaoapp.musically.R.style.a2h), attributeSet, com.zhiliaoapp.musically.R.attr.f5s);
        final C19U6 c19u6 = new C19U6();
        this.LLIZ = c19u6;
        this.LLJ = new int[2];
        final Context context2 = getContext();
        ?? r2 = new C19V6(context2) { // from class: X.19US
            @Override // X.C19V6, android.view.Menu
            public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
                final C21548219Uq c21548219UqLIZ = LIZ(i, i2, i3, charSequence);
                final Context context3 = this.LIZ;
                SubMenuC21548419Us subMenuC21548419Us = new SubMenuC21548419Us(context3, this, c21548219UqLIZ) { // from class: X.19UV
                    @Override // X.C19V6
                    public final void LJIILL(boolean z2) {
                        super.LJIILL(z2);
                        this.LJJIFFI.LJIILL(z2);
                    }
                };
                c21548219UqLIZ.LJIILJJIL = subMenuC21548419Us;
                subMenuC21548419Us.setHeaderTitle(c21548219UqLIZ.LJ);
                return subMenuC21548419Us;
            }
        };
        this.LLILZLL = r2;
        int[] iArr = R$styleable.NavigationView;
        C19PG.LIZ(context2, attributeSet, com.zhiliaoapp.musically.R.attr.f5s, com.zhiliaoapp.musically.R.style.a2h);
        C19PG.LIZIZ(context2, attributeSet, iArr, com.zhiliaoapp.musically.R.attr.f5s, com.zhiliaoapp.musically.R.style.a2h, new int[0]);
        C21411918qr c21411918qrLJIILIIL = C21411918qr.LJIILIIL(context2, attributeSet, iArr, com.zhiliaoapp.musically.R.attr.f5s, com.zhiliaoapp.musically.R.style.a2h);
        if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.NavigationView_android_background)) {
            setBackground(c21411918qrLJIILIIL.LJ(R$styleable.NavigationView_android_background));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C19RX c19rx = new C19RX(C19RX.LIZIZ(context2, attributeSet, com.zhiliaoapp.musically.R.attr.f5s, com.zhiliaoapp.musically.R.style.a2h));
            Drawable background = getBackground();
            C21538919Rb c21538919Rb = new C21538919Rb(c19rx);
            if (background instanceof ColorDrawable) {
                c21538919Rb.LJIIJJI(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            c21538919Rb.LJIIIIZZ(context2);
            setBackground(c21538919Rb);
        }
        if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.NavigationView_elevation)) {
            setElevation(c21411918qrLJIILIIL.LIZLLL(R$styleable.NavigationView_elevation, 0));
        }
        setFitsSystemWindows(c21411918qrLJIILIIL.LIZ(R$styleable.NavigationView_android_fitsSystemWindows, false));
        this.LLIZLLLIL = c21411918qrLJIILIIL.LIZLLL(R$styleable.NavigationView_android_maxWidth, 0);
        if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.NavigationView_itemIconTint)) {
            colorStateListLIZIZ = c21411918qrLJIILIIL.LIZIZ(R$styleable.NavigationView_itemIconTint);
        } else {
            colorStateListLIZIZ = LIZIZ(R.attr.textColorSecondary);
        }
        if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.NavigationView_itemTextAppearance)) {
            iLJIIIIZZ = c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            iLJIIIIZZ = 0;
            z = false;
        }
        if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.NavigationView_itemIconSize)) {
            setItemIconSize(c21411918qrLJIILIIL.LIZLLL(R$styleable.NavigationView_itemIconSize, 0));
        }
        if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.NavigationView_itemTextColor)) {
            colorStateListLIZIZ2 = c21411918qrLJIILIIL.LIZIZ(R$styleable.NavigationView_itemTextColor);
        } else {
            colorStateListLIZIZ2 = null;
        }
        if (!z && colorStateListLIZIZ2 == null) {
            colorStateListLIZIZ2 = LIZIZ(R.attr.textColorPrimary);
        }
        Drawable drawableLJ = c21411918qrLJIILIIL.LJ(R$styleable.NavigationView_itemBackground);
        if (drawableLJ == null && (c21411918qrLJIILIIL.LJIIJJI(R$styleable.NavigationView_itemShapeAppearance) || c21411918qrLJIILIIL.LJIIJJI(R$styleable.NavigationView_itemShapeAppearanceOverlay))) {
            C21538919Rb c21538919Rb2 = new C21538919Rb(new C19RX(C19RX.LIZ(getContext(), c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.NavigationView_itemShapeAppearance, 0), c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.NavigationView_itemShapeAppearanceOverlay, 0), new C1844490y6B(0))));
            c21538919Rb2.LJIIJJI(C19RN.LIZIZ(getContext(), c21411918qrLJIILIIL, R$styleable.NavigationView_itemShapeFillColor));
            drawableLJ = new InsetDrawable((Drawable) c21538919Rb2, c21411918qrLJIILIIL.LIZLLL(R$styleable.NavigationView_itemShapeInsetStart, 0), c21411918qrLJIILIIL.LIZLLL(R$styleable.NavigationView_itemShapeInsetTop, 0), c21411918qrLJIILIIL.LIZLLL(R$styleable.NavigationView_itemShapeInsetEnd, 0), c21411918qrLJIILIIL.LIZLLL(R$styleable.NavigationView_itemShapeInsetBottom, 0));
        }
        if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.NavigationView_itemHorizontalPadding)) {
            c19u6.LLJILJIL = c21411918qrLJIILIIL.LIZLLL(R$styleable.NavigationView_itemHorizontalPadding, 0);
            c19u6.LJII(false);
        }
        int iLIZLLL = c21411918qrLJIILIIL.LIZLLL(R$styleable.NavigationView_itemIconPadding, 0);
        setItemMaxLines(c21411918qrLJIILIIL.LJII(R$styleable.NavigationView_itemMaxLines, 1));
        r2.LJ = new C19VX() { // from class: X.19UG
            @Override // X.C19VX
            public final void LIZIZ(C19V6 c19v6) {
            }

            @Override // X.C19VX
            public final boolean LIZ(C19V6 c19v6, MenuItem menuItem) {
                this.LL.getClass();
                return false;
            }
        };
        c19u6.LLILZ = 1;
        c19u6.LJIIIIZZ(context2, r2);
        c19u6.LLJI = colorStateListLIZIZ;
        c19u6.LJII(false);
        int overScrollMode = getOverScrollMode();
        c19u6.LLJJIJIL = overScrollMode;
        C20691815y0 c20691815y0 = c19u6.LL;
        if (c20691815y0 != null) {
            c20691815y0.setOverScrollMode(overScrollMode);
        }
        if (z) {
            c19u6.LLIZ = iLJIIIIZZ;
            c19u6.LLIZLLLIL = true;
            c19u6.LJII(false);
        }
        c19u6.LLJ = colorStateListLIZIZ2;
        c19u6.LJII(false);
        c19u6.LLJIJIL = drawableLJ;
        c19u6.LJII(false);
        c19u6.LLJILJILJ = iLIZLLL;
        c19u6.LJII(false);
        C19US c19us = this.LLILZLL;
        c19us.LIZIZ(this.LLIZ, c19us.LIZ);
        if (c19u6.LL == null) {
            C20691815y0 c20691815y02 = (C20691815y0) C786410Ut5.Td(c19u6.LLILZLL, com.zhiliaoapp.musically.R.layout.bjs, this, false);
            c19u6.LL = c20691815y02;
            final C20691815y0 c20691815y03 = c19u6.LL;
            c20691815y02.setAccessibilityDelegateCompat(new C20094913jv(c20691815y03) { // from class: X.19U5
                @Override // X.C20094913jv, X.C20094213jo
                public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    int i;
                    int i2;
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                    C19UQ c19uq = c19u6.LLILZIL;
                    if (c19uq.LLILZ.LLILLJJLI.getChildCount() == 0) {
                        i = 0;
                        i2 = 0;
                    } else {
                        i = 1;
                        i2 = 0;
                    }
                    while (i2 < c19uq.LLILZ.LLILZIL.getItemCount()) {
                        if (c19uq.LLILZ.LLILZIL.getItemViewType(i2) == 0) {
                            i++;
                        }
                        i2++;
                    }
                    accessibilityNodeInfoCompat.setCollectionInfo(C20093113jd.LIZ(i, 0));
                }
            });
            if (c19u6.LLILZIL == null) {
                c19u6.LLILZIL = new C19UQ(c19u6);
            }
            int i = c19u6.LLJJIJIL;
            if (i != -1) {
                c19u6.LL.setOverScrollMode(i);
            }
            c19u6.LLILLJJLI = (LinearLayout) C786410Ut5.Td(c19u6.LLILZLL, com.zhiliaoapp.musically.R.layout.bjp, c19u6.LL, false);
            c19u6.LL.setAdapter(c19u6.LLILZIL);
        }
        addView(c19u6.LL);
        if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.NavigationView_menu)) {
            int iLJIIIIZZ2 = c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.NavigationView_menu, 0);
            C19UQ c19uq = c19u6.LLILZIL;
            if (c19uq != null) {
                c19uq.LLILLL = true;
            }
            getMenuInflater().inflate(iLJIIIIZZ2, r2);
            C19UQ c19uq2 = c19u6.LLILZIL;
            if (c19uq2 != null) {
                c19uq2.LLILLL = false;
            }
            c19u6.LJII(false);
        }
        if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.NavigationView_headerLayout)) {
            c19u6.LLILLJJLI.addView(C786410Ut5.Td(c19u6.LLILZLL, c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.NavigationView_headerLayout, 0), c19u6.LLILLJJLI, false));
            C20691815y0 c20691815y04 = c19u6.LL;
            c20691815y04.setPadding(0, 0, 0, c20691815y04.getPaddingBottom());
        }
        c21411918qrLJIILIIL.LJIILJJIL();
        this.LLJIJIL = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.19Tv
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C21545819Ts c21545819Ts = this.LL;
                c21545819Ts.getLocationOnScreen(c21545819Ts.LLJ);
                C21545819Ts c21545819Ts2 = this.LL;
                boolean z2 = c21545819Ts2.LLJ[1] == 0;
                C19U6 c19u62 = c21545819Ts2.LLIZ;
                if (c19u62.LLJJI != z2) {
                    c19u62.LLJJI = z2;
                    int i2 = (c19u62.LLILLJJLI.getChildCount() == 0 && c19u62.LLJJI) ? c19u62.LLJJIJI : 0;
                    C20691815y0 c20691815y05 = c19u62.LL;
                    c20691815y05.setPadding(0, i2, 0, c20691815y05.getPaddingBottom());
                }
                this.LL.setDrawTopInsetForeground(z2);
                for (Context context3 = this.LL.getContext(); context3 instanceof ContextWrapper; context3 = ((ContextWrapper) context3).getBaseContext()) {
                    if (context3 instanceof Activity) {
                        Activity activity = (Activity) context3;
                        if (activity != null) {
                            this.LL.setDrawBottomInsetForeground((activity.findViewById(R.id.content).getHeight() == this.LL.getHeight()) && (Color.alpha(activity.getWindow().getNavigationBarColor()) != 0));
                            return;
                        }
                        return;
                    }
                }
            }
        };
        C786410Ut5.x3(getViewTreeObserver(), this.LLJIJIL);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i = View.MeasureSpec.makeMeasureSpec(this.LLIZLLLIL, 1073741824);
            }
        } else {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), this.LLIZLLLIL), 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
