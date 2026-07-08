package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import defpackage.r;
import java.util.List;

/* JADX INFO: renamed from: X.0cWV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015130cWV extends r {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        r.b bVar = (r.b) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (containerID = interfaceC634840OvC.getContainerID()) != null) {
            List<Number> timeList = bVar.getTimeList();
            C1440005kM.LIZ(new C1641406bk(getName(), containerID, bVar));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("containerID:");
            sbLIZ.append(containerID);
            sbLIZ.append(", timeList:");
            sbLIZ.append(timeList);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
