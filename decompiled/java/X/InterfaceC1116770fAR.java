package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0fAR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C040D
public interface InterfaceC1116770fAR extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "action", required = true)
    Number getAction();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "api_param", required = false)
    Map<String, Object> getApiParam();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "log_param", required = false)
    Map<String, Object> getLogParam();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pre_check_map", required = false)
    Map<String, Object> getPreCheckMap();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "scene_key", required = true)
    String getSceneKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "schema_param", required = false)
    Map<String, Object> getSchemaParam();
}
