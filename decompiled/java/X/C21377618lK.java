package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.taskscheduler.downgrade.DowngradeStrategy;
import com.ss.android.ugc.aweme.creative.taskscheduler.downgrade.DowngradeStrategyConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18lK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21377618lK {
    public static DowngradeStrategyConfig LIZ;
    public static final HashSet<String> LIZIZ = new HashSet<>();
    public static final HashMap<String, Long> LIZJ = new HashMap<>();

    public static void LIZ(DowngradeStrategyConfig downgradeStrategyConfig) {
        if (LIZ != null) {
            return;
        }
        LIZ = downgradeStrategyConfig;
        HashSet<String> hashSet = LIZIZ;
        ArrayList<DowngradeStrategy> arrayList = downgradeStrategyConfig.downgradeStrategyList;
        ArrayList arrayList2 = new ArrayList();
        for (DowngradeStrategy downgradeStrategy : arrayList) {
            if (Intrinsics.LJFF(downgradeStrategy.strategy, "not_execute")) {
                arrayList2.add(downgradeStrategy);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(((DowngradeStrategy) it2.next()).taskList, arrayList3);
        }
        hashSet.addAll(arrayList3);
        for (DowngradeStrategy downgradeStrategy2 : downgradeStrategyConfig.downgradeStrategyList) {
            long j = downgradeStrategy2.executionInterval;
            if (Intrinsics.LJFF(downgradeStrategy2.strategy, "reduce_execute_frequency")) {
                HashMap<String, Long> map = LIZJ;
                ArrayList<String> arrayList4 = downgradeStrategy2.taskList;
                ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
                Iterator<String> it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(new Pair(it3.next(), Long.valueOf(j)));
                }
                C2097608Jq.LJIILJJIL(arrayList5, map);
            }
        }
    }

    public static void LIZIZ(AbstractRunnableC21377818lM abstractRunnableC21377818lM) {
        if (!LIZJ.containsKey(abstractRunnableC21377818lM.LLILLL.LIZ)) {
            return;
        }
        String str = abstractRunnableC21377818lM.LLILLL.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Keva keva = (Keva) C21377718lL.LIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("execute_time_");
        sbLIZ.append(str);
        keva.storeLong(C2188811AlT.LIZIZ(sbLIZ), jCurrentTimeMillis);
    }
}
