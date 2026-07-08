package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.TextHeaderCreateResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play.TextHeaderPlayContent;
import webcast.data.multi_guest_play._TextHeaderPlayContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _TextHeaderCreateResponse_ResponseData_ProtoDecoder implements C0IMD<TextHeaderCreateResponse.ResponseData> {
    @Override // X.C0IMD
    public final void LIZ(TextHeaderCreateResponse.ResponseData responseData) {
        TextHeaderPlayContent textHeaderPlayContent = responseData.textHeaderContent;
        if (textHeaderPlayContent != null) {
            _TextHeaderPlayContent_ProtoDecoder.LJ(textHeaderPlayContent);
        }
    }

    @Override // X.C0IMD
    public final TextHeaderCreateResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) throws IOException {
        TextHeaderCreateResponse.ResponseData responseData = new TextHeaderCreateResponse.ResponseData();
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
                    responseData.isExists = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TextHeaderCreateResponse.ResponseData responseData, List list) {
    }
}
