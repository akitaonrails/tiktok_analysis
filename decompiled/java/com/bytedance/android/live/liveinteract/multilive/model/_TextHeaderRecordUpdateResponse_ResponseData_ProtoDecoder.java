package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderRecordUpdateResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play._TextHeaderRecordInfo_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _TextHeaderRecordUpdateResponse_ResponseData_ProtoDecoder implements C0IMD<TextHeaderRecordUpdateResponse.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(TextHeaderRecordUpdateResponse.ResponseData responseData) {
    }

    @Override // X.C0IMD
    public final TextHeaderRecordUpdateResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        TextHeaderRecordUpdateResponse.ResponseData responseData = new TextHeaderRecordUpdateResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        responseData.success = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    responseData.textHeaderRecordInfo = _TextHeaderRecordInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TextHeaderRecordUpdateResponse.ResponseData responseData, List list) {
    }
}
