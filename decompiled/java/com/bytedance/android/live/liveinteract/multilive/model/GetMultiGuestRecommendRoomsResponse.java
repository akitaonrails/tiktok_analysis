package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetMultiGuestRecommendRoomsResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public Extra extra;

    public static final class Extra {

        @C09CT("now")
        public long now;
    }

    public static final class ResponseData {

        @C09CT("auto_permit_room")
        public MultiGuestRecommendRoomInfo autoPermitRoom;

        @C09CT("is_rate_limited")
        public boolean isRateLimited;

        @C09CT("live_guide_card")
        public LiveGuideCard liveGuideCard;

        @C09CT("reco_rooms")
        public List<MultiGuestRecommendRoomInfo> recoRooms = new ArrayList();
    }
}
