package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: X.0GdH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419890GdH extends ReplacementSpan {
    public int LL;
    public int LLILLJJLI;
    public Rect LLILLL;
    public final int LLILZ;
    public final Paint.FontMetricsInt LLILZIL = new Paint.FontMetricsInt();
    public final Drawable LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;

    public final void LIZLLL() {
        Drawable drawable = this.LLILZLL;
        Rect bounds = drawable != null ? drawable.getBounds() : null;
        this.LLILLL = bounds;
        this.LL = bounds != null ? bounds.width() : 0;
        Rect rect = this.LLILLL;
        this.LLILLJJLI = rect != null ? rect.height() : 0;
    }

    public final int LIZ(Paint.FontMetricsInt fontMetricsInt) {
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1 || i != 2) {
                int i2 = this.LLILLJJLI;
                return -i2;
            }
            int i3 = fontMetricsInt.descent;
            int i4 = fontMetricsInt.ascent;
            return i4 + (((i3 - i4) - this.LLILLJJLI) / 2);
        }
        return fontMetricsInt.descent - this.LLILLJJLI;
    }

    public C419890GdH(Drawable drawable, int i) {
        this.LLILZLL = drawable;
        this.LLILZ = i;
        LIZLLL();
    }

    public final void LIZIZ(int i, int i2, boolean z) {
        if (z) {
            this.LLIZ = i2;
            this.LLIZLLLIL = i;
        } else {
            this.LLIZ = i;
            this.LLIZLLLIL = i2;
        }
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3;
        int i4 = this.LLIZ + this.LLIZLLLIL;
        LIZLLL();
        if (fontMetricsInt == null) {
            i3 = this.LL;
        } else {
            int iLIZ = LIZ(fontMetricsInt);
            int i5 = this.LLILLJJLI + iLIZ;
            if (iLIZ < fontMetricsInt.ascent) {
                fontMetricsInt.ascent = iLIZ;
            }
            if (iLIZ < fontMetricsInt.top) {
                fontMetricsInt.top = iLIZ;
            }
            if (i5 > fontMetricsInt.descent) {
                fontMetricsInt.descent = i5;
            }
            if (i5 > fontMetricsInt.bottom) {
                fontMetricsInt.bottom = i5;
            }
            i3 = this.LL;
        }
        return i3 + i4;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        paint.getFontMetricsInt(this.LLILZIL);
        int i6 = this.LLILZ;
        if (i6 != 2) {
            if (i6 != 3) {
                i3 = i4 + LIZ(this.LLILZIL);
            }
        } else {
            i3 = ((i5 + i3) - this.LLILLJJLI) / 2;
        }
        float f2 = f + this.LLIZ;
        float f3 = i3;
        canvas.translate(f2, f3);
        Drawable drawable = this.LLILZLL;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.translate(-f2, -f3);
    }
}
