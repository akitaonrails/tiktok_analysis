package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.GetNoticeboardMaterialContentResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import webcast.data.multi_guest_play.ConvertNoticeboardMaterialInfo;

/* JADX INFO: loaded from: classes.dex */
public final class _GetNoticeboardMaterialContentResponse_ProtoDecoder implements C0IMD<GetNoticeboardMaterialContentResponse> {
    @Override // X.C0IMD
    public final void LIZ(GetNoticeboardMaterialContentResponse getNoticeboardMaterialContentResponse) {
        ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo;
        GetNoticeboardMaterialContentResponse.ResponseData responseData = getNoticeboardMaterialContentResponse.data;
        if (responseData != null && (convertNoticeboardMaterialInfo = responseData.convertNoticeboardMaterialInfo) != null && convertNoticeboardMaterialInfo.starlingMap == null) {
            convertNoticeboardMaterialInfo.starlingMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final GetNoticeboardMaterialContentResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GetNoticeboardMaterialContentResponse getNoticeboardMaterialContentResponse = new GetNoticeboardMaterialContentResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    getNoticeboardMaterialContentResponse.data = _GetNoticeboardMaterialContentResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return getNoticeboardMaterialContentResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetNoticeboardMaterialContentResponse getNoticeboardMaterialContentResponse, List list) {
    }
}
