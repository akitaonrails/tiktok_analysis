package X;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: X.0rZi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593720rZi {
    public static ObjectAnimator LIZ(View view, float f, float f2, long j) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, f, f2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f, f2));
        objectAnimatorOfPropertyValuesHolder.setDuration(j);
        return objectAnimatorOfPropertyValuesHolder;
    }
}
