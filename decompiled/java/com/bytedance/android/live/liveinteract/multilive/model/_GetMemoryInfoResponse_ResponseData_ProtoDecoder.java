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
public final class _GetMemoryInfoResponse_ResponseData_ProtoDecoder implements C0IMD<GetMemoryInfoResponse.ResponseData> {
    public static GetMemoryInfoResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GetMemoryInfoResponse.ResponseData responseData = new GetMemoryInfoResponse.ResponseData();
        responseData.failedMemoryMap = new HashMap();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        long jLIZJ2 = c1516680pZS.LIZJ();
                        String strLIZLLL = null;
                        String strLIZLLL2 = null;
                        while (true) {
                            int iLJI2 = c1516680pZS.LJI();
                            if (iLJI2 == -1) {
                                break;
                            }
                            if (iLJI2 != 1) {
                                if (iLJI2 == 2) {
                                    strLIZLLL2 = C1516700pZU.LIZLLL(c1516680pZS);
                                }
                            } else {
                                strLIZLLL = C1516700pZU.LIZLLL(c1516680pZS);
                            }
                        }
                        c1516680pZS.LJ(jLIZJ2);
                        if (strLIZLLL != null) {
                            if (strLIZLLL2 != null) {
                                responseData.failedMemoryMap.put(strLIZLLL, strLIZLLL2);
                            } else {
                                throw new IllegalStateException("Map value must not be null!");
                            }
                        } else {
                            throw new IllegalStateException("Map key must not be null!");
                        }
                    }
                } else {
                    responseData.memoryInfo = _GetMemoryInfoResponse_ResponseData_MemoryInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GetMemoryInfoResponse.ResponseData responseData) {
        TextHeaderPlayContent textHeaderPlayContent;
        GetMemoryInfoResponse.ResponseData responseData2 = responseData;
        GetMemoryInfoResponse.ResponseData.MemoryInfo memoryInfo = responseData2.memoryInfo;
        if (memoryInfo != null && (textHeaderPlayContent = memoryInfo.textHeader) != null) {
            _TextHeaderPlayContent_ProtoDecoder.LJ(textHeaderPlayContent);
        }
        if (responseData2.failedMemoryMap == null) {
            responseData2.failedMemoryMap = new HashMap();
        }
    }

    @Override // X.C0IMD
    public final GetMemoryInfoResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetMemoryInfoResponse.ResponseData responseData, List list) {
    }
}
