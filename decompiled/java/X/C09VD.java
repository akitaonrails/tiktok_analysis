package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;

/* JADX INFO: renamed from: X.09VD, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C040E
public interface C09VD extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "tempFiles", nestedClassType = C09VA.class, required = true)
    List<C09VA> getTempFiles();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "tempFiles", nestedClassType = C09VA.class, required = true)
    void setTempFiles(List<? extends C09VA> list);
}
