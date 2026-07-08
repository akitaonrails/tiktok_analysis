package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0KFU, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C040E
public interface C0KFU extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "platform", required = false)
    String getPlatform();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "success", required = true)
    Boolean getSuccess();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "platform", required = false)
    void setPlatform(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "success", required = true)
    void setSuccess(Boolean bool);
}
