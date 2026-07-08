package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.GetNoticeboardMaterialContentResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import webcast.data.multi_guest_play.ConvertNoticeboardMaterialInfo;
import webcast.data.multi_guest_play._ConvertNoticeboardMaterialInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _GetNoticeboardMaterialContentResponse_ResponseData_ProtoDecoder implements C0IMD<GetNoticeboardMaterialContentResponse.ResponseData> {
    public static GetNoticeboardMaterialContentResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GetNoticeboardMaterialContentResponse.ResponseData responseData = new GetNoticeboardMaterialContentResponse.ResponseData();
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
                                responseData.updateTime = c1516680pZS.LJIIJJI();
                            }
                        } else {
                            responseData.createTime = c1516680pZS.LJIIJJI();
                        }
                    } else {
                        responseData.convertNoticeboardMaterialInfo = _ConvertNoticeboardMaterialInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    responseData.mediaNodeId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GetNoticeboardMaterialContentResponse.ResponseData responseData) {
        ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo = responseData.convertNoticeboardMaterialInfo;
        if (convertNoticeboardMaterialInfo != null && convertNoticeboardMaterialInfo.starlingMap == null) {
            convertNoticeboardMaterialInfo.starlingMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final GetNoticeboardMaterialContentResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetNoticeboardMaterialContentResponse.ResponseData responseData, List list) {
    }
}
