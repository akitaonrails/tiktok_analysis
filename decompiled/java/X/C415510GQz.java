package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0GQz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415510GQz extends Drawable {
    public int LIZLLL;
    public final Paint LJIIIIZZ;
    public final RectF LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public float[] LJIIL;
    public int LIZ = -16777216;
    public int LIZIZ = -16777216;
    public float LIZJ = C418440Gaw.LIZIZ(8);
    public int LJ = -1;
    public float LJFF = C418440Gaw.LIZIZ(2);
    public final float LJI = C418440Gaw.LIZIZ(6);
    public boolean LJII = true;

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

    public C415510GQz() {
        Paint paint = new Paint();
        this.LJIIIIZZ = paint;
        this.LJIIIZ = new RectF();
        paint.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fWidth = getBounds().width();
        this.LJIIIIZZ.setShadowLayer(C418440Gaw.LIZIZ(1), 0.0f, 1.0f, this.LIZLLL);
        float f = 2;
        float f2 = this.LIZJ / f;
        float fCenterY = getBounds().centerY() - f2;
        float fCenterY2 = getBounds().centerY() + f2;
        this.LJIIIIZZ.setColor(this.LIZIZ);
        this.LJIIIZ.set(0.0f, fCenterY, fWidth, fCenterY2);
        canvas.drawRoundRect(this.LJIIIZ, f2, f2, this.LJIIIIZZ);
        this.LJIIIIZZ.setColor(this.LIZ);
        float f3 = this.LJIIJJI * fWidth;
        float f4 = this.LJIIJ * fWidth;
        if (f3 < f4) {
            this.LJIIIZ.set(f3, fCenterY, f4, fCenterY2);
        } else {
            this.LJIIIZ.set(f4, fCenterY, f3, fCenterY2);
        }
        if (this.LJIIJJI != 0.0f && !this.LJII) {
            canvas.drawRect(this.LJIIIZ, this.LJIIIIZZ);
        } else {
            canvas.drawRoundRect(this.LJIIIZ, f2, f2, this.LJIIIIZZ);
        }
        float[] fArr = this.LJIIL;
        if (fArr != null) {
            for (float f5 : fArr) {
                this.LJIIIIZZ.setColor(this.LJ);
                float f6 = f5 * fWidth;
                float f7 = this.LJFF / f;
                this.LJIIIZ.set(f6 - f7, getBounds().centerY() - (this.LJI / f), f6 + f7, getBounds().centerY() + (this.LJI / f));
                canvas.drawRoundRect(this.LJIIIZ, C418440Gaw.LIZIZ(1), C418440Gaw.LIZIZ(1), this.LJIIIIZZ);
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
