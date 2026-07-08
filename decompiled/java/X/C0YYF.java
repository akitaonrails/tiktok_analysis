package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0YYF, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YYF extends AbstractC875950YXx {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C0YY7 c0yy7 = (C0YY7) xBaseParamModel;
        C876050YYh.LIZ(this, completionBlock, c0yy7.getTenantId(), c0yy7.getContainerId(), c0yy7.getConversationId(), new C875740YXc(c0yy7));
    }
}
