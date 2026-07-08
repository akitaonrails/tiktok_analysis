package X;

import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.042q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10342042q {
    public static final Set<String> LIZ = C13LQ.LJLIIL(new String[]{"template_id", "enter_from_info", "traffic_source_list", "source", "source_info", "author_id", "room_id", "track_id", "chain_key"});

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZ(java.util.Map r6, java.lang.Integer r7, java.util.Map r8) {
        /*
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            if (r6 == 0) goto L3b
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L14:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r3 = r4.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.util.Set<java.lang.String> r1 = X.C10342042q.LIZ
            java.lang.Object r0 = r3.getKey()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L14
            java.lang.Object r1 = r3.getKey()
            java.lang.Object r0 = r3.getValue()
            r5.put(r1, r0)
            goto L14
        L38:
            r2.putAll(r5)
        L3b:
            java.lang.String r0 = "traffic_source"
            r2.put(r0, r7)
            r3 = 0
            if (r6 == 0) goto L54
            java.lang.String r0 = "entrance_info"
            java.lang.Object r6 = r6.get(r0)
        L49:
            boolean r0 = r6 instanceof java.lang.String
            if (r0 == 0) goto L52
            java.lang.String r6 = (java.lang.String) r6
        L4f:
            if (r6 == 0) goto Lb2
            goto L56
        L52:
            r6 = r3
            goto L4f
        L54:
            r6 = r3
            goto L49
        L56:
            com.google.gson.Gson r5 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> La9
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> La9
            r0.getClass()     // Catch: com.google.gson.s -> La9
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> La9
            if (r0 == 0) goto L6b
            boolean r1 = r0.LJII     // Catch: com.google.gson.s -> La9
            r0 = 1
            if (r1 != r0) goto L6b
            goto L6c
        L6b:
            r0 = 0
        L6c:
            if (r0 == 0) goto L6f
            goto L79
        L6f:
            X.00Wc r0 = new X.00Wc     // Catch: com.google.gson.s -> La9
            r0.<init>()     // Catch: com.google.gson.s -> La9
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> La9
            goto L9c
        L79:
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            X.13JX r1 = kotlin.reflect.KTypeProjection.LIZJ     // Catch: com.google.gson.s -> La9
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> La9
            r1.getClass()     // Catch: com.google.gson.s -> La9
            kotlin.reflect.KTypeProjection r1 = X.C13JX.LIZ(r0)     // Catch: com.google.gson.s -> La9
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> La9
            kotlin.reflect.KTypeProjection r0 = X.C13JX.LIZ(r0)     // Catch: com.google.gson.s -> La9
            X.13JW r0 = X.C13LE.LJIIIZ(r4, r1, r0)     // Catch: com.google.gson.s -> La9
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> La9
        L9c:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r5, r6, r0)     // Catch: com.google.gson.s -> La9
            boolean r0 = r1 instanceof java.util.Map     // Catch: com.google.gson.s -> La9
            if (r0 != 0) goto La5
            r1 = r3
        La5:
            java.util.Map r1 = (java.util.Map) r1     // Catch: com.google.gson.s -> La9
            r3 = r1
            goto Lad
        La9:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lad:
            if (r3 == 0) goto Lb2
            r2.putAll(r3)
        Lb2:
            r2.putAll(r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10342042q.LIZ(java.util.Map, java.lang.Integer, java.util.Map):java.util.Map");
    }

    public static Map LIZIZ(Map map, Integer num, String str, Object obj, Object obj2, String str2, String str3, String str4, String str5, LaneParams laneParams, List list, List list2) {
        Object obj3;
        Object obj4;
        Object obj5;
        String str6 = str4;
        String str7 = str3;
        String str8 = str5;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("entrance_form", str);
        linkedHashMap.put("source_page_type", "pdp_shop_recommend");
        linkedHashMap.put("previous_page", "product_detail");
        linkedHashMap.put("follow_status", obj);
        linkedHashMap.put("source_previous_page", "product_detail");
        linkedHashMap.put("product_source", obj2);
        linkedHashMap.put("product_id", str2);
        if (str7 == null) {
            str7 = "";
        }
        linkedHashMap.put("track_id", str7);
        if (str6 == null) {
            str6 = "";
        }
        linkedHashMap.put("request_id", str6);
        Object obj6 = null;
        if (laneParams != null) {
            obj3 = laneParams.get("track_id");
        } else {
            obj3 = null;
        }
        linkedHashMap.put("parent_track_id", obj3);
        if (laneParams != null) {
            obj4 = laneParams.get("product_id");
        } else {
            obj4 = null;
        }
        linkedHashMap.put("parent_product_id", obj4);
        if (laneParams != null) {
            obj6 = laneParams.get("request_id");
        }
        linkedHashMap.put("parent_request_id", obj6);
        if (map == null || ((obj5 = map.get("first_source_page")) == null && (obj5 = map.get("source_page_type")) == null)) {
            obj5 = "";
        }
        linkedHashMap.put("first_source_page", obj5);
        if (str8 == null) {
            str8 = "";
        }
        linkedHashMap.put("rec_params", str8);
        linkedHashMap.put("expo_product_id_list", list);
        linkedHashMap.put("click_product_id_list", list2);
        return LIZ(map, num, linkedHashMap);
    }
}
