package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import com.bytedance.tux.drawable.TuxIconDrawable;

/* JADX INFO: renamed from: X.0GXG, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GXG extends ReplacementSpan {
    public int LL;
    public int LLILLJJLI;
    public Rect LLILLL;
    public final Paint.FontMetricsInt LLILZ = new Paint.FontMetricsInt();
    public final Drawable LLILZIL;
    public int LLILZLL;
    public int LLIZ;

    public final void LIZ() {
        Drawable drawable = this.LLILZIL;
        Rect bounds = drawable != null ? drawable.getBounds() : null;
        this.LLILLL = bounds;
        this.LL = bounds != null ? bounds.width() : 0;
        Rect rect = this.LLILLL;
        this.LLILLJJLI = rect != null ? rect.height() : 0;
    }

    public C0GXG(TuxIconDrawable tuxIconDrawable) {
        this.LLILZIL = tuxIconDrawable;
        LIZ();
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3;
        int i4 = this.LLILZLL + this.LLIZ;
        LIZ();
        if (fontMetricsInt == null) {
            i3 = this.LL;
        } else {
            int i5 = fontMetricsInt.descent;
            int i6 = fontMetricsInt.ascent;
            int i7 = this.LLILLJJLI;
            int i8 = (((i5 - i6) - i7) / 2) + i6;
            int i9 = i7 + i8;
            if (i8 < i6) {
                fontMetricsInt.ascent = i8;
            }
            if (i8 < fontMetricsInt.top) {
                fontMetricsInt.top = i8;
            }
            if (i9 > i5) {
                fontMetricsInt.descent = i9;
            }
            if (i9 > fontMetricsInt.bottom) {
                fontMetricsInt.bottom = i9;
            }
            i3 = this.LL;
        }
        return i3 + i4;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        paint.getFontMetricsInt(this.LLILZ);
        float f2 = f + this.LLILZLL;
        float f3 = ((i5 + i3) - this.LLILLJJLI) / 2;
        canvas.translate(f2, f3);
        Drawable drawable = this.LLILZIL;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.translate(-f2, -f3);
    }
}
