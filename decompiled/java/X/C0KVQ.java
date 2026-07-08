package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0KVQ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C040E
public interface C0KVQ extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "anchor_type", required = false)
    Number getAnchorType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "author_id", required = true)
    String getAuthorId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_from_merge", required = true)
    String getEnterFromMerge();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "enter_method", required = true)
    String getEnterMethod();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "lineup_author_id", required = true)
    String getLineupAuthorId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "lineup_room_id", required = true)
    String getLineupRoomId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "live_lineup_change_type", required = true)
    String getLiveLineupChangeType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "live_lineup_type", required = true)
    String getLiveLineupType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "live_lineup_user_type", required = true)
    String getLiveLineupUserType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "room_id", required = true)
    String getRoomId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isInLiveHouseRoom", required = true)
    Boolean isInLiveHouseRoom();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isLiveHouseAudience", required = true)
    Boolean isLiveHouseAudience();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "anchor_type", required = false)
    void setAnchorType(Number number);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "author_id", required = true)
    void setAuthorId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "enter_from_merge", required = true)
    void setEnterFromMerge(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "enter_method", required = true)
    void setEnterMethod(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isInLiveHouseRoom", required = true)
    void setInLiveHouseRoom(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "lineup_author_id", required = true)
    void setLineupAuthorId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "lineup_room_id", required = true)
    void setLineupRoomId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isLiveHouseAudience", required = true)
    void setLiveHouseAudience(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "live_lineup_change_type", required = true)
    void setLiveLineupChangeType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "live_lineup_type", required = true)
    void setLiveLineupType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "live_lineup_user_type", required = true)
    void setLiveLineupUserType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "room_id", required = true)
    void setRoomId(String str);
}
