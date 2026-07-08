package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0TST, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C040E
public interface C0TST extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "encData", required = false)
    String getEncData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "encLatitude", required = true)
    String getEncLatitude();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "encLongitude", required = true)
    String getEncLongitude();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "encData", required = false)
    void setEncData(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "encLatitude", required = true)
    void setEncLatitude(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "encLongitude", required = true)
    void setEncLongitude(String str);
}
