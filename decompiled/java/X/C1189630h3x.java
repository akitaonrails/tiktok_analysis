package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0h3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189630h3x extends AbstractC1189640h3y {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        InterfaceC1189650h3z interfaceC1189650h3z = (InterfaceC1189650h3z) xBaseParamModel;
        String instanceId = interfaceC1189650h3z.getInstanceId();
        if (instanceId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String containerID = null;
        if (z) {
            C2382909Vj.LIZ(completionBlock, 0, "instanceId is null", null, 4);
            return;
        }
        String sessionId = interfaceC1189650h3z.getSessionId();
        if (sessionId.length() == 0) {
            C2382909Vj.LIZ(completionBlock, 0, "sessionId is null", null, 4);
            return;
        }
        InterfaceC1181010gq3 interfaceC1181010gq3LJFF = C1180170goh.LJFF(sessionId);
        if (interfaceC1181010gq3LJFF == null) {
            C2382909Vj.LIZ(completionBlock, 0, "did not find slashContainer", null, 4);
            return;
        }
        interfaceC1181010gq3LJFF.K40(instanceId, 0);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1189660h40.class, containerID), "");
    }
}
