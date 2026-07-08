package X;

import android.animation.ValueAnimator;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: X.0Zrk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912980Zrk {
    public boolean LIZ;

    public final void LIZ(final List<? extends View> list) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.LIZ = true;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 100.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0Zrl
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    for (View view : list) {
                        if (fFloatValue == 0.0f) {
                            if (view != null) {
                                view.setRenderEffect(null);
                            }
                        } else if (view != null) {
                            view.setRenderEffect(RenderEffect.createBlurEffect(fFloatValue, fFloatValue, Shader.TileMode.CLAMP));
                        }
                    }
                }
            });
            valueAnimatorOfFloat.setDuration(100L);
            valueAnimatorOfFloat.start();
        }
    }

    public final void LIZIZ(List<? extends View> list) {
        if (this.LIZ && Build.VERSION.SDK_INT >= 31) {
            for (View view : list) {
                if (view != null) {
                    view.setRenderEffect(null);
                }
            }
            this.LIZ = false;
        }
    }
}
