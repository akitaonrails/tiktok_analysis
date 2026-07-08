package Y;

import X.C1050980dSK;
import X.C1609580rzI;
import android.animation.ValueAnimator;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility;

/* JADX INFO: loaded from: classes17.dex */
public class AUListenerS13S0100001_16 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f1;
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
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS13S0100001_16 aUListenerS13S0100001_16, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        C1609580rzI c1609580rzI = (C1609580rzI) aUListenerS13S0100001_16.l0;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = aUListenerS13S0100001_16.f1;
        }
        c1609580rzI.LLJJIII = fFloatValue;
        ((C1609580rzI) aUListenerS13S0100001_16.l0).invalidate();
    }

    public static final void onAnimationUpdate$1(AUListenerS13S0100001_16 aUListenerS13S0100001_16, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        VideoShrinkAbility videoShrinkAbility = ((C1050980dSK) aUListenerS13S0100001_16.l0).LIZIZ.get();
        if (videoShrinkAbility != null) {
            videoShrinkAbility.ob(fFloatValue, aUListenerS13S0100001_16.f1, ((C1050980dSK) aUListenerS13S0100001_16.l0).LIZJ);
        }
    }

    public AUListenerS13S0100001_16(Object obj, float f, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
    }
}
