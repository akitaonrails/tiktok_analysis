package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.0xsJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1835890xsJ extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "base64Data", required = false)
    String getBase64Data();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "size", required = true)
    Number getSize();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tempFilePath", required = true)
    String getTempFilePath();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "base64Data", required = false)
    void setBase64Data(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "size", required = true)
    void setSize(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "tempFilePath", required = true)
    void setTempFilePath(String str);
}
