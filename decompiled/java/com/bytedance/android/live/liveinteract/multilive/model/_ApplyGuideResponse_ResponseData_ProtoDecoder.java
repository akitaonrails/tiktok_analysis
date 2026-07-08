package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.liveinteract.multilive.model.ApplyGuideResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _ApplyGuideResponse_ResponseData_ProtoDecoder implements C0IMD<ApplyGuideResponse.ResponseData> {
    public static ApplyGuideResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        ApplyGuideResponse.ResponseData responseData = new ApplyGuideResponse.ResponseData();
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
                                responseData.applyUser = _User_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            responseData.triggerAgain = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        responseData.displayStrategy = c1516680pZS.LJIIJ();
                    }
                } else {
                    responseData.isDisplay = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(ApplyGuideResponse.ResponseData responseData) {
        User user = responseData.applyUser;
        if (user != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final ApplyGuideResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ApplyGuideResponse.ResponseData responseData, List list) {
    }
}
