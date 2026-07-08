package X;

import com.bytedance.android.livesdk.livesetting.rank.LiveCreatorRankingMiddaySprintConfig;
import com.bytedance.android.livesdk.rank.impl.RankingCountdownManagerChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0eBQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078940eBQ {
    public static final C1078930eBP LIZ(int i, DataChannel dataChannel, int i2) {
        C1078960eBS c1078960eBS;
        if (dataChannel == null || (c1078960eBS = (C1078960eBS) dataChannel.gg0(RankingCountdownManagerChannel.class)) == null) {
            return null;
        }
        return (C1078930eBP) ((LinkedHashMap) c1078960eBS.LIZIZ).get(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static final boolean LIZIZ(DataChannel dataChannel, int i, boolean z, long j) {
        C1078960eBS c1078960eBS;
        if (z && j >= 0) {
            return LiveCreatorRankingMiddaySprintConfig.INSTANCE.isInMiddaySprintPeriodForEventTracking(i, j);
        }
        if (dataChannel != null && (c1078960eBS = (C1078960eBS) dataChannel.gg0(RankingCountdownManagerChannel.class)) != null) {
            C1078930eBP c1078930eBP = (C1078930eBP) ((LinkedHashMap) c1078960eBS.LIZIZ).get(new Pair(Integer.valueOf(i), Integer.valueOf(EnumC1083210eIJ.RANKING_MIDDAY_SPRINT_START.getType())));
            if (c1078930eBP != null) {
                long j2 = c1078930eBP.LIZJ;
                if (0 <= j2 && j2 < 1801) {
                    return true;
                }
                if (85800 <= j2 && j2 < 86401) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
