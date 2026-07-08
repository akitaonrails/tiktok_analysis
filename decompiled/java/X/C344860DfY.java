package X;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DfY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C344860DfY {
    public static final /* synthetic */ int LIZ = 0;

    public static SpannableStringBuilder LIZ(String str, String str2, int i, Function0 function0) {
        int iLJJJ = a0.LJJJ(str, "%s", 0, false, 6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (iLJJJ >= 0) {
            String strSubstring = str.substring(0, iLJJJ);
            String strSubstring2 = str.substring(iLJJJ + "%s".length());
            spannableStringBuilder.append((CharSequence) strSubstring);
            spannableStringBuilder.append((CharSequence) str2);
            spannableStringBuilder.append((CharSequence) strSubstring2);
            int length = strSubstring.length();
            int length2 = strSubstring.length() + str2.length();
            C786410Ut5.q2(spannableStringBuilder, new C511701z1(function0, 4), length, length2, 34);
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(i), length, length2, 34);
            C786410Ut5.q2(spannableStringBuilder, new RelativeSizeSpan(1.0769231f), length, length2, 34);
            C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), length, length2, 34);
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
