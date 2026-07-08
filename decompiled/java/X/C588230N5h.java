package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0N5h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588230N5h {
    public static final Map<String, C588220N5g> LIZ = new HashMap();

    public static void LIZ(SearchResultParam searchResultParam, String str) {
        String keyword;
        String enterMethod;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (searchResultParam == null || (keyword = searchResultParam.getKeyword()) == null) {
            keyword = "";
        }
        C588220N5g c588220N5g = new C588220N5g();
        c588220N5g.LIZ = jCurrentTimeMillis;
        c588220N5g.LJ = str;
        String searchEnterFromPage = null;
        if (searchResultParam != null) {
            enterMethod = searchResultParam.getEnterMethod();
        } else {
            enterMethod = null;
        }
        c588220N5g.LIZJ = enterMethod;
        if (searchResultParam != null) {
            searchEnterFromPage = searchResultParam.getSearchEnterFromPage();
        }
        c588220N5g.LIZLLL = searchEnterFromPage;
        ((HashMap) LIZ).put(keyword, c588220N5g);
    }
}
