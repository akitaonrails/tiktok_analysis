package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0KYU, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C040E
public interface C0KYU extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "sharePlatform", required = false)
    String getSharePlatform();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shareSuccess", required = true)
    Boolean getShareSuccess();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "toUserId", required = false)
    String getToUserId();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "sharePlatform", required = false)
    void setSharePlatform(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "shareSuccess", required = true)
    void setShareSuccess(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "toUserId", required = false)
    void setToUserId(String str);
}
