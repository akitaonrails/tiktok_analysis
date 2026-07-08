package X;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: renamed from: X.0kvJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338030kvJ implements LineHeightSpan {
    public final C1337980kvE LL;
    public float LLILLJJLI;

    public C1338030kvJ(C1337980kvE c1337980kvE, float f) {
        this.LL = c1337980kvE;
        this.LLILLJJLI = f;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int iCeil;
        C1337980kvE c1337980kvE = this.LL;
        if (c1337980kvE.LIZIZ == 2) {
            iCeil = (int) Math.ceil(c1337980kvE.LIZ * this.LLILLJJLI);
        } else {
            iCeil = (int) c1337980kvE.LIZ;
        }
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        int i7 = i5 - i6;
        int i8 = (iCeil - i7) / 2;
        int i9 = (iCeil - i8) - i7;
        int i10 = fontMetricsInt.bottom;
        int i11 = fontMetricsInt.top;
        int i12 = i10 - i11;
        int i13 = (iCeil - i12) / 2;
        int i14 = i6 - i8;
        fontMetricsInt.ascent = i14;
        int i15 = i5 + i9;
        fontMetricsInt.descent = i15;
        int i16 = i11 - i13;
        fontMetricsInt.top = i16;
        int i17 = i10 + ((iCeil - i13) - i12);
        fontMetricsInt.bottom = i17;
        if (i15 < 0) {
            fontMetricsInt.ascent = i14 - i15;
            fontMetricsInt.descent = 0;
        }
        int i18 = fontMetricsInt.ascent;
        if (i18 > 0) {
            fontMetricsInt.descent -= i18;
            fontMetricsInt.ascent = 0;
        }
        if (i17 < 0) {
            fontMetricsInt.top = i16 - i17;
            fontMetricsInt.bottom = 0;
        }
        int i19 = fontMetricsInt.top;
        if (i19 > 0) {
            fontMetricsInt.bottom -= i19;
            fontMetricsInt.top = 0;
        }
    }
}
