package X;

import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0PFa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641720PFa {
    public static final C641720PFa LIZ = new C641720PFa();
    public static final Map<C0PG4, C0PG4> LIZIZ;

    static {
        C0PG4 c0pg4 = C0PG4.BANNER;
        C0PG4 c0pg42 = C0PG4.SPECIFIC_CARD_FIRST;
        C0PG4 c0pg43 = C0PG4.FILTER;
        LIZIZ = C2097608Jq.LJIIJ(new Pair(c0pg4, c0pg4), new Pair(c0pg42, c0pg42), new Pair(c0pg43, c0pg43), new Pair(C0PG4.ENTITY, c0pg43));
    }

    public static String LIZ(SearchMixFeed searchMixFeed) {
        String alasrc = null;
        if (!((Boolean) C287920BQg.LIZ.getValue()).booleanValue() || searchMixFeed == null) {
            return null;
        }
        String[] strArr = new String[3];
        String alaSrc = searchMixFeed.getAlaSrc();
        if (alaSrc == null) {
            SearchCardInfo searchCardInfo = searchMixFeed.getSearchCardInfo();
            if (searchCardInfo != null) {
                alasrc = searchCardInfo.getAlasrc();
            }
        } else {
            alasrc = alaSrc;
        }
        strArr[0] = alasrc;
        strArr[1] = String.valueOf(searchMixFeed.docType);
        strArr[2] = String.valueOf(searchMixFeed.feedType);
        List listLJIILJJIL = C1697810uHb.LJIILJJIL(strArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIILJJIL) {
            String str = (String) obj;
            if (str != null && str.length() != 0) {
                arrayList.add(obj);
            }
        }
        return C13LP.LJJLIIIJ(arrayList, "_", null, null, 0, null, null, 62);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList r15, int r16, java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C641720PFa.LIZIZ(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList, int, java.lang.String):void");
    }
}
