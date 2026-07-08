package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0EUy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365580EUy extends View {
    public Paint LL;
    public Paint LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public final float LLJ;
    public final RectF LLJI;

    public final int getHeight$editor_uibase_release() {
        return this.LLILZ;
    }

    public final int getWidth$editor_uibase_release() {
        return this.LLILLL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = this.LLJ;
        if (f > 0.0f) {
            RectF rectF = this.LLJI;
            int i = this.LLILLL;
            rectF.set((i / 2) - f, (this.LLILZ / 2) - f, (i / 2) + f, (i / 2) + f);
        } else {
            RectF rectF2 = this.LLJI;
            int i2 = this.LLIZLLLIL;
            rectF2.set(i2, i2, this.LLILLL - i2, this.LLILZ - i2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDraw::rectF=");
        sbLIZ.append(this.LLJI);
        C355090Dw3.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        RectF rectF3 = this.LLJI;
        float f2 = this.LLIZ - 90;
        float f3 = ((this.LLILZIL * 1.0f) / this.LLILZLL) * 360;
        Paint paint = this.LLILLJJLI;
        if (paint == null) {
            paint = null;
        }
        canvas.drawArc(rectF3, f2, f3, false, paint);
    }

    public final void setBgCircleColor(int i) {
        Paint paint = this.LL;
        if (paint == null) {
            paint = null;
        }
        paint.setColor(i);
    }

    public final void setBgCircleWidth(int i) {
        this.LLIZLLLIL = i / 2;
        Paint paint = this.LL;
        if (paint == null) {
            paint = null;
        }
        paint.setStrokeWidth(i);
    }

    public final void setCircleWidth(int i) {
        Paint paint = this.LLILLJJLI;
        if (paint == null) {
            paint = null;
        }
        paint.setStrokeWidth(i);
    }

    public final void setHeight$editor_uibase_release(int i) {
        this.LLILZ = i;
    }

    public final void setMaxProgress(int i) {
        this.LLILZLL = i;
    }

    public final void setProgress(int i) {
        this.LLILZIL = i;
        invalidate();
    }

    public final void setProgressColor(int i) {
        Paint paint = this.LLILLJJLI;
        if (paint == null) {
            paint = null;
        }
        paint.setColor(i);
    }

    public final void setStartAngle(int i) {
        this.LLIZ = i;
    }

    public final void setWidth$editor_uibase_release(int i) {
        this.LLILLL = i;
    }

    public C365580EUy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZLL = 100;
        Paint paint = new Paint();
        this.LL = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.LL;
        (paint2 == null ? null : paint2).setStyle(Paint.Style.STROKE);
        Paint paint3 = this.LL;
        Paint paint4 = new Paint(paint3 != null ? paint3 : null);
        this.LLILLJJLI = paint4;
        paint4.setStrokeCap(Paint.Cap.ROUND);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVECircleProgressView);
            this.LLJ = typedArrayObtainStyledAttributes.getDimension(R$styleable.AVECircleProgressView_ts_loading_circle_radius, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
        this.LLJI = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILLL = View.MeasureSpec.getSize(i);
        this.LLILZ = View.MeasureSpec.getSize(i2);
    }
}
