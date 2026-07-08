package com.bytedance.android.live.broadcast.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _LivePermissionApplyResponse_ProtoDecoder implements C0IMD<LivePermissionApplyResponse> {
    @Override // X.C0IMD
    public final void LIZ(LivePermissionApplyResponse livePermissionApplyResponse) {
        LivePermissionApplyResponse.ResponseData responseData = livePermissionApplyResponse.data;
        if (responseData != null) {
            _LivePermissionApplyResponse_ResponseData_ProtoDecoder.LJ(responseData);
        }
    }

    @Override // X.C0IMD
    public final LivePermissionApplyResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        LivePermissionApplyResponse livePermissionApplyResponse = new LivePermissionApplyResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    livePermissionApplyResponse.data = _LivePermissionApplyResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return livePermissionApplyResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LivePermissionApplyResponse livePermissionApplyResponse, List list) {
    }
}
