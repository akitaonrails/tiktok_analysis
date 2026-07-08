package X;

import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetTaskData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06E4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06E4 {
    public static final C06E4 LIZ = new C06E4();
    public static final ConcurrentHashMap<String, String> LIZIZ = new ConcurrentHashMap<>();

    public static Map LIZIZ(StreakPetData streakPetData) {
        Pair[] pairArr = new Pair[16];
        pairArr[0] = new Pair("conversationId", streakPetData.conversationId);
        pairArr[1] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(streakPetData.status));
        pairArr[2] = new Pair("inviterUid", Long.valueOf(streakPetData.inviterUid));
        pairArr[3] = new Pair("experiencePoints", Integer.valueOf(streakPetData.experiencePoints));
        pairArr[4] = new Pair("expForLevel", streakPetData.expForLevel);
        pairArr[5] = new Pair("name", streakPetData.name);
        Map<String, StreakPetTaskData> map = streakPetData.tasks;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object key = entry.getKey();
            StreakPetTaskData streakPetTaskData = (StreakPetTaskData) entry.getValue();
            LIZ.getClass();
            linkedHashMap.put(key, C2097608Jq.LJIIIIZZ(new Pair("description", streakPetTaskData.description), new Pair("rewardPoints", Integer.valueOf(streakPetTaskData.rewardPoints)), new Pair("completed", Boolean.valueOf(streakPetTaskData.completed))));
        }
        pairArr[6] = new Pair("tasks", linkedHashMap);
        pairArr[7] = new Pair("isHidden", Boolean.valueOf(streakPetData.isHidden));
        pairArr[8] = new Pair("streakPetAnimState", streakPetData.streakPetAnimState);
        pairArr[9] = new Pair("createTime", Long.valueOf(streakPetData.createTime));
        pairArr[10] = new Pair("hatchingTimestamp", Long.valueOf(streakPetData.hatchingTimestampInSeconds));
        pairArr[11] = new Pair("subStatus", Integer.valueOf(streakPetData.subStatus));
        pairArr[12] = new Pair("isEggHidden", Boolean.valueOf(streakPetData.isEggHidden));
        pairArr[13] = new Pair("feCommonData", streakPetData.feCommonData);
        pairArr[14] = new Pair("feExtraData", streakPetData.feExtraData);
        pairArr[15] = new Pair("serverDataVersion", streakPetData.serverDataVersion);
        return C2097608Jq.LJIIIIZZ(pairArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01d9 A[PHI: r15
      0x01d9: PHI (r15v2 X.06Gb) = (r15v0 X.06Gb), (r15v3 X.06Gb) binds: [B:9:0x0028, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.lang.String r18, X.C06BD r19, com.ss.android.ugc.aweme.im.streak.api.StreakData r20, com.ss.android.ugc.aweme.im.streak.api.StreakData r21) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06E4.LIZ(java.lang.String, X.06BD, com.ss.android.ugc.aweme.im.streak.api.StreakData, com.ss.android.ugc.aweme.im.streak.api.StreakData):void");
    }
}
