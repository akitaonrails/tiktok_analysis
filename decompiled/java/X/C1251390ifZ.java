package X;

import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ifZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1251390ifZ {
    public static volatile C1153080g70 LIZIZ;
    public static boolean LIZLLL;
    public static final C1251390ifZ LIZ = new C1251390ifZ();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(587));

    public static C1153080g70 LIZ() {
        if (LIZLLL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getMineSnapshot isSwitchAccount true, get cacheAb: ");
            C1153080g70 c1153080g70 = LIZIZ;
            sbLIZ.append(c1153080g70 != null ? Integer.valueOf(c1153080g70.LIZIZ) : null);
            C1720106oR.LJI("ProfileBackgroundExp", C2188811AlT.LIZIZ(sbLIZ));
            return LIZIZ;
        }
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        C1153080g70 c1153080g702 = LIZIZ;
        if (c1153080g702 != null && Intrinsics.LJFF(c1153080g702.LIZ, curUserId)) {
            return c1153080g702;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getMineSnapshot currentUid: ");
        sbLIZ2.append(curUserId);
        sbLIZ2.append(", currentSna: ");
        sbLIZ2.append(c1153080g702 != null ? c1153080g702.LIZ : null);
        sbLIZ2.append(", value: ");
        sbLIZ2.append(c1153080g702 != null ? Integer.valueOf(c1153080g702.LIZIZ) : null);
        C1720106oR.LJI("ProfileBackgroundExp", C2188811AlT.LIZIZ(sbLIZ2));
        int iLJIJ = curUserId != null ? C0C64.LJIILLIIL().LJIJ(31744, 0, "profile_bg_in_allow_list", false) : 0;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("ProfileBackgroundExp", "createSnapshot uid: " + curUserId + ", abValue: " + iLJIJ);
        C1153080g70 c1153080g703 = new C1153080g70(curUserId, iLJIJ);
        LIZIZ = c1153080g703;
        return c1153080g703;
    }

    public static boolean LIZIZ(boolean z) {
        boolean z2;
        C1153080g70 c1153080g70LIZ = LIZ();
        if (c1153080g70LIZ != null && c1153080g70LIZ.LIZIZ == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (!C268330AfP.LIZLLL() || !z2) {
                return false;
            }
        } else {
            if (C268330AfP.LIZLLL()) {
                if (z2 || C1251450iff.LIZ.getValue().intValue() != 1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static void LIZJ(boolean z) {
        if (LIZLLL != z) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateSwitchAccount isSwitchAccount: ");
            sbLIZ.append(z);
            sbLIZ.append(", this.isSwitchAccount: ");
            sbLIZ.append(LIZLLL);
            C1720106oR.LJI("ProfileBackgroundExp", C2188811AlT.LIZIZ(sbLIZ));
            LIZLLL = z;
        }
    }
}
