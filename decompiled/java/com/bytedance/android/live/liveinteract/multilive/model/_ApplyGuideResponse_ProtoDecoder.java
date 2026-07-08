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
public final class _ApplyGuideResponse_ProtoDecoder implements C0IMD<ApplyGuideResponse> {
    @Override // X.C0IMD
    public final void LIZ(ApplyGuideResponse applyGuideResponse) {
        User user;
        ApplyGuideResponse.ResponseData responseData = applyGuideResponse.data;
        if (responseData != null && (user = responseData.applyUser) != null) {
            _User_ProtoDecoder.LJ(user);
        }
    }

    @Override // X.C0IMD
    public final ApplyGuideResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        ApplyGuideResponse applyGuideResponse = new ApplyGuideResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        applyGuideResponse.extra = _ApplyGuideResponse_Extra_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    applyGuideResponse.data = _ApplyGuideResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return applyGuideResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, ApplyGuideResponse applyGuideResponse, List list) {
    }
}
