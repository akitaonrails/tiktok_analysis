package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* JADX INFO: renamed from: X.0GVu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C416760GVu extends ImageSpan {
    public int LL;
    public int LLILLJJLI;

    public C416760GVu(Drawable drawable) {
        super(drawable);
    }

    public static int LIZ(int i, Paint.FontMetricsInt fontMetricsInt, Drawable drawable) {
        return ((((fontMetricsInt.descent + i) + i) + fontMetricsInt.ascent) / 2) - (drawable.getBounds().bottom / 2);
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Rect bounds = getDrawable().getBounds();
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.bottom - fontMetricsInt2.top;
            int i4 = (((bounds.bottom - bounds.top) + this.LLILLJJLI) + this.LL) / 2;
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
    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Drawable drawable = getDrawable();
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null && !bitmapDrawable.getBitmap().isRecycled()) {
                int iLIZ = LIZ(i4, paint.getFontMetricsInt(), drawable);
                canvas.save();
                canvas.translate(f, iLIZ);
                drawable.draw(canvas);
                canvas.restore();
                return;
            }
            return;
        }
        int iLIZ2 = LIZ(i4, paint.getFontMetricsInt(), drawable);
        canvas.save();
        canvas.translate(f, iLIZ2);
        drawable.draw(canvas);
        canvas.restore();
    }
}
