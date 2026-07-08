package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateSaveResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play.NoticeboardTemplate;
import webcast.data.multi_guest_play._NoticeboardTemplate_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _NoticeboardTemplateSaveResponse_ProtoDecoder implements C0IMD<NoticeboardTemplateSaveResponse> {
    @Override // X.C0IMD
    public final void LIZ(NoticeboardTemplateSaveResponse noticeboardTemplateSaveResponse) {
        NoticeboardTemplate noticeboardTemplate;
        NoticeboardTemplateSaveResponse.ResponseData responseData = noticeboardTemplateSaveResponse.data;
        if (responseData != null && (noticeboardTemplate = responseData.template) != null) {
            _NoticeboardTemplate_ProtoDecoder.LJ(noticeboardTemplate);
        }
    }

    @Override // X.C0IMD
    public final NoticeboardTemplateSaveResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        NoticeboardTemplateSaveResponse noticeboardTemplateSaveResponse = new NoticeboardTemplateSaveResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    noticeboardTemplateSaveResponse.data = _NoticeboardTemplateSaveResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return noticeboardTemplateSaveResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NoticeboardTemplateSaveResponse noticeboardTemplateSaveResponse, List list) {
    }
}
