package X;

import com.bytedance.forest.bridge.ForestBridge;
import com.bytedance.forest.experiments.ForestExperiment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0q12, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533780q12 {
    public static InterfaceC1534830q2j LIZ(C1533790q13 c1533790q13) {
        InterfaceC1534830q2j interfaceC1534830q2jCreateResourceChain;
        C1533490q0Z c1533490q0Z = c1533790q13.LIZ;
        if (c1533490q0Z.LJJIJLIJ) {
            c1533490q0Z.LJJJLL = C1697810uHb.LJIILJJIL("cdn");
        } else if ((c1533490q0Z.LJIIZILJ.booleanValue() || c1533490q0Z.LJIILLIIL) && !c1533490q0Z.LJJJLL.contains("memory")) {
            ListProtector.add(c1533490q0Z.LJJJLL, 0, "memory");
        }
        if (c1533490q0Z.LJJJLL.isEmpty()) {
            C1534250q1n.LJFF("ResourceFetchScheduler", "createFetcherChain", "Fetcher sequence is empty", null, false);
            return new C1534160q1e(c1533490q0Z.LJJJLL);
        }
        if (c1533490q0Z.LJII) {
            c1533490q0Z.LJJJLL.remove("builtin");
        }
        if (c1533490q0Z.LJIIIZ) {
            c1533490q0Z.LJJJLL.remove("cdn");
        }
        if (c1533490q0Z.LJJJ == EnumC1533980q1M.LYNX_IMAGE) {
            c1533490q0Z.LJIIIIZZ = true;
        }
        if (c1533490q0Z.LJIIL) {
            c1533490q0Z.LJJJLL.remove("gecko");
        }
        ForestBridge forestBridge = C1532810pzT.LIZ;
        if (forestBridge != null && (interfaceC1534830q2jCreateResourceChain = forestBridge.createResourceChain(c1533790q13)) != null) {
            return interfaceC1534830q2jCreateResourceChain;
        }
        if (c1533490q0Z.LJJJLL.isEmpty()) {
            C1533810q15 c1533810q15 = c1533790q13.LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("no fetcher for url:");
            sbLIZ.append(c1533490q0Z.LJJJJIZL);
            sbLIZ.append(':');
            sbLIZ.append(c1533490q0Z.LJJJJLI);
            c1533810q15.LJ(1, C2188811AlT.LIZIZ(sbLIZ));
        }
        if (c1533490q0Z.LJJIIZ && !c1533490q0Z.LJJ) {
            return new C1534160q1e(c1533490q0Z.LJJJLL);
        }
        if ((ForestExperiment.INSTANCE.getOptimizeProcessorChain() || c1533490q0Z.LJJ) && c1533490q0Z.LJ != null) {
            Iterator<String> it2 = c1533490q0Z.LJJJLL.iterator();
            while (it2.hasNext()) {
                if (!C1531180pwq.LIZIZ.contains(it2.next())) {
                    return new C1534160q1e(c1533490q0Z.LJJJLL);
                }
            }
            return new C1535040q34(c1533490q0Z.LJJJLL);
        }
        return new C1534160q1e(c1533490q0Z.LJJJLL);
    }
}
