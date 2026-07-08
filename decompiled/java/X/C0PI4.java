package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdMainService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.ams.context.MeasurementContext;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.util.Collections;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PI4, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PI4 {
    public static final String LIZ(Aweme aweme) {
        HashMap<String, String> searchExtraParams;
        if (aweme != null && (searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme)) != null) {
            return searchExtraParams.get("dual_stream_enter_aid");
        }
        return null;
    }

    public static final String LIZIZ(SearchMixFeedList searchMixFeedList) {
        Object c098200Yq;
        Object obj = null;
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(searchMixFeedList.LLILLJJLI).optJSONObject("extra");
            if (jSONObjectOptJSONObject != null) {
                c098200Yq = jSONObjectOptJSONObject.optString("inner_search_id");
            } else {
                c098200Yq = null;
            }
            if (c098200Yq == null) {
                c098200Yq = "";
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (String) obj;
    }

    public static final String LIZJ(SearchMixFeedList searchMixFeedList) {
        String strOptString;
        if (C292480BdG.LIZ()) {
            JSONObject jSONObject = searchMixFeedList.LL;
            if (jSONObject != null && (strOptString = jSONObject.optString("inner_search_id")) != null) {
                return strOptString;
            }
        } else {
            String strLIZIZ = LIZIZ(searchMixFeedList);
            if (strLIZIZ != null) {
                return strLIZIZ;
            }
        }
        return "";
    }

    public static final void LIZLLL(final Aweme aweme) {
        InterfaceC688220Qz6 interfaceC688220Qz6LJJI;
        AwemeRawAd awemeRawAd;
        if (C2264471DkD.LIZLLL("general_search")) {
            MeasurementContext.LIZ.getClass();
            C584230Mvl.LIZ().LJIIL(new C0N2B() { // from class: X.0N2D
                @Override // X.C0N2B
                public final void LIZ(MeasurementContext measurementContext) {
                    Aweme aweme2 = aweme;
                    if (aweme2 != null) {
                        aweme2.getRequestId();
                        C0N24.LIZIZ(measurementContext, aweme2, "general_search");
                    }
                }
            });
        }
        C1023060cjI.LJFF(C623440Oco.LIZIZ, aweme);
        if (aweme != null) {
            boolean z = true;
            if (!aweme.isAd()) {
                z = false;
            }
            if (z) {
                ISearchAdMainService iSearchAdMainService = (ISearchAdMainService) PluggableExtentionKt.pluggableSpi$default(ISearchAdMainService.class, false, false, false, 14, null);
                if (iSearchAdMainService != null && (interfaceC688220Qz6LJJI = iSearchAdMainService.LJJI()) != null) {
                    if (aweme != null) {
                        awemeRawAd = aweme.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    interfaceC688220Qz6LJJI.LJIILJJIL(awemeRawAd, true, false, null);
                }
                ((IAdLandPagePreloadService) ServiceManager.get().getService(IAdLandPagePreloadService.class)).G0();
                C1024380clQ.LJIILIIL(Collections.singletonList(aweme), "inflow_search", null);
            }
            if (aweme != null) {
                C1029590ctp.LJI().getClass();
                if (!C1045220dJ2.LJIIIZ(aweme) && !C1045220dJ2.LJIIIIZZ(aweme)) {
                    return;
                }
                C1045220dJ2.LJIIJ(aweme, C15O7.LJI, null, false);
                AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                if (awemeRawAd2 == null) {
                    return;
                }
                awemeRawAd2.appendExtraParamInCommercializeSearch("inner_ad_from_inner_network_request", "1");
            }
        }
    }

    public static final boolean LJ(Aweme aweme) {
        String str;
        if (aweme != null) {
            HashMap<String, String> searchExtraParams = AwemeBizExtKt.getSearchExtraParams(aweme);
            if (searchExtraParams != null) {
                str = searchExtraParams.get("dual_stream_inner_item_mark");
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "inner")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final void LJFF(int i, Aweme aweme) {
        AwemeRawAd awemeRawAd;
        if (aweme != null && aweme.isAd() && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            awemeRawAd.appendExtraParamInCommercializeSearch("inner_ad_position", String.valueOf(i));
        }
    }
}
