package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play._ShowContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _UpdateShowContentResponse_ProtoDecoder implements C0IMD<UpdateShowContentResponse> {
    @Override // X.C0IMD
    public final void LIZ(UpdateShowContentResponse updateShowContentResponse) {
        ShowContent showContent;
        UpdateShowContentResponse.ResponseData responseData = updateShowContentResponse.data;
        if (responseData != null && (showContent = responseData.showContent) != null) {
            _ShowContent_ProtoDecoder.LJ(showContent);
        }
    }

    @Override // X.C0IMD
    public final UpdateShowContentResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        UpdateShowContentResponse updateShowContentResponse = new UpdateShowContentResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    updateShowContentResponse.data = _UpdateShowContentResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return updateShowContentResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, UpdateShowContentResponse updateShowContentResponse, List list) {
    }
}
