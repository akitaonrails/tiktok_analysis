package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0h8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C040D
public interface InterfaceC1192510h8b extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "privacyPopup", required = true)
    String getPrivacyPopup();

    @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = false)
    String getScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trackParams", required = false)
    Map<String, Object> getTrackParams();
}
