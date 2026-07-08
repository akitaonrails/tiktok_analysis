package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.1AUP, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@C040D
public interface C1AUP extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "authorizationParams", nestedClassType = C1AUU.class, required = false)
    C1AUU getAuthorizationParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "business", required = true)
    String getBusiness();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "certName", required = true)
    String getCertName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "certNameForNotReduced", required = false)
    String getCertNameForNotReduced();

    @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = true)
    String getScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trackParams", nestedClassType = C1AUQ.class, required = false)
    C1AUQ getTrackParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "useCustomCert", required = false)
    Boolean getUseCustomCert();
}
