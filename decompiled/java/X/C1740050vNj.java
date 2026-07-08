package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.0vNj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1740050vNj {
    public static final C1740050vNj LIZ = new C1740050vNj();

    public static void LIZ(C1740050vNj c1740050vNj, String str, Long l, String str2, String str3, Integer num, Object obj, Integer num2, Integer num3, int i) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            num = null;
        }
        if ((i & 64) != 0) {
            obj = null;
        }
        if ((i & 128) != 0) {
            num2 = null;
        }
        if ((i & 256) != 0) {
            num3 = null;
        }
        c1740050vNj.getClass();
        C1768000w6o c1768000w6o = C1768000w6o.LIZ;
        HashMap map = new HashMap();
        map.put("step", str);
        if (l != null) {
            map.put("duration_mall_router_to_landing_router", String.valueOf(l.longValue()));
        }
        if (str2 != null) {
            map.put("next_schema", str2);
        }
        if (str3 != null) {
            map.put("pay_type", str3);
        }
        if (num != null) {
            map.put("pay_to_mall_method", String.valueOf(num.intValue()));
        }
        if (obj != null) {
            map.put("pay_to_mall_source", obj.toString());
        }
        if (num2 != null) {
            map.put("landing_schema_cached", String.valueOf(num2.intValue()));
        }
        if (num3 != null) {
            map.put("is_mall_tab_selected", String.valueOf(num3.intValue()));
        }
        c1768000w6o.getClass();
        C1768000w6o.LIZIZ("rd_tiktokec_pay_to_mall_chain", map);
    }
}
