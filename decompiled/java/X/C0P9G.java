package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0P9G, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P9G {
    public static final C0P9G LIZ = new C0P9G();

    public static Long LIZIZ(C0P9H c0p9h) {
        C0P9H c0p9hLIZJ = LIZJ(c0p9h);
        if (c0p9hLIZJ == null) {
            return null;
        }
        Long lValueOf = Long.valueOf(c0p9hLIZJ.LJ);
        if (lValueOf.longValue() > 0) {
            return lValueOf;
        }
        Long lValueOf2 = Long.valueOf(c0p9hLIZJ.LIZLLL);
        if (lValueOf2.longValue() <= 0) {
            return null;
        }
        return lValueOf2;
    }

    public static C0P9H LIZJ(C0P9H c0p9h) {
        C1007860cKm c1007860cKmLJIILIIL;
        if (c0p9h == null) {
            InterfaceC657510Pqf interfaceC657510PqfLIZLLL = C655610Pnb.LIZIZ.LIZLLL();
            if (interfaceC657510PqfLIZLLL != null && (c1007860cKmLJIILIIL = interfaceC657510PqfLIZLLL.LJIILIIL()) != null) {
                return c1007860cKmLJIILIIL.LJI;
            }
            return null;
        }
        return c0p9h;
    }

    public static final void LJ(C0P9H c0p9h) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("creative_id", c0p9h.LIZJ);
            LIZ.getClass();
            LIZ(jSONObject, c0p9h, false, false, null);
            C20684815ws.LJIJ("search_ad_click", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZJ("SearchAdAnalyzerFunnel searchAdClick");
        }
    }

    public static void LIZ(JSONObject jSONObject, C0P9H c0p9h, boolean z, boolean z2, Long l) {
        C0P9H c0p9hLIZJ = LIZJ(c0p9h);
        if (c0p9hLIZJ == null) {
            return;
        }
        jSONObject.put("search_session_id", c0p9hLIZJ.LIZ);
        jSONObject.put("click_refer", c0p9hLIZJ.LIZIZ);
        if (z) {
            jSONObject.put("last_creative_id", c0p9hLIZJ.LIZJ);
        }
        if (z2) {
            jSONObject.put("prefetch_type", c0p9hLIZJ.LJFF);
        }
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue > 0) {
                jSONObject.put("duration", System.currentTimeMillis() - jLongValue);
            }
        }
    }

    public static void LJII(String str, String str2, String str3, String str4, String str5, int i, C0P9H c0p9h) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("enter_from", str);
            jSONObject.put("enter_method", str2);
            jSONObject.put("prefetch_id", str3);
            jSONObject.put("result", "success");
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
            jSONObject.put("search_id", str4);
            jSONObject.put("req_id", str5);
            LIZ.getClass();
            LIZ(jSONObject, c0p9h, true, true, LIZIZ(c0p9h));
            C20684815ws.LJIJ("tiktok_search_result", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZJ("SearchAdAnalyzerFunnel searchRequestResult");
        }
    }

    public static void LIZLLL(AwemeRawAd awemeRawAd, String str, String str2, String str3, String str4, String str5, int i, int i2) {
        Long creativeId;
        int iIntValue;
        Integer num;
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
                C20684815ws.LJIJ("tiktok_search_result_ad_attach_component", jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LIZJ("SearchAdAnalyzerFunnel searchAdAttachComponent");
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
        C20684815ws.LJIJ("tiktok_search_result_ad_attach_component", jSONObject2);
    }

    public static void LJI(C0P9G c0p9g, AwemeRawAd awemeRawAd, String str, String str2, String str3, String str4, String str5, int i, int i2) {
        Long creativeId;
        int iIntValue;
        Integer num;
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
                LIZ.getClass();
                LIZ(jSONObject, null, true, true, LIZIZ(null));
                C20684815ws.LJIJ("tiktok_search_result_ad_render_success", jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LIZJ("SearchAdAnalyzerFunnel searchAdRenderSuccess");
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
        LIZ.getClass();
        LIZ(jSONObject2, null, true, true, LIZIZ(null));
        C20684815ws.LJIJ("tiktok_search_result_ad_render_success", jSONObject2);
    }

    public static void LJFF(C0P9G c0p9g, AwemeRawAd awemeRawAd, String str, String str2, String str3, String str4, String str5, int i, int i2, String str6) {
        Long creativeId;
        int iIntValue;
        Integer num;
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
                jSONObject.put("failed_reason", str6);
                jSONObject.put("search_id", str4);
                jSONObject.put("req_id", str5);
                jSONObject.put("search_format_type", iIntValue);
                LIZ.getClass();
                LIZ(jSONObject, null, true, true, LIZIZ(null));
                C20684815ws.LJIJ("tiktok_search_result_ad_render_fail", jSONObject);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LIZJ("SearchAdAnalyzerFunnel searchAdRenderFail");
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
        jSONObject2.put("failed_reason", str6);
        jSONObject2.put("search_id", str4);
        jSONObject2.put("req_id", str5);
        jSONObject2.put("search_format_type", iIntValue);
        LIZ.getClass();
        LIZ(jSONObject2, null, true, true, LIZIZ(null));
        C20684815ws.LJIJ("tiktok_search_result_ad_render_fail", jSONObject2);
    }
}
