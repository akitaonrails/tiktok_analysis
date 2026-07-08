package X;

import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;

/* JADX INFO: renamed from: X.0eVR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091350eVR {
    public static final AnimationSet LIZ() {
        AnimationSet animationSet = new AnimationSet(true);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.2f, 1.0f, 1.2f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(100L);
        animationSet.setFillAfter(true);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }
}
