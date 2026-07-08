package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.GetMultiGuestRecommendRoomsResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GetMultiGuestRecommendRoomsResponse_ProtoDecoder implements C0IMD<GetMultiGuestRecommendRoomsResponse> {
    @Override // X.C0IMD
    public final void LIZ(GetMultiGuestRecommendRoomsResponse getMultiGuestRecommendRoomsResponse) {
        GetMultiGuestRecommendRoomsResponse.ResponseData responseData = getMultiGuestRecommendRoomsResponse.data;
        if (responseData != null) {
            _GetMultiGuestRecommendRoomsResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final GetMultiGuestRecommendRoomsResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GetMultiGuestRecommendRoomsResponse getMultiGuestRecommendRoomsResponse = new GetMultiGuestRecommendRoomsResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        getMultiGuestRecommendRoomsResponse.extra = _GetMultiGuestRecommendRoomsResponse_Extra_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    getMultiGuestRecommendRoomsResponse.data = _GetMultiGuestRecommendRoomsResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return getMultiGuestRecommendRoomsResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetMultiGuestRecommendRoomsResponse getMultiGuestRecommendRoomsResponse, List list) {
    }
}
