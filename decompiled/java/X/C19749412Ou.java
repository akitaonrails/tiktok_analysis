package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.12Ou, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19749412Ou extends Drawable {
    public float LJ;
    public float LJFF;
    public float LJI;
    public int LJIIIIZZ;
    public float LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public final Paint LJIIL;
    public final RectF LJIILIIL;
    public boolean LJIILJJIL;
    public final float LIZ = 1.0f;
    public int LIZIZ = -1;
    public float LIZJ = -1.0f;
    public int LIZLLL = -16777216;
    public final float LJII = 0.5f;

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return 0;
    }

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

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) (this.LJFF * this.LIZ);
    }

    public final String toString() {
        return "ThumbDrawable(maxSizeScale=" + this.LIZ + ", thumbColor=" + this.LIZIZ + ", shadowOffsetX=0.0, shadowOffsetY=0.0, shadowRadius=" + this.LIZJ + ", shadowColor=" + this.LIZLLL + ", thumbWidth=" + this.LJ + ", thumbHeight=" + this.LJFF + ", thumbRadius=" + this.LJI + ", offsetThumbToProgress=" + this.LJII + ", drawProgressScale=" + this.LJIIIZ + ", trackerWidth=" + this.LJIIJ + ", offsetY=" + this.LJIIJJI + ", paint=" + this.LJIIL + ", rectF=" + this.LJIILIIL + ", isRTL=" + this.LJIILJJIL + ", exactCenterY(): " + getBounds().exactCenterY() + ')';
    }

    public C19749412Ou() {
        Paint paint = new Paint();
        this.LJIIL = paint;
        this.LJIILIIL = new RectF();
        this.LJIILJJIL = C1899620zX6.LIZ();
        paint.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.LJIIL.setColor(this.LIZIZ);
        float f = this.LIZJ;
        if (f >= 0.0f) {
            this.LJIIL.setShadowLayer(f, 0.0f, 0.0f + this.LJIIJJI, this.LIZLLL);
        }
        float f2 = this.LJIIJ;
        float f3 = this.LJIIIZ;
        float f4 = f2 * f3;
        int i = this.LJIIIIZZ / 2;
        float f5 = this.LJ;
        float f6 = f4 - (f5 * f3);
        float f7 = f4 + (f5 * (1 - f3));
        float f8 = i;
        float f9 = this.LJFF;
        float f10 = 2;
        float f11 = this.LJIIJJI;
        getBounds().left = Math.max(0, (int) f6);
        getBounds().right = (int) f7;
        this.LJIILIIL.set(f6, (f8 - (f9 / f10)) + f11, f7, f8 + (f9 / f10) + f11);
        RectF rectF = this.LJIILIIL;
        float f12 = this.LJI;
        canvas.drawRoundRect(rectF, f12, f12, this.LJIIL);
    }
}
