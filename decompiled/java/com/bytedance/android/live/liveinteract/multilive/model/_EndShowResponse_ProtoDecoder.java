package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.EndShowResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play.ShowContent;
import webcast.data.multi_guest_play._ShowContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _EndShowResponse_ProtoDecoder implements C0IMD<EndShowResponse> {
    @Override // X.C0IMD
    public final void LIZ(EndShowResponse endShowResponse) {
        ShowContent showContent;
        EndShowResponse.ResponseData responseData = endShowResponse.data;
        if (responseData != null && (showContent = responseData.showContent) != null) {
            _ShowContent_ProtoDecoder.LJ(showContent);
        }
    }

    @Override // X.C0IMD
    public final EndShowResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        EndShowResponse endShowResponse = new EndShowResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    endShowResponse.data = _EndShowResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return endShowResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, EndShowResponse endShowResponse, List list) {
    }
}
