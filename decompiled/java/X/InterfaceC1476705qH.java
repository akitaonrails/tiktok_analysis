package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.05qH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C040E
public interface InterfaceC1476705qH extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "jsonDict", required = true)
    Map<String, Object> getJsonDict();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "jsonDict", required = true)
    void setJsonDict(Map<String, ? extends Object> map);
}
