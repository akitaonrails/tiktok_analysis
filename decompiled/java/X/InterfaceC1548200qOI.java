package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0qOI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040E
public interface InterfaceC1548200qOI extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "appMemory", required = true)
    Number getAppMemory();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "memoryAvailPercent", required = true)
    Number getMemoryAvailPercent();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "memoryStatus", required = true)
    Number getMemoryStatus();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "totalMemory", required = true)
    Number getTotalMemory();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "appMemory", required = true)
    void setAppMemory(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "memoryAvailPercent", required = true)
    void setMemoryAvailPercent(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "memoryStatus", required = true)
    void setMemoryStatus(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "totalMemory", required = true)
    void setTotalMemory(Number number);
}
