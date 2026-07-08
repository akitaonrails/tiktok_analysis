package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.15Po, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20515815Po extends View {
    public Paint LL;
    public Paint LLILLJJLI;
    public Paint LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public final RectF LLJILJILJ;

    public void LIZ() {
        setBgPaint(new Paint());
        getBgPaint().setAntiAlias(true);
        getBgPaint().setStyle(Paint.Style.STROKE);
        setProgressPaint(new Paint(getBgPaint()));
        getProgressPaint().setStrokeCap(Paint.Cap.ROUND);
        setBorderPaint(new Paint());
    }

    public final Paint getBgPaint() {
        Paint paint = this.LL;
        if (paint != null) {
            return paint;
        }
        return null;
    }

    public final Paint getBorderPaint() {
        Paint paint = this.LLILLL;
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
        return this.LLJILJIL;
    }

    public final float getCircleRadius() {
        return this.LLJIJIL;
    }

    public final int getHeight$liveui_release() {
        return this.LLILZIL;
    }

    public final boolean getUseCenter() {
        return this.LLJI;
    }

    public final int getWidth$liveui_release() {
        return this.LLILZ;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.LLJIJIL;
        if (f > 0.0f) {
            RectF rectF = this.LLJILJILJ;
            int i = this.LLILZ;
            rectF.set((i / 2) - f, (this.LLILZIL / 2) - f, (i / 2) + f, (i / 2) + f);
        } else {
            RectF rectF2 = this.LLJILJILJ;
            int i2 = this.LLJ;
            rectF2.set(i2, i2, this.LLILZ - i2, this.LLILZIL - i2);
        }
        canvas.drawArc(this.LLJILJILJ, this.LLIZLLLIL - 90, ((this.LLILZLL * 1.0f) / this.LLIZ) * 360, this.LLJI, getProgressPaint());
    }

    public final void setBgCircleColor(int i) {
        getBgPaint().setColor(i);
    }

    public final void setBgCircleWidth(int i) {
        this.LLJ = i / 2;
        getBgPaint().setStrokeWidth(i);
    }

    public final void setBgPaint(Paint paint) {
        this.LL = paint;
    }

    public final void setBorderPaint(Paint paint) {
        this.LLILLL = paint;
    }

    public final void setBorderRadius(float f) {
        this.LLJILJIL = f;
    }

    public void setCircleRadius(int i) {
        this.LLJIJIL = i;
    }

    public final void setCircleWidth(int i) {
        getProgressPaint().setStrokeWidth(i);
    }

    public final void setHeight$liveui_release(int i) {
        this.LLILZIL = i;
    }

    public final void setMaxProgress(int i) {
        this.LLIZ = i;
    }

    public final void setProgress(int i) {
        this.LLILZLL = i;
        invalidate();
    }

    public final void setProgressColor(int i) {
        getProgressPaint().setColor(i);
    }

    public final void setProgressPaint(Paint paint) {
        this.LLILLJJLI = paint;
    }

    public final void setStartAngle(int i) {
        this.LLIZLLLIL = i;
    }

    public void setStrokeWidth(int i) {
        getBorderPaint().setStrokeWidth(i);
    }

    public final void setUseCenter(boolean z) {
        this.LLJI = z;
    }

    public final void setWidth$liveui_release(int i) {
        this.LLILZ = i;
    }

    public final void setCircleRadius(float f) {
        this.LLJIJIL = f;
    }

    public C20515815Po(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZ = 100;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CircleProgressView);
            this.LLJIJIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.CircleProgressView_ts_loading_circle_radius, 0.0f);
            this.LLJILJIL = typedArrayObtainStyledAttributes.getDimension(R$styleable.CircleProgressView_ts_loading_border_radius, 0.0f);
            this.LLILZLL = typedArrayObtainStyledAttributes.getInteger(R$styleable.CircleProgressView_progress, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
        LIZ();
        this.LLJILJILJ = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILZ = View.MeasureSpec.getSize(i);
        this.LLILZIL = View.MeasureSpec.getSize(i2);
    }
}
