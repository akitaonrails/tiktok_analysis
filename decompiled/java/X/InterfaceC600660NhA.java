package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0NhA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C040E
public interface InterfaceC600660NhA extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "errMessage", required = false)
    String getErrMessage();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "extraParams", required = false)
    Map<String, Object> getExtraParams();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isSuccess", required = true)
    Boolean isSuccess();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "errMessage", required = false)
    void setErrMessage(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "extraParams", required = false)
    void setExtraParams(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isSuccess", required = true)
    void setSuccess(Boolean bool);
}
