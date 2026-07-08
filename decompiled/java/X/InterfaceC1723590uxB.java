package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0uxB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040E
public interface InterfaceC1723590uxB extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraPiList", required = true)
    String getExtraPiList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "piList", required = true)
    String getPiList();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "extraPiList", required = true)
    void setExtraPiList(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "piList", required = true)
    void setPiList(String str);
}
