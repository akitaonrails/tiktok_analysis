package X;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;

/* JADX INFO: renamed from: X.0DhE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345900DhE {
    public static void LIZ(SpannableString spannableString, int i, int i2) {
        int iMax = Math.max(0, i);
        if (!TextUtils.isEmpty(spannableString) && iMax <= i2 && iMax < spannableString.length() && i2 <= spannableString.length()) {
            C786410Ut5.p2(spannableString, new StyleSpan(1), iMax, i2, 17);
        }
    }
}
