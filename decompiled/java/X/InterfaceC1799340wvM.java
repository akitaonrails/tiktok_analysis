package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0wvM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1799340wvM extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "code", required = false)
    Number getCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", required = false)
    Map<String, Object> getData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "msg", required = false)
    String getMsg();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "code", required = false)
    void setCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "data", required = false)
    void setData(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "msg", required = false)
    void setMsg(String str);
}
