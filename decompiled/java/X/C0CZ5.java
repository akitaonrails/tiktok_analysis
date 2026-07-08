package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.mention.model.MentionCheckResult;
import com.ss.android.ugc.aweme.mention.model.MentionCheckSingleTypeResult;
import com.ss.android.ugc.aweme.mention.model.MentionGeneralCheckResponse;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0CZ5, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CZ5 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2339));

    public static Keva LIZ() {
        String strLIZIZ = C461720I8s.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mention_check_cache_");
        sbLIZ.append(strLIZIZ);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZIZ(long j, MentionGeneralCheckResponse mentionGeneralCheckResponse) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cache_time_");
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("blocked_uids_");
        sbLIZ2.append(j);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        Keva kevaLIZ = LIZ();
        try {
            kevaLIZ.storeLong(strLIZIZ, jCurrentTimeMillis);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (MentionCheckResult mentionCheckResult : mentionGeneralCheckResponse.blockResults) {
                for (MentionCheckSingleTypeResult mentionCheckSingleTypeResult : mentionCheckResult.userBlockedResults) {
                    if (mentionCheckSingleTypeResult.mentionType == j) {
                        long j2 = mentionCheckSingleTypeResult.blockType;
                        if (j2 != 0) {
                            linkedHashMap.put(mentionCheckResult.uid, Long.valueOf(j2));
                        }
                    }
                }
            }
            kevaLIZ.storeString(strLIZIZ2, ((Gson) LIZ.getValue()).LJIILL(linkedHashMap));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
