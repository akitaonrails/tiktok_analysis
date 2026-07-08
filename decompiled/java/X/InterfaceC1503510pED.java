package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0pED, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C040D
public interface InterfaceC1503510pED extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "appInstallQueryConfig", nestedClassType = InterfaceC1503520pEE.class, required = false)
    InterfaceC1503520pEE getAppInstallQueryConfig();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "entrance", required = true)
    String getEntrance();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "_jsb_secure_dataflow_id", required = false)
    String getJsbSecureDataflowId();
}
