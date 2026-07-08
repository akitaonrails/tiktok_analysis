package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.n;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.model.SearchLiveList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.0PZ6, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PZ6 {
    public static void LIZ(SearchLiveList searchLiveList, n nVar, List list) {
        Object objLJJII;
        nVar.LJJIII(Long.valueOf(searchLiveList.cursor), "cursor");
        nVar.LJJII(Boolean.valueOf(searchLiveList.hasMore), "has_more");
        List<Map<?, ?>> list2 = searchLiveList.liveListRaw;
        if (list2 == null || (objLJJII = C09RB.LJJII(new C08LY(new C1939607ik(list2), new AwS582S0100000_3(list, (List<C0O27>) 163)))) == null) {
            objLJJII = C13BV.INSTANCE;
        }
        C1227904rF.LIZ.getClass();
        nVar.LJJIFFI("data", GsonProtectorUtils.toJsonTree(C1227904rF.LIZLLL(), objLJJII));
        nVar.LJJIFFI("extra_data", GsonProtectorUtils.toJsonTree(C1227904rF.LIZLLL(), searchLiveList.LJ()));
        nVar.LJJIFFI("search_nil_text", GsonProtectorUtils.toJsonTree(C1227904rF.LIZLLL(), searchLiveList.searchNilText));
        nVar.LJJIFFI("search_nil_info", GsonProtectorUtils.toJsonTree(C1227904rF.LIZLLL(), searchLiveList.searchNilInfo));
        nVar.LJJIFFI("log_pb", GsonProtectorUtils.toJsonTree(C1227904rF.LIZLLL(), searchLiveList.logPb));
        nVar.LJJIFFI("global_doodle_config", GsonProtectorUtils.toJsonTree(C1227904rF.LIZLLL(), searchLiveList.globalDoodleConfig));
        nVar.LJJIFFI("header", GsonProtectorUtils.toJsonTree(C1227904rF.LIZLLL(), searchLiveList.dynamicHeader));
        nVar.LJJIFFI("mask_layer", GsonProtectorUtils.toJsonTree(C1227904rF.LIZLLL(), searchLiveList.dynamicMask));
        nVar.LJJIFFI("components", GsonProtectorUtils.toJsonTree(C1227904rF.LIZLLL(), searchLiveList.components));
        nVar.LJJIII(Integer.valueOf(searchLiveList.itemCount), "item_count");
        nVar.LJJIIJ("requestId", searchLiveList.getRequestId());
        nVar.LJJIII(Integer.valueOf(searchLiveList.status_code), "status_code");
        nVar.LJJIII(Integer.valueOf(searchLiveList.error_code), "error_code");
        nVar.LJJIFFI("extra", GsonProtectorUtils.toJsonTree(C1227904rF.LIZLLL(), searchLiveList.extra));
        nVar.LJJIII(searchLiveList.rawTimestamp, "raw_timestamp");
        nVar.LJJII(Boolean.valueOf(C0BY5.LIZ()), "livePerfOptEnabled");
    }
}
