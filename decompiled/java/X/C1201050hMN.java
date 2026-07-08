package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hMN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1201050hMN {
    public static final C1201050hMN LIZ = new C1201050hMN();

    public static void LJFF(EnumC1201080hMQ enumC1201080hMQ) {
        JSONObject jSONObject = new JSONObject();
        C2365509Or.LIZLLL(jSONObject, "enter_from", "personal_homepage");
        C2365509Or.LIZLLL(jSONObject, "retag_enter_method", "video");
        C2365509Or.LIZLLL(jSONObject, "action", enumC1201080hMQ.getValue());
        C1185040gwY.LIZ.getClass();
        C1185040gwY.LIZJ("retag_popup_click", jSONObject, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r5, java.lang.Boolean r6) {
        /*
            if (r5 == 0) goto L13
            com.ss.android.ugc.aweme.poi.PoiReTagInfo r0 = r5.getPoiReTagInfo()
            if (r0 == 0) goto L13
            boolean r1 = r0.showPoiReTagBanner()
            r0 = 1
            if (r1 != r0) goto L13
        Lf:
            r4 = 0
            if (r0 != 0) goto L15
            return r4
        L13:
            r0 = 0
            goto Lf
        L15:
            com.ss.android.ugc.aweme.poi.PoiReTagInfo r0 = r5.getPoiReTagInfo()
            if (r0 == 0) goto L27
            java.util.List r0 = r0.getPoiReTagRecPoiList()
            if (r0 == 0) goto L27
            java.lang.Object r4 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.poi.RecPoiItemModel r4 = (com.ss.android.ugc.aweme.poi.RecPoiItemModel) r4
        L27:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.lang.String r2 = ""
            if (r4 == 0) goto L36
            java.lang.String r1 = r4.getCityCode()
            if (r1 != 0) goto L37
        L36:
            r1 = r2
        L37:
            java.lang.String r0 = "poi_city"
            r3.put(r0, r1)
            if (r4 == 0) goto L45
            java.lang.String r0 = r4.getCountryCode()
            if (r0 == 0) goto L45
            r2 = r0
        L45:
            java.lang.String r0 = "poi_region_code"
            r3.put(r0, r2)
            java.lang.String r1 = "recall_source"
            java.lang.String r0 = "banner_retag_poi_directly"
            r3.put(r1, r0)
            if (r6 == 0) goto L60
            boolean r0 = r6.booleanValue()
            if (r0 == 0) goto L61
            java.lang.String r1 = "1"
        L5b:
            java.lang.String r0 = "has_popup_show"
            r3.put(r0, r1)
        L60:
            return r3
        L61:
            java.lang.String r1 = "0"
            goto L5b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1201050hMN.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Boolean):java.util.Map");
    }

    public static void LJI(Map map, Map map2) {
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (!map.containsKey(key)) {
                    map.put(key, value);
                }
            }
        }
    }

    public static void LJII(String str, Map map) {
        if (str == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && next.length() != 0 && !map.containsKey(next)) {
                    String strOptString = jSONObject.optString(next);
                    if (strOptString.length() > 0) {
                        map.put(next, strOptString);
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZLLL(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("author_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("group_id", str3);
        C1189060h32.LJIJI(linkedHashMap, "after_post_days", str4);
        C1189060h32.LJIJI(linkedHashMap, "retag_enter_method", str5);
        if (num != null) {
            linkedHashMap.put("aweme_type", String.valueOf(num.intValue()));
        }
        C1189060h32.LJIJI(linkedHashMap, "poi_id", str6);
        C1189060h32.LJIJI(linkedHashMap, "collect_info", str7);
        LJII(str7, linkedHashMap);
        LJI(linkedHashMap, map);
        C20684815ws.LJIILLIIL("re_tag_entrance_show", linkedHashMap);
    }

    public static void LIZIZ(String str, String str2, String str3, boolean z, Integer num, String str4, String str5, String str6, String str7, Map map) {
        String str8;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (str == null) {
                str = "";
            }
            linkedHashMap.put("enter_from", str);
            if (str2 == null) {
                str2 = "";
            }
            linkedHashMap.put("author_id", str2);
            if (str3 == null) {
                str3 = "";
            }
            linkedHashMap.put("group_id", str3);
            if (z) {
                str8 = "1";
            } else {
                str8 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_enter", str8);
            C1189060h32.LJIJI(linkedHashMap, "after_post_days", str4);
            C1189060h32.LJIJI(linkedHashMap, "retag_enter_method", str5);
            C1189060h32.LJIJI(linkedHashMap, "poi_id", str6);
            C1189060h32.LJIJI(linkedHashMap, "collect_info", str7);
            if (num != null) {
                linkedHashMap.put("aweme_type", String.valueOf(num.intValue()));
            }
            LJII(str7, linkedHashMap);
            LJI(linkedHashMap, map);
            C20684815ws.LJIILLIIL("re_tag_entrance_click", linkedHashMap);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_RETAG;
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, "mob_entrance_click", null, e);
        }
    }
}
