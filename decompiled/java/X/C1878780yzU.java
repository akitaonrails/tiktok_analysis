package X;

import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0yzU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878780yzU extends AbstractC1878770yzT {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1878790yzV interfaceC1878790yzV = (InterfaceC1878790yzV) xBaseParamModel;
        String str = null;
        InterfaceC1878800yzW interfaceC1878800yzW = (InterfaceC1878800yzW) C1909107dp.LIZJ(InterfaceC1878800yzW.class, null);
        if (((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).S32() != null) {
            Number userType = interfaceC1878790yzV.getUserType();
            if (userType != null) {
                userType.intValue();
            }
            interfaceC1878790yzV.getRoomId();
            interfaceC1878790yzV.getTaskId();
            str = "";
        }
        interfaceC1878800yzW.setData(str);
        completionBlock.onSuccess(interfaceC1878800yzW, "");
    }
}
