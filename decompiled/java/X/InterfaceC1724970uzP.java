package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0uzP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040E
public interface InterfaceC1724970uzP extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "transaction_id", required = true)
    String getTransactionId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_supported", required = true)
    Boolean isSupported();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "is_supported", required = true)
    void setSupported(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "transaction_id", required = true)
    void setTransactionId(String str);
}
