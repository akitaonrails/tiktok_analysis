package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0YY9, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C040D
public interface C0YY9 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "containerId", required = true)
    String getContainerId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversationId", required = true)
    String getConversationId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "message", nestedClassType = InterfaceC875810YXj.class, required = true)
    InterfaceC875810YXj getMessage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tenantId", required = true)
    String getTenantId();
}
