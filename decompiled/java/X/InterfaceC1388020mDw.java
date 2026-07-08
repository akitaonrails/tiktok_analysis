package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0mDw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C040E
public interface InterfaceC1388020mDw extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversationId", required = false)
    String getConversationId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversationShortId", required = false)
    Number getConversationShortId();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "conversationId", required = false)
    void setConversationId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "conversationShortId", required = false)
    void setConversationShortId(Number number);
}
