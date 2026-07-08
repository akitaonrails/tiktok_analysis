package Y;

import X.AbstractC1912160zrK;
import X.C013C;
import X.C1295960jpS;
import X.C1897280zTK;
import X.C786410Ut5;
import X.C817403Hg;
import android.animation.ValueAnimator;
import com.bytedance.touchpoint.api.model.Animation;

/* JADX INFO: loaded from: classes29.dex */
public class AUListenerS156S0300000_28 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final void onAnimationUpdate$0(AUListenerS156S0300000_28 aUListenerS156S0300000_28, ValueAnimator valueAnimator) {
        C786410Ut5.Jc(((AbstractC1912160zrK) aUListenerS156S0300000_28.l0).LL, ((C817403Hg) aUListenerS156S0300000_28.l1).element + (((C817403Hg) aUListenerS156S0300000_28.l2).element * ((Float) valueAnimator.getAnimatedValue()).floatValue()));
    }

    public static final void onAnimationUpdate$1(AUListenerS156S0300000_28 aUListenerS156S0300000_28, ValueAnimator valueAnimator) {
        C786410Ut5.Jc(((AbstractC1912160zrK) aUListenerS156S0300000_28.l0).LL, ((C817403Hg) aUListenerS156S0300000_28.l1).element - (((Float) valueAnimator.getAnimatedValue()).floatValue() * ((C817403Hg) aUListenerS156S0300000_28.l2).element));
    }

    public static final void onAnimationUpdate$2(AUListenerS156S0300000_28 aUListenerS156S0300000_28, ValueAnimator valueAnimator) {
        C013C c013c = (C013C) aUListenerS156S0300000_28.l0;
        int frame = 0;
        if (c013c.element) {
            c013c.element = false;
            return;
        }
        C1295960jpS c1295960jpS = ((C1897280zTK) aUListenerS156S0300000_28.l1).LJIIJJI;
        if (c1295960jpS != null) {
            frame = c1295960jpS.getFrame();
        }
        if (frame >= ((Animation) aUListenerS156S0300000_28.l2).transitionFrame) {
            ((C1897280zTK) aUListenerS156S0300000_28.l1).LJIIJJI();
            ((C1897280zTK) aUListenerS156S0300000_28.l1).LJIIJ();
            C1295960jpS c1295960jpS2 = ((C1897280zTK) aUListenerS156S0300000_28.l1).LJIIJJI;
            if (c1295960jpS2 != null) {
                c1295960jpS2.removeAllUpdateListeners();
            }
        }
    }

    public AUListenerS156S0300000_28(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
