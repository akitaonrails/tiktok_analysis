package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.1CTP, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public interface C1CTP extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "error", nestedClassType = C1CTN.class, required = true)
    C1CTN getError();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "syeNewRootFlow", nestedClassType = InterfaceC2230891CTf.class, required = true)
    InterfaceC2230891CTf getSyeNewRootFlow();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "syeNewStateId", required = true)
    Number getSyeNewStateId();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "error", nestedClassType = C1CTN.class, required = true)
    void setError(C1CTN c1ctn);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "syeNewRootFlow", nestedClassType = InterfaceC2230891CTf.class, required = true)
    void setSyeNewRootFlow(InterfaceC2230891CTf interfaceC2230891CTf);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "syeNewStateId", required = true)
    void setSyeNewStateId(Number number);
}
