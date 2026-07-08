package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0Nic, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC601560Nic extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientDBData", required = false)
    Map<String, Object> getClientDBData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientMsgId", required = true)
    String getClientMsgId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientRAMData", required = false)
    Map<String, Object> getClientRAMData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversationId", required = true)
    String getConversationId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "serverMsgId", required = true)
    String getServerMsgId();
}
