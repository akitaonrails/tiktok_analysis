package X;

import android.text.format.DateFormat;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;
import com.ss.android.ugc.aweme.poi.experiment.PoiDetailYmalV2Exp;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ghB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175510ghB {
    public static SlashRequestParam LIZ(String str, String str2, String str3, String str4, List list, List list2, String str5, String str6, String str7, String str8, String str9) throws JSONException {
        String string;
        String string2;
        Integer num;
        Integer num2;
        Pair[] pairArr = new Pair[23];
        pairArr[0] = new Pair("poi_id", str);
        pairArr[1] = new Pair("group_id", str2);
        pairArr[2] = new Pair("enter_from", str3);
        pairArr[3] = new Pair("ad_click_id", str4);
        pairArr[4] = new Pair("poi_review_scene", String.valueOf(EnumC1175520ghC.POI_DETAIL_PAGE_2TAB.getValue()));
        pairArr[5] = new Pair("poi_review_count", "20");
        pairArr[6] = new Pair("poi_review_cursor", CardStruct.IStatusCode.DEFAULT);
        pairArr[7] = new Pair("region_discovery_scene", String.valueOf(EnumC1175380ggy.SCENE_REGION_POI_DETAIL.getScene()));
        pairArr[8] = new Pair("region_discovery_sub_scene", String.valueOf(EnumC1174970ggJ.CITY_INITIAL.getSubScene()));
        pairArr[9] = new Pair("region_discovery_tab_code", null);
        pairArr[10] = new Pair("poi_video_list_cursor", CardStruct.IStatusCode.DEFAULT);
        pairArr[11] = new Pair("poi_video_list_search_id", null);
        C01GW c01gw = PoiDetailYmalV2Exp.LIZ;
        PoiDetailYmalV2Exp.Config config = (PoiDetailYmalV2Exp.Config) c01gw.getValue();
        if (config == null || (num2 = config.postMaxCount) == null || (string = num2.toString()) == null) {
            string = "9";
        }
        pairArr[12] = new Pair("poi_merged_list_count", string);
        pairArr[13] = new Pair("has_more_aweme", "1");
        pairArr[14] = new Pair("has_more_review", "1");
        C1192440h8U.LIZ.getClass();
        pairArr[15] = new Pair("privacy_auth_status_query_required", String.valueOf(C1192440h8U.LIZIZ()));
        PoiDetailYmalV2Exp.Config config2 = (PoiDetailYmalV2Exp.Config) c01gw.getValue();
        if (config2 != null && (num = config2.ymalCount) != null) {
            string2 = num.toString();
        } else {
            string2 = null;
        }
        pairArr[16] = new Pair("poi_ymal_count", string2);
        pairArr[17] = new Pair("poi_ymal_cursor", CardStruct.IStatusCode.DEFAULT);
        pairArr[18] = new Pair("client_map_usable", String.valueOf(((IPoiMapService) ServiceManager.get().getService(IPoiMapService.class)).LJFF()));
        pairArr[19] = new Pair("nearby_scene", String.valueOf(EnumC1175380ggy.SCENE_NON_REGION_POI_DETAIL.getScene()));
        pairArr[20] = new Pair("poi_count", "12");
        pairArr[21] = new Pair("is_24_hours_mode", String.valueOf(DateFormat.is24HourFormat(C2213981Bky.LIZIZ.getApplicationContext())));
        pairArr[22] = new Pair("is_personalized", String.valueOf(!Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.TRUE)));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        C1189060h32.LJIJI(mapLJIIJ, "request_extra_params", str9);
        Map<String, String> mapLJJIJIIJIL = C1ER1.LIZIZ.LJJIJIIJIL(null);
        String str10 = mapLJJIJIIJIL.get("search_id");
        if (str10 != null) {
            mapLJIIJ.put("search_id", str10);
        }
        String str11 = mapLJJIJIIJIL.get("search_result_id");
        if (str11 != null) {
            mapLJIIJ.put("search_result_id", str11);
        }
        C1189060h32.LJIJI(mapLJIIJ, "initial_poi_enter_from", str5);
        C1189060h32.LJIJI(mapLJIIJ, "initial_poi_enter_method", str6);
        C1189060h32.LJIJI(mapLJIIJ, "initial_poi_from_group_id", str7);
        C1189060h32.LJIJI(mapLJIIJ, "initial_poi_id", str8);
        C1183450gtz c1183450gtz = new C1183450gtz(list, list2);
        if (C1183540gu8.LJFF) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_chunk", true);
            jSONObject.put("is_event", false);
            return new SlashRequestParam("poi", "main", jSONObject, mapLJIIJ, c1183450gtz, null);
        }
        return new SlashRequestParam("poi", "main", null, mapLJIIJ, c1183450gtz, null);
    }
}
