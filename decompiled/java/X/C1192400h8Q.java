package X;

import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0h8Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192400h8Q {
    public static final C1192400h8Q LIZ = new C1192400h8Q();

    public static String LIZ() {
        InterfaceC1207490hWl interfaceC1207490hWl = (InterfaceC1207490hWl) PluggableExtentionKt.pluggableSpi$default(ILocationService.class, false, false, false, 14, null);
        return (interfaceC1207490hWl == null || !interfaceC1207490hWl.LJII(0, C1BWL.LIZ())) ? CardStruct.IStatusCode.DEFAULT : "1";
    }

    public static void LIZIZ(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1189060h32.LJIJI(linkedHashMap, "enter_from", str);
        C1189060h32.LJIJI(linkedHashMap, "interact_type", str2);
        C20684815ws.LJIILLIIL("map_page_interact", linkedHashMap);
    }

    public static void LIZJ(PageFinder pageFinder, String str, String str2) {
        Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c0.d0", pageFinder, null, 4, null);
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1189060h32.LJIJI(linkedHashMap, "banner_type", str);
        C1189060h32.LJIJI(linkedHashMap, "ticket_id", str2);
        LIZ.getClass();
        C1189060h32.LJIJI(linkedHashMap, "enable_location", LIZ());
        C1189060h32.LJIJI(linkedHashMap, "current_page", "post_inner_page");
        if (!mapCreateReportParams$default.isEmpty()) {
            for (Map.Entry entry : mapCreateReportParams$default.entrySet()) {
                C1189060h32.LJIJI(linkedHashMap, entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        C1185050gwZ c1185050gwZ = new C1185050gwZ(pageFinder);
        c1185040gwY.getClass();
        C1185040gwY.LJFF("poi_review_status_banner_click", linkedHashMap, c1185050gwZ);
    }

    public static void LIZLLL(PageFinder pageFinder, String str, String str2) {
        Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c0.d0", pageFinder, null, 4, null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1189060h32.LJIJI(linkedHashMap, "banner_type", str);
        C1189060h32.LJIJI(linkedHashMap, "ticket_id", str2);
        LIZ.getClass();
        C1189060h32.LJIJI(linkedHashMap, "enable_location", LIZ());
        C1189060h32.LJIJI(linkedHashMap, "current_page", "post_inner_page");
        if (!mapCreateReportParams$default.isEmpty()) {
            for (Map.Entry entry : mapCreateReportParams$default.entrySet()) {
                C1189060h32.LJIJI(linkedHashMap, entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        C20684815ws.LJIILLIIL("poi_review_status_banner_show", linkedHashMap);
    }
}
