package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.1CTI, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C040D
public interface C1CTI extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "flowId", required = true)
    Number getFlowId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "state", nestedClassType = C1CTG.class, required = true)
    C1CTG getState();
}
