package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: X.10uR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19395710uR {
    public static final /* synthetic */ int LIZ = 0;

    public static Animator LIZIZ(View view, float f) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getTranslationY(), f);
    }

    public static Animator LIZ(float f, float f2, View view) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f, f2);
    }
}
