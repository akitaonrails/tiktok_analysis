package X;

import android.R;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;

/* JADX INFO: renamed from: X.0Gk1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424070Gk1 {
    public static final StateListDrawable LIZ(float f, float f2, int i, int i2) {
        GradientDrawable gradientDrawableLIZIZ = LIZIZ(f2, f, i, i);
        GradientDrawable gradientDrawableLIZIZ2 = LIZIZ(f2, f, i2, i2);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed, R.attr.state_enabled}, gradientDrawableLIZIZ2);
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawableLIZIZ);
        stateListDrawable.addState(new int[0], gradientDrawableLIZIZ);
        return stateListDrawable;
    }

    public static final GradientDrawable LIZIZ(float f, float f2, int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(1, i2);
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f2, f2});
        return gradientDrawable;
    }
}
