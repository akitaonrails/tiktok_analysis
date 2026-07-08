package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0YYG, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YYG extends AbstractC875960YXy {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C0YY8 c0yy8 = (C0YY8) xBaseParamModel;
        C876050YYh.LIZ(this, completionBlock, c0yy8.getTenantId(), c0yy8.getContainerId(), c0yy8.getConversationId(), new C0YXT(c0yy8));
    }
}
