package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardTemplateFetchListResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import webcast.data.multi_guest_play.NoticeboardTemplate;
import webcast.data.multi_guest_play._NoticeboardTemplate_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _NoticeboardTemplateFetchListResponse_ResponseData_ProtoDecoder implements C0IMD<NoticeboardTemplateFetchListResponse.ResponseData> {
    public static NoticeboardTemplateFetchListResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        NoticeboardTemplateFetchListResponse.ResponseData responseData = new NoticeboardTemplateFetchListResponse.ResponseData();
        responseData.recommendedTemplates = new ArrayList();
        responseData.myTemplates = new ArrayList();
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
                                responseData.isOfficialUser = C1516700pZU.LIZ(c1516680pZS);
                            }
                        } else {
                            responseData.createNumLimit = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        responseData.recommendedTemplates.add(_NoticeboardTemplate_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    responseData.myTemplates.add(_NoticeboardTemplate_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(NoticeboardTemplateFetchListResponse.ResponseData responseData) {
        List<NoticeboardTemplate> list = responseData.myTemplates;
        if (list == null) {
            responseData.myTemplates = new ArrayList();
        } else if (!list.isEmpty()) {
            for (NoticeboardTemplate noticeboardTemplate : responseData.myTemplates) {
                if (noticeboardTemplate != null) {
                    _NoticeboardTemplate_ProtoDecoder.LJ(noticeboardTemplate);
                }
            }
        }
        List<NoticeboardTemplate> list2 = responseData.recommendedTemplates;
        if (list2 == null) {
            responseData.recommendedTemplates = new ArrayList();
            return;
        }
        if (list2.isEmpty()) {
            return;
        }
        for (NoticeboardTemplate noticeboardTemplate2 : responseData.recommendedTemplates) {
            if (noticeboardTemplate2 != null) {
                _NoticeboardTemplate_ProtoDecoder.LJ(noticeboardTemplate2);
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(NoticeboardTemplateFetchListResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final NoticeboardTemplateFetchListResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NoticeboardTemplateFetchListResponse.ResponseData responseData, List list) {
    }
}
