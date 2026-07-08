package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* JADX INFO: renamed from: X.0GVZ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GVZ extends ImageSpan {
    public final Integer LL;
    public final CharSequence LLILLJJLI;
    public boolean LLILLL;

    public C0GVZ(Drawable drawable, Integer num, CharSequence charSequence) {
        super(drawable);
        this.LL = num;
        this.LLILLJJLI = charSequence;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Integer num = this.LL;
        if (num != null) {
            if (num.intValue() != i2 - i && this.LLILLL) {
                return 0;
            }
        }
        Rect bounds = getDrawable().getBounds();
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
        return bounds.right;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Integer num = this.LL;
        if (num != null) {
            if (num.intValue() != i2 - i && this.LLILLL) {
                this.LLILLL = false;
                return;
            }
        }
        Drawable drawable = getDrawable();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = ((((fontMetricsInt.descent + i4) + i4) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
        canvas.save();
        canvas.translate(f + 0, i6);
        drawable.draw(canvas);
        canvas.restore();
        Integer num2 = this.LL;
        if (num2 != null) {
            if (num2.intValue() != i2 - i) {
                this.LLILLL = true;
            }
        }
    }
}
