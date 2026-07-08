package com.bytedance.android.live.base.model.roomcomponents;

import X.C09CT;
import com.bytedance.android.livesdk.rank.model.RankEntranceV3Response;
import java.util.List;
import webcast.api.room.GetOnlineRoomPCUResponse;

/* JADX INFO: loaded from: classes36.dex */
public final class RoomComponentsResponse {

    @C09CT("online_audience")
    public OnlineRankListResponse onlineAudienceData;

    @C09CT("online_audience_status")
    public Long onlineAudienceStatus;

    @C09CT("rankings")
    public List<RankEntranceV3Response.EntranceGroup> rankingData;

    @C09CT("rankings_status")
    public Long rankingStatus;

    @C09CT("room_pcu")
    public GetOnlineRoomPCUResponse.ResponseData roomPcu;

    @C09CT("room_pcu_status")
    public long roomPcuStatus;

    public RoomComponentsResponse() {
        this(null, null, null, null, 0L, null);
    }

    public RoomComponentsResponse(Long l, OnlineRankListResponse onlineRankListResponse, Long l2, List<RankEntranceV3Response.EntranceGroup> list, long j, GetOnlineRoomPCUResponse.ResponseData responseData) {
        this.onlineAudienceStatus = l;
        this.onlineAudienceData = onlineRankListResponse;
        this.rankingStatus = l2;
        this.rankingData = list;
        this.roomPcuStatus = j;
        this.roomPcu = responseData;
    }
}
