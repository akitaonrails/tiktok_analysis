package X;

import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;

/* JADX INFO: renamed from: X.0GZI, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GZI extends TextView {
    public long LL;
    public Paint LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public RectF LLILZIL;
    public ValueAnimator LLILZLL;
    public double LLIZ;

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ValueAnimator valueAnimator = this.LLILZLL;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LLILZLL;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.LLILZLL = null;
        }
    }

    public C0GZI(Context context) {
        super(context);
        int color = ColorProtector.parseColor("#979797");
        this.LL = 0L;
        this.LLILZ = -1;
        this.LLIZ = 1.0d;
        if (this.LLILLL == 0) {
            this.LLILLL = (int) ((getResources().getDisplayMetrics().density * 1.0f) + 0.5f);
        }
        Paint paint = new Paint();
        this.LLILLJJLI = paint;
        paint.setColor(this.LLILZ);
        this.LLILLJJLI.setStyle(Paint.Style.STROKE);
        this.LLILLJJLI.setStrokeWidth(this.LLILLL);
        this.LLILLJJLI.setAntiAlias(true);
        this.LLILLJJLI.setDither(true);
        setTextColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setShape(1);
        setBackground(gradientDrawable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.LLILZIL;
        if (rectF != null) {
            canvas.drawArc(rectF, -90.0f, (float) (this.LLIZ * 360.0d), false, this.LLILLJJLI);
        }
    }

    public void setBorderColor(int i) {
        this.LLILZ = i;
        this.LLILLJJLI.setColor(i);
    }

    public void setBorderSize(int i) {
        int iMax = Math.max(i, 0);
        this.LLILLL = iMax;
        this.LLILLJJLI.setStrokeWidth(iMax);
    }

    public void setDuration(long j) {
        long jMax = Math.max(0L, j);
        this.LL = jMax;
        if (jMax != 0) {
            ValueAnimator duration = ValueAnimator.ofFloat(jMax, 0.0f).setDuration(this.LL);
            this.LLILZLL = duration;
            duration.setInterpolator(new LinearInterpolator());
            this.LLILZLL.addUpdateListener(new AUListenerS256S0100000_6(this, 59));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            float f = this.LLILLL / 2;
            this.LLILZIL = new RectF(f, f, getMeasuredWidth() - (this.LLILLL / 2), getMeasuredHeight() - (this.LLILLL / 2));
        }
    }
}
