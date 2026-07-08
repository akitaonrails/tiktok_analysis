package X;

import android.animation.ArgbEvaluator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0GdZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C420070GdZ extends Drawable {
    public final int LIZ;
    public final C420080Gda LIZIZ;
    public final C420080Gda LIZJ;
    public final ArgbEvaluator LIZLLL;
    public float LJ;
    public final Paint LJFF;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final void LIZIZ() {
        float[] fArr;
        Float fLJJIII;
        Float fLJJIII2;
        if (getBounds().width() <= 0 || getBounds().height() <= 0) {
            return;
        }
        int length = this.LIZIZ.LIZ.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = ((Integer) this.LIZLLL.evaluate(this.LJ, Integer.valueOf(this.LIZIZ.LIZ[i]), Integer.valueOf(this.LIZJ.LIZ[i]))).intValue();
        }
        C420080Gda c420080Gda = this.LIZIZ;
        if (c420080Gda.LIZIZ == null && this.LIZJ.LIZIZ == null) {
            fArr = null;
        } else {
            int length2 = c420080Gda.LIZ.length;
            fArr = new float[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                float[] fArr2 = this.LIZIZ.LIZIZ;
                float length3 = (fArr2 == null || (fLJJIII2 = C13LQ.LJJIII(i2, fArr2)) == null) ? i2 / (this.LIZIZ.LIZ.length - 1) : fLJJIII2.floatValue();
                float[] fArr3 = this.LIZJ.LIZIZ;
                fArr[i2] = length3 + ((((fArr3 == null || (fLJJIII = C13LQ.LJJIII(i2, fArr3)) == null) ? i2 / (this.LIZJ.LIZ.length - 1) : fLJJIII.floatValue()) - length3) * this.LJ);
            }
        }
        this.LJFF.setShader(new LinearGradient(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, iArr, fArr, Shader.TileMode.CLAMP));
    }

    public final void LIZ(float f) {
        this.LJ = f;
        LIZIZ();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawRoundRect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom - (this.LIZ * this.LJ), 1000.0f, 1000.0f, this.LJFF);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        LIZIZ();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJFF.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LJFF.setColorFilter(colorFilter);
    }

    public C420070GdZ(int i, C420080Gda c420080Gda, C420080Gda c420080Gda2) {
        this.LIZ = i;
        this.LIZIZ = c420080Gda;
        this.LIZJ = c420080Gda2;
        if (c420080Gda.LIZ.length == c420080Gda2.LIZ.length) {
            this.LIZLLL = new ArgbEvaluator();
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            this.LJFF = paint;
            return;
        }
        "Start and end gradients must have the same number of colors".toString();
        throw new IllegalArgumentException("Start and end gradients must have the same number of colors");
    }
}
