package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0Niw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC601760Niw extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientMsgId", required = true)
    String getClientMsgId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversationId", required = true)
    String getConversationId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "requestParams", required = true)
    Map<String, Object> getRequestParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "serverMsgId", required = true)
    String getServerMsgId();
}
