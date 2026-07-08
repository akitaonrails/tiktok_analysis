package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0TWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C748180TWm extends AbstractC748160TWk {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        InterfaceC748170TWl interfaceC748170TWl = (InterfaceC748170TWl) xBaseParamModel;
        C876050YYh.LIZ(this, completionBlock, interfaceC748170TWl.getTenantId(), interfaceC748170TWl.getContainerId(), interfaceC748170TWl.getConversationId(), new C914210Ztj(interfaceC748170TWl, 8));
    }
}
