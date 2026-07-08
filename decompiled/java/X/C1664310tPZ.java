package X;

import Y.ALAdapterS20S0100000_25;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0tPZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664310tPZ extends C1664300tPY {
    public final FrameLayout LLJ;
    public final TuxIconView LLJI;
    public final SmartImageView LLJIJIL;
    public final TuxTextView LLJILJIL;
    public final View LLJILJILJ;
    public final C19670811xi LLJILLL;
    public AbstractC1664270tPV LLJJ;

    @Override // X.C1664300tPY
    public final void N5() {
        TuxTextView tuxTextView = this.LLJILJIL;
        if (tuxTextView != null) {
            Context context = tuxTextView.getContext();
            tuxTextView.setText(context != null ? context.getString(R.string.m8s) : null);
        }
        SmartImageView smartImageView = this.LLJIJIL;
        if (smartImageView != null) {
            C1331670kl3 c1331670kl3LJFF = C1331660kl2.LJFF(R.drawable.c49);
            c1331670kl3LJFF.LJIILJJIL = 0;
            c1331670kl3LJFF.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJFF);
        }
        TuxIconView tuxIconView = this.LLJI;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        U5(false);
    }

    @Override // X.C1664300tPY
    public final AbstractC1664270tPV R5() {
        return this.LLJJ;
    }

    @Override // X.C1664300tPY
    public final void I5(C1664150tPJ c1664150tPJ) {
        if (c1664150tPJ.LJ == 1 || c1664150tPJ.LJFF == 1) {
            C786410Ut5.T4(this.itemView, 0.34f);
        } else {
            C786410Ut5.T4(this.itemView, 1.0f);
        }
        if (c1664150tPJ.LIZJ) {
            N5();
        } else {
            L5(c1664150tPJ.LIZ);
        }
        U5(c1664150tPJ.LJII);
        V5(c1664150tPJ.LJIIIIZZ);
        T5(c1664150tPJ.LJIIIZ);
        S5(c1664150tPJ.LJIIJ);
    }

    @Override // X.C1664300tPY
    public final void L5(Effect effect) {
        int i;
        int iIntValue;
        if (effect == null) {
            return;
        }
        TuxTextView tuxTextView = this.LLJILJIL;
        if (tuxTextView != null) {
            tuxTextView.setText(effect.getName());
        }
        this.LLJJ.LIZLLL();
        List<String> urlList = effect.getIconUrl().getUrlList();
        int i2 = 1;
        if (!urlList.isEmpty()) {
            boolean zLIZJ = C352370Drf.LIZJ(effect);
            if (C357780E0y.LIZ()) {
                i = 14;
            } else {
                i = 8;
            }
            float fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i)));
            if (zLIZJ) {
                Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) ListProtector.get(urlList, 0));
                if (numLJIIJJI != null) {
                    iIntValue = numLJIIJJI.intValue();
                } else {
                    iIntValue = 0;
                }
                SmartImageView smartImageView = this.LLJIJIL;
                if (smartImageView != null) {
                    C1331670kl3 c1331670kl3LJFF = C1331660kl2.LJFF(iIntValue);
                    C1331750klB c1331750klB = new C1331750klB();
                    c1331750klB.LJI = new C1331920klS(fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ);
                    c1331670kl3LJFF.LJJI = new C1331730kl9(c1331750klB);
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.e9);
                    c384050F3z.LIZJ = Float.valueOf(fLIZIZ);
                    c1331670kl3LJFF.LJJIIZI(c384050F3z.LIZ(this.itemView.getContext()));
                    c1331670kl3LJFF.LJJ(smartImageView);
                    C786410Ut5.h3(c1331670kl3LJFF);
                }
            } else {
                SmartImageView smartImageView2 = this.LLJIJIL;
                if (smartImageView2 != null) {
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ((String) ListProtector.get(urlList, 0));
                    C1331750klB c1331750klB2 = new C1331750klB();
                    c1331750klB2.LJI = new C1331920klS(fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ);
                    c1331670kl3LJIIIZ.LJJI = new C1331730kl9(c1331750klB2);
                    C384050F3z c384050F3z2 = new C384050F3z();
                    c384050F3z2.LIZIZ = Integer.valueOf(R.attr.e9);
                    c384050F3z2.LIZJ = Float.valueOf(fLIZIZ);
                    c1331670kl3LJIIIZ.LJJIIZI(c384050F3z2.LIZ(this.itemView.getContext()));
                    c1331670kl3LJIIIZ.LJJ(smartImageView2);
                    C786410Ut5.h3(c1331670kl3LJIIIZ);
                }
            }
        }
        C2296208zA.LIZ().getClass();
        if (!C2299808zk.LIZ(effect) && !C1664460tPo.LJFF(effect)) {
            i2 = 0;
        }
        P5(i2);
    }

    @Override // X.C1664300tPY
    public final void S5(boolean z) {
        View viewFindViewById = this.itemView.findViewById(R.id.g3y);
        if (viewFindViewById == null) {
            return;
        }
        C375780EoK.LIZIZ(viewFindViewById, z);
    }

    @Override // X.C1664300tPY
    public final void T5(int i) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        if (i >= 0 && i <= 100) {
            if (i == 100) {
                if (C297840Blu.LIZ()) {
                    C19670811xi c19670811xi = this.LLJILLL;
                    if (c19670811xi != null) {
                        c19670811xi.setProgress(100);
                    }
                    C19670811xi c19670811xi2 = this.LLJILLL;
                    if (c19670811xi2 != null && (viewPropertyAnimatorAnimate = c19670811xi2.animate()) != null) {
                        viewPropertyAnimatorAnimate.scaleX(1.5f);
                        viewPropertyAnimatorAnimate.scaleY(1.5f);
                        viewPropertyAnimatorAnimate.setInterpolator(C1619980sG4.LJIILIIL());
                        viewPropertyAnimatorAnimate.setDuration(200L);
                        viewPropertyAnimatorAnimate.setListener(new ALAdapterS20S0100000_25(this, 5));
                        viewPropertyAnimatorAnimate.start();
                        return;
                    }
                    return;
                }
                C19670811xi c19670811xi3 = this.LLJILLL;
                if (c19670811xi3 == null) {
                    return;
                }
                C375780EoK.LIZIZ(c19670811xi3, false);
                return;
            }
            C19670811xi c19670811xi4 = this.LLJILLL;
            if (c19670811xi4 != null) {
                C375780EoK.LIZIZ(c19670811xi4, true);
            }
            C19670811xi c19670811xi5 = this.LLJILLL;
            if (c19670811xi5 == null) {
                return;
            }
            c19670811xi5.setProgress(i);
            return;
        }
        C19670811xi c19670811xi6 = this.LLJILLL;
        if (c19670811xi6 != null) {
            C375780EoK.LIZIZ(c19670811xi6, false);
        }
    }

    @Override // X.C1664300tPY
    public final void U5(boolean z) {
        int i;
        if (z) {
            View view = this.LLJILJILJ;
            int iLIZ = C960203pA.LIZ(R.attr.ee, this.itemView.getContext());
            Context context = view.getContext();
            if (C357780E0y.LIZ()) {
                i = R.drawable.a9q;
            } else {
                i = R.drawable.a9p;
            }
            Drawable drawable = context.getDrawable(i);
            ((GradientDrawable) drawable).setStroke((int) C12ES.LIZJ(2.0f, view.getContext()), iLIZ);
            view.setBackground(drawable);
        } else {
            this.LLJILJILJ.setBackground(null);
        }
        TuxTextView tuxTextView = this.LLJILJIL;
        if (tuxTextView != null) {
            tuxTextView.setSelected(z);
        }
        this.LLJJ.LIZIZ(z);
    }

    @Override // X.C1664300tPY
    public final void V5(int i) {
        View viewFindViewById;
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.y4b);
        if (tuxIconView == null || (viewFindViewById = this.itemView.findViewById(R.id.y46)) == null) {
            return;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    C375780EoK.LIZIZ(tuxIconView, false);
                    C375780EoK.LIZIZ(viewFindViewById, false);
                    return;
                } else {
                    C375780EoK.LIZIZ(tuxIconView, false);
                    C375780EoK.LIZIZ(viewFindViewById, true);
                    return;
                }
            }
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_human_soundwave_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            tuxIconView.setTuxIcon(c419910GdJ);
            C375780EoK.LIZIZ(tuxIconView, true);
            C375780EoK.LIZIZ(viewFindViewById, false);
            return;
        }
        C375780EoK.LIZIZ(tuxIconView, false);
        C375780EoK.LIZIZ(viewFindViewById, false);
    }

    public C1664310tPZ(FrameLayout frameLayout, SmartImageView smartImageView, TuxTextView tuxTextView, View view, C1664160tPK c1664160tPK, C19670811xi c19670811xi) {
        super(frameLayout, view, c1664160tPK, c19670811xi);
        this.LLJ = frameLayout;
        this.LLJI = null;
        this.LLJIJIL = smartImageView;
        this.LLJILJIL = tuxTextView;
        this.LLJILJILJ = view;
        this.LLJILLL = c19670811xi;
        this.LLJJ = new C1664280tPW(view);
    }
}
