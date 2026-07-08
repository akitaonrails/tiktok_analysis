package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.List;

/* JADX INFO: renamed from: X.0GTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416200GTq extends View {
    public final float LL;
    public int LLILLJJLI;
    public int LLILLL;
    public final float LLILZ;
    public final float LLILZIL;
    public final Paint LLILZLL;
    public SweepGradient LLIZ;
    public final RectF LLIZLLLIL;
    public float LLJ;

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return (int) C12ES.LIZJ(25.0f, getContext());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return (int) C12ES.LIZJ(25.0f, getContext());
    }

    public final void LIZ(float f) {
        this.LLJ = this.LLILZIL * f;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LLIZ == null) {
            SweepGradient sweepGradient = new SweepGradient(0.0f, getMeasuredHeight(), this.LLILLJJLI, this.LLILLL);
            this.LLIZ = sweepGradient;
            this.LLILZLL.setShader(sweepGradient);
        }
        float f = this.LL / 2;
        RectF rectF = this.LLIZLLLIL;
        rectF.left = f;
        rectF.top = f;
        rectF.right = getMeasuredWidth() - f;
        this.LLIZLLLIL.bottom = getMeasuredHeight() - f;
        float f2 = this.LLJ;
        if (f2 <= this.LLILZIL) {
            canvas.drawArc(this.LLIZLLLIL, this.LLILZ, f2, false, this.LLILZLL);
        }
    }

    public final void setProgressForegroundColor(List<String> list) {
        try {
            if (list.size() > 1) {
                this.LLILLJJLI = Color.parseColor(list.get(0));
                this.LLILLL = Color.parseColor(list.get(1));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C416200GTq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZ = -90.0f;
        Paint paint = new Paint(1);
        this.LLILZLL = paint;
        this.LLIZLLLIL = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.ProgressBarTimerView, 0, 0);
        try {
            float dimension = typedArrayObtainStyledAttributes.getDimension(R$styleable.ProgressBarTimerView_progress_width, 0.0f);
            this.LL = dimension;
            this.LLILLJJLI = typedArrayObtainStyledAttributes.getColor(R$styleable.ProgressBarTimerView_progress_foreground_start_color, 0);
            this.LLILLL = typedArrayObtainStyledAttributes.getColor(R$styleable.ProgressBarTimerView_progress_foreground_end_color, 0);
            typedArrayObtainStyledAttributes.getInteger(R$styleable.ProgressBarTimerView_progress_angle, 0);
            typedArrayObtainStyledAttributes.recycle();
            paint.setStrokeWidth(dimension);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            this.LLILZ = -90.0f;
            this.LLILZIL = 360.0f;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int iMin = 0;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    size = 0;
                }
            } else {
                size = getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight();
            }
        } else {
            size = Math.max(getSuggestedMinimumWidth() + getPaddingLeft() + getPaddingRight(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                if (mode2 == 1073741824) {
                    iMin = size2;
                }
            } else {
                iMin = getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom();
            }
        } else {
            iMin = Math.min(getSuggestedMinimumHeight() + getPaddingTop() + getPaddingBottom(), size2);
        }
        setMeasuredDimension(size, iMin);
    }
}
