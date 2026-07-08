package Y;

import X.C013C;
import X.C0C64;
import X.C2296808zG;
import X.C426630Go9;
import X.C786410Ut5;
import android.animation.ValueAnimator;
import android.graphics.PathMeasure;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.core.ab.OptConfigV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AUListenerS0S0600002_6 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f6;
    public float f7;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

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

    public static final void onAnimationUpdate$0(AUListenerS0S0600002_6 aUListenerS0S0600002_6, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] fArr = new float[2];
        ((PathMeasure) aUListenerS0S0600002_6.l0).getPosTan(fFloatValue, fArr, null);
        float f = aUListenerS0S0600002_6.f6;
        float f2 = (f - ((2 * fFloatValue) / 3)) / (f * 1.0f);
        C786410Ut5.Tc((SmartImageView) aUListenerS0S0600002_6.l1, fArr[0]);
        C786410Ut5.td((SmartImageView) aUListenerS0S0600002_6.l1, fArr[1]);
        C786410Ut5.fc((SmartImageView) aUListenerS0S0600002_6.l1, aUListenerS0S0600002_6.f7 * f2);
        C786410Ut5.Bc((SmartImageView) aUListenerS0S0600002_6.l1, f2 * aUListenerS0S0600002_6.f7);
        LifecycleCoroutineScope lifecycleCoroutineScope = (LifecycleCoroutineScope) aUListenerS0S0600002_6.l2;
        if (lifecycleCoroutineScope != null && !C2296808zG.LJI(lifecycleCoroutineScope)) {
            ((ValueAnimator) aUListenerS0S0600002_6.l3).cancel();
        }
        if (fFloatValue / aUListenerS0S0600002_6.f6 > 0.7d) {
            C013C c013c = (C013C) aUListenerS0S0600002_6.l4;
            if (!c013c.element) {
                c013c.element = true;
                Function1 function1 = (Function1) aUListenerS0S0600002_6.l5;
                if (function1 != null) {
                    function1.invoke(Boolean.TRUE);
                }
            }
        }
    }

    public static final void onAnimationUpdate$1(AUListenerS0S0600002_6 aUListenerS0S0600002_6, ValueAnimator valueAnimator) {
        float f;
        Function1 function1;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] fArr = new float[2];
        ((PathMeasure) aUListenerS0S0600002_6.l0).getPosTan(fFloatValue, fArr, null);
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        OptConfigV2 optConfigV2 = C426630Go9.LIZ;
        OptConfigV2 optConfigV22 = (OptConfigV2) c0c64LJIILLIIL.LJJII(OptConfigV2.class, optConfigV2, "pdp_add_cart_optimize_v2", true);
        if (optConfigV22 == null) {
            optConfigV22 = optConfigV2;
        }
        if (optConfigV22.addCartAnimatorOpt) {
            float f2 = aUListenerS0S0600002_6.f6;
            f = (f2 - ((5 * fFloatValue) / 6)) / (f2 * 1.0f);
        } else {
            float f3 = aUListenerS0S0600002_6.f6;
            f = (f3 - ((2 * fFloatValue) / 3)) / (f3 * 1.0f);
        }
        C786410Ut5.Tc((SmartImageView) aUListenerS0S0600002_6.l1, fArr[0]);
        C786410Ut5.td((SmartImageView) aUListenerS0S0600002_6.l1, fArr[1]);
        C786410Ut5.fc((SmartImageView) aUListenerS0S0600002_6.l1, aUListenerS0S0600002_6.f7 * f);
        C786410Ut5.Bc((SmartImageView) aUListenerS0S0600002_6.l1, f * aUListenerS0S0600002_6.f7);
        LifecycleCoroutineScope lifecycleCoroutineScope = (LifecycleCoroutineScope) aUListenerS0S0600002_6.l2;
        if (lifecycleCoroutineScope != null && !C2296808zG.LJI(lifecycleCoroutineScope)) {
            ((ValueAnimator) aUListenerS0S0600002_6.l3).cancel();
        }
        if (fFloatValue / aUListenerS0S0600002_6.f6 > 0.7d) {
            C013C c013c = (C013C) aUListenerS0S0600002_6.l4;
            if (!c013c.element) {
                c013c.element = true;
                OptConfigV2 optConfigV23 = (OptConfigV2) C0C64.LJIILLIIL().LJJII(OptConfigV2.class, optConfigV2, "pdp_add_cart_optimize_v2", true);
                if (optConfigV23 != null) {
                    optConfigV2 = optConfigV23;
                }
                if (!optConfigV2.addCartAnimatorTimingOpt && (function1 = (Function1) aUListenerS0S0600002_6.l5) != null) {
                    function1.invoke(Boolean.TRUE);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AUListenerS0S0600002_6(PathMeasure pathMeasure, PathMeasure pathMeasure2, float f, SmartImageView smartImageView, float f2, LifecycleCoroutineScope lifecycleCoroutineScope, ValueAnimator valueAnimator, C013C c013c, Function1<? super Boolean, Unit> function1) {
        this.$t = function1;
        this.l0 = pathMeasure;
        this.f6 = pathMeasure2;
        this.l1 = f;
        this.f7 = smartImageView;
        this.l2 = f2;
        this.l3 = lifecycleCoroutineScope;
        this.l4 = valueAnimator;
        this.l5 = c013c;
    }
}
