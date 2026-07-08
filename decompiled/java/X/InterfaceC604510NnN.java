package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0NnN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC604510NnN extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "dataCertAuth", required = true)
    String getDataCertAuth();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "dataCertToken", required = true)
    String getDataCertToken();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "decryptCertAuth", required = true)
    String getDecryptCertAuth();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "decryptCertToken", required = true)
    String getDecryptCertToken();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "userAgree", required = true)
    boolean getUserAgree();
}
