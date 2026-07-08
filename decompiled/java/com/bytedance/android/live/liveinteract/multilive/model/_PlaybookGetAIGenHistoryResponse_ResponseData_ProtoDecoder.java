package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookGetAIGenHistoryResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PlaybookGetAIGenHistoryResponse_ResponseData_ProtoDecoder implements C0IMD<PlaybookGetAIGenHistoryResponse.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(PlaybookGetAIGenHistoryResponse.ResponseData responseData) {
        PlaybookGetAIGenHistoryResponse.ResponseData responseData2 = responseData;
        List<AiPlaybookSummary> list = responseData2.aiGenPlaybooks;
        if (list == null) {
            responseData2.aiGenPlaybooks = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<AiPlaybookSummary> it2 = responseData2.aiGenPlaybooks.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final PlaybookGetAIGenHistoryResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PlaybookGetAIGenHistoryResponse.ResponseData responseData = new PlaybookGetAIGenHistoryResponse.ResponseData();
        responseData.aiGenPlaybooks = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.aiGenPlaybooks.add(_AiPlaybookSummary_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlaybookGetAIGenHistoryResponse.ResponseData responseData, List list) {
    }
}
