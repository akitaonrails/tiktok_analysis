package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0Zhp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C040D
public interface InterfaceC906830Zhp extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "content", required = true)
    String getContent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversationId", required = true)
    String getConversationId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "coverUrl", required = true)
    String getCoverUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "messageToSend", required = true)
    String getMessageToSend();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "messageType", required = true)
    Number getMessageType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "nickName", required = true)
    String getNickName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sendMessageScene", required = true)
    Number getSendMessageScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sendScene", required = true)
    String getSendScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uid", required = true)
    String getUid();
}
