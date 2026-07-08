package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Eac, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367280Eac extends View {
    public Paint LL;
    public Paint LLILLJJLI;
    public Paint LLILLL;
    public final float LLILZ;
    public final float LLILZIL;
    public final float LLILZLL;
    public RectF LLIZ;
    public int LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.LLIZ == null) {
            RectF rectF = new RectF();
            this.LLIZ = rectF;
            int i = (int) (this.LLILZLL * 2);
            rectF.set((this.LLJIJIL - i) / 2, (this.LLJILJIL - i) / 2, r2 + i, i + r1);
        }
        canvas.drawArc(this.LLIZ, -90.0f, 360.0f, false, this.LLILLJJLI);
        canvas.drawArc(this.LLIZ, -90.0f, (this.LLIZLLLIL / this.LLJI) * 360, false, this.LL);
        if (this.LLIZLLLIL < this.LLJ) {
            invalidate();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append('%');
        canvas.drawText(C2188811AlT.LIZIZ(sbLIZ), this.LLJIJIL / 2, (this.LLJILJIL / 2) + this.LLILZIL, this.LLILLL);
    }

    public C367280Eac(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILZ = 10.0f;
        this.LLILZIL = 10.0f / 2;
        this.LLILZLL = 60.0f;
        this.LLJ = 100;
        this.LLJI = 100;
        Paint paint = new Paint();
        this.LL = paint;
        paint.setColor(-1);
        Paint paint2 = this.LL;
        if (paint2 != null) {
            paint2.setAntiAlias(true);
        }
        Paint paint3 = this.LL;
        if (paint3 != null) {
            paint3.setStyle(Paint.Style.STROKE);
        }
        Paint paint4 = this.LL;
        if (paint4 != null) {
            paint4.setStrokeWidth(10.0f);
        }
        Paint paint5 = new Paint();
        this.LLILLJJLI = paint5;
        paint5.setColor(getResources().getColor(R.color.a2i));
        Paint paint6 = this.LLILLJJLI;
        if (paint6 != null) {
            paint6.setAntiAlias(true);
        }
        Paint paint7 = this.LLILLJJLI;
        if (paint7 != null) {
            paint7.setStyle(Paint.Style.STROKE);
        }
        Paint paint8 = this.LLILLJJLI;
        if (paint8 != null) {
            paint8.setStrokeWidth(10.0f);
        }
        Paint paint9 = new Paint();
        this.LLILLL = paint9;
        paint9.setColor(-1);
        Paint paint10 = this.LLILLL;
        if (paint10 != null) {
            paint10.setAntiAlias(true);
        }
        Paint paint11 = this.LLILLL;
        if (paint11 != null) {
            paint11.setTextSize(30.0f);
        }
        Paint paint12 = this.LLILLL;
        if (paint12 != null) {
            paint12.setTextAlign(Paint.Align.CENTER);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            size = (int) ((this.LLILZLL * 2) + this.LLILZ);
        }
        this.LLJIJIL = size;
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            size2 = (int) ((this.LLILZLL * 2) + this.LLILZ);
        }
        this.LLJILJIL = size2;
        setMeasuredDimension(this.LLJIJIL, size2);
    }
}
