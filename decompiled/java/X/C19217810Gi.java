package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.10Gi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19217810Gi extends AbstractC19217910Gj {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        String containerID2;
        int iLIZ;
        InterfaceC19218110Gl interfaceC19218110Gl = (InterfaceC19218110Gl) xBaseParamModel;
        try {
            PrivacyUserSettingsV2 privacyUserSettingsV2LJIIIIZZ = ((IPrivacyService) ServiceManager.get().getService(IPrivacyService.class)).LJIIIIZZ();
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            } else {
                containerID = null;
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC19218010Gk.class, containerID);
            InterfaceC19218010Gk interfaceC19218010Gk = (InterfaceC19218010Gk) xBaseModelLIZJ;
            ArrayList arrayList = new ArrayList();
            for (String str : interfaceC19218110Gl.getSettingsKey()) {
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID2 = interfaceC634840OvC2.getContainerID();
                } else {
                    containerID2 = null;
                }
                XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC19218210Gm.class, containerID2);
                InterfaceC19218210Gm interfaceC19218210Gm = (InterfaceC19218210Gm) xBaseModelLIZJ2;
                interfaceC19218210Gm.setKey(str);
                if (privacyUserSettingsV2LJIIIIZZ == null || (iLIZ = privacyUserSettingsV2LJIIIIZZ.LIZ(str)) == null) {
                    iLIZ = -1;
                }
                interfaceC19218210Gm.setValue(iLIZ);
                arrayList.add((InterfaceC19218210Gm) xBaseModelLIZJ2);
            }
            interfaceC19218010Gk.setSettingsValue(arrayList);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2382909Vj.LIZ(completionBlock, 0, "Failed to get permission value.", null, 4);
        }
    }
}
