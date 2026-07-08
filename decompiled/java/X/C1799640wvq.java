package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0wvq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1799640wvq extends AbstractC1799620wvo {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Long lLJIILIIL = C2095008Iq.LJIILIIL(((InterfaceC1799630wvp) xBaseParamModel).getUserId());
        if (lLJIILIIL == null) {
            C2382909Vj.LIZ(completionBlock, 0, "invalid userId", null, 4);
        } else {
            ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).zV(lLJIILIIL.longValue(), new C1799650wvr(this, completionBlock));
        }
    }
}
