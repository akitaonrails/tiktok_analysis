package X;

import android.graphics.drawable.GradientDrawable;

/* JADX INFO: renamed from: X.0sro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1643380sro {
    public static final float[] LJIIIIZZ = new float[0];
    public Integer LIZ;
    public Integer LIZIZ;
    public int[] LIZJ;
    public Integer LIZLLL;
    public Integer LJ;
    public Float LJFF;
    public float[] LJI = LJIIIIZZ;
    public GradientDrawable.Orientation LJII;

    public final GradientDrawable LIZ() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        Integer num = this.LIZ;
        if (num != null) {
            gradientDrawable.setShape(num.intValue());
        }
        Integer num2 = this.LIZIZ;
        if (num2 != null) {
            gradientDrawable.setColor(num2.intValue());
        }
        int[] iArr = this.LIZJ;
        if (iArr != null) {
            gradientDrawable.setColors(iArr);
        }
        Integer num3 = this.LIZLLL;
        if (num3 != null) {
            gradientDrawable.setStroke(this.LJ.intValue(), num3.intValue());
        }
        Float f = this.LJFF;
        if (f != null) {
            gradientDrawable.setCornerRadius(f.floatValue());
        }
        float[] fArr = this.LJI;
        if (fArr != LJIIIIZZ) {
            gradientDrawable.setCornerRadii(fArr);
        }
        GradientDrawable.Orientation orientation = this.LJII;
        if (orientation != null) {
            gradientDrawable.setOrientation(orientation);
        }
        return gradientDrawable;
    }

    public final void LIZIZ(int i) {
        this.LIZIZ = Integer.valueOf(i);
    }

    public final void LIZJ(float f) {
        this.LJFF = Float.valueOf(f);
    }

    public final void LIZLLL(int i) {
        this.LIZ = Integer.valueOf(i);
    }

    public final void LJ(int i, int i2) {
        this.LIZLLL = Integer.valueOf(i);
        this.LJ = Integer.valueOf(i2);
    }
}
