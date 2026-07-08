package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.14Wj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C040D
public interface InterfaceC20278714Wj extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "cpuUsage", required = false)
    Boolean getCpuUsage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "memoryAll", required = false)
    Boolean getMemoryAll();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "memoryLimit", required = false)
    Boolean getMemoryLimit();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "memoryRest", required = false)
    Boolean getMemoryRest();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "memoryUse", required = false)
    Boolean getMemoryUse();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "temperature", required = false)
    Boolean getTemperature();
}
