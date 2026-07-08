package X;

import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0PhW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651840PhW {
    public static final List<String> LIZ = C1697810uHb.LJIILJJIL("aweme://lynxview/?channel=fe_search_card_lynx_2&bundle=comment/template.js", "aweme://lynxview/?channel=fe_search_vertical_card_ai_fuzzy_lite&bundle=fe_search_vertical_card_ai_fuzzy_lite/template.js");
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4142));

    public static boolean LIZ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        DynamicPatch dynamicPatch = new DynamicPatch();
        dynamicPatch.schema = str;
        C651860PhY c651860PhY = new C651860PhY(dynamicPatch);
        List list = (List) LIZIZ.getValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C651880Pha c651880Pha = new C651880Pha((String) it2.next());
            if (c651860PhY.LIZ(c651880Pha.LIZIZ(), c651880Pha.LIZ())) {
                return true;
            }
        }
        return false;
    }
}
