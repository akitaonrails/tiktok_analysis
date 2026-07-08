package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.CountdownGetContentResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import webcast.data.multi_guest_play.CountdownContent;
import webcast.data.multi_guest_play._CountdownContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _CountdownGetContentResponse_ResponseData_ProtoDecoder implements C0IMD<CountdownGetContentResponse.ResponseData> {
    public static CountdownGetContentResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        CountdownGetContentResponse.ResponseData responseData = new CountdownGetContentResponse.ResponseData();
        responseData.countdownContents = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.countdownContents.add(_CountdownContent_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    public static void LJ(CountdownGetContentResponse.ResponseData responseData) {
        List<CountdownContent> list = responseData.countdownContents;
        if (list == null) {
            responseData.countdownContents = new ArrayList();
        } else {
            if (list.isEmpty()) {
                return;
            }
            Iterator<CountdownContent> it2 = responseData.countdownContents.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(CountdownGetContentResponse.ResponseData responseData) {
        LJ(responseData);
    }

    @Override // X.C0IMD
    public final CountdownGetContentResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, CountdownGetContentResponse.ResponseData responseData, List list) {
    }
}
