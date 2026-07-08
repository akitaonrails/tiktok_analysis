package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GRh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C415590GRh extends View {
    public final Paint LL;
    public final Paint LLILLJJLI;
    public final Paint LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public final RectF LLJI;
    public final RectF LLJIJIL;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.LLJI, 0.0f, 360.0f, false, this.LL);
        float f = this.LLILZLL;
        if (f > 0.0f) {
            canvas.drawArc(this.LLJI, -90.0f, f * 360.0f, false, this.LLILLJJLI);
        }
        RectF rectF = this.LLJIJIL;
        float f2 = this.LLJ;
        canvas.drawRoundRect(rectF, f2, f2, this.LLILLL);
    }

    public final void setProgress(float f) {
        this.LLILZLL = f;
        invalidate();
    }

    public C415590GRh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJI = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.LLJIJIL = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.LL = paint;
        Paint paint2 = new Paint();
        this.LLILLJJLI = paint2;
        Paint paint3 = new Paint();
        this.LLILLL = paint3;
        this.LLIZ = C418440Gaw.LIZIZ(3);
        this.LLIZLLLIL = C418440Gaw.LIZIZ(12);
        this.LLJ = C418440Gaw.LIZIZ(1);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), R.style.y0);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(C475630Ikz.LIZIZ(R.attr.a0w, contextThemeWrapper));
        paint.setStrokeWidth(this.LLIZ);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(C475630Ikz.LIZIZ(R.attr.a04, getContext()));
        paint2.setStrokeWidth(this.LLIZ);
        paint3.setAntiAlias(true);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(C475630Ikz.LIZIZ(R.attr.a04, getContext()));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILZ = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.LLILZIL = size;
        float f = this.LLIZ / 2;
        this.LLJI.set(f, f, this.LLILZ - f, size - f);
        RectF rectF = this.LLJIJIL;
        float f2 = this.LLIZLLLIL;
        rectF.set(f2, f2, this.LLILZ - f2, this.LLILZIL - f2);
    }
}
