package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomnavigation.BottomNavigationPresenter;
import com.google.android.material.bottomnavigation.BottomNavigationView$SavedState;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19Tt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21545919Tt extends FrameLayout {
    public final C21546219Tw LL;
    public final C21546019Tu LLILLJJLI;
    public final BottomNavigationPresenter LLILLL;
    public ColorStateList LLILZ;
    public C19QR LLILZIL;

    public int getMaxItemCount() {
        return 5;
    }

    public void setOnNavigationItemReselectedListener(C19UJ c19uj) {
    }

    public void setOnNavigationItemSelectedListener(C19UK c19uk) {
    }

    private MenuInflater getMenuInflater() {
        if (this.LLILZIL == null) {
            this.LLILZIL = new C19QR(getContext());
        }
        return this.LLILZIL;
    }

    public Drawable getItemBackground() {
        return this.LLILLJJLI.getItemBackground();
    }

    public int getItemBackgroundResource() {
        return this.LLILLJJLI.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.LLILLJJLI.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.LLILLJJLI.getIconTintList();
    }

    public int getItemTextAppearanceActive() {
        return this.LLILLJJLI.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.LLILLJJLI.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.LLILLJJLI.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.LLILLJJLI.getLabelVisibilityMode();
    }

    public int getSelectedItemId() {
        return this.LLILLJJLI.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C21539119Rd.LIZJ(this);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        BottomNavigationView$SavedState bottomNavigationView$SavedState = new BottomNavigationView$SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        bottomNavigationView$SavedState.LL = bundle;
        LJIJJLI(bundle);
        return bottomNavigationView$SavedState;
    }

    public ColorStateList getItemRippleColor() {
        return this.LLILZ;
    }

    public Menu getMenu() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof BottomNavigationView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        BottomNavigationView$SavedState bottomNavigationView$SavedState = (BottomNavigationView$SavedState) parcelable;
        super.onRestoreInstanceState(bottomNavigationView$SavedState.mSuperState);
        LJIJI(bottomNavigationView$SavedState.LL);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C21539119Rd.LIZIZ(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.LLILLJJLI.setItemBackground(drawable);
        this.LLILZ = null;
    }

    public void setItemBackgroundResource(int i) {
        this.LLILLJJLI.setItemBackgroundRes(i);
        this.LLILZ = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        C21546019Tu c21546019Tu = this.LLILLJJLI;
        if (c21546019Tu.LLJI != z) {
            c21546019Tu.setItemHorizontalTranslationEnabled(z);
            this.LLILLL.LJII(false);
        }
    }

    public void setItemIconSize(int i) {
        this.LLILLJJLI.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.LLILLJJLI.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.LLILZ == colorStateList) {
            if (colorStateList == null && this.LLILLJJLI.getItemBackground() != null) {
                this.LLILLJJLI.setItemBackground(null);
                return;
            }
            return;
        }
        this.LLILZ = colorStateList;
        if (colorStateList == null) {
            this.LLILLJJLI.setItemBackground(null);
        } else {
            this.LLILLJJLI.setItemBackground(new RippleDrawable(C19Q7.LIZ(colorStateList), null, null));
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.LLILLJJLI.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.LLILLJJLI.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.LLILLJJLI.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.LLILLJJLI.getLabelVisibilityMode() != i) {
            this.LLILLJJLI.setLabelVisibilityMode(i);
            this.LLILLL.LJII(false);
        }
    }

    public void setSelectedItemId(int i) {
        MenuItem menuItemFindItem = findItem(i);
        if (menuItemFindItem != null && !LJIILLIIL(menuItemFindItem, this.LLILLL, 0)) {
            menuItemFindItem.setChecked(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.19Tw, X.19V6, android.view.Menu] */
    public C21545919Tt(Context context, AttributeSet attributeSet) {
        int i;
        super(C1369550lk9.LIZ(context, attributeSet, R.attr.bcw, R.style.a2d), attributeSet, R.attr.bcw);
        BottomNavigationPresenter bottomNavigationPresenter = new BottomNavigationPresenter();
        this.LLILLL = bottomNavigationPresenter;
        final Context context2 = getContext();
        ?? r4 = new C19V6(context2) { // from class: X.19Tw
            @Override // X.C19V6
            public final C21548219Uq LIZ(int i2, int i3, int i4, CharSequence charSequence) {
                if (size() + 1 <= 5) {
                    LJJI();
                    C21548219Uq c21548219UqLIZ = super.LIZ(i2, i3, i4, charSequence);
                    c21548219UqLIZ.LJI(true);
                    LJJ();
                    return c21548219UqLIZ;
                }
                throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
            }

            @Override // X.C19V6, android.view.Menu
            public final SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
                throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
            }
        };
        this.LL = r4;
        C21546019Tu c21546019Tu = new C21546019Tu(context2);
        this.LLILLJJLI = c21546019Tu;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        C21546019Tu c21546019Tu2 = this.LLILLJJLI;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21546019Tu2);
        c21546019Tu2.setLayoutParams(layoutParams);
        bottomNavigationPresenter.LL = c21546019Tu;
        bottomNavigationPresenter.LLILLL = 1;
        c21546019Tu.setPresenter(bottomNavigationPresenter);
        C21546219Tw c21546219Tw = this.LL;
        c21546219Tw.LIZIZ(this.LLILLL, c21546219Tw.LIZ);
        getContext();
        bottomNavigationPresenter.LL.LLJJL = r4;
        int[] iArr = R$styleable.BottomNavigationView;
        int[] iArr2 = {R$styleable.BottomNavigationView_itemTextAppearanceInactive, R$styleable.BottomNavigationView_itemTextAppearanceActive};
        C19PG.LIZ(context2, attributeSet, R.attr.bcw, R.style.a2d);
        C19PG.LIZIZ(context2, attributeSet, iArr, R.attr.bcw, R.style.a2d, iArr2);
        C21411918qr c21411918qrLJIILIIL = C21411918qr.LJIILIIL(context2, attributeSet, iArr, R.attr.bcw, R.style.a2d);
        if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.BottomNavigationView_itemIconTint)) {
            c21546019Tu.setIconTintList(c21411918qrLJIILIIL.LIZIZ(R$styleable.BottomNavigationView_itemIconTint));
        } else {
            c21546019Tu.setIconTintList(c21546019Tu.LIZJ());
        }
        setItemIconSize(c21411918qrLJIILIIL.LIZLLL(R$styleable.BottomNavigationView_itemIconSize, getResources().getDimensionPixelSize(R.dimen.qb)));
        if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.BottomNavigationView_itemTextAppearanceInactive)) {
            i = 0;
            setItemTextAppearanceInactive(c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.BottomNavigationView_itemTextAppearanceInactive, 0));
        } else {
            i = 0;
        }
        if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.BottomNavigationView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.BottomNavigationView_itemTextAppearanceActive, i));
        }
        if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.BottomNavigationView_itemTextColor)) {
            setItemTextColor(c21411918qrLJIILIIL.LIZIZ(R$styleable.BottomNavigationView_itemTextColor));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C21538919Rb c21538919Rb = new C21538919Rb();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                c21538919Rb.LJIIJJI(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            c21538919Rb.LJIIIIZZ(context2);
            setBackground(c21538919Rb);
        }
        if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.BottomNavigationView_elevation)) {
            setElevation(c21411918qrLJIILIIL.LIZLLL(R$styleable.BottomNavigationView_elevation, 0));
        }
        C16GF.LJII(getBackground().mutate(), C19RN.LIZIZ(context2, c21411918qrLJIILIIL, R$styleable.BottomNavigationView_backgroundTint));
        setLabelVisibilityMode(c21411918qrLJIILIIL.LIZIZ.getInteger(R$styleable.BottomNavigationView_labelVisibilityMode, -1));
        setItemHorizontalTranslationEnabled(c21411918qrLJIILIIL.LIZ(R$styleable.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int iLJIIIIZZ = c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.BottomNavigationView_itemBackground, 0);
        if (iLJIIIIZZ != 0) {
            c21546019Tu.setItemBackgroundRes(iLJIIIIZZ);
        } else {
            setItemRippleColor(C19RN.LIZIZ(context2, c21411918qrLJIILIIL, R$styleable.BottomNavigationView_itemRippleColor));
        }
        if (c21411918qrLJIILIIL.LJIIJJI(R$styleable.BottomNavigationView_menu)) {
            int iLJIIIIZZ2 = c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.BottomNavigationView_menu, 0);
            bottomNavigationPresenter.LLILLJJLI = true;
            getMenuInflater().inflate(iLJIIIIZZ2, r4);
            bottomNavigationPresenter.LLILLJJLI = false;
            bottomNavigationPresenter.LJII(true);
        }
        c21411918qrLJIILIIL.LJIILJJIL();
        addView(c21546019Tu, layoutParams);
        r4.LJ = new C19VX() { // from class: X.19UF
            @Override // X.C19VX
            public final void LIZIZ(C19V6 c19v6) {
            }

            @Override // X.C19VX
            public final boolean LIZ(C19V6 c19v6, MenuItem menuItem) {
                this.LL.getClass();
                this.LL.getClass();
                return false;
            }
        };
        C21551419Vw.LIZ(this, new C19W0() { // from class: X.19Vy
            @Override // X.C19W0
            public final C20246014Ju LIZ(View view, C20246014Ju c20246014Ju, C21551719Vz c21551719Vz) {
                int i2;
                c21551719Vz.LIZLLL += c20246014Ju.LIZJ();
                boolean z = true;
                if (view.getLayoutDirection() != 1) {
                    z = false;
                }
                int iLIZLLL = c20246014Ju.LIZLLL();
                int iLJ = c20246014Ju.LJ();
                int i3 = c21551719Vz.LIZ;
                if (z) {
                    i2 = iLJ;
                } else {
                    i2 = iLIZLLL;
                }
                int i4 = i3 + i2;
                c21551719Vz.LIZ = i4;
                int i5 = c21551719Vz.LIZJ;
                if (!z) {
                    iLIZLLL = iLJ;
                }
                int i6 = i5 + iLIZLLL;
                c21551719Vz.LIZJ = i6;
                view.setPaddingRelative(i4, c21551719Vz.LIZIZ, i6, c21551719Vz.LIZLLL);
                return c20246014Ju;
            }
        });
    }
}
