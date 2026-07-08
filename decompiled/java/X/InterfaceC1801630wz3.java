package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0wz3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1801630wz3 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "multirefers", required = true)
    String getMultirefers();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "oid", required = true)
    String getOid();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pgrefer", required = true)
    String getPgrefer();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "pgreferSPM", required = true)
    String getPgreferSPM();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "psrefer", required = true)
    String getPsrefer();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "psreferSPM", required = true)
    String getPsreferSPM();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "multirefers", required = true)
    void setMultirefers(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "oid", required = true)
    void setOid(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "pgrefer", required = true)
    void setPgrefer(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "pgreferSPM", required = true)
    void setPgreferSPM(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "psrefer", required = true)
    void setPsrefer(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "psreferSPM", required = true)
    void setPsreferSPM(String str);
}
