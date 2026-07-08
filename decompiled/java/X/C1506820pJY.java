package X;

import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0pJY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1506820pJY extends AbstractC1506830pJZ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1506840pJa interfaceC1506840pJa = (InterfaceC1506840pJa) C1909107dp.LIZJ(InterfaceC1506840pJa.class, null);
        interfaceC1506840pJa.setPanelHasOpened(Boolean.valueOf(((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei().LJFF(((InterfaceC1506810pJX) xBaseParamModel).getAction().intValue())));
        completionBlock.onSuccess(interfaceC1506840pJa, "");
    }
}
