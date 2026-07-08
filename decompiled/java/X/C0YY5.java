package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0YY5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public interface C0YY5 extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bizRole", required = false)
    String getBizRole();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pigeonReadIndex", required = false)
    String getPigeonReadIndex();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "secUserId", required = false)
    String getSecUserId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sortOrder", required = false)
    Number getSortOrder();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "userId", required = true)
    String getUserId();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "bizRole", required = false)
    void setBizRole(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "pigeonReadIndex", required = false)
    void setPigeonReadIndex(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "secUserId", required = false)
    void setSecUserId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "sortOrder", required = false)
    void setSortOrder(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "userId", required = true)
    void setUserId(String str);
}
