package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0sBj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C040E
public interface InterfaceC1617290sBj extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", required = false)
    List<Object> getData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "error", required = false)
    Map<String, Object> getError();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "success", required = false)
    Boolean getSuccess();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "data", required = false)
    void setData(List<? extends Object> list);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "error", required = false)
    void setError(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "success", required = false)
    void setSuccess(Boolean bool);
}
