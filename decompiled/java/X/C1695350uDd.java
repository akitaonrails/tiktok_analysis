package X;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: renamed from: X.0uDd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695350uDd implements LineHeightSpan {
    public final float LL;
    public final int LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final float LLILZLL;
    public final boolean LLIZ;
    public int LLJILJIL;
    public int LLJILJILJ;
    public final int LLILLJJLI = 0;
    public int LLIZLLLIL = Integer.MIN_VALUE;
    public int LLJ = Integer.MIN_VALUE;
    public int LLJI = Integer.MIN_VALUE;
    public int LLJIJIL = Integer.MIN_VALUE;

    public C1695350uDd(float f, int i, boolean z, boolean z2, float f2, boolean z3) {
        this.LL = f;
        this.LLILLL = i;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = f2;
        this.LLIZ = z3;
        if ((0.0f <= f2 && f2 <= 1.0f) || f2 == -1.0f) {
            return;
        }
        C1681000tqU.LIZJ("topRatio should be in [0..1] range or -1");
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        boolean z2;
        int i5;
        int i6;
        double dCeil;
        int i7 = fontMetricsInt.descent;
        int i8 = fontMetricsInt.ascent;
        if (i7 - i8 <= 0) {
            return;
        }
        if (i == this.LLILLJJLI) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == this.LLILLL) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2 && this.LLILZ && this.LLILZIL) {
            return;
        }
        if (this.LLIZLLLIL == Integer.MIN_VALUE) {
            int iCeil = (int) Math.ceil(this.LL);
            int i9 = iCeil - (i7 - i8);
            if (this.LLIZ && i9 <= 0) {
                int i10 = fontMetricsInt.ascent;
                this.LLJ = i10;
                int i11 = fontMetricsInt.descent;
                this.LLJI = i11;
                this.LLIZLLLIL = i10;
                this.LLJIJIL = i11;
                this.LLJILJIL = 0;
                this.LLJILJILJ = 0;
            } else {
                float fAbs = this.LLILZLL;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                if (i9 <= 0) {
                    dCeil = Math.ceil(i9 * fAbs);
                } else {
                    dCeil = Math.ceil(i9 * (1.0f - fAbs));
                }
                int i12 = fontMetricsInt.descent;
                int i13 = ((int) dCeil) + i12;
                this.LLJI = i13;
                int i14 = i13 - iCeil;
                this.LLJ = i14;
                if (this.LLILZ) {
                    i14 = fontMetricsInt.ascent;
                }
                this.LLIZLLLIL = i14;
                if (this.LLILZIL) {
                    i13 = i12;
                }
                this.LLJIJIL = i13;
                this.LLJILJIL = fontMetricsInt.ascent - i14;
                this.LLJILJILJ = i13 - i12;
            }
        }
        if (z) {
            i5 = this.LLIZLLLIL;
        } else {
            i5 = this.LLJ;
        }
        fontMetricsInt.ascent = i5;
        if (z2) {
            i6 = this.LLJIJIL;
        } else {
            i6 = this.LLJI;
        }
        fontMetricsInt.descent = i6;
    }
}
