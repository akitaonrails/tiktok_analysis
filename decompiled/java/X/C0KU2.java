package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0KU2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C040E
public interface C0KU2 extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "anchor_info", required = false)
    Map<String, Object> getAnchorInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "room_info", required = false)
    Map<String, Object> getRoomInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "time_info", required = false)
    Map<String, Object> getTimeInfo();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "user_info", required = false)
    Map<String, Object> getUserInfo();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "anchor_info", required = false)
    void setAnchorInfo(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "room_info", required = false)
    void setRoomInfo(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "time_info", required = false)
    void setTimeInfo(Map<String, ? extends Object> map);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "user_info", required = false)
    void setUserInfo(Map<String, ? extends Object> map);
}
