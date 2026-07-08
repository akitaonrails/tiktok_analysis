package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.router.RouteIntent;
import com.ss.android.ugc.aweme.ecommerce.search.page.EcSearchActivity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QOZ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QOZ {
    public static final C0QOZ LIZ = new C0QOZ();
    public static long LIZIZ;

    public static boolean LIZ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis - LIZIZ;
        LIZIZ = jCurrentTimeMillis;
        return j >= 1000;
    }

    public static void LIZJ(Context context, SearchResultParam searchResultParam, C0QER c0qer, C650950Pg5 c650950Pg5, boolean z) {
        C650960Pg6 immutableData;
        C669560QOc c669560QOc;
        String str;
        if (LIZ() && context != null) {
            searchResultParam.setSearchEnterParam(c0qer);
            if (c650950Pg5 != null && (immutableData = c650950Pg5.getImmutableData()) != null && (c669560QOc = immutableData.searchEcommerceModel) != null && (str = c669560QOc.singleTabType) != null) {
                searchResultParam.setSingleTabType(str);
            }
            if (z) {
                searchResultParam.setSingleTabType("shop");
            }
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null) {
                IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
                if (iEcomSearchService != null) {
                    iEcomSearchService.LJJIL(null, searchResultParam, "before_page", AFwS241S0000000_10.get$arr$(504));
                }
                ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJLI(searchResultParam, c0qer, c650950Pg5, c19egLIZIZ);
            }
        }
    }

    public static void LJ(Context context, SearchResultParam searchResultParam, C0QER c0qer, C650950Pg5 c650950Pg5, Uri uri) {
        int value;
        String ecSearchSessionId;
        String trafficSourceList;
        Long endToEndSession;
        C650960Pg6 immutableData;
        C669560QOc c669560QOc;
        String str;
        ECSearchEntranceData ecSearchEntranceData;
        if (c0qer != null && (ecSearchEntranceData = c0qer.getEcSearchEntranceData()) != null) {
            value = C650500PfM.LIZ(ecSearchEntranceData);
        } else {
            value = C0QXR.DEFAULT.getValue();
        }
        if (C2190441Ao6.LIZ(value)) {
            LIZJ(context, searchResultParam, c0qer, c650950Pg5, true);
        }
        if (LIZ() && context != null) {
            searchResultParam.setSearchEnterParam(c0qer);
            if (c650950Pg5 != null && (immutableData = c650950Pg5.getImmutableData()) != null && (c669560QOc = immutableData.searchEcommerceModel) != null && (str = c669560QOc.singleTabType) != null) {
                searchResultParam.setSingleTabType(str);
            }
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null) {
                String mallExtraInfo = null;
                IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
                if (iEcomSearchService != null) {
                    iEcomSearchService.LJJIL(null, searchResultParam, "before_page", AFwS241S0000000_10.get$arr$(505));
                }
                C0QER searchEnterParam = searchResultParam.getSearchEnterParam();
                if (searchEnterParam != null) {
                    ecSearchSessionId = searchEnterParam.getEcSearchSessionId();
                } else {
                    ecSearchSessionId = null;
                }
                C0QER searchEnterParam2 = searchResultParam.getSearchEnterParam();
                if (searchEnterParam2 != null) {
                    trafficSourceList = searchEnterParam2.getTrafficSourceList();
                } else {
                    trafficSourceList = null;
                }
                C0QES c0qes = C0QES.LIZ;
                if (c0qer != null) {
                    endToEndSession = c0qer.getEndToEndSession();
                } else {
                    endToEndSession = null;
                }
                Long lLIZ = C0QES.LIZ(c0qes, endToEndSession, false, 6);
                String string = uri.toString();
                C0QER searchEnterParam3 = searchResultParam.getSearchEnterParam();
                if (searchEnterParam3 != null) {
                    mallExtraInfo = searchEnterParam3.getMallExtraInfo();
                }
                ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJ(new C0QXE(searchResultParam, ecSearchSessionId, trafficSourceList, c650950Pg5, lLIZ, string, mallExtraInfo), c0qer, c19egLIZIZ);
            }
        }
    }

    public static void LIZIZ(Context context, SearchResultParam searchResultParam, C0QER c0qer, Bundle bundle, C650950Pg5 c650950Pg5, RouteIntent routeIntent) throws Throwable {
        String enterSearchFrom;
        C0QER c0qer2;
        String enterSearchFrom2;
        C650960Pg6 immutableData;
        C669560QOc c669560QOc;
        String str;
        Bundle bundleLJFF = bundle;
        if (LIZ() && context != null) {
            System.currentTimeMillis();
            C673320Qb4.LIZ.getClass();
            if (C673320Qb4.LIZIZ != null) {
                System.currentTimeMillis();
            }
            System.currentTimeMillis();
            System.currentTimeMillis();
            if (searchResultParam.getKeyword() != null && c650950Pg5 != null) {
                c650950Pg5.getImmutableData();
            }
            searchResultParam.setSearchEnterParam(c0qer);
            if (c650950Pg5 != null && (immutableData = c650950Pg5.getImmutableData()) != null && (c669560QOc = immutableData.searchEcommerceModel) != null && (str = c669560QOc.singleTabType) != null) {
                searchResultParam.setSingleTabType(str);
            }
            List<EnumC669620QOi> list = C669740QOu.LIZ;
            C669740QOu.LJFF(searchResultParam);
            boolean z = true;
            if (!TextUtils.isEmpty(searchResultParam.getSwitchTab())) {
                String switchTab = searchResultParam.getSwitchTab();
                if (Intrinsics.LJFF(switchTab, "challenge")) {
                    switchTab = EnumC669620QOi.HASHTAG.getTabName();
                }
                List<EnumC669620QOi> list2 = C669740QOu.LIZIZ;
                EnumC669620QOi.Companion.getClass();
                Integer numValueOf = Integer.valueOf(((ArrayList) list2).indexOf(C669650QOl.LIZ(switchTab)));
                if (numValueOf.intValue() >= 0) {
                    numValueOf.intValue();
                }
                if (searchResultParam.getFilterOption().isDefaultOption()) {
                    C1440005kM.LIZ(new C669540QOa());
                    return;
                } else {
                    searchResultParam.getFilterOption();
                    C1440005kM.LIZ(new C669540QOa(0));
                    return;
                }
            }
            boolean zLIZJ = ((IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class)).LIZJ(context);
            if (c0qer != null) {
                enterSearchFrom = c0qer.getEnterSearchFrom();
            } else {
                enterSearchFrom = null;
            }
            if (!TextUtils.equals(enterSearchFrom, "homepage_hot")) {
                if (c0qer != null) {
                    enterSearchFrom2 = c0qer.getEnterSearchFrom();
                } else {
                    enterSearchFrom2 = null;
                }
                if (!TextUtils.equals(enterSearchFrom2, "homepage_follow")) {
                    z = false;
                }
            }
            if (c650950Pg5 != null) {
                C664020Q2u c664020Q2u = C664020Q2u.LIZ;
                if (c0qer == null) {
                    c0qer2 = new C0QER();
                } else {
                    c0qer2 = c0qer;
                }
                c664020Q2u.getClass();
                C664020Q2u.LIZ(c650950Pg5, c0qer2);
            }
            ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJIL(null, searchResultParam, "before_page", AFwS241S0000000_10.get$arr$(503));
            if ((context instanceof Activity) && !zLIZJ && !z) {
                String str2 = EcSearchActivity._pnsPageId;
                if (bundleLJFF == null) {
                    if (!searchResultParam.getRemoveAnimation()) {
                        bundleLJFF = C1607950rwf.LJ((Activity) context, new C0WIY[0]).LJFF();
                    } else {
                        bundleLJFF = null;
                    }
                }
                C0QPZ.LIZIZ(context, searchResultParam, c0qer, bundleLJFF, c650950Pg5, routeIntent);
            } else {
                String str3 = EcSearchActivity._pnsPageId;
                C0QPZ.LIZIZ(context, searchResultParam, c0qer, null, c650950Pg5, routeIntent);
            }
            C673950Qc5 c673950Qc5 = C673940Qc4.LIZIZ;
            if (c673950Qc5 != null) {
                c673950Qc5.LJ = Long.valueOf(System.currentTimeMillis());
            }
            C673940Qc4.LJIIIZ(EnumC673930Qc3.INTERCEPT_END, null);
            return;
        }
        ((IEcomSearchService) ServiceManager.get().getService(IEcomSearchService.class)).LJJIL(null, searchResultParam, "cannot_launch", null);
    }
}
