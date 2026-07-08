package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0yrC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1873640yrC extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "entrance", required = true)
    Number getEntrance();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "getDisplayStatusMap", required = false)
    Number getGetDisplayStatusMap();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "rivalSection", required = true)
    Number getRivalSection();

    @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = true)
    Number getScene();
}
