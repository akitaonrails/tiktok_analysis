package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;

/* JADX INFO: renamed from: X.0uzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1724940uzM extends AbstractC1724950uzN {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String strLJIIJ;
        InterfaceC1724960uzO interfaceC1724960uzO = (InterfaceC1724960uzO) xBaseParamModel;
        IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
        String containerID = null;
        if (iProbeService != null) {
            String entrance = interfaceC1724960uzO.getEntrance();
            String domain = interfaceC1724960uzO.getDomain();
            String fpSessionId = interfaceC1724960uzO.getFpSessionId();
            if (fpSessionId == null) {
                fpSessionId = "";
            }
            strLJIIJ = iProbeService.LJIIJ(new C1724990uzR(entrance, domain, fpSessionId));
        } else {
            strLJIIJ = null;
        }
        if (C123100dR.LIZ(strLJIIJ)) {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1724970uzP.class, containerID);
            InterfaceC1724970uzP interfaceC1724970uzP = (InterfaceC1724970uzP) xBaseModelLIZJ;
            interfaceC1724970uzP.setTransactionId(strLJIIJ);
            interfaceC1724970uzP.setSupported(Boolean.TRUE);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, -3, "setup failed", null, 4);
    }
}
