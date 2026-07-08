package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0Zi0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C040D
public interface InterfaceC906940Zi0 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "content", required = false)
    String getContent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "content_pb", required = false)
    String getContentPb();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversation_id", required = false)
    String getConversationId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "conversation_type", required = true)
    Number getConversationType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "event_tracking_extra", nestedClassType = InterfaceC906950Zi1.class, required = false)
    InterfaceC906950Zi1 getEventTrackingExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "msg_type", required = true)
    Number getMsgType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = false)
    String getScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "synced_ext", required = false)
    String getSyncedExt();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "transient_ext", required = false)
    String getTransientExt();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uid", required = false)
    String getUid();
}
