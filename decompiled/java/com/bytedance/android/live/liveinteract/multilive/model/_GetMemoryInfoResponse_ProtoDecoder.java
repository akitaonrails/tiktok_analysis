package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.GetMemoryInfoResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import webcast.data.multi_guest_play.TextHeaderPlayContent;
import webcast.data.multi_guest_play._TextHeaderPlayContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _GetMemoryInfoResponse_ProtoDecoder implements C0IMD<GetMemoryInfoResponse> {
    @Override // X.C0IMD
    public final void LIZ(GetMemoryInfoResponse getMemoryInfoResponse) {
        TextHeaderPlayContent textHeaderPlayContent;
        GetMemoryInfoResponse.ResponseData responseData = getMemoryInfoResponse.data;
        if (responseData != null) {
            GetMemoryInfoResponse.ResponseData.MemoryInfo memoryInfo = responseData.memoryInfo;
            if (memoryInfo != null && (textHeaderPlayContent = memoryInfo.textHeader) != null) {
                _TextHeaderPlayContent_ProtoDecoder.LJ(textHeaderPlayContent);
            }
            if (responseData.failedMemoryMap == null) {
                responseData.failedMemoryMap = new HashMap();
            }
        }
    }

    @Override // X.C0IMD
    public final GetMemoryInfoResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        GetMemoryInfoResponse getMemoryInfoResponse = new GetMemoryInfoResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    getMemoryInfoResponse.data = _GetMemoryInfoResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return getMemoryInfoResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetMemoryInfoResponse getMemoryInfoResponse, List list) {
    }
}
