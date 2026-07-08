package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.06DT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C040E
public interface C06DT extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "petValue", required = true)
    Map<String, Object> getPetValue();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sceneResponseBody", required = true)
    String getSceneResponseBody();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "statusCode", required = true)
    Number getStatusCode();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "statusMsg", required = true)
    String getStatusMsg();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "petValue", required = true)
    void setPetValue(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "sceneResponseBody", required = true)
    void setSceneResponseBody(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "statusCode", required = true)
    void setStatusCode(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "statusMsg", required = true)
    void setStatusMsg(String str);
}
