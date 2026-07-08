package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0pEB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1503490pEB extends AbstractC1503500pEC {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1503510pED interfaceC1503510pED = (InterfaceC1503510pED) xBaseParamModel;
        InterfaceC1503520pEE appInstallQueryConfig = interfaceC1503510pED.getAppInstallQueryConfig();
        String containerID = null;
        if (appInstallQueryConfig != null && appInstallQueryConfig.getUserAgree()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ())), null, null, new C1503480pEA(interfaceC1503510pED, appInstallQueryConfig, completionBlock, this, null), 3);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1503470pE9.class, containerID);
        InterfaceC1503470pE9 interfaceC1503470pE9 = (InterfaceC1503470pE9) xBaseModelLIZJ;
        interfaceC1503470pE9.setApplist(C2097608Jq.LJ());
        interfaceC1503470pE9.setSupported(Boolean.TRUE);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }
}
