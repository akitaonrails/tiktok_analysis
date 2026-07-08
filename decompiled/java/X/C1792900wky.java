package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wky, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1792900wky {
    public static void LIZ(C1792840wks c1792840wks) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        C117100cT.LIZ("error_code", c1792840wks.LIZ, jSONObject);
        C117100cT.LIZ("detail_error_code", c1792840wks.LIZIZ, jSONObject);
        C117100cT.LIZIZ("message", c1792840wks.LJ, jSONObject2);
        InterfaceC1794350wnJ interfaceC1794350wnJLJ = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
        EnumC1794330wnH enumC1794330wnH = EnumC1794330wnH.MONITOR;
        C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
        c1794310wnF.getClass();
        c1794310wnF.LIZ(enumC1794330wnH, "livesdk_iap_precheck_fail", jSONObject, null, jSONObject2);
    }

    public static void LIZIZ(boolean z, List list, EnumC1791830wjF enumC1791830wjF, C1792840wks c1792840wks, List list2) {
        boolean zLJ;
        int size;
        EnumC1794330wnH enumC1794330wnH;
        String str;
        if (z) {
            ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL();
            zLJ = C1795410wp1.LJ(0.1d, "ttlive_livesdk_iap_find_order_product_success");
        } else {
            ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LIZLLL();
            zLJ = C1795410wp1.LJ(0.0d, "ttlive_livesdk_iap_find_order_product_fail");
        }
        if (!zLJ) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (enumC1791830wjF != null) {
            C117100cT.LIZIZ("paymentMethod", enumC1791830wjF.channelName, jSONObject);
            if (enumC1791830wjF.equals(EnumC1791830wjF.GOOGLE)) {
                C117100cT.LIZIZ("channel_api_version", C1792910wkz.LIZ, jSONObject);
                C117100cT.LIZIZ("channel_sdk_version", C1792910wkz.LIZIZ, jSONObject);
            }
        }
        C117100cT.LIZ("error_code", c1792840wks.LIZ, jSONObject);
        C117100cT.LIZ("detail_error_code", c1792840wks.LIZIZ, jSONObject);
        C117100cT.LIZIZ("message", c1792840wks.LJ, jSONObject2);
        C1792850wkt.LIZ(c1792840wks.LIZ, c1792840wks.LIZIZ, c1792840wks.LJ, jSONObject);
        int size2 = -1;
        if (list != null) {
            size = list.size();
            C117100cT.LIZIZ("productIds", list.toString(), jSONObject2);
        } else {
            size = -1;
        }
        C117100cT.LIZ("productIdSize", size, jSONObject);
        if (list2 != null) {
            ArrayList arrayList = (ArrayList) list2;
            size2 = arrayList.size();
            if (!arrayList.isEmpty()) {
                C117100cT.LIZIZ("currency", ((AbstractC1791620wiu) ListProtector.get(list2, 0)).LIZJ(), jSONObject);
            }
        }
        C117100cT.LIZ("iapProductCount", size2, jSONObject);
        InterfaceC1794350wnJ interfaceC1794350wnJLJ = ((C1794240wn8) C1794240wn8.LJIIIIZZ()).LJ();
        if (z) {
            enumC1794330wnH = EnumC1794330wnH.MONITOR;
        } else {
            enumC1794330wnH = EnumC1794330wnH.BOTH;
        }
        if (z) {
            str = "livesdk_iap_find_order_product_success";
        } else {
            str = "livesdk_iap_find_order_product_fail";
        }
        C1794310wnF c1794310wnF = (C1794310wnF) interfaceC1794350wnJLJ;
        c1794310wnF.getClass();
        c1794310wnF.LIZ(enumC1794330wnH, str, jSONObject, null, jSONObject2);
    }
}
