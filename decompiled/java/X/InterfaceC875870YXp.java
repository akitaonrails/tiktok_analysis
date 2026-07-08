package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0YXp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C040E
public interface InterfaceC875870YXp extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "content", required = true)
    String getContent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversationShortId", required = true)
    String getConversationShortId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversationType", required = true)
    Number getConversationType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "createdAt", required = true)
    Number getCreatedAt();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "ext", required = true)
    Map<String, Object> getExt();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "indexInConversation", required = false)
    String getIndexInConversation();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "localExt", required = true)
    Map<String, Object> getLocalExt();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "msgId", required = true)
    String getMsgId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "msgStatus", required = true)
    Number getMsgStatus();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "msgType", required = true)
    Number getMsgType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "orderInConversation", required = false)
    String getOrderInConversation();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sender", required = true)
    String getSender();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uuid", required = true)
    String getUuid();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "content", required = true)
    void setContent(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "conversationShortId", required = true)
    void setConversationShortId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "conversationType", required = true)
    void setConversationType(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "createdAt", required = true)
    void setCreatedAt(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "ext", required = true)
    void setExt(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "indexInConversation", required = false)
    void setIndexInConversation(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "localExt", required = true)
    void setLocalExt(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "msgId", required = true)
    void setMsgId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "msgStatus", required = true)
    void setMsgStatus(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "msgType", required = true)
    void setMsgType(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "orderInConversation", required = false)
    void setOrderInConversation(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "sender", required = true)
    void setSender(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "uuid", required = true)
    void setUuid(String str);
}
