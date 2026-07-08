package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.09VW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C040D
public interface C09VW extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "businessId", required = true)
    String getBusinessId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "businessType", required = true)
    String getBusinessType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "event", required = true)
    String getEvent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "params", required = true)
    Map<String, Object> getParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = true)
    String getScene();
}
