package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0yps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1872820yps extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "biz", required = false)
    String getBiz();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", required = true)
    Object getData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "key", required = true)
    String getKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "validDuration", required = false)
    Number getValidDuration();
}
