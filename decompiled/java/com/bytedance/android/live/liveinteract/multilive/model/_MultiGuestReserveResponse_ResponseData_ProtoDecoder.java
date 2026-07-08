package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveResponse;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message._AudienceReserveUserInfo_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestReserveResponse_ResponseData_ProtoDecoder implements C0IMD<MultiGuestReserveResponse.ResponseData> {
    public static MultiGuestReserveResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestReserveResponse.ResponseData responseData = new MultiGuestReserveResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        responseData.reserveUserInfo = _AudienceReserveUserInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    responseData.perceptionInfo = _PerceptionMessage_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(MultiGuestReserveResponse.ResponseData responseData) {
        PerceptionMessage perceptionMessage = responseData.perceptionInfo;
        if (perceptionMessage != null) {
            _PerceptionMessage_ProtoDecoder.LJ(perceptionMessage);
        }
    }

    @Override // X.C0IMD
    public final MultiGuestReserveResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestReserveResponse.ResponseData responseData, List list) {
    }
}
