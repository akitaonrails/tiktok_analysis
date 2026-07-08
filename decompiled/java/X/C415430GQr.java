package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0GQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415430GQr extends Drawable {
    public final float LIZ = 1.0f;
    public final int LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
    public final int LIZJ = -1;
    public final float LIZLLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
    public final float LJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
    public boolean LJFF;
    public final Paint LJI;
    public final RectF LJII;
    public float LJIIIIZZ;
    public Rect LJIIIZ;

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
        return (int) (this.LIZ * this.LIZIZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return (int) (this.LIZ * this.LIZIZ);
    }

    public C415430GQr() {
        Paint paint = new Paint();
        this.LJI = paint;
        this.LJII = new RectF();
        this.LJIIIZ = new Rect();
        paint.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fWidth;
        int iWidth;
        float fWidth2;
        this.LJI.setColor(this.LIZJ);
        float f = this.LIZLLL / 2;
        float fCenterY = getBounds().centerY() - f;
        float fCenterY2 = getBounds().centerY() + f;
        RectF rectF = this.LJII;
        if (this.LJFF) {
            fWidth = (((this.LIZIZ - this.LJIIIZ.width()) * this.LJIIIIZZ) + this.LJIIIZ.width()) - this.LIZIZ;
        } else {
            fWidth = (this.LJIIIZ.width() - this.LIZIZ) * this.LJIIIIZZ;
        }
        if (this.LJFF) {
            fWidth2 = (this.LIZIZ - this.LJIIIZ.width()) * this.LJIIIIZZ;
            iWidth = this.LJIIIZ.width();
        } else {
            int iWidth2 = this.LJIIIZ.width();
            iWidth = this.LIZIZ;
            fWidth2 = (iWidth2 - iWidth) * this.LJIIIIZZ;
        }
        rectF.set(fWidth, fCenterY, fWidth2 + iWidth, fCenterY2);
        RectF rectF2 = this.LJII;
        float f2 = this.LJ;
        canvas.drawRoundRect(rectF2, f2, f2, this.LJI);
    }
}
