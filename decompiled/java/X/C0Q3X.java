package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Q3X, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q3X {
    public static final void LIZ(SearchResultParam searchResultParam, JSONObject jSONObject, String str) {
        JSONObject jSONObjectLIZ = C1294090jmR.LIZ("ecomSearchParams", jSONObject);
        if (jSONObjectLIZ != null) {
            try {
                for (Map.Entry<String, Object> entry : JsonExtKt.toMap(jSONObjectLIZ).entrySet()) {
                    searchResultParam.getEcomRecomSearchParamMap().put(entry.getKey(), entry.getValue());
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
            String strOptString = jSONObjectLIZ.optString("attach_products");
            if (C703302op.LIZ(strOptString)) {
                searchResultParam.setResultAttachCard(new C672610QZv(C0QXT.PRODUCT_CARD, strOptString, null, null, null));
            }
            if (Intrinsics.LJFF(str, "recom_search") || Intrinsics.LJFF(str, "recom_search_pic")) {
                String strOptString2 = jSONObject.optString("searchSourcePage");
                if (C703302op.LIZ(strOptString2) && Intrinsics.LJFF(strOptString2, "ecom_search_transfer")) {
                    String strOptString3 = jSONObjectLIZ.optString("sug_query_state");
                    String strOptString4 = jSONObjectLIZ.optString("sug_creator_id");
                    if (C703302op.LIZ(strOptString3)) {
                        searchResultParam.setQueryState(strOptString3);
                    }
                    if (C703302op.LIZ(strOptString4)) {
                        searchResultParam.setSugUserId(strOptString4);
                    }
                }
            }
        }
    }
}
