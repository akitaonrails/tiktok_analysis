package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.12Os, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19749212Os extends Drawable {
    public final C19749312Ot LIZ;
    public int LIZIZ = -16777216;
    public int LIZJ = -16777216;
    public float LIZLLL;
    public float LJ;
    public float LJFF;
    public final Paint LJI;
    public final RectF LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;

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

    public C19749212Os(C19749312Ot c19749312Ot) {
        this.LIZ = c19749312Ot;
        Paint paint = new Paint();
        this.LJI = paint;
        this.LJII = new RectF();
        paint.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fWidth = getBounds().width();
        float f = this.LIZLLL / 2;
        float fCenterY = (getBounds().centerY() - f) + this.LJFF;
        float fCenterY2 = getBounds().centerY() + f + this.LJFF;
        this.LJI.setColor(this.LIZJ);
        this.LJII.set(0.0f, fCenterY, fWidth, fCenterY2);
        RectF rectF = this.LJII;
        float f2 = this.LJ;
        canvas.drawRoundRect(rectF, f2, f2, this.LJI);
        if (this.LJIIIZ > this.LJIIIIZZ) {
            this.LJI.setColor(0);
            this.LJII.set(this.LJIIIIZZ * fWidth, fCenterY, this.LJIIIZ * fWidth, fCenterY2);
            RectF rectF2 = this.LJII;
            float f3 = this.LJ;
            canvas.drawRoundRect(rectF2, f3, f3, this.LJI);
        }
        this.LJI.setColor(this.LIZIZ);
        this.LJII.set(0.0f, fCenterY, fWidth * this.LJIIIIZZ, fCenterY2);
        this.LIZ.draw(canvas);
        float f4 = this.LJ;
        Path path = new Path();
        path.addRoundRect(this.LJII, new float[]{f4, f4, 0.0f, 0.0f, 0.0f, 0.0f, f4, f4}, Path.Direction.CW);
        canvas.drawPath(path, this.LJI);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        invalidateSelf();
        return zOnLevelChange;
    }
}
