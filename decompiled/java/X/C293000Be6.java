package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.lynx.core.config.SearchResultConfig;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Be6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C293000Be6 {
    public static final Map<String, String> LIZ = C2097608Jq.LJIIIIZZ(new Pair("all", "aweme://lynxview?use_spark=1&bdhm_bid=tt_search_lynx&channel=fe_search_vertical_card_place_tab_all&share_group=1&group=searchls&bundle=place_tab_all%2Ftemplate.js&bdhm_pid=local-service-place-tab-all&target_handler=search_general&preload_storage_keys=%5Btt_poi_search_permission%5D&dynamic=3&enable_memory_cache=1&parallel_fetch_resource=1&use_spark_lite=1&enable_extra_info=1&url=https%3A%2F%2Fsf-teko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2F8%2Fteko%2Fresource%2Ffe_search_vertical_card_place_tab_all%2Fplace_tab_all%2Ftemplate.js"), new Pair("deals", ""));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2445));

    public static String LIZ(String str) {
        n nVar;
        k kVarLJJIIZ;
        String strLJIL;
        if (Intrinsics.LJFF(str, "all")) {
            return "aweme://lynxview?use_spark=1&bdhm_bid=tt_search_lynx&channel=fe_search_vertical_card_place_tab_all&share_group=1&group=searchls&bundle=place_tab_all%2Ftemplate.js&bdhm_pid=local-service-place-tab-all&target_handler=search_general&preload_storage_keys=%5Btt_poi_search_permission%5D&dynamic=3&enable_memory_cache=1&parallel_fetch_resource=1&use_spark_lite=1&enable_extra_info=1&url=https%3A%2F%2Fsf-teko-source.tiktokcdn.com%2Fobj%2Ftiktok-teko-source-sg%2F8%2Fteko%2Fresource%2Ffe_search_vertical_card_place_tab_all%2Fplace_tab_all%2Ftemplate.js";
        }
        if (Intrinsics.LJFF(str, "deals")) {
            SearchResultConfig searchResultConfigLIZ = C301880BsQ.LIZ();
            if (searchResultConfigLIZ != null && (nVar = searchResultConfigLIZ.verticalPlace) != null && (kVarLJJIIZ = nVar.LJJIIZ("schema")) != null && (strLJIL = kVarLJJIIZ.LJIL()) != null) {
                return strLJIL;
            }
            return "aweme://lynxview/?channel=fe_search_vertical_lynx&target_handler=search_vertical&bundle=vertical-poi/template.js&use_spark=1&preload_storage_keys=[tt_poi_search_permission]&ab_params=enable_search_network_jsb,show_poi_vertical_search,show_poi_vertical_search_collect,vertical_search_single_feedback,show_single_feedback_V2,tt_search_pressed_state,search_rounded_corners_UI_style_optimization,search_aid_feedback,enable_new_poi_card,refactor_search_vertical&surl=https://lf-main-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/8/gecko/resource/fe_search_vertical_lynx/vertical-poi/template.js";
        }
        return null;
    }

    public static String LIZIZ(String str) {
        boolean z;
        try {
            String str2 = (String) ((Map) LIZIZ.getValue()).get(str);
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return LIZ(str);
            }
            return str2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return LIZ(str);
        }
    }
}
