package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: X.0K5y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511960K5y {
    public static SpannableStringBuilder LIZ(View view, String str, boolean z, boolean z2) {
        String strLJIIIIZZ;
        int length;
        int length2;
        int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale(C513890KDj.LJ());
        int length3 = 0;
        if (z && !z2) {
            strLJIIIIZZ = C511520K4g.LJIIIIZZ(2131839388, str);
        } else {
            strLJIIIIZZ = str;
        }
        if (strLJIIIIZZ != null) {
            length = strLJIIIIZZ.length();
            length3 = strLJIIIIZZ.length();
        } else {
            length = 0;
        }
        if (length3 > str.length() && layoutDirectionFromLocale == 1) {
            length2 = str.length() + 1;
        } else {
            length2 = str.length();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strLJIIIIZZ);
        if (z) {
            view.getContext();
            C511270K3h.LIZ(spannableStringBuilder, length2, length, 33, 400);
        }
        return spannableStringBuilder;
    }
}
