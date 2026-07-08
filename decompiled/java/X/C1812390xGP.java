package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0xGP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1812390xGP extends AbstractC1812400xGQ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        InterfaceC1812410xGR interfaceC1812410xGR = (InterfaceC1812410xGR) C1909107dp.LIZJ(InterfaceC1812410xGR.class, null);
        interfaceC1812410xGR.setDisplayStatusMap(iInteractService.Lo1(((InterfaceC1812380xGO) xBaseParamModel).getUidList(), C2097608Jq.LJ(), C2097608Jq.LJ()));
        completionBlock.onSuccess(interfaceC1812410xGR, "");
    }
}
