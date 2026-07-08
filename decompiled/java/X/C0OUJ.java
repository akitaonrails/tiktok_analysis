package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0OUJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface C0OUJ extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bulletinBoardId", required = true)
    String getBulletinBoardId();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = Scene.SCENE_SERVICE, required = true)
    @InterfaceC1909307dr(option = {"bulletin_resource_container_scene", "bulletin_top_resource_container_scene"})
    String getScene();
}
