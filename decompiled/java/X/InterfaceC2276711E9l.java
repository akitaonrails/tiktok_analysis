package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.1E9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
@C040D
public interface InterfaceC2276711E9l extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "actionType", required = true)
    String getActionType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "autoMatchEntrance", required = true)
    Number getAutoMatchEntrance();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "autoMatchScene", required = false)
    Number getAutoMatchScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = true)
    Map<String, Object> getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "poolID", required = false)
    String getPoolID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = true)
    Number getScene();
}
