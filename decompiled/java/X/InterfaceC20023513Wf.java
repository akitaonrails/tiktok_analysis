package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.13Wf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C040E
public interface InterfaceC20023513Wf extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "fileUrl", required = true)
    String getFileUrl();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "size", required = true)
    Number getSize();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "fileUrl", required = true)
    void setFileUrl(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "size", required = true)
    void setSize(Number number);
}
