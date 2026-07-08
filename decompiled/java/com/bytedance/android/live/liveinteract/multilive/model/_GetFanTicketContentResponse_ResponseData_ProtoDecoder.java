package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.GetFanTicketContentResponse;
import com.bytedance.android.livesdk.model.message.FanTicketRoomNoticeContent;
import com.bytedance.android.livesdk.model.message.LinkMicFanTicketMethod;
import com.bytedance.android.livesdk.model.message._FanTicketRoomNoticeContent_ProtoDecoder;
import com.bytedance.android.livesdk.model.message._LinkMicFanTicketMethod_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _GetFanTicketContentResponse_ResponseData_ProtoDecoder implements C0IMD<GetFanTicketContentResponse.ResponseData> {
    public static GetFanTicketContentResponse.ResponseData LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        GetFanTicketContentResponse.ResponseData responseData = new GetFanTicketContentResponse.ResponseData();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    responseData.fanTicketMethod = _LinkMicFanTicketMethod_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return responseData;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(GetFanTicketContentResponse.ResponseData responseData) {
        LinkMicFanTicketMethod linkMicFanTicketMethod = responseData.fanTicketMethod;
        if (linkMicFanTicketMethod != null) {
            CommonMessageData commonMessageData = linkMicFanTicketMethod.baseMessage;
            if (commonMessageData != null) {
                _CommonMessageData_ProtoDecoder.LJ(commonMessageData);
            }
            FanTicketRoomNoticeContent fanTicketRoomNoticeContent = linkMicFanTicketMethod.fanTicketRoomNotice;
            if (fanTicketRoomNoticeContent != null) {
                _FanTicketRoomNoticeContent_ProtoDecoder.LJ(fanTicketRoomNoticeContent);
            }
        }
    }

    @Override // X.C0IMD
    public final GetFanTicketContentResponse.ResponseData LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, GetFanTicketContentResponse.ResponseData responseData, List list) {
    }
}
