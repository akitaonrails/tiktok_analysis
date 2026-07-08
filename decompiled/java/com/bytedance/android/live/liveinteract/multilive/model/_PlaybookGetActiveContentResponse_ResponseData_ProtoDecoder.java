package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookGetActiveContentResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play._ActivePlaybook_ProtoDecoder;
import webcast.data.multi_guest_play._Playbook_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _PlaybookGetActiveContentResponse_ResponseData_ProtoDecoder implements C0IMD<PlaybookGetActiveContentResponse.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(PlaybookGetActiveContentResponse.ResponseData responseData) {
        Playbook playbook;
        ActivePlaybook activePlaybook = responseData.activePlaybook;
        if (activePlaybook != null && (playbook = activePlaybook.playbook) != null) {
            _Playbook_ProtoDecoder.LJ(playbook);
        }
    }

    @Override // X.C0IMD
    public final PlaybookGetActiveContentResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PlaybookGetActiveContentResponse.ResponseData responseData = new PlaybookGetActiveContentResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.activePlaybook = _ActivePlaybook_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlaybookGetActiveContentResponse.ResponseData responseData, List list) {
    }
}
