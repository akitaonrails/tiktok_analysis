package X;

import com.ss.android.ugc.tiktok.tools.performance.api.settings.StudioRunnableBlockConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AeD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2184311AeD {
    public static boolean LIZ;
    public static C2184901AfA LIZIZ;

    public static void LIZ(AbstractC2255811DRb abstractC2255811DRb, StudioRunnableBlockConfig studioRunnableBlockConfig) {
        boolean zLJFF;
        List<String> list;
        if (studioRunnableBlockConfig != null) {
            zLJFF = Intrinsics.LJFF(studioRunnableBlockConfig.enable, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        if (zLJFF && (list = studioRunnableBlockConfig.blockList) != null && !list.isEmpty()) {
            C2184301AeC c2184301AeC = new C2184301AeC();
            c2184301AeC.LJI = C1AWY.SINGLE;
            List<String> list2 = studioRunnableBlockConfig.blockList;
            if (list2 != null) {
                for (String str : list2) {
                    if (str != null && str.length() != 0) {
                        ((ArrayList) c2184301AeC.LIZIZ).add(str);
                    }
                }
            }
            Long l = studioRunnableBlockConfig.blockTimeInMills;
            if (l != null && l.longValue() > 0) {
                c2184301AeC.LJFF = EnumC2184291AeB.TIME;
                c2184301AeC.LJIIIIZZ = l.longValue();
            } else {
                c2184301AeC.LJFF = EnumC2184291AeB.PARK;
            }
            C20102213l6 c20102213l6 = C20102213l6.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start block runnable, scene: ");
            sbLIZ.append(abstractC2255811DRb);
            sbLIZ.append(", blockConfig: ");
            sbLIZ.append(studioRunnableBlockConfig);
            C201955140j.LIZLLL(c20102213l6, "RunnableBlocker", C2188811AlT.LIZIZ(sbLIZ));
            LIZ = true;
            C2184901AfA c2184901AfA = new C2184901AfA();
            c2184901AfA.LJFF = abstractC2255811DRb.LIZ;
            c2184901AfA.LIZIZ = Collections.singletonList(c2184301AeC);
            LIZIZ = c2184901AfA;
            C1BCA.LIZ(c2184901AfA);
            return;
        }
        C201955140j.LIZLLL(C20102213l6.LIZIZ, "RunnableBlocker", "not enable or blockList is empty");
    }
}
