package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardGetUserRestrictedHistoryResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _NoticeboardGetUserRestrictedHistoryResponse_ResponseData_ProtoDecoder implements C0IMD<NoticeboardGetUserRestrictedHistoryResponse.ResponseData> {
    public static NoticeboardGetUserRestrictedHistoryResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        NoticeboardGetUserRestrictedHistoryResponse.ResponseData responseData = new NoticeboardGetUserRestrictedHistoryResponse.ResponseData();
        responseData.restrictedMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    long jLIZJ2 = c1516680pZS.LIZJ();
                    String strLIZLLL = null;
                    Integer numValueOf = null;
                    while (true) {
                        int iLJI2 = c1516680pZS.LJI();
                        if (iLJI2 == -1) {
                            break;
                        }
                        if (iLJI2 != 1) {
                            if (iLJI2 == 2) {
                                numValueOf = Integer.valueOf(c1516680pZS.LJIIJ());
                            }
                        } else {
                            strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    }
                    c1516680pZS.LJ(jLIZJ2);
                    if (strLIZLLL != null) {
                        if (numValueOf != null) {
                            responseData.restrictedMap.put(strLIZLLL, numValueOf);
                        } else {
                            throw new IllegalStateException("Map value must not be null!");
                        }
                    } else {
                        throw new IllegalStateException("Map key must not be null!");
                    }
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(NoticeboardGetUserRestrictedHistoryResponse.ResponseData responseData) {
        NoticeboardGetUserRestrictedHistoryResponse.ResponseData responseData2 = responseData;
        if (responseData2.restrictedMap == null) {
            responseData2.restrictedMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final NoticeboardGetUserRestrictedHistoryResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NoticeboardGetUserRestrictedHistoryResponse.ResponseData responseData, List list) {
    }
}
