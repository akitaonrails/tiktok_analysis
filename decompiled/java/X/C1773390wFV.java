package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0wFV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773390wFV {
    public static C1773880wGI LIZ(InterfaceC1773310wFN interfaceC1773310wFN, String str, String str2) {
        AbstractC1773210wFD abstractC1773210wFD;
        Pair<Integer, List<AbstractC1773210wFD>> pairJq0 = interfaceC1773310wFN.LJIIIZ().Jq0(str, str2);
        int iIntValue = pairJq0.getFirst().intValue();
        List<AbstractC1773210wFD> second = pairJq0.getSecond();
        if (iIntValue != -1) {
            return new C1773880wGI(second, iIntValue, (AbstractC1773210wFD) ListProtector.get(second, iIntValue));
        }
        Pair<Integer, List<AbstractC1773210wFD>> pairG80 = interfaceC1773310wFN.LJIIIZ().g80(str, str2);
        int iIntValue2 = pairG80.getFirst().intValue();
        List<AbstractC1773210wFD> second2 = pairG80.getSecond();
        if (iIntValue2 != -1 && (abstractC1773210wFD = ((AbstractC1773210wFD) ListProtector.get(second2, iIntValue2)).LJIJJLI) != null) {
            return new C1773880wGI(second2, iIntValue2, abstractC1773210wFD);
        }
        return null;
    }
}
