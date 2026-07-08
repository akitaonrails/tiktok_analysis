package X;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;

/* JADX INFO: renamed from: X.0kMy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316740kMy implements LineHeightSpan.WithDensity {
    public final int LL;
    public final boolean LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
    }

    public final int hashCode() {
        return this.LL + 31;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1316740kMy) || this.LL != ((C1316740kMy) obj).LL) {
            return false;
        }
        return true;
    }

    public C1316740kMy(int i, float f, boolean z, boolean z2) {
        if (f == 1.0E21f) {
            this.LL = 0;
        } else {
            this.LL = (int) Math.ceil(f);
        }
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = z2;
    }

    @Override // android.text.style.LineHeightSpan.WithDensity
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt, TextPaint textPaint) {
        Rect rect;
        if (this.LLILLJJLI) {
            if (this.LLILLL != 0 && (charSequence.length() == i2 - i || this.LLILZ)) {
                rect = new Rect();
                if (Build.VERSION.SDK_INT >= 29) {
                    textPaint.getTextBounds(charSequence, 0, charSequence.toString().length(), rect);
                } else {
                    textPaint.getTextBounds(charSequence.toString(), 0, charSequence.toString().length(), rect);
                }
            } else {
                rect = null;
            }
            int i5 = this.LL;
            if (i5 != 0) {
                if (rect == null) {
                    C1316710kMv.LIZ(i5, fontMetricsInt, false);
                    for (AbstractC1316910kNF abstractC1316910kNF : (AbstractC1316910kNF[]) ((SpannableStringBuilder) charSequence).getSpans(i, i2, AbstractC1316910kNF.class)) {
                        abstractC1316910kNF.getClass();
                        int i6 = fontMetricsInt.ascent;
                        int i7 = abstractC1316910kNF.LLILLL;
                        if (i6 > i7) {
                            fontMetricsInt.ascent = i7;
                        }
                        if (fontMetricsInt.top > i7) {
                            fontMetricsInt.top = i7;
                        }
                        int iLIZ = i7 + abstractC1316910kNF.LIZ();
                        if (fontMetricsInt.descent < iLIZ) {
                            fontMetricsInt.descent = iLIZ;
                        }
                        if (fontMetricsInt.bottom < iLIZ) {
                            fontMetricsInt.bottom = iLIZ;
                        }
                    }
                    return;
                }
            } else if (rect != null) {
                if (i5 == 0) {
                    i5 = fontMetricsInt.bottom - fontMetricsInt.top;
                }
            } else {
                return;
            }
            int i8 = this.LLILLL;
            if (i8 == 4) {
                int i9 = rect.top;
                fontMetricsInt.ascent = i9;
                fontMetricsInt.top = i9;
                int i10 = i5 + i9;
                fontMetricsInt.descent = i10;
                fontMetricsInt.bottom = i10;
                return;
            }
            if (i8 == 7) {
                int i11 = rect.bottom;
                fontMetricsInt.descent = i11;
                fontMetricsInt.bottom = i11;
                int i12 = i11 - i5;
                fontMetricsInt.ascent = i12;
                fontMetricsInt.top = i12;
                return;
            }
            if (i8 != 11) {
                return;
            }
            int iHeight = rect.top - ((i5 - rect.height()) / 2);
            fontMetricsInt.top = iHeight;
            fontMetricsInt.ascent = iHeight;
            int i13 = iHeight + i5;
            fontMetricsInt.bottom = i13;
            fontMetricsInt.descent = i13;
            return;
        }
        int i14 = this.LL;
        if (i14 != 0) {
            int i15 = fontMetricsInt.descent;
            if (i15 > i14) {
                int iMin = Math.min(i14, i15);
                fontMetricsInt.descent = iMin;
                fontMetricsInt.bottom = iMin;
                fontMetricsInt.ascent = 0;
                fontMetricsInt.top = 0;
                return;
            }
            int i16 = fontMetricsInt.ascent;
            if ((-i16) + i15 > i14) {
                fontMetricsInt.bottom = i15;
                int i17 = (-i14) + i15;
                fontMetricsInt.ascent = i17;
                fontMetricsInt.top = i17;
                return;
            }
            int i18 = fontMetricsInt.bottom;
            if ((-i16) + i18 > i14) {
                fontMetricsInt.top = i16;
                fontMetricsInt.bottom = i16 + i14;
                return;
            }
            if ((-fontMetricsInt.top) + i18 > i14) {
                fontMetricsInt.top = i18 - i14;
                return;
            }
            int iRound = Math.round((i14 - ((-r1) + i18)) / 2.0f);
            int iRound2 = Math.round((this.LL - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2.0f);
            fontMetricsInt.top -= iRound;
            fontMetricsInt.bottom += iRound;
            fontMetricsInt.ascent -= iRound2;
            fontMetricsInt.descent += iRound2;
        }
    }
}
