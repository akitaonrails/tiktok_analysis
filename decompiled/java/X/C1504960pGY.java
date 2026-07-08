package X;

import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0pGY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1504960pGY extends AbstractC1504920pGU {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        Pair<Boolean, String> pairLJII;
        boolean z;
        String second;
        InterfaceC1504930pGV interfaceC1504930pGV = (InterfaceC1504930pGV) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (containerID = interfaceC634840OvC.getContainerID()) != null) {
            IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
            if (iGamePartnershipService != null && iGamePartnershipService.HU0() != null) {
                pairLJII = C1882810z5z.LJII(containerID, interfaceC1504930pGV.getEventName());
            } else {
                pairLJII = null;
            }
            if (pairLJII != null && pairLJII.getFirst().booleanValue()) {
                z = true;
            } else {
                z = false;
            }
            String str = "";
            if (z) {
                InterfaceC1504950pGX interfaceC1504950pGX = (InterfaceC1504950pGX) C1909107dp.LIZJ(InterfaceC1504950pGX.class, null);
                interfaceC1504950pGX.setCode(1);
                interfaceC1504950pGX.setMsg(pairLJII.getSecond());
                completionBlock.onSuccess(interfaceC1504950pGX, "");
                return;
            }
            if (pairLJII != null && (second = pairLJII.getSecond()) != null) {
                str = second;
            }
            C2382909Vj.LIZ(completionBlock, -1, str, null, 4);
        }
    }
}
