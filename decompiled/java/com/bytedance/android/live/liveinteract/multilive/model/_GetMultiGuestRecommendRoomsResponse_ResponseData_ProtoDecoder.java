package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.GetMultiGuestRecommendRoomsResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GetMultiGuestRecommendRoomsResponse_ResponseData_ProtoDecoder implements C0IMD<GetMultiGuestRecommendRoomsResponse.ResponseData> {
    public static GetMultiGuestRecommendRoomsResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GetMultiGuestRecommendRoomsResponse.ResponseData responseData = new GetMultiGuestRecommendRoomsResponse.ResponseData();
        responseData.recoRooms = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                responseData.autoPermitRoom = _MultiGuestRecommendRoomInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            responseData.liveGuideCard = _LiveGuideCard_ProtoDecoder.LIZLLL(c1516680pZS);
                        }
                    } else {
                        responseData.isRateLimited = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    responseData.recoRooms.add(_MultiGuestRecommendRoomInfo_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(GetMultiGuestRecommendRoomsResponse.ResponseData responseData) {
        List<MultiGuestRecommendRoomInfo> list = responseData.recoRooms;
        if (list == null) {
            responseData.recoRooms = new ArrayList();
        } else if (!list.isEmpty()) {
            for (MultiGuestRecommendRoomInfo multiGuestRecommendRoomInfo : responseData.recoRooms) {
                if (multiGuestRecommendRoomInfo != null) {
                    _MultiGuestRecommendRoomInfo_ProtoDecoder.LJ(multiGuestRecommendRoomInfo);
                }
            }
        }
        LiveGuideCard liveGuideCard = responseData.liveGuideCard;
        if (liveGuideCard != null && liveGuideCard.friendListTop3Avatar == null) {
            liveGuideCard.friendListTop3Avatar = new ArrayList();
        }
        MultiGuestRecommendRoomInfo multiGuestRecommendRoomInfo2 = responseData.autoPermitRoom;
        if (multiGuestRecommendRoomInfo2 != null) {
            _MultiGuestRecommendRoomInfo_ProtoDecoder.LJ(multiGuestRecommendRoomInfo2);
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GetMultiGuestRecommendRoomsResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final GetMultiGuestRecommendRoomsResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetMultiGuestRecommendRoomsResponse.ResponseData responseData, List list) {
    }
}
