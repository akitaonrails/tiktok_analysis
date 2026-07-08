package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.1B2G, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B2G extends C1B2E {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C1B2F c1b2f = (C1B2F) xBaseParamModel;
        ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).lR0(c1b2f.getLinkMicId(), c1b2f.isOpened());
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C1B2H.class, null), "");
    }
}
