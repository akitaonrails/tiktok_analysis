package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0cea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1020140cea extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "app_id", required = true)
    String getAppId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "component_type", required = false)
    String getComponentType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "direct_download", required = false)
    Number getDirectDownload();
}
