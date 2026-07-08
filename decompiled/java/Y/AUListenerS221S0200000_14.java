package Y;

import X.C786410Ut5;
import X.C899830ZRt;
import X.C904030ZdJ;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem;
import com.ss.android.ugc.aweme.transcript.IMVoiceTranscribeModel;

/* JADX INFO: loaded from: classes15.dex */
public class AUListenerS221S0200000_14 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS221S0200000_14 aUListenerS221S0200000_14, ValueAnimator valueAnimator) {
        ((VoiceAssem) aUListenerS221S0200000_14.l0).fq().setProgress(((VoiceAssem) aUListenerS221S0200000_14.l0).LLLL.LIZ(((C899830ZRt) aUListenerS221S0200000_14.l1).LIZ));
        ((VoiceAssem) aUListenerS221S0200000_14.l0).Wp().setText(((VoiceAssem) aUListenerS221S0200000_14.l0).Up());
    }

    public static final void onAnimationUpdate$1(AUListenerS221S0200000_14 aUListenerS221S0200000_14, ValueAnimator valueAnimator) {
        ((VoiceAssem) aUListenerS221S0200000_14.l0).Ep((IMVoiceTranscribeModel) aUListenerS221S0200000_14.l1, false);
    }

    public static final void onAnimationUpdate$2(AUListenerS221S0200000_14 aUListenerS221S0200000_14, ValueAnimator valueAnimator) {
        int iIntValue;
        Integer num;
        View view = (View) aUListenerS221S0200000_14.l0;
        C904030ZdJ c904030ZdJ = (C904030ZdJ) aUListenerS221S0200000_14.l1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = c904030ZdJ.LLILZIL;
            Object animatedValue = valueAnimator.getAnimatedValue();
            if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            layoutParams.width = iIntValue;
            C786410Ut5.W5(view, layoutParams);
            C786410Ut5.T4((View) aUListenerS221S0200000_14.l0, 1.0f - valueAnimator.getAnimatedFraction());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final void onAnimationUpdate$3(AUListenerS221S0200000_14 aUListenerS221S0200000_14, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        View view = (View) aUListenerS221S0200000_14.l0;
        C904030ZdJ c904030ZdJ = (C904030ZdJ) aUListenerS221S0200000_14.l1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = c904030ZdJ.LLILZIL;
            layoutParams.width = iIntValue;
            C786410Ut5.W5(view, layoutParams);
            C786410Ut5.T4((View) aUListenerS221S0200000_14.l0, valueAnimator.getAnimatedFraction());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public AUListenerS221S0200000_14(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
