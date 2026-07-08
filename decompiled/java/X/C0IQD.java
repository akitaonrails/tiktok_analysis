package X;

import android.text.SpannableStringBuilder;

/* JADX INFO: renamed from: X.0IQD, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IQD {
    public static SpannableStringBuilder LIZ(C16F5 c16f5, boolean z, String str) {
        int length = str.length();
        if (z && (str = C497740JfY.LJIJJ(2131843366, str)) == null) {
            str = "";
        }
        int length2 = str.length();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        C1119920fFW.LJ(c16f5.getContext(), spannableStringBuilder, length, length2, 33, 8, 400);
        return spannableStringBuilder;
    }
}
