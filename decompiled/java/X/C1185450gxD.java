package X;

import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.slash.data.PageInfo;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gxD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185450gxD implements Serializable, InterfaceC2753014t {
    public final String LL;

    public final C1185450gxD copy(String str) {
        return new C1185450gxD(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1185450gxD) && Intrinsics.LJFF(this.LL, ((C1185450gxD) obj).LL);
    }

    public String getSourceId() {
        return "PoiDetailSessionModel";
    }

    public int hashCode() {
        String str = this.LL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailSessionModel(sessionId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getSessionId() {
        return this.LL;
    }

    public C1185450gxD(String str) {
        this.LL = str;
    }

    public final void saveGeneralTrackParams(InterfaceC665370Q7z interfaceC665370Q7z) {
        String str = this.LL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) C1182380gsG.LJII(interfaceC665370Q7z)).entrySet()) {
            C1189060h32.LJJ(entry.getKey(), (String) entry.getValue(), linkedHashMap);
        }
        C1180470gpB.LIZIZ(str, C2097908Jt.LIZJ(new Pair("poi_general_track_params", linkedHashMap)));
    }

    public final void saveMetaData(C1180620gpQ c1180620gpQ) {
        String imprId;
        PoiListApi.PoiDetailResponse poiDetailResponseLIZIZ;
        String cityCode;
        PageInfo pageInfo;
        LogPbBean logPbBean;
        PoiListApi.PoiDetailResponse poiDetailResponseLIZIZ2;
        String str = this.LL;
        Pair[] pairArr = new Pair[3];
        String collectInfo = null;
        if (c1180620gpQ != null && (poiDetailResponseLIZIZ2 = C1183670guL.LIZIZ(c1180620gpQ)) != null) {
            collectInfo = poiDetailResponseLIZIZ2.getCollectInfo();
        }
        String str2 = "";
        if (collectInfo == null) {
            collectInfo = "";
        }
        pairArr[0] = new Pair("collect_info", collectInfo);
        if (c1180620gpQ == null || (pageInfo = c1180620gpQ.LLILLL) == null || (logPbBean = pageInfo.logPb) == null || (imprId = logPbBean.getImprId()) == null) {
            imprId = "";
        }
        pairArr[1] = new Pair("log_id", imprId);
        if (c1180620gpQ != null && (poiDetailResponseLIZIZ = C1183670guL.LIZIZ(c1180620gpQ)) != null && (cityCode = poiDetailResponseLIZIZ.getCityCode()) != null) {
            str2 = cityCode;
        }
        pairArr[2] = new Pair("poi_city", str2);
        C1180470gpB.LIZIZ(str, C2097908Jt.LIZJ(new Pair("poi_meta_data", C2097608Jq.LJIIIIZZ(pairArr))));
    }

    public final void saveRouterParams(String str, C1185410gx9 c1185410gx9, Map<String, String> map) {
        String enterMethod;
        String initialEnterFrom;
        String initialEnterMethod;
        String initialPoiFromGroupId;
        String initialPoiId;
        String adClickId;
        String activitySource;
        String activityPageId;
        String requestId;
        String autoShowCalendarRoomPlanSheet;
        String str2 = this.LL;
        Pair[] pairArr = new Pair[13];
        pairArr[0] = new Pair("poi_id", str);
        String enterFrom = null;
        if (c1185410gx9 != null) {
            enterFrom = c1185410gx9.getEnterFrom();
        }
        String str3 = "";
        if (enterFrom == null) {
            enterFrom = "";
        }
        pairArr[1] = new Pair("poi_detail_enter_from", enterFrom);
        if (c1185410gx9 == null || (enterMethod = c1185410gx9.getEnterMethod()) == null) {
            enterMethod = "";
        }
        pairArr[2] = new Pair("poi_detail_enter_method", enterMethod);
        if (c1185410gx9 == null || (initialEnterFrom = c1185410gx9.getInitialEnterFrom()) == null) {
            initialEnterFrom = "";
        }
        pairArr[3] = new Pair("initial_poi_enter_from", initialEnterFrom);
        if (c1185410gx9 == null || (initialEnterMethod = c1185410gx9.getInitialEnterMethod()) == null) {
            initialEnterMethod = "";
        }
        pairArr[4] = new Pair("initial_poi_enter_method", initialEnterMethod);
        if (c1185410gx9 == null || (initialPoiFromGroupId = c1185410gx9.getInitialPoiFromGroupId()) == null) {
            initialPoiFromGroupId = "";
        }
        pairArr[5] = new Pair("initial_poi_from_group_id", initialPoiFromGroupId);
        if (c1185410gx9 == null || (initialPoiId = c1185410gx9.getInitialPoiId()) == null) {
            initialPoiId = "";
        }
        pairArr[6] = new Pair("initial_poi_id", initialPoiId);
        pairArr[7] = new Pair("search_params", map);
        if (c1185410gx9 == null || (adClickId = c1185410gx9.getAdClickId()) == null) {
            adClickId = "";
        }
        pairArr[8] = new Pair("ad_click_id", adClickId);
        if (c1185410gx9 == null || (activitySource = c1185410gx9.getActivitySource()) == null) {
            activitySource = "";
        }
        pairArr[9] = new Pair("activity_source", activitySource);
        if (c1185410gx9 == null || (activityPageId = c1185410gx9.getActivityPageId()) == null) {
            activityPageId = "";
        }
        pairArr[10] = new Pair("activity_page_id", activityPageId);
        if (c1185410gx9 == null || (requestId = c1185410gx9.getRequestId()) == null) {
            requestId = "";
        }
        pairArr[11] = new Pair("request_id", requestId);
        if (c1185410gx9 != null && (autoShowCalendarRoomPlanSheet = c1185410gx9.getAutoShowCalendarRoomPlanSheet()) != null) {
            str3 = autoShowCalendarRoomPlanSheet;
        }
        pairArr[12] = new Pair("auto_show_calendar_room_plan_sheet", str3);
        C1180470gpB.LIZIZ(str2, C2097908Jt.LIZJ(new Pair("poi_router_params", C2097608Jq.LJIIIIZZ(pairArr))));
    }
}
