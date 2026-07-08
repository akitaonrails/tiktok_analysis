package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q3Y, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q3Y {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(SearchResultParam searchResultParam, Map<String, ? extends Object> map, String str, String str2) {
        String str3;
        String str4;
        Map linkedHashMap;
        Map map2;
        if (map != null) {
            try {
                for (Map.Entry entry : C2097608Jq.LJIIZILJ(map).entrySet()) {
                    searchResultParam.getEcomRecomSearchParamMap().put(entry.getKey(), entry.getValue());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
            Map<String, Object> ecExtraLogParams = searchResultParam.getSearchEnterParam().getEcExtraLogParams();
            String str5 = null;
            if (ecExtraLogParams != null) {
                Object obj = ecExtraLogParams.get("ec_result_extra_log_params");
                if (!C19719512Dh.LJII(obj) || (linkedHashMap = (Map) obj) == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                Object obj2 = searchResultParam.getEcomRecomSearchParamMap().get("resultLogParams");
                if (C19719512Dh.LJII(obj2) && (map2 = (Map) obj2) != null) {
                    for (Map.Entry entry2 : map2.entrySet()) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
                if (!ecExtraLogParams.containsKey("ec_result_extra_log_params")) {
                    ecExtraLogParams.put("ec_result_extra_log_params", linkedHashMap);
                }
            }
            Object obj3 = map.get("attach_products");
            if (obj3 instanceof String) {
                str3 = (String) obj3;
            } else {
                str3 = null;
            }
            if (C703302op.LIZ(str3)) {
                searchResultParam.setResultAttachCard(new C672610QZv(C0QXT.PRODUCT_CARD, str3, null, null, null));
            }
            if ((Intrinsics.LJFF(str2, "recom_search") || Intrinsics.LJFF(str2, "recom_search_pic")) && C703302op.LIZ(str) && Intrinsics.LJFF(str, "ecom_search_transfer")) {
                Object obj4 = map.get("sug_query_state");
                if (obj4 instanceof String) {
                    str4 = (String) obj4;
                } else {
                    str4 = null;
                }
                Object obj5 = map.get("sug_creator_id");
                if (obj5 instanceof String) {
                    str5 = (String) obj5;
                }
                if (C703302op.LIZ(str4)) {
                    searchResultParam.setQueryState(str4);
                }
                if (C703302op.LIZ(str5)) {
                    searchResultParam.setSugUserId(str5);
                }
            }
        }
    }
}
