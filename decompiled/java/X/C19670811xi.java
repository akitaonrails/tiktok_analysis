package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.11xi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19670811xi extends View {
    public Paint LL;
    public Paint LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public final RectF LLJILJIL;

    public void LIZ() {
        setBgPaint(new Paint());
        getBgPaint().setAntiAlias(true);
        getBgPaint().setStyle(Paint.Style.STROKE);
        setProgressPaint(new Paint(getBgPaint()));
        getProgressPaint().setStrokeCap(Paint.Cap.ROUND);
    }

    public final Paint getBgPaint() {
        Paint paint = this.LL;
        if (paint != null) {
            return paint;
        }
        return null;
    }

    public final Paint getProgressPaint() {
        Paint paint = this.LLILLJJLI;
        if (paint != null) {
            return paint;
        }
        return null;
    }

    public final float getBorderRadius() {
        return this.LLJI;
    }

    public final float getCircularRadius() {
        return this.LLJ;
    }

    public final int getHeight$lib_runtime_release() {
        return this.LLILZ;
    }

    public final float getSweepAngle() {
        return this.LLJIJIL;
    }

    public final boolean getUseCenter() {
        return this.LLIZLLLIL;
    }

    public final int getWidth$lib_runtime_release() {
        return this.LLILLL;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.LLJ;
        if (f > 0.0f) {
            RectF rectF = this.LLJILJIL;
            int i = this.LLILLL;
            rectF.set((i / 2) - f, (this.LLILZ / 2) - f, (i / 2) + f, (i / 2) + f);
        } else {
            RectF rectF2 = this.LLJILJIL;
            int i2 = this.LLIZ;
            rectF2.set(i2, i2, this.LLILLL - i2, this.LLILZ - i2);
        }
        canvas.drawArc(this.LLJILJIL, this.LLILZLL - 90, this.LLJIJIL, this.LLIZLLLIL, getProgressPaint());
    }

    public final void setBgCircleColor(int i) {
        getBgPaint().setColor(i);
    }

    public final void setBgCircleWidth(int i) {
        this.LLIZ = i / 2;
        getBgPaint().setStrokeWidth(i);
    }

    public final void setBgPaint(Paint paint) {
        this.LL = paint;
    }

    public final void setBorderRadius(float f) {
        this.LLJI = f;
    }

    public void setCircleRadius(float f) {
        this.LLJ = f;
    }

    public final void setCircleWidth(int i) {
        getProgressPaint().setStrokeWidth(i);
    }

    public final void setCircularRadius(float f) {
        this.LLJ = f;
    }

    public final void setHeight$lib_runtime_release(int i) {
        this.LLILZ = i;
    }

    public final void setMaxProgress(int i) {
        this.LLILZIL = i;
    }

    public final void setProgress(int i) {
        this.LLJIJIL = ((i * 1.0f) / this.LLILZIL) * 360;
        invalidate();
    }

    public final void setProgressColor(int i) {
        getProgressPaint().setColor(i);
    }

    public final void setProgressIfCircle(float f) {
        this.LLJIJIL = (((((int) f) * 1.0f) / this.LLILZIL) - 1) * 360;
        invalidate();
    }

    public final void setProgressPaint(Paint paint) {
        this.LLILLJJLI = paint;
    }

    public final void setStartAngle(int i) {
        this.LLILZLL = i;
    }

    public final void setSweepAngle(float f) {
        this.LLJIJIL = f;
    }

    public final void setUseCenter(boolean z) {
        this.LLIZLLLIL = z;
    }

    public final void setUseCenterIfNeed(boolean z) {
        this.LLIZLLLIL = z;
        if (z && getProgressPaint() != null) {
            getProgressPaint().setStyle(Paint.Style.FILL);
        }
    }

    public final void setViewBorderRadius(float f) {
        this.LLJI = f;
    }

    public final void setWidth$lib_runtime_release(int i) {
        this.LLILLL = i;
    }

    public C19670811xi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZIL = 100;
        this.LLJILJIL = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ToolsStyleView);
            this.LLJ = typedArrayObtainStyledAttributes.getDimension(R$styleable.ToolsStyleView_ts_loading_circle_radius, 0.0f);
            this.LLJI = typedArrayObtainStyledAttributes.getDimension(R$styleable.ToolsStyleView_ts_loading_border_radius, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        LIZ();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILLL = View.MeasureSpec.getSize(i);
        this.LLILZ = View.MeasureSpec.getSize(i2);
    }
}
