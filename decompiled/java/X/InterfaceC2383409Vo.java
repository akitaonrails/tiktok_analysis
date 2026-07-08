package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.09Vo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C040D
public interface InterfaceC2383409Vo extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "currentUniqueId", required = true)
    String getCurrentUniqueId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "filePathList", primitiveClassType = String.class, required = false)
    List<String> getFilePathList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "requestParams", required = true)
    Map<String, Object> getRequestParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trackParams", required = true)
    Map<String, Object> getTrackParams();
}
