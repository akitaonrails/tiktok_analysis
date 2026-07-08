package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* JADX INFO: renamed from: X.0GVt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C416750GVt extends ImageSpan {
    public int LL;
    public final Integer LLILLJJLI;
    public boolean LLILLL;

    public C416750GVt(Drawable drawable) {
        super(drawable);
        this.LLILLJJLI = null;
    }

    public C416750GVt(Context context, int i) {
        super(context, i);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Drawable drawable;
        Integer num = this.LLILLJJLI;
        if ((num != null && num.intValue() != i2 - i && this.LLILLL) || (drawable = getDrawable()) == null) {
            return 0;
        }
        Rect bounds = drawable.getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i4 = (bounds.bottom - bounds.top) / 2;
            int i5 = i3 / 4;
            int i6 = i4 - i5;
            int i7 = -(i4 + i5);
            fontMetricsInt.ascent = i7;
            fontMetricsInt.top = i7;
            fontMetricsInt.bottom = i6;
            fontMetricsInt.descent = i6;
        }
        return bounds.right + this.LL;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Integer num = this.LLILLJJLI;
        if (num != null && num.intValue() != i2 - i && this.LLILLL) {
            this.LLILLL = false;
            return;
        }
        Drawable drawable = getDrawable();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = ((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
        canvas.save();
        canvas.translate(f + this.LL, i6);
        drawable.draw(canvas);
        canvas.restore();
        Integer num2 = this.LLILLJJLI;
        if (num2 != null && num2.intValue() != i2 - i) {
            this.LLILLL = true;
        }
    }
}
