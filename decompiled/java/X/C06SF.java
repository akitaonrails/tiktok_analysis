package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.06SF, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public interface C06SF extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "avatarUrl", required = true)
    String getAvatarUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversationId", required = true)
    String getConversationId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversationName", required = true)
    String getConversationName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversationType", required = true)
    Number getConversationType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = true)
    String getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "userId", required = false)
    String getUserId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "userUniqueId", required = false)
    String getUserUniqueId();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "avatarUrl", required = true)
    void setAvatarUrl(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "conversationId", required = true)
    void setConversationId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "conversationName", required = true)
    void setConversationName(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "conversationType", required = true)
    void setConversationType(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "extra", required = true)
    void setExtra(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "userId", required = false)
    void setUserId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "userUniqueId", required = false)
    void setUserUniqueId(String str);
}
