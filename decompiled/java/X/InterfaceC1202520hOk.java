package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0hOk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C040D
public interface InterfaceC1202520hOk extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "mobParams", required = false)
    Map<String, Object> getMobParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = true)
    String getScene();
}
