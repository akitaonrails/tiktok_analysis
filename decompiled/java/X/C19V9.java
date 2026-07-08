package X;

import Y.ACListenerS135S0200000_33;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.AppCompatTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.19V9, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19V9 implements C19W5 {
    public final C19V8 LIZ;
    public int LIZIZ;
    public C21547719Ul LIZJ;
    public View LIZLLL;
    public Drawable LJ;
    public Drawable LJFF;
    public Drawable LJI;
    public boolean LJII;
    public CharSequence LJIIIIZZ;
    public CharSequence LJIIIZ;
    public CharSequence LJIIJ;
    public Window.Callback LJIIJJI;
    public boolean LJIIL;
    public ActionMenuPresenter LJIILIIL;
    public int LJIILJJIL;
    public Drawable LJIILL;

    @Override // X.C19W5
    public final void LIZLLL() {
        this.LJIIL = true;
    }

    @Override // X.C19W5
    public final void LJIIIIZZ() {
    }

    @Override // X.C19W5
    public final void LJIIJJI() {
    }

    @Override // X.C19W5
    public final void LJIILLIIL() {
    }

    @Override // X.C19W5
    public final void LJIIZILJ() {
    }

    @Override // X.C19W5
    public final boolean LIZ() {
        ActionMenuPresenter actionMenuPresenter;
        C19VD c19vd = this.LIZ.LL;
        return (c19vd == null || (actionMenuPresenter = c19vd.LLJJIJIL) == null || !actionMenuPresenter.LJIIJJI()) ? false : true;
    }

    @Override // X.C19W5
    public final boolean LIZIZ() {
        ActionMenuPresenter actionMenuPresenter;
        C19VD c19vd = this.LIZ.LL;
        return (c19vd == null || (actionMenuPresenter = c19vd.LLJJIJIL) == null || !actionMenuPresenter.LJIILIIL()) ? false : true;
    }

    @Override // X.C19W5
    public final boolean LIZJ() {
        ActionMenuPresenter actionMenuPresenter;
        C19VD c19vd = this.LIZ.LL;
        return (c19vd == null || (actionMenuPresenter = c19vd.LLJJIJIL) == null || !actionMenuPresenter.LJIIL()) ? false : true;
    }

    @Override // X.C19W5
    public final boolean LJ() {
        ActionMenuPresenter actionMenuPresenter;
        C19VD c19vd = this.LIZ.LL;
        if (c19vd == null || (actionMenuPresenter = c19vd.LLJJIJIL) == null) {
            return false;
        }
        return actionMenuPresenter.LLJJJIL != null || actionMenuPresenter.LJIIL();
    }

    @Override // X.C19W5
    public final boolean LJFF() {
        C19VD c19vd;
        C19V8 c19v8 = this.LIZ;
        return c19v8.getVisibility() == 0 && (c19vd = c19v8.LL) != null && c19vd.LLJJIJIIJIL;
    }

    @Override // X.C19W5
    public final void LJIIL() {
        ActionMenuPresenter actionMenuPresenter;
        C19VD c19vd = this.LIZ.LL;
        if (c19vd == null || (actionMenuPresenter = c19vd.LLJJIJIL) == null) {
            return;
        }
        actionMenuPresenter.LJIIJJI();
        C19VI c19vi = actionMenuPresenter.LLJJJ;
        if (c19vi == null || !c19vi.LIZIZ()) {
            return;
        }
        c19vi.LJIIIZ.dismiss();
    }

    @Override // X.C19W5
    public final void LJIILIIL() {
        C21547719Ul c21547719Ul = this.LIZJ;
        if (c21547719Ul != null) {
            ViewParent parent = c21547719Ul.getParent();
            C19V8 c19v8 = this.LIZ;
            if (parent == c19v8) {
                C786410Ut5.LJJLIIIJJI(c19v8, this.LIZJ);
            }
        }
        this.LIZJ = null;
    }

    @Override // X.C19W5
    public final boolean LJIILL() {
        C19VA c19va = this.LIZ.LLLFFI;
        return (c19va == null || c19va.LLILLJJLI == null) ? false : true;
    }

    public final void LJIJI() {
        if ((this.LIZIZ & 4) != 0) {
            if (TextUtils.isEmpty(this.LJIIJ)) {
                this.LIZ.setNavigationContentDescription(this.LJIILJJIL);
            } else {
                this.LIZ.setNavigationContentDescription(this.LJIIJ);
            }
        }
    }

    public final void LJIJJ() {
        Drawable drawable;
        int i = this.LIZIZ;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.LJFF) == null) {
            drawable = this.LJ;
        }
        this.LIZ.setLogo(drawable);
    }

    @Override // X.C19W5
    public final void collapseActionView() {
        C21548219Uq c21548219Uq;
        C19VA c19va = this.LIZ.LLLFFI;
        if (c19va == null || (c21548219Uq = c19va.LLILLJJLI) == null) {
            return;
        }
        c21548219Uq.collapseActionView();
    }

    @Override // X.C19W5
    public final Context getContext() {
        return this.LIZ.getContext();
    }

    @Override // X.C19W5
    public final CharSequence getTitle() {
        return this.LIZ.getTitle();
    }

    @Override // X.C19W5
    public final int LJIILJJIL() {
        return this.LIZIZ;
    }

    @Override // X.C19W5
    public final void LJII(int i) {
        View view;
        int i2 = this.LIZIZ ^ i;
        this.LIZIZ = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    LJIJI();
                }
                if ((this.LIZIZ & 4) != 0) {
                    C19V8 c19v8 = this.LIZ;
                    Drawable drawable = this.LJI;
                    if (drawable == null) {
                        drawable = this.LJIILL;
                    }
                    c19v8.setNavigationIcon(drawable);
                } else {
                    this.LIZ.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                LJIJJ();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.LIZ.setTitle(this.LJIIIIZZ);
                    this.LIZ.setSubtitle(this.LJIIIZ);
                } else {
                    this.LIZ.setTitle((CharSequence) null);
                    this.LIZ.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.LIZLLL) != null) {
                if ((i & 16) != 0) {
                    this.LIZ.addView(view);
                } else {
                    C786410Ut5.LJJLIIIJJI(this.LIZ, view);
                }
            }
        }
    }

    @Override // X.C19W5
    public final void LJIIIZ(boolean z) {
        this.LIZ.setCollapsible(z);
    }

    @Override // X.C19W5
    public final void LJIJ(int i) {
        Drawable drawableLIZ;
        if (i != 0) {
            drawableLIZ = C14MI.LIZ(getContext(), i);
        } else {
            drawableLIZ = null;
        }
        this.LJFF = drawableLIZ;
        LJIJJ();
    }

    @Override // X.C19W5
    public final void setIcon(int i) {
        Drawable drawableLIZ;
        if (i != 0) {
            drawableLIZ = C14MI.LIZ(getContext(), i);
        } else {
            drawableLIZ = null;
        }
        setIcon(drawableLIZ);
    }

    @Override // X.C19W5
    public final void setVisibility(int i) {
        C786410Ut5.LLILLJJLI(this.LIZ, i);
    }

    @Override // X.C19W5
    public final void setWindowCallback(Window.Callback callback) {
        this.LJIIJJI = callback;
    }

    @Override // X.C19W5
    public final void setWindowTitle(CharSequence charSequence) {
        if (!this.LJII) {
            this.LJIIIIZZ = charSequence;
            if ((this.LIZIZ & 8) != 0) {
                this.LIZ.setTitle(charSequence);
                if (this.LJII) {
                    q0.LJIJJ(this.LIZ.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // X.C19W5
    public final void setIcon(Drawable drawable) {
        this.LJ = drawable;
        LJIJJ();
    }

    public C19V9(C19V8 c19v8, boolean z) {
        boolean z2;
        int i;
        Drawable drawable;
        this.LIZ = c19v8;
        this.LJIIIIZZ = c19v8.getTitle();
        this.LJIIIZ = c19v8.getSubtitle();
        if (this.LJIIIIZZ != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJII = z2;
        this.LJI = c19v8.getNavigationIcon();
        C21411918qr c21411918qrLJIILIIL = C21411918qr.LJIILIIL(c19v8.getContext(), null, R$styleable.ActionBar, R.attr.b82, 0);
        this.LJIILL = c21411918qrLJIILIIL.LJ(R$styleable.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence charSequenceLJIIJ = c21411918qrLJIILIIL.LJIIJ(R$styleable.ActionBar_title);
            if (!TextUtils.isEmpty(charSequenceLJIIJ)) {
                this.LJII = true;
                this.LJIIIIZZ = charSequenceLJIIJ;
                if ((this.LIZIZ & 8) != 0) {
                    c19v8.setTitle(charSequenceLJIIJ);
                    if (this.LJII) {
                        q0.LJIJJ(c19v8.getRootView(), charSequenceLJIIJ);
                    }
                }
            }
            CharSequence charSequenceLJIIJ2 = c21411918qrLJIILIIL.LJIIJ(R$styleable.ActionBar_subtitle);
            if (!TextUtils.isEmpty(charSequenceLJIIJ2)) {
                this.LJIIIZ = charSequenceLJIIJ2;
                if ((this.LIZIZ & 8) != 0) {
                    c19v8.setSubtitle(charSequenceLJIIJ2);
                }
            }
            Drawable drawableLJ = c21411918qrLJIILIIL.LJ(R$styleable.ActionBar_logo);
            if (drawableLJ != null) {
                this.LJFF = drawableLJ;
                LJIJJ();
            }
            Drawable drawableLJ2 = c21411918qrLJIILIIL.LJ(R$styleable.ActionBar_icon);
            if (drawableLJ2 != null) {
                setIcon(drawableLJ2);
            }
            if (this.LJI == null && (drawable = this.LJIILL) != null) {
                this.LJI = drawable;
                if ((this.LIZIZ & 4) != 0) {
                    c19v8.setNavigationIcon(drawable);
                } else {
                    c19v8.setNavigationIcon((Drawable) null);
                }
            }
            LJII(c21411918qrLJIILIIL.LJII(R$styleable.ActionBar_displayOptions, 0));
            int iLJIIIIZZ = c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.ActionBar_customNavigationLayout, 0);
            if (iLJIIIIZZ != 0) {
                View viewTd = C786410Ut5.Td(C786410Ut5.ne(c19v8.getContext()), iLJIIIIZZ, c19v8, false);
                View view = this.LIZLLL;
                if (view != null && (this.LIZIZ & 16) != 0) {
                    C786410Ut5.LJJLIIIJJI(c19v8, view);
                }
                this.LIZLLL = viewTd;
                if (viewTd != null && (this.LIZIZ & 16) != 0) {
                    c19v8.addView(viewTd);
                }
                LJII(this.LIZIZ | 16);
            }
            int layoutDimension = c21411918qrLJIILIIL.LIZIZ.getLayoutDimension(R$styleable.ActionBar_height, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = c19v8.getLayoutParams();
                layoutParams.height = layoutDimension;
                C19V8 c19v82 = this.LIZ;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19v82);
                c19v82.setLayoutParams(layoutParams);
            }
            int iLIZJ = c21411918qrLJIILIIL.LIZJ(R$styleable.ActionBar_contentInsetStart, -1);
            int iLIZJ2 = c21411918qrLJIILIIL.LIZJ(R$styleable.ActionBar_contentInsetEnd, -1);
            if (iLIZJ >= 0 || iLIZJ2 >= 0) {
                int iMax = Math.max(iLIZJ, 0);
                int iMax2 = Math.max(iLIZJ2, 0);
                if (c19v8.LLJJIJIL == null) {
                    c19v8.LLJJIJIL = new C19VU();
                }
                c19v8.LLJJIJIL.LIZ(iMax, iMax2);
            }
            int iLJIIIIZZ2 = c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.ActionBar_titleTextStyle, 0);
            if (iLJIIIIZZ2 != 0) {
                Context context = c19v8.getContext();
                c19v8.LLJILJIL = iLJIIIIZZ2;
                AppCompatTextView appCompatTextView = c19v8.LLILLJJLI;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, iLJIIIIZZ2);
                }
            }
            int iLJIIIIZZ3 = c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.ActionBar_subtitleTextStyle, 0);
            if (iLJIIIIZZ3 != 0) {
                Context context2 = c19v8.getContext();
                c19v8.LLJILJILJ = iLJIIIIZZ3;
                AppCompatTextView appCompatTextView2 = c19v8.LLILLL;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, iLJIIIIZZ3);
                }
            }
            int iLJIIIIZZ4 = c21411918qrLJIILIIL.LJIIIIZZ(R$styleable.ActionBar_popupTheme, 0);
            if (iLJIIIIZZ4 != 0) {
                c19v8.setPopupTheme(iLJIIIIZZ4);
            }
        } else {
            if (c19v8.getNavigationIcon() != null) {
                this.LJIILL = c19v8.getNavigationIcon();
                i = 15;
            } else {
                i = 11;
            }
            this.LIZIZ = i;
        }
        c21411918qrLJIILIIL.LJIILJJIL();
        if (2131822949 != this.LJIILJJIL) {
            this.LJIILJJIL = 2131822949;
            if (TextUtils.isEmpty(c19v8.getNavigationContentDescription())) {
                int i2 = this.LJIILJJIL;
                this.LJIIJ = i2 != 0 ? getContext().getString(i2) : null;
                LJIJI();
            }
        }
        this.LJIIJ = c19v8.getNavigationContentDescription();
        c19v8.setNavigationOnClickListener(new ACListenerS135S0200000_33(this, 0));
    }

    @Override // X.C19W5
    public final void LJI(C19V6 c19v6, C19WV c19wv) {
        if (this.LJIILIIL == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.LIZ.getContext());
            this.LJIILIIL = actionMenuPresenter;
            actionMenuPresenter.LLJ = R.id.a41;
        }
        this.LJIILIIL.LLILZIL = c19wv;
        C19V8 c19v8 = this.LIZ;
        ActionMenuPresenter actionMenuPresenter2 = this.LJIILIIL;
        if (c19v6 == null && c19v8.LL == null) {
            return;
        }
        c19v8.LJ();
        C19V6 c19v62 = c19v8.LL.LLJJI;
        if (c19v62 == c19v6) {
            return;
        }
        if (c19v62 != null) {
            c19v62.LJIIZILJ(c19v8.LLLFF);
            c19v62.LJIIZILJ(c19v8.LLLFFI);
        }
        if (c19v8.LLLFFI == null) {
            c19v8.LLLFFI = new C19VA(c19v8);
        }
        actionMenuPresenter2.LLJJIJI = true;
        if (c19v6 != null) {
            c19v6.LIZIZ(actionMenuPresenter2, c19v8.LLJI);
            c19v6.LIZIZ(c19v8.LLLFFI, c19v8.LLJI);
        } else {
            actionMenuPresenter2.LJIIIIZZ(c19v8.LLJI, null);
            c19v8.LLLFFI.LJIIIIZZ(c19v8.LLJI, null);
            actionMenuPresenter2.LJII(true);
            c19v8.LLLFFI.LJII(true);
        }
        c19v8.LL.setPopupTheme(c19v8.LLJIJIL);
        c19v8.LL.setPresenter(actionMenuPresenter2);
        c19v8.LLLFF = actionMenuPresenter2;
        c19v8.LJIJ();
    }

    @Override // X.C19W5
    public final C19WF LJIIJ(final int i, long j) {
        float f;
        C19WF c19wfLIZIZ = q0.LIZIZ(this.LIZ);
        if (i == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        c19wfLIZIZ.LIZ(f);
        c19wfLIZIZ.LIZJ(j);
        c19wfLIZIZ.LJ(new C21550819Vq() { // from class: X.19VV
            public boolean LIZ;

            @Override // X.C21550819Vq, X.C19WE
            public final void LIZJ() {
                this.LIZ = true;
            }

            @Override // X.C19WE
            public final void LIZ() {
                if (this.LIZ) {
                    return;
                }
                C786410Ut5.LLILLJJLI(this.LIZJ.LIZ, i);
            }

            @Override // X.C21550819Vq, X.C19WE
            public final void LIZIZ() {
                C786410Ut5.LLILLJJLI(this.LIZJ.LIZ, 0);
            }
        });
        return c19wfLIZIZ;
    }
}
