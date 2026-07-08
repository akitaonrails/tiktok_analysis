package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderEndResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play.TextHeaderPlayContent;
import webcast.data.multi_guest_play._TextHeaderPlayContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _TextHeaderEndResponse_ResponseData_ProtoDecoder implements C0IMD<TextHeaderEndResponse.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(TextHeaderEndResponse.ResponseData responseData) {
        TextHeaderPlayContent textHeaderPlayContent = responseData.textHeaderContent;
        if (textHeaderPlayContent != null) {
            _TextHeaderPlayContent_ProtoDecoder.LJ(textHeaderPlayContent);
        }
    }

    @Override // X.C0IMD
    public final TextHeaderEndResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        TextHeaderEndResponse.ResponseData responseData = new TextHeaderEndResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        responseData.textHeaderContent = _TextHeaderPlayContent_ProtoDecoder.LIZLLL(c1516680pZS);
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
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TextHeaderEndResponse.ResponseData responseData, List list) {
    }
}
