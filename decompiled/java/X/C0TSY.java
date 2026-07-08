package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0TSY, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TSY extends C0TSZ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC747020TSa interfaceC747020TSa = (InterfaceC747020TSa) xBaseParamModel;
        String str = "";
        InterfaceC747040TSc interfaceC747040TSc = (InterfaceC747040TSc) C1909107dp.LIZJ(InterfaceC747040TSc.class, null);
        try {
            Number cardHeight = interfaceC747020TSa.getCardHeight();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("JSB, set height: ");
            sbLIZ.append(cardHeight);
            C2188811AlT.LIZIZ(sbLIZ);
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC == null || (containerID = interfaceC634840OvC.getContainerID()) == null) {
                containerID = "";
            }
            C747150TSn.LIZ(cardHeight.intValue(), containerID);
            interfaceC747040TSc.setResult(1);
            completionBlock.onSuccess(interfaceC747040TSc, "");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String message = th.getMessage();
            if (message != null) {
                str = message;
            }
            C2382909Vj.LIZ(completionBlock, -1, str, null, 4);
            C1AF0.LJ(th);
        }
    }
}
