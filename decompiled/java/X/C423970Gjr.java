package X;

import android.graphics.drawable.GradientDrawable;

/* JADX INFO: renamed from: X.0Gjr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C423970Gjr {
    public static C424020Gjw LIZ(float f, float f2, float f3, float f4, int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.mutate();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f4, f4, f3, f3});
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.mutate();
        gradientDrawable2.setColor(i2);
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadii(new float[]{f, f, f2, f2, f4, f4, f3, f3});
        return new C424020Gjw(gradientDrawable, gradientDrawable2);
    }
}
