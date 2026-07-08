package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookPublishResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play._Playbook_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _PlaybookPublishResponse_ResponseData_ProtoDecoder implements C0IMD<PlaybookPublishResponse.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(PlaybookPublishResponse.ResponseData responseData) {
        Playbook playbook = responseData.playbook;
        if (playbook != null) {
            _Playbook_ProtoDecoder.LJ(playbook);
        }
    }

    @Override // X.C0IMD
    public final PlaybookPublishResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PlaybookPublishResponse.ResponseData responseData = new PlaybookPublishResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.playbook = _Playbook_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlaybookPublishResponse.ResponseData responseData, List list) {
    }
}
