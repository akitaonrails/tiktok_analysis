package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0YY6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C040D
public interface C0YY6 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "containerId", required = true)
    String getContainerId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversationId", required = true)
    String getConversationId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "flightStatus", required = true)
    Number getFlightStatus();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tenantId", required = true)
    String getTenantId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uuid", required = true)
    String getUuid();
}
