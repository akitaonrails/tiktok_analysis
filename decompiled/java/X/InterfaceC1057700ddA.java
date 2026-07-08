package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0ddA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040E
public interface InterfaceC1057700ddA extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "reason", required = true)
    String getReason();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "success", required = true)
    Boolean getSuccess();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "reason", required = true)
    void setReason(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "success", required = true)
    void setSuccess(Boolean bool);
}
