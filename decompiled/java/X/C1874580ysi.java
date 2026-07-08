package X;

import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0ysi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1874580ysi extends AbstractC1874560ysg {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        int i;
        int i2;
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        boolean zWe0 = iInteractService.we0();
        boolean zQV1 = iInteractService.QV1(zWe0);
        InterfaceC1874570ysh interfaceC1874570ysh = (InterfaceC1874570ysh) C1909107dp.LIZJ(InterfaceC1874570ysh.class, null);
        if (zWe0) {
            i = 1;
        } else {
            i = 0;
        }
        interfaceC1874570ysh.setCohostEnable(i);
        if (zQV1) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        interfaceC1874570ysh.setQuickCohostEnable(i2);
        completionBlock.onSuccess(interfaceC1874570ysh, "");
    }
}
