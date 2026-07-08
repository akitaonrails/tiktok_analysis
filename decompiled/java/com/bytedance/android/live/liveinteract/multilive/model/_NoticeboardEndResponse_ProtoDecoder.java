package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardEndResponse;
import java.io.IOException;
import java.util.List;
import webcast.data.multi_guest_play.NoticeboardContent;
import webcast.data.multi_guest_play._NoticeboardContent_ProtoDecoder;

/* JADX INFO: loaded from: classes.dex */
public final class _NoticeboardEndResponse_ProtoDecoder implements C0IMD<NoticeboardEndResponse> {
    @Override // X.C0IMD
    public final void LIZ(NoticeboardEndResponse noticeboardEndResponse) {
        NoticeboardContent noticeboardContent;
        NoticeboardEndResponse.ResponseData responseData = noticeboardEndResponse.data;
        if (responseData != null && (noticeboardContent = responseData.noticeboardContent) != null) {
            _NoticeboardContent_ProtoDecoder.LJ(noticeboardContent);
        }
    }

    @Override // X.C0IMD
    public final NoticeboardEndResponse LIZJ(C1516680pZS c1516680pZS) throws IOException {
        NoticeboardEndResponse noticeboardEndResponse = new NoticeboardEndResponse();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    noticeboardEndResponse.data = _NoticeboardEndResponse_ResponseData_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return noticeboardEndResponse;
            }
        }
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, NoticeboardEndResponse noticeboardEndResponse, List list) {
    }
}
