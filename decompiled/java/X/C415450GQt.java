package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0GQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415450GQt extends Drawable {
    public int LIZ = -16777216;
    public int LIZIZ = -16777216;
    public int LIZJ = -16777216;
    public float LIZLLL;
    public final Paint LJ;
    public final RectF LJFF;
    public float LJI;
    public float LJII;

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C415450GQt() {
        Paint paint = new Paint();
        this.LJ = paint;
        this.LJFF = new RectF();
        paint.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fWidth = getBounds().width();
        float f = this.LIZLLL / 2;
        float fCenterY = getBounds().centerY() - f;
        float fCenterY2 = getBounds().centerY() + f;
        this.LJ.setColor(this.LIZJ);
        this.LJFF.set(0.0f, fCenterY, fWidth, fCenterY2);
        canvas.drawRoundRect(this.LJFF, f, f, this.LJ);
        if (this.LJII > this.LJI) {
            this.LJ.setColor(this.LIZIZ);
            this.LJFF.set(this.LJI * fWidth, fCenterY, this.LJII * fWidth, fCenterY2);
            canvas.drawRoundRect(this.LJFF, f, f, this.LJ);
        }
        this.LJ.setColor(this.LIZ);
        this.LJFF.set(0.0f, fCenterY, fWidth * this.LJI, fCenterY2);
        canvas.drawRoundRect(this.LJFF, f, f, this.LJ);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        invalidateSelf();
        return zOnLevelChange;
    }
}
