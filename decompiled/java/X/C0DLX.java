package X;

import java.util.Iterator;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0DLX, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DLX {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZJ(String str) {
        Iterator it2 = C1697810uHb.LJIIJJI("<data-inline\\s+[^>]*>.*?</data-inline>", "<data-block-force-zero-left\\s+[^>]*>.*?</data-block-force-zero-left>", "<data-block\\s+[^>]*>.*?</data-block>", "<data-inline-no-margin\\s+[^>]*>.*?</data-inline-no-margin>", "<data-inline-force-zero-left\\s+[^>]*>.*?</data-inline-force-zero-left>").iterator();
        while (it2.hasNext()) {
            str = new Regex((String) it2.next(), EnumC688760Qzy.DOT_MATCHES_ALL).replace(str, "[PLACEHOLDER]");
        }
        return str;
    }

    public static boolean LIZ(String str, String str2) {
        Iterator it2 = C1697810uHb.LJIIJJI("<data-inline\\s+[^>]*>.*?</data-inline>", "<data-block-force-zero-left\\s+[^>]*>.*?</data-block-force-zero-left>", "<data-block\\s+[^>]*>.*?</data-block>").iterator();
        while (it2.hasNext()) {
            Regex regex = new Regex((String) it2.next(), EnumC688760Qzy.DOT_MATCHES_ALL);
            if (C09RB.LJFF(Regex.findAll$default(regex, str, 0, 2, null)) != C09RB.LJFF(Regex.findAll$default(regex, str2, 0, 2, null)) || !Intrinsics.LJFF(C09RB.LJJII(new C08LY(Regex.findAll$default(regex, str, 0, 2, null), AFwS232S0000000_4.get$arr$(195))), C09RB.LJJII(new C08LY(Regex.findAll$default(regex, str2, 0, 2, null), AFwS232S0000000_4.get$arr$(194))))) {
                return true;
            }
        }
        return false;
    }

    public static int LIZIZ(String str, String str2) {
        int iMin = Math.min(str.length(), str2.length());
        int i = 0;
        for (int i2 = 0; i2 < iMin && str.charAt(i2) == str2.charAt(i2); i2++) {
            i++;
        }
        return i;
    }
}
