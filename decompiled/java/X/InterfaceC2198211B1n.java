package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.1B1n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2198211B1n extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "accessKeyId", required = true)
    String getAccessKeyId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "hostName", required = true)
    String getHostName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "secretAccessKey", required = true)
    String getSecretAccessKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sessionToken", required = true)
    String getSessionToken();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "spaceName", required = true)
    String getSpaceName();
}
