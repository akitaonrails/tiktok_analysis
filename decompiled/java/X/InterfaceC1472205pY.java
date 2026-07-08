package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.05pY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1472205pY extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "avatarUrl", required = true)
    String getAvatarUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uid", required = true)
    String getUid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "userName", required = true)
    String getUserName();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "avatarUrl", required = true)
    void setAvatarUrl(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "uid", required = true)
    void setUid(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "userName", required = true)
    void setUserName(String str);
}
