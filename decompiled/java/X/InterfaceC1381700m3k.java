package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0m3k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C040D
public interface InterfaceC1381700m3k extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "chatType", required = false)
    Number getChatType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "contentPb", required = true)
    String getContentPb();

    @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = true)
    String getScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "title", required = false)
    String getTitle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uid", required = true)
    String getUid();
}
