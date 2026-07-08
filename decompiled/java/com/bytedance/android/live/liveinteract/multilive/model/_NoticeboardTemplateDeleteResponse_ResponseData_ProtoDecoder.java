package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateDeleteResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NoticeboardTemplateDeleteResponse_ResponseData_ProtoDecoder implements C0IMD<NoticeboardTemplateDeleteResponse.ResponseData> {
    public static NoticeboardTemplateDeleteResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        NoticeboardTemplateDeleteResponse.ResponseData responseData = new NoticeboardTemplateDeleteResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        responseData.noticeboardTemplateId = c1516680pZS.LJIIJJI();
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
    public final NoticeboardTemplateDeleteResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(NoticeboardTemplateDeleteResponse.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NoticeboardTemplateDeleteResponse.ResponseData responseData, List list) {
    }
}
