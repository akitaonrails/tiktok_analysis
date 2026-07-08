package X;

import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0pJT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1506770pJT extends AbstractC1506780pJU {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        InterfaceC1506790pJV interfaceC1506790pJV = (InterfaceC1506790pJV) xBaseParamModel;
        InterfaceC1506760pJS interfaceC1506760pJS = (InterfaceC1506760pJS) C1909107dp.LIZJ(InterfaceC1506760pJS.class, null);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (containerID = interfaceC634840OvC.getContainerID()) != null) {
            IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
            if (iGamePartnershipService != null && iGamePartnershipService.HU0() != null) {
                C1882810z5z.LIZ(containerID, interfaceC1506790pJV.getLoadSuccess());
            }
            interfaceC1506760pJS.setCode(1);
            completionBlock.onSuccess(interfaceC1506760pJS, "");
        }
    }
}
