package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NoticeboardTemplateFetchListParams_ProtoDecoder implements C0IMD<NoticeboardTemplateFetchListParams> {
    @Override // X.C0IMD
    public final NoticeboardTemplateFetchListParams LIZJ(C1516680pZS c1516680pZS) throws IOException {
        NoticeboardTemplateFetchListParams noticeboardTemplateFetchListParams = new NoticeboardTemplateFetchListParams();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        noticeboardTemplateFetchListParams.roomId = c1516680pZS.LJIIJJI();
                    }
                } else {
                    noticeboardTemplateFetchListParams.fetchType = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return noticeboardTemplateFetchListParams;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(NoticeboardTemplateFetchListParams noticeboardTemplateFetchListParams) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NoticeboardTemplateFetchListParams noticeboardTemplateFetchListParams, List list) {
    }
}
