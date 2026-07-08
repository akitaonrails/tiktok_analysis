package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: X.0FNY, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FNY extends View {
    public Paint LL;
    public Paint LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final int[] LLILZLL;
    public final float[] LLIZ;
    public SweepGradient LLIZLLLIL;

    public final void setNewStyle(boolean z) {
    }

    public final void setSelect(boolean z) {
    }

    public final int getColor() {
        return this.LLILZIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        if (this.LLIZLLLIL == null) {
            float f = width;
            this.LLIZLLLIL = new SweepGradient(f, f, this.LLILZLL, this.LLIZ);
        }
        Paint paint = this.LLILLJJLI;
        if (paint != null) {
            paint.setShader(this.LLIZLLLIL);
        }
        Paint paint2 = this.LLILLJJLI;
        if (paint2 != null) {
            paint2.setAlpha(255);
        }
        Paint paint3 = this.LLILLJJLI;
        if (paint3 != null) {
            paint3.setStrokeWidth(this.LLILZ);
        }
        Paint paint4 = this.LLILLJJLI;
        if (paint4 != null) {
            float f2 = width;
            canvas.drawCircle(f2, f2, width - (this.LLILLL * 2), paint4);
        }
        Paint paint5 = this.LL;
        if (paint5 != null) {
            float f3 = width;
            canvas.drawCircle(f3, f3, ((width - this.LLILZ) - (this.LLILLL * 2)) - C339190DRl.LIZ(1), paint5);
        }
    }

    public C0FNY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float fLIZ = C339190DRl.LIZ(3);
        this.LLILLL = 6;
        this.LLILZ = 6;
        this.LLILZIL = -1;
        this.LLILZLL = new int[]{C191000oO.LIZ("#FF0000"), C191000oO.LIZ("#D11865"), C191000oO.LIZ("#1A75B7"), C191000oO.LIZ("#0EB934"), C191000oO.LIZ("#FFE600"), C191000oO.LIZ("#FF0000")};
        this.LLIZ = new float[]{-0.16f, 0.0f, 0.166f, 0.33f, 0.5f, 0.66f};
        this.LLILLL = (int) C11VU.LIZ(1.0f);
        this.LLILZ = (int) C11VU.LIZ(3.0f);
        Paint paint = new Paint();
        this.LLILLJJLI = paint;
        paint.setAntiAlias(true);
        Paint paint2 = this.LLILLJJLI;
        if (paint2 != null) {
            paint2.setStyle(Paint.Style.STROKE);
        }
        Paint paint3 = this.LLILLJJLI;
        if (paint3 != null) {
            paint3.setStrokeWidth(fLIZ);
        }
        Paint paint4 = new Paint();
        this.LL = paint4;
        paint4.setColor(this.LLILZIL);
        Paint paint5 = this.LL;
        if (paint5 != null) {
            paint5.setAntiAlias(true);
        }
        Paint paint6 = this.LL;
        if (paint6 != null) {
            paint6.setStyle(Paint.Style.FILL);
        }
        Paint paint7 = this.LL;
        if (paint7 != null) {
            paint7.setStrokeWidth(fLIZ);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.getDefaultSize(getSuggestedMinimumWidth(), i), View.getDefaultSize(getSuggestedMinimumHeight(), i2));
    }
}
