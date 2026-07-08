package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0FQp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389930FQp extends Drawable {
    public final float LIZ;
    public final Paint LIZIZ;
    public final Path LIZJ;

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fWidth = getBounds().width();
        float fHeight = getBounds().height();
        Path path = this.LIZJ;
        path.reset();
        path.moveTo(this.LIZ, 0.0f);
        path.lineTo(fWidth - this.LIZ, 0.0f);
        float f = 2;
        float f2 = this.LIZ;
        path.arcTo(fWidth - (f * f2), 0.0f, fWidth, f * f2, 270.0f, 90.0f, false);
        path.lineTo(fWidth, fHeight - this.LIZ);
        float f3 = this.LIZ;
        path.arcTo(fWidth - (f * f3), fHeight - (f3 * f), fWidth, fHeight, 0.0f, 90.0f, false);
        path.lineTo(this.LIZ, fHeight);
        float f4 = this.LIZ;
        path.arcTo(0.0f, fHeight - (f * f4), f * f4, fHeight, 90.0f, 90.0f, false);
        path.lineTo(0.0f, this.LIZ);
        float f5 = this.LIZ;
        path.arcTo(0.0f, 0.0f, f * f5, f * f5, -180.0f, 90.0f, false);
        path.close();
        canvas.drawPath(this.LIZJ, this.LIZIZ);
    }

    public C389930FQp(float f, int i) {
        this.LIZ = f;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        this.LIZIZ = paint;
        this.LIZJ = new Path();
    }
}
