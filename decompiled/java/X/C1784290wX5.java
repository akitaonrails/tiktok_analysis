package X;

import com.ss.android.ugc.aweme.feed.ab.StrategyGroup;
import com.ss.android.ugc.aweme.feed.ab.StrategyInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wX5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1784290wX5 {
    public static final StrategyGroup LIZ = new StrategyGroup(null, null, null, 7, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1784300wX6());

    public static StrategyGroup LIZ() {
        return (StrategyGroup) LIZIZ.getValue();
    }

    public static StrategyInfo LIZIZ() {
        List<StrategyInfo> list;
        StrategyGroup strategyGroupLIZ = LIZ();
        StrategyInfo strategyInfo = null;
        if (strategyGroupLIZ == null || (list = strategyGroupLIZ.strategies) == null) {
            return null;
        }
        Iterator<StrategyInfo> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            StrategyInfo next = it2.next();
            if (Intrinsics.LJFF(next.name, EnumC1778530wNn.STRATEGY_PREFETCH_GECKO.getKey())) {
                strategyInfo = next;
                break;
            }
        }
        return strategyInfo;
    }

    public static StrategyInfo LIZJ() {
        List<StrategyInfo> list;
        StrategyGroup strategyGroupLIZ = LIZ();
        StrategyInfo strategyInfo = null;
        if (strategyGroupLIZ == null || (list = strategyGroupLIZ.strategies) == null) {
            return null;
        }
        Iterator<StrategyInfo> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            StrategyInfo next = it2.next();
            if (Intrinsics.LJFF(next.name, EnumC1778530wNn.STRATEGY_PRELOAD_INDEX.getKey())) {
                strategyInfo = next;
                break;
            }
        }
        return strategyInfo;
    }

    public static boolean LIZLLL() {
        List<StrategyInfo> list;
        StrategyGroup strategyGroupLIZ = LIZ();
        if (strategyGroupLIZ == null || (list = strategyGroupLIZ.strategies) == null || list.isEmpty()) {
            return false;
        }
        for (StrategyInfo strategyInfo : list) {
            if (Intrinsics.LJFF(strategyInfo.name, EnumC1778530wNn.STRATEGY_PREFETCH_GECKO.getKey()) && strategyInfo.enable) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJ() {
        List<StrategyInfo> list;
        StrategyGroup strategyGroupLIZ = LIZ();
        if (strategyGroupLIZ == null || (list = strategyGroupLIZ.strategies) == null || list.isEmpty()) {
            return false;
        }
        for (StrategyInfo strategyInfo : list) {
            if (Intrinsics.LJFF(strategyInfo.name, EnumC1778530wNn.STRATEGY_RELOAD_CACHE.getKey()) && strategyInfo.enable) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJFF() {
        List<StrategyInfo> list;
        StrategyGroup strategyGroupLIZ = LIZ();
        if (strategyGroupLIZ == null || (list = strategyGroupLIZ.strategies) == null || list.isEmpty()) {
            return false;
        }
        for (StrategyInfo strategyInfo : list) {
            if (Intrinsics.LJFF(strategyInfo.name, EnumC1778530wNn.STRATEGY_PRELOAD_INDEX.getKey()) && strategyInfo.enable) {
                return true;
            }
        }
        return false;
    }
}
