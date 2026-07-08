package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.141f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public interface InterfaceC201977141f extends XBaseModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "base64Data", required = true)
    String getBase64Data();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "path", required = true)
    String getPath();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "size", required = true)
    String getSize();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "base64Data", required = true)
    void setBase64Data(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "path", required = true)
    void setPath(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "size", required = true)
    void setSize(String str);
}
