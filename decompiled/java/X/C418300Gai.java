package X;

import android.graphics.Paint;
import android.os.Build;
import android.text.style.LineHeightSpan;

/* JADX INFO: renamed from: X.0Gai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418300Gai {
    public static final /* synthetic */ int LIZ = 0;

    public static LineHeightSpan LIZ(final int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new LineHeightSpan.Standard(i);
        }
        return new LineHeightSpan(i) { // from class: X.0Gah
            public final int LL;

            {
                this.LL = i;
                if (i > 0) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Height: %d must be positive");
                sbLIZ.append(i);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalArgumentException(strLIZIZ);
            }

            @Override // android.text.style.LineHeightSpan
            public final void chooseHeight(CharSequence charSequence, int i2, int i3, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
                int i6 = fontMetricsInt.descent;
                int i7 = i6 - fontMetricsInt.ascent;
                if (i7 <= 0) {
                    return;
                }
                int iRound = Math.round(i6 * ((this.LL * 1.0f) / i7));
                fontMetricsInt.descent = iRound;
                fontMetricsInt.ascent = iRound - this.LL;
            }
        };
    }
}
