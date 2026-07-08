package X;

import java.util.Map;

/* JADX INFO: renamed from: X.0JAa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487540JAa {
    public static final void LIZ(C2344009Gk c2344009Gk, Map map) {
        String str;
        for (String str2 : C1697810uHb.LJIIJJI("search_id", "search_keyword", "search_result_id", "token_type", "search_type", "list_item_id", "search_third_item_id")) {
            if (map != null && (str = (String) map.get(str2)) != null && C123100dR.LIZ(str)) {
                c2344009Gk.LJFF(str2, str);
            }
        }
    }
}
