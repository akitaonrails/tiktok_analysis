package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0hEd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C040E
public interface InterfaceC1196250hEd extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "data", required = false)
    Map<String, Object> getData();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "eventName", required = false)
    String getEventName();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "phase", required = false)
    String getPhase();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "sessionId", required = false)
    String getSessionId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "timestamp", required = false)
    Number getTimestamp();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "data", required = false)
    void setData(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "eventName", required = false)
    void setEventName(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "phase", required = false)
    void setPhase(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "sessionId", required = false)
    void setSessionId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "timestamp", required = false)
    void setTimestamp(Number number);
}
