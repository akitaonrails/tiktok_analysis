package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookUnfavoriteResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play._Playbook_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _PlaybookUnfavoriteResponse_ResponseData_ProtoDecoder implements C0IMD<PlaybookUnfavoriteResponse.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(PlaybookUnfavoriteResponse.ResponseData responseData) {
        Playbook playbook = responseData.playbook;
        if (playbook != null) {
            _Playbook_ProtoDecoder.LJ(playbook);
        }
    }

    @Override // X.C0IMD
    public final PlaybookUnfavoriteResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PlaybookUnfavoriteResponse.ResponseData responseData = new PlaybookUnfavoriteResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        responseData.playbook = _Playbook_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    responseData.success = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlaybookUnfavoriteResponse.ResponseData responseData, List list) {
    }
}
