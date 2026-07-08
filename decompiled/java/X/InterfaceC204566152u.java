package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.152u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public interface InterfaceC204566152u extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "error", nestedClassType = InterfaceC204569152x.class, required = true)
    InterfaceC204569152x getError();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "syeNewRootFlow", nestedClassType = InterfaceC204564152s.class, required = true)
    InterfaceC204564152s getSyeNewRootFlow();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "syeNewStateId", required = true)
    Number getSyeNewStateId();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "error", nestedClassType = InterfaceC204569152x.class, required = true)
    void setError(InterfaceC204569152x interfaceC204569152x);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "syeNewRootFlow", nestedClassType = InterfaceC204564152s.class, required = true)
    void setSyeNewRootFlow(InterfaceC204564152s interfaceC204564152s);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "syeNewStateId", required = true)
    void setSyeNewStateId(Number number);
}
