package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.EnlargeScreenManageResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common._PosIdentity_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _EnlargeScreenManageResponse_ResponseData_ProtoDecoder implements C0IMD<EnlargeScreenManageResponse.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(EnlargeScreenManageResponse.ResponseData responseData) {
        EnlargeScreenManageResponse.ResponseData responseData2 = responseData;
        List<PosIdentity> list = responseData2.enlargedMultiPos;
        if (list == null) {
            responseData2.enlargedMultiPos = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<PosIdentity> it2 = responseData2.enlargedMultiPos.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final EnlargeScreenManageResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EnlargeScreenManageResponse.ResponseData responseData = new EnlargeScreenManageResponse.ResponseData();
        responseData.enlargedMultiPos = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            C1516700pZU.LJ(c1516680pZS);
                        } else {
                            responseData.enlargedMultiPos.add(_PosIdentity_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        responseData.enlargePosition = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    responseData.enlargeLinkmicId = C1516700pZU.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EnlargeScreenManageResponse.ResponseData responseData, List list) {
    }
}
