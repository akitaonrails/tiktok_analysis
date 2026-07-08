package Y;

import X.C19I8;
import X.C2188811AlT;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.ss.android.ugc.aweme.ecommerce.mix.view.ECBaseMixContainerFragment;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public class AUListenerS225S0200000_18 implements ValueAnimator.AnimatorUpdateListener {
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

    public static final void onAnimationUpdate$0(AUListenerS225S0200000_18 aUListenerS225S0200000_18, ValueAnimator valueAnimator) {
        Float f;
        float fFloatValue;
        Float f2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startAnim value: ");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (!(animatedValue instanceof Float)) {
            animatedValue = null;
        }
        sbLIZ.append(animatedValue);
        C2188811AlT.LIZIZ(sbLIZ);
        View view = (View) aUListenerS225S0200000_18.l0;
        float fFloatValue2 = 1.0f;
        if (view != null) {
            Object animatedValue2 = valueAnimator.getAnimatedValue();
            if ((animatedValue2 instanceof Float) && (f2 = (Float) animatedValue2) != null) {
                fFloatValue = f2.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            C786410Ut5.T4(view, fFloatValue);
        }
        View view2 = (View) aUListenerS225S0200000_18.l1;
        if (view2 != null) {
            Object animatedValue3 = valueAnimator.getAnimatedValue();
            if ((animatedValue3 instanceof Float) && (f = (Float) animatedValue3) != null) {
                fFloatValue2 = f.floatValue();
            }
            C786410Ut5.T4(view2, fFloatValue2);
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS225S0200000_18 aUListenerS225S0200000_18, ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ((AppBarLayout$Behavior) aUListenerS225S0200000_18.l0).setTopAndBottomOffset(iIntValue);
        ECBaseMixContainerFragment eCBaseMixContainerFragment = (ECBaseMixContainerFragment) aUListenerS225S0200000_18.l1;
        eCBaseMixContainerFragment.LLZZJLIL(eCBaseMixContainerFragment.LLIZ, iIntValue);
    }

    public static final void onAnimationUpdate$2(AUListenerS225S0200000_18 aUListenerS225S0200000_18, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        C19I8 c19i8 = (C19I8) aUListenerS225S0200000_18.l0;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 3.0f;
        }
        float f2 = C19I8.LLL;
        c19i8.LJFF(fFloatValue, AFwS206S0000000_18.get$arr$(22), false);
        C786410Ut5.Jc((View) aUListenerS225S0200000_18.l1, ((C19I8) aUListenerS225S0200000_18.l0).getDistanceByProcess());
    }

    public static final void onAnimationUpdate$3(AUListenerS225S0200000_18 aUListenerS225S0200000_18, ValueAnimator valueAnimator) {
        float fFloatValue;
        Float f;
        C19I8 c19i8 = (C19I8) aUListenerS225S0200000_18.l0;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if ((animatedValue instanceof Float) && (f = (Float) animatedValue) != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 3.0f;
        }
        float f2 = C19I8.LLL;
        c19i8.LJFF(fFloatValue, AFwS206S0000000_18.get$arr$(22), false);
        C786410Ut5.Jc((View) aUListenerS225S0200000_18.l1, ((C19I8) aUListenerS225S0200000_18.l0).getDistanceByProcess());
    }

    public AUListenerS225S0200000_18(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
