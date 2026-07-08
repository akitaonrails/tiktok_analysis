package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03Fh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C812303Fh {
    public static final /* synthetic */ int LIZ = 0;

    public static CharSequence LIZ(Context context, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('{');
        sbLIZ.append("bold_text");
        sbLIZ.append('}');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (a0.LJJIIZI(str, strLIZIZ, false)) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ArrayList<C1846520y9S> arrayList = new ArrayList();
            int length = 0;
            while (true) {
                if (length >= str.length()) {
                    break;
                }
                int iLJJJ = a0.LJJJ(str, strLIZIZ, length, false, 4);
                if (iLJJJ < 0) {
                    spannableStringBuilder.append((CharSequence) str.substring(length));
                    break;
                }
                spannableStringBuilder.append((CharSequence) str.substring(length, iLJJJ));
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) str2);
                arrayList.add(C13LZ.LJIILJJIL(length2, spannableStringBuilder.length()));
                length = strLIZIZ.length() + iLJJJ;
            }
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, context);
            if (numLIZJ != null) {
                C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ.intValue()), 0, spannableStringBuilder.length(), 33);
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1h, context);
            for (C1846520y9S c1846520y9S : arrayList) {
                C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), c1846520y9S.LL, c1846520y9S.LLILLJJLI + 1, 33);
                if (numLIZJ2 != null) {
                    C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(numLIZJ2.intValue()), c1846520y9S.LL, c1846520y9S.LLILLJJLI + 1, 33);
                }
            }
            return spannableStringBuilder;
        }
        return str;
    }
}
