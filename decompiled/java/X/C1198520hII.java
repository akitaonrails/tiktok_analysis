package X;

import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hII, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1198520hII {
    public static final C1198520hII LIZ = new C1198520hII();

    public static void LIZLLL(EnumC1198660hIW enumC1198660hIW) {
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        JSONObject jSONObject = new JSONObject();
        C2365509Or.LIZLLL(jSONObject, "enter_from", "search_poi");
        C2365509Or.LIZLLL(jSONObject, "action_type", enumC1198660hIW.getValue());
        Keva keva = C1198650hIV.LIZIZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("poi_search_precise_gps_banner_show_index");
        sbLIZ.append('_');
        sbLIZ.append((String) C1198650hIV.LIZJ.getValue());
        C2365509Or.LIZLLL(jSONObject, "show_index", Integer.valueOf(keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0)));
        c1185040gwY.getClass();
        C1185040gwY.LIZJ("show_precise_banner", jSONObject, null);
    }

    public static void LIZJ(String str, String str2, String str3, Integer num, Map map, String str4, String str5, String str6, Integer num2, PageFinder pageFinder) {
        Map<String, String> linkedHashMap;
        int iHashCode;
        C1185040gwY c1185040gwY = C1185040gwY.LIZ;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("enter_from", str);
        linkedHashMap2.put("enter_method", str2);
        if (str3 != null) {
            linkedHashMap2.put("log_id", str3);
        }
        if (num != null) {
            linkedHashMap2.put("aweme_type", String.valueOf(num.intValue()));
        }
        C1197920hHK.LIZ.getClass();
        linkedHashMap2.put("lbs_content_rec_type", C1197920hHK.LIZIZ());
        C1189060h32.LJIJJ(linkedHashMap2, map);
        C1189060h32.LJJ("retag_enter_method", str4, linkedHashMap2);
        if (str4 != null && ((iHashCode = str4.hashCode()) == -1866131019 ? str4.equals("edit_post") : iHashCode == 100344454 ? str4.equals("inbox") : !(iHashCode != 112202875 || !str4.equals("video")))) {
            C1189060h32.LJJ("after_post_days", str5, linkedHashMap2);
        }
        String string = null;
        linkedHashMap2.putAll(C1200530hLX.LIZIZ(null, "enter_poi_search"));
        IPoiService iPoiService = (IPoiService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
        if (iPoiService == null || (linkedHashMap = iPoiService.LLII()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        linkedHashMap2.putAll(linkedHashMap);
        C1189060h32.LJIJI(linkedHashMap2, "use_method", str6);
        if (num2 != null) {
            string = num2.toString();
        }
        C1189060h32.LJIJI(linkedHashMap2, "display_index", string);
        if (pageFinder != null) {
            Map mapCreateReportParams$default = BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c0.d0", pageFinder, null, 4, null);
            if (!mapCreateReportParams$default.isEmpty()) {
                for (Map.Entry entry : mapCreateReportParams$default.entrySet()) {
                    C1189060h32.LJIJI(linkedHashMap2, entry.getKey(), String.valueOf(entry.getValue()));
                }
            }
        }
        C1189060h32.LJIJI(linkedHashMap2, "current_page", str);
        c1185040gwY.getClass();
        C1185040gwY.LIZIZ("enter_poi_search", linkedHashMap2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16, java.lang.String r17, java.lang.String r18, com.ss.android.ugc.aweme.poi.PoiData r19, java.lang.String r20, java.lang.Long r21, java.lang.Boolean r22, com.ss.android.ugc.aweme.poi.PoiMobParam r23, java.lang.Integer r24, X.InterfaceC665370Q7z r25, java.lang.Integer r26, java.lang.String r27, boolean r28, java.lang.String r29, java.lang.String r30, java.util.Map r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, com.bytedance.android.btm.api.model.PageFinder r35) {
        /*
            Method dump skipped, instruction units count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1198520hII.LIZ(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.poi.PoiData, java.lang.String, java.lang.Long, java.lang.Boolean, com.ss.android.ugc.aweme.poi.PoiMobParam, java.lang.Integer, X.0Q7z, java.lang.Integer, java.lang.String, boolean, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.lang.String, com.bytedance.android.btm.api.model.PageFinder):void");
    }
}
