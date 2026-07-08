package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FPU, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FPU extends View {
    public final int LL;
    public int LLILLJJLI;
    public final Paint LLILLL;
    public float LLILZ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int height;
        super.onDraw(canvas);
        if (getWidth() < getHeight()) {
            height = getWidth();
        } else {
            height = getHeight();
        }
        float f = height;
        float f2 = 2;
        float width = ((getWidth() - f) / f2) + (this.LLILLL.getStrokeWidth() / f2);
        float height2 = ((getHeight() - f) / f2) + (this.LLILLL.getStrokeWidth() / f2);
        float strokeWidth = (width + f) - this.LLILLL.getStrokeWidth();
        float strokeWidth2 = (f + height2) - this.LLILLL.getStrokeWidth();
        float f3 = (this.LLILZ / 100.0f) * 360.0f;
        this.LLILLL.setColor(this.LL);
        canvas.drawArc(width, height2, strokeWidth, strokeWidth2, -90.0f, 360.0f, false, this.LLILLL);
        this.LLILLL.setColor(this.LLILLJJLI);
        canvas.drawArc(width, height2, strokeWidth, strokeWidth2, -90.0f, f3, false, this.LLILLL);
    }

    public final void setAboveColor(int i) {
        this.LLILLJJLI = i;
    }

    public final void setProgress(float f) {
        if (f < 0.0f) {
            this.LLILZ = 0.0f;
        } else if (f > 100.0f) {
            this.LLILZ = 100.0f;
        } else {
            this.LLILZ = f;
        }
        postInvalidate();
    }

    public C0FPU(Context context, AttributeSet attributeSet) {
        int iIntValue;
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.LLILLL = paint;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxCircularProgress, 0, 0);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a01, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxCircularProgress_tux_circularProgress_aboveColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.LL = iIntValue;
        this.LLILLJJLI = color;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float fLIZIZ;
        super.onSizeChanged(i, i2, i3, i4);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36));
        Paint paint = this.LLILLL;
        if (i > iLIZIZ && i2 > iLIZIZ) {
            fLIZIZ = C418440Gaw.LIZIZ(3);
        } else {
            fLIZIZ = C418440Gaw.LIZIZ(2);
        }
        paint.setStrokeWidth(fLIZIZ);
        invalidate();
    }
}
