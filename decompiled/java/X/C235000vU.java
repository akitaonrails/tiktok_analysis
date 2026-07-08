package X;

import com.bytedance.android.livesdk.rank.api.LiveRankTypeConfig;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00vU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C235000vU {
    public static RankTypeV2 LIZIZ(String str) {
        if (str == null) {
            return RankTypeV2.LJJIJIIJI;
        }
        for (Map.Entry<Pair<Integer, Integer>, RankTypeV2> entry : LiveRankTypeConfig.INSTANCE.getValue().entrySet()) {
            if (!Intrinsics.LJFF(entry.getValue().rankName, str)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(entry.getValue().rankName);
                sbLIZ.append("_notice");
                if (Intrinsics.LJFF(C2188811AlT.LIZIZ(sbLIZ), str)) {
                }
            }
            return entry.getValue();
        }
        return RankTypeV2.LJJIJIIJI;
    }

    public static RankTypeV2 LIZ(int i, int i2) {
        RankTypeV2 rankTypeV2 = LiveRankTypeConfig.INSTANCE.getValue().get(new Pair(Integer.valueOf(i), Integer.valueOf(i2)));
        if (rankTypeV2 == null) {
            return RankTypeV2.LJJIJIIJI;
        }
        return rankTypeV2;
    }
}
