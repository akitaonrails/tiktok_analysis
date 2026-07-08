package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0OQU, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C040E
public interface C0OQU extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "serverExtra", required = false)
    Map<String, Object> getServerExtra();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "statusCode", required = true)
    Number getStatusCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "statusMsg", required = true)
    String getStatusMsg();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "toastMsg", required = true)
    String getToastMsg();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "serverExtra", required = false)
    void setServerExtra(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "statusCode", required = true)
    void setStatusCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "statusMsg", required = true)
    void setStatusMsg(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "toastMsg", required = true)
    void setToastMsg(String str);
}
