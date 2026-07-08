package Y;

import X.C1428060nGW;
import X.C1445280niI;
import X.C2188811AlT;
import X.C385200F8k;
import X.InterfaceC1428100nGa;
import android.animation.ValueAnimator;
import com.ss.android.ugc.aweme.creative.model.edit.ImageTransformParams;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: loaded from: classes23.dex */
public class AUListenerS0S0210002_22 implements ValueAnimator.AnimatorUpdateListener {
    public final int $t;
    public float f3;
    public float f4;
    public Object l0;
    public Object l1;
    public boolean z2;

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

    public static final void onAnimationUpdate$0(AUListenerS0S0210002_22 aUListenerS0S0210002_22, ValueAnimator valueAnimator) {
        Float f;
        float fFloatValue;
        float f2;
        float f3;
        float f4;
        float f5;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Float) {
            f = (Float) animatedValue;
        } else {
            f = null;
        }
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        if (fFloatValue == 0.0f) {
            ((InterfaceC1428100nGa) aUListenerS0S0210002_22.l0).onStart();
        }
        ((InterfaceC1428100nGa) aUListenerS0S0210002_22.l0).onProgress(fFloatValue);
        if (aUListenerS0S0210002_22.z2) {
            f5 = aUListenerS0S0210002_22.f3;
            f4 = aUListenerS0S0210002_22.f4;
            f3 = 1.0f;
            f2 = 0.0f;
        } else {
            f2 = aUListenerS0S0210002_22.f3;
            f3 = aUListenerS0S0210002_22.f4;
            f4 = 1.0f;
            f5 = 0.0f;
        }
        float f6 = 1 - fFloatValue;
        float f7 = (f5 * fFloatValue) + (f2 * f6);
        float f8 = (f4 * fFloatValue) + (f3 * f6);
        if (f8 > 0.0f && f8 <= 1.0f) {
            ((Function1) aUListenerS0S0210002_22.l1).invoke(C1445280niI.LIZ(new ImageTransformParams(f8, 0.0f, f7, 0.0f, false, false)));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invalid ");
        sbLIZ.append(f8);
        sbLIZ.append(' ');
        sbLIZ.append(f7);
        C385200F8k.LIZLLL("ScalingEditPageAnimationHelper", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onAnimationUpdate$1(AUListenerS0S0210002_22 aUListenerS0S0210002_22, ValueAnimator valueAnimator) {
        Float f;
        float fFloatValue;
        float f2;
        float f3;
        float f4;
        float f5;
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue instanceof Float) {
            f = (Float) animatedValue;
        } else {
            f = null;
        }
        if (f != null) {
            fFloatValue = f.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        if (fFloatValue == 0.0f) {
            ((InterfaceC1428100nGa) aUListenerS0S0210002_22.l0).onStart();
        }
        ((InterfaceC1428100nGa) aUListenerS0S0210002_22.l0).onProgress(fFloatValue);
        if (aUListenerS0S0210002_22.z2) {
            f5 = aUListenerS0S0210002_22.f3;
            f4 = aUListenerS0S0210002_22.f4;
            f3 = 1.0f;
            f2 = 0.0f;
        } else {
            f2 = aUListenerS0S0210002_22.f3;
            f3 = aUListenerS0S0210002_22.f4;
            f4 = 1.0f;
            f5 = 0.0f;
        }
        float f6 = 1 - fFloatValue;
        float f7 = (f5 * fFloatValue) + (f2 * f6);
        float f8 = (f4 * fFloatValue) + (f3 * f6);
        if (f8 > 0.0f && f8 <= 1.0f) {
            ((Function1) aUListenerS0S0210002_22.l1).invoke(C1445280niI.LIZ(new ImageTransformParams(f8, 0.0f, f7, 0.0f, false, false)));
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("invalid ");
        sbLIZ.append(f8);
        sbLIZ.append(' ');
        sbLIZ.append(f7);
        C385200F8k.LIZLLL("ScalingEditPageAnimationHelper", C2188811AlT.LIZIZ(sbLIZ));
    }

    public AUListenerS0S0210002_22(C1428060nGW c1428060nGW, boolean z, float f, float f2, AwS601S0100000_22 awS601S0100000_22, int i) {
        this.$t = i;
        this.l0 = c1428060nGW;
        this.z2 = z;
        this.f3 = f;
        this.f4 = f2;
        this.l1 = awS601S0100000_22;
    }
}
