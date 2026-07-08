package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0vTR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1743590vTR extends AbstractC1743600vTS {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1743450vTD interfaceC1743450vTD;
        InterfaceC1743610vTT interfaceC1743610vTT = (InterfaceC1743610vTT) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            interfaceC1743450vTD = (InterfaceC1743450vTD) interfaceC634840OvC.LIZIZ(InterfaceC1743450vTD.class);
        } else {
            interfaceC1743450vTD = null;
        }
        String strLIZ = ((IPdpCardBridgeService) ServiceManager.get().getService(IPdpCardBridgeService.class)).LIZ(interfaceC1743450vTD, interfaceC1743610vTT.getBrickName().intValue());
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1743620vTU.class, null);
        ((InterfaceC1743620vTU) xBaseModelLIZJ).setRawData(strLIZ);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
