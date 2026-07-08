package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u4q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1689900u4q {
    public final /* synthetic */ C1690050u55 LIZ;

    public C1689900u4q(C1690050u55 c1690050u55) {
        this.LIZ = c1690050u55;
    }

    public final List<InterfaceC1564810qp5> LIZ(int i) {
        Function1<Object, Unit> function1LJ;
        C1690040u54 c1690040u54;
        ArrayList arrayList = new ArrayList();
        C1690050u55 c1690050u55 = this.LIZ;
        C13YG c13ygLIZ = C13YI.LIZ();
        if (c13ygLIZ != null) {
            function1LJ = c13ygLIZ.LJ();
        } else {
            function1LJ = null;
        }
        C13YG c13ygLIZIZ = C13YI.LIZIZ(c13ygLIZ);
        try {
            if (c1690050u55.LIZIZ) {
                c1690040u54 = c1690050u55.LIZJ;
            } else {
                c1690040u54 = (C1690040u54) ((C13FE) c1690050u55.LJ).getValue();
            }
            if (c1690040u54 != null) {
                List<Pair<Integer, C1682380tsi>> listInvoke = c1690040u54.LJIIJ.invoke(Integer.valueOf(i));
                int size = listInvoke.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Pair<Integer, C1682380tsi> pair = listInvoke.get(i2);
                    arrayList.add(c1690050u55.LJIILJJIL.LIZ(pair.getFirst().intValue(), pair.getSecond().LIZ));
                }
            }
            C13YI.LJ(c13ygLIZ, c13ygLIZIZ, function1LJ);
            return arrayList;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C13YI.LJ(c13ygLIZ, c13ygLIZIZ, function1LJ);
            throw th;
        }
    }
}
