package X;

import com.ss.android.ugc.aweme.upvote.experiment.UpvoteBatchQpsCutoffExp;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0lT8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359000lT8 {
    public static final ConcurrentHashSet<String> LIZ = new ConcurrentHashSet<>();
    public static final AtomicLong LIZIZ = new AtomicLong(-1);

    public static void LIZIZ() {
        UpvoteBatchQpsCutoffExp.UpvoteBatchQpsCutoffConfig upvoteBatchQpsCutoffConfigLIZIZ;
        if (UpvoteBatchQpsCutoffExp.LIZ() && (upvoteBatchQpsCutoffConfigLIZIZ = UpvoteBatchQpsCutoffExp.LIZIZ()) != null && (upvoteBatchQpsCutoffConfigLIZIZ.optTask & 1) == 1) {
            AtomicLong atomicLong = LIZIZ;
            if (atomicLong.get() != -1) {
                if (System.currentTimeMillis() - atomicLong.get() <= (UpvoteBatchQpsCutoffExp.LIZIZ() != null ? r0.duplicateTimeWindow : 2000)) {
                    return;
                }
            }
            LIZ.clear();
            atomicLong.set(System.currentTimeMillis());
        }
    }

    public static boolean LIZ(String str, String str2, EnumC1359020lTA enumC1359020lTA) {
        UpvoteBatchQpsCutoffExp.UpvoteBatchQpsCutoffConfig upvoteBatchQpsCutoffConfigLIZIZ;
        String strValueOf;
        if (!UpvoteBatchQpsCutoffExp.LIZ() || (upvoteBatchQpsCutoffConfigLIZIZ = UpvoteBatchQpsCutoffExp.LIZIZ()) == null || (upvoteBatchQpsCutoffConfigLIZIZ.optTask & 1) != 1 || str == null) {
            return false;
        }
        if (enumC1359020lTA == null) {
            enumC1359020lTA = EnumC1359020lTA.OTHERS;
        }
        if (enumC1359020lTA != EnumC1359020lTA.MY_UPVOTE_TAB && enumC1359020lTA != EnumC1359020lTA.OTHERS_UPVOTE_TAB && enumC1359020lTA != EnumC1359020lTA.FOR_YOU_FEED) {
            strValueOf = "";
        } else {
            strValueOf = String.valueOf(enumC1359020lTA.getValue());
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('|');
        sbLIZ.append(str2);
        sbLIZ.append('|');
        sbLIZ.append(strValueOf);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ConcurrentHashSet<String> concurrentHashSet = LIZ;
        boolean zContains = concurrentHashSet.contains(strLIZIZ);
        if (!zContains) {
            concurrentHashSet.add(strLIZIZ);
        }
        return zContains;
    }
}
