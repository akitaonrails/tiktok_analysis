package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0GR3, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GR3 extends Drawable {
    public float LIZ;
    public final Paint LIZIZ;
    public final RectF LIZJ;

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.LIZIZ.getColorFilter();
    }

    public C0GR3() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(0);
        this.LIZIZ = paint;
        this.LIZJ = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.LIZJ.set(getBounds());
        RectF rectF = this.LIZJ;
        float f = this.LIZ;
        canvas.drawRoundRect(rectF, f, f, this.LIZIZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZIZ.setColorFilter(colorFilter);
    }
}
