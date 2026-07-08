package X;

import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.04CA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04CA {
    public static final /* synthetic */ int LIZ = 0;

    public static C04CB LIZLLL(Voucher voucher) {
        return LIZJ(Boolean.FALSE, C1697810uHb.LJIILJJIL(voucher));
    }

    public static void LIZ(List list, Map map) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Map map2 : (ArrayList) list) {
            Object obj = map2.get("campaign_id");
            if (obj != null && !linkedHashSet.contains(obj)) {
                linkedHashSet.add(obj);
                Object obj2 = map2.get("campaign_user_tag");
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
                Object obj3 = map2.get("campaign_type");
                if (obj3 != null) {
                    arrayList3.add(obj3);
                }
                Object obj4 = map2.get("campaign_channel");
                if (obj4 != null) {
                    arrayList2.add(obj4);
                }
            }
            Object obj5 = map2.get("campaign_cost_role");
            if (obj5 != null) {
                arrayList4.add(obj5);
            }
        }
        if (linkedHashSet.isEmpty()) {
            return;
        }
        map.put("campaign_id", C13LP.LJJLIIIJ(linkedHashSet, ",", null, null, 0, null, null, 62));
        map.put("campaign_user_tag", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
        map.put("campaign_type", C13LP.LJJLIIIJ(arrayList3, ",", null, null, 0, null, null, 62));
        map.put("campaign_channel", C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62));
        map.put("campaign_cost_role", C13LP.LJJLIIIJ(arrayList4, ",", null, null, 0, null, null, 62));
    }

    public static void LIZIZ(Map map, Map map2) {
        Object obj = map.get("coupon_type");
        Object obj2 = map.get("coupon_type_info");
        Object obj3 = map.get("coupon_cost_role");
        Object obj4 = map.get("coupon_name");
        Object obj5 = map.get("coupon_id");
        Object obj6 = map.get("coupon_type_id");
        map2.put("coupon_type", String.valueOf(obj));
        map2.put("coupon_type_info", String.valueOf(obj2));
        map2.put("coupon_cost_role", String.valueOf(obj3));
        map2.put("coupon_name", String.valueOf(obj4));
        map2.put("coupon_id", String.valueOf(obj5));
        map2.put("coupon_type_id", String.valueOf(obj6));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0189 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C04CB LIZJ(java.lang.Boolean r29, java.util.List r30) {
        /*
            Method dump skipped, instruction units count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04CA.LIZJ(java.lang.Boolean, java.util.List):X.04CB");
    }

    public static void LJ(C04CB c04cb, C04C7 c04c7, Map map) {
        if (map != null) {
            c04c7.LIZIZ.putAll(map);
        }
        String str = c04cb.LIZ;
        if (str != null) {
            c04c7.LIZIZ.put("coupon_id", str);
        }
        String str2 = c04cb.LIZIZ;
        if (str2 != null) {
            c04c7.LIZIZ.put("coupon_type_id", str2);
        }
        String str3 = c04cb.LIZJ;
        if (str3 != null) {
            c04c7.LIZIZ.put("coupon_name", str3);
        }
        String str4 = c04cb.LIZLLL;
        if (str4 != null) {
            c04c7.LIZIZ.put("coupon_type", str4);
        }
        String str5 = c04cb.LJ;
        if (str5 != null) {
            c04c7.LIZIZ.put("coupon_type_info", str5);
        }
        String str6 = c04cb.LJFF;
        if (str6 != null) {
            c04c7.LIZIZ.put("coupon_cost_role", str6);
        }
        String str7 = c04cb.LJI;
        if (str7 != null) {
            c04c7.LIZIZ.put("coupon_cnt", str7);
        }
        String str8 = c04cb.LJII;
        if (str8 != null) {
            c04c7.LIZIZ.put("coupon_logo_type", str8);
        }
        String str9 = c04cb.LJIIIIZZ;
        if (str9 != null) {
            c04c7.LIZIZ.put("instance_key", str9);
        }
        String str10 = c04cb.LJIIIZ;
        if (str10 != null) {
            c04c7.LIZIZ.put("benefit_type", str10);
        }
    }
}
