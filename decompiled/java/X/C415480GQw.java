package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0GQw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415480GQw extends Drawable {
    public int LIZ;
    public float LIZIZ;
    public final Paint LIZJ;

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.LIZIZ <= 0.0f) {
            return;
        }
        this.LIZJ.setColor(this.LIZ);
        float fWidth = getBounds().width();
        float fHeight = getBounds().height();
        float f = getBounds().left + (0.125f * fWidth);
        float f2 = getBounds().top + (0.112500004f * fHeight);
        float f3 = this.LIZIZ;
        canvas.drawLine(f, f2, f + (((getBounds().left + (fWidth * 0.8958333f)) - f) * f3), f2 + (((getBounds().top + (fHeight * 0.8833334f)) - f2) * f3), this.LIZJ);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LIZJ.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZJ.setColorFilter(colorFilter);
    }

    public C415480GQw(float f, int i) {
        this.LIZ = i;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f * 2.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.LIZJ = paint;
    }
}
