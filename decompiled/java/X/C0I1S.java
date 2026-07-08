package X;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;
import kotlin.text.a0;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0I1S, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I1S {
    public static final SpannableString LIZ(int i, int i2, String str, String str2) {
        if (a0.LJJIIZI(str2, e3.d, false)) {
            str2 = u.LJJIFFI(str2, e3.d, "\\.", false);
        }
        SpannableString spannableString = new SpannableString(str);
        try {
            Matcher matcher = PatternProtector.compile(str2).matcher(spannableString);
            if (matcher.find()) {
                int iStart = matcher.start();
                int iEnd = matcher.end();
                if (iStart >= i2) {
                    C786410Ut5.p2(spannableString, new ForegroundColorSpan(i), iStart, iEnd, 33);
                }
            }
            return spannableString;
        } catch (PatternSyntaxException e) {
            TryCatchGuardChecker.doCheck(e);
            return spannableString;
        }
    }
}
