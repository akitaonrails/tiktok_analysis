package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0XJS, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C040E
public interface C0XJS extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "page", required = false)
    String getPage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "ppre", required = true)
    String getPpre();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pre", required = true)
    String getPre();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "ts", required = true)
    Number getTs();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "page", required = false)
    void setPage(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "ppre", required = true)
    void setPpre(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "pre", required = true)
    void setPre(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "ts", required = true)
    void setTs(Number number);
}
