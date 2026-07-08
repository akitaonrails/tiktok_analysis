package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0GSY, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GSY extends View {
    public final Paint LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final RectF LLILZLL;
    public final RectF LLIZ;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.LLILZLL;
        int i = this.LLILLJJLI;
        canvas.drawRoundRect(rectF, i, i, this.LL);
        RectF rectF2 = this.LLIZ;
        int i2 = this.LLILLJJLI;
        canvas.drawRoundRect(rectF2, i2, i2, this.LL);
    }

    public final void setBgColor(int i) {
        this.LL.setColor(i);
        invalidate();
    }

    public C0GSY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        this.LL = paint;
        this.LLILZLL = new RectF();
        this.LLIZ = new RectF();
        paint.setAntiAlias(true);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            this.LLILLJJLI = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.AVDmtView_roundRadius, 0.0f);
            this.LLILLL = (int) typedArrayObtainStyledAttributes.getDimension(R$styleable.AVDmtView_lineWidth, 0.0f);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLILZ = View.MeasureSpec.getSize(i);
        this.LLILZIL = View.MeasureSpec.getSize(i2);
        RectF rectF = this.LLILZLL;
        int i3 = this.LLILLL;
        rectF.set(0.0f, (r5 - i3) / 2, this.LLILZ, (r5 + i3) / 2);
        RectF rectF2 = this.LLIZ;
        int i4 = this.LLILZ;
        int i5 = this.LLILLL;
        rectF2.set((i4 - i5) / 2, 0.0f, (i4 + i5) / 2, this.LLILZIL);
    }
}
