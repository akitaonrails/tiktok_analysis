package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GWg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416880GWg extends Drawable {
    public final int LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public String LJFF;
    public float LJI;
    public float LJII;
    public final Paint LJIIIIZZ;
    public final Path LJIIIZ;
    public final RectF LJIIJ;
    public final Matrix LJIIJJI;
    public float LJIIL;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LJIIIIZZ.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.LJIIIIZZ.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.LIZLLL;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.LJ;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.LIZLLL;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.LJ;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.translate(this.LJI, this.LJII);
        int length = this.LJFF.length();
        if (length != 0) {
            if (length != 1) {
                float fMeasureText = this.LJIIIIZZ.measureText(this.LJFF);
                float f = this.LJIIL;
                float f2 = (float) ((((double) f) * 0.6666666666666666d) + ((double) fMeasureText));
                float f3 = 2;
                float f4 = f / f3;
                this.LJIIIIZZ.setColor(this.LIZIZ);
                RectF rectF = this.LJIIJ;
                rectF.left = 0.0f;
                rectF.top = 0.0f;
                float f5 = f4 * f3;
                rectF.right = f5;
                rectF.bottom = f5;
                canvas.drawArc(rectF, 90.0f, 180.0f, true, this.LJIIIIZZ);
                canvas.drawRect(f4, 0.0f, f2 - f4, this.LJIIL, this.LJIIIIZZ);
                RectF rectF2 = this.LJIIJ;
                rectF2.left = f2 - f5;
                rectF2.top = 0.0f;
                rectF2.right = f2;
                rectF2.bottom = f5;
                canvas.drawArc(rectF2, -90.0f, 180.0f, true, this.LJIIIIZZ);
                this.LJIIIIZZ.setColor(this.LIZ);
                Paint paint = this.LJIIIIZZ;
                String str = this.LJFF;
                paint.getTextPath(str, 0, str.length(), 0.0f, 0.0f, this.LJIIIZ);
                this.LJIIIZ.computeBounds(this.LJIIJ, true);
                float fHeight = (this.LJIIL - this.LJIIJ.height()) / f3;
                float fWidth = (f2 - this.LJIIJ.width()) / f3;
                this.LJIIJJI.reset();
                Matrix matrix = this.LJIIJJI;
                RectF rectF3 = this.LJIIJ;
                matrix.setTranslate(fWidth - rectF3.left, fHeight - rectF3.top);
                this.LJIIIZ.transform(this.LJIIJJI);
                canvas.drawPath(this.LJIIIZ, this.LJIIIIZZ);
            } else {
                float f6 = 2;
                float f7 = this.LJIIL / f6;
                this.LJIIIIZZ.setColor(this.LIZIZ);
                canvas.drawCircle(f7, f7, f7, this.LJIIIIZZ);
                this.LJIIIIZZ.setColor(this.LIZ);
                Paint paint2 = this.LJIIIIZZ;
                String str2 = this.LJFF;
                paint2.getTextPath(str2, 0, str2.length(), 0.0f, 0.0f, this.LJIIIZ);
                this.LJIIIZ.computeBounds(this.LJIIJ, true);
                float fHeight2 = (this.LJIIL - this.LJIIJ.height()) / f6;
                float fWidth2 = (this.LJIIL - this.LJIIJ.width()) / f6;
                if (Intrinsics.LJFF(this.LJFF, "1")) {
                    fWidth2 *= 0.9f;
                }
                this.LJIIJJI.reset();
                Matrix matrix2 = this.LJIIJJI;
                RectF rectF4 = this.LJIIJ;
                matrix2.setTranslate(fWidth2 - rectF4.left, fHeight2 - rectF4.top);
                this.LJIIIZ.transform(this.LJIIJJI);
                this.LJIIIIZZ.setColor(this.LIZ);
                canvas.drawPath(this.LJIIIZ, this.LJIIIIZZ);
            }
        } else {
            float f8 = this.LIZJ / 2;
            this.LJIIIIZZ.setColor(this.LIZIZ);
            canvas.drawCircle(f8, f8, f8, this.LJIIIIZZ);
        }
        canvas.translate(-this.LJI, -this.LJII);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJIIIIZZ.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LJIIIIZZ.setColorFilter(colorFilter);
    }

    public C416880GWg(Context context, int i, int i2, int i3) {
        float fLIZIZ = C497740JfY.LIZIZ(12);
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LJFF = "";
        Paint paint = new Paint();
        this.LJIIIIZZ = paint;
        this.LJIIIZ = new Path();
        this.LJIIJ = new RectF();
        this.LJIIJJI = new Matrix();
        paint.setAntiAlias(true);
        paint.setTextSize(fLIZIZ);
        C011Z.LIZ.getClass();
        paint.setTypeface(C1119850fFP.LJIILL(fLIZIZ, 7, context, false));
        this.LJIIL = (paint.getFontMetrics().descent - paint.getFontMetrics().ascent) + C418440Gaw.LIZIZ(3);
    }
}
