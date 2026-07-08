package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Gb9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418570Gb9 extends View {
    public final float LL;
    public final float LLILLJJLI;
    public final float LLILLL;
    public final float LLILZ;
    public final float LLILZIL;
    public final long LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public Paint LLJ;
    public final PorterDuffXfermode LLJI;
    public float LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJ;
    public long LLJJI;
    public int LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;
    public float LLJJJ;

    public final void LIZ() {
        this.LLJJI = -1L;
        if (this.LLJJIII <= 0) {
            setProgressBarInfo(getContext().getResources().getDimensionPixelSize(R.dimen.a3z));
        }
        int iMin = Math.min(getMeasuredHeight(), getMeasuredWidth());
        if (this.LLJJIII > iMin && iMin > 0) {
            setProgressBarInfo(iMin);
        }
        if (this.LLJ == null) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setDither(true);
            paint.setStyle(Paint.Style.FILL);
            this.LLJ = paint;
        }
        this.LLJILJILJ = true;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LLJJ = false;
        this.LLJILJILJ = false;
        this.LLJIJIL = 0.0f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        super.onDraw(canvas);
        if ((this.LLJJ || !this.LLJILJIL) && this.LLJILJILJ) {
            boolean z = false;
            if (this.LLJILJIL) {
                long jNanoTime = System.nanoTime() / ((long) 1000000);
                if (this.LLJJI < 0) {
                    this.LLJJI = jNanoTime;
                }
                float f3 = (jNanoTime - this.LLJJI) / this.LLILZIL;
                this.LLJIJIL = f3;
                int i3 = (int) f3;
                if (((this.LLJILLL + i3) & 1) == 1) {
                    z = true;
                }
                this.LLJIJIL = f3 - i3;
            }
            float f4 = this.LLJIJIL;
            if (f4 < 0.5d) {
                f = 2 * f4 * f4;
            } else {
                float f5 = 2;
                f = ((f5 * f4) * (f5 - f4)) - 1;
            }
            int i4 = this.LLJJIII;
            int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, i4, i4, this.LLJ, 31);
            float f6 = (this.LLJJJ * f) + this.LLJJIJIL;
            if (f < 0.5d) {
                f2 = f * 2.0f;
            } else {
                float f7 = 2;
                f2 = f7 - (f * f7);
            }
            float f8 = this.LL * f2;
            float f9 = this.LLJJIJIIJIL;
            float f10 = (f8 * f9) + f9;
            Paint paint = this.LLJ;
            if (z) {
                i = this.LLIZLLLIL;
            } else {
                i = this.LLIZ;
            }
            paint.setColor(i);
            canvas.drawCircle(f6, this.LLJJIJI, f10, this.LLJ);
            float f11 = this.LLJJIII - f6;
            float f12 = this.LLJJIJIIJIL;
            float f13 = f12 - ((f2 * this.LLILLJJLI) * f12);
            Paint paint2 = this.LLJ;
            if (z) {
                i2 = this.LLIZ;
            } else {
                i2 = this.LLIZLLLIL;
            }
            paint2.setColor(i2);
            this.LLJ.setXfermode(this.LLJI);
            canvas.drawCircle(f11, this.LLJJIJI, f13, this.LLJ);
            this.LLJ.setXfermode(null);
            canvas.restoreToCount(iSaveLayer);
            postInvalidateDelayed(this.LLILZLL);
        }
    }

    public final void setCycleBias(int i) {
        this.LLJILLL = i;
    }

    public final void setProgress(float f) {
        if (!this.LLJILJILJ) {
            LIZ();
        }
        this.LLJIJIL = f;
        this.LLJJ = false;
        this.LLJILJIL = false;
        postInvalidate();
    }

    public final void setProgressBarInfo(int i) {
        if (i > 0) {
            this.LLJJIII = i;
            this.LLJJIJI = i / 2.0f;
            float f = (i >> 1) * this.LLILZ;
            this.LLJJIJIIJIL = f;
            float f2 = (this.LLILLL * i) + f;
            this.LLJJIJIL = f2;
            this.LLJJJ = i - (f2 * 2);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            LIZ();
            this.LLJJ = true;
            this.LLJILJIL = true;
            postInvalidate();
            return;
        }
        this.LLJJ = false;
        this.LLJILJILJ = false;
        this.LLJIJIL = 0.0f;
    }

    public C418570Gb9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = 0.25f;
        this.LLILLJJLI = 0.375f;
        this.LLILLL = 0.16f;
        this.LLILZ = 0.32f;
        this.LLILZIL = 400.0f;
        this.LLILZLL = 17L;
        this.LLJI = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        this.LLJJI = -1L;
        this.LLJJIII = -1;
        this.LLIZ = C446980Hfs.LIZ(context, R.color.nj);
        this.LLIZLLLIL = C446980Hfs.LIZ(context, R.color.nk);
        this.LLIZ = C446980Hfs.LIZ(context, R.color.nj);
        this.LLIZLLLIL = C446980Hfs.LIZ(context, R.color.nk);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMin = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.LLJJIII > iMin && iMin > 0) {
            setProgressBarInfo(iMin);
        }
    }
}
