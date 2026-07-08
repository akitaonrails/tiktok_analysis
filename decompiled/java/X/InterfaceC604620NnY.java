package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0NnY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC604620NnY extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bbid", required = true)
    String getBbid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "channelUser", required = false)
    String getChannelUser();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversationId", required = false)
    String getConversationId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventMap", required = false)
    Map<String, Object> getEventMap();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "messageId", required = false)
    String getMessageId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "noNeedFollow", required = true)
    boolean getNoNeedFollow();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uid", required = true)
    String getUid();
}
