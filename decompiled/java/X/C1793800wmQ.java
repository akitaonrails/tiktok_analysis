package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0wmQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1793800wmQ extends AbstractC1793760wmM {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC1793790wmP interfaceC1793790wmP = (InterfaceC1793790wmP) xBaseParamModel;
        C19328310jZ.LIZIZ.f6(interfaceC1793790wmP.getValue().intValue(), interfaceC1793790wmP.getField());
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1793770wmN.class, null), "");
    }
}
