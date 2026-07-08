package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.14Wh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C040E
public interface InterfaceC20278514Wh extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cpuUsage", required = true)
    Number getCpuUsage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "memoryAll", required = true)
    Number getMemoryAll();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "memoryLimit", required = true)
    Number getMemoryLimit();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "memoryRest", required = true)
    Number getMemoryRest();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "memoryUse", required = true)
    Number getMemoryUse();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "temperature", required = true)
    Number getTemperature();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "cpuUsage", required = true)
    void setCpuUsage(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "memoryAll", required = true)
    void setMemoryAll(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "memoryLimit", required = true)
    void setMemoryLimit(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "memoryRest", required = true)
    void setMemoryRest(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "memoryUse", required = true)
    void setMemoryUse(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "temperature", required = true)
    void setTemperature(Number number);
}
