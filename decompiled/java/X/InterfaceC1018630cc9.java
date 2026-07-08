package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0cc9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1018630cc9 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "app_id", required = false)
    String getAppId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "app_store_enabled", required = false)
    Boolean getAppStoreEnabled();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "app_store_reuse_disabled", required = false)
    Boolean getAppStoreReuseDisabled();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "creative_id", required = false)
    String getCreativeId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "direct_download", required = false)
    Number getDirectDownload();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "download_url", required = false)
    String getDownloadUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extParam", required = false)
    Map<String, Object> getExtParam();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "log_extra", required = false)
    String getLogExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "preload_web", required = false)
    Number getPreloadWeb();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "skan_parameters", required = false)
    String getSkanParameters();
}
