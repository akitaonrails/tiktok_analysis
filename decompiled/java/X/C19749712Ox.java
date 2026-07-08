package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.12Ox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19749712Ox extends Drawable {
    public final C19749412Ou LIZ;
    public final C19749812Oy LIZIZ;
    public final Integer LIZJ;
    public int LJ;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public Float LJIIIZ;
    public Float LJIIJ;
    public final Paint LJIIJJI;
    public final RectF LJIIL;
    public float LJIILIIL;
    public float LJIILJJIL;
    public int LIZLLL = -16777216;
    public int LJFF = -16777216;

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
    public final void draw(Canvas canvas) {
        float fWidth = getBounds().width();
        float f = this.LJI / 2;
        float fCenterY = (getBounds().centerY() - f) + this.LJIIIIZZ;
        float fCenterY2 = getBounds().centerY() + f + this.LJIIIIZZ;
        this.LJIIJJI.setColor(this.LJFF);
        this.LJIIL.set(0.0f, fCenterY, fWidth, fCenterY2);
        RectF rectF = this.LJIIL;
        float f2 = this.LJII;
        canvas.drawRoundRect(rectF, f2, f2, this.LJIIJJI);
        this.LIZIZ.draw(canvas);
        Float f3 = this.LJIIIZ;
        if (f3 != null) {
            LIZ(canvas, fWidth, fCenterY, fCenterY2, f3.floatValue());
        }
        Float f4 = this.LJIIJ;
        if (f4 != null) {
            LIZ(canvas, fWidth, fCenterY, fCenterY2, f4.floatValue());
        }
        if (this.LJIILJJIL > this.LJIILIIL) {
            this.LJIIJJI.setColor(this.LJ);
            this.LJIIL.set(this.LJIILIIL * fWidth, fCenterY, this.LJIILJJIL * fWidth, fCenterY2);
            RectF rectF2 = this.LJIIL;
            float f5 = this.LJII;
            canvas.drawRoundRect(rectF2, f5, f5, this.LJIIJJI);
        }
        this.LJIIJJI.setColor(this.LIZLLL);
        this.LJIIL.set(0.0f, fCenterY, fWidth * this.LJIILIIL, fCenterY2);
        this.LIZ.draw(canvas);
        float f6 = this.LJII;
        Path path = new Path();
        path.addRoundRect(this.LJIIL, new float[]{f6, f6, 0.0f, 0.0f, 0.0f, 0.0f, f6, f6}, Path.Direction.CW);
        canvas.drawPath(path, this.LJIIJJI);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        invalidateSelf();
        return zOnLevelChange;
    }

    public C19749712Ox(C19749412Ou c19749412Ou, C19749812Oy c19749812Oy, Integer num) {
        this.LIZ = c19749412Ou;
        this.LIZIZ = c19749812Oy;
        this.LIZJ = num;
        Paint paint = new Paint();
        this.LJIIJJI = paint;
        this.LJIIL = new RectF();
        paint.setAntiAlias(true);
    }

    public final void LIZ(Canvas canvas, float f, float f2, float f3, float f4) {
        int iLIZIZ;
        float fLIZIZ;
        Integer num = this.LIZJ;
        if (num != null) {
            int iIntValue = num.intValue();
            if (f4 > 0.0f) {
                float f5 = f * f4;
                this.LJIIJJI.setColor(iIntValue);
                float f6 = (f2 + f3) / 2.0f;
                if (this.LJI < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                } else {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
                }
                float f7 = iLIZIZ;
                if (this.LJI < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))) {
                    fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
                } else {
                    fLIZIZ = (this.LJI * 2) / 3;
                }
                float f8 = 2;
                float f9 = f7 / f8;
                float f10 = fLIZIZ / f8;
                this.LJIIL.set(f5 - f9, f6 - f10, f5 + f9, f6 + f10);
                RectF rectF = this.LJIIL;
                float f11 = this.LJII;
                canvas.drawRoundRect(rectF, f11, f11, this.LJIIJJI);
            }
        }
    }
}
