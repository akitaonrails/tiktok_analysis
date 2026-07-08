package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0pF6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040E
public interface InterfaceC1504060pF6 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "result", required = true)
    String getResult();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_supported", required = true)
    Boolean isSupported();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "result", required = true)
    void setResult(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "is_supported", required = true)
    void setSupported(Boolean bool);
}
