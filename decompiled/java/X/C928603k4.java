package X;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitEnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.starter.OrderSubmitRequestParam;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECOspPreviewExpand;
import com.ss.android.ugc.aweme.ecommerce.dependency.compliance.ComplianceDependencyService;
import com.ss.android.ugc.aweme.ecommerce.model.PlatformLinkBasedItem;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS228S0000000_1;

/* JADX INFO: renamed from: X.03k4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C928603k4 {
    public static final C928603k4 LIZ = new C928603k4();

    public static void LIZ(Context context, OrderSubmitEnterParams orderSubmitEnterParams, String str, String str2, String str3, int i, Integer num) {
        IECommerceHostService iECommerceHostService;
        Object obj;
        String str4;
        AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin;
        boolean z;
        String billInfoParams;
        Object obj2;
        List<OrderShopDigest> orderShopDigest;
        List<OrderShopDigest> orderShopDigest2;
        boolean z2;
        String name;
        String str5 = str2;
        C1120604Zw c1120604Zw = C1120604Zw.LIZ;
        String name2 = null;
        if (C034S.LIZ()) {
            c1120604Zw.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z2);
        } else {
            c1120604Zw.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        C03R0 c03r0 = new C03R0(((IApplicationDependencyService) iECommerceHostService).getCurrentActivity(), str, orderSubmitEnterParams.getBizType());
        if (ECOspPreviewExpand.LIZ()) {
            C212391189t.LIZ.getClass();
            String strLIZ = C212391189t.LIZ("order_submit_preview_params", "order_submit_preview_cache_params");
            if (strLIZ != null) {
                Integer seaOneStepType = orderSubmitEnterParams.getSeaOneStepType();
                if (seaOneStepType != null && seaOneStepType.intValue() > 0) {
                    C7862035g c7862035g = C7862035g.LIZ;
                    OrderSubmitRequestParam requestParams = orderSubmitEnterParams.getRequestParams();
                    if (requestParams != null) {
                        orderShopDigest2 = requestParams.getOrderShopDigest();
                    } else {
                        orderShopDigest2 = null;
                    }
                    c7862035g.getClass();
                    C7862035g.LIZIZ(str, strLIZ, orderShopDigest2);
                } else {
                    C742602vA c742602vA = C742602vA.LIZ;
                    OrderSubmitRequestParam requestParams2 = orderSubmitEnterParams.getRequestParams();
                    if (requestParams2 != null) {
                        orderShopDigest = requestParams2.getOrderShopDigest();
                    } else {
                        orderShopDigest = null;
                    }
                    c742602vA.getClass();
                    C742602vA.LIZIZ(str, strLIZ, orderShopDigest);
                }
                C993603uY.LIZJ(str, AFwS228S0000000_1.get$arr$(631));
            } else {
                C993603uY.LIZJ(str, AFwS228S0000000_1.get$arr$(632));
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("from_osp_starter", Boolean.TRUE);
        linkedHashMap.put("buy_type", Integer.valueOf(orderSubmitEnterParams.getBuyType()));
        String btmToken = orderSubmitEnterParams.getBtmToken();
        if (btmToken != null) {
            linkedHashMap.put("source_btm_token", btmToken);
        }
        String chainKey = orderSubmitEnterParams.getChainKey();
        if (chainKey != null) {
            linkedHashMap.put("chain_key", chainKey);
        }
        HashMap<String, Object> trackParams = orderSubmitEnterParams.getTrackParams();
        if (trackParams != null && (obj2 = trackParams.get("start_click_time")) != null) {
            linkedHashMap.put("start_click_time", obj2);
        }
        String pdpFrom = orderSubmitEnterParams.getPdpFrom();
        if (pdpFrom != null) {
            linkedHashMap.put("pdp_from", pdpFrom);
        }
        Integer combinedSkuOspType = orderSubmitEnterParams.getCombinedSkuOspType();
        if (combinedSkuOspType != null) {
            linkedHashMap.put("combined_sku_osp_type", Integer.valueOf(combinedSkuOspType.intValue()));
        }
        String voucherTypeId = orderSubmitEnterParams.getVoucherTypeId();
        if (voucherTypeId != null) {
            linkedHashMap.put("voucher_type_id", voucherTypeId);
        }
        OrderSubmitRequestParam requestParams3 = orderSubmitEnterParams.getRequestParams();
        if (requestParams3 != null && (billInfoParams = requestParams3.getBillInfoParams()) != null) {
            linkedHashMap.put("bill_info_server_params", billInfoParams);
        }
        Integer bizType = orderSubmitEnterParams.getBizType();
        if (bizType != null) {
            linkedHashMap.put("biz_type", Integer.valueOf(bizType.intValue()));
        }
        String pipoBnplSelectedTenure = orderSubmitEnterParams.getPipoBnplSelectedTenure();
        if (pipoBnplSelectedTenure != null) {
            linkedHashMap.put("pipo_bnpl_selected_tenure", pipoBnplSelectedTenure);
        }
        Integer freeShipping = orderSubmitEnterParams.getFreeShipping();
        if (freeShipping != null) {
            linkedHashMap.put("free_shipping", Integer.valueOf(freeShipping.intValue()));
        }
        PlatformLinkBasedItem platformLinkBasedItem = orderSubmitEnterParams.getPlatformLinkBasedItem();
        if (platformLinkBasedItem != null) {
            linkedHashMap.put("platform_link_based_item", C1741890vQh.LJIIIIZZ(platformLinkBasedItem));
        }
        Float skuPanelHeightPercent = orderSubmitEnterParams.getSkuPanelHeightPercent();
        if (skuPanelHeightPercent != null) {
            linkedHashMap.put("half_express_height_percent", Float.valueOf(skuPanelHeightPercent.floatValue()));
        }
        Integer seaOneStepType2 = orderSubmitEnterParams.getSeaOneStepType();
        if (seaOneStepType2 != null) {
            linkedHashMap.put("sea_one_step_type", Integer.valueOf(seaOneStepType2.intValue()));
        }
        Integer seaOneStepMask = orderSubmitEnterParams.getSeaOneStepMask();
        if (seaOneStepMask != null) {
            linkedHashMap.put("sea_one_step_mask", Integer.valueOf(seaOneStepMask.intValue()));
        }
        if (str5 == null || str5.length() == 0) {
            str5 = "aweme://ec/order_submit_v2";
        }
        String string = C919503ib.LIZJ(str5, linkedHashMap).toString();
        c03r0.LIZIZ(orderSubmitEnterParams, str3, i);
        HashMap<String, Object> trackParams2 = orderSubmitEnterParams.getTrackParams();
        if (trackParams2 != null) {
            obj = trackParams2.get("source_page_type");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str4 = (String) obj;
        } else {
            str4 = null;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, string);
        smartRouteBuildRoute.withParam("lib_track_rtn_id", str);
        if (C034S.LIZ()) {
            c1120604Zw.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = ComplianceDependencyService.createIComplianceDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name4 = IComplianceDependencyService.class.getName();
            if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                name2 = anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z);
        } else {
            c1120604Zw.LIZ();
            anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IComplianceDependencyService.class);
        }
        smartRouteBuildRoute.withParam(((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin).appendDataFlowId(new Bundle(), "402685955"));
        smartRouteBuildRoute.withParam("source_page_type", str4);
        smartRouteBuildRoute.withParam("from_ocp_fail", String.valueOf(i));
        if (num != null) {
            smartRouteBuildRoute.withParam("combined_sku_osp_type", String.valueOf(num.intValue()));
        }
        smartRouteBuildRoute.open();
    }
}
