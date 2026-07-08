package com.bytedance.android.live.base.model.user;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class _PrivilegeLogExtra_ProtoDecoder implements C0IMD<PrivilegeLogExtra> {
    public static PrivilegeLogExtra LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        PrivilegeLogExtra privilegeLogExtra = new PrivilegeLogExtra();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                switch (iLJI) {
                    case 1:
                        privilegeLogExtra.data_version = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 2:
                        privilegeLogExtra.privilege_id = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 3:
                        privilegeLogExtra.privilege_version = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 4:
                        privilegeLogExtra.privilege_order_id = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 5:
                        privilegeLogExtra.level = C1516700pZU.LIZLLL(c1516680pZS);
                        break;
                    case 6:
                        privilegeLogExtra.startTime = c1516680pZS.LJIIJJI();
                        break;
                    case 7:
                        privilegeLogExtra.endTime = c1516680pZS.LJIIJJI();
                        break;
                    default:
                        C1516700pZU.LJ(c1516680pZS);
                        break;
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return privilegeLogExtra;
            }
        }
    }

    @Override // X.C0IMD
    public final PrivilegeLogExtra LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZ(PrivilegeLogExtra privilegeLogExtra) {
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, PrivilegeLogExtra privilegeLogExtra, List list) {
    }
}
