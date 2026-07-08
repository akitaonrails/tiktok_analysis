package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0xA3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040D
public interface InterfaceC1808450xA3 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "requestPage", required = true)
    String getRequestPage();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "userType", required = true)
    @InterfaceC1909307dr(option = {"guest", "audience"})
    String getUserType();
}
