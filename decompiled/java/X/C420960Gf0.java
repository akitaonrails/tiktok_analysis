package X;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* JADX INFO: renamed from: X.0Gf0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420960Gf0 {
    public static final Drawable LIZ(float f) {
        int iCeil = ((int) Math.ceil(255 * f)) << 24;
        int iMax = Math.max(8, 4);
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        final int[] iArr = new int[iMax];
        int iAlpha = Color.alpha(iCeil);
        for (int i = 0; i < iMax; i++) {
            iArr[i] = (((int) (iAlpha * Math.max(0.0f, Math.min(1.0f, (float) Math.pow((i * 1.0f) / (iMax - 1), 3.0d))))) << 24) | (16777215 & iCeil);
        }
        final float f2 = 0.0f;
        final float f3 = 1.0f;
        paintDrawable.setShaderFactory(new ShapeDrawable.ShaderFactory() { // from class: X.0GQV
            @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
            public final Shader resize(int i2, int i3) {
                float f4 = i2;
                float f5 = i3;
                return new LinearGradient(f4 * f2, f5 * f2, f4 * f2, f5 * f3, iArr, (float[]) null, Shader.TileMode.CLAMP);
            }
        });
        return paintDrawable;
    }
}
