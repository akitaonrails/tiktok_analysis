package com.bytedance.android.live.broadcast.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _PermissionLevelInfo_ProtoDecoder implements C0IMD<PermissionLevelInfo> {
    public static PermissionLevelInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PermissionLevelInfo permissionLevelInfo = new PermissionLevelInfo();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                permissionLevelInfo.cppVersion = c1516680pZS.LJIIJ();
                            }
                        } else {
                            permissionLevelInfo.abnormal = C1516700pZU.LIZ(c1516680pZS);
                        }
                    } else {
                        permissionLevelInfo.permissionLevel = c1516680pZS.LJIIJ();
                    }
                } else {
                    permissionLevelInfo.notFinishTaskNum = c1516680pZS.LJIIJ();
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return permissionLevelInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final PermissionLevelInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PermissionLevelInfo permissionLevelInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PermissionLevelInfo permissionLevelInfo, List list) {
    }
}
