package X;

import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0P91, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P91 {
    public static final Map<String, String> LIZ(SearchResultParam searchResultParam) {
        ISearchContextAbility iSearchContextAbilityLIZLLL;
        C0PCY<C640110P8v> c0pcySL1;
        C640110P8v c640110P8v;
        Map<String, String> map;
        ISearchContextAbility iSearchContextAbilityLIZLLL2;
        C0PCY<C640110P8v> c0pcySL12;
        C640110P8v c640110P8v2;
        Map<String, String> map2;
        if (C1210504oR.LIZ()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (searchResultParam != null && (iSearchContextAbilityLIZLLL2 = C0Q3E.LIZLLL(searchResultParam)) != null && (c0pcySL12 = iSearchContextAbilityLIZLLL2.SL1()) != null && (c640110P8v2 = (C640110P8v) c0pcySL12.LIZJ()) != null && (map2 = c640110P8v2.LL) != null) {
                linkedHashMap.putAll(map2);
            }
            linkedHashMap.put("multi_virtual_rs", "1");
            return linkedHashMap;
        }
        if (searchResultParam != null && (iSearchContextAbilityLIZLLL = C0Q3E.LIZLLL(searchResultParam)) != null && (c0pcySL1 = iSearchContextAbilityLIZLLL.SL1()) != null && (c640110P8v = (C640110P8v) c0pcySL1.LIZJ()) != null && (map = c640110P8v.LL) != null) {
            return map;
        }
        return null;
    }
}
