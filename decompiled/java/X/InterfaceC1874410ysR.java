package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0ysR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1874410ysR extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "extParams", required = true)
    String getExtParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = true)
    String getScene();
}
