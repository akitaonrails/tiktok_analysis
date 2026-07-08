package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.compliance.api.services.consent.IPNSConsentSDKConfigService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0ywJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1876810ywJ extends AbstractC1876820ywK {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        InterfaceC1876830ywL interfaceC1876830ywL = (InterfaceC1876830ywL) xBaseParamModel;
        String consentKey = interfaceC1876830ywL.getConsentKey();
        if (consentKey.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
            return;
        }
        int iIntValue = interfaceC1876830ywL.getState().intValue();
        for (EnumC1876780ywG enumC1876780ywG : EnumC1876780ywG.values()) {
            if (enumC1876780ywG.getI() == iIntValue) {
                String collectionFlow = interfaceC1876830ywL.getCollectionFlow();
                if (collectionFlow.length() == 0) {
                    C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
                    return;
                }
                if (((IPNSConsentSDKConfigService) ServiceManager.get().getService(IPNSConsentSDKConfigService.class)).LIZ() == null) {
                    return;
                }
                List listSingletonList = Collections.singletonList(new C1876860ywO(consentKey, enumC1876780ywG, collectionFlow, null, null, null, 120));
                String scenario = interfaceC1876830ywL.getScenario();
                if (scenario == null) {
                    scenario = "";
                }
                C1915720zx4.LJIIIIZZ(new InterfaceC1915880zxK() { // from class: X.0ywI
                    @Override // X.InterfaceC1915880zxK
                    public final void LIZ(int i, String str) {
                        String containerID;
                        CompletionBlock<InterfaceC1876840ywM> completionBlock2 = completionBlock;
                        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                        if (interfaceC634840OvC != null) {
                            containerID = interfaceC634840OvC.getContainerID();
                        } else {
                            containerID = null;
                        }
                        completionBlock2.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1876840ywM.class, containerID), "");
                    }

                    @Override // X.InterfaceC1915880zxK
                    public final void onFailure(int i, String str) {
                        C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
                    }
                }, scenario, listSingletonList);
                return;
            }
        }
        C2382909Vj.LIZ(completionBlock, 0, null, null, 6);
    }
}
