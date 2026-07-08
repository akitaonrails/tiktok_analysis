package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0YYA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C040D
public interface C0YYA extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "containerId", required = true)
    String getContainerId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversationId", required = true)
    String getConversationId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "message", nestedClassType = InterfaceC875790YXh.class, required = true)
    InterfaceC875790YXh getMessage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tenantId", required = true)
    String getTenantId();
}
