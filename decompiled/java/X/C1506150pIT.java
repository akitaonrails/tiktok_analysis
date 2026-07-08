package X;

import android.content.Context;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0pIT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1506150pIT extends AbstractC1506160pIU {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        InterfaceC1506170pIV interfaceC1506170pIV = (InterfaceC1506170pIV) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            InterfaceC1506180pIW interfaceC1506180pIW = (InterfaceC1506180pIW) C1909107dp.LIZJ(InterfaceC1506180pIW.class, interfaceC634840OvC.getContainerID());
            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).ei();
            String strLJ = C517110KPt.LJ(interfaceC1506170pIV.getKey());
            if (strLJ == null) {
                strLJ = C1505830pHx.LIZ(context, interfaceC1506170pIV.getKey());
            }
            interfaceC1506180pIW.setValue(strLJ);
            completionBlock.onSuccess(interfaceC1506180pIW, "");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "context is null", null, 4);
    }
}
