package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0NnL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040D
public interface InterfaceC604490NnL extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "entrance", required = true)
    String getEntrance();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "gpsRequestConfig", nestedClassType = InterfaceC604510NnN.class, required = false)
    InterfaceC604510NnN getGpsRequestConfig();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "_jsb_secure_dataflow_id", required = false)
    String getJsbSecureDataflowId();
}
