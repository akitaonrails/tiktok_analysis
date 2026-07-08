package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _PrivilegeLogExtra_ProtoEncoder implements InterfaceC1132110fZB<PrivilegeLogExtra> {
    public static int LIZLLL(PrivilegeLogExtra privilegeLogExtra) {
        if (privilegeLogExtra == null) {
            return 0;
        }
        return C1142340fpg.LJIILL(1, privilegeLogExtra.data_version) + C1142340fpg.LJIILL(2, privilegeLogExtra.privilege_id) + C1142340fpg.LJIILL(3, privilegeLogExtra.privilege_version) + C1142340fpg.LJIILL(4, privilegeLogExtra.privilege_order_id) + C1142340fpg.LJIILL(5, privilegeLogExtra.level) + C1142340fpg.LJIIL(6, privilegeLogExtra.startTime) + C1142340fpg.LJIIL(7, privilegeLogExtra.endTime);
    }

    public static void LIZIZ(C1142350fph c1142350fph, PrivilegeLogExtra privilegeLogExtra) {
        C1142340fpg.LJFF(c1142350fph, 1, privilegeLogExtra.data_version);
        C1142340fpg.LJFF(c1142350fph, 2, privilegeLogExtra.privilege_id);
        C1142340fpg.LJFF(c1142350fph, 3, privilegeLogExtra.privilege_version);
        C1142340fpg.LJFF(c1142350fph, 4, privilegeLogExtra.privilege_order_id);
        C1142340fpg.LJFF(c1142350fph, 5, privilegeLogExtra.level);
        long j = privilegeLogExtra.startTime;
        c1142350fph.LIZLLL(6, 0);
        c1142350fph.LJFF(j);
        long j2 = privilegeLogExtra.endTime;
        c1142350fph.LIZLLL(7, 0);
        c1142350fph.LJFF(j2);
    }

    public static int LJ(int i, PrivilegeLogExtra privilegeLogExtra) {
        if (privilegeLogExtra == null) {
            return 0;
        }
        int iLIZLLL = LIZLLL(privilegeLogExtra);
        return iLIZLLL + C1142350fph.LIZIZ(iLIZLLL) + C1142350fph.LIZ(i);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, PrivilegeLogExtra privilegeLogExtra) {
        LIZIZ(c1142350fph, privilegeLogExtra);
    }

    public static void LIZJ(C1142350fph c1142350fph, int i, PrivilegeLogExtra privilegeLogExtra) {
        if (privilegeLogExtra == null) {
            return;
        }
        c1142350fph.LIZLLL(i, 2);
        c1142350fph.LJ(LIZLLL(privilegeLogExtra));
        LIZIZ(c1142350fph, privilegeLogExtra);
    }
}
