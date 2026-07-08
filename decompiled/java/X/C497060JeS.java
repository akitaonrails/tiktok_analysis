package X;

import com.bytedance.android.live.network.combine.exp.LiveCombineApiRequestSubBizLogData;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0JeS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497060JeS {
    public static final ConcurrentHashMap<String, C0IX8> LIZ = new ConcurrentHashMap<>();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(301));

    public static boolean LIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static C0IX8 LIZIZ(String str) {
        ConcurrentHashMap<String, C0IX8> concurrentHashMap = LIZ;
        if (!concurrentHashMap.containsKey(str)) {
            concurrentHashMap.put(str, new C0IX8(null));
        }
        return concurrentHashMap.get(str);
    }

    public static LiveCombineApiRequestSubBizLogData LIZJ(String str, String str2) {
        C0IX8 c0ix8LIZIZ = LIZIZ(str2);
        if (c0ix8LIZIZ == null) {
            return null;
        }
        if (!c0ix8LIZIZ.LJI.containsKey(str)) {
            c0ix8LIZIZ.LJI.put(str, new LiveCombineApiRequestSubBizLogData(-1L, -1L, -1, -1));
        }
        return c0ix8LIZIZ.LJI.get(str);
    }

    public static void LIZLLL(int i, String str, boolean z) {
        C0IX8 c0ix8LIZIZ;
        if (!LIZ() || (c0ix8LIZIZ = LIZIZ(str)) == null) {
            return;
        }
        if (z) {
            c0ix8LIZIZ.LIZIZ = System.currentTimeMillis() - c0ix8LIZIZ.LIZ;
            c0ix8LIZIZ.LIZJ = 4;
        } else {
            c0ix8LIZIZ.LIZJ = i;
        }
    }

    public static void LJ(String str, String str2, boolean z) {
        LiveCombineApiRequestSubBizLogData liveCombineApiRequestSubBizLogDataLIZJ;
        if (!LIZ() || (liveCombineApiRequestSubBizLogDataLIZJ = LIZJ(str, str2)) == null) {
            return;
        }
        if (z) {
            liveCombineApiRequestSubBizLogDataLIZJ.combineApiSubBizRequestDur = System.currentTimeMillis() - liveCombineApiRequestSubBizLogDataLIZJ.LIZ;
            liveCombineApiRequestSubBizLogDataLIZJ.bizFetchState = 2;
        } else {
            liveCombineApiRequestSubBizLogDataLIZJ.bizFetchState = 3;
        }
    }
}
