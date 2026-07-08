package X;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* JADX INFO: renamed from: X.18m4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21382218m4 {
    public static CharSequence LIZ(PrecomputedText precomputedText) {
        return precomputedText;
    }

    public static String[] LIZIZ(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static PrecomputedText.Params LIZJ(TextView textView) {
        return textView.getTextMetricsParams();
    }

    public static void LIZLLL(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }
}
