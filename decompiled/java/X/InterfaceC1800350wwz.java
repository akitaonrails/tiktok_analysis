package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0wwz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040D
public interface InterfaceC1800350wwz extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cancelReason", required = false)
    String getCancelReason();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "keyword", required = true)
    String getKeyword();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "prefetchId", required = true)
    String getPrefetchId();
}
