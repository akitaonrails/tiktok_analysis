package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: renamed from: X.0EfQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C370260EfQ extends View {
    public Paint LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public RectF LLJ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.LL;
        if (paint != null && this.LLJ != null) {
            paint.setColor(this.LLILZ);
            this.LLJ.set(0.0f, 0.0f, this.LLILZIL, this.LLILZLL);
            RectF rectF = this.LLJ;
            float f = this.LLIZLLLIL;
            canvas.drawRoundRect(rectF, f, f, this.LL);
            this.LL.setColor(this.LLILLJJLI);
            RectF rectF2 = this.LLJ;
            float f2 = this.LLIZ;
            rectF2.set(f2 * 4.0f, 14.0f * f2, this.LLILZIL - (4.0f * f2), this.LLILZLL - (f2 * 20.0f));
            RectF rectF3 = this.LLJ;
            float f3 = this.LLIZLLLIL;
            canvas.drawRoundRect(rectF3, f3, f3, this.LL);
            this.LL.setColor(this.LLILLL);
            float f4 = this.LLIZ;
            float f5 = 27.0f * f4;
            float f6 = 9.0f * f4;
            RectF rectF4 = this.LLJ;
            float f7 = this.LLILZIL;
            float f8 = this.LLILZLL;
            rectF4.set((f7 - f5) / 2.0f, f8 - (((f4 * 20.0f) + f6) / 2.0f), (f7 + f5) / 2.0f, f8 - (((f4 * 20.0f) - f6) / 2.0f));
            float f9 = f6 / 2.0f;
            canvas.drawRoundRect(this.LLJ, f9, f9, this.LL);
        }
    }

    public C370260EfQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new Paint();
        this.LLILZ = Color.argb(191, 255, 255, 255);
        this.LLILLJJLI = Color.argb(51, 0, 0, 0);
        this.LLILLL = Color.argb(38, 0, 0, 0);
        new Path();
        float fApplyDimension = TypedValue.applyDimension(1, 1.0f, context.getResources().getDisplayMetrics());
        this.LLIZ = fApplyDimension;
        this.LLIZLLLIL = fApplyDimension * 3.0f;
        this.LLJ = new RectF();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLILZIL = i;
        this.LLILZLL = i2;
    }
}
