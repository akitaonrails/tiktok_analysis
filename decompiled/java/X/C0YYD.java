package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0YYD, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YYD extends AbstractC875890YXr {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C0YY9 c0yy9 = (C0YY9) xBaseParamModel;
        C876050YYh.LIZ(this, completionBlock, c0yy9.getTenantId(), c0yy9.getContainerId(), "", new C914200Zti(c0yy9, this, 3));
    }
}
