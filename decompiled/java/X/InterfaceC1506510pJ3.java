package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0pJ3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040E
public interface InterfaceC1506510pJ3 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = true)
    String getScene();

    @InterfaceC1549470qQL(isGetter = false, keyPath = Scene.SCENE_SERVICE, required = true)
    void setScene(String str);
}
