package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.06DR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C040D
public interface C06DR extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversationId", required = true)
    String getConversationId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversationType", required = true)
    Number getConversationType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sceneId", required = true)
    Number getSceneId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sceneRequestBody", required = true)
    String getSceneRequestBody();
}
