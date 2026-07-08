package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateFetchListResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NoticeboardTemplateFetchListResponse_ProtoDecoder implements C0IMD<NoticeboardTemplateFetchListResponse> {
    @Override // X.C0IMD
    public final void LIZ(NoticeboardTemplateFetchListResponse noticeboardTemplateFetchListResponse) {
        NoticeboardTemplateFetchListResponse.ResponseData responseData = noticeboardTemplateFetchListResponse.data;
        if (responseData != null) {
            _NoticeboardTemplateFetchListResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final NoticeboardTemplateFetchListResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        NoticeboardTemplateFetchListResponse noticeboardTemplateFetchListResponse = new NoticeboardTemplateFetchListResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    noticeboardTemplateFetchListResponse.data = _NoticeboardTemplateFetchListResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return noticeboardTemplateFetchListResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NoticeboardTemplateFetchListResponse noticeboardTemplateFetchListResponse, List list) {
    }
}
