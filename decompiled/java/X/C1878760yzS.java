package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0yzS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878760yzS extends AbstractC1878720yzO {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1878730yzP interfaceC1878730yzP = (InterfaceC1878730yzP) xBaseParamModel;
        XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC1878740yzQ.class, null);
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).UP1(new C915190ZvJ(interfaceC1878730yzP.getFrom(), true, 4), EnumC20429314wl.MULTI_GUEST);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("params=");
        sbLIZ.append(interfaceC1878730yzP);
        C1AZW.LJIIJ(12, "Play_OpenPlaybookManagerPanelMethod_27", C2188811AlT.LIZIZ(sbLIZ), null, null);
        completionBlock.onSuccess(xBaseResultModel, "");
    }
}
