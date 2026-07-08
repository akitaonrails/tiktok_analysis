package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: X.0uDO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695200uDO extends ReplacementSpan {
    public final float LL;
    public final int LLILLJJLI;
    public final float LLILLL;
    public final int LLILZ;
    public final float LLILZIL;
    public final int LLILZLL;
    public Paint.FontMetricsInt LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    public final Paint.FontMetricsInt LIZ() {
        Paint.FontMetricsInt fontMetricsInt = this.LLIZ;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        return null;
    }

    public final int LIZIZ() {
        if (!this.LLJI) {
            C1681000tqU.LIZJ("PlaceholderSpan is not laid out yet.");
        }
        return this.LLJ;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        double dCeil;
        this.LLJI = true;
        float textSize = paint.getTextSize();
        this.LLIZ = paint.getFontMetricsInt();
        if (LIZ().descent <= LIZ().ascent) {
            C1681000tqU.LIZ("Invalid fontMetrics: line height can not be negative.");
        }
        int i3 = this.LLILLJJLI;
        if (i3 != 0) {
            if (i3 == 1) {
                f = this.LL * textSize;
            } else {
                C1681000tqU.LIZIZ("Unsupported unit.");
                throw new C2197108jB();
            }
        } else {
            f = this.LL * this.LLILZIL;
        }
        this.LLIZLLLIL = (int) Math.ceil(f);
        int i4 = this.LLILZ;
        if (i4 != 0) {
            if (i4 == 1) {
                dCeil = Math.ceil(this.LLILLL * textSize);
            } else {
                C1681000tqU.LIZIZ("Unsupported unit.");
                throw new C2197108jB();
            }
        } else {
            dCeil = Math.ceil(this.LLILLL * this.LLILZIL);
        }
        this.LLJ = (int) dCeil;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = LIZ().ascent;
            fontMetricsInt.descent = LIZ().descent;
            fontMetricsInt.leading = LIZ().leading;
            switch (this.LLILZLL) {
                case 0:
                    if (fontMetricsInt.ascent > (-LIZIZ())) {
                        fontMetricsInt.ascent = -LIZIZ();
                    }
                    break;
                case 1:
                case 4:
                    if (fontMetricsInt.ascent + LIZIZ() > fontMetricsInt.descent) {
                        fontMetricsInt.descent = fontMetricsInt.ascent + LIZIZ();
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - LIZIZ()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - LIZIZ();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < LIZIZ()) {
                        int iLIZIZ = fontMetricsInt.ascent - ((LIZIZ() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iLIZIZ;
                        fontMetricsInt.descent = iLIZIZ + LIZIZ();
                    }
                    break;
                default:
                    C1681000tqU.LIZ("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(LIZ().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(LIZ().bottom, fontMetricsInt.descent);
        }
        if (!this.LLJI) {
            C1681000tqU.LIZJ("PlaceholderSpan is not laid out yet.");
        }
        return this.LLIZLLLIL;
    }

    public C1695200uDO(float f, float f2, float f3, int i, int i2, int i3) {
        this.LL = f;
        this.LLILLJJLI = i;
        this.LLILLL = f2;
        this.LLILZ = i2;
        this.LLILZIL = f3;
        this.LLILZLL = i3;
    }
}
