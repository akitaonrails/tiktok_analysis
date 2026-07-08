package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0qIb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1544670qIb extends AbstractC1544680qIc {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1541990qEH interfaceC1541990qEH;
        C1537480q70 hybridContext;
        InterfaceC1544690qId interfaceC1544690qId = (InterfaceC1544690qId) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (interfaceC1541990qEH = (InterfaceC1541990qEH) interfaceC634840OvC.LIZIZ(InterfaceC1541990qEH.class)) != null && (hybridContext = interfaceC1541990qEH.getHybridContext()) != null) {
            hybridContext.LIZIZ(interfaceC1544690qId.getSubBidToAdd());
            hybridContext.LJJII(interfaceC1544690qId.getSubBidToDelete());
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1544700qIe.class, null), "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "Fail to get hybrid context.", null, 4);
    }
}
