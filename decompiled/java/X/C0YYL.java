package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0YYL, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YYL extends AbstractC875900YXs {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C0YYM c0yym = (C0YYM) xBaseParamModel;
        C876050YYh.LIZ(this, completionBlock, c0yym.getTenantId(), c0yym.getContainerId(), c0yym.getConversationId(), new C914210Ztj(c0yym, 4));
    }
}
