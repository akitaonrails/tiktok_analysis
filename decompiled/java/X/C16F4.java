package X;

import Y.ALAdapterS25S0200000_31;
import Y.ARunnableS100S0200000_31;
import Y.AUListenerS254S0100000_4;
import Y.AUListenerS256S0100000_6;
import Y.AUListenerS278S0100000_31;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.LruCache;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.api.brand.likeeffect.ILikeEffectService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/* JADX INFO: renamed from: X.16F4, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16F4 extends FrameLayout {
    public static final int LLJIJIL;
    public static final int LLJILJIL;
    public static Drawable LLJILJILJ;
    public final Queue<ImageView> LL;
    public Context LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public Random LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public InterfaceC735940Sts LLIZLLLIL;
    public final int[] LLJ;
    public int LLJI;

    static {
        int i = 75;
        LLJIJIL = C284030BBh.LIZIZ() ? 120 : (C284030BBh.LIZ() & 4) == 4 ? 75 : 79;
        if (C284030BBh.LIZIZ()) {
            i = 120;
        } else if ((C284030BBh.LIZ() & 4) != 4) {
            i = 72;
        }
        LLJILJIL = i;
    }

    public C16F4(Context context) {
        this(context, null, 0);
    }

    public final void LIZIZ(ImageView imageView) {
        HandlerHook.viewPost(this, new ARunnableS100S0200000_31(this, imageView, 55));
    }

    public void setDiggAnimationListener(InterfaceC735940Sts interfaceC735940Sts) {
        this.LLIZLLLIL = interfaceC735940Sts;
    }

    public C16F4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZLLL(ImageView imageView, boolean z) {
        if (this.LLILZIL == null) {
            this.LLILZIL = new Random();
        }
        int iNextInt = this.LLILZIL.nextInt(40) - 20;
        if (z) {
            C786410Ut5.Cb(imageView, iNextInt);
        } else {
            C786410Ut5.Cb(imageView, 0.0f);
            iNextInt = 0;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(2.56f, 1.6f);
        valueAnimatorOfFloat.setInterpolator(new OvershootInterpolator());
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS278S0100000_31(imageView, 15));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.6f, (this.LLILZIL.nextInt(10) + 20.0f) / 10.0f);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS278S0100000_31(imageView, 11));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.addUpdateListener(new AUListenerS278S0100000_31(imageView, 12));
        int iLIZJ = (int) C12ES.LIZJ(50.0f, this.LLILLJJLI);
        float f = -(this.LLILZIL.nextInt(iLIZJ) + iLIZJ);
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, (float) (((double) f) * Math.tan((((double) iNextInt) * 3.141592653589793d) / 360.0d)));
        valueAnimatorOfFloat4.addUpdateListener(new AUListenerS278S0100000_31(imageView, 13));
        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.0f, f);
        valueAnimatorOfFloat5.addUpdateListener(new AUListenerS278S0100000_31(imageView, 14));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(500L);
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.playTogether(valueAnimatorOfFloat2, valueAnimatorOfFloat3, valueAnimatorOfFloat4, valueAnimatorOfFloat5);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.play(valueAnimatorOfFloat);
        animatorSet2.play(animatorSet).after(500L);
        animatorSet2.addListener(new ALAdapterS25S0200000_31(this, imageView, 5));
        animatorSet2.start();
    }

    public C16F4(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LL = new LinkedList();
        this.LLILLL = -1;
        this.LLILZ = -1;
        this.LLJ = new int[]{-119723, -61121, -716240, -53159};
        this.LLJI = 0;
        this.LLILLJJLI = context;
        this.LLILZIL = new Random();
        this.LLILZ = (int) C12ES.LIZJ(LLJILJIL, context);
        this.LLILLL = (int) C12ES.LIZJ(LLJIJIL, context);
        this.LLILZLL = C14KQ.LJIIIIZZ(context);
        int iLJIIIIZZ = C14KQ.LJIIIIZZ(context);
        int iLJ = C14KQ.LJ(context);
        this.LLIZ = iLJIIIIZZ <= iLJ ? iLJ : iLJIIIIZZ;
    }

    public final void LIZ(ImageView imageView, float f, float f2) {
        FrameLayout.LayoutParams layoutParams;
        int i;
        if (C0SXF.LJIL(this.LLILLJJLI)) {
            if (C589300N9k.LIZLLL()) {
                layoutParams = new FrameLayout.LayoutParams(C418440Gaw.LIZ(56), C418440Gaw.LIZ(56));
            } else {
                layoutParams = new FrameLayout.LayoutParams(C418440Gaw.LIZ(56), C418440Gaw.LIZ(48));
            }
            if (C589300N9k.LIZJ()) {
                layoutParams = new FrameLayout.LayoutParams(C418440Gaw.LIZ(80), C418440Gaw.LIZ(80));
            }
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.LLILZ, this.LLILLL);
        }
        layoutParams.topMargin = (int) (f2 - (this.LLILLL / 2));
        if (getLayoutDirection() == 1) {
            if (C0SXF.LJIL(this.LLILLJJLI)) {
                i = this.LLIZ;
            } else {
                i = this.LLILZLL;
            }
            f = i - f;
        }
        layoutParams.setMarginStart((int) (f - (this.LLILZ / 2)));
        C786410Ut5.c6(imageView, layoutParams);
        if (imageView.getParent() == null) {
            addView(imageView);
        }
    }

    public final void LIZJ(float f, float f2, Aweme aweme) {
        ImageView imageView;
        float fLIZJ;
        float fLIZJ2;
        float fNextInt;
        Drawable drawableLJIIIZ;
        if (C589300N9k.LIZLLL()) {
            this.LLILZ = (int) C12ES.LIZJ(79.0f, this.LLILLJJLI);
            this.LLILLL = (int) C12ES.LIZJ(79.0f, this.LLILLJJLI);
        }
        if (C589300N9k.LIZJ()) {
            this.LLILZ = (int) C12ES.LIZJ(100.0f, this.LLILLJJLI);
            this.LLILLL = (int) C12ES.LIZJ(100.0f, this.LLILLJJLI);
        }
        if (this.LL.isEmpty()) {
            if (C589300N9k.LIZLLL()) {
                imageView = new TuxIconView(this.LLILLJJLI);
            } else {
                imageView = new ImageView(this.LLILLJJLI);
                if (LLJILJILJ == null) {
                    if (C828040We2.LIZIZ()) {
                        LruCache<String, Drawable> lruCache = C730700SlQ.LIZ;
                        LLJILJILJ = null;
                        LLJILJILJ = C800330VaR.LIZIZ(this.LLILLJJLI, R.drawable.aw8);
                    } else if (!C284030BBh.LIZIZ() && (C284030BBh.LIZ() & 4) != 4) {
                        LLJILJILJ = C800330VaR.LIZIZ(this.LLILLJJLI, R.drawable.aw8);
                    } else {
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = R.raw.icon_color_heart_motion;
                        LLJILJILJ = c419910GdJ.LIZ(imageView.getContext());
                    }
                }
            }
        } else {
            imageView = (ImageView) ((LinkedList) this.LL).poll();
        }
        if (C1017070cZd.LJLLL(aweme)) {
            if (C1017070cZd.LJZL(aweme)) {
                return;
            }
            if (C1017070cZd.LJZ(aweme)) {
                Context context = getContext();
                C734390SrN.LIZ.getClass();
                ILikeEffectService iLikeEffectServiceLIZ = C734390SrN.LIZ();
                if (iLikeEffectServiceLIZ != null && (drawableLJIIIZ = iLikeEffectServiceLIZ.LJIIIZ(context, aweme)) != null) {
                    this.LLILZ = (int) C12ES.LIZJ(94.0f, this.LLILLJJLI);
                    this.LLILLL = (int) C12ES.LIZJ(94.0f, this.LLILLJJLI);
                    imageView.setImageDrawable(drawableLJIIIZ);
                } else {
                    TuxIconView tuxIconView = (TuxIconView) imageView;
                    tuxIconView.setIconRes(R.raw.icon_double_like_fill);
                    tuxIconView.setTintColor(this.LLJ[new SecureRandom().nextInt(4)]);
                }
            }
        } else if (C589300N9k.LIZLLL()) {
            TuxIconView tuxIconView2 = (TuxIconView) imageView;
            tuxIconView2.setIconRes(R.raw.icon_double_like_fill);
            tuxIconView2.setTintColor(this.LLJ[new SecureRandom().nextInt(4)]);
        } else {
            imageView.setImageDrawable(LLJILJILJ);
        }
        if (C1017070cZd.LJZ(aweme)) {
            Context context2 = getContext();
            C734390SrN.LIZ.getClass();
            ILikeEffectService iLikeEffectServiceLIZ2 = C734390SrN.LIZ();
            if (iLikeEffectServiceLIZ2 != null && iLikeEffectServiceLIZ2.LJIIIZ(context2, aweme) != null) {
                LIZ(imageView, getWidth() / 2.0f, getHeight() / 2.0f);
                LIZLLL(imageView, false);
                return;
            }
        }
        if (C589300N9k.LIZJ()) {
            if (this.LLJI > 0) {
                fLIZJ = C12ES.LIZJ((this.LLILZIL.nextInt(2) * 30) - 15, this.LLILLJJLI);
                fLIZJ2 = C12ES.LIZJ((this.LLILZIL.nextInt(2) * 30) - 15, this.LLILLJJLI);
                fNextInt = (this.LLILZIL.nextInt(2) * 24) - 12;
            } else {
                fLIZJ = 0.0f;
                fLIZJ2 = 0.0f;
                fNextInt = 0.0f;
            }
            this.LLJI++;
            LIZ(imageView, f + fLIZJ, f2 + fLIZJ2);
            C786410Ut5.Cb(imageView, fNextInt);
            C786410Ut5.V4(imageView, 0.0f);
            C786410Ut5.Qb(imageView, 1.35f);
            C786410Ut5.rc(imageView, 1.35f);
            C786410Ut5.Lc(imageView, 0.0f);
            C786410Ut5.gd(imageView, 0.0f);
            int i = this.LLILZ;
            if (i > 0 && this.LLILLL > 0) {
                imageView.setPivotX(i / 2.0f);
                imageView.setPivotY(this.LLILLL);
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(100L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS278S0100000_31(imageView, 39));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.35f, 0.92f);
            valueAnimatorOfFloat2.setDuration(200L);
            valueAnimatorOfFloat2.setInterpolator(C1619980sG4.LJI());
            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS278S0100000_31(imageView, 40));
            ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.92f, 1.0f);
            valueAnimatorOfFloat3.setStartDelay(200L);
            valueAnimatorOfFloat3.setDuration(150L);
            valueAnimatorOfFloat3.setInterpolator(C1619980sG4.LJI());
            valueAnimatorOfFloat3.addUpdateListener(new AUListenerS278S0100000_31(imageView, 41));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2, valueAnimatorOfFloat3);
            ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, 0.0f);
            valueAnimatorOfFloat4.setDuration(200L);
            int iLIZJ = (int) C12ES.LIZJ(-190.0f, this.LLILLJJLI);
            int iLIZJ2 = (int) C12ES.LIZJ(35.0f, this.LLILLJJLI);
            ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat5.setStartDelay(160L);
            valueAnimatorOfFloat5.setDuration(290L);
            valueAnimatorOfFloat5.addUpdateListener(new AUListenerS278S0100000_31(imageView, 42));
            ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(1.0f, 0.6f);
            valueAnimatorOfFloat6.setStartDelay(160L);
            valueAnimatorOfFloat6.setDuration(290L);
            valueAnimatorOfFloat6.addUpdateListener(new AUListenerS278S0100000_31(imageView, 43));
            ValueAnimator valueAnimatorOfFloat7 = ValueAnimator.ofFloat(0.0f, iLIZJ);
            valueAnimatorOfFloat7.setDuration(350L);
            valueAnimatorOfFloat7.setInterpolator(C1619980sG4.LJIIL());
            valueAnimatorOfFloat7.addUpdateListener(new AUListenerS278S0100000_31(imageView, 44));
            ValueAnimator valueAnimatorOfFloat8 = ValueAnimator.ofFloat(0.0f, iLIZJ2);
            valueAnimatorOfFloat8.setDuration(350L);
            valueAnimatorOfFloat8.setInterpolator(C1619980sG4.LIZLLL());
            valueAnimatorOfFloat8.addUpdateListener(new AUListenerS278S0100000_31(imageView, 45));
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(valueAnimatorOfFloat5, valueAnimatorOfFloat6, valueAnimatorOfFloat7, valueAnimatorOfFloat8);
            animatorSet2.setDuration(450L);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playSequentially(animatorSet, valueAnimatorOfFloat4, animatorSet2);
            animatorSet3.addListener(new ALAdapterS25S0200000_31(this, imageView, 9));
            animatorSet3.start();
            return;
        }
        LIZ(imageView, f, f2);
        if (C284030BBh.LIZIZ()) {
            C786410Ut5.V4(imageView, 0.0f);
            if (this.LLILZIL == null) {
                this.LLILZIL = new SecureRandom();
            }
            float fNextInt2 = this.LLILZIL.nextInt(40) - 20;
            C786410Ut5.Cb(imageView, fNextInt2);
            float fLIZJ3 = C12ES.LIZJ(30.0f, this.LLILLJJLI);
            float f3 = -fLIZJ3;
            C786410Ut5.gd(imageView, f3);
            int i2 = this.LLILZ;
            if (i2 > 0 && this.LLILLL > 0) {
                imageView.setPivotX(i2 / 2.0f);
                imageView.setPivotY(this.LLILLL);
            }
            ValueAnimator valueAnimatorOfFloat9 = ValueAnimator.ofFloat(1.2f, 1.0f);
            valueAnimatorOfFloat9.addUpdateListener(new AUListenerS256S0100000_6(imageView, 84));
            ValueAnimator valueAnimatorOfFloat10 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat10.addUpdateListener(new AUListenerS254S0100000_4(imageView, 10));
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.setDuration(250L);
            animatorSet4.setInterpolator(C1619980sG4.LJIILIIL());
            animatorSet4.playTogether(valueAnimatorOfFloat9, valueAnimatorOfFloat10);
            ValueAnimator valueAnimatorOfFloat11 = ValueAnimator.ofFloat(1.0f, (this.LLILZIL.nextInt(5) + 16.0f) / 10.0f);
            valueAnimatorOfFloat11.addUpdateListener(new AUListenerS256S0100000_6(imageView, 85));
            ValueAnimator valueAnimatorOfFloat12 = ValueAnimator.ofFloat(1.0f, 0.0f);
            valueAnimatorOfFloat12.addUpdateListener(new AUListenerS254S0100000_4(imageView, 11));
            int iLIZJ3 = (int) C12ES.LIZJ(10.0f, this.LLILLJJLI);
            float f4 = -(this.LLILZIL.nextInt(iLIZJ3) + iLIZJ3);
            ValueAnimator valueAnimatorOfFloat13 = ValueAnimator.ofFloat(0.0f, (float) (((double) f4) * Math.tan((((double) fNextInt2) * 3.141592653589793d) / 360.0d)));
            valueAnimatorOfFloat13.addUpdateListener(new AUListenerS256S0100000_6(imageView, 86));
            ValueAnimator valueAnimatorOfFloat14 = ValueAnimator.ofFloat(f3, f4 - fLIZJ3);
            valueAnimatorOfFloat14.addUpdateListener(new AUListenerS256S0100000_6(imageView, 87));
            AnimatorSet animatorSet5 = new AnimatorSet();
            animatorSet5.setDuration(600L);
            animatorSet5.setInterpolator(C1619980sG4.LJIILIIL());
            animatorSet5.playTogether(valueAnimatorOfFloat11, valueAnimatorOfFloat12, valueAnimatorOfFloat13, valueAnimatorOfFloat14);
            AnimatorSet animatorSet6 = new AnimatorSet();
            animatorSet6.play(animatorSet4);
            animatorSet6.play(animatorSet5).after(400L);
            animatorSet6.addListener(new ALAdapterS25S0200000_31(this, imageView, 10));
            animatorSet6.start();
            return;
        }
        LIZLLL(imageView, true);
    }
}
