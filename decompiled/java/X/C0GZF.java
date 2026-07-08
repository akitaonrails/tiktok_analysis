package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: X.0GZF, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0GZF extends ReplacementSpan implements InterfaceC430910Gv3 {
    public int LL;
    public int LLILLJJLI;
    public Rect LLILLL;
    public final int LLILZ;
    public final Paint.FontMetricsInt LLILZIL = new Paint.FontMetricsInt();
    public final Drawable LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;

    private final void LIZLLL() {
        Drawable drawable = this.LLILZLL;
        Rect bounds = drawable != null ? drawable.getBounds() : null;
        this.LLILLL = bounds;
        this.LL = bounds != null ? bounds.width() : 0;
        Rect rect = this.LLILLL;
        this.LLILLJJLI = rect != null ? rect.height() : 0;
    }

    @Override // X.InterfaceC430910Gv3
    public final int LIZIZ() {
        return this.LL + this.LLIZ + this.LLIZLLLIL;
    }

    private final int LIZ(Paint.FontMetricsInt fontMetricsInt) {
        int i;
        int i2 = this.LLILZ;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        i = this.LLILLJJLI;
                    } else {
                        return fontMetricsInt.ascent;
                    }
                } else {
                    int i3 = fontMetricsInt.descent;
                    int i4 = fontMetricsInt.ascent;
                    return i4 + (((i3 - i4) - this.LLILLJJLI) / 2);
                }
            } else {
                i = this.LLILLJJLI;
            }
            return -i;
        }
        return fontMetricsInt.descent - this.LLILLJJLI;
    }

    public C0GZF(Drawable drawable, int i) {
        this.LLILZLL = drawable;
        this.LLILZ = i;
        LIZLLL();
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

    public static void LIZJ(C0GZF c0gzf, boolean z, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        if (z) {
            c0gzf.LLIZ = i3;
            c0gzf.LLIZLLLIL = i;
        } else {
            c0gzf.LLIZ = i;
            c0gzf.LLIZLLLIL = i3;
        }
        c0gzf.LLJ = i2;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        paint.getFontMetricsInt(this.LLILZIL);
        float f2 = f + this.LLIZ;
        float fLIZ = i4 + LIZ(this.LLILZIL) + this.LLJ;
        canvas.translate(f2, fLIZ);
        Drawable drawable = this.LLILZLL;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        canvas.translate(-f2, -fLIZ);
    }
}
