package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0yye, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C040E
public interface InterfaceC1878260yye extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "boeChannel", required = true)
    String getBoeChannel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "ppeChannel", required = true)
    String getPpeChannel();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "useBOE", required = true)
    Boolean getUseBOE();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "usePPE", required = true)
    Boolean getUsePPE();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "boeChannel", required = true)
    void setBoeChannel(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "ppeChannel", required = true)
    void setPpeChannel(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "useBOE", required = true)
    void setUseBOE(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "usePPE", required = true)
    void setUsePPE(Boolean bool);
}
