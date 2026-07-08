package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: renamed from: X.0Go4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426580Go4 {
    public static Drawable LIZIZ(int[] iArr) {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TR_BL, iArr);
        gradientDrawable.setGradientType(0);
        return gradientDrawable;
    }

    public static Drawable LIZ(int i, int i2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(i3, i);
        return gradientDrawable;
    }

    public static Drawable LIZLLL(int i, int i2, float[] fArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(0, i);
        gradientDrawable.setCornerRadii(fArr);
        return gradientDrawable;
    }

    public static Drawable LIZJ(int i, int i2, int i3, int i4) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(i3, i);
        gradientDrawable.setCornerRadius(i4);
        return gradientDrawable;
    }
}
