package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: renamed from: X.15RU, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15RU {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public Paint LJIIIIZZ;
    public Paint LJIIIZ;
    public float[] LJIIJ;
    public int LJIIJJI;
    public Paint LJIIL;
    public boolean LJIILIIL;

    public final Paint LIZ() {
        Paint paint = this.LJIIIZ;
        if (paint != null) {
            return paint;
        }
        return null;
    }

    public C15RU() {
        this.LJIIJ = new float[0];
        this.LJIIJJI = -1;
        this.LJIILIIL = true;
    }

    public C15RU(Context context) {
        this.LJIIJ = new float[0];
        this.LJIIJJI = -1;
        this.LJIILIIL = true;
        LIZIZ(context);
    }

    public final void LIZIZ(Context context) {
        Paint paint = new Paint();
        this.LJIIIIZZ = paint;
        paint.setColor(this.LJIIJJI);
        Paint paint2 = this.LJIIIIZZ;
        Paint paint3 = null;
        if (paint2 == null) {
            paint2 = null;
        }
        paint2.setStyle(Paint.Style.FILL);
        Paint paint4 = this.LJIIIIZZ;
        if (paint4 == null) {
            paint4 = null;
        }
        paint4.setAntiAlias(true);
        this.LJIIIZ = new Paint();
        LIZ().setColor(this.LJIIJJI);
        LIZ().setStyle(Paint.Style.FILL);
        LIZ().setAntiAlias(true);
        LIZ().setAlpha(127);
        Paint paint5 = new Paint();
        this.LJIIL = paint5;
        paint5.setColor(C960203pA.LIZ(R.attr.c7, context));
        Paint paint6 = this.LJIIL;
        if (paint6 == null) {
            paint6 = null;
        }
        paint6.setStrokeWidth((int) C12ES.LIZJ(1.0f, context));
        Paint paint7 = this.LJIIL;
        if (paint7 == null) {
            paint7 = null;
        }
        paint7.setStyle(Paint.Style.FILL);
        Paint paint8 = this.LJIIL;
        if (paint8 != null) {
            paint3 = paint8;
        }
        paint3.setAntiAlias(true);
        this.LJII = (int) C12ES.LIZJ(3.0f, context);
        this.LIZIZ = (int) C12ES.LIZJ(3.0f, context);
        this.LIZJ = (int) C12ES.LIZJ(2.0f, context);
    }

    public final void LIZJ(Canvas canvas) {
        Paint paintLIZ;
        int i;
        if (this.LJIILIIL) {
            float f = (this.LIZLLL / 2) + this.LJ;
            float f2 = this.LIZ;
            Paint paint = this.LJIIL;
            if (paint == null) {
                paint = null;
            }
            canvas.drawLine(0.0f, f, f2, f, paint);
        }
        int length = this.LJIIJ.length;
        for (int i2 = 0; i2 < length; i2++) {
            float f3 = this.LJIIJ[i2];
            int i3 = this.LIZLLL;
            int i4 = (int) (f3 * i3);
            int i5 = this.LIZJ;
            int i6 = this.LIZIZ;
            int i7 = (i5 + i6) * i2;
            int i8 = this.LJI;
            if (i8 > 0 && i8 > this.LJFF) {
                i6 = 0;
            }
            int i9 = i7 + i6;
            int i10 = i5 + i9;
            RectF rectF = new RectF(i9, ((i3 - i4) / 2) + this.LJ, i10, i4 + r1);
            float f4 = this.LJII;
            int i11 = this.LJI;
            if (i11 > 0 && i11 > (i = this.LJFF) && (i10 <= i || i9 >= i11)) {
                paintLIZ = LIZ();
            } else {
                paintLIZ = this.LJIIIIZZ;
                if (paintLIZ == null) {
                    paintLIZ = null;
                }
            }
            canvas.drawRoundRect(rectF, f4, f4, paintLIZ);
        }
    }

    public final void LIZLLL(int i) {
        this.LJIIJJI = i;
        Paint paint = this.LJIIIIZZ;
        if (paint == null) {
            paint = null;
        }
        paint.setColor(i);
        LIZ().setColor(i);
    }

    public final void LJFF(float[] fArr) {
        if (C15R6.LJ(fArr)) {
            if (fArr != null) {
                this.LJIIJ = Arrays.copyOf(fArr, fArr.length);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public final void LJ(int i, int i2) {
        this.LIZ = i;
        this.LIZLLL = i2 - (this.LJ * 2);
    }
}
