package com.bytedance.android.live.broadcast.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBIndustryVerificationInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo;
import com.bytedance.android.livesdk.chatroom.api._SMBVerificationInfo_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomCreateInfo_SMBVerification_ProtoDecoder implements C0IMD<RoomCreateInfo.SMBVerification> {
    public static RoomCreateInfo.SMBVerification LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomCreateInfo.SMBVerification sMBVerification = new RoomCreateInfo.SMBVerification();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        sMBVerification.showNotice = C1516700pZU.LIZ(c1516680pZS);
                    }
                } else {
                    sMBVerification.verificationInfo = _SMBVerificationInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return sMBVerification;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RoomCreateInfo.SMBVerification sMBVerification) {
        SMBIndustryVerificationInfo sMBIndustryVerificationInfo;
        SMBVerificationInfo sMBVerificationInfo = sMBVerification.verificationInfo;
        if (sMBVerificationInfo != null && (sMBIndustryVerificationInfo = sMBVerificationInfo.industryVerificationInfo) != null && sMBIndustryVerificationInfo.blockedReasons == null) {
            sMBIndustryVerificationInfo.blockedReasons = new ArrayList();
        }
    }

    @Override // X.C0IMD
    public final RoomCreateInfo.SMBVerification LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomCreateInfo.SMBVerification sMBVerification, List list) {
    }
}
