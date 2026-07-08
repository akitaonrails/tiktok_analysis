package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0TSp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C747170TSp extends AbstractC747160TSo {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean zLJIIIZ = C0TNQ.LJIIIZ();
        InterfaceC747180TSq interfaceC747180TSq = (InterfaceC747180TSq) C1909107dp.LIZJ(InterfaceC747180TSq.class, null);
        interfaceC747180TSq.setResult(Boolean.valueOf(zLJIIIZ));
        completionBlock.onSuccess(interfaceC747180TSq, "");
    }
}
