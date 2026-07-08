package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.HostDisplayResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _HostDisplayResponse_ResponseData_ProtoDecoder implements C0IMD<HostDisplayResponse.ResponseData> {
    public static HostDisplayResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        HostDisplayResponse.ResponseData responseData = new HostDisplayResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.displayInfo = _HostDisplayResponse_DisplayInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(HostDisplayResponse.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final HostDisplayResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, HostDisplayResponse.ResponseData responseData, List list) {
    }
}
