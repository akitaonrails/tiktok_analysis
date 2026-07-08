package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0YYE, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YYE extends C0YY3 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C0YY6 c0yy6 = (C0YY6) xBaseParamModel;
        C876050YYh.LIZ(this, completionBlock, c0yy6.getTenantId(), c0yy6.getContainerId(), c0yy6.getConversationId(), new C914210Ztj(c0yy6, 5));
    }
}
