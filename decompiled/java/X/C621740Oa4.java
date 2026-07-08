package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: X.0Oa4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C621740Oa4 {
    public static final /* synthetic */ int LIZ = 0;

    public static Animator LIZ(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f, f2);
    }

    public static Animator LIZIZ(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, f, f2);
    }
}
