package X;

import com.bytedance.android.live.dynamicstrategy.strategy.Strategy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0J0D, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J0D {
    public static final C0J0D LIZ = new C0J0D();
    public static final Map<String, Strategy> LIZIZ = Collections.synchronizedMap(new HashMap());
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(336));

    public static Strategy LIZ(String str) {
        List list;
        Strategy strategyPut;
        if (LIZIZ.isEmpty() && (list = (List) LIZJ.getValue()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    Strategy strategyLIZIZ = C1089660eSi.LIZIZ((String) it2.next(), "");
                    if (strategyLIZIZ != null && (strategyPut = LIZIZ.put(strategyLIZIZ.decisionKey, strategyLIZIZ)) != null) {
                        arrayList.add(strategyPut);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("parse strategy failed, error is ");
                    sbLIZ.append(e.getMessage());
                    C0J6C.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                }
            }
        }
        return LIZIZ.get(str);
    }
}
