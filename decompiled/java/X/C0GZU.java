package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.0GZU, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GZU extends AppCompatImageView {
    public int LL;
    public int LLILLJJLI;
    public final Paint LLILLL;
    public final float LLILZ;
    public float LLILZIL;
    public RectF LLILZLL;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public C0GZU(Context context) {
        super(context);
        this.LL = 0;
        this.LLILLJJLI = 0;
        Paint paint = new Paint();
        this.LLILLL = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        float f = 2;
        this.LLILZIL = C12ES.LIZJ(f, getContext());
        float fLIZJ = C12ES.LIZJ(f, getContext());
        this.LLILZ = fLIZJ;
        paint.setStrokeWidth(fLIZJ);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            RectF rectF = this.LLILZLL;
            if (rectF != null) {
                float f = this.LLILZIL;
                canvas.drawRoundRect(rectF, f, f, this.LLILLL);
            }
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setColor(int i) {
        this.LLILLL.setColor(i);
    }

    public final void setStrokeWidth(int i) {
        this.LLILLL.setStrokeWidth(i);
    }

    public final void setXYRadius(float f) {
        this.LLILZIL = f;
    }

    public final void LIZ(int i, int i2) {
        this.LL = i;
        this.LLILLJJLI = i2;
        float f = this.LLILZ;
        float f2 = 2;
        this.LLILZLL = new RectF(f / f2, f / f2, i - (f / f2), i2 - (f / f2));
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(this.LL, this.LLILLJJLI);
    }
}
