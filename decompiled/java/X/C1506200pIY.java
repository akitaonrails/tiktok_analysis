package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0pIY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1506200pIY extends AbstractC1506210pIZ {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        InterfaceC1506230pIb interfaceC1506230pIb = (InterfaceC1506230pIb) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei();
            if (!C517110KPt.LJIIJ(interfaceC1506230pIb.getKey(), interfaceC1506230pIb.getValue())) {
                C1505830pHx.LIZIZ(context, interfaceC1506230pIb.getKey(), interfaceC1506230pIb.getValue());
            }
            InterfaceC1506220pIa interfaceC1506220pIa = (InterfaceC1506220pIa) C1909107dp.LIZJ(InterfaceC1506220pIa.class, null);
            interfaceC1506220pIa.setCode(1);
            completionBlock.onSuccess(interfaceC1506220pIa, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
    }
}
