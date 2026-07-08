package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.1ALG, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
@C040D
public interface C1ALG extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "defaultLocation", required = false)
    String getDefaultLocation();

    @InterfaceC1909207dq(option = {0, 1, 2, 3})
    @InterfaceC1549470qQL(isEnum = true, isGetter = true, keyPath = "level", required = true)
    Number getLevel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "region", required = true)
    String getRegion();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "traceData", nestedClassType = C1ALE.class, required = true)
    C1ALE getTraceData();
}
