package com.bytedance.android.live.liveinteract.multilive.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _MultiGuestPermissionInfo_ProtoDecoder implements C0IMD<MultiGuestPermissionInfo> {
    public static MultiGuestPermissionInfo LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        MultiGuestPermissionInfo multiGuestPermissionInfo = new MultiGuestPermissionInfo();
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
                                multiGuestPermissionInfo.linkPermissionType = Long.valueOf(c1516680pZS.LJIIJJI());
                            }
                        } else {
                            multiGuestPermissionInfo.noPermissionPrompt = C1516700pZU.LIZLLL(c1516680pZS);
                        }
                    } else {
                        multiGuestPermissionInfo.errCode = c1516680pZS.LJIIJJI();
                    }
                } else {
                    multiGuestPermissionInfo.flag = C1516700pZU.LIZ(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return multiGuestPermissionInfo;
            }
        }
    }

    @Override // X.C0IMD
    public final MultiGuestPermissionInfo LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(MultiGuestPermissionInfo multiGuestPermissionInfo) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, MultiGuestPermissionInfo multiGuestPermissionInfo, List list) {
    }
}
