package X;

import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0pGe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1505020pGe extends AbstractC1505030pGf {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        boolean z;
        IGamePartnershipService iGamePartnershipService;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC == null || (containerID = interfaceC634840OvC.getContainerID()) == null) {
            containerID = "";
        }
        if (containerID.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (iGamePartnershipService = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)) != null && iGamePartnershipService.HU0() != null) {
            C1882810z5z.LJFF(containerID);
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1505050pGh.class, null), "");
    }
}
