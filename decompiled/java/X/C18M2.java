package X;

import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.search.SearchDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.search.ISearchDependencyService;
import com.ss.android.ugc.aweme.feed.model.AnchorCustomData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18M2, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18M2 {
    public static final C18M2 LIZ = new C18M2();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("source_page_type", "entrance_form", "product_source", "product_id", "author_id", "is_ad", "action_type", "rec_content_id", "rec_content_type", "request_id", "track_id", "source_content_id", "enter_from_info", "purchase_path", "is_platform_product", "platform_product_id", "seller_product_id", "platform_product_id", "seller_sku_id", "platform_seller_id", "seller_seller_id");
    public static final List<String> LIZJ;
    public static final List<String> LIZLLL;

    static {
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI("anchor_show_type", "author_id", "product_id", "action_type", "product_source", "source_from", "source", "follow_status", "source_page_type", "entrance_form", "is_ad", "rec_content_id", "rec_content_type", "request_id", "search_id", "search_result_id", "effect_ad_extra", "track_id", "campaign_channel", "start_click_time", "previous_page", "source_content_id", "enter_from_info", "rec_session_id", "traffic_source_list", "purchase_path", "saleable_sku_num", "creative_id", "ad_id", "video_shopping_list_style", "biz_type", "rights_content", "rights_cnt", "button_name", "bcm_multiverse_id");
        LIZJ = listLJIIJJI;
        LIZLLL = listLJIIJJI;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZIZ(java.util.List r5, java.util.Map r6) {
        /*
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            int r0 = r2.hashCode()
            java.lang.String r1 = "video"
            r4 = 0
            switch(r0) {
                case -1366079744: goto L29;
                case -266558761: goto L46;
                case 741958194: goto L52;
                case 1276412531: goto L60;
                case 1329423302: goto L76;
                default: goto L1f;
            }
        L1f:
            if (r6 == 0) goto L25
            java.lang.Object r4 = r6.get(r2)
        L25:
            r3.put(r2, r4)
            goto L9
        L29:
            java.lang.String r1 = "traffic_source_list"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L1f
            if (r6 == 0) goto L3d
            java.lang.Object r0 = r6.get(r1)
            if (r0 == 0) goto L3d
            java.lang.String r4 = X.C1741890vQh.LJIIIIZZ(r0)
        L3d:
            r0 = 2
            int[] r0 = X.C1742080vR0.LIZJ(r0, r4)
            r3.put(r2, r0)
            goto L9
        L46:
            java.lang.String r0 = "previous_page"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1f
            r3.put(r2, r1)
            goto L9
        L52:
            java.lang.String r0 = "anchor_show_type"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1f
            java.lang.String r0 = "video_cart_tag"
            r3.put(r2, r0)
            goto L9
        L60:
            java.lang.String r1 = "rec_session_id"
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L1f
            if (r6 == 0) goto L70
            java.lang.Object r0 = r6.get(r1)
            if (r0 != 0) goto L72
        L70:
            java.lang.String r0 = ""
        L72:
            r3.put(r2, r0)
            goto L9
        L76:
            java.lang.String r0 = "source_page_type"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L1f
            r3.put(r2, r1)
            goto L9
        L82:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18M2.LIZIZ(java.util.List, java.util.Map):java.util.Map");
    }

    public static Map LIZ(String str, Integer num, String str2, String str3, AnchorProductInfoModel anchorProductInfoModel, ProductListModel productListModel, List list, Map map, Map map2) {
        String str4;
        IECommerceHostService iECommerceHostService;
        String authorUid;
        IECommerceHostService iECommerceHostService2;
        int followStatus;
        Integer numValueOf;
        User author;
        int iIntValue;
        String str5;
        String strLJI;
        IECommerceHostService iECommerceHostService3;
        boolean z;
        String str6;
        boolean z2;
        String name;
        boolean z3;
        String name2;
        boolean z4;
        String name3;
        if (productListModel == null) {
            return new LinkedHashMap();
        }
        map2.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        String str7 = productListModel.aid;
        if (str7 == null) {
            str7 = "";
        }
        map2.put("group_id", str7);
        map2.put("is_ad", Integer.valueOf(Intrinsics.LJFF(productListModel.isAd(), Boolean.TRUE) ? 1 : 0));
        String str8 = productListModel.authorUid;
        if (str8 == null) {
            str8 = "";
        }
        map2.put("author_id", str8);
        String str9 = productListModel.requestId;
        if (str9 == null) {
            str9 = "";
        }
        map2.put("request_id", str9);
        if (str == null) {
            str4 = "";
        } else {
            str4 = str;
        }
        map2.put("enter_from", str4);
        map2.put("anchor_show_type", "video_cart_tag");
        map2.put("product_source", String.valueOf(anchorProductInfoModel.extraData.platform));
        String str10 = anchorProductInfoModel.extraData.source;
        if (str10 == null) {
            str10 = "";
        }
        map2.put("source", str10);
        map2.put("product_id", String.valueOf(anchorProductInfoModel.extraData.productId));
        String str11 = productListModel.authorUid;
        Map<String, String> map3 = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            IAccountDependencyService iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            String name4 = IAccountDependencyService.class.getName();
            if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin != null) {
                name3 = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name3 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name4, name3, z4);
            iECommerceHostService = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        map2.put("is_self", Integer.valueOf(Intrinsics.LJFF(str11, ((IAccountDependencyService) iECommerceHostService).getUserId()) ? 1 : 0));
        map2.put("is_single_anchor", "no");
        if (num != null) {
            map2.put("item_order", String.valueOf(num.intValue() + 1));
        }
        Aweme aweme = productListModel.aweme;
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            IAccountDependencyService iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin2 = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin2 != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name5 = IAccountDependencyService.class.getName();
            if (iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin2 != null) {
                name2 = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin2.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name5, name2, z3);
            iECommerceHostService2 = iAccountDependencyServiceCreateIAccountDependencyServicebyMonsterPlugin2;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        if (Intrinsics.LJFF(authorUid, ((IAccountDependencyService) iECommerceHostService2).getUserId())) {
            numValueOf = null;
        } else {
            if (aweme != null && (author = aweme.getAuthor()) != null) {
                followStatus = author.getFollowStatus();
            } else {
                followStatus = -1;
            }
            numValueOf = Integer.valueOf(followStatus);
        }
        if (numValueOf != null) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 0;
        }
        map2.put("follow_status", Integer.valueOf(iIntValue));
        map2.put("source_page_type", "video");
        if (str3 != null && !a0.LJJJIL(str3)) {
            map2.put("entrance_form", str3);
        }
        map2.put("page_name", "video");
        if (str2 == null) {
            str5 = "";
        } else {
            str5 = str2;
        }
        try {
            try {
                strLJI = C21272218Mm.LJI(anchorProductInfoModel, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(anchorProductInfoModel.extraData.schema), "trackParams"), productListModel, str, str3, str5, null, null, map, 1920);
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                strLJI = "";
            }
        } catch (Exception e2) {
            e = e2;
        }
        map2.put("entrance_info", strLJI);
        map2.put("is_mix_product", C21272218Mm.LJIJ(anchorProductInfoModel.extra));
        Integer num2 = anchorProductInfoModel.extraData.productStatus;
        if (num2 != null && num2.intValue() == 70) {
            map2.put("shopping_status", "product_not_available");
        } else {
            map2.put("shopping_status", "product_available");
        }
        AnchorCustomData anchorCustomData = productListModel.anchorCustomData;
        if (anchorCustomData != null) {
            map3 = anchorCustomData.trackingData;
        }
        Map<String, String> map4 = productListModel.awemeExtraParams;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            ISearchDependencyService iSearchDependencyServiceCreateISearchDependencyServicebyMonsterPlugin = SearchDependencyService.createISearchDependencyServicebyMonsterPlugin(false);
            if (iSearchDependencyServiceCreateISearchDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name6 = ISearchDependencyService.class.getName();
            if (iSearchDependencyServiceCreateISearchDependencyServicebyMonsterPlugin != null) {
                name = iSearchDependencyServiceCreateISearchDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime3, 1, name6, name, z2);
            iECommerceHostService3 = iSearchDependencyServiceCreateISearchDependencyServicebyMonsterPlugin;
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ISearchDependencyService.class);
        }
        Map<String, String> logParamsFromSearch = ((ISearchDependencyService) iECommerceHostService3).getLogParamsFromSearch(str, null, "search_result_id", "search_id", "list_item_id", "last_from_group_id", "click_recom_search_entrance", "origin_is_mall_tab", "search_pre_product_id", "search_keyword");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map3 != null) {
            linkedHashMap.putAll(map3);
        }
        if (map4 != null) {
            linkedHashMap.putAll(map4);
        }
        if (logParamsFromSearch != null) {
            linkedHashMap.putAll(logParamsFromSearch);
        }
        C21272218Mm.LIZIZ(linkedHashMap, productListModel.mobParams);
        linkedHashMap.remove("enter_from_info");
        linkedHashMap.remove("source_page_type");
        map2.putAll(linkedHashMap);
        List<SkuItem> list2 = anchorProductInfoModel.extraData.skus;
        if (list2 != null && list2.size() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str6 = "1";
        } else {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        map2.put("is_single_sku", str6);
        map2.put("enter_from_info", productListModel.eventType);
        map2.put("biz_type", anchorProductInfoModel.extraData.bizType);
        map2.put("request_id", productListModel.requestId);
        map2.put("track_id", str2);
        map2.put("purchase_path", "skip_pdp");
        String str12 = productListModel.groupId;
        if (str12 == null) {
            str12 = "";
        }
        map2.put("source_content_id", str12);
        HashMap<String, String> map5 = productListModel.mobParams;
        if (map5 != null) {
            for (Map.Entry<String, String> entry : map5.entrySet()) {
                if (entry.getValue() != null) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    map2.put(key, value);
                }
            }
        }
        map2.put("button_name", "buy_now");
        C21272018Mk.LIZ.getClass();
        map2.putAll(C21272018Mk.LJIJI(anchorProductInfoModel, list));
        int i = C1742080vR0.LIZ;
        map2.put("traffic_source_list", C1742080vR0.LJ(productListModel.aweme));
        return map2;
    }
}
