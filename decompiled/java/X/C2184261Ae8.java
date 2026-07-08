package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1Ae8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184261Ae8 {
    public static final C2184261Ae8 LIZ = new C2184261Ae8();
    public static final Map<EnumC1153470g7d, C2184901AfA> LIZIZ = new LinkedHashMap();

    public static void LIZ(EnumC1153470g7d enumC1153470g7d) {
        C2184901AfA c2184901AfARemove = LIZIZ.remove(enumC1153470g7d);
        if (c2184901AfARemove == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("endBlock: no active block for scene=");
            sbLIZ.append(enumC1153470g7d);
            C20441214yg.LIZIZ("LiveHostRunnableBlocker", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("endBlock scene=");
        sbLIZ2.append(enumC1153470g7d);
        C20441214yg.LIZIZ("LiveHostRunnableBlocker", C2188811AlT.LIZIZ(sbLIZ2));
        C1BCA.LJJIIZI(c2184901AfARemove);
    }

    public static void LIZIZ(EnumC1153470g7d enumC1153470g7d, List list, long j) {
        EnumC2184291AeB enumC2184291AeB;
        if (list.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("blockList is empty, skip scene=");
            sbLIZ.append(enumC1153470g7d);
            C20441214yg.LIZIZ("LiveHostRunnableBlocker", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C2184301AeC c2184301AeC = new C2184301AeC();
        c2184301AeC.LJI = C1AWY.SINGLE;
        if (j > 0) {
            enumC2184291AeB = EnumC2184291AeB.TIME;
        } else {
            enumC2184291AeB = EnumC2184291AeB.PARK;
        }
        c2184301AeC.LJFF = enumC2184291AeB;
        if (j > 0) {
            c2184301AeC.LJIIIIZZ = j;
        }
        for (Object obj : list) {
            if (obj != null) {
                ((ArrayList) c2184301AeC.LIZIZ).add(obj);
            }
        }
        C2184901AfA c2184901AfA = new C2184901AfA();
        c2184901AfA.LJFF = enumC1153470g7d.getSceneName();
        c2184901AfA.LIZIZ = Collections.singletonList(c2184301AeC);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("startBlock scene=");
        sbLIZ2.append(enumC1153470g7d);
        sbLIZ2.append(", blockList=");
        sbLIZ2.append(list);
        sbLIZ2.append(", blockTimeInMills=");
        sbLIZ2.append(j);
        C20441214yg.LIZIZ("LiveHostRunnableBlocker", C2188811AlT.LIZIZ(sbLIZ2));
        LIZIZ.put(enumC1153470g7d, c2184901AfA);
        C1BCA.LIZ(c2184901AfA);
    }
}
