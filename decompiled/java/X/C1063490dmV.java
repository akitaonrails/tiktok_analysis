package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0dmV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1063490dmV extends AbstractC1063500dmW {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID2 = null;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        InterfaceC1063510dmX interfaceC1063510dmX = (InterfaceC1063510dmX) C1909107dp.LIZJ(InterfaceC1063510dmX.class, containerID);
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            containerID2 = interfaceC634840OvC2.getContainerID();
        }
        interfaceC1063510dmX.setContainerId(containerID2);
        completionBlock.onSuccess(interfaceC1063510dmX, "");
    }
}
