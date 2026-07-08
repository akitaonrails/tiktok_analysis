package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.SetQuickCallAutoApproveResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SetQuickCallAutoApproveResponse_ResponseData_ProtoDecoder implements C0IMD<SetQuickCallAutoApproveResponse.ResponseData> {
    @Override // X.C0IMD
    public final SetQuickCallAutoApproveResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        SetQuickCallAutoApproveResponse.ResponseData responseData = new SetQuickCallAutoApproveResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.quickCallAutoApproveStartMs = c1516680pZS.LJIIJJI();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(SetQuickCallAutoApproveResponse.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SetQuickCallAutoApproveResponse.ResponseData responseData, List list) {
    }
}
