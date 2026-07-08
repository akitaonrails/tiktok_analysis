package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0ce9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1019870ce9 extends AbstractC1019880ceA {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1019890ceB interfaceC1019890ceB = (InterfaceC1019890ceB) xBaseParamModel;
        String containerID = null;
        if (interfaceC1019890ceB.getStatus() == null) {
            C2382909Vj.LIZ(completionBlock, -1, "status is empty", null, 4);
            return;
        }
        Number status = interfaceC1019890ceB.getStatus();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("status = ");
        sbLIZ.append(status);
        C2188811AlT.LIZIZ(sbLIZ);
        C811103Ev.LIZ("AdLynxSuperLikeStatusMethod");
        if (status != null) {
            C1440005kM.LIZ(new C997420c3w(status.intValue()));
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1019900ceC.class, containerID), "");
    }
}
