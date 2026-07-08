package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _RoomHostMultiGuestPermissionInfo_ProtoDecoder implements C0IMD<RoomHostMultiGuestPermissionInfo> {
    public static RoomHostMultiGuestPermissionInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        RoomHostMultiGuestPermissionInfo roomHostMultiGuestPermissionInfo = new RoomHostMultiGuestPermissionInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        roomHostMultiGuestPermissionInfo.permissionInfo = _MultiGuestPermissionInfo_ProtoDecoder.LIZLLL(c1516680pZS);
                    }
                } else {
                    roomHostMultiGuestPermissionInfo.roomPackSuccessFlag = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return roomHostMultiGuestPermissionInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(RoomHostMultiGuestPermissionInfo roomHostMultiGuestPermissionInfo) {
    }

    @Override // X.C0IMD
    public final RoomHostMultiGuestPermissionInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, RoomHostMultiGuestPermissionInfo roomHostMultiGuestPermissionInfo, List list) {
    }
}
