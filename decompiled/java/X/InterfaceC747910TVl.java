package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0TVl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C040D
public interface InterfaceC747910TVl extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "content", required = true)
    String getContent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = false)
    String getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "_jsb_secure_dataflow_id", required = false)
    String getJsbSecureDataflowId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "type", required = true)
    Number getType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uid", required = false)
    String getUid();
}
