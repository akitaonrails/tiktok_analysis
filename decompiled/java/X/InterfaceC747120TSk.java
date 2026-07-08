package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0TSk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C040D
public interface InterfaceC747120TSk extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "delay", required = false)
    Number getDelay();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "duration", required = false)
    Number getDuration();

    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "icon", required = false)
    @InterfaceC1909307dr(option = {"success", "error", "warn", "info"})
    String getIcon();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "message", required = true)
    String getMessage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "topDistance", required = false)
    Number getTopDistance();
}
