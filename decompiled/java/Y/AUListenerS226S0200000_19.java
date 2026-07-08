package Y;

import X.C1214930hil;
import X.C1602840roQ;
import X.C259800zU;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.sub.ProfileNavBarCenterComponent;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes20.dex */
public class AUListenerS226S0200000_19 implements ValueAnimator.AnimatorUpdateListener {
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
            case 4:
                onAnimationUpdate$4(this, valueAnimator);
                break;
        }
    }

    public static final void onAnimationUpdate$0(AUListenerS226S0200000_19 aUListenerS226S0200000_19, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) aUListenerS226S0200000_19.l0;
        layoutParams.height = iIntValue;
        C1214930hil c1214930hil = (C1214930hil) aUListenerS226S0200000_19.l1;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1214930hil);
        c1214930hil.setLayoutParams(layoutParams);
        ((C1214930hil) aUListenerS226S0200000_19.l1).requestLayout();
    }

    public static final void onAnimationUpdate$1(AUListenerS226S0200000_19 aUListenerS226S0200000_19, ValueAnimator valueAnimator) {
        ((C1602840roQ) aUListenerS226S0200000_19.l0).LJJIJIIJI(((Integer) valueAnimator.getAnimatedValue()).intValue(), (View) aUListenerS226S0200000_19.l1, true);
    }

    public static final void onAnimationUpdate$2(AUListenerS226S0200000_19 aUListenerS226S0200000_19, ValueAnimator valueAnimator) {
        C1602840roQ c1602840roQ = (C1602840roQ) aUListenerS226S0200000_19.l0;
        View view = (View) aUListenerS226S0200000_19.l1;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c1602840roQ.getClass();
        C786410Ut5.Ob(view, fFloatValue);
        C786410Ut5.pc(view, fFloatValue);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, android.view.View] */
    public static final void onAnimationUpdate$3(AUListenerS226S0200000_19 aUListenerS226S0200000_19, ValueAnimator valueAnimator) {
        ((C259800zU) aUListenerS226S0200000_19.l0).element = ((ProfileNavBarCenterComponent) aUListenerS226S0200000_19.l1).cp().findViewById(R.id.p1k);
        LinearLayout linearLayout = (LinearLayout) ((C259800zU) aUListenerS226S0200000_19.l0).element;
        if (linearLayout != null) {
            C786410Ut5.W4(linearLayout, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, android.view.View] */
    public static final void onAnimationUpdate$4(AUListenerS226S0200000_19 aUListenerS226S0200000_19, ValueAnimator valueAnimator) {
        ((C259800zU) aUListenerS226S0200000_19.l0).element = ((ProfileNavBarCenterComponent) aUListenerS226S0200000_19.l1).cp().findViewById(R.id.p1k);
        LinearLayout linearLayout = (LinearLayout) ((C259800zU) aUListenerS226S0200000_19.l0).element;
        if (linearLayout != null) {
            C786410Ut5.W4(linearLayout, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public AUListenerS226S0200000_19(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
