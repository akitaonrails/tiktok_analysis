package X;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.06YR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06YR {
    public static final SpannableString LIZ(String str, String str2) {
        SpannableString spannableString = new SpannableString(str);
        if (str2 != null) {
            int iLJJJ = a0.LJJJ(str, str2, 0, false, 6);
            C786410Ut5.p2(spannableString, new StyleSpan(1), iLJJJ, str2.length() + iLJJJ, 0);
        }
        return spannableString;
    }
}
