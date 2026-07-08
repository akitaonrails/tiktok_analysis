package Y;

import X.C1453130nux;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.image.desc.DescIdeasModule;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;

/* JADX INFO: loaded from: classes23.dex */
public class AUListenerS271S0100000_22 implements ValueAnimator.AnimatorUpdateListener {
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
        }
    }

    public AUListenerS271S0100000_22(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAnimationUpdate$0(AUListenerS271S0100000_22 aUListenerS271S0100000_22, ValueAnimator valueAnimator) {
        TuxTextView tuxTextView = ((DescIdeasModule) aUListenerS271S0100000_22.l0).LLJILJILJ;
        tuxTextView.getLayoutParams().width = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        tuxTextView.requestLayout();
    }

    public static final void onAnimationUpdate$1(AUListenerS271S0100000_22 aUListenerS271S0100000_22, ValueAnimator valueAnimator) {
        C786410Ut5.V4(((VEVideoPublishPreviewScene) aUListenerS271S0100000_22.l0).LLJJLIIIJLLLLLLLZ, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static final void onAnimationUpdate$2(AUListenerS271S0100000_22 aUListenerS271S0100000_22, ValueAnimator valueAnimator) {
        ((C1453130nux) aUListenerS271S0100000_22.l0).LJI = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }
}
