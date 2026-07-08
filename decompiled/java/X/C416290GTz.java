package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0GTz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416290GTz extends Drawable {
    public final Drawable LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final Paint LJ;
    public final Path LJFF;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(new RectF(getBounds()), null);
        this.LIZ.draw(canvas);
        canvas.drawPath(this.LJFF, this.LJ);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float fWidth;
        float fWidth2;
        super.onBoundsChange(rect);
        this.LIZ.setBounds(rect);
        this.LJFF.reset();
        if (this.LIZJ == 0.0f) {
            fWidth = 0.0f;
        } else {
            fWidth = (rect.width() - this.LIZJ) / 2.0f;
        }
        float f = this.LIZJ;
        if (f == 0.0f) {
            fWidth2 = rect.width();
        } else {
            fWidth2 = fWidth + f;
        }
        float f2 = rect.bottom;
        float f3 = f2 - this.LIZLLL;
        this.LJFF.moveTo(fWidth, f2);
        this.LJFF.lineTo(fWidth, this.LIZIZ + f3);
        Path path = this.LJFF;
        float f4 = 2;
        float f5 = this.LIZIZ * f4;
        path.arcTo(new RectF(fWidth, f3, f5 + fWidth, f5 + f3), 180.0f, 90.0f, false);
        this.LJFF.lineTo(fWidth2 - this.LIZIZ, f3);
        Path path2 = this.LJFF;
        float f6 = f4 * this.LIZIZ;
        path2.arcTo(new RectF(fWidth2 - f6, f3, fWidth2, f6 + f3), 270.0f, 90.0f, false);
        this.LJFF.lineTo(fWidth2, rect.bottom);
        this.LJFF.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LIZ.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZ.setColorFilter(colorFilter);
    }

    public C416290GTz(Drawable drawable, float f, float f2, float f3) {
        this.LIZ = drawable;
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        Paint paint = new Paint(1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.LJ = paint;
        this.LJFF = new Path();
    }
}
