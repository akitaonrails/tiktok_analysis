package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

/* JADX INFO: renamed from: X.15Pv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20516515Pv {
    public static final /* synthetic */ int LIZ = 0;

    public static Animator LIZ(View view, float f) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), f);
        objectAnimatorOfFloat.setDuration(300L);
        return objectAnimatorOfFloat;
    }
}
