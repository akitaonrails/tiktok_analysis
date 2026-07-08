package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.GetNoticeboardTemplateResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play.NoticeboardTemplate;
import webcast.data.multi_guest_play._NoticeboardTemplate_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _GetNoticeboardTemplateResponse_ResponseData_ProtoDecoder implements C0IMD<GetNoticeboardTemplateResponse.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(GetNoticeboardTemplateResponse.ResponseData responseData) {
        NoticeboardTemplate noticeboardTemplate = responseData.template;
        if (noticeboardTemplate != null) {
            _NoticeboardTemplate_ProtoDecoder.LJ(noticeboardTemplate);
        }
    }

    @Override // X.C0IMD
    public final GetNoticeboardTemplateResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GetNoticeboardTemplateResponse.ResponseData responseData = new GetNoticeboardTemplateResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.template = _NoticeboardTemplate_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetNoticeboardTemplateResponse.ResponseData responseData, List list) {
    }
}
