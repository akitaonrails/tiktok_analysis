package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0KBO, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KBO {
    public static SpannableStringBuilder LIZ(C16F5 c16f5, String str, boolean z, boolean z2) {
        String strLJIJJ;
        int length;
        int layoutDirectionFromLocale = TextUtils.getLayoutDirectionFromLocale(C513900KDk.LJ());
        if (z && !z2) {
            strLJIJJ = C497740JfY.LJIJJ(2131843366, str);
        } else {
            strLJIJJ = str;
        }
        int length2 = strLJIJJ.length();
        if (strLJIJJ.length() > str.length() && layoutDirectionFromLocale == 1) {
            length = str.length() + 1;
        } else {
            length = str.length();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("buildPriceSpannable price=");
        sbLIZ.append(str);
        sbLIZ.append(" isAutoRenewal=");
        sbLIZ.append(z);
        sbLIZ.append(" hasOffer=");
        sbLIZ.append(z2);
        sbLIZ.append(" displayPrice=");
        sbLIZ.append(strLJIJJ);
        C20441214yg.LIZIZ("PriceUtil", C2188811AlT.LIZIZ(sbLIZ));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) strLJIJJ);
        if (z) {
            C1119920fFW.LJ(c16f5.getContext(), spannableStringBuilder, length, length2, 33, 8, 400);
        }
        return spannableStringBuilder;
    }
}
