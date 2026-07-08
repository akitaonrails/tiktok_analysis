package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.1B1m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2198201B1m extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "accessKeyId", required = true)
    String getAccessKeyId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "hostName", required = true)
    String getHostName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "secretAccessKey", required = true)
    String getSecretAccessKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "serviceId", required = true)
    String getServiceId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sessionToken", required = true)
    String getSessionToken();
}
