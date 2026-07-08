package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0Qrq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C040D
public interface InterfaceC683720Qrq extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "consentName", required = true)
    String getConsentName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "logParams", required = false)
    Map<String, Object> getLogParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = true)
    String getScene();
}
