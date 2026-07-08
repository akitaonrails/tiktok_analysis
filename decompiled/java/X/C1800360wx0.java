package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0wx0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1800360wx0 extends AbstractC1800340wwy {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1800350wwz interfaceC1800350wwz = (InterfaceC1800350wwz) xBaseParamModel;
        C1ER1 c1er1 = C1ER1.LIZIZ;
        String keyword = interfaceC1800350wwz.getKeyword();
        String cancelReason = interfaceC1800350wwz.getCancelReason();
        if (cancelReason == null) {
            cancelReason = "";
        }
        c1er1.LLLJ("cancel", keyword, cancelReason);
    }
}
