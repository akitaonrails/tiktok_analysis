package X;

import Y.ALAdapterS18S0200000_24;
import Y.AUListenerS272S0100000_24;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0rYR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1592930rYR {
    public final C1592950rYT LL;
    public EnumC1571190qzN LLILLJJLI;
    public final PreDrawableInflate LLILLL;
    public final C1593020rYa LLILZ;
    public EnumC1593030rYb LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;

    public void LIZIZ(InterfaceC1593160rYo interfaceC1593160rYo) {
    }

    public abstract void LIZJ(int i, boolean z);

    public SmartImageView LJ() {
        return null;
    }

    public abstract ImageView LJI();

    public abstract ImageView LJII();

    public abstract ImageView LJIIIIZZ();

    public abstract ImageView LJIIIZ();

    public abstract TuxTextView LJIIJ();

    public abstract void LJIJI();

    public abstract void LJIJJ();

    public abstract void LJIJJLI();

    public abstract void LJJI();

    public void LJJIFFI(C19EG c19eg) {
    }

    public void LJJII() {
    }

    public void LJJIIJ(C19EG c19eg, C1592290rXP c1592290rXP, Pair pair) {
    }

    public void LJJIIJZLJL(C19EG c19eg, C592330NLb c592330NLb, C1592290rXP c1592290rXP, Pair pair) {
    }

    public abstract void LJJIIZ(EnumC1571190qzN enumC1571190qzN);

    public abstract void LJJIJ();

    public abstract boolean LJJIJIIJIL(EnumC1593030rYb enumC1593030rYb, EnumC1571190qzN enumC1571190qzN, boolean z);

    public abstract void LJJIJIL();

    public final void LJIIJJI() {
        if (this.LLJILJIL) {
            return;
        }
        ImageView imageViewLJI = LJI();
        if (imageViewLJI != null) {
            C1592950rYT c1592950rYT = this.LL;
            if (!c1592950rYT.LLJJI) {
                c1592950rYT.LLJI = imageViewLJI;
                if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LIZIZ()) {
                    FrameLayout frameLayout = c1592950rYT.LLJJJJ;
                    if (frameLayout != null) {
                        frameLayout.addView(c1592950rYT.LLJI);
                    }
                } else {
                    c1592950rYT.addView(c1592950rYT.LLJI);
                }
            }
        }
        this.LLJILJIL = true;
    }

    public final void LJIIL() {
        if (this.LLJ) {
            return;
        }
        SmartImageView smartImageViewLJ = LJ();
        C1592950rYT c1592950rYT = this.LL;
        c1592950rYT.LLJJIJIIJIL = smartImageViewLJ;
        if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LIZIZ()) {
            FrameLayout frameLayout = c1592950rYT.LLJJJJ;
            if (frameLayout != null) {
                frameLayout.addView(c1592950rYT.LLJJIJIIJIL);
            }
        } else {
            c1592950rYT.addView(c1592950rYT.LLJJIJIIJIL);
        }
        c1592950rYT.LLJJJ = true;
        this.LLJ = true;
    }

    public final void LJIILIIL() {
        if (this.LLIZLLLIL) {
            return;
        }
        ImageView imageViewLJIIIIZZ = LJIIIIZZ();
        if (imageViewLJIIIIZZ != null) {
            C1592950rYT c1592950rYT = this.LL;
            c1592950rYT.LLILZLL = imageViewLJIIIIZZ;
            if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LIZIZ()) {
                FrameLayout frameLayout = c1592950rYT.LLJJJJ;
                if (frameLayout != null) {
                    frameLayout.addView(c1592950rYT.LLILZLL);
                }
            } else {
                c1592950rYT.addView(c1592950rYT.LLILZLL);
            }
        }
        this.LLIZLLLIL = true;
    }

    public final void LJIILJJIL() {
        if (this.LLJIJIL) {
            return;
        }
        ImageView imageViewLJIIIZ = LJIIIZ();
        if (imageViewLJIIIZ != null) {
            C786410Ut5.LJZI(8, imageViewLJIIIZ);
            C1592950rYT c1592950rYT = this.LL;
            c1592950rYT.LLJILJIL = imageViewLJIIIZ;
            if (C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJL().LIZIZ()) {
                FrameLayout frameLayout = c1592950rYT.LLJJJJ;
                if (frameLayout != null) {
                    frameLayout.addView(c1592950rYT.LLJILJIL);
                }
            } else {
                c1592950rYT.addView(c1592950rYT.LLJILJIL);
            }
            ImageView imageView = c1592950rYT.LLJI;
            if (imageView != null) {
                imageView.bringToFront();
            }
            TextView textView = c1592950rYT.LLJIJIL;
            if (textView != null) {
                textView.bringToFront();
            }
        }
        this.LLJIJIL = true;
    }

    public final void LJIILL() {
        if (this.LLJI) {
            return;
        }
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LJJL().LIZ()) {
            return;
        }
        TuxTextView tuxTextViewLJIIJ = LJIIJ();
        if (tuxTextViewLJIIJ != null) {
            C1592950rYT c1592950rYT = this.LL;
            c1592950rYT.LLJ = tuxTextViewLJIIJ;
            if (c19252910Tv.LIZLLL().LJIJI().LJJL().LIZIZ()) {
                LinearLayout linearLayout = c1592950rYT.LLJJJIL;
                if (linearLayout != null) {
                    linearLayout.addView(c1592950rYT.LLJ);
                }
            } else {
                c1592950rYT.addView(c1592950rYT.LLJ);
            }
        }
        this.LLJI = true;
    }

    public boolean LJIIZILJ() {
        ImageView imageView = this.LL.LLJI;
        return (imageView != null && imageView.getVisibility() == 0) || this.LLIZ > 0;
    }

    public final boolean LJIJ() {
        return this.LLILZIL == EnumC1593030rYb.SELECT;
    }

    public void LJIL() {
        LJIILJJIL();
        LJIILIIL();
        C1592950rYT c1592950rYT = this.LL;
        c1592950rYT.setTabRefreshVisibility(0);
        ImageView imageView = c1592950rYT.LLJILJIL;
        if (imageView != null) {
            imageView.setLayerType(2, null);
        }
        c1592950rYT.setTabIconVisibility(8);
        C1592950rYT c1592950rYT2 = this.LL;
        if (c1592950rYT2.LLJJJ) {
            c1592950rYT2.setCustomIconVisible(8);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -360.0f);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS272S0100000_24(this, 2));
        valueAnimatorOfFloat.addListener(new ALAdapterS18S0200000_24(this, valueAnimatorOfFloat, 0));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.8f, 1.0f);
        valueAnimatorOfFloat2.setDuration(300L);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS272S0100000_24(this, 1));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfFloat2, valueAnimatorOfFloat);
        animatorSet.start();
    }

    public void LJJ() {
        LJIILJJIL();
        LJIILIIL();
        C1592950rYT c1592950rYT = this.LL;
        c1592950rYT.setTabRefreshVisibility(8);
        c1592950rYT.setTabRefreshAlpha(1.0f);
        if (c1592950rYT.LLJJJ) {
            c1592950rYT.setCustomIconVisible(0);
        } else {
            c1592950rYT.setTabIconVisibility(0);
        }
    }

    public void LJJIII() {
        if (LJIJ()) {
            return;
        }
        LJJIIZI(EnumC1593030rYb.SELECT);
        if (!this.LLILZLL) {
            LJIJI();
        } else if (LJJIJIIJIL(this.LLILZIL, this.LLILLJJLI, false)) {
            LJJIJIL();
        }
    }

    public void LJJIJIIJI() {
        if (LJIJ()) {
            LJJIIZI(EnumC1593030rYb.UNSELECT);
            if (!this.LLILZLL) {
                LJIJJLI();
            } else if (LJJIJIIJIL(this.LLILZIL, this.LLILLJJLI, false)) {
                LJJIJIL();
            }
        }
    }

    public AbstractC1592930rYR(C1592950rYT c1592950rYT) {
        this.LL = c1592950rYT;
        this.LLILZIL = c1592950rYT.getIconData().LJFF;
        C799900VZk.LIZ.getClass();
        this.LLILLL = (PreDrawableInflate) C799900VZk.LJ(PreDrawableInflate.class);
        C1593020rYa iconData = c1592950rYT.getIconData();
        this.LLILZ = iconData;
        Integer num = iconData.LIZLLL.LJ;
        if (num != null) {
            c1592950rYT.setId(num.intValue());
        }
        LJJIIZI(iconData.LJFF);
        this.LLILLJJLI = iconData.LJ;
    }

    public final void LIZ(float f) {
        C1592950rYT c1592950rYT = this.LL;
        c1592950rYT.setTabIconScaleX(f);
        c1592950rYT.setTabIconScaleY(f);
        c1592950rYT.setAvatarImageViewScaleX(f);
        c1592950rYT.setAvatarImageViewScaleY(f);
        c1592950rYT.setRedViewScaleX(f);
        c1592950rYT.setRedViewScaleY(f);
    }

    public final void LIZLLL(boolean z) {
        int i;
        LJIILJJIL();
        Context context = this.LL.getContext();
        if (z) {
            i = R.attr.ee;
        } else {
            i = R.attr.a1h;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(i, context);
        if (numLIZJ != null) {
            this.LL.setTabRefreshIconColor(numLIZJ.intValue());
        }
    }

    public int LJIILLIIL(boolean z) {
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        if (c19252910Tv.LIZLLL().LJIJI().LJJL().LJJII()) {
            return c19252910Tv.LIZLLL().LJIJI().LJJL().LJJ(z);
        }
        if (z) {
            return 93;
        }
        return 92;
    }

    public final void LJJIIZI(EnumC1593030rYb enumC1593030rYb) {
        boolean z;
        if (this.LLILZIL != enumC1593030rYb) {
            this.LLILZIL = enumC1593030rYb;
            C1592950rYT c1592950rYT = this.LL;
            if (enumC1593030rYb == EnumC1593030rYb.SELECT) {
                z = true;
            } else {
                z = false;
            }
            c1592950rYT.setSelected(z);
        }
    }
}
