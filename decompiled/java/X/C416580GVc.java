package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* JADX INFO: renamed from: X.0GVc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416580GVc extends ImageSpan {
    public C416580GVc(Drawable drawable) {
        super(drawable);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.descent;
            int i4 = fontMetricsInt2.ascent;
            int i5 = i4 + ((i3 - i4) / 2);
            int i6 = (bounds.bottom - bounds.top) / 2;
            int i7 = i5 - i6;
            fontMetricsInt.ascent = i7;
            fontMetricsInt.top = i7;
            int i8 = i5 + i6;
            fontMetricsInt.bottom = i8;
            fontMetricsInt.descent = i8;
        }
        return bounds.right;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        canvas.save();
        int i6 = paint.getFontMetricsInt().descent;
        canvas.translate(f, ((i4 + i6) - ((i6 - r0.ascent) / 2)) - ((getDrawable().getBounds().bottom - getDrawable().getBounds().top) / 2));
        getDrawable().draw(canvas);
        canvas.restore();
    }
}
