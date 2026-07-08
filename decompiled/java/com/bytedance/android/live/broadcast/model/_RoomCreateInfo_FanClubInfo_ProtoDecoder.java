package com.bytedance.android.live.broadcast.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomCreateInfo_FanClubInfo_ProtoDecoder implements C0IMD<RoomCreateInfo.FanClubInfo> {
    public static RoomCreateInfo.FanClubInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomCreateInfo.FanClubInfo fanClubInfo = new RoomCreateInfo.FanClubInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    C1516700pZU.LJ(c1516680pZS);
                } else {
                    fanClubInfo.fanClubPermission = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return fanClubInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final RoomCreateInfo.FanClubInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(RoomCreateInfo.FanClubInfo fanClubInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomCreateInfo.FanClubInfo fanClubInfo, List list) {
    }
}
