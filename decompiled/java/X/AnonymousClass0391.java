package X;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;

/* JADX INFO: renamed from: X.0391, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0391 {
    public static final /* synthetic */ int LIZ = 0;

    public static CharSequence LIZ(String str, int i, int i2, String str2, int i3, String str3, int i4, String str4, int i5, int i6, int i7) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int length = spannableStringBuilder.length();
        if (str == null) {
            str = "";
        }
        spannableStringBuilder.append((CharSequence) str);
        int length2 = spannableStringBuilder.length();
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(i), length, length2, 33);
        int length3 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str2);
        int length4 = spannableStringBuilder.length();
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(i3), length3, length4, 33);
        spannableStringBuilder.append((CharSequence) " ");
        int length5 = spannableStringBuilder.length();
        if (str3 == null) {
            str3 = "";
        }
        spannableStringBuilder.append((CharSequence) str3);
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(i4), length5, spannableStringBuilder.length(), 33);
        if (str4 != null && str4.length() != 0) {
            spannableStringBuilder.append((CharSequence) " ");
            int length6 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str4);
            int length7 = spannableStringBuilder.length();
            C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(i5), length6, length7, 33);
            C786410Ut5.q2(spannableStringBuilder, new C444920HcY(i6, false), length6, length7, 33);
        }
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(i7, false), 0, spannableStringBuilder.length(), 33);
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(i2, false), length, length2, 33);
        C786410Ut5.q2(spannableStringBuilder, new C444920HcY(i2, false), length3, length4, 33);
        return spannableStringBuilder;
    }
}
