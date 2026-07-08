package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.1CTO, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1CTO extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "error", nestedClassType = C1CTM.class, required = true)
    C1CTM getError();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "syeNewRootFlow", nestedClassType = InterfaceC2230881CTe.class, required = true)
    InterfaceC2230881CTe getSyeNewRootFlow();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "syeNewStateId", required = true)
    Number getSyeNewStateId();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "error", nestedClassType = C1CTM.class, required = true)
    void setError(C1CTM c1ctm);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "syeNewRootFlow", nestedClassType = InterfaceC2230881CTe.class, required = true)
    void setSyeNewRootFlow(InterfaceC2230881CTe interfaceC2230881CTe);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "syeNewStateId", required = true)
    void setSyeNewStateId(Number number);
}
