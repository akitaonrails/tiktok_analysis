package X;

import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentSDKConfigService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QEO, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QEO {
    public static final C0QEO LIZ = new C0QEO();

    public static long LJFF() {
        ISearchContextAbility iSearchContextAbilityLJ;
        C0PCY<C0PM7> c0pcyPR;
        C0PM7 c0pm7;
        LifecycleOwner lifecycleOwnerLIZ = C651290Pgd.LIZ();
        long j = (lifecycleOwnerLIZ == null || (iSearchContextAbilityLJ = C0Q3E.LJ(lifecycleOwnerLIZ)) == null || (c0pcyPR = iSearchContextAbilityLJ.pR()) == null || (c0pm7 = (C0PM7) c0pcyPR.LIZJ()) == null) ? 0L : c0pm7.LLILLJJLI;
        if (C08A4.LIZIZ(Long.valueOf(j))) {
            return j;
        }
        C0Q6U.LIZ.getClass();
        Long lLIZ = C0Q6U.LIZJ;
        return (lLIZ == null && (lLIZ = C0QES.LIZ(C0QES.LIZ, null, false, 7)) == null) ? C326380Cqq.LIZ() : lLIZ.longValue();
    }

    public static int LIZJ(Uri uri) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "back_flag");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            try {
                return CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return 0;
            }
        }
        return 0;
    }

    public static int LIZLLL(EnumC683800Qry enumC683800Qry) {
        EnumC1876780ywG enumC1876780ywGLIZ;
        if (((IPNSConsentSDKConfigService) ServiceManager.get().getService(IPNSConsentSDKConfigService.class)).LIZ() == null || (enumC1876780ywGLIZ = C1915720zx4.LIZ(enumC683800Qry.getKey(), null)) == null) {
            enumC1876780ywGLIZ = EnumC1876780ywG.CONSENT_NOT_PRESENT_IN_CACHE;
        }
        if (enumC683800Qry != EnumC683800Qry.TT_DSA_SEARCH_CONSENT) {
            return enumC1876780ywGLIZ.getI();
        }
        if (C682790QqL.LIZ[enumC1876780ywGLIZ.ordinal()] == 1) {
            return 1;
        }
        return 0;
    }

    public static String LJ(Long l) {
        IEcomSearchService iEcomSearchServiceLIZ = C315220CXg.LIZ();
        String paramByName = iEcomSearchServiceLIZ.getParamByName("ec_search_session_id");
        if (paramByName == null) {
            String paramByName2 = iEcomSearchServiceLIZ.getParamByName("search_session_id");
            if (paramByName2 == null) {
                C0QES.LIZ.getClass();
                String str = C0QES.LIZJ;
                if (str == null) {
                    return String.valueOf(l);
                }
                return str;
            }
            return paramByName2;
        }
        return paramByName;
    }

    public static int LJI(Uri uri) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "feed_search_bar_flag");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
            try {
                return CastIntegerProtector.parseInt(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return 0;
            }
        }
        return 0;
    }

    public static String LJII(Uri uri) {
        boolean z;
        boolean z2;
        boolean z3;
        String strLIZIZ;
        Object c098200Yq;
        String strLIZIZ2 = C1942307jB.LIZIZ(uri, "mall_extra_info");
        boolean z4 = false;
        if (strLIZIZ2 != null && strLIZIZ2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z && (strLIZIZ = C1942307jB.LIZIZ(uri, "extra_business_params")) != null) {
            try {
                strLIZIZ2 = new JSONObject(strLIZIZ).optString("mall_extra_info");
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LJ(thM5exceptionOrNullimpl);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        if (strLIZIZ2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(strLIZIZ2);
                String strOptString = jSONObject.optString("material_id");
                if (strOptString == null || strOptString.length() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    jSONObject.put("material_id", "");
                }
                String strOptString2 = jSONObject.optString("campaign_id");
                if (strOptString2 == null || strOptString2.length() == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    jSONObject.put("campaign_id", "");
                }
                String strOptString3 = jSONObject.optString("track_id");
                if (strOptString3 == null || strOptString3.length() == 0) {
                    z4 = true;
                }
                if (z4) {
                    jSONObject.put("track_id", "");
                }
                strLIZIZ2 = C786410Ut5.J3(jSONObject);
                return strLIZIZ2;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        }
        return strLIZIZ2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZIZ(Uri uri, SearchResultParam searchResultParam) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10;
        Object c098200Yq;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11;
        Object c098200Yq2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter15;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter16;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter17;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter18;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter19;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter20;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter21;
        Integer numLJIIJJI;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter22;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter23;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter24;
        Integer numLJIIJJI2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter25;
        int i;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter26;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter27;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter28;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter29;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter30;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter31;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter32;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter33;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter34;
        Object c098200Yq3;
        Type type;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter35;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter36;
        Object c098200Yq4;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter37;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter38;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter39;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter40;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter41;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter42;
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        searchResultParam.setFilterOption(new C0PSG());
        if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
            for (String str : queryParameterNames) {
                if (str != null) {
                    Map<String, String> map = null;
                    switch (str.hashCode()) {
                        case -2110369192:
                            if (str.equals("click_user_id") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setClickUserId(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                            }
                            break;
                        case -1959087383:
                            if (str.equals("group_position") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setGroupPosition(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                            }
                            break;
                        case -1866223681:
                            if (str.equals("has_coin_entrance") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setHasCoinEntrance(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                            }
                            break;
                        case -1841902086:
                            if (str.equals("is_filter_search") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.getFilterOption().setDefaultOption(Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4));
                            }
                            break;
                        case -1798970266:
                            if (str.equals("intervene_cards") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setInterveneCards(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5);
                            }
                            break;
                        case -1780004746:
                            if (str.equals("pre_search_id") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setLastSearchId(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6);
                            }
                            break;
                        case -1765562599:
                            if (str.equals("bubble_text_type") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setBubbleTextType(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7);
                            }
                            break;
                        case -1757454417:
                            if (str.equals("entry_show_type") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setShowType(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8);
                            }
                            break;
                        case -1528589027:
                            if (str.equals("related_search_card_model") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setRelatedSearchInflowCardInfo(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9);
                            }
                            break;
                        case -1457445179:
                            if (str.equals("extraRequestParams") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                try {
                                    C0P7X.LIZ(new C0P9Q(C663670Q1l.LIZIZ(new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10))), searchResultParam);
                                    c098200Yq = Unit.LIZ;
                                    C189200o6.m2constructorimpl(c098200Yq);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                }
                                C189200o6.m1boximpl(c098200Yq);
                                break;
                            }
                            break;
                        case -1414420479:
                            if (str.equals("is_feed_liked")) {
                                searchResultParam.setFeedLiked(uri.getBooleanQueryParameter(str, false));
                            }
                            break;
                        case -1340656258:
                            if (str.equals("ec_page_feature_params") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                try {
                                    searchResultParam.setPageFeatureParams(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11);
                                    c098200Yq2 = Unit.LIZ;
                                    C189200o6.m2constructorimpl(c098200Yq2);
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    c098200Yq2 = new C098200Yq(th2);
                                    C189200o6.m2constructorimpl(c098200Yq2);
                                }
                                C189200o6.m1boximpl(c098200Yq2);
                                break;
                            }
                            break;
                        case -1300961562:
                            if (str.equals("preClickImprId") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                new C667750QHd().LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12);
                            }
                            break;
                        case -1250657755:
                            if (str.equals("penetrate_info")) {
                                C0P7X.LIZ(new C0P9S("search_penetrate_info", UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)), searchResultParam);
                            }
                            break;
                        case -814408215:
                            if (str.equals("keyword") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                if (!queryParameterNames.contains("display_keyword")) {
                                    searchResultParam.setKeyword(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13);
                                } else {
                                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter43 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "display_keyword");
                                    if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter43)) {
                                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter43;
                                    }
                                    searchResultParam.setKeyword(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13);
                                }
                            }
                            break;
                        case -743513940:
                            if (str.equals("is_display_sevensplit_screen") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setDisplaySevenSplitScreen(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14);
                            }
                            break;
                        case -685906904:
                            if (str.equals("enter_method") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter15 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setEnterMethod(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter15);
                            }
                            break;
                        case -560734013:
                            if (str.equals("source_btm_page_id") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter16 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setSourceBtmPageId(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter16);
                            }
                            break;
                        case -539642911:
                            if (str.equals("search_from") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter17 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setSearchFrom(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter17);
                            }
                            break;
                        case -452763237:
                            if (str.equals("is_feed_comment_clicked")) {
                                searchResultParam.setFeedCommentClicked(uri.getBooleanQueryParameter(str, false));
                            }
                            break;
                        case -429654716:
                            if (str.equals("event_keyword") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter18 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setEventKeyword(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter18);
                            }
                            break;
                        case -346952694:
                            if (str.equals("switch_tab") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter19 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setSwitchTab(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter19);
                            }
                            break;
                        case -296772097:
                            if (str.equals("words_position") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter20 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setWordsPosition(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter20);
                            }
                            break;
                        case -11918021:
                            if (str.equals("sort_type") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter21 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter21)) != null) {
                                searchResultParam.getFilterOption().setSortType(numLJIIJJI.intValue());
                            }
                            break;
                        case 3151786:
                            if (str.equals("from") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter22 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null && Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter22, "push")) {
                                searchResultParam.setSearchFrom("push");
                            }
                            break;
                        case 33569918:
                            if (str.equals("from_promotion_text") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter23 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setFromPromotionText(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter23);
                            }
                            break;
                        case 33588875:
                            if (str.equals("from_promotion_type") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter24 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter24)) != null) {
                                searchResultParam.setFromPromotionType(numLJIIJJI2.intValue());
                            }
                            break;
                        case 96506544:
                            if (str.equals("avoid_record_history") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter25 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                Integer numLJIIJJI3 = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter25);
                                if (numLJIIJJI3 != null && numLJIIJJI3.intValue() == 1) {
                                    i = 0;
                                } else {
                                    i = 1;
                                }
                                searchResultParam.setShouldRecordInHistory(i);
                            }
                            break;
                        case 197005001:
                            if (str.equals("music_chart_info") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter26 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setMusicChartInfo(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter26);
                            }
                            break;
                        case 366364182:
                            if (str.equals("caption_rating") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter27 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setCaptionRating(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter27);
                            }
                            break;
                        case 495151089:
                            if (str.equals("source_btm_token") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter28 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setSourceBtmToken(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter28);
                            }
                            break;
                        case 506361563:
                            if (str.equals("group_id") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter29 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setGroupId(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter29);
                            }
                            break;
                        case 516669515:
                            if (str.equals("trending_words_id") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter30 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setTrendingWordsId(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter30);
                            }
                            break;
                        case 560021505:
                            if (str.equals("is_feed_forward_clicked")) {
                                searchResultParam.setFeedForwardClicked(uri.getBooleanQueryParameter(str, false));
                            }
                            break;
                        case 614458781:
                            if (str.equals("is_feed_collected")) {
                                searchResultParam.setFeedCollected(uri.getBooleanQueryParameter(str, false));
                            }
                            break;
                        case 765499066:
                            if (str.equals("trending_event_id") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter31 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setTrendingEventId(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter31);
                            }
                            break;
                        case 778996493:
                            if (str.equals("bubble_type") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter32 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setBubbleType(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter32);
                            }
                            break;
                        case 841548499:
                            if (str.equals("doc_rank") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter33 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setDocRank(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter33);
                            }
                            break;
                        case 879681847:
                            if (str.equals("suggest_word_mob_extra") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter34 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                try {
                                    try {
                                        Gson gsonLJFF = C1741890vQh.LJFF();
                                        C1120604Zw.LIZ.getClass();
                                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                                        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                                            C13JX c13jx = KTypeProjection.LIZJ;
                                            C13JW c13jwLJII = C13LE.LJII(String.class);
                                            c13jx.getClass();
                                            type = C2371409Qy.LIZJ(C13LE.LJI(Map.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(String.class))));
                                        } else {
                                            type = new TypeToken<Map<String, ? extends String>>() { // from class: X.0QEk
                                            }.getType();
                                        }
                                        Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter34, type);
                                        if (!(objLJIIIIZZ instanceof Map)) {
                                            objLJIIIIZZ = null;
                                        }
                                        map = (Map) objLJIIIIZZ;
                                    } catch (Throwable th3) {
                                        TryCatchGuardChecker.doCheck(th3);
                                        c098200Yq3 = new C098200Yq(th3);
                                        C189200o6.m2constructorimpl(c098200Yq3);
                                    }
                                } catch (s e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                searchResultParam.setSuggestWordsExtraMobMap(map);
                                c098200Yq3 = Unit.LIZ;
                                C189200o6.m2constructorimpl(c098200Yq3);
                                C189200o6.m1boximpl(c098200Yq3);
                            }
                            break;
                        case 1273999649:
                            if (str.equals("capsule_word_list") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter35 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setCapsuleWords(new C20472080g(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter35, null));
                                searchResultParam.setKeyword(searchResultParam.getCapsuleWords().getKeyWord());
                            }
                            break;
                        case 1319896884:
                            if (str.equals("extra_mob_params") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter36 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                try {
                                    C0P7X.LIZ(new C640140P8y(C663670Q1l.LIZIZ(new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter36))), searchResultParam);
                                    c098200Yq4 = Unit.LIZ;
                                    C189200o6.m2constructorimpl(c098200Yq4);
                                } catch (Throwable th4) {
                                    TryCatchGuardChecker.doCheck(th4);
                                    c098200Yq4 = new C098200Yq(th4);
                                    C189200o6.m2constructorimpl(c098200Yq4);
                                }
                                C189200o6.m1boximpl(c098200Yq4);
                                break;
                            }
                            break;
                        case 1467317682:
                            if (str.equals("enter_from_sub") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter37 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setEnterFromSub(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter37);
                            }
                            break;
                        case 1592562286:
                            if (str.equals("hashtag_id") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter38 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setHashtagId(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter38);
                            }
                            break;
                        case 1923929354:
                            if (str.equals("is_bubble_click") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter39 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setIsBubbleClick(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter39);
                            }
                            break;
                        case 1931666783:
                            if (str.equals("words_extra_type") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter40 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setWordsExtraType(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter40);
                            }
                            break;
                        case 2001337335:
                            if (str.equals("from_search_subtab") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter41 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setFromSearchSubtag(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter41);
                            }
                            break;
                        case 2071166924:
                            if (str.equals("utm_source") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter42 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setUtmSource(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter42);
                            }
                            break;
                    }
                }
            }
        }
    }

    public static String LJIIIIZZ(Uri uri, C0QEQ c0qeq) {
        Object c098200Yq;
        String strLIZIZ = C1942307jB.LIZIZ(uri, "extra_business_params");
        String strOptString = null;
        if (strLIZIZ != null) {
            try {
                JSONObject jSONObject = new JSONObject(strLIZIZ);
                strOptString = jSONObject.optString("promotion_icon_only");
                if (jSONObject.optInt("search_saf") == 1) {
                    c0qeq.LJJJJJ = true;
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LJ(thM5exceptionOrNullimpl);
            }
            C189200o6.m1boximpl(c098200Yq);
        }
        return strOptString;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LJIIIZ(java.lang.String r6, boolean r7) {
        /*
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r0)
            r3 = 0
            if (r0 != 0) goto L1a
            if (r6 == 0) goto L1a
            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L16
            java.lang.Long r6 = java.lang.Long.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L16
            if (r6 == 0) goto L1a
            goto L2d
        L16:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L1a:
            X.0Q6U r0 = X.C0Q6U.LIZ
            r0.getClass()
            java.lang.Long r6 = X.C0Q6U.LIZIZ
            if (r6 == 0) goto L32
            long r4 = r6.longValue()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L32
        L2d:
            long r0 = r6.longValue()
            return r0
        L32:
            if (r7 == 0) goto L35
            goto L37
        L35:
            r1 = r3
            goto L48
        L37:
            X.0QES r0 = X.C0QES.LIZ     // Catch: java.lang.Throwable -> L4c
            r0.getClass()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = X.C0QES.LIZIZ     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L35
            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L4c
        L48:
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L4c
            goto L58
        L4c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r1 = new X.00Yq
            r1.<init>(r0)
            X.C189200o6.m2constructorimpl(r1)
        L58:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 != 0) goto L5f
            r3 = r1
        L5f:
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 == 0) goto L68
            long r0 = r3.longValue()
            return r0
        L68:
            long r0 = java.lang.System.currentTimeMillis()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QEO.LJIIIZ(java.lang.String, boolean):long");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0937  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C650950Pg5 LIZ(android.net.Uri r77, X.C0QEQ r78) {
        /*
            Method dump skipped, instruction units count: 3054
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QEO.LIZ(android.net.Uri, X.0QEQ):X.0Pg5");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(android.content.Context r18, android.net.Uri r19, android.os.Bundle r20, com.bytedance.router.RouteIntent r21, kotlin.jvm.functions.Function2<? super com.ss.android.ugc.aweme.search.model.SearchResultParam, ? super X.C650950Pg5, kotlin.Unit> r22) {
        /*
            Method dump skipped, instruction units count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QEO.LJIIJJI(android.content.Context, android.net.Uri, android.os.Bundle, com.bytedance.router.RouteIntent, kotlin.jvm.functions.Function2):void");
    }
}
