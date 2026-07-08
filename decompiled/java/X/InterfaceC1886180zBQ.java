package X;

import com.bytedance.scene.Scene;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0zBQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040D
public interface InterfaceC1886180zBQ extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "anchorID", required = false)
    String getAnchorID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "appID", required = false)
    String getAppID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "audienceUID", required = false)
    String getAudienceUID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "authorID", required = false)
    String getAuthorID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "CPPURL", required = false)
    String getCPPURL();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "deepLink", required = false)
    String getDeepLink();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "gameID", required = true)
    String getGameID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "packageName", required = false)
    String getPackageName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "roomID", required = false)
    String getRoomID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = Scene.SCENE_SERVICE, required = true)
    String getScene();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "siteID", required = false)
    String getSiteID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sourceID", required = false)
    String getSourceID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "taskID", required = false)
    String getTaskID();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isAnchor", required = false)
    Boolean isAnchor();
}
