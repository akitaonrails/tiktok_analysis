package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.06bi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C040D
public interface InterfaceC1641206bi extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "business", required = true)
    String getBusiness();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = true)
    String getParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "scenario", required = true)
    String getScenario();

    @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = true)
    String getScene();
}
