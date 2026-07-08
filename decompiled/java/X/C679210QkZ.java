package X;

import android.view.View;
import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.ies.ugc.statisticlogger.btm.IBTMTrackerService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.IMixVSearchAbility;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceArchService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0QkZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679210QkZ extends AbstractC679220Qka {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View viewCe;
        IMixVSearchAbility iMixVSearchAbility;
        String containerID;
        View view;
        String str;
        String str2 = "";
        try {
            Map<String, Object> params = ((InterfaceC679230Qkb) xBaseParamModel).getParams();
            Object obj = params.get("ec_search_enter_method");
            if (obj != null) {
                C1766860w4y c1766860w4y = C1766860w4y.LIZ;
                String string = obj.toString();
                c1766860w4y.getClass();
                C1766860w4y.LJIILL(null, "ec_search_enter_method", string, true);
            }
            if (!((IECommerceArchService) ServiceManager.get().getService(IECommerceArchService.class)).LIZ()) {
                C2382909Vj.LIZ(completionBlock, 0, "btm ability does not enable", null, 4);
                return;
            }
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC == null || (viewCe = interfaceC634840OvC.getView()) == null || viewCe.getParent() == null) {
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null && (iMixVSearchAbility = (IMixVSearchAbility) interfaceC634840OvC2.LIZIZ(IMixVSearchAbility.class)) != null) {
                    viewCe = iMixVSearchAbility.Ce();
                } else {
                    viewCe = null;
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : params.entrySet()) {
                Object value = entry.getValue();
                if ((value instanceof String) && (str = (String) value) != null) {
                    linkedHashMap.put(entry.getKey(), str);
                }
            }
            if (C123100dR.LIZ((String) linkedHashMap.get("search_id"))) {
                ((ISearchService) ServiceManager.get().getService(ISearchService.class)).LJZL((String) linkedHashMap.get("search_id"));
                BtmSDK btmSDK = BtmSDK.INSTANCE;
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null) {
                    view = interfaceC634840OvC3.getView();
                } else {
                    view = null;
                }
                PageFinder pageFinderVia = PageFinder.via(view);
                BcmParams bcmParams = new BcmParams();
                bcmParams.put("search_id", (String) linkedHashMap.get("search_id"));
                btmSDK.setBcmPageParams(pageFinderVia, bcmParams, Boolean.FALSE);
            }
            if (viewCe != null) {
                C1766860w4y.LIZ.getClass();
                C1766860w4y.LJIILIIL(viewCe, linkedHashMap, true);
                InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
                if (interfaceC634840OvC4 != null) {
                    containerID = interfaceC634840OvC4.getContainerID();
                } else {
                    containerID = null;
                }
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC679240Qkc.class, containerID);
                ((InterfaceC679240Qkc) xBaseModelLIZJ).setPageData(((IBTMTrackerService) ServiceManager.get().getService(IBTMTrackerService.class)).getPageRecordChainStringDataSubPage(viewCe, true, null));
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "can not find attached view", null, 4);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message != null) {
                str2 = message;
            }
            C2382909Vj.LIZ(completionBlock, 0, str2, null, 4);
        }
    }
}
