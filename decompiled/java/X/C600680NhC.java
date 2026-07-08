package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0NhC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C600680NhC extends AbstractC600690NhD {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        InterfaceC600710NhF interfaceC600710NhF = (InterfaceC600710NhF) xBaseParamModel;
        if (interfaceC600710NhF.getName().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String containerID = null;
        if (z) {
            C2382909Vj.LIZ(completionBlock, -1, "empty event name", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC == null) {
            C2382909Vj.LIZ(completionBlock, -1, "bridge context is empty", null, 4);
            return;
        }
        InterfaceC600380Ngi interfaceC600380Ngi = (InterfaceC600380Ngi) interfaceC634840OvC.LIZIZ(InterfaceC600380Ngi.class);
        if (interfaceC600380Ngi != null) {
            interfaceC600380Ngi.LIZJ(interfaceC634840OvC, new C599020NeW(interfaceC600710NhF.getName(), interfaceC600710NhF.getParams(), interfaceC600710NhF.getPerfParams(), 8));
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC600700NhE.class, containerID);
            InterfaceC600700NhE interfaceC600700NhE = (InterfaceC600700NhE) xBaseModelLIZJ;
            interfaceC600700NhE.setCode(0);
            interfaceC600700NhE.setMsg("success");
            interfaceC600700NhE.setData(C2097608Jq.LJ());
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "success");
            return;
        }
        C600390Ngj.LIZ("lack region context");
        C2382909Vj.LIZ(completionBlock, -1, "lack region context", null, 4);
    }
}
