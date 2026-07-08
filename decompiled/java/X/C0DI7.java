package X;

import java.util.Iterator;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.0DI7, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DI7 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(String str) {
        Iterator it2 = C1697810uHb.LJIIJJI("<data-inline\\s+[^>]*>.*?</data-inline>", "<data-block-force-zero-left\\s+[^>]*>.*?</data-block-force-zero-left>", "<data-block\\s+[^>]*>.*?</data-block>", "<data-inline-no-margin\\s+[^>]*>.*?</data-inline-no-margin>", "<data-inline-force-zero-left\\s+[^>]*>.*?</data-inline-force-zero-left>").iterator();
        while (it2.hasNext()) {
            str = new Regex((String) it2.next(), EnumC688760Qzy.DOT_MATCHES_ALL).replace(str, "[PLACEHOLDER]");
        }
        return str;
    }

    public static int LIZ(String str, String str2) {
        int iMin = Math.min(str.length(), str2.length());
        int i = 0;
        for (int i2 = 0; i2 < iMin && str.charAt(i2) == str2.charAt(i2); i2++) {
            i++;
        }
        return i;
    }
}
