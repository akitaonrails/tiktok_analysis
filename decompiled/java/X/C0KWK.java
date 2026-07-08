package X;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0KWK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KWK {
    public static final /* synthetic */ int LIZ = 0;

    public static SpannableStringBuilder LIZIZ(int i, String str, String str2) {
        int iLJJJ;
        IntRange intRangeLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("(?<!\\d)");
        Regex.Companion.getClass();
        sbLIZ.append(Pattern.quote(str2));
        sbLIZ.append("(?!\\d)");
        MatchResult matchResultFind$default = Regex.find$default(new Regex(C2188811AlT.LIZIZ(sbLIZ)), str, 0, 2, null);
        if (matchResultFind$default != null && (intRangeLIZIZ = matchResultFind$default.LIZIZ()) != null) {
            iLJJJ = intRangeLIZIZ.LL;
        } else {
            iLJJJ = a0.LJJJ(str, str2, 0, false, 6);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (iLJJJ >= 0) {
            String strSubstring = str.substring(0, iLJJJ);
            String strSubstring2 = str.substring(iLJJJ + str2.length());
            spannableStringBuilder.append((CharSequence) strSubstring);
            spannableStringBuilder.append((CharSequence) str2);
            spannableStringBuilder.append((CharSequence) strSubstring2);
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(i), strSubstring.length(), strSubstring.length() + str2.length(), 34);
            C786410Ut5.q2(spannableStringBuilder, new RelativeSizeSpan(1.0769231f), strSubstring.length(), strSubstring.length() + str2.length(), 34);
            C1119920fFW.LJIIIIZZ(spannableStringBuilder, strSubstring.length(), strSubstring.length() + str2.length(), 34, 500);
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder LIZ(String str, String str2, int i, final Function0 function0) {
        int iLJJJ = a0.LJJJ(str, "%s", 0, false, 6);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (iLJJJ >= 0) {
            String strSubstring = str.substring(0, iLJJJ);
            String strSubstring2 = str.substring(iLJJJ + "%s".length());
            spannableStringBuilder.append((CharSequence) strSubstring);
            spannableStringBuilder.append((CharSequence) str2);
            spannableStringBuilder.append((CharSequence) strSubstring2);
            C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.011u
                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    function0.invoke();
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setUnderlineText(false);
                }
            }, strSubstring.length(), strSubstring.length() + str2.length(), 34);
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(i), strSubstring.length(), strSubstring.length() + str2.length(), 34);
            C786410Ut5.q2(spannableStringBuilder, new RelativeSizeSpan(1.0769231f), strSubstring.length(), strSubstring.length() + str2.length(), 34);
            C1119920fFW.LJIIIIZZ(spannableStringBuilder, strSubstring.length(), strSubstring.length() + str2.length(), 34, 500);
            return spannableStringBuilder;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
