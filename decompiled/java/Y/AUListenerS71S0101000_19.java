package Y;

import X.C1261650iw7;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import com.ss.android.ugc.aweme.relation.usercard.impl.cell.AbsRecUserCell;

/* JADX INFO: loaded from: classes20.dex */
public class AUListenerS71S0101000_19 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
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

    public static final void onAnimationUpdate$0(AUListenerS71S0101000_19 aUListenerS71S0101000_19, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        C786410Ut5.ed((View) aUListenerS71S0101000_19.l0, aUListenerS71S0101000_19.i1 + ((-r0) * animatedFraction));
    }

    public static final void onAnimationUpdate$1(AUListenerS71S0101000_19 aUListenerS71S0101000_19, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ((AbsRecUserCell) aUListenerS71S0101000_19.l0).itemView.setBackgroundColor(Color.argb(aUListenerS71S0101000_19.i1, Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AUListenerS71S0101000_19(int i, int i2, AbsRecUserCell<C1261650iw7> absRecUserCell) {
        this.$t = absRecUserCell;
        this.i1 = i;
        this.l0 = i2;
    }
}
