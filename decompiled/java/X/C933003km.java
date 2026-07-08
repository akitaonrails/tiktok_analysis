package X;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.03km, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C933003km {
    public static final Pattern LIZ = PatternProtector.compile("\\*\\*([^*]+)\\*\\*");
    public static final Pattern LIZIZ = PatternProtector.compile("\\[([^\\]]+)]\\(([^)]+)\\)");

    public static CharSequence LIZ(String str) {
        Matcher matcher = LIZ.matcher(str);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int iEnd = 0;
        while (matcher.find()) {
            spannableStringBuilder.append((CharSequence) str.substring(iEnd, matcher.start()));
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) matcher.group(1));
            C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), length, spannableStringBuilder.length(), 33);
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            spannableStringBuilder.append((CharSequence) str.substring(iEnd));
        }
        return spannableStringBuilder;
    }
}
