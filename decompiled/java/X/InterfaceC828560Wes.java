package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0Wes, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C040D
public interface InterfaceC828560Wes extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "_jsb_secure_dataflow_id", required = false)
    String getJsbSecureDataflowId();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "openMethod", required = true)
    @InterfaceC1909307dr(option = {"default", "cct_externalbrowser"})
    String getOpenMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = true)
    String getUrl();
}
