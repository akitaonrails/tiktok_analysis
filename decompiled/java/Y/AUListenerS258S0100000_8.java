package Y;

import X.C094D;
import X.C0LJV;
import X.C0MPG;
import X.C0MS5;
import X.C527360KmE;
import X.C553860Lns;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: loaded from: classes9.dex */
public class AUListenerS258S0100000_8 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$t) {
            case 0:
                onAnimationUpdate$0(this, valueAnimator);
                break;
            case 1:
                onAnimationUpdate$1(this, valueAnimator);
                break;
            case 2:
                onAnimationUpdate$2(this, valueAnimator);
                break;
            case 3:
                onAnimationUpdate$3(this, valueAnimator);
                break;
            case 4:
                onAnimationUpdate$4(this, valueAnimator);
                break;
            case 5:
                onAnimationUpdate$5(this, valueAnimator);
                break;
            case 6:
                onAnimationUpdate$6(this, valueAnimator);
                break;
            case 7:
                onAnimationUpdate$7(this, valueAnimator);
                break;
            case 8:
                onAnimationUpdate$8(this, valueAnimator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationUpdate$9(this, valueAnimator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationUpdate$10(this, valueAnimator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationUpdate$11(this, valueAnimator);
                break;
        }
    }

    public AUListenerS258S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS258S0100000_8 aUListenerS258S0100000_8, ValueAnimator valueAnimator) {
        ((C0MPG) aUListenerS258S0100000_8.l0).setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public static final void onAnimationUpdate$1(AUListenerS258S0100000_8 aUListenerS258S0100000_8, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C527360KmE c527360KmE = (C527360KmE) aUListenerS258S0100000_8.l0;
            float fFloatValue = f.floatValue();
            TuxIconView tuxIconView = c527360KmE.LLILZ;
            if (tuxIconView != null) {
                C786410Ut5.hc(tuxIconView, fFloatValue);
            }
            TuxIconView tuxIconView2 = c527360KmE.LLILZ;
            if (tuxIconView2 != null) {
                C786410Ut5.Cc(tuxIconView2, fFloatValue);
            }
        }
    }

    public static final void onAnimationUpdate$10(AUListenerS258S0100000_8 aUListenerS258S0100000_8, ValueAnimator valueAnimator) {
        C0MS5 c0ms5 = (C0MS5) aUListenerS258S0100000_8.l0;
        c0ms5.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c0ms5);
        c0ms5.setTranslationX(fFloatValue);
    }

    public static final void onAnimationUpdate$11(AUListenerS258S0100000_8 aUListenerS258S0100000_8, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C786410Ut5.Q4(f.floatValue(), ((PreviewVideoScene) aUListenerS258S0100000_8.l0).LLLLJ());
        }
    }

    public static final void onAnimationUpdate$2(AUListenerS258S0100000_8 aUListenerS258S0100000_8, ValueAnimator valueAnimator) {
        View view = ((MvChoosePhotoScene) aUListenerS258S0100000_8.l0).mView;
        if (view != null) {
            float translationY = view.getTranslationY();
            MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) aUListenerS258S0100000_8.l0;
            View view2 = mvChoosePhotoScene.mView;
            if (view2 != null) {
                C786410Ut5.ed(view2, translationY + ((mvChoosePhotoScene.getScreenHeight() - translationY) * valueAnimator.getAnimatedFraction()));
            }
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS258S0100000_8 aUListenerS258S0100000_8, ValueAnimator valueAnimator) {
        MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) aUListenerS258S0100000_8.l0;
        View view = mvChoosePhotoScene.mView;
        if (view != null) {
            C786410Ut5.ed(view, mvChoosePhotoScene.getScreenHeight() - (((MvChoosePhotoScene) aUListenerS258S0100000_8.l0).getScreenHeight() * valueAnimator.getAnimatedFraction()));
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS258S0100000_8 aUListenerS258S0100000_8, ValueAnimator valueAnimator) {
        C0LJV c0ljv = (C0LJV) aUListenerS258S0100000_8.l0;
        c0ljv.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = c0ljv.LLIZLLLIL;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) fFloatValue;
        C786410Ut5.W5(view, layoutParams);
    }

    public static final void onAnimationUpdate$5(AUListenerS258S0100000_8 aUListenerS258S0100000_8, ValueAnimator valueAnimator) {
        C0LJV c0ljv = (C0LJV) aUListenerS258S0100000_8.l0;
        c0ljv.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = c0ljv.LLIZLLLIL;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) fFloatValue;
        C786410Ut5.W5(view, layoutParams);
    }

    public static final void onAnimationUpdate$6(AUListenerS258S0100000_8 aUListenerS258S0100000_8, ValueAnimator valueAnimator) {
        Float f;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            C786410Ut5.Q4(f.floatValue(), ((PreviewVideoScene) aUListenerS258S0100000_8.l0).LLLLJ());
        }
    }

    public static final void onAnimationUpdate$7(AUListenerS258S0100000_8 aUListenerS258S0100000_8, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C786410Ut5.Ob((View) aUListenerS258S0100000_8.l0, fFloatValue);
        C786410Ut5.pc((View) aUListenerS258S0100000_8.l0, fFloatValue);
    }

    public static final void onAnimationUpdate$8(AUListenerS258S0100000_8 aUListenerS258S0100000_8, ValueAnimator valueAnimator) {
        ((C094D) aUListenerS258S0100000_8.l0).LJIIIIZZ(Float.valueOf(((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    public static final void onAnimationUpdate$9(AUListenerS258S0100000_8 aUListenerS258S0100000_8, ValueAnimator valueAnimator) {
        ((C553860Lns) aUListenerS258S0100000_8.l0).LIZLLL = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        ((View) ((C553860Lns) aUListenerS258S0100000_8.l0).LIZIZ.getValue()).invalidate();
    }
}
