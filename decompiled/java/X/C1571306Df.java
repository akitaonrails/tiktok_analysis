package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.model.UserInteractionRecord;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetTaskData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetTaskValue;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetValue;
import com.ss.android.ugc.aweme.im.streak.impl.pet.datasource.StreakPetDataWrapper;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* JADX INFO: renamed from: X.06Df, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1571306Df {
    public static final int LIZ(StreakPetData streakPetData) {
        int iNextIndex;
        List<Integer> list = streakPetData.expForLevel;
        ListIterator<Integer> listIterator = list.listIterator(list.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (streakPetData.experiencePoints >= listIterator.previous().intValue()) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            } else {
                iNextIndex = -1;
                break;
            }
        }
        return iNextIndex + 1;
    }

    public static final String LIZIZ(String str) {
        String curUserId = C0I0B.LJFF.LIZ().getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(':');
        sbLIZ.append(curUserId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final boolean LIZLLL(StreakPetData streakPetData) {
        if (streakPetData.status == C06G0.StreakPetStatus_Active.getValue()) {
            return true;
        }
        return false;
    }

    public static final boolean LJ(StreakPetData streakPetData) {
        if (streakPetData != null) {
            if (LJIIIIZZ(streakPetData) || LJI(streakPetData)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJI(StreakPetData streakPetData) {
        C1575806Ey c1575806Ey = C1575806Ey.LIZJ;
        String str = streakPetData.conversationId;
        c1575806Ey.getClass();
        StreakData streakDataLJIIIIZZ = C1575806Ey.LJIIIIZZ(str);
        if (C1567806Bw.LIZLLL(streakDataLJIIIIZZ) || ((streakDataLJIIIIZZ != null && C1567806Bw.LJ(streakDataLJIIIIZZ)) || streakPetData.status != C06G0.StreakPetStatus_Active.getValue() || ((streakPetData.subStatus != EnumC1571406Dg.StreakPetSubStatus_Hatching1.getValue() && streakPetData.subStatus != EnumC1571406Dg.StreakPetSubStatus_Hatching2.getValue()) || LJFF(streakPetData, streakDataLJIIIIZZ)))) {
            return false;
        }
        return true;
    }

    public static final boolean LJII(StreakPetData streakPetData) {
        if (streakPetData.status == C06G0.StreakPetStatus_Invited.getValue()) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIIIZZ(StreakPetData streakPetData) {
        C1575806Ey c1575806Ey = C1575806Ey.LIZJ;
        String str = streakPetData.conversationId;
        c1575806Ey.getClass();
        StreakData streakDataLJIIIIZZ = C1575806Ey.LJIIIIZZ(str);
        if (streakDataLJIIIIZZ == null || !C1567806Bw.LIZLLL(streakDataLJIIIIZZ) || streakPetData.status != C06G0.StreakPetStatus_Active.getValue()) {
            return false;
        }
        return true;
    }

    public static final StreakPetDataWrapper LJIIJJI(UserInteractionRecord userInteractionRecord) {
        Object c098200Yq;
        Object obj = null;
        if (userInteractionRecord == null) {
            return null;
        }
        try {
            c098200Yq = (StreakPetDataWrapper) C051M.LIZIZ(StreakPetDataWrapper.class, userInteractionRecord.data);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (StreakPetDataWrapper) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f A[PHI: r6
      0x002f: PHI (r6v1 com.ss.android.ugc.aweme.im.streak.api.StreakData) = (r6v0 com.ss.android.ugc.aweme.im.streak.api.StreakData), (r6v2 com.ss.android.ugc.aweme.im.streak.api.StreakData) binds: [B:2:0x0000, B:4:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJFF(com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData r5, com.ss.android.ugc.aweme.im.streak.api.StreakData r6) {
        /*
            if (r6 != 0) goto L2f
            X.06Ey r1 = X.C1575806Ey.LIZJ
            java.lang.String r0 = r5.conversationId
            r1.getClass()
            com.ss.android.ugc.aweme.im.streak.api.StreakData r6 = X.C1575806Ey.LJIIIIZZ(r0)
            if (r6 != 0) goto L2f
            r3 = 0
        L11:
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r3 = r3 / r0
            int r1 = r5.status
            X.06G0 r0 = X.C06G0.StreakPetStatus_Active
            int r0 = r0.getValue()
            if (r1 != r0) goto L34
            long r1 = X.C1567806Bw.LJI()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L34
            long r1 = r5.hatchingTimestampInSeconds
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L34
            r0 = 1
            return r0
        L2f:
            long r3 = X.C1567806Bw.LIZ(r6)
            goto L11
        L34:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1571306Df.LJFF(com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData, com.ss.android.ugc.aweme.im.streak.api.StreakData):boolean");
    }

    public static final long LIZJ(int i, int i2, long j) {
        Calendar calendar = Calendar.getInstance();
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        calendar.setTimeInMillis(j * j2);
        if (i2 != 5) {
            if (i2 != 10) {
                if (i2 != 12) {
                    if (i2 == 13) {
                        calendar.add(13, i);
                    }
                } else {
                    calendar.set(13, 0);
                    calendar.add(12, i);
                }
            } else {
                calendar.set(13, 0);
                calendar.set(12, 0);
                calendar.add(11, i);
            }
        } else {
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.add(5, i);
        }
        return calendar.getTimeInMillis() / j2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static final StreakPetData LJIIIZ(StreakPetValue streakPetValue, String str, long j) {
        long jLongValue;
        int iIntValue;
        ?? LJ;
        if (streakPetValue == null) {
            return new StreakPetData(str, 0, C06G0.StreakPetStatus_Inactive.getValue(), 0L, 0, null, null, null, false, null, j, 0L, 0, false, null, null, null, null, null, 523258, null);
        }
        String str2 = streakPetValue.conversationId;
        int value = C1567806Bw.LIZJ(str).getValue();
        int i = streakPetValue.status;
        Long l = streakPetValue.inviterUid;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        Integer num = streakPetValue.experiencePoints;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        List list = streakPetValue.expForLevel;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        String str3 = streakPetValue.name;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        Map<String, StreakPetTaskValue> map = streakPetValue.tasks;
        if (map != null) {
            LJ = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                Object key = entry.getKey();
                StreakPetTaskValue streakPetTaskValue = (StreakPetTaskValue) entry.getValue();
                LJ.put(key, new StreakPetTaskData(streakPetTaskValue.description, streakPetTaskValue.rewordPoints, streakPetTaskValue.completed));
            }
        } else {
            LJ = C2097608Jq.LJ();
        }
        long j2 = streakPetValue.hatchingTimestamp;
        int i2 = streakPetValue.subStatus;
        String str5 = streakPetValue.feCommonData;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = streakPetValue.feExtraData;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = streakPetValue.serverDataVersion;
        if (str7 != null) {
            str4 = str7;
        }
        return new StreakPetData(str2, value, i, jLongValue, iIntValue, list, str3, LJ, false, null, j, j2, i2, false, str5, str6, str4, "", C2097608Jq.LJ(), 512, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0079 A[PHI: r3
      0x0079: PHI (r3v8 java.lang.String) = (r3v3 java.lang.String), (r3v9 java.lang.String) binds: [B:16:0x0077, B:14:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090 A[PHI: r3
      0x0090: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v8 java.lang.String) binds: [B:16:0x0077, B:18:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094 A[PHI: r1 r3
      0x0094: PHI (r1v6 int) = (r1v5 int), (r1v8 int) binds: [B:25:0x0091, B:21:0x0083] A[DONT_GENERATE, DONT_INLINE]
      0x0094: PHI (r3v5 java.lang.String) = (r3v4 java.lang.String), (r3v7 java.lang.String) binds: [B:25:0x0091, B:21:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData LJIIJ(X.C2239531Cl5 r29, java.lang.String r30, long r31) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1571306Df.LJIIJ(X.1Cl5, java.lang.String, long):com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData");
    }
}
