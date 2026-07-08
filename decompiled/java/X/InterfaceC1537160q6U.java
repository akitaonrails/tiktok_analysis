package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0q6U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040E
public interface InterfaceC1537160q6U extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "locale", required = true)
    String getLocale();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "resource", required = true)
    String getResource();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "updateTime", required = true)
    Number getUpdateTime();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "locale", required = true)
    void setLocale(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "resource", required = true)
    void setResource(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "updateTime", required = true)
    void setUpdateTime(Number number);
}
