package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.1CUB, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C040D
public interface C1CUB extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "autoOpenBag", required = false)
    Boolean getAutoOpenBag();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "autoRouteSchema", required = false)
    String getAutoRouteSchema();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "awemeStruct", required = true)
    Map<String, Object> getAwemeStruct();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "bagPageParams", required = false)
    String getBagPageParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = true)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterMethod", required = true)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", required = false)
    Map<String, Object> getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraQueryParams", required = false)
    Map<String, Object> getExtraQueryParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "innerFlowContext", required = true)
    Map<String, Object> getInnerFlowContext();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "keyword", required = true)
    String getKeyword();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "logExtra", required = true)
    Map<String, Object> getLogExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pageData", required = false)
    Map<String, Object> getPageData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "playerSessionId", required = false)
    String getPlayerSessionId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = true)
    String getScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "searchChannel", required = false)
    String getSearchChannel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "searchId", required = true)
    String getSearchId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tracker", required = false)
    String getTracker();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trafficSourceList", required = false)
    String getTrafficSourceList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "videoFrom", required = true)
    String getVideoFrom();
}
