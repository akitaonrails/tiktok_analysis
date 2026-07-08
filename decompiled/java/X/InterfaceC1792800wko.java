package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0wko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1792800wko extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "action", required = true)
    String getAction();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "detailCode", required = false)
    Number getDetailCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "message", required = false)
    String getMessage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "transactionToken", required = false)
    String getTransactionToken();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "action", required = true)
    void setAction(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "detailCode", required = false)
    void setDetailCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "message", required = false)
    void setMessage(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "transactionToken", required = false)
    void setTransactionToken(String str);
}
