package X;

import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomApiLifecycleManager;
import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.PhotoSearchForceInterveneCard;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0QdW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674840QdW {
    public static final Map<String, Object> LIZ(C674800QdS c674800QdS) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = c674800QdS.apiVersion;
        if (str != null) {
            linkedHashMap.put("x-api-version", str);
        }
        EcomApiLifecycleManager.LIZ.getClass();
        if (EcomApiLifecycleManager.LJ && c674800QdS.keyword.length() > 0) {
            linkedHashMap.put("x-search-keyword", c674800QdS.keyword);
        }
        return linkedHashMap;
    }

    public static final Map<String, Object> LIZJ(C674800QdS c674800QdS) {
        int i;
        int filterBy;
        LinkedHashMap<String, Integer> linkedHashMapActivityToFieldMap;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C23092093a.LIZ.getClass();
        linkedHashMap.put("device_level", Integer.valueOf(C23092093a.LIZ()));
        String str = c674800QdS.searchChannel;
        if (str == null) {
            str = "tiktok_ecom";
        }
        linkedHashMap.put("search_channel", str);
        linkedHashMap.put("cursor", Long.valueOf(c674800QdS.cursor));
        linkedHashMap.put("section_cursor", Long.valueOf(c674800QdS.sectionCursor));
        linkedHashMap.put("keyword", c674800QdS.keyword);
        linkedHashMap.put("enter_from", c674800QdS.enterFrom);
        linkedHashMap.put("count", Integer.valueOf(c674800QdS.count));
        linkedHashMap.put("hot_search", Integer.valueOf(c674800QdS.hotSearch));
        linkedHashMap.put("search_id", c674800QdS.searchId);
        String str2 = c674800QdS.lastSearchId;
        if (str2 != null) {
            linkedHashMap.put("last_search_id", str2);
        }
        linkedHashMap.put("source", c674800QdS.source);
        linkedHashMap.put("search_source", c674800QdS.searchSource);
        linkedHashMap.put("query_correct_type", Integer.valueOf(c674800QdS.correctType));
        C0PSG c0psg = c674800QdS.filterOption;
        int sortType = 0;
        if (c0psg != null && !c0psg.isDefaultOption()) {
            i = 1;
        } else {
            i = 0;
        }
        linkedHashMap.put("is_filter_search", Integer.valueOf(i));
        C0PSG c0psg2 = c674800QdS.filterOption;
        if (c0psg2 != null) {
            filterBy = c0psg2.getFilterBy();
        } else {
            filterBy = 0;
        }
        linkedHashMap.put("filter_by", Integer.valueOf(filterBy));
        C0PSG c0psg3 = c674800QdS.filterOption;
        if (c0psg3 != null) {
            sortType = c0psg3.getSortType();
        }
        linkedHashMap.put("sort_type", Integer.valueOf(sortType));
        C0PSG c0psg4 = c674800QdS.filterOption;
        if (c0psg4 != null && (linkedHashMapActivityToFieldMap = c0psg4.activityToFieldMap()) != null) {
            linkedHashMap.putAll(linkedHashMapActivityToFieldMap);
        }
        String str3 = c674800QdS.searchContext;
        if (str3 != null) {
            linkedHashMap.put("search_context", str3);
        }
        String str4 = c674800QdS.sugTagText;
        if (str4 != null) {
            linkedHashMap.put("sug_tag_text", str4);
        }
        String str5 = c674800QdS.sugType;
        if (str5 != null) {
            linkedHashMap.put("sug_type", str5);
        }
        String str6 = c674800QdS.sugQueryState;
        if (str6 != null) {
            linkedHashMap.put("sug_query_state", str6);
        }
        String str7 = c674800QdS.sugCreatorId;
        if (str7 != null) {
            linkedHashMap.put("sug_creator_id", str7);
        }
        String str8 = c674800QdS.attachProducts;
        if (str8 != null) {
            linkedHashMap.put("attach_products", str8);
        }
        String str9 = c674800QdS.trafficSourceList;
        if (str9 != null) {
            linkedHashMap.put("traffic_source_list", str9);
        }
        String str10 = c674800QdS.cmplEnc;
        if (str10 != null) {
            linkedHashMap.put("cmpl_enc", str10);
        }
        String str11 = c674800QdS.originIsMallTab;
        if (str11 != null) {
            linkedHashMap.put("origin_is_mall_tab", str11);
        }
        String str12 = c674800QdS.ecSearchSessionId;
        if (str12 != null) {
            linkedHashMap.put("ec_search_session_id", str12);
        }
        String str13 = c674800QdS.sugShopId;
        if (str13 != null) {
            linkedHashMap.put("sug_shop_id", str13);
        }
        String str14 = c674800QdS.userRtActs;
        if (str14 != null) {
            linkedHashMap.put("user_rt_acts", str14);
        }
        String str15 = c674800QdS.searchSessionId;
        if (str15 != null) {
            linkedHashMap.put("search_session_id", str15);
        }
        String str16 = c674800QdS.userActions;
        if (str16 != null) {
            linkedHashMap.put("ecom_user_actions", str16);
        }
        String str17 = c674800QdS.passThroughParams;
        if (str17 != null) {
            linkedHashMap.put("passThroughParams", str17);
        }
        Map<String, String> map = c674800QdS.searchExtraRequestParams;
        if (map != null && (true ^ map.isEmpty())) {
            linkedHashMap.putAll(map);
        }
        Long l = c674800QdS.endToEndSearchSessionId;
        if (l != null) {
            linkedHashMap.put("end_to_end_search_session_id", Long.valueOf(l.longValue()));
        }
        Integer num = c674800QdS.useNewFilterArch;
        if (num != null) {
            linkedHashMap.put("use_new_filter_arch", Integer.valueOf(num.intValue()));
        }
        String str18 = c674800QdS.newUserExtraInfo;
        if (str18 != null) {
            linkedHashMap.put("new_user_extra_info_list", str18);
        }
        String str19 = c674800QdS.nineSearchProductId;
        if (str19 != null) {
            linkedHashMap.put("top_product_id", str19);
        }
        Integer num2 = c674800QdS.searchKeywordStrategy;
        if (num2 != null) {
            linkedHashMap.put("search_keyword_strategy", Integer.valueOf(num2.intValue()));
        }
        String str20 = c674800QdS.enterFromSecond;
        if (str20 != null) {
            linkedHashMap.put("enter_from_second", str20);
        }
        String str21 = c674800QdS.trafficDiversionInfo;
        if (str21 != null) {
            linkedHashMap.put("traffic_diversion_info", str21);
        }
        String str22 = c674800QdS.bcmChain;
        if (str22 != null) {
            linkedHashMap.put("bcm_chain", str22);
        }
        Integer num3 = c674800QdS.rootEnterFromType;
        if (num3 != null) {
            linkedHashMap.put("root_enter_from_type", Integer.valueOf(num3.intValue()));
        }
        String str23 = c674800QdS.clientRequestId;
        if (str23 != null) {
            linkedHashMap.put("client_request_id", str23);
        }
        Integer num4 = c674800QdS.noNeedPageStyle;
        if (num4 != null) {
            linkedHashMap.put("no_need_page_style", Integer.valueOf(num4.intValue()));
        }
        return linkedHashMap;
    }

    public static final Map<String, Object> LIZIZ(C674850QdX c674850QdX, C675150Qe1 c675150Qe1) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        Object c098200Yq;
        Object c098200Yq2;
        String str;
        String str2;
        String str3;
        TypedByteArray typedByteArray;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            C676050QfT c676050QfT = c674850QdX.photoSearch;
            if (c676050QfT != null && (typedByteArray = c676050QfT.image) != null) {
                linkedHashMap.put("image", typedByteArray);
            }
            String str4 = c674850QdX.apiVersion;
            if (str4 != null) {
                linkedHashMap.put("api_version", str4);
            }
            C676050QfT c676050QfT2 = c674850QdX.photoSearch;
            if (c676050QfT2 != null && (str3 = c676050QfT2.imageTosUri) != null) {
                linkedHashMap.put("image_uri", str3);
            }
            C676050QfT c676050QfT3 = c674850QdX.photoSearch;
            if (c676050QfT3 != null && (str2 = c676050QfT3.detection) != null) {
                linkedHashMap.put("detection", str2);
            }
            C676050QfT c676050QfT4 = c674850QdX.photoSearch;
            if (c676050QfT4 != null && (str = c676050QfT4.detectionIdx) != null) {
                linkedHashMap.put("detection_index", str);
            }
            String str5 = c674850QdX.searchChannel;
            if (str5 == null) {
                str5 = "tiktok_mall_photo_search";
            }
            linkedHashMap.put("search_channel", str5);
            String str6 = c674850QdX.keyword;
            if (str6 == null) {
                str6 = "";
            }
            linkedHashMap.put("keyword", str6);
            String str7 = c674850QdX.enterFrom;
            if (str7 != null) {
                linkedHashMap.put("enter_from", str7);
            }
            Integer num = c674850QdX.count;
            int i = 0;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            linkedHashMap.put("count", Integer.valueOf(iIntValue));
            Integer num2 = c674850QdX.hotSearch;
            if (num2 != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 0;
            }
            linkedHashMap.put("hot_search", Integer.valueOf(iIntValue2));
            String str8 = c674850QdX.searchId;
            if (str8 == null) {
                str8 = "";
            }
            linkedHashMap.put("search_id", str8);
            String str9 = c674850QdX.lastSearchId;
            if (str9 != null) {
                linkedHashMap.put("last_search_id", str9);
            }
            String str10 = c674850QdX.source;
            if (str10 != null) {
                linkedHashMap.put("source", str10);
            }
            String str11 = c674850QdX.searchSource;
            if (str11 != null) {
                linkedHashMap.put("search_source", str11);
            }
            Integer num3 = c674850QdX.correctType;
            if (num3 != null) {
                iIntValue3 = num3.intValue();
            } else {
                iIntValue3 = 0;
            }
            linkedHashMap.put("query_correct_type", Integer.valueOf(iIntValue3));
            String str12 = c674850QdX.searchContext;
            if (str12 != null) {
                linkedHashMap.put("search_context", str12);
            }
            String str13 = c674850QdX.attachProducts;
            if (str13 != null) {
                linkedHashMap.put("attach_products", str13);
            }
            String str14 = c674850QdX.trafficSourceList;
            if (str14 != null) {
                linkedHashMap.put("traffic_source_list", str14);
            }
            String str15 = c674850QdX.ecSearchSessionId;
            if (str15 != null) {
                linkedHashMap.put("ec_search_session_id", str15);
            }
            String str16 = c674850QdX.searchSessionId;
            if (str16 != null) {
                linkedHashMap.put("search_session_id", str16);
            }
            String str17 = c674850QdX.productDetailUri;
            if (str17 != null) {
                linkedHashMap.put("product_detail_uri", str17);
            }
            Integer num4 = c674850QdX.recallShield;
            if (num4 != null) {
                linkedHashMap.put("recall_shield", Integer.valueOf(num4.intValue()));
            }
            String str18 = c674850QdX.photoSearchExtra;
            if (str18 != null) {
                linkedHashMap.put("photo_search_extra", str18);
            }
            List<PhotoSearchForceInterveneCard> list = c674850QdX.forceInterveneCard;
            if (list != null) {
                linkedHashMap.put("force_intervene_card", list);
            }
            Long l = c674850QdX.endToEndSearchSessionId;
            if (l != null) {
                linkedHashMap.put("end_to_end_search_session_id", Long.valueOf(l.longValue()));
            }
            String str19 = c674850QdX.photoProductInfo;
            if (str19 != null) {
                linkedHashMap.put("photo_product_info", str19);
            }
            C0CBW c0cbw = C0CBW.LIZ;
            if (C0CBW.LIZIZ()) {
                i = 1;
            }
            linkedHashMap.put("is_low_device", Integer.valueOf(i));
            C1850107Ml.LIZ.getClass();
            linkedHashMap.put("is_weak_network", Integer.valueOf(C1850107Ml.LIZ() ? 1 : 0));
            try {
                c098200Yq = c674850QdX.getImageByteHash();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Object obj = null;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            String str20 = (String) c098200Yq;
            if (str20 != null) {
                linkedHashMap.put("image_hash", str20);
            }
            linkedHashMap.put("section_cursor", Long.valueOf(c675150Qe1.LIZIZ));
            Long l2 = c674850QdX.endToEndSearchSessionId;
            if (l2 != null) {
                linkedHashMap.put("end_to_end_search_session_id", Long.valueOf(l2.longValue()));
            }
            try {
                IEcomSearchService iEcomSearchService = (IEcomSearchService) PluggableExtentionKt.pluggableSpi$default(IEcomSearchService.class, false, false, false, 14, null);
                if (iEcomSearchService != null) {
                    c098200Yq2 = iEcomSearchService.LJLIL(null, "");
                } else {
                    c098200Yq2 = null;
                }
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                obj = c098200Yq2;
            }
            String str21 = (String) obj;
            if (str21 != null) {
                linkedHashMap.put("bcm_chain", str21);
            }
            String str22 = c674850QdX.userRtActs;
            if (str22 != null) {
                linkedHashMap.put("user_rt_acts", str22);
            }
            String str23 = c674850QdX.passThroughParams;
            if (str23 != null) {
                linkedHashMap.put("pass_through_params", str23);
            }
            String str24 = c674850QdX.enterFromSecond;
            if (str24 != null) {
                linkedHashMap.put("enter_from_second", str24);
            }
            Integer num5 = c674850QdX.rootEnterFromType;
            if (num5 != null) {
                linkedHashMap.put("root_enter_from_type", Integer.valueOf(num5.intValue()));
            }
            String strLIZ = C310750CGb.LIZ();
            if (strLIZ != null) {
                linkedHashMap.put("client_request_id", strLIZ);
            }
            C23092093a.LIZ.getClass();
            linkedHashMap.put("device_level", Integer.valueOf(C23092093a.LIZ()));
            return linkedHashMap;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return linkedHashMap;
        }
    }
}
