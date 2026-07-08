package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0KTM, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C040E
public interface C0KTM extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "error", nestedClassType = C0KTN.class, required = false)
    C0KTN getError();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "result", nestedClassType = C0KTL.class, required = false)
    C0KTL getResult();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "error", nestedClassType = C0KTN.class, required = false)
    void setError(C0KTN c0ktn);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "result", nestedClassType = C0KTL.class, required = false)
    void setResult(C0KTL c0ktl);
}
