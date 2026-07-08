package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0YYH, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YYH extends C0YY0 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C0YYI c0yyi = (C0YYI) xBaseParamModel;
        C876050YYh.LIZ(this, completionBlock, c0yyi.getTenantId(), c0yyi.getContainerId(), c0yyi.getConversationId(), new C914200Zti(c0yyi, this, 1));
    }
}
