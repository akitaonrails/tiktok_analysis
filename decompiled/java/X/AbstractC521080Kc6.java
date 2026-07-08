package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Kc6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC521080Kc6 {
    public final Context LIZ;
    public int LIZJ;
    public Runnable LJ;
    public boolean LJFF;
    public int LIZIZ = -1;
    public int LIZLLL = 11;

    public abstract void LIZLLL(Canvas canvas, Paint paint);

    public abstract int LJ(Paint paint);

    public AbstractC521080Kc6(Context context) {
        this.LIZ = context;
        this.LIZJ = context.getResources().getDimensionPixelSize(R.dimen.f617avg);
    }

    public final int LIZIZ(Paint paint) {
        if (this.LIZIZ < 0) {
            this.LIZIZ = LJ(paint);
        }
        return this.LIZIZ;
    }

    public final void LIZ(Canvas canvas, Paint paint) {
        LIZLLL(canvas, paint);
        if (!this.LJFF) {
            this.LJFF = true;
            Runnable runnable = this.LJ;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public int LIZJ(Paint paint, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i2 = this.LIZJ / 2;
            int i3 = i / 4;
            int i4 = i2 - i3;
            int i5 = -(i2 + i3);
            fontMetricsInt.ascent = i5;
            fontMetricsInt.top = i5;
            fontMetricsInt.bottom = i4;
            fontMetricsInt.descent = i4;
        }
        if (this.LIZIZ < 0) {
            this.LIZIZ = LJ(paint);
        }
        return this.LIZIZ;
    }
}
