package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import defpackage.b;

/* JADX INFO: renamed from: X.0cWT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015110cWT extends b {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        b.a aVar = (b.a) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (containerID = interfaceC634840OvC.getContainerID()) != null) {
            C1440005kM.LIZ(new C1641406bk(getName(), containerID, aVar));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("containerID:");
            sbLIZ.append(containerID);
            sbLIZ.append(", height: ");
            sbLIZ.append(aVar.getSize().getHeight());
            sbLIZ.append(", width: ");
            sbLIZ.append(aVar.getSize().getWidth());
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
