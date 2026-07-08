package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;

/* JADX INFO: renamed from: X.0dlG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1062720dlG extends AbstractC1062730dlH {
    @Override // X.AbstractC1549150qPp
    public final boolean shouldUseOriginalData(InterfaceC634840OvC interfaceC634840OvC) {
        return true;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        int i;
        String str = "";
        try {
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            InterfaceC1062740dlI interfaceC1062740dlI = (InterfaceC1062740dlI) C1909107dp.LIZJ(InterfaceC1062740dlI.class, containerID);
            if (ComplianceServiceProvider.LJIL().LJJJJZI()) {
                i = 1;
            } else {
                i = 0;
            }
            interfaceC1062740dlI.setTeenagersModel(i);
            interfaceC1062740dlI.setLanguage(C2222691Bz1.LIZIZ());
            completionBlock.onSuccess(interfaceC1062740dlI, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            String message = e.getMessage();
            if (message != null) {
                str = message;
            }
            C2382909Vj.LIZ(completionBlock, 0, str, null, 4);
        }
    }
}
