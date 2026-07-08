package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0TSO, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C040D
public interface C0TSO extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "business", required = true)
    String getBusiness();

    @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = true)
    String getScene();
}
