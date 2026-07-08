package Y;

import X.C1855350yNh;
import X.C384050F3z;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes28.dex */
public class AUListenerS18S0102000_27 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public int i1;
    public int i2;
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

    public static final void onAnimationUpdate$0(AUListenerS18S0102000_27 aUListenerS18S0102000_27, ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        int i = (int) (aUListenerS18S0102000_27.i1 + ((aUListenerS18S0102000_27.i2 - r2) * animatedFraction));
        View view = (View) aUListenerS18S0102000_27.l0;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        C786410Ut5.W5(view, layoutParams);
    }

    public static final void onAnimationUpdate$1(AUListenerS18S0102000_27 aUListenerS18S0102000_27, ValueAnimator valueAnimator) {
        Integer num;
        Drawable drawableLIZ;
        Object objEvaluate = ((C1855350yNh) aUListenerS18S0102000_27.l0).LLJLILLLLZIIL.evaluate(valueAnimator.getAnimatedFraction(), Integer.valueOf(aUListenerS18S0102000_27.i1), Integer.valueOf(aUListenerS18S0102000_27.i2));
        if (objEvaluate instanceof Integer) {
            num = (Integer) objEvaluate;
        } else {
            num = null;
        }
        View httContainer = ((C1855350yNh) aUListenerS18S0102000_27.l0).getHttContainer();
        C1855350yNh c1855350yNh = (C1855350yNh) aUListenerS18S0102000_27.l0;
        C384050F3z c384050F3z = c1855350yNh.LLJJL;
        if (c384050F3z != null) {
            c384050F3z.LIZ = num;
            drawableLIZ = c384050F3z.LIZ(c1855350yNh.getContext());
        } else {
            C384050F3z c384050F3z2 = c1855350yNh.LLJJJJLIIL;
            c384050F3z2.LIZ = num;
            drawableLIZ = c384050F3z2.LIZ(c1855350yNh.getContext());
        }
        httContainer.setBackground(drawableLIZ);
    }

    public AUListenerS18S0102000_27(int i, int i2, Object obj, int i3) {
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = obj;
    }
}
