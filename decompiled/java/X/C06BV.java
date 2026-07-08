package X;

import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakExtension;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;

/* JADX INFO: renamed from: X.06BV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06BV {
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZ(X.C06BK r5) {
        /*
            X.06BT r0 = r5.LIZIZ
            int[] r1 = X.C06BU.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            r3 = 95
            if (r1 == r0) goto L7e
            r0 = 2
            if (r1 == r0) goto L19
            X.06BT r0 = X.C06BT.UNKNOWN
            java.lang.String r0 = r0.getValue()
            return r0
        L19:
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            com.ss.android.ugc.aweme.im.streak.api.StreakData r4 = r5.LIZJ
            X.0I0B r1 = X.C0I0B.LJFF
            r1.LIZJ()
            boolean r0 = X.C894660Z7w.LIZLLL()
            if (r0 != 0) goto L60
            r1.LIZJ()
            boolean r0 = X.C894660Z7w.LJ()
            if (r0 != 0) goto L60
            r1 = 200(0xc8, float:2.8E-43)
        L35:
            int r0 = r4.streak
            if (r0 >= r1) goto L3d
            int r0 = X.C1567806Bw.LJII(r4)
        L3d:
            r2.append(r0)
            r2.append(r3)
            X.06FO r1 = X.C06FO.LIZ
            com.ss.android.ugc.aweme.im.streak.api.StreakData r0 = r5.LIZJ
            r1.getClass()
            long r0 = r0.endAt
            r2.append(r0)
            r2.append(r3)
            X.06BT r0 = r5.LIZIZ
            java.lang.String r0 = r0.getValue()
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            return r0
        L60:
            X.06Pq r0 = X.C1603606Pq.LIZ
            if (r0 == 0) goto L7b
            com.ss.android.ugc.aweme.im.common.setting.StreakMilestoneUnlockAnimationConfig r0 = X.C1603606Pq.LIZ()
            if (r0 == 0) goto L7b
            java.util.List<java.lang.Integer> r0 = r0.fakeMilestoneLevelArray
            if (r0 == 0) goto L7b
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L7b
            int r1 = r0.intValue()
            goto L35
        L7b:
            r1 = 13
            goto L35
        L7e:
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            com.ss.android.ugc.aweme.im.streak.api.StreakData r0 = r5.LIZJ
            int r0 = r0.streak
            r2.append(r0)
            r2.append(r3)
            X.06FO r1 = X.C06FO.LIZ
            com.ss.android.ugc.aweme.im.streak.api.StreakData r0 = r5.LIZJ
            r1.getClass()
            long r0 = r0.endAt
            r2.append(r0)
            r2.append(r3)
            X.06BT r0 = r5.LIZIZ
            java.lang.String r0 = r0.getValue()
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06BV.LIZ(X.06BK):java.lang.String");
    }

    public static final boolean LIZIZ(StreakData streakData, StreakPetData streakPetData, String str) {
        StreakExtension streakExtensionLIZ;
        if (streakData != null && (C1567806Bw.LIZLLL(streakData) || C1567806Bw.LJ(streakData))) {
            if (streakPetData != null && streakPetData.status == C06G0.StreakPetStatus_Active.getValue() && !streakPetData.isHidden) {
                return true;
            }
            return false;
        }
        if (streakPetData != null && C1571306Df.LJI(streakPetData)) {
            if (!streakPetData.isEggHidden) {
                IMContactApi.LIZ.getClass();
                IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(String.valueOf(C0YNP.LJII(streakPetData.conversationId)), null, "im_local_db");
                if (iMUserLJIIL == null || iMUserLJIIL.getFollowStatus() == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        if (str != null && (streakExtensionLIZ = C06HT.LIZ(str)) != null && streakExtensionLIZ.shouldDisplayPromotionalWidget) {
            return true;
        }
        return false;
    }
}
