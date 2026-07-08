package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0QEP, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QEP {
    public static final C0QEP LIZ = new C0QEP();

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042 A[PHI: r3
      0x0042: PHI (r3v2 android.app.Activity) = (r3v4 android.app.Activity), (r3v7 android.app.Activity) binds: [B:19:0x0040, B:5:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJII() {
        /*
            com.ss.android.ugc.aweme.search.common.utils.SAFHelper r0 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LIZ
            r0.getClass()
            r4 = 0
            android.app.Activity r3 = com.ss.android.ugc.aweme.search.common.utils.SAFHelper.LJIIIIZZ(r4)
            boolean r0 = r3 instanceof X.C19EG
            if (r0 == 0) goto L63
            X.19EG r3 = (X.C19EG) r3
            if (r3 != 0) goto L42
        L12:
            boolean r0 = X.C1205604ne.LIZ()
            if (r0 == 0) goto L61
            X.0mCc r0 = X.C1906580ziK.LJ()
            if (r0 == 0) goto L5f
            android.app.Activity r0 = r0.LIZIZ()
            if (r0 == 0) goto L5f
            android.app.Activity r2 = X.C737910Sx3.LIZIZ(r0)
        L28:
            boolean r0 = r2 instanceof X.C19EG
            if (r0 != 0) goto L2d
            r2 = r4
        L2d:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService> r0 = com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService r0 = (com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService) r0
            boolean r0 = r0.LJJLIIIJJI(r3)
            if (r0 == 0) goto L61
            r3 = r2
            if (r2 == 0) goto L61
        L42:
            android.content.Intent r1 = r3.getIntent()
            if (r1 == 0) goto L61
            java.lang.String r0 = "search_enter_param"
            java.io.Serializable r1 = r1.getSerializableExtra(r0)
        L4e:
            boolean r0 = r1 instanceof X.C0QER
            if (r0 == 0) goto L65
            X.0QER r1 = (X.C0QER) r1
            if (r1 == 0) goto L65
            java.lang.String r0 = r1.getTrafficSourceList()
            if (r0 != 0) goto L5e
            java.lang.String r0 = "[]"
        L5e:
            return r0
        L5f:
            r2 = r4
            goto L28
        L61:
            r1 = r4
            goto L4e
        L63:
            r3 = r4
            goto L12
        L65:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QEP.LJII():java.lang.String");
    }

    public static int LIZLLL(Uri uri) {
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

    public static int LJFF(Uri uri) {
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

    public static String LJI(Uri uri) {
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

    public static String LJIIIIZZ(Uri uri) {
        Object c098200Yq;
        String strLIZIZ = C1942307jB.LIZIZ(uri, "extra_business_params");
        String strOptString = null;
        if (strLIZIZ != null) {
            try {
                strOptString = new JSONObject(strLIZIZ).optString("promotion_icon_only");
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

    public static long LJIIIZ(Long l) {
        if (l != null && l.longValue() != 0) {
            return l.longValue();
        }
        C0QES.LIZ.getClass();
        if (C0QES.LIZIZ != null) {
            try {
                String str = C0QES.LIZIZ;
                if (str != null) {
                    return CastLongProtector.parseLong(str);
                }
                C189200o6.m2constructorimpl(null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        return System.currentTimeMillis();
    }

    public static C667170QEx LIZ(boolean z, Uri uri) {
        C0QSM c0qsmLJJZZI = C315220CXg.LIZ().LJJZZI(uri);
        Uri uriLJLJJI = C315220CXg.LIZ().LJLJJI(uri, c0qsmLJJZZI);
        if (c0qsmLJJZZI == C0QSM.FROM_UG_DEEPLINK_BUT_NOT_HAVE_FUNCTION) {
            return null;
        }
        C0QEQ c0qeqNewBuilder = C0QER.Companion.newBuilder();
        C650950Pg5 c650950Pg5LIZIZ = LIZIZ(uriLJLJJI, c0qeqNewBuilder, z);
        C0QER c0qerLJ = c0qeqNewBuilder.LJ();
        SearchResultParam searchResultParam = new SearchResultParam();
        LIZJ(uriLJLJJI, searchResultParam);
        searchResultParam.setSearchEnterParam(c0qerLJ);
        C315220CXg.LIZ().LJJL(uriLJLJJI, c0qsmLJJZZI, c650950Pg5LIZIZ.getImmutableData().searchEcommerceModel, searchResultParam);
        return new C667170QEx(searchResultParam, c650950Pg5LIZIZ);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZJ(Uri uri, SearchResultParam searchResultParam) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5;
        Object c098200Yq;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13;
        Integer numLJIIJJI;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter15;
        int i;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter16;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter17;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter18;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter19;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter20;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter21;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter22;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter23;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter24;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter25;
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        searchResultParam.setFilterOption(new C0PSG());
        if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
            for (String str : queryParameterNames) {
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1841902086:
                            if (str.equals("is_filter_search") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.getFilterOption().setDefaultOption(Intrinsics.LJFF(CardStruct.IStatusCode.DEFAULT, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter));
                            }
                            break;
                        case -1780004746:
                            if (str.equals("pre_search_id") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setLastSearchId(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
                            }
                            break;
                        case -1765562599:
                            if (str.equals("bubble_text_type") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setBubbleTextType(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
                            }
                            break;
                        case -1757454417:
                            if (str.equals("entry_show_type") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setShowType(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter4);
                            }
                            break;
                        case -1414420479:
                            if (str.equals("is_feed_liked")) {
                                searchResultParam.setFeedLiked(uri.getBooleanQueryParameter(str, false));
                            }
                            break;
                        case -1340656258:
                            if (str.equals("ec_page_feature_params") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                try {
                                    searchResultParam.setPageFeatureParams(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter5);
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
                        case -1250657755:
                            if (str.equals("penetrate_info") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setEcPenetrateInfo(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter6);
                            }
                            break;
                        case -814408215:
                            if (str.equals("keyword") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                if (!queryParameterNames.contains("display_keyword")) {
                                    searchResultParam.setKeyword(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7);
                                } else {
                                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter26 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "display_keyword");
                                    if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter26)) {
                                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter26;
                                    }
                                    searchResultParam.setKeyword(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter7);
                                }
                            }
                            break;
                        case -685906904:
                            if (str.equals("enter_method") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setEnterMethod(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter8);
                            }
                            break;
                        case -560734013:
                            if (str.equals("source_btm_page_id") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setSourceBtmPageId(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter9);
                            }
                            break;
                        case -539642911:
                            if (str.equals("search_from") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setSearchFrom(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter10);
                            }
                            break;
                        case -452763237:
                            if (str.equals("is_feed_comment_clicked")) {
                                searchResultParam.setFeedCommentClicked(uri.getBooleanQueryParameter(str, false));
                            }
                            break;
                        case -429654716:
                            if (str.equals("event_keyword") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setEventKeyword(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter11);
                            }
                            break;
                        case -346952694:
                            if (str.equals("switch_tab") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setSwitchTab(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter12);
                            }
                            break;
                        case -11918021:
                            if (str.equals("sort_type") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter13)) != null) {
                                searchResultParam.getFilterOption().setSortType(numLJIIJJI.intValue());
                            }
                            break;
                        case 3151786:
                            if (str.equals("from") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null && Intrinsics.LJFF(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter14, "push")) {
                                searchResultParam.setSearchFrom("push");
                            }
                            break;
                        case 96506544:
                            if (str.equals("avoid_record_history") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter15 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                Integer numLJIIJJI2 = C2095008Iq.LJIIJJI(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter15);
                                if (numLJIIJJI2 != null && numLJIIJJI2.intValue() == 1) {
                                    i = 0;
                                } else {
                                    i = 1;
                                }
                                searchResultParam.setShouldRecordInHistory(i);
                            }
                            break;
                        case 495151089:
                            if (str.equals("source_btm_token") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter16 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setSourceBtmToken(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter16);
                            }
                            break;
                        case 506361563:
                            if (str.equals("group_id") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter17 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setGroupId(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter17);
                            }
                            break;
                        case 516669515:
                            if (str.equals("trending_words_id") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter18 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setTrendingWordsId(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter18);
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
                            if (str.equals("trending_event_id") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter19 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setTrendingEventId(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter19);
                            }
                            break;
                        case 778996493:
                            if (str.equals("bubble_type") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter20 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setBubbleType(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter20);
                            }
                            break;
                        case 1273999649:
                            if (str.equals("capsule_word_list") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter21 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setCapsuleWords(new C20472080g(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter21, null));
                                searchResultParam.setKeyword(searchResultParam.getCapsuleWords().getKeyWord());
                            }
                            break;
                        case 1592562286:
                            if (str.equals("hashtag_id") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter22 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setHashtagId(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter22);
                            }
                            break;
                        case 1923929354:
                            if (str.equals("is_bubble_click") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter23 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setIsBubbleClick(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter23);
                            }
                            break;
                        case 2001337335:
                            if (str.equals("from_search_subtab") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter24 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setFromSearchSubtag(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter24);
                            }
                            break;
                        case 2071166924:
                            if (str.equals("utm_source") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter25 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)) != null) {
                                searchResultParam.setUtmSource(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter25);
                            }
                            break;
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x05a5  */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v24, types: [T, com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData] */
    /* JADX WARN: Type inference failed for: r0v5, types: [T, com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData] */
    /* JADX WARN: Type inference failed for: r0v68, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r20v3, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r39v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r43v1, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C650950Pg5 LIZIZ(android.net.Uri r65, X.C0QEQ r66, boolean r67) {
        /*
            Method dump skipped, instruction units count: 2686
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QEP.LIZIZ(android.net.Uri, X.0QEQ, boolean):X.0Pg5");
    }
}
