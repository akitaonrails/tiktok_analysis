package Y;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.assem.digg.LongPressDiggAssem;

/* JADX INFO: loaded from: classes34.dex */
public class AUListenerS16S0100001_33 implements ValueAnimator.AnimatorUpdateListener {
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

    public static final void onAnimationUpdate$0(AUListenerS16S0100001_33 aUListenerS16S0100001_33, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = aUListenerS16S0100001_33.f1;
        LongPressDiggAssem longPressDiggAssem = (LongPressDiggAssem) aUListenerS16S0100001_33.l0;
        float f2 = f + ((longPressDiggAssem.LLLIIII - f) * animatedFraction);
        ViewGroup.LayoutParams layoutParams = ((View) longPressDiggAssem.LLJZ.getValue()).getLayoutParams();
        int i = (int) f2;
        layoutParams.width = i;
        ((LongPressDiggAssem) aUListenerS16S0100001_33.l0).Ap().getLayoutParams().width = i;
        ((LongPressDiggAssem) aUListenerS16S0100001_33.l0).Ap().requestLayout();
    }

    public static final void onAnimationUpdate$1(AUListenerS16S0100001_33 aUListenerS16S0100001_33, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        float f = aUListenerS16S0100001_33.f1;
        LongPressDiggAssem longPressDiggAssem = (LongPressDiggAssem) aUListenerS16S0100001_33.l0;
        float f2 = f + ((longPressDiggAssem.LLLIIII - f) * animatedFraction);
        ViewGroup.LayoutParams layoutParams = ((View) longPressDiggAssem.LLJZ.getValue()).getLayoutParams();
        int i = (int) f2;
        layoutParams.height = i;
        ((LongPressDiggAssem) aUListenerS16S0100001_33.l0).Ap().getLayoutParams().height = i;
        ((LongPressDiggAssem) aUListenerS16S0100001_33.l0).Ap().requestLayout();
    }

    public AUListenerS16S0100001_33(float f, LongPressDiggAssem longPressDiggAssem, int i) {
        this.$t = i;
        this.f1 = f;
        this.l0 = longPressDiggAssem;
    }
}
