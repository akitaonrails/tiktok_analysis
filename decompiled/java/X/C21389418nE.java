package X;

import Y.AAListenerS10S0100002_32;
import Y.AAListenerS265S0200000_13;
import Y.AUListenerS279S0100000_32;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.RenderNode;
import android.util.Property;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.18nE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21389418nE implements InterfaceC21392018ne {
    @Override // X.InterfaceC21392018ne
    public final Animator LIZ(View view, View view2) {
        C21390118nL c21390118nL;
        if (view instanceof C21390118nL) {
            c21390118nL = (C21390118nL) view;
        } else {
            c21390118nL = (C21390118nL) view.findViewById(R.id.tyd);
        }
        if (c21390118nL == null) {
            return C21389218nC.LIZJ(view);
        }
        final float width = c21390118nL.getWidth() / 2.0f;
        final float height = c21390118nL.getHeight() / 2.0f;
        Interpolator interpolatorLIZIZ = C0GY9.LIZIZ(0.7f, 0.0f, 1.0f, 1.0f);
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(C294650Bgl.LIZ());
        valueAnimatorOfFloat.setInterpolator(interpolatorLIZIZ);
        C786410Ut5.S5(c21390118nL, 1.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c21390118nL, (Property<C21390118nL, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(C289430BWb.LIZ());
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        c21390118nL.setRenderNodeDriver(new InterfaceC21389118nB() { // from class: X.18n7
            @Override // X.InterfaceC21389118nB
            public final void LIZ(RenderNode renderNode) {
                float animatedFraction = 1.0f - valueAnimatorOfFloat.getAnimatedFraction();
                renderNode.setPivotX(width);
                renderNode.setPivotY(height);
                renderNode.setScaleX(animatedFraction);
                renderNode.setScaleY(animatedFraction);
            }
        });
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS279S0100000_32(c21390118nL, 24));
        valueAnimatorOfFloat.addListener(new AAListenerS10S0100002_32(c21390118nL, width, height, 1));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat);
        animatorSet.addListener(new AAListenerS265S0200000_13(view, c21390118nL, 3));
        return animatorSet;
    }

    @Override // X.InterfaceC21392018ne
    public final Animator LIZIZ(View view, View view2) {
        return C21389218nC.LIZ(view2);
    }
}
