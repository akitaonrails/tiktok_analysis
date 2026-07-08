package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0qOW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1548340qOW extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "bySharedData", required = false)
    Boolean getBySharedData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventName", required = true)
    String getEventName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "subscribeGlobalEvent", required = false)
    Boolean getSubscribeGlobalEvent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "timestamp", required = false)
    Number getTimestamp();
}
