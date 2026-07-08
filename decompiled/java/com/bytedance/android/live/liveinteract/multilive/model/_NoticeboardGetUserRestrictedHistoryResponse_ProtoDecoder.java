package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardGetUserRestrictedHistoryResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NoticeboardGetUserRestrictedHistoryResponse_ProtoDecoder implements C0IMD<NoticeboardGetUserRestrictedHistoryResponse> {
    @Override // X.C0IMD
    public final void LIZ(NoticeboardGetUserRestrictedHistoryResponse noticeboardGetUserRestrictedHistoryResponse) {
        NoticeboardGetUserRestrictedHistoryResponse.ResponseData responseData = noticeboardGetUserRestrictedHistoryResponse.data;
        if (responseData != null && responseData.restrictedMap == null) {
            responseData.restrictedMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final NoticeboardGetUserRestrictedHistoryResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        NoticeboardGetUserRestrictedHistoryResponse noticeboardGetUserRestrictedHistoryResponse = new NoticeboardGetUserRestrictedHistoryResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    noticeboardGetUserRestrictedHistoryResponse.data = _NoticeboardGetUserRestrictedHistoryResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return noticeboardGetUserRestrictedHistoryResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NoticeboardGetUserRestrictedHistoryResponse noticeboardGetUserRestrictedHistoryResponse, List list) {
    }
}
