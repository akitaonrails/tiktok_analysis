package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.09ae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2399009ae extends AbstractC2398709ab {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC2398909ad interfaceC2398909ad = (InterfaceC2398909ad) xBaseParamModel;
        XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC2398609aa.class, null);
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).vq1(interfaceC2398909ad.getEventName(), interfaceC2398909ad.getParams());
        completionBlock.onSuccess(xBaseResultModel, "");
    }
}
