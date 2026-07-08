package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.1CT8, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1CT8 extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "error", nestedClassType = C1CT7.class, required = true)
    C1CT7 getError();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "syeNewRootFlow", nestedClassType = C1CT9.class, required = true)
    C1CT9 getSyeNewRootFlow();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "syeNewStateId", required = true)
    Number getSyeNewStateId();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "error", nestedClassType = C1CT7.class, required = true)
    void setError(C1CT7 c1ct7);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "syeNewRootFlow", nestedClassType = C1CT9.class, required = true)
    void setSyeNewRootFlow(C1CT9 c1ct9);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "syeNewStateId", required = true)
    void setSyeNewStateId(Number number);
}
