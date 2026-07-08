package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.1CT4, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C040D
public interface C1CT4 extends XBaseParamModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "parallelStateId", required = true)
    Number getParallelStateId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "state", nestedClassType = C1CT1.class, required = true)
    C1CT1 getState();
}
