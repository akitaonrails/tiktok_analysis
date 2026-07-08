package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookUnpublishResponse;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PlaybookUnpublishResponse_ResponseData_ProtoDecoder implements C0IMD<PlaybookUnpublishResponse.ResponseData> {
    @Override // X.C0IMD
    public final PlaybookUnpublishResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        PlaybookUnpublishResponse.ResponseData responseData = new PlaybookUnpublishResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (c1516680pZS.LJI() != -1) {
            C1516700pZU.LJ(c1516680pZS);
        }
        c1516680pZS.LJ(jLIZJ);
        return responseData;
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PlaybookUnpublishResponse.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PlaybookUnpublishResponse.ResponseData responseData, List list) {
    }
}
