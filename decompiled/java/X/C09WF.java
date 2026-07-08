package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.09WF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C040D
public interface C09WF extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventKeyList", primitiveClassType = String.class, required = false)
    List<String> getEventKeyList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventList", primitiveClassType = String.class, required = false)
    List<String> getEventList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "forceRefresh", required = false)
    Boolean getForceRefresh();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "prototypeList", primitiveClassType = String.class, required = false)
    List<String> getPrototypeList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "touchpointIds", primitiveClassType = Number.class, required = false)
    List<Number> getTouchpointIds();
}
