package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.05pS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C040D
public interface InterfaceC1471605pS extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversationId", required = false)
    String getConversationId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "emojiText", required = false)
    String getEmojiText();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "emojiType", required = false)
    Number getEmojiType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "gameId", required = false)
    Number getGameId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "score", required = false)
    Number getScore();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uidList", primitiveClassType = String.class, required = false)
    List<String> getUidList();
}
