package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0kN0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316760kN0 extends AbstractC1316910kNF {
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    public C1316760kN0() {
        if (this.LLILZIL) {
            this.LL = 1;
        } else {
            this.LL = 0;
        }
        this.LLILLJJLI = 0.0f;
    }

    @Override // X.AbstractC1316910kNF
    public final int LIZ() {
        return this.LLILZLL;
    }

    public final int LIZIZ(int i, int i2, int i3, int i4) {
        if (!this.LLILZIL) {
            return (i2 - i4) - this.LLILZLL;
        }
        int i5 = this.LL;
        if (i5 != 4) {
            if (i5 != 7) {
                if (i5 != 11) {
                    return (i - i3) + this.LLILLL;
                }
                return ((i2 + i) - this.LLILZLL) / 2;
            }
            return i2 - this.LLILZLL;
        }
        return i;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int i3;
        float f;
        int i4;
        if (fontMetricsInt != null) {
            if (fontMetricsInt.descent == fontMetricsInt.ascent) {
                fontMetricsInt.ascent = paint.getFontMetricsInt().ascent;
                fontMetricsInt.descent = paint.getFontMetricsInt().descent;
            }
            if (this.LLILZIL) {
                int i5 = this.LL;
                if (i5 == 1 && (i4 = this.LLIZLLLIL) != 0) {
                    this.LLILLL = -i4;
                } else {
                    float fLIZ = -this.LLILZLL;
                    C1316870kNB c1316870kNB = this.LLILZ;
                    if (c1316870kNB != null) {
                        fLIZ = c1316870kNB.LIZ(this.LLILLJJLI, fLIZ, 0.0f, i5);
                    }
                    this.LLILLL = (int) fLIZ;
                }
            } else {
                int i6 = fontMetricsInt.descent;
                int i7 = fontMetricsInt.ascent;
                int i8 = i6 - i7;
                int i9 = this.LLILZLL;
                switch (this.LL) {
                    case 1:
                        i7 = -i9;
                        break;
                    case 2:
                        i3 = i6 - i9;
                        f = i8 * 0.1f;
                        i7 = i3 - ((int) f);
                        break;
                    case 3:
                        i7 += (int) (i8 * 0.1f);
                        break;
                    case 4:
                    case 5:
                        break;
                    case 6:
                    default:
                        i7 += (i8 - i9) / 2;
                        break;
                    case 7:
                    case 8:
                        i7 = i6 - i9;
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        i3 = -i9;
                        f = this.LLILLJJLI;
                        i7 = i3 - ((int) f);
                        break;
                }
                this.LLILLL = i7;
            }
            int i10 = fontMetricsInt.ascent;
            int i11 = this.LLILLL;
            if (i10 > i11) {
                fontMetricsInt.ascent = i11;
            }
            int i12 = fontMetricsInt.descent;
            int i13 = i11 + this.LLILZLL;
            if (i12 < i13) {
                fontMetricsInt.descent = i13;
            }
            int i14 = fontMetricsInt.top;
            int i15 = fontMetricsInt.ascent;
            if (i14 > i15) {
                fontMetricsInt.top = i15;
            }
            int i16 = fontMetricsInt.bottom;
            int i17 = fontMetricsInt.descent;
            if (i16 < i17) {
                fontMetricsInt.bottom = i17;
            }
        }
        return this.LLIZ;
    }
}
