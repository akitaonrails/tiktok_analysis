package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.1Aui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@C040D
public interface InterfaceC2194541Aui extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "app_identity", required = false)
    String getAppIdentity();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "client_key", required = true)
    String getClientKey();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "disable_auto_auth", required = false)
    Boolean getDisableAutoAuth();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_method", required = false)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "get_status_only", required = false)
    Boolean getGetStatusOnly();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "package_name", required = false)
    String getPackageName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "redirect_uri", required = false)
    String getRedirectUri();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "response_type", required = false)
    String getResponseType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "scope", required = true)
    String getScope();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "state", required = false)
    String getState();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "use_sheet", required = false)
    Boolean getUseSheet();
}
