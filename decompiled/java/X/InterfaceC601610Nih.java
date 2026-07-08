package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0Nih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC601610Nih extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientMsgId", required = true)
    String getClientMsgId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversationId", required = true)
    String getConversationId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "rawData", required = false)
    String getRawData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "serverMsgId", required = true)
    String getServerMsgId();
}
