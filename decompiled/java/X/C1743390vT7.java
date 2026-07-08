package X;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecug.MallLandingPerfTrackerDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecug.IMallLandingPerfTrackerDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0vT7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@InterfaceC1294060jmO
public final class C1743390vT7 extends AbstractC1743400vT8 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1748810vbr interfaceC1748810vbr;
        String str;
        String str2;
        AnonymousClass0317 anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        PageFinder pageFinderVia;
        View view;
        InterfaceC1743410vT9 interfaceC1743410vT9 = (InterfaceC1743410vT9) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            interfaceC1748810vbr = (InterfaceC1748810vbr) interfaceC634840OvC.LIZIZ(InterfaceC1748810vbr.class);
        } else {
            interfaceC1748810vbr = null;
        }
        String strLIZ = C1547280qMo.LIZ(this);
        String eventName = interfaceC1743410vT9.getEventName();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> params = interfaceC1743410vT9.getParams();
        if (params != null) {
            linkedHashMap.putAll(params);
        }
        Object obj = linkedHashMap.get("btm");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = linkedHashMap.get("btm_show_id");
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        if (C123100dR.LIZ(str) && (str2 == null || str2.length() == 0)) {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                pageFinderVia = (PageFinder) interfaceC634840OvC2.LIZIZ(PageFinder.class);
            } else {
                pageFinderVia = null;
            }
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            if (pageFinderVia == null) {
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null) {
                    view = interfaceC634840OvC3.getView();
                } else {
                    view = null;
                }
                pageFinderVia = PageFinder.via(view);
            }
            for (Map.Entry entry : BtmSDK.createReportParams$default(btmSDK, str, pageFinderVia, null, 4, null).entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    linkedHashMap.put(entry.getKey(), value);
                }
            }
        }
        ((IPdpCardBridgeService) ServiceManager.get().getService(IPdpCardBridgeService.class)).LJ(interfaceC1748810vbr, eventName, linkedHashMap);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin = MallLandingPerfTrackerDependencyService.createIMallLandingPerfTrackerDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IMallLandingPerfTrackerDependencyService.class.getName();
            if (anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IMallLandingPerfTrackerDependencyService.class);
        }
        ((IMallLandingPerfTrackerDependencyService) anonymousClass0317CreateIMallLandingPerfTrackerDependencyServicebyMonsterPlugin).onLandingFinished(strLIZ, eventName, linkedHashMap, 1);
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1743430vTB.class, null), "");
    }
}
