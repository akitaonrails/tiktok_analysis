package X;

import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.12EU, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12EU extends View {
    public final float LL;
    public final float LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public int LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public final Paint LLJ;
    public final Paint LLJI;
    public final List<C1869530ykZ> LLJIJIL;
    public ValueAnimator LLJILJIL;

    public final void LIZ() {
        float f;
        float f2;
        float f3 = (-this.LLIZ) * (this.LL + this.LLILLJJLI);
        ValueAnimator valueAnimator = this.LLJILJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.LLIZLLLIL, f3);
        valueAnimatorOfFloat.setDuration(150L);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 24));
        valueAnimatorOfFloat.start();
        this.LLJILJIL = valueAnimatorOfFloat;
        int i = 0;
        for (C1869530ykZ c1869530ykZ : this.LLJIJIL) {
            int i2 = i + 1;
            float f4 = i;
            c1869530ykZ.LIZJ = Math.abs(f4 - this.LLILZLL) < 0.5f ? this.LLILZ : this.LLILLL;
            float f5 = this.LLIZ;
            float f6 = f4 - f5;
            float f7 = 1.0f;
            if (f6 < 1.0f) {
                if (f5 > 0.01f) {
                    if (f6 >= 0.0f) {
                        f = (1.0f - f6) * 0.6666667f;
                        f2 = 1.0f * f6;
                        f7 = f2 + f;
                    }
                    f7 = 0.6666667f;
                }
            } else if (f6 > 5.0f && f5 < (this.LLILZIL - 7) - 0.01f) {
                float f8 = f6 - 5;
                if (f8 <= 1.0f) {
                    f = 1.0f * (1.0f - f8);
                    f2 = f8 * 0.6666667f;
                    f7 = f2 + f;
                }
                f7 = 0.6666667f;
            }
            c1869530ykZ.LIZIZ = f7;
            c1869530ykZ.LIZLLL = f6 >= -0.5f && f6 <= 6.5f;
            i = i2;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLJILJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        super.onDraw(canvas);
        if (this.LLILZIL > 0 && !((ArrayList) this.LLJIJIL).isEmpty()) {
            canvas.save();
            canvas.translate(this.LLIZLLLIL, 0.0f);
            for (C1869530ykZ c1869530ykZ : (ArrayList) this.LLJIJIL) {
                int i = c1869530ykZ.LIZJ;
                if (i == this.LLILZ) {
                    paint = this.LLJI;
                } else {
                    paint = this.LLJ;
                }
                paint.setColor(i);
                float f = (this.LL * c1869530ykZ.LIZIZ) / 2;
                canvas.drawRoundRect(c1869530ykZ.LIZ - f, (getHeight() / 2.0f) - f, c1869530ykZ.LIZ + f, (getHeight() / 2.0f) + f, f, f, paint);
            }
            canvas.restore();
        }
    }

    public C12EU(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        this.LL = getResources().getDisplayMetrics().density * 6.0f;
        this.LLILLJJLI = getResources().getDisplayMetrics().density * 6.0f;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a01, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLILLL = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ce, context);
        int iIntValue2 = numLIZJ2 != null ? numLIZJ2.intValue() : 0;
        this.LLILZ = iIntValue2;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.LLJ = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        this.LLJI = paint2;
        this.LLJIJIL = new ArrayList();
        paint.setColor(iIntValue);
        paint2.setColor(iIntValue2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iMin = (int) ((Math.min(this.LLILZIL, 7) * this.LL) + (Math.max(0, r1 - 1) * this.LLILLJJLI));
        int iMin2 = (int) this.LL;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                iMin = View.MeasureSpec.getSize(i);
            }
        } else {
            iMin = Math.min(View.MeasureSpec.getSize(i), iMin);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 1073741824) {
                iMin2 = View.MeasureSpec.getSize(i2);
            }
        } else {
            iMin2 = Math.min(View.MeasureSpec.getSize(i2), iMin2);
        }
        setMeasuredDimension(iMin, iMin2);
    }
}
