package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15Ra, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20519615Ra extends View {
    public final float LL;
    public final float LLILLJJLI;
    public final Bitmap LLILLL;
    public final float LLILZ;
    public final float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public final Paint LLJ;
    public final int LLJI;
    public boolean LLJIJIL;

    public final float getProgress() {
        return this.LLIZLLLIL;
    }

    public final float getSeekBarTotalLength() {
        return this.LL;
    }

    public C20519615Ra(Context context) {
        super(context, null, 0);
        this.LL = C20519715Rb.LIZ(120.0f, context);
        float fLIZ = C20519715Rb.LIZ(1.5f, context);
        this.LLILLJJLI = C20519715Rb.LIZ(16.0f, context);
        this.LLILLL = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.byw);
        this.LLILZ = C20519715Rb.LIZ(11.5f, context);
        this.LLILZIL = C20519715Rb.LIZ(8.5f, context);
        this.LLIZLLLIL = 0.5f;
        Paint paint = new Paint();
        this.LLJ = paint;
        this.LLJI = 10;
        paint.setColor(-1);
        paint.setStrokeWidth(fLIZ);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setAntiAlias(true);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.LLIZ;
        float f2 = this.LLIZLLLIL;
        float f3 = this.LL;
        float f4 = this.LLILLJJLI;
        double d = ((double) f) + ((0.5d - ((double) f2)) * ((double) (f3 - (2 * f4))));
        float f5 = this.LLILZIL;
        float f6 = f5 + ((this.LLILZ - f5) * f2);
        if (this.LLJIJIL) {
            float f7 = (float) d;
            double d2 = ((double) f) - (((double) f3) * 0.5d);
            float f8 = f7 - f4;
            if (f8 > d2) {
                float f9 = this.LLILZLL;
                canvas.drawLine(f9, f8, f9, (float) d2, this.LLJ);
            }
            double d3 = ((double) this.LLIZ) + (((double) this.LL) * 0.5d);
            float f10 = f7 + this.LLILLJJLI;
            if (d3 > f10) {
                float f11 = this.LLILZLL;
                canvas.drawLine(f11, (float) d3, f11, f10, this.LLJ);
            }
        }
        float f12 = this.LLILZLL;
        double d4 = f6;
        canvas.drawBitmap(this.LLILLL, new Rect(0, 0, this.LLILLL.getWidth(), this.LLILLL.getHeight()), new Rect((int) (f12 - f6), (int) (d - d4), (int) (f12 + f6), (int) (d + d4)), this.LLJ);
    }

    public final void setProgress(float f) {
        float f2 = this.LLIZLLLIL + ((f / this.LLJI) / this.LL);
        if (f2 > 1.0f) {
            this.LLIZLLLIL = 1.0f;
        } else if (f2 < 0.0f) {
            this.LLIZLLLIL = 0.0f;
        } else {
            this.LLIZLLLIL = f2;
        }
        this.LLJIJIL = true;
        invalidate();
    }
}
