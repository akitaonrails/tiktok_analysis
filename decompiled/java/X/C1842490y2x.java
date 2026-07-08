package X;

import com.bytedance.android.livesdk.rank.api.LiveRankingEntranceLoopRuleConfig;
import java.util.List;

/* JADX INFO: renamed from: X.0y2x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842490y2x {
    public static void LIZ(EnumC1083200eII enumC1083200eII, C1842380y2m c1842380y2m, C1842380y2m c1842380y2m2) {
        List<Integer> mandatoryRankingTypeList = LiveRankingEntranceLoopRuleConfig.INSTANCE.getMandatoryRankingTypeList(enumC1083200eII);
        if (mandatoryRankingTypeList.isEmpty()) {
            return;
        }
        for (C1842420y2q c1842420y2q : c1842380y2m.LIZJ) {
            if (!c1842420y2q.LJ && mandatoryRankingTypeList.contains(Integer.valueOf(c1842420y2q.LIZ.LIZIZ.type))) {
                c1842380y2m2.LIZJ.add(c1842420y2q);
            }
        }
    }
}
