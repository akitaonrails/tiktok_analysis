package X;

import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0vTW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1743640vTW extends AbstractC1743650vTX {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1748810vbr interfaceC1748810vbr;
        Context context;
        InterfaceC1743660vTY interfaceC1743660vTY = (InterfaceC1743660vTY) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            interfaceC1748810vbr = (InterfaceC1748810vbr) interfaceC634840OvC.LIZIZ(InterfaceC1748810vbr.class);
        } else {
            interfaceC1748810vbr = null;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            context = interfaceC634840OvC2.getContext();
        } else {
            context = null;
        }
        ((IPdpCardBridgeService) ServiceManager.get().getService(IPdpCardBridgeService.class)).LIZIZ(interfaceC1748810vbr, context, interfaceC1743660vTY.getSchema(), interfaceC1743660vTY.getParams());
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1743670vTZ.class, null), "");
    }
}
