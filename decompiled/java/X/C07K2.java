package X;

import com.ss.android.ugc.aweme.im.strategy.experiment.StrategyPreloadWithUserPortraitV1Config;
import java.util.Map;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.07K2, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07K2 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(749));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(748));

    public static long LIZ(String str) {
        long jLongValue;
        Map<String, Long> map;
        Long l;
        StrategyPreloadWithUserPortraitV1Config strategyPreloadWithUserPortraitV1Config = (StrategyPreloadWithUserPortraitV1Config) LIZ.getValue();
        if (strategyPreloadWithUserPortraitV1Config != null && (map = strategyPreloadWithUserPortraitV1Config.noUserFrequencyControlMap) != null && (l = map.get(str)) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        return jLongValue * 1000;
    }

    public static long LIZIZ(String str) {
        long jLongValue;
        Map<String, Long> map;
        Long l;
        StrategyPreloadWithUserPortraitV1Config strategyPreloadWithUserPortraitV1Config = (StrategyPreloadWithUserPortraitV1Config) LIZ.getValue();
        if (strategyPreloadWithUserPortraitV1Config != null && (map = strategyPreloadWithUserPortraitV1Config.userFrequencyControlMap) != null && (l = map.get(str)) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        return jLongValue * 1000;
    }
}
