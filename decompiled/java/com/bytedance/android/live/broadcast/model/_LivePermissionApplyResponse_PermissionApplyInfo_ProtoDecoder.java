package com.bytedance.android.live.broadcast.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.broadcast.model.LivePermissionApplyResponse;
import com.tts.oecverify.BdTuring;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class _LivePermissionApplyResponse_PermissionApplyInfo_ProtoDecoder implements C0IMD<LivePermissionApplyResponse.PermissionApplyInfo> {
    public static LivePermissionApplyResponse.PermissionApplyInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo = new LivePermissionApplyResponse.PermissionApplyInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        permissionApplyInfo.mAnchorFansNum = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 2:
                        permissionApplyInfo.mForbiddenApplyCountdown = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 3:
                        permissionApplyInfo.mApplyNeedFansNum = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 4:
                        permissionApplyInfo.mTargetLiveTime = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 5:
                        permissionApplyInfo.mForbiddenApplyDays = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 6:
                        permissionApplyInfo.mApplyInvalidTime = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        permissionApplyInfo.mNeedLiveTime = (int) c1516680pZS.LJIIJJI();
                        break;
                    case 8:
                        permissionApplyInfo.mApplyStatus = (int) c1516680pZS.LJIIJJI();
                        break;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        permissionApplyInfo.mApplySource = c1516680pZS.LJIIJ();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return permissionApplyInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final LivePermissionApplyResponse.PermissionApplyInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, LivePermissionApplyResponse.PermissionApplyInfo permissionApplyInfo, List list) {
    }
}
