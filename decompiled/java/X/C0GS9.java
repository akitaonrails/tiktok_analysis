package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0GS9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GS9 extends Drawable {
    public final Paint LIZ = new Paint();
    public float LIZIZ;
    public int LIZJ;
    public float LIZLLL;
    public float LJ;
    public int LJFF;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.LIZ.setColor(this.LJFF);
        this.LIZ.setShadowLayer(this.LIZIZ, 0.0f, this.LIZLLL, this.LIZJ);
        RectF rectF = new RectF(getBounds());
        float f = this.LJ;
        canvas.drawRoundRect(rectF, f, f, this.LIZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LIZ.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZ.setColorFilter(colorFilter);
    }
}
