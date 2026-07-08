package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0KZg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C040E
public interface InterfaceC519580KZg extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "manual_close", required = true)
    Boolean getManualClose();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "room_id", required = true)
    String getRoomId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "is_mute", required = true)
    Boolean isMute();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "manual_close", required = true)
    void setManualClose(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "is_mute", required = true)
    void setMute(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "room_id", required = true)
    void setRoomId(String str);
}
