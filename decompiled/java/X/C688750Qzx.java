package X;

import android.text.Layout;
import android.text.Spanned;
import java.util.Collections;
import java.util.Set;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Qzx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C688750Qzx {
    public static final /* synthetic */ int LIZ = 0;

    public static CharSequence LIZIZ(C1860130yVP c1860130yVP, String str, boolean z) {
        Spanned spannedLIZ = C14TF.LIZIZ.LJIIL().LIZ(str, c1860130yVP, null, null, false, false, true, z);
        if (spannedLIZ == null) {
            String strReplace = new Regex("<[/a-zA-Z][^>]*>").replace(new Regex("<sup[^>]*>.*?</sup>", (Set<? extends EnumC688760Qzy>) C13LQ.LJLIIL(new EnumC688760Qzy[]{EnumC688760Qzy.IGNORE_CASE, EnumC688760Qzy.DOT_MATCHES_ALL})).replace(str, ""), "");
            EnumC688760Qzy enumC688760Qzy = EnumC688760Qzy.MULTILINE;
            return a0.LJLIIIL(new Regex("(^|\\n)(-{3,}|\\*{3,}|_{3,})(\\n|$)", (Set<? extends EnumC688760Qzy>) Collections.singleton(enumC688760Qzy)).replace(new Regex("(^|\\n)>\\s?", (Set<? extends EnumC688760Qzy>) Collections.singleton(enumC688760Qzy)).replace(new Regex("([*_])(.*?)\\1").replace(new Regex("(\\*\\*|__)(.*?)\\1").replace(new Regex("(^|\\n)#{1,6}\\s+", (Set<? extends EnumC688760Qzy>) Collections.singleton(enumC688760Qzy)).replace(strReplace, "$1"), "$2"), "$2"), "$1"), "$1")).toString();
        }
        return spannedLIZ;
    }

    public static Layout LIZ(int i, CharSequence charSequence, boolean z, Integer num) {
        int i2;
        int iLIZIZ;
        C444830HcP c444830HcP = new C444830HcP();
        c444830HcP.LIZLLL = true;
        c444830HcP.LJIILL(i);
        if (z) {
            i2 = 41;
        } else {
            i2 = 51;
        }
        c444830HcP.LJII(i2);
        if (z) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(22.5d)));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(18.2d)));
        }
        c444830HcP.LJIIIIZZ(iLIZIZ);
        if (num != null) {
            c444830HcP.LJIILJJIL(num.intValue());
        }
        c444830HcP.LIZIZ.LJ = i;
        c444830HcP.LJIILIIL(charSequence);
        return c444830HcP.LIZIZ();
    }
}
