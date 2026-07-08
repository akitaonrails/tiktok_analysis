package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.09VG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C040E
public interface C09VG extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", required = false)
    Map<String, Object> getData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "func", required = false)
    String getFunc();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "data", required = false)
    void setData(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "func", required = false)
    void setFunc(String str);
}
