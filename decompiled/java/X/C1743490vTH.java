package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0vTH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1743490vTH extends AbstractC1743500vTI {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1743450vTD interfaceC1743450vTD;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            interfaceC1743450vTD = (InterfaceC1743450vTD) interfaceC634840OvC.LIZIZ(InterfaceC1743450vTD.class);
        } else {
            interfaceC1743450vTD = null;
        }
        ((IPdpCardBridgeService) ServiceManager.get().getService(IPdpCardBridgeService.class)).LJFF(interfaceC1743450vTD);
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1743520vTK.class, null), "");
    }
}
