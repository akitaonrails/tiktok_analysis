package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0Ea9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366990Ea9 extends Drawable {
    public int LIZLLL;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public float LJIIIZ;
    public final Paint LJIIJ;
    public final RectF LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public float[] LJIILJJIL;
    public int LIZ = -16777216;
    public int LIZIZ = -16777216;
    public float LIZJ = C418440Gaw.LIZIZ(4);
    public int LJ = -1;
    public float LJFF = C418440Gaw.LIZIZ(2);
    public final float LJI = C418440Gaw.LIZIZ(6);

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C366990Ea9() {
        Paint paint = new Paint();
        this.LJIIJ = paint;
        this.LJIIJJI = new RectF();
        paint.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fWidth = getBounds().width();
        this.LJIIJ.setShadowLayer(C418440Gaw.LIZIZ(1), 0.0f, 1.0f, this.LIZLLL);
        float f = 2;
        float f2 = this.LIZJ / f;
        float fCenterY = getBounds().centerY() - f2;
        float fCenterY2 = getBounds().centerY() + f2;
        this.LJIIJ.setColor(this.LIZIZ);
        RectF rectF = this.LJIIJJI;
        float f3 = this.LJIIIZ;
        rectF.set(0.0f - f3, fCenterY, f3 + fWidth, fCenterY2);
        canvas.drawRoundRect(this.LJIIJJI, f2, f2, this.LJIIJ);
        this.LJIIJ.setColor(this.LIZ);
        float f4 = (this.LJIILIIL * fWidth) - this.LJIIIZ;
        float f5 = this.LJIIL * fWidth;
        if (f4 < f5) {
            this.LJIIJJI.set(f4, fCenterY, f5, fCenterY2);
        } else {
            this.LJIIJJI.set(f5, fCenterY, f4, fCenterY2);
        }
        if (this.LJIILIIL != 0.0f && !this.LJIIIIZZ) {
            canvas.drawRect(this.LJIIJJI, this.LJIIJ);
        } else {
            canvas.drawRoundRect(this.LJIIJJI, f2, f2, this.LJIIJ);
        }
        float[] fArr = this.LJIILJJIL;
        if (fArr != null) {
            for (float f6 : fArr) {
                this.LJIIJ.setColor(this.LJ);
                if (this.LJII) {
                    canvas.drawCircle(f6 * fWidth, getBounds().centerY(), this.LJFF / f, this.LJIIJ);
                } else {
                    float f7 = f6 * fWidth;
                    float f8 = this.LJFF / f;
                    this.LJIIJJI.set(f7 - f8, getBounds().centerY() - (this.LJI / f), f7 + f8, getBounds().centerY() + (this.LJI / f));
                    canvas.drawRoundRect(this.LJIIJJI, C418440Gaw.LIZIZ(1), C418440Gaw.LIZIZ(1), this.LJIIJ);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        invalidateSelf();
        return zOnLevelChange;
    }
}
