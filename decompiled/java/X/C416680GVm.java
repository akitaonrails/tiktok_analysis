package X;

import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineHeightSpan;

/* JADX INFO: renamed from: X.0GVm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C416680GVm implements LineHeightSpan {
    public final int LL;

    public C416680GVm(int i) {
        this.LL = i;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        Spanned spanned;
        if ((charSequence instanceof Spanned) && (spanned = (Spanned) charSequence) != null) {
            Integer numValueOf = Integer.valueOf(spanned.getSpanStart(this));
            Integer numValueOf2 = Integer.valueOf(spanned.getSpanEnd(this));
            if (numValueOf != null && i == numValueOf.intValue()) {
                int i5 = fontMetricsInt.ascent;
                int i6 = this.LL;
                fontMetricsInt.ascent = i5 - i6;
                fontMetricsInt.top -= i6;
            }
            if (numValueOf2 != null && i2 == numValueOf2.intValue()) {
                int i7 = fontMetricsInt.descent;
                int i8 = this.LL;
                fontMetricsInt.descent = i7 + i8;
                fontMetricsInt.bottom += i8;
            }
        }
    }
}
