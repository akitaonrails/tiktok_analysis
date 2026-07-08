package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0cqv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1027790cqv extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "adClickFrom", required = false)
    String getAdClickFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "_jsb_secure_dataflow_id", required = false)
    String getJsbSecureDataflowId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "refer", required = true)
    String getRefer();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = true)
    String getUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isDeeplink", required = false)
    Number isDeeplink();
}
