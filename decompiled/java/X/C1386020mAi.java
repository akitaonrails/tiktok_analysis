package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0mAi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386020mAi {
    public static C498901wx LIZ(List list, Map map) throws C1154510g9J, C0V0S, C1154500g9I, C1386090mAp, C0V0T, C1386100mAq, C1154530g9L, C1154540g9M, C0V0V {
        Map map2;
        Map map3;
        try {
            Object obj = map.get("matching_strategy_orchestrator");
            C1385690mAB c1385690mABLIZ = null;
            if ((obj instanceof Map) && (map2 = (Map) obj) != null) {
                InterfaceC499101wz interfaceC499101wzLIZ = C1154550g9N.LIZ(C2097908Jt.LIZJ(new Pair("matching_strategy_orchestrator", map2)));
                Object obj2 = map.get("ranking_strategy");
                if ((obj2 instanceof Map) && (map3 = (Map) obj2) != null) {
                    c1385690mABLIZ = C0V0W.LIZ(map3);
                }
                return new C498901wx(list, interfaceC499101wzLIZ, c1385690mABLIZ);
            }
            throw C1386100mAq.INSTANCE;
        } catch (ClassCastException e) {
            TryCatchGuardChecker.doCheck(e);
            throw C1386090mAp.INSTANCE;
        }
    }
}
