package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0YYP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YYP extends AbstractC875880YXq {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C0YYQ c0yyq = (C0YYQ) xBaseParamModel;
        C876050YYh.LIZ(this, completionBlock, c0yyq.getTenantId(), c0yyq.getContainerId(), c0yyq.getConversationId(), new C914210Ztj(c0yyq, 6));
    }
}
