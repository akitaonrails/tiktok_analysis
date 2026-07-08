package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.09gP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C040D
public interface InterfaceC2434709gP extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "appPackageName", required = true)
    String getAppPackageName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "deeplink", required = true)
    String getDeeplink();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "schema", required = true)
    String getSchema();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "universalLink", required = true)
    String getUniversalLink();
}
