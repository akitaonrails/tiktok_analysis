package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.14WM, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@C040E
public interface C14WM extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "tempFiles", nestedClassType = C14WN.class, required = true)
    List<C14WN> getTempFiles();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "tempFiles", nestedClassType = C14WN.class, required = true)
    void setTempFiles(List<? extends C14WN> list);
}
