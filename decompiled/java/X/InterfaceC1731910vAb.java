package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0vAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C040E
public interface InterfaceC1731910vAb extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "errMessage", required = false)
    String getErrMessage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "filePath", required = false)
    String getFilePath();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errMessage", required = false)
    void setErrMessage(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "filePath", required = false)
    void setFilePath(String str);
}
