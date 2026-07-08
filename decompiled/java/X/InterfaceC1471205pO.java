package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.05pO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1471205pO extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "score", required = false)
    Number getScore();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "userAvatar", required = false)
    String getUserAvatar();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "userId", required = false)
    String getUserId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "userName", required = false)
    String getUserName();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "score", required = false)
    void setScore(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "userAvatar", required = false)
    void setUserAvatar(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "userId", required = false)
    void setUserId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "userName", required = false)
    void setUserName(String str);
}
