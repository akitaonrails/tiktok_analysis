package X;

import com.bytedance.scene.Scene;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0vWB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745290vWB {
    public static final Map<String, Object> LIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("page_name", "trajectory_map_for_address");
        LIZ = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x003f A[PHI: r2
      0x003f: PHI (r2v7 java.lang.String) = (r2v0 java.lang.String), (r2v8 java.lang.String) binds: [B:25:0x003d, B:23:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0047 A[PHI: r2
      0x0047: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v7 java.lang.String), (r2v7 java.lang.String) binds: [B:25:0x003d, B:27:0x0041, B:29:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.String r7, com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter.AddressMapDetailEnterParams r8) {
        /*
            r6 = 0
            if (r8 == 0) goto L95
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r0 = r8.address
        L5:
            r5 = 0
            if (r0 != 0) goto L30
            java.lang.String r4 = "shipping_address_error"
        La:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r1 = ""
            if (r7 != 0) goto L14
            r7 = r1
        L14:
            java.lang.String r0 = "schema"
            r2.put(r0, r7)
            if (r8 == 0) goto L20
            java.lang.String r0 = r8.enterFrom
            if (r0 == 0) goto L20
            r1 = r0
        L20:
            java.lang.String r0 = "enter_from"
            r2.put(r0, r1)
            java.lang.String r0 = "error_info"
            r2.put(r0, r4)
            java.lang.String r0 = "tiktokec_rd_address_map_schema_error"
            X.C1018503yZ.LIZIZ(r0, r2, r5)
        L2f:
            return
        L30:
            java.lang.String r3 = "0"
            if (r8 == 0) goto L3c
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r0 = r8.address
            if (r0 == 0) goto L3c
            java.lang.String r2 = r0.latitude
            if (r2 != 0) goto L3f
        L3c:
            r2 = r3
            if (r8 == 0) goto L47
        L3f:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r0 = r8.address
            if (r0 == 0) goto L47
            java.lang.String r1 = r0.longitude
            if (r1 != 0) goto L48
        L47:
            r1 = r3
        L48:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r3)
            if (r0 == 0) goto L8f
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r3)
            if (r0 == 0) goto L8f
            java.lang.String r4 = "location_error"
        L56:
            if (r8 == 0) goto L91
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r0 = r8.address
            if (r0 == 0) goto L91
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem> r0 = r0.items
            if (r0 == 0) goto L91
            java.util.Iterator r3 = r0.iterator()
        L64:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem) r0
            java.lang.String r1 = r0.key
            java.lang.String r0 = "address"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L64
        L7b:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem r2 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem) r2
            if (r2 == 0) goto L91
            java.lang.String r0 = r2.value
            if (r0 == 0) goto L91
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 != 0) goto L91
            if (r4 == 0) goto L2f
            goto La
        L8d:
            r2 = r6
            goto L7b
        L8f:
            r4 = r6
            goto L56
        L91:
            java.lang.String r4 = "address_error"
            goto La
        L95:
            r0 = r6
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1745290vWB.LIZ(java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter$AddressMapDetailEnterParams):void");
    }

    public static void LIZIZ(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("previous_page", str);
        linkedHashMap.put("button_name", str2);
        LJFF("tiktokec_button_click", linkedHashMap);
    }

    public static void LIZJ(String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("previous_page", str);
        linkedHashMap.put("button_name", str2);
        LJFF("tiktokec_button_show", linkedHashMap);
    }

    public static void LJFF(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LIZ);
        linkedHashMap.putAll(map);
        C1018503yZ.LIZIZ(str, linkedHashMap, false);
    }

    public static void LIZLLL(long j, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(Scene.SCENE_SERVICE, str);
        linkedHashMap.put("type", "googleMap");
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("enter_from", str2);
        linkedHashMap.put("duration", Long.valueOf(j));
        C1018503yZ.LIZIZ("tiktokec_address_map_render", linkedHashMap, false);
    }

    public static void LJ(Integer num, String str, String str2, Long l, String str3) {
        int iIntValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("previous_page", str);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        linkedHashMap.put("is_load_data", Integer.valueOf(iIntValue));
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("entrance_info", str2);
        linkedHashMap.put("quit_type", str3);
        if (l != null) {
            linkedHashMap.put("stay_time", Long.valueOf(l.longValue()));
        }
        LJFF("tiktokec_stay_page", linkedHashMap);
    }
}
