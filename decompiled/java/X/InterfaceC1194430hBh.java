package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0hBh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C040D
public interface InterfaceC1194430hBh extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterFrom", required = true)
    String getEnterFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enterMethod", required = false)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "helpCenterUrl", required = false)
    String getHelpCenterUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "poi", required = true)
    String getPoi();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "poiName", required = true)
    String getPoiName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "reportPoiUrl", required = false)
    String getReportPoiUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shareInfo", required = false)
    Map<String, Object> getShareInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "showClaimStore", required = true)
    boolean getShowClaimStore();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "showHelpCenter", required = false)
    Boolean getShowHelpCenter();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "showReportPoi", required = false)
    Boolean getShowReportPoi();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "showSuggestAnEdit", required = true)
    boolean getShowSuggestAnEdit();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trackerParams", required = false)
    Map<String, Object> getTrackerParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isBaAccount", required = true)
    boolean isBaAccount();
}
