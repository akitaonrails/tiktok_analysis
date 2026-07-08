package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Pyy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C662660Pyy {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(SearchResultParam searchResultParam) {
        if (searchResultParam == null) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "ecom_video_search");
        String keyword = searchResultParam.getKeyword();
        String str = "";
        if (keyword == null) {
            keyword = "";
        }
        linkedHashMap.put("search_keyword", keyword);
        C0QER searchEnterParam = searchResultParam.getSearchEnterParam();
        if (searchEnterParam != null) {
            C672660Qa0.LIZ.getClass();
            String strLIZJ = C672660Qa0.LIZJ(searchEnterParam);
            if (strLIZJ != null) {
                str = strLIZJ;
            }
        }
        linkedHashMap.put("search_entrance", str);
        linkedHashMap.put("end_to_end_session_id", String.valueOf(C0QES.LIZ(C0QES.LIZ, null, true, 3)));
        linkedHashMap.put("search_type", "ecom_video");
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(com.ss.android.ugc.aweme.search.model.SearchResultParam r5, java.util.Map r6, com.bytedance.android.btm.api.model.PageFinder r7) {
        /*
            X.C2097608Jq.LJ()
            if (r5 != 0) goto L15
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
        La:
            r4.putAll(r6)
            java.lang.String r1 = "search"
            java.lang.String r0 = "a2270.b0080.c0.d0"
            X.C1018703yb.LIZ(r7, r1, r0, r4)
            return
        L15:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            X.0QER r1 = r5.getSearchEnterParam()
            java.lang.String r2 = ""
            if (r1 == 0) goto L2d
            X.0Qa0 r0 = X.C672660Qa0.LIZ
            r0.getClass()
            java.lang.String r1 = X.C672660Qa0.LIZJ(r1)
            if (r1 != 0) goto L2e
        L2d:
            r1 = r2
        L2e:
            java.lang.String r0 = "enter_from"
            r4.put(r0, r1)
            java.lang.String r1 = "search_type"
            java.lang.String r0 = "ecom_video"
            r4.put(r1, r0)
            java.lang.String r1 = r5.getEnterMethod()
            if (r1 != 0) goto L41
            r1 = r2
        L41:
            java.lang.String r0 = "enter_method"
            r4.put(r0, r1)
            java.lang.String r0 = r5.getKeyword()
            if (r0 == 0) goto L4d
            r2 = r0
        L4d:
            java.lang.String r0 = "search_keyword"
            r4.put(r0, r2)
            X.0QES r3 = X.C0QES.LIZ
            r2 = 1
            r1 = 3
            r0 = 0
            java.lang.Long r0 = X.C0QES.LIZ(r3, r0, r2, r1)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "end_to_end_search_session_id"
            r4.put(r0, r1)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C662660Pyy.LIZIZ(com.ss.android.ugc.aweme.search.model.SearchResultParam, java.util.Map, com.bytedance.android.btm.api.model.PageFinder):void");
    }
}
