package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoDTO;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallItemInfoLynxDTO;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wDE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1771980wDE {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(C1771990wDF c1771990wDF, C1771590wCb c1771590wCb) {
        Object obj;
        Object obj2;
        String str;
        String str2;
        String str3;
        Map<String, Object> map;
        Map<String, Object> map2;
        Pair[] pairArr = new Pair[7];
        String str4 = "";
        if (c1771590wCb == null || (map2 = c1771590wCb.LJIIL) == null || (obj = map2.get("api_path")) == null) {
            obj = "";
        }
        pairArr[0] = new Pair("api_path", obj);
        pairArr[1] = new Pair("code", Integer.valueOf(c1771990wDF.LIZ));
        pairArr[2] = new Pair("message", c1771990wDF.LIZIZ);
        if (c1771590wCb == null || (map = c1771590wCb.LJIIL) == null || (obj2 = map.get("log_id")) == null) {
            obj2 = "";
        }
        pairArr[3] = new Pair("log_id", obj2);
        if (c1771590wCb == null || (str = c1771590wCb.LJI) == null) {
            str = "";
        }
        pairArr[4] = new Pair("reason", str);
        if (c1771590wCb == null || (str2 = c1771590wCb.LIZ) == null) {
            str2 = "";
        }
        pairArr[5] = new Pair("tab_id", str2);
        if (c1771590wCb != null && (str3 = c1771590wCb.LJFF) != null) {
            str4 = str3;
        }
        pairArr[6] = new Pair("tag", str4);
        C1768180w76.LIZ("rd_tiktokec_mix_mall_bff_data_error", null, C2097608Jq.LJIIIIZZ(pairArr), false);
    }

    public static void LIZLLL(C1771590wCb c1771590wCb, int i) {
        Object obj;
        Object obj2;
        Pair[] pairArr = new Pair[8];
        Map<String, Object> map = c1771590wCb.LJIIL;
        String str = "";
        if (map == null || (obj = map.get("api_path")) == null) {
            obj = "";
        }
        pairArr[0] = new Pair("api_path", obj);
        String str2 = c1771590wCb.LIZ;
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("tab_id", str2);
        Map<String, Object> map2 = c1771590wCb.LJIIL;
        if (map2 == null || (obj2 = map2.get("log_id")) == null) {
            obj2 = "";
        }
        pairArr[2] = new Pair("log_id", obj2);
        pairArr[3] = new Pair("feed_count", Integer.valueOf(i));
        String str3 = c1771590wCb.LJI;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[4] = new Pair("reason", str3);
        String str4 = c1771590wCb.LJFF;
        if (str4 != null) {
            str = str4;
        }
        pairArr[5] = new Pair("tag", str);
        pairArr[6] = new Pair("is_from_cache", Integer.valueOf(Intrinsics.LJFF(c1771590wCb.LJFF, "prefetch_cache") ? 1 : 0));
        pairArr[7] = new Pair("version_of_feed_data", 0);
        C1768180w76.LIZ("rd_tiktokec_mix_mall_feed_data", null, C2097608Jq.LJIIIIZZ(pairArr), false);
    }

    public static void LJIIIZ(EnumC993130bx1 enumC993130bx1, String str) {
        Pair[] pairArr = new Pair[4];
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("target_tab", str);
        pairArr[1] = new Pair("current_tab_ids", "");
        pairArr[2] = new Pair("code", Integer.valueOf(enumC993130bx1.getCode()));
        pairArr[3] = new Pair("message", enumC993130bx1.getMessage());
        C1768180w76.LIZ("rd_ec_mix_mall_multi_tab_find_error", null, C2097608Jq.LJIIIIZZ(pairArr), false);
    }

    public static void LIZJ(EnumC993150bx3 enumC993150bx3, String str, C1771590wCb c1771590wCb) {
        Object obj;
        String str2;
        String str3;
        String str4;
        Map<String, Object> map;
        Pair[] pairArr = new Pair[8];
        String str5 = "";
        if (str == null) {
            str = "";
        }
        pairArr[0] = new Pair("type", str);
        pairArr[1] = new Pair("code", Integer.valueOf(enumC993150bx3.getCode()));
        pairArr[2] = new Pair("message", enumC993150bx3.getMessage());
        if (c1771590wCb == null || (map = c1771590wCb.LJIIL) == null || (obj = map.get("log_id")) == null) {
            obj = "";
        }
        pairArr[3] = new Pair("log_id", obj);
        if (c1771590wCb == null || (str2 = c1771590wCb.LJI) == null) {
            str2 = "";
        }
        pairArr[4] = new Pair("reason", str2);
        if (c1771590wCb == null || (str3 = c1771590wCb.LIZ) == null) {
            str3 = "";
        }
        pairArr[5] = new Pair("tab_id", str3);
        pairArr[6] = new Pair("feed_count", 0);
        if (c1771590wCb != null && (str4 = c1771590wCb.LJFF) != null) {
            str5 = str4;
        }
        pairArr[7] = new Pair("tag", str5);
        C1768180w76.LIZ("rd_tiktokec_mix_mall_card_data_error", null, C2097608Jq.LJIIIIZZ(pairArr), false);
    }

    public static void LJIIIIZZ(C1772630wEH c1772630wEH, C1772690wEN c1772690wEN, C1772690wEN c1772690wEN2) {
        Object obj;
        Pair[] pairArr = new Pair[9];
        Map<String, ? extends Object> map = c1772630wEH.LJIIIIZZ;
        if (map == null || (obj = map.get("log_id")) == null) {
            obj = "";
        }
        pairArr[0] = new Pair("log_id", obj);
        pairArr[1] = new Pair("old_session", c1772690wEN.LJIIIIZZ);
        pairArr[2] = new Pair("new_session", c1772690wEN2.LJIIIIZZ);
        pairArr[3] = new Pair("old_card_count", Integer.valueOf(c1772690wEN.LIZJ.size()));
        pairArr[4] = new Pair("new_card_count", Integer.valueOf(c1772690wEN2.LIZJ.size()));
        pairArr[5] = new Pair("old_tab_id", c1772690wEN.LIZLLL);
        pairArr[6] = new Pair("new_tab_id", c1772690wEN2.LIZLLL);
        pairArr[7] = new Pair("tab_name", c1772690wEN.LJIIJJI);
        pairArr[8] = new Pair("tab_index", Integer.valueOf(c1772690wEN.LJIIJ));
        C1768180w76.LIZ("rd_tiktokec_mix_mall_bff_data_session_err", null, C2097608Jq.LJIIIIZZ(pairArr), false);
    }

    public static void LJ(EnumC599620NfU enumC599620NfU, EnumC993140bx2 enumC993140bx2, EnumC993160bx4 enumC993160bx4, String str, String str2) {
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("type", enumC599620NfU.getValue());
        pairArr[1] = new Pair("operation", Integer.valueOf(enumC993140bx2.getValue()));
        pairArr[2] = new Pair("name", str);
        if (str2 == null) {
            str2 = "";
        }
        pairArr[3] = new Pair("method_params", str2);
        pairArr[4] = new Pair("code", Integer.valueOf(enumC993160bx4.getCode()));
        pairArr[5] = new Pair("message", enumC993160bx4.getMessage());
        C1768180w76.LIZ("rd_ec_mix_mall_bridge_center_error", null, C2097608Jq.LJIIIIZZ(pairArr), false);
    }

    public static void LJFF(EnumC599640NfW enumC599640NfW, EnumC599450NfD enumC599450NfD, String str, EnumC599720Nfe enumC599720Nfe, Map map) {
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("operation", Integer.valueOf(enumC599640NfW.getValue()));
        pairArr[1] = new Pair("data_key", str);
        pairArr[2] = new Pair("code", Integer.valueOf(enumC599450NfD.getCode()));
        pairArr[3] = new Pair("message", enumC599450NfD.getMessage());
        pairArr[4] = new Pair("source", enumC599720Nfe.getSource());
        Object obj = map.get("schema");
        if (!(obj instanceof String) || obj == null) {
            obj = "";
        }
        pairArr[5] = new Pair("schema", obj);
        C1768180w76.LIZ("rd_ec_mix_mall_global_context_error", null, C2097608Jq.LJIIIIZZ(pairArr), false);
    }

    public static void LIZ(long j, String str, int i, Integer num, String str2, String str3) {
        int iIntValue;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("success", Integer.valueOf(i));
        pairArr[1] = new Pair("duration", Long.valueOf(j));
        pairArr[2] = new Pair("log_id", str);
        pairArr[3] = new Pair("http_code", str2);
        if (str3 == null) {
            str3 = "";
        }
        pairArr[4] = new Pair("request_scene", str3);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        pairArr[5] = new Pair("code", Integer.valueOf(iIntValue));
        C1768180w76.LIZ("rd_ec_aweme_detail_request_result", null, C2097608Jq.LJIIIIZZ(pairArr), false);
    }

    public static void LJI(String str, String str2, String str3, int i, long j, AbstractC1773210wFD abstractC1773210wFD) {
        String str4;
        String strLJIIJJI;
        String strLJIIIZ;
        ECMixMallItemInfoDTO eCMixMallItemInfoDTO;
        ECMixMallItemInfoLynxDTO eCMixMallItemInfoLynxDTO;
        Pair[] pairArr = new Pair[10];
        pairArr[0] = new Pair("jsb_name", "ecMixMallGetItemTraceParams");
        pairArr[1] = new Pair("jsb_params", str);
        pairArr[2] = new Pair("jsb_callback", str2);
        pairArr[3] = new Pair("msg", str3);
        pairArr[4] = new Pair("success", Integer.valueOf(i));
        pairArr[5] = new Pair("begin", Long.valueOf(j));
        pairArr[6] = new Pair("duration", Long.valueOf(System.currentTimeMillis() - j));
        String str5 = "";
        if (abstractC1773210wFD == null || (eCMixMallItemInfoDTO = abstractC1773210wFD.LJIIIZ) == null || (eCMixMallItemInfoLynxDTO = eCMixMallItemInfoDTO.lynx) == null || (str4 = eCMixMallItemInfoLynxDTO.schema) == null) {
            str4 = "";
        }
        pairArr[7] = new Pair("template_url", str4);
        if (abstractC1773210wFD == null || (strLJIIJJI = abstractC1773210wFD.LJIIJJI()) == null) {
            strLJIIJJI = "";
        }
        pairArr[8] = new Pair("item_type", strLJIIJJI);
        if (abstractC1773210wFD != null && (strLJIIIZ = abstractC1773210wFD.LJIIIZ()) != null) {
            str5 = strLJIIIZ;
        }
        pairArr[9] = new Pair("item_id", str5);
        C1768180w76.LIZ("rd_tiktokec_mix_mall_jsb_monitor", null, C2097608Jq.LJIIIIZZ(pairArr), false);
    }

    public static void LJII(C1771590wCb c1771590wCb, int i, String str, long j, boolean z, String str2, String str3, String str4, String str5) {
        Pair[] pairArr = new Pair[14];
        Object obj = c1771590wCb.LJIIL.get("api_path");
        String str6 = "";
        if (obj == null) {
            obj = "";
        }
        pairArr[0] = new Pair("api_path", obj);
        int i2 = 1;
        pairArr[1] = new Pair("code", Integer.valueOf(i));
        if (str == null) {
            str = "";
        }
        pairArr[2] = new Pair("message", str);
        if (i != 0) {
            i2 = 0;
        }
        pairArr[3] = new Pair("is_success", Integer.valueOf(i2));
        Object obj2 = c1771590wCb.LJIIL.get("log_id");
        if (obj2 == null) {
            obj2 = "";
        }
        pairArr[4] = new Pair("log_id", obj2);
        pairArr[5] = new Pair("duration", Long.valueOf(j));
        pairArr[6] = new Pair("reason", c1771590wCb.LJI);
        String str7 = c1771590wCb.LIZ;
        if (str7 != null) {
            str6 = str7;
        }
        pairArr[7] = new Pair("tab_id", str6);
        pairArr[8] = new Pair("dynamic_params_timeout", Integer.valueOf(Intrinsics.LJFF(c1771590wCb.LJIIIIZZ, Boolean.TRUE) ? 1 : 0));
        pairArr[9] = new Pair("preload", Integer.valueOf(z ? 1 : 0));
        pairArr[10] = new Pair("service", str2);
        pairArr[11] = new Pair("network_info", str3);
        pairArr[12] = new Pair("tts_server_timing", str5);
        pairArr[13] = new Pair("reuse_source", str4);
        C1768180w76.LIZ("rd_tiktokec_mix_mall_request_result", null, C2097608Jq.LJIIIIZZ(pairArr), false);
    }
}
