package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0wlD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1793050wlD extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "appVersion", required = true)
    String getAppVersion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientVersion", required = true)
    String getClientVersion();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "appVersion", required = true)
    void setAppVersion(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "clientVersion", required = true)
    void setClientVersion(String str);
}
