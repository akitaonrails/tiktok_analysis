package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.ChannelVoucherModule;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0vNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1740160vNu {
    public static final C1740160vNu LIZ = new C1740160vNu();

    public static void LIZIZ(C197039127h c197039127h, boolean z, String str) {
        if (z) {
            C1389890mGx c1389890mGx = new C1389890mGx(c197039127h);
            c1389890mGx.LJIIIZ(2131832603);
            c1389890mGx.LJIIJJI();
        } else if (C1533950q1J.LJ(str)) {
            C1389890mGx c1389890mGx2 = new C1389890mGx(c197039127h);
            c1389890mGx2.LJIIJ(str);
            c1389890mGx2.LJIIJJI();
        } else {
            C1389890mGx c1389890mGx3 = new C1389890mGx(c197039127h);
            c1389890mGx3.LJIIIZ(2131832604);
            c1389890mGx3.LJIIJJI();
        }
    }

    public static void LIZ(Context context, String str, ChannelVoucherModule channelVoucherModule, Map map) {
        String str2;
        List<? extends Map<String, Object>> list;
        C212391189t c212391189t = C212391189t.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{ \"vouchers\": ");
        String strLJIIIIZZ = null;
        if (channelVoucherModule != null && (list = channelVoucherModule.voucherList) != null) {
            strLJIIIIZZ = C1741890vQh.LJIIIIZZ(list);
        }
        sbLIZ.append(strLJIIIIZZ);
        sbLIZ.append('}');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c212391189t.getClass();
        C212391189t.LIZIZ("mall_channel_voucher_cache", "mall_channel_voucher_cache", strLIZIZ);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("lru_scene", "mall_channel_voucher_cache"), new Pair("lru_key", "mall_channel_voucher_cache"), new Pair("request_source", "24"), new Pair("traffic_source", "6"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("bizParams", C1741890vQh.LJIIIIZZ(mapLJIIIIZZ));
        linkedHashMap.put("is_custom_page_name", 1);
        if ((context instanceof AbstractActivityC1743740vTg) && context != null && C960203pA.LIZIZ(context)) {
            str2 = "dark";
        } else {
            str2 = "light";
        }
        linkedHashMap.put("force_theme_style", str2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (map != null) {
            linkedHashMap2.putAll(map);
        }
        linkedHashMap2.put("page_name", "trends_coupon_page");
        String strLIZLLL = C314470CUj.LIZLLL(linkedHashMap2);
        if (strLIZLLL != null) {
            linkedHashMap.put("trackParams", strLIZLLL);
        }
        C919503ib.LIZIZ(context, str, linkedHashMap, false).open();
    }
}
