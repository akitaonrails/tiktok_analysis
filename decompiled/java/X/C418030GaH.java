package X;

import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0GaH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418030GaH extends View {
    public float LL;
    public final Paint LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final ValueAnimator LLILZIL;
    public boolean LLILZLL;

    public final void LIZ() {
        if (Looper.myLooper() != null && this.LLILZIL.isRunning()) {
            this.LLILZIL.cancel();
        }
        this.LLILZLL = false;
        this.LL = 0.0f;
        invalidate();
    }

    public final void LIZIZ() {
        if (Looper.myLooper() == null || this.LLILZIL.isRunning()) {
            return;
        }
        this.LLILZIL.start();
        this.LLILZLL = true;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0 && this.LLILZLL) {
            LIZIZ();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Looper.myLooper() == null || !this.LLILZIL.isRunning()) {
            return;
        }
        this.LLILZIL.cancel();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        int i;
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        if (width > height) {
            f = height;
        } else {
            f = width;
        }
        float strokeWidth = f - (this.LLILLJJLI.getStrokeWidth() / 2);
        if (this.LLILZLL) {
            this.LLILLJJLI.setStrokeCap(Paint.Cap.ROUND);
        } else {
            this.LLILLJJLI.setStrokeCap(Paint.Cap.BUTT);
        }
        canvas.save();
        canvas.rotate(this.LL, width, height);
        Paint paint = this.LLILLJJLI;
        if (this.LLILZLL) {
            i = this.LLILLL;
        } else {
            i = this.LLILZ;
        }
        paint.setColor(i);
        float f2 = width - strokeWidth;
        float f3 = height - strokeWidth;
        float f4 = width + strokeWidth;
        float f5 = strokeWidth + height;
        canvas.drawArc(f2, f3, f4, f5, 45.0f, 215.0f, false, this.LLILLJJLI);
        this.LLILLJJLI.setColor(this.LLILZ);
        canvas.drawArc(f2, f3, f4, f5, 260.0f, 145.0f, false, this.LLILLJJLI);
        canvas.restore();
    }

    public final void setGapColor(int i) {
        if (this.LLILZ != i) {
            this.LLILZ = i;
            invalidate();
        }
    }

    public final void setSpinnerColor(int i) {
        if (this.LLILLL != i) {
            this.LLILLL = i;
            invalidate();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0 && this.LLILZLL) {
            LIZIZ();
        } else {
            LIZ();
        }
    }

    public C418030GaH(Context context, AttributeSet attributeSet) {
        float f;
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.LLILLJJLI = paint;
        this.LLILLL = -16777216;
        this.LLILZ = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SearchHintSpinner, 0, 0);
        this.LLILLL = typedArrayObtainStyledAttributes.getColor(R$styleable.SearchHintSpinner_spinner_color, -16777216);
        this.LLILZ = typedArrayObtainStyledAttributes.getColor(R$styleable.SearchHintSpinner_spinner_gapColor, -1);
        typedArrayObtainStyledAttributes.recycle();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(C418040GaI.LIZ(2));
        if (C426750GoL.LJFF()) {
            f = 360.0f;
        } else {
            f = 0.0f;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, C426750GoL.LJFF() ? 0.0f : 360.0f);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(this, 48));
        this.LLILZIL = valueAnimatorOfFloat;
    }
}
