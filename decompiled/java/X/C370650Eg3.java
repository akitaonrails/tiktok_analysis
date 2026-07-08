package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0Eg3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370650Eg3 extends Drawable {
    public final float LIZ;
    public final int LIZIZ;
    public final C401790FpB LIZJ = new C401790FpB();
    public final Paint LIZLLL;

    @Override // android.graphics.drawable.Drawable
    @InterfaceC1294060jmO
    public final int getOpacity() {
        return this.LIZ > 0.0f ? -3 : -1;
    }

    public final int hashCode() {
        return (((int) this.LIZ) * 31) + this.LIZIZ;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            return;
        }
        RectF rectF = new RectF(bounds);
        C401790FpB c401790FpB = this.LIZJ;
        float fWidth = rectF.width();
        float f = this.LIZ;
        int i = (int) f;
        int i2 = (int) (f + (fWidth - (2 * f)));
        c401790FpB.setBounds(new Rect(i, i, i2, i2));
        c401790FpB.draw(canvas);
        if (this.LIZ > 0.0f) {
            float fCenterX = c401790FpB.getBounds().centerX();
            canvas.drawCircle(fCenterX, c401790FpB.getBounds().centerY(), ((bounds.width() / 2.0f) - (this.LIZ / 2.0f)) - Math.abs(fCenterX - rectF.centerX()), this.LIZLLL);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C370650Eg3)) {
            return false;
        }
        C370650Eg3 c370650Eg3 = (C370650Eg3) obj;
        if (this.LIZ == c370650Eg3.LIZ && this.LIZIZ == c370650Eg3.LIZIZ) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LIZLLL.setAlpha(i);
        this.LIZJ.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZLLL.setColorFilter(colorFilter);
        this.LIZJ.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C370650Eg3(float f, int i) {
        this.LIZ = f;
        this.LIZIZ = i;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.LIZLLL = paint;
        paint.setStrokeWidth(f);
        paint.setColor(i);
    }
}
