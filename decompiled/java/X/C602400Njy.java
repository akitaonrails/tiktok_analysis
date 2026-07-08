package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.service.IPdpCardBridgeService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0Njy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C602400Njy extends AbstractC602380Njw {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1748810vbr interfaceC1748810vbr;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            interfaceC1748810vbr = (InterfaceC1748810vbr) interfaceC634840OvC.LIZIZ(InterfaceC1748810vbr.class);
        } else {
            interfaceC1748810vbr = null;
        }
        HashMap<String, Object> mapLIZLLL = ((IPdpCardBridgeService) ServiceManager.get().getService(IPdpCardBridgeService.class)).LIZLLL(interfaceC1748810vbr);
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC602370Njv.class, null);
        ((InterfaceC602370Njv) xBaseModelLIZJ).setData(mapLIZLLL);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
