package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.libra.EcSeaPdpHeaderImgResolutionExperiment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcPdpReviewExposureModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcSeaPdpLivePlaybackEntranceSettings;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IEcUgPopupDependencyService;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSource;
import com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04J0, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04J0 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final Map<String, Object> LIZ = new LinkedHashMap();

    public final Map<String, Object> LIZ(IPdpStarter.PdpEnterParam pdpEnterParam, int i, Boolean bool, String str, Integer num) {
        List list;
        Object objLJJJLL;
        List list2;
        IECommerceHostService iECommerceHostService;
        PageSourceInfo pageSourceInfoLJ;
        IECommerceHostService iECommerceHostService2;
        Map mapLJIIJ;
        boolean z;
        String name;
        boolean z2;
        String name2;
        String strLJII;
        int i2;
        String str2;
        n nVar;
        String string;
        n nVar2;
        int i3;
        String string2;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        int iLIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(pdpEnterParam.requestParams);
        Object obj10 = linkedHashMap.get("product_id");
        String string3 = null;
        if (obj10 instanceof List) {
            list = (List) obj10;
        } else {
            list = null;
        }
        if (list != null) {
            objLJJJLL = C13LP.LJJJLL(list);
        } else {
            objLJJJLL = null;
        }
        if (objLJJJLL != null) {
            Map<String, Object> map = pdpEnterParam.productEnterContext;
            if (map != null) {
                obj9 = map.get(objLJJJLL);
            } else {
                obj9 = null;
            }
            if (obj9 != null && ((Map) pdpEnterParam.productEnterContext.get(objLJJJLL)).get("enter_source_type") != null) {
                C1758310vrB c1758310vrB = C1758310vrB.LIZJ;
                Object obj11 = ((Map) pdpEnterParam.productEnterContext.get(objLJJJLL)).get("enter_source_type");
                c1758310vrB.getClass();
                iLIZ = C1758310vrB.LJJJJJL(obj11);
            } else {
                C1013003xg c1013003xg = IPdpStarter.LIZ;
                Map<String, Object> map2 = pdpEnterParam.trackParams;
                c1013003xg.getClass();
                iLIZ = C1013003xg.LIZ(map2);
            }
            linkedHashMap.put("product_source_info", C2097608Jq.LJI(new Pair(objLJJJLL, Integer.valueOf(iLIZ))));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        Object obj12 = linkedHashMap.get("product_id");
        if (obj12 instanceof List) {
            list2 = (List) obj12;
        } else {
            list2 = null;
        }
        if (list2 != null) {
            for (Object obj13 : list2) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                if (i != 0) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                linkedHashMap3.put("req_type", Integer.valueOf(i3));
                Map<String, Object> map3 = pdpEnterParam.productEnterContext;
                if (map3 != null && map3.get(obj13) != null) {
                    linkedHashMap3.putAll((Map) pdpEnterParam.productEnterContext.get(obj13));
                }
                Map<String, Object> map4 = pdpEnterParam.trackParams;
                if (map4 == null || (obj8 = map4.get("is_from_selection_scenarios")) == null || (string2 = obj8.toString()) == null) {
                    string2 = "";
                }
                linkedHashMap3.put("is_from_selection_scenarios", Boolean.valueOf(Intrinsics.LJFF(string2, "1")));
                Map<String, Object> map5 = pdpEnterParam.trackParams;
                if (map5 != null && (obj7 = map5.get("source_content_id")) != null) {
                    linkedHashMap3.put("source_content_id", obj7);
                    linkedHashMap3.put("enter_source_id", obj7);
                }
                Map<String, Object> map6 = pdpEnterParam.trackParams;
                if (map6 != null && (obj6 = map6.get("source_page_type")) != null) {
                    linkedHashMap3.put("source_page_type", obj6);
                    linkedHashMap3.put("first_source_page", obj6);
                }
                Map<String, Object> map7 = pdpEnterParam.trackParams;
                if (map7 != null && (obj5 = map7.get("enter_from_info")) != null) {
                    linkedHashMap3.put("enter_from_info", obj5);
                }
                Map<String, Object> map8 = pdpEnterParam.trackParams;
                if (map8 != null && (obj4 = map8.get("previous_page")) != null) {
                    linkedHashMap3.put("previous_page", obj4);
                }
                Map<String, Object> map9 = pdpEnterParam.trackParams;
                if (map9 != null && (obj3 = map9.get("enter_method")) != null) {
                    linkedHashMap3.put("enter_method", obj3);
                }
                Map<String, Object> map10 = pdpEnterParam.trackParams;
                if (map10 != null && (obj2 = map10.get("enter_from")) != null) {
                    linkedHashMap3.put("enter_from", obj2);
                }
                Map<String, Object> map11 = pdpEnterParam.trackParams;
                if (map11 != null && (obj = map11.get("enter_from_merge")) != null) {
                    linkedHashMap3.put("enter_form_merge", obj);
                }
                if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    linkedHashMap3.put("page_name", "product_detail");
                }
                linkedHashMap2.put(obj13, linkedHashMap3);
            }
        }
        linkedHashMap.put("product_enter_context", linkedHashMap2);
        C1742270vRJ.LIZ(pdpEnterParam, linkedHashMap);
        if (i == 4) {
            pageSourceInfoLJ = C1766860w4y.LJFF(C1766860w4y.LIZ, new PageSource(EnumC1740810vOx.LIVE_PAGE.getPageCode(), null), null, null, 6);
        } else {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IEcUgPopupDependencyService.class);
                if (iECommerceHostService != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name3 = IEcUgPopupDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name2 = iECommerceHostService.getClass().getName();
                } else {
                    name2 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IEcUgPopupDependencyService.class);
            }
            Boolean boolIsFromEcUg = ((IEcUgPopupDependencyService) iECommerceHostService).isFromEcUg(pdpEnterParam.trackParams);
            Boolean bool2 = Boolean.TRUE;
            if (Intrinsics.LJFF(boolIsFromEcUg, bool2)) {
                C1766860w4y c1766860w4y = C1766860w4y.LIZ;
                String pageCode = EnumC1740810vOx.PDP_PAGE.getPageCode();
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IEcUgPopupDependencyService.class);
                    if (iECommerceHostService2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name4 = IEcUgPopupDependencyService.class.getName();
                    if (iECommerceHostService2 != null) {
                        name = iECommerceHostService2.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IEcUgPopupDependencyService.class);
                }
                if (Intrinsics.LJFF(((IEcUgPopupDependencyService) iECommerceHostService2).isFromEcUgVSA(pdpEnterParam.trackParams), bool2)) {
                    mapLJIIJ = C2097608Jq.LJIIJ(new Pair("ec_is_video_page", "1"));
                } else {
                    mapLJIIJ = null;
                }
                pageSourceInfoLJ = C1766860w4y.LJFF(c1766860w4y, new PageSource(pageCode, mapLJIIJ), null, null, 6);
            } else if (Intrinsics.LJFF(bool, bool2)) {
                pageSourceInfoLJ = C1766860w4y.LJFF(C1766860w4y.LIZ, new PageSource(EnumC1740810vOx.PDP_PAGE.getPageCode(), null), null, pdpEnterParam.btmToken, 2);
                linkedHashMap.put("request_scene", 1);
            } else {
                pageSourceInfoLJ = C1766860w4y.LJ(C1766860w4y.LIZ, pdpEnterParam.btmToken, 1);
            }
        }
        if (linkedHashMap.get("request_scene") == null && num != null) {
            linkedHashMap.put("request_scene", Integer.valueOf(num.intValue()));
        }
        if (linkedHashMap.get("request_scene") == null && Intrinsics.LJFF(bool, Boolean.TRUE) && C0C64.LJIILLIIL().LJIIIZ(31744, "pdp_request_scene", true, false)) {
            linkedHashMap.put("request_scene", 1);
        }
        if (pageSourceInfoLJ != null) {
            linkedHashMap.put("page_source_info", C1741890vQh.LJIIIIZZ(pageSourceInfoLJ));
        }
        String str3 = pdpEnterParam.btmToken;
        if (str3 != null) {
            strLJII = new C1053804Ae().LIZ.LJII(str3, null);
        } else {
            strLJII = null;
        }
        if (strLJII != null) {
            linkedHashMap.put("bcm_chain", strLJII);
        }
        boolean zLIZIZ = AnonymousClass0405.LIZIZ();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap5.put("ecom_logistic_display_opt", Integer.valueOf(C811603Fa.LIZ() ? 1 : 0));
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "display_history_shipday", true, false)) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        linkedHashMap5.put("display_history_shipday", Integer.valueOf(i2));
        linkedHashMap5.put("ecom_pdp_folding_display", 1);
        int i4 = !zLIZIZ ? 1 : 0;
        linkedHashMap5.put("is_new_pdp_logistic_module", Integer.valueOf(i4));
        linkedHashMap5.put("segregate_review_list", Integer.valueOf(i4));
        linkedHashMap5.put("pdp_promo_cx_optimization", 0);
        linkedHashMap5.put("pdp_desc_layout_improve", Integer.valueOf(i4));
        linkedHashMap5.put("ec_sku_waist_switch_config", Integer.valueOf(C077D.LIZ() ? 1 : 0));
        linkedHashMap4.put("param", linkedHashMap5);
        linkedHashMap5.put("ecom_pdp_header_video", Integer.valueOf(C04J1.LIZ()));
        if (zLIZIZ) {
            linkedHashMap5.put("ec_sea_pdp_price_style", 3);
            linkedHashMap6.put("logistic_move_up_config", "{\"button_strategy\":\"free_first\",\"enable_free_shipping_logo\":true,\"need_product_info_refresh\":true,\"pdp_free_shipping_label\":\"multiple_sku\",\"pdp_free_shipping_tag_type\":2,\"pdp_logistics_module_style\":\"full\",\"shipping_and_user_right_move_up\":true}");
            linkedHashMap6.put("pdp_first_screen_opt_config", "{\"full_pdp_header_to_top\":false,\"has_label_floor\":true,\"promotion_and_waist_up\":true,\"half_pdp_shorten_height\":false,\"base_ui_change\":true}");
            linkedHashMap6.put("pdp_first_screen_opt_config_part_2", "{\"product_desc_ui_fix\":true,\"price_color_optimize\":true,\"sku_ui_optimize\":true}");
            linkedHashMap6.put("ec_sea_pdp_header_img_resolution", EcSeaPdpHeaderImgResolutionExperiment.LIZ.getValue());
            linkedHashMap6.put("ec_pdp_sea_bff_config", C1071004Gu.LIZJ().toString());
            linkedHashMap6.put("pdp_shop_entry", "1");
            linkedHashMap6.put("ec_pdp_sea_profile_benefit", String.valueOf(C0C64.LJIILLIIL().LJIJ(31744, 0, "ec_pdp_sea_profile_benefit", true)));
            if (EcSeaPdpLivePlaybackEntranceSettings.LIZ()) {
                EcSeaPdpLivePlaybackEntranceSettings.EcSeaPdpLivePlaybackEntranceModel ecSeaPdpLivePlaybackEntranceModel = EcSeaPdpLivePlaybackEntranceSettings.LIZ;
                linkedHashMap6.put("ec_sea_pdp_playback_config", C1741890vQh.LJIIIIZZ(C2097608Jq.LJIIIIZZ(new Pair("enable_show_live_entrance_enter_from_video", ecSeaPdpLivePlaybackEntranceModel.enableLiveEntranceShortVideoChannel), new Pair("enable_live_playback_entrance", ecSeaPdpLivePlaybackEntranceModel.enableLivePlaybackEntrance))));
            }
            if (C1074804Ig.LIZ()) {
                try {
                    nVar2 = C1074804Ig.LIZIZ().serverParams;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1019103yf.LIZ(EnumC1014603xw.ERR_READ_EXP_ERROR, e, null);
                }
                if (nVar2 != null) {
                    string = nVar2.toString();
                } else {
                    string = null;
                }
                if (string != null) {
                    linkedHashMap6.put("review_display_improvement", string);
                }
            }
            try {
                EcPdpReviewExposureModel ecPdpReviewExposureModel = (EcPdpReviewExposureModel) C1179504jR.LIZIZ.getValue();
                if (ecPdpReviewExposureModel != null && (nVar = ecPdpReviewExposureModel.passThroughParams) != null) {
                    string3 = nVar.toString();
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1019103yf.LIZ(EnumC1014603xw.ERR_READ_EXP_ERROR, e2, null);
            }
            if (string3 != null) {
                linkedHashMap6.put("pdp_review_add_exposure", string3);
            }
            if (C1071004Gu.LIZ()) {
                C1055504Av.LIZ.getClass();
                C1055504Av.LJI(linkedHashMap6);
            }
        } else {
            Map mapLIZ = C1758480vrS.LIZ();
            if (mapLIZ != null) {
                linkedHashMap6.putAll(mapLIZ);
            }
        }
        linkedHashMap4.put("params_map", linkedHashMap6);
        linkedHashMap.put("experiment", linkedHashMap4);
        linkedHashMap.put("biz_template", Integer.valueOf(AnonymousClass0408.LJIIJJI(AnonymousClass0408.LIZ, C955103oL.LIZ(pdpEnterParam.bizType), "product_detail", null, null, 12)));
        OneClickPayContext oneClickPayContext = pdpEnterParam.ocpContext;
        if (oneClickPayContext == null || (str2 = oneClickPayContext.buyerAddressId) == null) {
            if (str == null) {
                C973303rH.LL.getClass();
                str2 = C973303rH.LLILLJJLI;
            } else {
                str2 = str;
            }
        }
        if (str2 != null) {
            linkedHashMap.put("selected_address_id", str2);
        }
        C973303rH.LL.getClass();
        linkedHashMap.put("ship_to_addr", C973303rH.LLILLL);
        OneClickPayContext oneClickPayContext2 = pdpEnterParam.ocpContext;
        if (oneClickPayContext2 != null) {
            linkedHashMap.put("one_click_pay_context", oneClickPayContext2);
        }
        Integer num2 = pdpEnterParam.ocpFlag;
        if (num2 != null) {
            linkedHashMap.put("should_use_ocp", Integer.valueOf(num2.intValue()));
        }
        String str4 = pdpEnterParam.ocpOrderId;
        if (str4 != null) {
            linkedHashMap.put("ocp_main_order_id", str4);
        }
        String str5 = pdpEnterParam.recipientInfoId;
        if (str5 != null) {
            linkedHashMap.put("user_virtual_info_id", str5);
        }
        List<String> list3 = pdpEnterParam.checkedSkuIds;
        List<String> list4 = list3;
        if (list3 == null) {
            list4 = C13BV.INSTANCE;
        }
        linkedHashMap.put("preselect_spec_ids", list4);
        linkedHashMap.putAll(C1742270vRJ.LIZIZ(pdpEnterParam));
        linkedHashMap.putAll(this.LIZ);
        return linkedHashMap;
    }
}
