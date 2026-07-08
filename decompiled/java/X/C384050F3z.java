package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* JADX INFO: renamed from: X.0F3z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C384050F3z {
    public Integer LIZ;
    public Integer LIZIZ;
    public Float LIZJ;
    public Integer LIZLLL;
    public Integer LJ;
    public Integer LJFF;
    public Float LJIIIIZZ;
    public Float LJIIIZ;
    public Float LJIIJ;
    public Float LJIIJJI;
    public Float LJIIL;
    public Float LJIILIIL;
    public int LJI = -1;
    public int LJII = -1;
    public final boolean LJIILJJIL = true;

    public final Drawable LIZ(Context context) {
        Integer numLIZJ;
        float fFloatValue;
        float fFloatValue2;
        float fFloatValue3;
        float[] fArr;
        GradientDrawable gradientDrawable = new GradientDrawable();
        Integer num = this.LIZIZ;
        if (num != null) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(num.intValue(), context);
            if (numLIZJ2 != null) {
                gradientDrawable.setColor(numLIZJ2.intValue());
            }
        } else {
            Integer num2 = this.LIZ;
            if (num2 != null) {
                gradientDrawable.setColor(num2.intValue());
            }
        }
        Integer num3 = this.LJFF;
        if (num3 != null) {
            numLIZJ = C1308910kAL.LIZJ(num3.intValue(), context);
        } else {
            numLIZJ = this.LJ;
        }
        Integer num4 = this.LIZLLL;
        if (num4 != null) {
            int iIntValue = num4.intValue();
            if (numLIZJ != null) {
                int iIntValue2 = numLIZJ.intValue();
                Float f = this.LJIILIIL;
                if (f != null && this.LJIIL != null) {
                    float fFloatValue4 = f.floatValue();
                    Float f2 = this.LJIIL;
                    if (f2 != null) {
                        gradientDrawable.setStroke(iIntValue, iIntValue2, f2.floatValue(), fFloatValue4);
                    }
                } else {
                    gradientDrawable.setStroke(iIntValue, iIntValue2);
                }
            }
        }
        Float f3 = this.LIZJ;
        if (f3 != null) {
            gradientDrawable.setCornerRadius(f3.floatValue());
        }
        Float f4 = this.LJIIIIZZ;
        if (f4 != null || this.LJIIIZ != null || this.LJIIJ != null || this.LJIIJJI != null) {
            float fFloatValue5 = 0.0f;
            if (f4 != null) {
                fFloatValue = f4.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            Float f5 = this.LJIIIZ;
            if (f5 != null) {
                fFloatValue2 = f5.floatValue();
            } else {
                fFloatValue2 = 0.0f;
            }
            Float f6 = this.LJIIJJI;
            if (f6 != null) {
                fFloatValue3 = f6.floatValue();
            } else {
                fFloatValue3 = 0.0f;
            }
            Float f7 = this.LJIIJ;
            if (f7 != null) {
                fFloatValue5 = f7.floatValue();
            }
            if (this.LJIILJJIL && C426750GoL.LIZLLL(context)) {
                fArr = new float[]{fFloatValue2, fFloatValue2, fFloatValue, fFloatValue, fFloatValue5, fFloatValue5, fFloatValue3, fFloatValue3};
            } else {
                fArr = new float[]{fFloatValue, fFloatValue, fFloatValue2, fFloatValue2, fFloatValue3, fFloatValue3, fFloatValue5, fFloatValue5};
            }
            gradientDrawable.setCornerRadii(fArr);
        }
        int i = this.LJII;
        if (i >= 0 || this.LJI >= 0) {
            gradientDrawable.setSize(i, this.LJI);
        }
        return gradientDrawable;
    }
}
