package X;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0I1R, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I1R {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(TuxTextView tuxTextView, String str, String str2, int i) {
        if (str2.length() != 0 && str != null && str.length() != 0) {
            Locale locale = Locale.ROOT;
            int iLJJJ = a0.LJJJ(str.toLowerCase(locale), str2.toLowerCase(locale), 0, false, 6);
            if (iLJJJ < 0) {
                tuxTextView.setText(str);
                return;
            }
            int length = str2.length() + iLJJJ;
            int length2 = str.length();
            if (length > length2) {
                length = length2;
            }
            String strSubstring = str.substring(iLJJJ, length);
            if (a0.LJJIIZI(strSubstring, e3.d, false)) {
                strSubstring = u.LJJIFFI(strSubstring, e3.d, "\\.", false);
            }
            SpannableString spannableString = new SpannableString(str);
            try {
                Matcher matcher = PatternProtector.compile(strSubstring).matcher(spannableString);
                if (matcher.find()) {
                    int iStart = matcher.start();
                    int iEnd = matcher.end();
                    if (iStart >= 0) {
                        C786410Ut5.p2(spannableString, new ForegroundColorSpan(i), iStart, iEnd, 33);
                    }
                }
            } catch (PatternSyntaxException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            tuxTextView.setText(spannableString);
            return;
        }
        tuxTextView.setText(str);
    }
}
