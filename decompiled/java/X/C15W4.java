package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.15W4, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C040D
public interface C15W4 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bizLine", required = true)
    String getBizLine();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "bizScene", required = true)
    String getBizScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversationID", required = true)
    String getConversationID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterChatParams", nestedClassType = C15W8.class, required = false)
    C15W8 getEnterChatParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = true)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterMethod", required = true)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventTracking", required = false)
    String getEventTracking();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "groupStatus", required = true)
    Number getGroupStatus();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "joinGroupAutomatically", required = false)
    Boolean getJoinGroupAutomatically();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "joinGroupSource", required = true)
    String getJoinGroupSource();
}
