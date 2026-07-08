package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.social.model.FilterShareListResp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _FilterShareListResp_ResponseData_ProtoDecoder implements C0IMD<FilterShareListResp.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(FilterShareListResp.ResponseData responseData) {
        FilterShareListResp.ResponseData responseData2 = responseData;
        if (responseData2.filteredCandidateList == null) {
            responseData2.filteredCandidateList = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final FilterShareListResp.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        FilterShareListResp.ResponseData responseData = new FilterShareListResp.ResponseData();
        responseData.filteredCandidateList = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.filteredCandidateList.add(Long.valueOf(c1516680pZS.LJIIJJI()));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, FilterShareListResp.ResponseData responseData, List list) {
    }
}
