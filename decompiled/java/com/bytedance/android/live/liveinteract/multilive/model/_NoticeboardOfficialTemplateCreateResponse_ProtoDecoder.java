package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardOfficialTemplateCreateResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play.NoticeboardTemplate;
import webcast.data.multi_guest_play._NoticeboardTemplate_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _NoticeboardOfficialTemplateCreateResponse_ProtoDecoder implements C0IMD<NoticeboardOfficialTemplateCreateResponse> {
    @Override // X.C0IMD
    public final void LIZ(NoticeboardOfficialTemplateCreateResponse noticeboardOfficialTemplateCreateResponse) {
        NoticeboardTemplate noticeboardTemplate;
        NoticeboardOfficialTemplateCreateResponse.ResponseData responseData = noticeboardOfficialTemplateCreateResponse.data;
        if (responseData != null && (noticeboardTemplate = responseData.template) != null) {
            _NoticeboardTemplate_ProtoDecoder.LJ(noticeboardTemplate);
        }
    }

    @Override // X.C0IMD
    public final NoticeboardOfficialTemplateCreateResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        NoticeboardOfficialTemplateCreateResponse noticeboardOfficialTemplateCreateResponse = new NoticeboardOfficialTemplateCreateResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    noticeboardOfficialTemplateCreateResponse.data = _NoticeboardOfficialTemplateCreateResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return noticeboardOfficialTemplateCreateResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NoticeboardOfficialTemplateCreateResponse noticeboardOfficialTemplateCreateResponse, List list) {
    }
}
