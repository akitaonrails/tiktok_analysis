package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

/* JADX INFO: renamed from: X.0YYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C040D
public interface InterfaceC876060YYi extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "apiUrl", required = true)
    String getApiUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "appId", required = true)
    Number getAppId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "appKey", required = true)
    String getAppKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "bizServiceId", required = true)
    Number getBizServiceId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "containerId", required = true)
    String getContainerId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "fpId", required = true)
    Number getFpId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "frontierServiceId", required = true)
    Number getFrontierServiceId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "frontierUrls", required = true)
    List<Object> getFrontierUrls();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "idcRegion", required = false)
    String getIdcRegion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "imUserId", required = true)
    String getImUserId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tenantId", required = true)
    String getTenantId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "token", required = true)
    String getToken();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "wsUrl", required = true)
    String getWsUrl();
}
