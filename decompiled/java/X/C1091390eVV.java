package X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: X.0eVV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091390eVV {
    public static final void LIZ(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(350L);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setAnimationListener(new AnimationAnimationListenerC1151570g4Z(view, 16));
        view.startAnimation(alphaAnimation);
    }
}
