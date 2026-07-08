package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateUpdateResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play.NoticeboardTemplate;
import webcast.data.multi_guest_play._NoticeboardTemplate_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _NoticeboardTemplateUpdateResponse_ResponseData_ProtoDecoder implements C0IMD<NoticeboardTemplateUpdateResponse.ResponseData> {
    public static NoticeboardTemplateUpdateResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        NoticeboardTemplateUpdateResponse.ResponseData responseData = new NoticeboardTemplateUpdateResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        responseData.template = _NoticeboardTemplate_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    responseData.isSuccess = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(NoticeboardTemplateUpdateResponse.ResponseData responseData) {
        NoticeboardTemplate noticeboardTemplate = responseData.template;
        if (noticeboardTemplate != null) {
            _NoticeboardTemplate_ProtoDecoder.LJ(noticeboardTemplate);
        }
    }

    @Override // X.C0IMD
    public final NoticeboardTemplateUpdateResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NoticeboardTemplateUpdateResponse.ResponseData responseData, List list) {
    }
}
