package X;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.animation.LinearInterpolator;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0KaA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C519880KaA {
    public static ObjectAnimator LIZ(Object obj, Property property, float[] fArr) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(obj, (Property<Object, Float>) property, Arrays.copyOf(fArr, fArr.length));
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setDuration(300L);
        return objectAnimatorOfFloat;
    }
}
