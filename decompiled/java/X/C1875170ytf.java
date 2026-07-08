package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0ytf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1875170ytf extends AbstractC1875130ytb {
    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        InterfaceC634840OvC interfaceC634840OvC;
        String containerID;
        super.release();
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 == null || interfaceC634840OvC2.getContext() == null || (interfaceC634840OvC = this.IBridgeSdkContext) == null || (containerID = interfaceC634840OvC.getContainerID()) == null || containerID.length() == 0) {
            return;
        }
        C1700100uLI.LIZ(containerID, null, null);
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1063720dms interfaceC1063720dms;
        InterfaceC634840OvC interfaceC634840OvC;
        InterfaceC1875160yte interfaceC1875160yte = (InterfaceC1875160yte) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null && (interfaceC1063720dms = (InterfaceC1063720dms) interfaceC634840OvC2.LIZIZ(InterfaceC1063720dms.class)) != null) {
            InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
            if (interfaceC634840OvC3 != null && interfaceC634840OvC3.getContext() != null) {
                String containerID = interfaceC1875160yte.getContainerID();
                if ((containerID != null || ((interfaceC634840OvC = this.IBridgeSdkContext) != null && (containerID = interfaceC634840OvC.getContainerID()) != null)) && containerID.length() != 0) {
                    C1700100uLI.LIZ(containerID, interfaceC1875160yte.getSocketTaskID(), new C1875180ytg(completionBlock, this, interfaceC1063720dms, interfaceC1875160yte));
                    return;
                } else {
                    C2382909Vj.LIZ(completionBlock, 0, "ContainerID not provided in host", null, 4);
                    return;
                }
            }
            C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "JsEventDelegate not provided in host", null, 4);
    }
}
