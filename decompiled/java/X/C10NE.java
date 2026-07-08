package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10NE, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10NE {
    public static Pair LIZ(List list) {
        Pair pairLIZIZ = C10OM.LIZIZ(list);
        if (pairLIZIZ.getSecond() == null) {
            return null;
        }
        Object first = pairLIZIZ.getFirst();
        if (first == null) {
            first = "null";
        }
        return new Pair(first, Boolean.valueOf(Intrinsics.LJFF(pairLIZIZ.getSecond(), "run")));
    }

    public static Boolean LIZIZ(C10ND c10nd) {
        C10QI c10qiLIZJ = c10nd.LIZJ();
        if (c10qiLIZJ != null) {
            String strLIZJ = c10qiLIZJ.LIZJ();
            if (C123100dR.LIZ(strLIZJ)) {
                return Boolean.valueOf(Intrinsics.LJFF(strLIZJ, "run"));
            }
            return null;
        }
        return null;
    }

    public static Pair<String, Boolean> LIZJ(C10ND c10nd) {
        if (((ArrayList) C010S.LIZIZ).contains(c10nd.getId())) {
            return new Pair<>("ignore_by_deeplink", Boolean.FALSE);
        }
        Pair<String, Boolean> pairLIZ = LIZ(c10nd.LIZ());
        if (pairLIZ != null) {
            return pairLIZ;
        }
        Boolean boolLJ = c10nd.LJ();
        if (boolLJ != null) {
            return new Pair<>("local_rule", boolLJ);
        }
        Boolean boolLIZIZ = c10nd.LIZIZ();
        if (boolLIZIZ != null) {
            return new Pair<>("strategy_config", boolLIZIZ);
        }
        Pair<String, Boolean> pairLIZ2 = LIZ(c10nd.getFilters());
        if (pairLIZ2 != null) {
            return pairLIZ2;
        }
        return new Pair<>("null", Boolean.TRUE);
    }
}
