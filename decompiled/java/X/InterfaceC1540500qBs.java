package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0qBs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1540500qBs extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "globalProps", required = false)
    Map<String, Object> getGlobalProps();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "initData", required = false)
    Map<String, Object> getInitData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "nativeAppId", required = false)
    String getNativeAppId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "systemInfo", required = false)
    Map<String, Object> getSystemInfo();
}
