package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0Nk9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040E
public interface InterfaceC602510Nk9 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "message", required = false)
    String getMessage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isSuccess", required = true)
    Boolean isSuccess();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "message", required = false)
    void setMessage(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isSuccess", required = true)
    void setSuccess(Boolean bool);
}
