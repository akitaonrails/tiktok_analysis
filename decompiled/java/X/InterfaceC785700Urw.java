package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0Urw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C040D
public interface InterfaceC785700Urw extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = false)
    String getScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "skipNewGuidance", required = false)
    Boolean getSkipNewGuidance();
}
