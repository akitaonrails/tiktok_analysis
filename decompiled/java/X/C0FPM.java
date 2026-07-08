package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FPM, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FPM extends View {
    public int LL;
    public int LLILLJJLI;
    public Paint LLILLL;
    public final PorterDuffXfermode LLILZ;
    public boolean LLILZIL;
    public long LLILZLL;
    public int LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;

    public final void LIZ() {
        this.LLILZLL = -1L;
        if (this.LLIZ <= 0) {
            setProgressBarInfo(getContext().getResources().getDimensionPixelSize(R.dimen.ais));
        }
        int iMin = Math.min(getMeasuredHeight(), getMeasuredWidth());
        if (this.LLIZ > iMin && iMin > 0) {
            setProgressBarInfo(iMin);
        }
        if (this.LLILLL == null) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setDither(true);
            paint.setStyle(Paint.Style.FILL);
            this.LLILLL = paint;
        }
        this.LLILZIL = true;
        postInvalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            LIZ();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLILZIL = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        super.onDraw(canvas);
        if (!this.LLILZIL) {
            return;
        }
        long jNanoTime = System.nanoTime() / 1000000;
        if (this.LLILZLL < 0) {
            this.LLILZLL = jNanoTime;
        }
        float f3 = (jNanoTime - this.LLILZLL) / 400.0f;
        int i3 = (int) f3;
        boolean z = true;
        if ((i3 & 1) != 1) {
            z = false;
        }
        float f4 = f3 - i3;
        if (f4 < 0.5d) {
            f = f4 * 2.0f * f4;
        } else {
            f = ((f4 * 2.0f) * (2.0f - f4)) - 1.0f;
        }
        int i4 = this.LLIZ;
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, i4, i4, this.LLILLL, 31);
        float f5 = (this.LLJIJIL * f) + this.LLJI;
        if (f < 0.5d) {
            f2 = f * 2.0f;
        } else {
            f2 = 2.0f - (f * 2.0f);
        }
        float f6 = this.LLJ;
        float f7 = (0.25f * f2 * f6) + f6;
        Paint paint = this.LLILLL;
        if (z) {
            i = this.LLILLJJLI;
        } else {
            i = this.LL;
        }
        paint.setColor(i);
        canvas.drawCircle(f5, this.LLIZLLLIL, f7, this.LLILLL);
        float f8 = this.LLIZ - f5;
        float f9 = this.LLJ;
        float f10 = f9 - ((f2 * 0.375f) * f9);
        Paint paint2 = this.LLILLL;
        if (z) {
            i2 = this.LL;
        } else {
            i2 = this.LLILLJJLI;
        }
        paint2.setColor(i2);
        this.LLILLL.setXfermode(this.LLILZ);
        canvas.drawCircle(f8, this.LLIZLLLIL, f10, this.LLILLL);
        this.LLILLL.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
        postInvalidateDelayed(17L);
    }

    public void setProgressBarInfo(int i) {
        if (i > 0) {
            this.LLIZ = i;
            this.LLIZLLLIL = i / 2.0f;
            float f = (i >> 1) * 0.32f;
            this.LLJ = f;
            float f2 = (i * 0.16f) + f;
            this.LLJI = f2;
            this.LLJIJIL = i - (f2 * 2.0f);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            LIZ();
        } else {
            this.LLILZIL = false;
        }
    }

    public C0FPM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = new PorterDuffXfermode(PorterDuff.Mode.DARKEN);
        this.LLILZIL = false;
        this.LLILZLL = -1L;
        this.LLIZ = -1;
        this.LL = C446980Hfs.LIZ(context, R.color.xg);
        this.LLILLJJLI = C446980Hfs.LIZ(context, R.color.xh);
        this.LL = C446980Hfs.LIZ(context, R.color.xg);
        this.LLILLJJLI = C446980Hfs.LIZ(context, R.color.xh);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMin = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.LLIZ > iMin && iMin > 0) {
            setProgressBarInfo(iMin);
        }
    }
}
