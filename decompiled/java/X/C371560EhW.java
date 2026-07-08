package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0EhW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371560EhW extends View {
    public int LL;
    public int LLILLJJLI;
    public final float LLILLL;
    public final float LLILZ;
    public final Paint LLILZIL;

    public final int getBorderColor() {
        return this.LLILLJJLI;
    }

    public final int getCircleColor() {
        return this.LL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.LLILZIL.setStyle(Paint.Style.FILL);
        this.LLILZIL.setColor(this.LL);
        float f = 2;
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.LLILLL / f, this.LLILZIL);
        this.LLILZIL.setStyle(Paint.Style.STROKE);
        this.LLILZIL.setColor(this.LLILLJJLI);
        this.LLILZIL.setStrokeWidth(this.LLILZ);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, (this.LLILLL / f) - (this.LLILZ / f), this.LLILZIL);
    }

    public final void setBorderColor(int i) {
        this.LLILLJJLI = i;
    }

    public final void setCircleColor(int i) {
        this.LL = i;
    }

    public C371560EhW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = C11VU.LIZIZ(8.0f, context);
        this.LLILZ = C11VU.LIZIZ(0.5f, context);
        this.LLILZIL = new Paint(1);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f = this.LLILLL;
        float f2 = this.LLILZ;
        int iMin = (int) (f + f2);
        int iMin2 = (int) (f + f2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                iMin = size;
            }
        } else {
            iMin = Math.min(iMin, size);
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 1073741824) {
                iMin2 = size2;
            }
        } else {
            iMin2 = Math.min(iMin2, size2);
        }
        setMeasuredDimension(iMin, iMin2);
    }
}
