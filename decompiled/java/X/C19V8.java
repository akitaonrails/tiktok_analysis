package X;

import Y.ACListenerS167S0100000_33;
import Y.ARunnableS133S0100000_33;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar$SavedState;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u4.q0;

/* JADX INFO: renamed from: X.19V8, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19V8 extends ViewGroup implements C19F8 {
    public static final /* synthetic */ int LLLIILIL = 0;
    public C19VD LL;
    public AppCompatTextView LLILLJJLI;
    public AppCompatTextView LLILLL;
    public C21413718r9 LLILZ;
    public AppCompatImageView LLILZIL;
    public final Drawable LLILZLL;
    public final CharSequence LLIZ;
    public C21413718r9 LLIZLLLIL;
    public View LLJ;
    public Context LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public final int LLJILLL;
    public final int LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public C19VU LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public final int LLJJJJ;
    public CharSequence LLJJJJJIL;
    public CharSequence LLJJJJLIIL;
    public ColorStateList LLJJL;
    public ColorStateList LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public final ArrayList<View> LLJLILLLLZIIL;
    public final ArrayList<View> LLJLL;
    public final int[] LLJLLIL;
    public final C19EP LLJLLL;
    public ArrayList<MenuItem> LLJZ;
    public InterfaceC21551019Vs LLJZIJLIL;
    public final C21550419Vm LLL;
    public C19V9 LLLF;
    public ActionMenuPresenter LLLFF;
    public C19VA LLLFFI;
    public InterfaceC21549519Vd LLLFZ;
    public C19VX LLLI;
    public boolean LLLII;
    public OnBackInvokedCallback LLLIIII;
    public OnBackInvokedDispatcher LLLIIIIL;
    public boolean LLLIIIL;
    public final ARunnableS133S0100000_33 LLLIIL;

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C19QR(getContext());
    }

    public final void LIZJ() {
        if (this.LLIZLLLIL == null) {
            C21413718r9 c21413718r9 = new C21413718r9(getContext(), null, R.attr.fun);
            this.LLIZLLLIL = c21413718r9;
            c21413718r9.setImageDrawable(this.LLILZLL);
            this.LLIZLLLIL.setContentDescription(this.LLIZ);
            C19MJ c19mj = new C19MJ();
            c19mj.LIZ = (this.LLJILLL & 112) | 8388611;
            c19mj.LIZIZ = 2;
            C21413718r9 c21413718r92 = this.LLIZLLLIL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21413718r92);
            c21413718r92.setLayoutParams(c19mj);
            C786410Ut5.P7(this.LLIZLLLIL, new ACListenerS167S0100000_33(this, 2));
        }
    }

    public final void LJ() {
        if (this.LL == null) {
            C19VD c19vd = new C19VD(getContext(), null);
            this.LL = c19vd;
            c19vd.setPopupTheme(this.LLJIJIL);
            this.LL.setOnMenuItemClickListener(this.LLL);
            C19VD c19vd2 = this.LL;
            InterfaceC21549519Vd interfaceC21549519Vd = this.LLLFZ;
            C19VX c19vx = new C19VX() { // from class: X.19VB
                @Override // X.C19VX
                public final void LIZIZ(C19V6 c19v6) {
                    ActionMenuPresenter actionMenuPresenter = this.LL.LL.LLJJIJIL;
                    if (actionMenuPresenter == null || !actionMenuPresenter.LJIIL()) {
                        Iterator<InterfaceC21506819Es> it2 = this.LL.LLJLLL.LIZIZ.iterator();
                        while (it2.hasNext()) {
                            it2.next().LIZJ(c19v6);
                        }
                    }
                    C19VX c19vx2 = this.LL.LLLI;
                    if (c19vx2 != null) {
                        c19vx2.LIZIZ(c19v6);
                    }
                }

                @Override // X.C19VX
                public final boolean LIZ(C19V6 c19v6, MenuItem menuItem) {
                    C19VX c19vx2 = this.LL.LLLI;
                    if (c19vx2 != null && c19vx2.LIZ(c19v6, menuItem)) {
                        return true;
                    }
                    return false;
                }
            };
            c19vd2.LLJJJ = interfaceC21549519Vd;
            c19vd2.LLJJJIL = c19vx;
            C19MJ c19mj = new C19MJ();
            c19mj.LIZ = (this.LLJILLL & 112) | 8388613;
            C19VD c19vd3 = this.LL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19vd3);
            c19vd3.setLayoutParams(c19mj);
            LIZIZ(this.LL, false);
        }
    }

    public final void LJFF() {
        if (this.LLILZ == null) {
            this.LLILZ = new C21413718r9(getContext(), null, R.attr.fun);
            C19MJ c19mj = new C19MJ();
            c19mj.LIZ = (this.LLJILLL & 112) | 8388611;
            C21413718r9 c21413718r9 = this.LLILZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21413718r9);
            c21413718r9.setLayoutParams(c19mj);
        }
    }

    public final void LJIJ() {
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherLIZ = C19VR.LIZ(this);
            C19VA c19va = this.LLLFFI;
            if (c19va == null || c19va.LLILLJJLI == null || onBackInvokedDispatcherLIZ == null || !isAttachedToWindow() || !this.LLLIIIL) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.LLLIIIIL;
                if (onBackInvokedDispatcher != null) {
                    C19VR.LIZLLL(onBackInvokedDispatcher, this.LLLIIII);
                    this.LLLIIIIL = null;
                    return;
                }
                return;
            }
            if (this.LLLIIIIL == null) {
                if (this.LLLIIII == null) {
                    this.LLLIIII = C19VR.LIZIZ(new ARunnableS133S0100000_33(this, 7));
                }
                C19VR.LIZJ(onBackInvokedDispatcherLIZ, this.LLLIIII);
                this.LLLIIIIL = onBackInvokedDispatcherLIZ;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C19MJ();
    }

    public CharSequence getCollapseContentDescription() {
        C21413718r9 c21413718r9 = this.LLIZLLLIL;
        if (c21413718r9 != null) {
            return c21413718r9.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C21413718r9 c21413718r9 = this.LLIZLLLIL;
        if (c21413718r9 != null) {
            return c21413718r9.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C19VU c19vu = this.LLJJIJIL;
        if (c19vu != null) {
            return c19vu.LJI ? c19vu.LIZ : c19vu.LIZIZ;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.LLJJJIL;
        return i == Integer.MIN_VALUE ? getContentInsetEnd() : i;
    }

    public int getContentInsetLeft() {
        C19VU c19vu = this.LLJJIJIL;
        if (c19vu != null) {
            return c19vu.LIZ;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C19VU c19vu = this.LLJJIJIL;
        if (c19vu != null) {
            return c19vu.LIZIZ;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C19VU c19vu = this.LLJJIJIL;
        if (c19vu != null) {
            return c19vu.LJI ? c19vu.LIZIZ : c19vu.LIZ;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.LLJJJ;
        return i == Integer.MIN_VALUE ? getContentInsetStart() : i;
    }

    public int getCurrentContentInsetEnd() {
        C19V6 c19v6;
        C19VD c19vd = this.LL;
        return (c19vd == null || (c19v6 = c19vd.LLJJI) == null || !c19v6.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.LLJJJIL, 0));
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.LLILZIL;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.LLILZIL;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public CharSequence getNavigationContentDescription() {
        C21413718r9 c21413718r9 = this.LLILZ;
        if (c21413718r9 != null) {
            return c21413718r9.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C21413718r9 c21413718r9 = this.LLILZ;
        if (c21413718r9 != null) {
            return c21413718r9.getDrawable();
        }
        return null;
    }

    public C19W5 getWrapper() {
        if (this.LLLF == null) {
            this.LLLF = new C19V9(this, true);
        }
        return this.LLLF;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ActionMenuPresenter actionMenuPresenter;
        C21548219Uq c21548219Uq;
        Toolbar$SavedState toolbar$SavedState = new Toolbar$SavedState(super.onSaveInstanceState());
        C19VA c19va = this.LLLFFI;
        if (c19va != null && (c21548219Uq = c19va.LLILLJJLI) != null) {
            toolbar$SavedState.LL = c21548219Uq.LIZ;
        }
        C19VD c19vd = this.LL;
        boolean z = false;
        if (c19vd != null && (actionMenuPresenter = c19vd.LLJJIJIL) != null && actionMenuPresenter.LJIIL()) {
            z = true;
        }
        toolbar$SavedState.LLILLJJLI = z;
        return toolbar$SavedState;
    }

    public final void LIZLLL() {
        LJ();
        C19VD c19vd = this.LL;
        if (c19vd.LLJJI == null) {
            C19V6 c19v6 = (C19V6) c19vd.getMenu();
            if (this.LLLFFI == null) {
                this.LLLFFI = new C19VA(this);
            }
            this.LL.setExpandedActionViewsExclusive(true);
            c19v6.LIZIZ(this.LLLFFI, this.LLJI);
            LJIJ();
        }
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.LLJJJ, 0)) : getContentInsetStart();
    }

    public Menu getMenu() {
        LIZLLL();
        return this.LL.getMenu();
    }

    public Drawable getOverflowIcon() {
        LIZLLL();
        return this.LL.getOverflowIcon();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LJIJ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.LLLIIL);
        LJIJ();
    }

    public View getNavButtonView() {
        return this.LLILZ;
    }

    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.LLLFF;
    }

    public Context getPopupContext() {
        return this.LLJI;
    }

    public int getPopupTheme() {
        return this.LLJIJIL;
    }

    public CharSequence getSubtitle() {
        return this.LLJJJJLIIL;
    }

    public final TextView getSubtitleTextView() {
        return this.LLILLL;
    }

    public CharSequence getTitle() {
        return this.LLJJJJJIL;
    }

    public int getTitleMarginBottom() {
        return this.LLJJIJIIJIL;
    }

    public int getTitleMarginEnd() {
        return this.LLJJIII;
    }

    public int getTitleMarginStart() {
        return this.LLJJI;
    }

    public int getTitleMarginTop() {
        return this.LLJJIJI;
    }

    public final TextView getTitleTextView() {
        return this.LLILLJJLI;
    }

    public static C19MJ LJI(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C19MJ) {
            return new C19MJ((C19MJ) layoutParams);
        }
        if (layoutParams instanceof C19MI) {
            return new C19MJ((C19MI) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C19MJ((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C19MJ(layoutParams);
    }

    public static int LJIIIIZZ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public static int LJIIIZ(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public static void LJIIL(C19V8 c19v8) {
        Iterator<MenuItem> it2 = c19v8.LLJZ.iterator();
        while (it2.hasNext()) {
            c19v8.getMenu().removeItem(it2.next().getItemId());
        }
        Menu menu = c19v8.getMenu();
        ArrayList<MenuItem> currentMenuItems = c19v8.getCurrentMenuItems();
        C19EP c19ep = c19v8.LLJLLL;
        MenuInflater menuInflater = c19v8.getMenuInflater();
        Iterator<InterfaceC21506819Es> it3 = c19ep.LIZIZ.iterator();
        while (it3.hasNext()) {
            it3.next().LIZIZ(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = c19v8.getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        c19v8.LLJZ = currentMenuItems2;
    }

    public final void LJIIJ(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final boolean LJIIJJI(View view) {
        if (view.getParent() != this && !this.LLJLL.contains(view)) {
            return false;
        }
        return true;
    }

    public final boolean LJIIZILJ(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override // X.C19F8
    public final void addMenuProvider(InterfaceC21506819Es interfaceC21506819Es) {
        C19EP c19ep = this.LLJLLL;
        c19ep.LIZIZ.add(interfaceC21506819Es);
        c19ep.LIZ.run();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof C19MJ)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C19MJ(getContext(), attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001b  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHoverEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r4 = r6.getActionMasked()
            r3 = 0
            r2 = 9
            if (r4 != r2) goto Lb
            r5.LLJLIL = r3
        Lb:
            boolean r0 = r5.LLJLIL
            r1 = 1
            if (r0 != 0) goto L1b
            boolean r0 = super.onHoverEvent(r6)
            if (r4 != r2) goto L1b
            if (r0 != 0) goto L1a
            r5.LLJLIL = r1
        L1a:
            return r1
        L1b:
            r0 = 10
            if (r4 == r0) goto L22
            r0 = 3
            if (r4 != r0) goto L1a
        L22:
            r5.LLJLIL = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19V8.onHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        C19V6 c19v6;
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof Toolbar$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Toolbar$SavedState toolbar$SavedState = (Toolbar$SavedState) parcelable;
        super.onRestoreInstanceState(toolbar$SavedState.mSuperState);
        C19VD c19vd = this.LL;
        if (c19vd != null) {
            c19v6 = c19vd.LLJJI;
        } else {
            c19v6 = null;
        }
        int i = toolbar$SavedState.LL;
        if (i != 0 && this.LLLFFI != null && c19v6 != null && (menuItemFindItem = c19v6.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (toolbar$SavedState.LLILLJJLI) {
            removeCallbacks(this.LLLIIL);
            post(this.LLLIIL);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.LLJJIJIL == null) {
            this.LLJJIJIL = new C19VU();
        }
        C19VU c19vu = this.LLJJIJIL;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != c19vu.LJI) {
            c19vu.LJI = z;
            if (c19vu.LJII) {
                if (z) {
                    int i2 = c19vu.LIZLLL;
                    if (i2 == Integer.MIN_VALUE) {
                        i2 = c19vu.LJ;
                    }
                    c19vu.LIZ = i2;
                    int i3 = c19vu.LIZJ;
                    if (i3 == Integer.MIN_VALUE) {
                        i3 = c19vu.LJFF;
                    }
                    c19vu.LIZIZ = i3;
                    return;
                }
                int i4 = c19vu.LIZJ;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = c19vu.LJ;
                }
                c19vu.LIZ = i4;
                int i5 = c19vu.LIZLLL;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = c19vu.LJFF;
                }
                c19vu.LIZIZ = i5;
                return;
            }
            c19vu.LIZ = c19vu.LJ;
            c19vu.LIZIZ = c19vu.LJFF;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r3 = r5.getActionMasked()
            r2 = 0
            if (r3 != 0) goto L9
            r4.LLJL = r2
        L9:
            boolean r0 = r4.LLJL
            r1 = 1
            if (r0 != 0) goto L19
            boolean r0 = super.onTouchEvent(r5)
            if (r3 != 0) goto L19
            if (r0 != 0) goto L18
            r4.LLJL = r1
        L18:
            return r1
        L19:
            if (r3 == r1) goto L1e
            r0 = 3
            if (r3 != r0) goto L18
        L1e:
            r4.LLJL = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19V8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // X.C19F8
    public final void removeMenuProvider(InterfaceC21506819Es interfaceC21506819Es) {
        this.LLJLLL.LIZ(interfaceC21506819Es);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.LLLIIIL != z) {
            this.LLLIIIL = z;
            LJIJ();
        }
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            LIZJ();
        }
        C21413718r9 c21413718r9 = this.LLIZLLLIL;
        if (c21413718r9 != null) {
            c21413718r9.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            LIZJ();
            this.LLIZLLLIL.setImageDrawable(drawable);
        } else {
            C21413718r9 c21413718r9 = this.LLIZLLLIL;
            if (c21413718r9 == null) {
                return;
            }
            c21413718r9.setImageDrawable(this.LLILZLL);
        }
    }

    public void setCollapsible(boolean z) {
        this.LLLII = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.LLJJJIL) {
            this.LLJJJIL = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.LLJJJ) {
            this.LLJJJ = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.LLILZIL == null) {
                this.LLILZIL = new AppCompatImageView(getContext());
            }
            if (!LJIIJJI(this.LLILZIL)) {
                LIZIZ(this.LLILZIL, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.LLILZIL;
            if (appCompatImageView != null && LJIIJJI(appCompatImageView)) {
                C786410Ut5.LJJLIIIJJI(this, this.LLILZIL);
                this.LLJLL.remove(this.LLILZIL);
            }
        }
        AppCompatImageView appCompatImageView2 = this.LLILZIL;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.LLILZIL == null) {
            this.LLILZIL = new AppCompatImageView(getContext());
        }
        AppCompatImageView appCompatImageView = this.LLILZIL;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            LJFF();
        }
        C21413718r9 c21413718r9 = this.LLILZ;
        if (c21413718r9 != null) {
            c21413718r9.setContentDescription(charSequence);
            C1697050uGN.LIZ(this.LLILZ, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            LJFF();
            if (!LJIIJJI(this.LLILZ)) {
                LIZIZ(this.LLILZ, true);
            }
        } else {
            C21413718r9 c21413718r9 = this.LLILZ;
            if (c21413718r9 != null && LJIIJJI(c21413718r9)) {
                C786410Ut5.LJJLIIIJJI(this, this.LLILZ);
                this.LLJLL.remove(this.LLILZ);
            }
        }
        C21413718r9 c21413718r92 = this.LLILZ;
        if (c21413718r92 != null) {
            c21413718r92.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        LJFF();
        C786410Ut5.P7(this.LLILZ, onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC21551019Vs interfaceC21551019Vs) {
        this.LLJZIJLIL = interfaceC21551019Vs;
    }

    public void setOverflowIcon(Drawable drawable) {
        LIZLLL();
        this.LL.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.LLJIJIL != i) {
            this.LLJIJIL = i;
            if (i == 0) {
                this.LLJI = getContext();
            } else {
                this.LLJI = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.LLILLL == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.LLILLL = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.LLILLL.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.LLJILJILJ;
                if (i != 0) {
                    this.LLILLL.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.LLJJLIIIJLLLLLLLZ;
                if (colorStateList != null) {
                    this.LLILLL.setTextColor(colorStateList);
                }
            }
            if (!LJIIJJI(this.LLILLL)) {
                LIZIZ(this.LLILLL, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.LLILLL;
            if (appCompatTextView2 != null && LJIIJJI(appCompatTextView2)) {
                C786410Ut5.LJJLIIIJJI(this, this.LLILLL);
                this.LLJLL.remove(this.LLILLL);
            }
        }
        AppCompatTextView appCompatTextView3 = this.LLILLL;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.LLJJJJLIIL = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.LLJJLIIIJLLLLLLLZ = colorStateList;
        AppCompatTextView appCompatTextView = this.LLILLL;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.LLILLJJLI == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.LLILLJJLI = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.LLILLJJLI.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.LLJILJIL;
                if (i != 0) {
                    this.LLILLJJLI.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.LLJJL;
                if (colorStateList != null) {
                    this.LLILLJJLI.setTextColor(colorStateList);
                }
            }
            if (!LJIIJJI(this.LLILLJJLI)) {
                LIZIZ(this.LLILLJJLI, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.LLILLJJLI;
            if (appCompatTextView2 != null && LJIIJJI(appCompatTextView2)) {
                C786410Ut5.LJJLIIIJJI(this, this.LLILLJJLI);
                this.LLJLL.remove(this.LLILLJJLI);
            }
        }
        AppCompatTextView appCompatTextView3 = this.LLILLJJLI;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.LLJJJJJIL = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.LLJJIJIIJIL = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.LLJJIII = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.LLJJI = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.LLJJIJI = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.LLJJL = colorStateList;
        AppCompatTextView appCompatTextView = this.LLILLJJLI;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return LJI(layoutParams);
    }

    public void setCollapseContentDescription(int i) {
        CharSequence text;
        if (i != 0) {
            text = getContext().getText(i);
        } else {
            text = null;
        }
        setCollapseContentDescription(text);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C14MI.LIZ(getContext(), i));
    }

    public void setLogo(int i) {
        setLogo(C14MI.LIZ(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        CharSequence text;
        if (i != 0) {
            text = getContext().getText(i);
        } else {
            text = null;
        }
        setNavigationContentDescription(text);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C14MI.LIZ(getContext(), i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public C19V8(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZ(int i, List list) {
        boolean z;
        if (getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        ArrayList arrayList = (ArrayList) list;
        arrayList.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                C19MJ c19mj = (C19MJ) childAt.getLayoutParams();
                if (c19mj.LIZIZ == 0 && LJIIZILJ(childAt)) {
                    int i3 = c19mj.LIZ;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            C19MJ c19mj2 = (C19MJ) childAt2.getLayoutParams();
            if (c19mj2.LIZIZ == 0 && LJIIZILJ(childAt2)) {
                int i5 = c19mj2.LIZ;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void LIZIZ(View view, boolean z) {
        C19MJ c19mjLJI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            c19mjLJI = new C19MJ();
        } else if (!checkLayoutParams(layoutParams)) {
            c19mjLJI = LJI(layoutParams);
        } else {
            c19mjLJI = (C19MJ) layoutParams;
        }
        c19mjLJI.LIZIZ = 1;
        if (z && this.LLJ != null) {
            C786410Ut5.W5(view, c19mjLJI);
            this.LLJLL.add(view);
        } else {
            addView(view, c19mjLJI);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r0 != 80) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJII(int r9, android.view.View r10) {
        /*
            r8 = this;
            android.view.ViewGroup$LayoutParams r5 = r10.getLayoutParams()
            X.19MI r5 = (X.C19MI) r5
            int r7 = r10.getMeasuredHeight()
            r6 = 0
            if (r9 <= 0) goto L51
            int r0 = r7 - r9
            int r4 = r0 / 2
        L11:
            int r0 = r5.LIZ
            r3 = r0 & 112(0x70, float:1.57E-43)
            r0 = 16
            r2 = 80
            r1 = 48
            if (r3 == r0) goto L29
            if (r3 == r1) goto L62
            if (r3 == r2) goto L53
            int r0 = r8.LLJJJJ
            r0 = r0 & 112(0x70, float:1.57E-43)
            if (r0 == r1) goto L62
            if (r0 == r2) goto L53
        L29:
            int r4 = r8.getPaddingTop()
            int r3 = r8.getPaddingBottom()
            int r2 = r8.getHeight()
            int r0 = r2 - r4
            int r0 = r0 - r3
            int r0 = r0 - r7
            int r1 = r0 / 2
            int r0 = r5.topMargin
            if (r1 >= r0) goto L42
            r1 = r0
        L40:
            int r4 = r4 + r1
            return r4
        L42:
            int r2 = r2 - r3
            int r2 = r2 - r7
            int r2 = r2 - r1
            int r2 = r2 - r4
            int r0 = r5.bottomMargin
            if (r2 >= r0) goto L40
            int r0 = r0 - r2
            int r1 = r1 - r0
            int r1 = java.lang.Math.max(r6, r1)
            goto L40
        L51:
            r4 = 0
            goto L11
        L53:
            int r1 = r8.getHeight()
            int r0 = r8.getPaddingBottom()
            int r1 = r1 - r0
            int r1 = r1 - r7
            int r0 = r5.bottomMargin
            int r1 = r1 - r0
            int r1 = r1 - r4
            return r1
        L62:
            int r0 = r8.getPaddingTop()
            int r0 = r0 - r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19V8.LJII(int, android.view.View):int");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        char c;
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iMax2;
        int[] iArr = this.LLJLLIL;
        int i3 = 0;
        if (getLayoutDirection() == 1) {
            c = 1;
        } else {
            c = 0;
        }
        int i4 = c ^ 1;
        if (LJIIZILJ(this.LLILZ)) {
            LJIILLIIL(this.LLILZ, i, 0, i2, this.LLJJ);
            measuredWidth = this.LLILZ.getMeasuredWidth() + LJIIIIZZ(this.LLILZ);
            iMax = Math.max(0, this.LLILZ.getMeasuredHeight() + LJIIIZ(this.LLILZ));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.LLILZ.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (LJIIZILJ(this.LLIZLLLIL)) {
            LJIILLIIL(this.LLIZLLLIL, i, 0, i2, this.LLJJ);
            measuredWidth = this.LLIZLLLIL.getMeasuredWidth() + LJIIIIZZ(this.LLIZLLLIL);
            iMax = Math.max(iMax, this.LLIZLLLIL.getMeasuredHeight() + LJIIIZ(this.LLIZLLLIL));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.LLIZLLLIL.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr[c] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (LJIIZILJ(this.LL)) {
            LJIILLIIL(this.LL, i, iMax3, i2, this.LLJJ);
            measuredWidth2 = this.LL.getMeasuredWidth() + LJIIIIZZ(this.LL);
            iMax = Math.max(iMax, this.LL.getMeasuredHeight() + LJIIIZ(this.LL));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.LL.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i4] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (LJIIZILJ(this.LLJ)) {
            iMax4 += LJIILL(this.LLJ, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.LLJ.getMeasuredHeight() + LJIIIZ(this.LLJ));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.LLJ.getMeasuredState());
        }
        if (LJIIZILJ(this.LLILZIL)) {
            iMax4 += LJIILL(this.LLILZIL, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.LLILZIL.getMeasuredHeight() + LJIIIZ(this.LLILZIL));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.LLILZIL.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (((C19MJ) childAt.getLayoutParams()).LIZIZ == 0 && LJIIZILJ(childAt)) {
                iMax4 += LJIILL(childAt, i, iMax4, i2, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + LJIIIZ(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i6 = this.LLJJIJI + this.LLJJIJIIJIL;
        int i7 = this.LLJJI + this.LLJJIII;
        if (LJIIZILJ(this.LLILLJJLI)) {
            LJIILL(this.LLILLJJLI, i, iMax4 + i7, i2, i6, iArr);
            iMax2 = this.LLILLJJLI.getMeasuredWidth() + LJIIIIZZ(this.LLILLJJLI);
            measuredHeight = this.LLILLJJLI.getMeasuredHeight() + LJIIIZ(this.LLILLJJLI);
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.LLILLJJLI.getMeasuredState());
        } else {
            measuredHeight = 0;
            iMax2 = 0;
        }
        if (LJIIZILJ(this.LLILLL)) {
            iMax2 = Math.max(iMax2, LJIILL(this.LLILLL, i, iMax4 + i7, i2, measuredHeight + i6, iArr));
            measuredHeight += this.LLILLL.getMeasuredHeight() + LJIIIZ(this.LLILLL);
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.LLILLL.getMeasuredState());
        }
        int iMax5 = Math.max(iMax, measuredHeight);
        int paddingLeft = iMax4 + iMax2 + getPaddingLeft() + getPaddingRight();
        int paddingTop = iMax5 + getPaddingTop() + getPaddingBottom();
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, iCombineMeasuredStates << 16);
        if (this.LLLII) {
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt2 = getChildAt(i8);
                if (LJIIZILJ(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    i3 = iResolveSizeAndState2;
                    break;
                }
            }
        } else {
            i3 = iResolveSizeAndState2;
            break;
        }
        setMeasuredDimension(iResolveSizeAndState, i3);
    }

    public C19V8(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.fuo);
        this.LLJJJJ = 8388627;
        this.LLJLILLLLZIIL = new ArrayList<>();
        this.LLJLL = new ArrayList<>();
        this.LLJLLIL = new int[2];
        this.LLJLLL = new C19EP(new ARunnableS133S0100000_33(this, 6));
        this.LLJZ = new ArrayList<>();
        this.LLL = new C21550419Vm(this);
        this.LLLIIL = new ARunnableS133S0100000_33(this, 5);
        Context context2 = getContext();
        int[] iArr = R$styleable.Toolbar;
        C21411918qr c21411918qrLJIILIIL = C21411918qr.LJIILIIL(context2, attributeSet, iArr, R.attr.fuo, 0);
        q0.LJIIZILJ(this, context, iArr, attributeSet, c21411918qrLJIILIIL.LIZIZ, R.attr.fuo);
        this.LLJILJIL = c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.Toolbar_titleTextAppearance, 0);
        this.LLJILJILJ = c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.Toolbar_subtitleTextAppearance, 0);
        this.LLJJJJ = c21411918qrLJIILIIL.LIZIZ.getInteger(R$styleable.Toolbar_android_gravity, 8388627);
        this.LLJILLL = c21411918qrLJIILIIL.LIZIZ.getInteger(R$styleable.Toolbar_buttonGravity, 48);
        int iLIZJ = c21411918qrLJIILIIL.LIZJ(R$styleable.Toolbar_titleMargin, 0);
        iLIZJ = c21411918qrLJIILIIL.LJIIJJI(R$styleable.Toolbar_titleMargins) ? c21411918qrLJIILIIL.LIZJ(R$styleable.Toolbar_titleMargins, iLIZJ) : iLIZJ;
        this.LLJJIJIIJIL = iLIZJ;
        this.LLJJIJI = iLIZJ;
        this.LLJJIII = iLIZJ;
        this.LLJJI = iLIZJ;
        int iLIZJ2 = c21411918qrLJIILIIL.LIZJ(R$styleable.Toolbar_titleMarginStart, -1);
        if (iLIZJ2 >= 0) {
            this.LLJJI = iLIZJ2;
        }
        int iLIZJ3 = c21411918qrLJIILIIL.LIZJ(R$styleable.Toolbar_titleMarginEnd, -1);
        if (iLIZJ3 >= 0) {
            this.LLJJIII = iLIZJ3;
        }
        int iLIZJ4 = c21411918qrLJIILIIL.LIZJ(R$styleable.Toolbar_titleMarginTop, -1);
        if (iLIZJ4 >= 0) {
            this.LLJJIJI = iLIZJ4;
        }
        int iLIZJ5 = c21411918qrLJIILIIL.LIZJ(R$styleable.Toolbar_titleMarginBottom, -1);
        if (iLIZJ5 >= 0) {
            this.LLJJIJIIJIL = iLIZJ5;
        }
        this.LLJJ = c21411918qrLJIILIIL.LIZLLL(R$styleable.Toolbar_maxButtonHeight, -1);
        int iLIZJ6 = c21411918qrLJIILIIL.LIZJ(R$styleable.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int iLIZJ7 = c21411918qrLJIILIIL.LIZJ(R$styleable.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int iLIZLLL = c21411918qrLJIILIIL.LIZLLL(R$styleable.Toolbar_contentInsetLeft, 0);
        int iLIZLLL2 = c21411918qrLJIILIIL.LIZLLL(R$styleable.Toolbar_contentInsetRight, 0);
        if (this.LLJJIJIL == null) {
            this.LLJJIJIL = new C19VU();
        }
        C19VU c19vu = this.LLJJIJIL;
        c19vu.LJII = false;
        if (iLIZLLL != Integer.MIN_VALUE) {
            c19vu.LJ = iLIZLLL;
            c19vu.LIZ = iLIZLLL;
        }
        if (iLIZLLL2 != Integer.MIN_VALUE) {
            c19vu.LJFF = iLIZLLL2;
            c19vu.LIZIZ = iLIZLLL2;
        }
        if (iLIZJ6 != Integer.MIN_VALUE || iLIZJ7 != Integer.MIN_VALUE) {
            c19vu.LIZ(iLIZJ6, iLIZJ7);
        }
        this.LLJJJ = c21411918qrLJIILIIL.LIZJ(R$styleable.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.LLJJJIL = c21411918qrLJIILIIL.LIZJ(R$styleable.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.LLILZLL = c21411918qrLJIILIIL.LJ(R$styleable.Toolbar_collapseIcon);
        this.LLIZ = c21411918qrLJIILIIL.LJIIJ(R$styleable.Toolbar_collapseContentDescription);
        CharSequence charSequenceLJIIJ = c21411918qrLJIILIIL.LJIIJ(R$styleable.Toolbar_title);
        if (!TextUtils.isEmpty(charSequenceLJIIJ)) {
            setTitle(charSequenceLJIIJ);
        }
        CharSequence charSequenceLJIIJ2 = c21411918qrLJIILIIL.LJIIJ(R$styleable.Toolbar_subtitle);
        if (!TextUtils.isEmpty(charSequenceLJIIJ2)) {
            setSubtitle(charSequenceLJIIJ2);
        }
        this.LLJI = getContext();
        setPopupTheme(c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.Toolbar_popupTheme, 0));
        Drawable drawableLJ = c21411918qrLJIILIIL.LJ(R$styleable.Toolbar_navigationIcon);
        if (drawableLJ != null) {
            setNavigationIcon(drawableLJ);
        }
        CharSequence charSequenceLJIIJ3 = c21411918qrLJIILIIL.LJIIJ(R$styleable.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(charSequenceLJIIJ3)) {
            setNavigationContentDescription(charSequenceLJIIJ3);
        }
        Drawable drawableLJ2 = c21411918qrLJIILIIL.LJ(R$styleable.Toolbar_logo);
        if (drawableLJ2 != null) {
            setLogo(drawableLJ2);
        }
        CharSequence charSequenceLJIIJ4 = c21411918qrLJIILIIL.LJIIJ(R$styleable.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(charSequenceLJIIJ4)) {
            setLogoDescription(charSequenceLJIIJ4);
        }
        if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.Toolbar_titleTextColor)) {
            setTitleTextColor(c21411918qrLJIILIIL.LIZIZ(R$styleable.Toolbar_titleTextColor));
        }
        if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(c21411918qrLJIILIIL.LIZIZ(R$styleable.Toolbar_subtitleTextColor));
        }
        if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.Toolbar_menu)) {
            LJIIJ(c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.Toolbar_menu, 0));
        }
        c21411918qrLJIILIIL.LJIILJJIL();
    }

    public final int LJIILIIL(View view, int i, int i2, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = marginLayoutParams.leftMargin - iArr[0];
        int iMax = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int iLJII = LJII(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iLJII, iMax + measuredWidth, view.getMeasuredHeight() + iLJII);
        return iMax + measuredWidth + marginLayoutParams.rightMargin;
    }

    public final int LJIILJJIL(View view, int i, int i2, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i3 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iLJII = LJII(i2, view);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iLJII, iMax, view.getMeasuredHeight() + iLJII);
        return iMax - (measuredWidth + marginLayoutParams.leftMargin);
    }

    public final void LJIILLIIL(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02a1 A[LOOP:1: B:99:0x029f->B:100:0x02a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c5 A[LOOP:2: B:102:0x02c3->B:103:0x02c5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0312 A[LOOP:3: B:109:0x0310->B:110:0x0312, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a5 A[LOOP:0: B:64:0x01a3->B:65:0x01a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19V8.onLayout(boolean, int, int, int, int):void");
    }

    public final int LJIILL(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }
}
