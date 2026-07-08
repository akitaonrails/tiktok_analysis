package X;

import com.ss.android.ugc.aweme.ecommerce.mall.service.IECommerceMallService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0vOA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1740320vOA {
    public static final C1740320vOA LIZ = new C1740320vOA();

    public static void LIZIZ(String str, String str2, String str3, List list) {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("error_msg", str3);
        pairArr[1] = new Pair("schema", str);
        if (str2 == null) {
            str2 = "";
        }
        pairArr[2] = new Pair("mall_extra_info", str2);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (list != null && !list.isEmpty()) {
            mapLJIIJ.put("unexpected_keys", C07TX.LIZ(list));
        }
        C1768000w6o.LIZ.getClass();
        C1768000w6o.LIZIZ("rd_tiktokec_unexpected_mall_landing_page", mapLJIIJ);
        C1740030vNh.LIZ.getClass();
    }

    public static void LIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String str8, boolean z2, boolean z3, long j, boolean z4, String str9) {
        C1768000w6o c1768000w6o = C1768000w6o.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("previous_page", C123500dV.LIZIZ(str));
        linkedHashMap.put("enter_from", ((IECommerceMallService) ServiceManager.get().getService(IECommerceMallService.class)).LJJIFFI());
        linkedHashMap.put("deeplink_type", C123500dV.LIZIZ(str2));
        linkedHashMap.put("top_product_ids", C123500dV.LIZIZ(str3));
        linkedHashMap.put("creative_id", C123500dV.LIZIZ(str4));
        linkedHashMap.put("campaign_id", C123500dV.LIZIZ(str5));
        linkedHashMap.put("url", C123500dV.LIZIZ(str6));
        linkedHashMap.put("schema", C123500dV.LIZIZ(str7));
        linkedHashMap.put("is_success", Integer.valueOf(z ? 1 : 0));
        linkedHashMap.put("error_msg", C123500dV.LIZIZ(str8));
        linkedHashMap.put("is_popup", Integer.valueOf(z2 ? 1 : 0));
        linkedHashMap.put("has_mall_tab", Integer.valueOf(z3 ? 1 : 0));
        linkedHashMap.put("shop_popup_handle_duration", Long.valueOf(j));
        linkedHashMap.put("shop_lynx_first_screen_done", Boolean.valueOf(z4));
        linkedHashMap.put("mall_extra_info", C123500dV.LIZIZ(str9));
        c1768000w6o.getClass();
        C1768000w6o.LIZ(linkedHashMap);
        C1768000w6o.LIZIZ("rd_tiktokec_deeplink_start", linkedHashMap);
    }
}
