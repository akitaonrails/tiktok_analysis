package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0GTp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416190GTp extends Drawable {
    public final Drawable LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public final Integer LJI;
    public boolean LJII;
    public final Paint LJIIIIZZ;

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
        float fIntValue;
        float fIntValue2;
        float fIntValue3;
        if (!this.LJII) {
            return;
        }
        int iSave = canvas.save();
        try {
            float fIntValue4 = 0.0f;
            canvas.clipRect(0.0f, 0.0f, this.LIZJ, this.LIZLLL - this.LJFF);
            canvas.translate(0.0f, -this.LIZIZ);
            canvas.translate(0.0f, this.LJ);
            this.LIZ.draw(canvas);
            canvas.restoreToCount(iSave);
            Paint paint = this.LJIIIIZZ;
            if (paint != null) {
                float f = this.LIZLLL - this.LJFF;
                Integer num = this.LJI;
                if (num != null) {
                    fIntValue = num.intValue();
                } else {
                    fIntValue = 0.0f;
                }
                float f2 = f - fIntValue;
                float f3 = this.LIZJ;
                float f4 = this.LIZLLL - this.LJFF;
                Integer num2 = this.LJI;
                if (num2 != null) {
                    fIntValue2 = num2.intValue();
                } else {
                    fIntValue2 = 0.0f;
                }
                float f5 = f4 + fIntValue2;
                Integer num3 = this.LJI;
                if (num3 != null) {
                    fIntValue3 = num3.intValue();
                } else {
                    fIntValue3 = 0.0f;
                }
                Integer num4 = this.LJI;
                if (num4 != null) {
                    fIntValue4 = num4.intValue();
                }
                canvas.drawRoundRect(0.0f, f2, f3, f5, fIntValue3, fIntValue4, paint);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    public C416190GTp(C0GSM c0gsm, int i, int i2, int i3, Integer num, Integer num2, int i4) {
        Paint paint = null;
        num = (i4 & 64) != 0 ? null : num;
        num2 = (i4 & 128) != 0 ? null : num2;
        this.LIZ = c0gsm;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = 0;
        this.LJFF = 0;
        this.LJI = num;
        this.LJII = true;
        if (num != null && num2 != null) {
            paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(num2.intValue());
        }
        this.LJIIIIZZ = paint;
    }
}
