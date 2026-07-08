package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0cqp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1027730cqp extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "accessKeyType", required = false)
    Number getAccessKeyType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "adClickFrom", required = false)
    String getAdClickFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "checkCache", required = false)
    Number getCheckCache();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "cid", required = false)
    Number getCid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraData", required = false)
    Map<String, Object> getExtraData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "landingAccessStyle", required = false)
    Number getLandingAccessStyle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "landingExitStyle", required = false)
    Number getLandingExitStyle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "landingStyle", required = false)
    Number getLandingStyle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "nativeSiteCustomData", required = false)
    String getNativeSiteCustomData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "refer", required = false)
    String getRefer();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "reportAdExtraData", required = false)
    String getReportAdExtraData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shouldUseActivity", required = false)
    Boolean getShouldUseActivity();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "showType", required = false)
    Number getShowType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "title", required = false)
    String getTitle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = false)
    String getUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "useSystemBrowserInApp", required = false)
    Number getUseSystemBrowserInApp();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isDeeplink", required = false)
    Number isDeeplink();
}
