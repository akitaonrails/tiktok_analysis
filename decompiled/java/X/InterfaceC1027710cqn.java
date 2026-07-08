package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0cqn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C040D
public interface InterfaceC1027710cqn extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "adClickFrom", required = false)
    String getAdClickFrom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "checkCache", required = false)
    Number getCheckCache();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "cid", required = true)
    Number getCid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extra", nestedClassType = InterfaceC1027820cqy.class, required = false)
    InterfaceC1027820cqy getExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "_jsb_secure_dataflow_id", required = false)
    String getJsbSecureDataflowId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "jumpData", required = false)
    String getJumpData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "landingAccessStyle", required = false)
    Number getLandingAccessStyle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "landingExitStyle", required = false)
    Number getLandingExitStyle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "landingStyle", required = false)
    Number getLandingStyle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "lynxPresentationStyle", required = false)
    Number getLynxPresentationStyle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "lynxShowType", required = false)
    Number getLynxShowType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "nativeSiteCustomData", required = false)
    String getNativeSiteCustomData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "openCommentPanel", required = false)
    Number getOpenCommentPanel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "refer", required = true)
    String getRefer();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "reportAdExtraData", required = false)
    String getReportAdExtraData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "shouldUseActivity", required = false)
    Boolean getShouldUseActivity();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "showType", required = false)
    Number getShowType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "title", required = true)
    String getTitle();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "url", required = true)
    String getUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "useSystemBrowserInApp", required = false)
    Number getUseSystemBrowserInApp();
}
