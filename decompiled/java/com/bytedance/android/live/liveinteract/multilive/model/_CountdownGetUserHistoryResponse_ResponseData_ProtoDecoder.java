package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownGetUserHistoryResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.multi_guest_play.UserCountdownRecord;
import webcast.data.multi_guest_play._UserCountdownRecord_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CountdownGetUserHistoryResponse_ResponseData_ProtoDecoder implements C0IMD<CountdownGetUserHistoryResponse.ResponseData> {
    public static CountdownGetUserHistoryResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CountdownGetUserHistoryResponse.ResponseData responseData = new CountdownGetUserHistoryResponse.ResponseData();
        responseData.records = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.records.add(_UserCountdownRecord_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(CountdownGetUserHistoryResponse.ResponseData responseData) {
        List<UserCountdownRecord> list = responseData.records;
        if (list == null) {
            responseData.records = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<UserCountdownRecord> it2 = responseData.records.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CountdownGetUserHistoryResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final CountdownGetUserHistoryResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CountdownGetUserHistoryResponse.ResponseData responseData, List list) {
    }
}
