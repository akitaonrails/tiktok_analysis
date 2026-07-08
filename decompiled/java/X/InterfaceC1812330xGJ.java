package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0xGJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C040E
public interface InterfaceC1812330xGJ extends XBaseResultModel {
    @InterfaceC1549470qQL(isGetter = true, keyPath = "battleId", required = false)
    String getBattleId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "blueTeamUidList", required = false)
    String getBlueTeamUidList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "channelId", required = false)
    String getChannelId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "redTeamUidList", required = false)
    String getRedTeamUidList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "roomId", required = false)
    String getRoomId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "subMatchType", required = false)
    String getSubMatchType();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "teamId", required = false)
    String getTeamId();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "uidList", required = false)
    String getUidList();

    @InterfaceC1549470qQL(isGetter = true, keyPath = "isOpponent", required = false)
    Boolean isOpponent();

    @InterfaceC1549470qQL(isGetter = false, keyPath = "battleId", required = false)
    void setBattleId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "blueTeamUidList", required = false)
    void setBlueTeamUidList(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "channelId", required = false)
    void setChannelId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "isOpponent", required = false)
    void setOpponent(Boolean bool);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "redTeamUidList", required = false)
    void setRedTeamUidList(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "roomId", required = false)
    void setRoomId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "subMatchType", required = false)
    void setSubMatchType(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "teamId", required = false)
    void setTeamId(String str);

    @InterfaceC1549470qQL(isGetter = false, keyPath = "uidList", required = false)
    void setUidList(String str);
}
