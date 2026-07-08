package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveResponse;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message._PerceptionMessage_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestReserveResponse_ProtoDecoder implements C0IMD<MultiGuestReserveResponse> {
    @Override // X.C0IMD
    public final void LIZ(MultiGuestReserveResponse multiGuestReserveResponse) {
        PerceptionMessage perceptionMessage;
        MultiGuestReserveResponse.ResponseData responseData = multiGuestReserveResponse.data;
        if (responseData != null && (perceptionMessage = responseData.perceptionInfo) != null) {
            _PerceptionMessage_ProtoDecoder.LJ(perceptionMessage);
        }
    }

    @Override // X.C0IMD
    public final MultiGuestReserveResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestReserveResponse multiGuestReserveResponse = new MultiGuestReserveResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        multiGuestReserveResponse.extra = _MultiGuestReserveResponse_Extra_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    multiGuestReserveResponse.data = _MultiGuestReserveResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiGuestReserveResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestReserveResponse multiGuestReserveResponse, List list) {
    }
}
