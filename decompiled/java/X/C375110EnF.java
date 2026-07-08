package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0EnF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C375110EnF extends Drawable {
    public final Paint LIZ;
    public final boolean LIZIZ;
    public EnumC375190EnN LIZJ;
    public float LIZLLL;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    public C375110EnF() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        this.LIZ = paint;
        this.LIZIZ = true;
        this.LIZJ = EnumC375190EnN.FREE;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fWidth = getBounds().width() / 24.0f;
        float f = 2 * fWidth;
        this.LIZ.setStrokeWidth(f);
        this.LIZLLL = f;
        switch (C375100EnE.LIZ[this.LIZJ.ordinal()]) {
            case 1:
                float f2 = 3.5f * fWidth;
                LIZ(this, canvas, f2, fWidth, getBounds().width() - f2, getBounds().height() - fWidth, this.LIZ);
                float f3 = 4 * fWidth;
                float f4 = f2 + f3;
                float f5 = fWidth + f3;
                float fWidth2 = (getBounds().width() - f2) - f3;
                float fHeight = getBounds().height() - (5 * fWidth);
                Paint paint = this.LIZ;
                if (this.LIZIZ) {
                    canvas.drawRoundRect(f4, f5, fWidth2, fHeight, fWidth, fWidth, paint);
                } else {
                    canvas.drawRect(f4, f5, fWidth2, fHeight, paint);
                }
                break;
            case 2:
                float fWidth3 = ((getBounds().width() - ((getBounds().height() * 9.0f) / 16.0f)) / 2.0f) + fWidth;
                LIZ(this, canvas, fWidth3, fWidth, getBounds().width() - fWidth3, getBounds().height() - fWidth, this.LIZ);
                break;
            case 3:
                float fHeight2 = ((getBounds().height() - ((getBounds().width() * 9.0f) / 16.0f)) / 2.0f) + fWidth;
                LIZ(this, canvas, fWidth, fHeight2, getBounds().width() - fWidth, getBounds().height() - fHeight2, this.LIZ);
                break;
            case 4:
                float f6 = 3 * fWidth;
                LIZ(this, canvas, f6, f6, getBounds().width() - f6, getBounds().height() - f6, this.LIZ);
                break;
            case 5:
                float fWidth4 = ((getBounds().width() - ((getBounds().height() * 3.0f) / 4.0f)) / 2.0f) + fWidth;
                LIZ(this, canvas, fWidth4, fWidth, getBounds().width() - fWidth4, getBounds().height() - fWidth, this.LIZ);
                break;
            case 6:
                float fHeight3 = ((getBounds().height() - ((getBounds().width() * 3.0f) / 4.0f)) / 2.0f) + fWidth;
                LIZ(this, canvas, fWidth, fHeight3, getBounds().width() - fWidth, getBounds().height() - fHeight3, this.LIZ);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.LIZ.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.LIZ.setColorFilter(colorFilter);
    }

    public static void LIZ(C375110EnF c375110EnF, Canvas canvas, float f, float f2, float f3, float f4, Paint paint) {
        float f5 = c375110EnF.LIZLLL;
        if (c375110EnF.LIZIZ) {
            canvas.drawRoundRect(f, f2, f3, f4, f5, f5, paint);
        } else {
            canvas.drawRect(f, f2, f3, f4, paint);
        }
    }
}
