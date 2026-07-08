package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0qOV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040D
public interface InterfaceC1548330qOV extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bySharedData", required = false)
    Boolean getBySharedData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventName", required = false)
    String getEventName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventNames", nestedClassType = InterfaceC1548340qOW.class, required = false)
    List<InterfaceC1548340qOW> getEventNames();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "subscribeGlobalEvent", required = false)
    Boolean getSubscribeGlobalEvent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "timestamp", required = false)
    Number getTimestamp();
}
