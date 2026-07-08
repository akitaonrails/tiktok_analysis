package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0GR2, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GR2 extends Drawable {
    public final RectF LIZ = new RectF();
    public final Path LIZIZ = new Path();
    public final float LIZJ = C418440Gaw.LIZIZ(8);
    public final float LIZLLL = C418440Gaw.LIZIZ(16);
    public final float LJ = C418440Gaw.LIZIZ(8);
    public final float LJFF = C418440Gaw.LIZIZ(4);
    public final Paint LJI;

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return -3;
    }

    public C0GR2() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.LJI = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getBounds().right > this.LIZJ + this.LIZLLL) {
            this.LIZIZ.reset();
            if (C497740JfY.LJJ()) {
                this.LIZIZ.moveTo(this.LIZJ, this.LJ);
                this.LIZIZ.lineTo(this.LIZJ + (this.LIZLLL / 2), 0.0f);
                this.LIZIZ.lineTo(this.LIZJ + this.LIZLLL, this.LJ);
            } else {
                this.LIZIZ.moveTo(getBounds().right - (this.LIZJ + this.LIZLLL), this.LJ);
                this.LIZIZ.lineTo(getBounds().right - (this.LIZJ + (this.LIZLLL / 2)), 0.0f);
                this.LIZIZ.lineTo(getBounds().right - this.LIZJ, this.LJ);
            }
            this.LIZIZ.close();
        }
        canvas.drawPath(this.LIZIZ, this.LJI);
        this.LIZ.set(getBounds());
        RectF rectF = this.LIZ;
        rectF.top += this.LJ;
        if (!rectF.isEmpty()) {
            RectF rectF2 = this.LIZ;
            float f = this.LJFF;
            canvas.drawRoundRect(rectF2, f, f, this.LJI);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LJI.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LJI.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
