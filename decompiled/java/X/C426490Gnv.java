package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.style.ReplacementSpan;

/* JADX INFO: renamed from: X.0Gnv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426490Gnv {
    public static final void LIZ(final int i, SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.append(" ");
        C786410Ut5.q2(spannableStringBuilder, new ReplacementSpan(i) { // from class: X.0GVN
            public final int LL;

            @Override // android.text.style.ReplacementSpan
            public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
            }

            {
                this.LL = i;
            }

            @Override // android.text.style.ReplacementSpan
            public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                return this.LL;
            }
        }, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
    }
}
