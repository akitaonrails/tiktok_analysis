package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.00wO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C240600wO {
    public static final /* synthetic */ int LIZ = 0;

    public static SpannableStringBuilder LIZ(String str, Integer num, Integer num2, String str2, Context context) {
        if (str2.length() == 0) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (num == null) {
            num = C1308910kAL.LIZJ(R.attr.a1k, context);
        }
        if (num != null) {
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(num.intValue()), 0, str2.length(), 17);
        }
        if (str != null && str.length() != 0) {
            Locale locale = Locale.ROOT;
            int iLJJJ = a0.LJJJ(str2.toLowerCase(locale), str.toLowerCase(locale), 0, false, 6);
            if (iLJJJ != -1 && (num2 != null || (num2 = C1308910kAL.LIZJ(R.attr.a1h, context)) != null)) {
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(num2.intValue()), iLJJJ, str.length() + iLJJJ, 17);
            }
        }
        return spannableStringBuilder;
    }
}
