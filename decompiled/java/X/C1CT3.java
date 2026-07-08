package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.1CT3, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1CT3 extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "error", nestedClassType = InterfaceC2230771CSt.class, required = true)
    InterfaceC2230771CSt getError();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "syeNewBranchId", required = true)
    Number getSyeNewBranchId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "syeNewRootFlow", nestedClassType = C1CT0.class, required = true)
    C1CT0 getSyeNewRootFlow();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "syeNewStateId", required = true)
    Number getSyeNewStateId();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "error", nestedClassType = InterfaceC2230771CSt.class, required = true)
    void setError(InterfaceC2230771CSt interfaceC2230771CSt);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "syeNewBranchId", required = true)
    void setSyeNewBranchId(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "syeNewRootFlow", nestedClassType = C1CT0.class, required = true)
    void setSyeNewRootFlow(C1CT0 c1ct0);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "syeNewStateId", required = true)
    void setSyeNewStateId(Number number);
}
