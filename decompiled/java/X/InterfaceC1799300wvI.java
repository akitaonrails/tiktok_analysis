package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0wvI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1799300wvI extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "error", nestedClassType = InterfaceC1799310wvJ.class, required = false)
    InterfaceC1799310wvJ getError();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "storefront", nestedClassType = InterfaceC1799270wvF.class, required = false)
    InterfaceC1799270wvF getStorefront();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "error", nestedClassType = InterfaceC1799310wvJ.class, required = false)
    void setError(InterfaceC1799310wvJ interfaceC1799310wvJ);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "storefront", nestedClassType = InterfaceC1799270wvF.class, required = false)
    void setStorefront(InterfaceC1799270wvF interfaceC1799270wvF);
}
