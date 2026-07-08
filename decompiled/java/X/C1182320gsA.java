package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0gsA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1182320gsA extends AbstractC1182330gsB {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC1182340gsC interfaceC1182340gsC = (InterfaceC1182340gsC) xBaseParamModel;
        try {
            C1180470gpB.LIZIZ(interfaceC1182340gsC.getSessionID(), interfaceC1182340gsC.getSessionInfo());
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1182350gsD.class, containerID), "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1205490hTX.LIZ.LJ(C1EMR.POI_SESSION_MANAGER_ERR, th);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("throwable: msg: ");
            sbLIZ.append(th.getMessage());
            sbLIZ.append(" stack: ");
            sbLIZ.append(C13SZ.LIZIZ(th));
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
        }
    }
}
