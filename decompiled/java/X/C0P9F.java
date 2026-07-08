package X;

import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0P9F, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P9F {
    public static final C0P9F LIZ = new C0P9F();
    public static final LruCache<String, Boolean> LIZIZ = new LruCache<>(4);

    public static C0P9H LIZ() {
        C1007860cKm c1007860cKmLJIILIIL;
        InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
        if (interfaceC657510PqfLIZLLL == null || (c1007860cKmLJIILIIL = interfaceC657510PqfLIZLLL.LJIILIIL()) == null) {
            return null;
        }
        return c1007860cKmLJIILIIL.LJI;
    }

    public static void LIZJ(String str, String str2, String str3, String str4, String str5) {
        C0P9G c0p9g = C0P9G.LIZ;
        C0P9H c0p9hLIZ = LIZ();
        c0p9g.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enter_from", str);
            jSONObject.put("enter_method", str2);
            jSONObject.put("prefetch_id", str3);
            jSONObject.put("search_id", str4);
            jSONObject.put("req_id", str5);
            C0P9G.LIZ(jSONObject, c0p9hLIZ, true, true, C0P9G.LIZIZ(c0p9hLIZ));
            C20684815ws.LJIJ("tiktok_search_result_no_ad", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZJ("SearchAdAnalyzerFunnel searchResultHasNoAd");
        }
    }

    public static void LIZIZ(AwemeRawAd awemeRawAd, String str, String str2, String str3, String str4, String str5, int i, int i2) {
        Long creativeId;
        int iIntValue;
        Integer num;
        C0P9G c0p9g = C0P9G.LIZ;
        C0P9H c0p9hLIZ = LIZ();
        c0p9g.getClass();
        if (awemeRawAd != null) {
            creativeId = awemeRawAd.getCreativeId();
            try {
                AwemeSearchAdModel searchAdInfo = awemeRawAd.getSearchAdInfo();
                if (searchAdInfo != null && (num = searchAdInfo.searchFormatType) != null) {
                    iIntValue = num.intValue();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("enter_from", str);
                jSONObject.put("enter_method", str2);
                jSONObject.put("prefetch_id", str3);
                jSONObject.put("creative_id", creativeId);
                jSONObject.put("search_ad_card_type", i);
                jSONObject.put("rank", i2);
                jSONObject.put("search_id", str4);
                jSONObject.put("req_id", str5);
                jSONObject.put("search_format_type", iIntValue);
                C0P9G.LIZ(jSONObject, c0p9hLIZ, true, true, C0P9G.LIZIZ(c0p9hLIZ));
                C20684815ws.LJIJ("tiktok_search_result_has_ad_event", jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LIZJ("SearchAdAnalyzerFunnel searchResultHasAdCard");
                return;
            }
        }
        creativeId = null;
        iIntValue = 0;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("enter_from", str);
        jSONObject2.put("enter_method", str2);
        jSONObject2.put("prefetch_id", str3);
        jSONObject2.put("creative_id", creativeId);
        jSONObject2.put("search_ad_card_type", i);
        jSONObject2.put("rank", i2);
        jSONObject2.put("search_id", str4);
        jSONObject2.put("req_id", str5);
        jSONObject2.put("search_format_type", iIntValue);
        C0P9G.LIZ(jSONObject2, c0p9hLIZ, true, true, C0P9G.LIZIZ(c0p9hLIZ));
        C20684815ws.LJIJ("tiktok_search_result_has_ad_event", jSONObject2);
    }
}
