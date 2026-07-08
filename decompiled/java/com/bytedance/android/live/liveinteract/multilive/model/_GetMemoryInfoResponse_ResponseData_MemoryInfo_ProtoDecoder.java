package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.GetMemoryInfoResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play.TextHeaderPlayContent;
import webcast.data.multi_guest_play._TextHeaderPlayContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _GetMemoryInfoResponse_ResponseData_MemoryInfo_ProtoDecoder implements C0IMD<GetMemoryInfoResponse.ResponseData.MemoryInfo> {
    public static GetMemoryInfoResponse.ResponseData.MemoryInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GetMemoryInfoResponse.ResponseData.MemoryInfo memoryInfo = new GetMemoryInfoResponse.ResponseData.MemoryInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    memoryInfo.textHeader = _TextHeaderPlayContent_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return memoryInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GetMemoryInfoResponse.ResponseData.MemoryInfo memoryInfo) {
        TextHeaderPlayContent textHeaderPlayContent = memoryInfo.textHeader;
        if (textHeaderPlayContent != null) {
            _TextHeaderPlayContent_ProtoDecoder.LJ(textHeaderPlayContent);
        }
    }

    @Override // X.C0IMD
    public final GetMemoryInfoResponse.ResponseData.MemoryInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetMemoryInfoResponse.ResponseData.MemoryInfo memoryInfo, List list) {
    }
}
