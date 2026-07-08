package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0GTD, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GTD extends View {
    public final boolean LL;
    public boolean LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final int LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public final C01GW LLJI;

    private final Paint getStatusPaint() {
        return (Paint) this.LLJI.getValue();
    }

    public final int getActiveStatusColor() {
        return this.LLILZIL;
    }

    public final boolean getDrawStroke() {
        return this.LLILLJJLI;
    }

    public final int getInactiveStatusColor() {
        return this.LLILZLL;
    }

    public final int getStrokeColor() {
        return this.LLILZ;
    }

    public final int getStrokeWidth() {
        return this.LLILLL;
    }

    public C0GTD(Context context) {
        super(context, null, 0);
        this.LL = true;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context);
        this.LLIZ = numLIZJ != null ? numLIZJ.intValue() : 0;
        this.LLJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1628));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        super.onDraw(canvas);
        int i3 = this.LLIZLLLIL;
        float f = i3 * 0.5f;
        float f2 = i3 * 0.5f;
        if (this.LLILLJJLI) {
            getStatusPaint().setColor(this.LLIZ);
            canvas.drawCircle(f, f2, f, getStatusPaint());
            if (this.LLILZ != this.LLIZ) {
                getStatusPaint().setColor(this.LLILZ);
                canvas.drawCircle(f, f2, f, getStatusPaint());
            }
            Paint statusPaint = getStatusPaint();
            if (this.LLJ) {
                i2 = this.LLILZIL;
            } else {
                i2 = this.LLILZLL;
            }
            statusPaint.setColor(i2);
            canvas.drawCircle(f, f2, f - this.LLILLL, getStatusPaint());
            return;
        }
        Paint statusPaint2 = getStatusPaint();
        if (this.LLJ) {
            i = this.LLILZIL;
        } else {
            i = this.LLILZLL;
        }
        statusPaint2.setColor(i);
        canvas.drawCircle(f, f2, f, getStatusPaint());
    }

    public final void setActive(boolean z) {
        this.LLJ = z;
        invalidate();
    }

    public final void setActiveStatusColor(int i) {
        if (i == this.LLILZIL) {
            return;
        }
        this.LLILZIL = i;
        invalidate();
    }

    public final void setDrawStroke(boolean z) {
        if (z == this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = z;
        invalidate();
    }

    public final void setInactiveStatusColor(int i) {
        if (i == this.LLILZLL) {
            return;
        }
        this.LLILZLL = i;
        invalidate();
    }

    public final void setStrokeColor(int i) {
        if (i == this.LLILZ) {
            return;
        }
        this.LLILZ = i;
        invalidate();
    }

    public final void setStrokeWidth(int i) {
        if (i == this.LLILLL) {
            return;
        }
        this.LLILLL = i;
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.LL) {
            super.onMeasure(i, i2);
            return;
        }
        int i3 = this.LLILLL * 2;
        setMeasuredDimension(View.MeasureSpec.getSize(i) + i3, View.MeasureSpec.getSize(i2) + i3);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLIZLLLIL = i;
    }
}
