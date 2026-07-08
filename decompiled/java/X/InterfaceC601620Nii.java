package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0Nii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC601620Nii extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientDBKeys", primitiveClassType = String.class, required = false)
    List<String> getClientDBKeys();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientMsgId", required = true)
    String getClientMsgId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "clientRAMKeys", primitiveClassType = String.class, required = false)
    List<String> getClientRAMKeys();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversationId", required = true)
    String getConversationId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "serverMsgId", required = true)
    String getServerMsgId();
}
