package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0grt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C040D
public interface InterfaceC1182150grt extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "businessQueryParam", required = true)
    Map<String, Object> getBusinessQueryParam();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "instanceId", required = true)
    String getInstanceId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sessionID", required = true)
    String getSessionID();
}
