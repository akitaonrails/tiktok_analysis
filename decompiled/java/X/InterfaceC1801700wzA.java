package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0wzA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1801700wzA extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "error", nestedClassType = InterfaceC1801640wz4.class, required = false)
    InterfaceC1801640wz4 getError();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "tempFiles", nestedClassType = InterfaceC1835890xsJ.class, required = true)
    InterfaceC1835890xsJ getTempFiles();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "error", nestedClassType = InterfaceC1801640wz4.class, required = false)
    void setError(InterfaceC1801640wz4 interfaceC1801640wz4);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "tempFiles", nestedClassType = InterfaceC1835890xsJ.class, required = true)
    void setTempFiles(InterfaceC1835890xsJ interfaceC1835890xsJ);
}
