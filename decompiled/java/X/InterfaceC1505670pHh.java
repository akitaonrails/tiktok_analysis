package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0pHh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040D
public interface InterfaceC1505670pHh extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "anchorID", required = true)
    String getAnchorID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "appID", required = true)
    String getAppID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "gameID", required = true)
    String getGameID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "gameName", required = false)
    String getGameName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "_jsb_secure_dataflow_id", required = false)
    String getJsbSecureDataflowId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "packageName", required = false)
    String getPackageName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "roomID", required = true)
    String getRoomID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "siteID", required = false)
    String getSiteID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sourceID", required = false)
    String getSourceID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "taskID", required = true)
    String getTaskID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "trackingURLs", nestedClassType = InterfaceC1504630pG1.class, required = true)
    InterfaceC1504630pG1 getTrackingURLs();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "viewReportScene", required = false)
    String getViewReportScene();
}
