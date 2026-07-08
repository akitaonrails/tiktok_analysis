package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import defpackage.d;

/* JADX INFO: renamed from: X.0cWU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015120cWU extends d {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        d.a aVar = (d.a) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (containerID = interfaceC634840OvC.getContainerID()) != null) {
            Number backOldTime = aVar.getBackOldTime();
            C1440005kM.LIZ(new C1641406bk(getName(), containerID, aVar));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("containerID:");
            sbLIZ.append(containerID);
            sbLIZ.append(", backOldTime:");
            sbLIZ.append(backOldTime);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
