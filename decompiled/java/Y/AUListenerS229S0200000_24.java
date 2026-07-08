package Y;

import X.C1592630rXx;
import X.C1593860rZw;
import X.C1600650rkt;
import X.C1617840sCc;
import X.C1AV2;
import X.C2180521AVm;
import X.C259800zU;
import X.C418440Gaw;
import android.animation.ValueAnimator;
import android.widget.TextView;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.TabAnimationTransformerV2;
import com.ss.android.ugc.aweme.main.MainFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes25.dex */
public class AUListenerS229S0200000_24 implements ValueAnimator.AnimatorUpdateListener {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onAnimationUpdate$0(AUListenerS229S0200000_24 aUListenerS229S0200000_24, ValueAnimator valueAnimator) {
        C2180521AVm.LIZJ(((MainFragment) ((C259800zU) aUListenerS229S0200000_24.l0).element).LLILZLL, ((Float) valueAnimator.getAnimatedValue()).floatValue(), (C1AV2) ((C259800zU) aUListenerS229S0200000_24.l1).element);
    }

    public static final void onAnimationUpdate$1(AUListenerS229S0200000_24 aUListenerS229S0200000_24, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C1617840sCc c1617840sCc = (C1617840sCc) aUListenerS229S0200000_24.l0;
        float f = c1617840sCc.LJIIJJI / 2.0f;
        c1617840sCc.LJIJI = f * fFloatValue;
        c1617840sCc.LJIJ = 1 - fFloatValue;
        c1617840sCc.LJIJJ = (f - C418440Gaw.LIZIZ(2)) * fFloatValue;
        ((C1600650rkt) aUListenerS229S0200000_24.l1).invalidate();
    }

    public static final void onAnimationUpdate$2(AUListenerS229S0200000_24 aUListenerS229S0200000_24, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        IMFToolBarAbility iMFToolBarAbilityLJII = ((TabAnimationTransformerV2) aUListenerS229S0200000_24.l0).LJII();
        if (iMFToolBarAbilityLJII != null) {
            iMFToolBarAbilityLJII.B5(Integer.valueOf(iIntValue));
        }
        TuxIconView tuxIconView = (TuxIconView) aUListenerS229S0200000_24.l1;
        if (tuxIconView != null) {
            C1593860rZw.LIZ(tuxIconView, Integer.valueOf(iIntValue), false);
        }
    }

    public static final void onAnimationUpdate$3(AUListenerS229S0200000_24 aUListenerS229S0200000_24, ValueAnimator valueAnimator) {
        Integer num;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Integer) && (num = (Integer) animatedValue) != null && num.intValue() >= 75) {
            ALAdapterS8S0110000_24 aLAdapterS8S0110000_24 = (ALAdapterS8S0110000_24) aUListenerS229S0200000_24.l0;
            if (!aLAdapterS8S0110000_24.z1) {
                aLAdapterS8S0110000_24.z1 = true;
                ((Function0) aUListenerS229S0200000_24.l1).invoke();
            }
        }
    }

    public static final void onAnimationUpdate$4(AUListenerS229S0200000_24 aUListenerS229S0200000_24, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C1592630rXx c1592630rXx = (C1592630rXx) aUListenerS229S0200000_24.l0;
        TextView textView = (TextView) aUListenerS229S0200000_24.l1;
        Float fValueOf = Float.valueOf(fFloatValue);
        c1592630rXx.getClass();
        C1592630rXx.LJFF(textView, fValueOf, true);
    }

    public AUListenerS229S0200000_24(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
