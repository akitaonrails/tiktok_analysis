package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rhn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C702970Rhn extends C2217421BqW implements Function2<C702990Rhp, InterfaceC1445905lJ, C702990Rhp> {
    public C702970Rhn(Object obj) {
        super(2, obj, C703020Rhs.class, "reduceCommitCandidates", "reduceCommitCandidates(Lcom/tiktok/kmp/fcp/slotstrategy/core/SlotStrategyStoreState;Lcom/tiktok/kmp/fcp/redux/Action;)Lcom/tiktok/kmp/fcp/slotstrategy/core/SlotStrategyStoreState;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C702990Rhp invoke(C702990Rhp c702990Rhp, InterfaceC1445905lJ interfaceC1445905lJ) {
        C1233204s6 c1233204s6;
        C702990Rhp c702990Rhp2 = c702990Rhp;
        InterfaceC1445905lJ interfaceC1445905lJ2 = interfaceC1445905lJ;
        C703020Rhs c703020Rhs = (C703020Rhs) this.receiver;
        c703020Rhs.getClass();
        if ((interfaceC1445905lJ2 instanceof C1233204s6) && (c1233204s6 = (C1233204s6) interfaceC1445905lJ2) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C700060Rd6 c700060Rd6 : c1233204s6.LIZ) {
                Object obj = linkedHashMap2.get(c700060Rd6.LIZ);
                if (obj == null && !linkedHashMap2.containsKey(c700060Rd6.LIZ)) {
                    linkedHashMap2.put(c700060Rd6.LIZ, c700060Rd6.LIZIZ);
                    linkedHashMap.put(c700060Rd6.LIZ, c700060Rd6);
                } else if (!Intrinsics.LJFF(obj, c700060Rd6.LIZIZ)) {
                    linkedHashSet.add(c700060Rd6.LIZ);
                }
            }
            C702940Rhk c702940RhkLIZJ = c702990Rhp2.LIZIZ;
            if (c702940RhkLIZJ == null) {
                c702940RhkLIZJ = c703020Rhs.LIZJ();
            }
            C700400Rde c700400RdeLJ = c702990Rhp2.LIZJ;
            if (c700400RdeLJ == null) {
                c700400RdeLJ = C702980Rho.LJ(c702940RhkLIZJ.LIZJ);
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            Pair pair = new Pair(C702980Rho.LIZLLL(c700400RdeLJ, null, linkedHashMap3), linkedHashMap3);
            C700400Rde c700400Rde = (C700400Rde) pair.getFirst();
            Map map = (Map) pair.getSecond();
            String str = c700400Rde.LIZ;
            List<Map.Entry> listLJLLLL = C13LP.LJLLLL(new C512401z8(46), linkedHashMap.entrySet());
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            for (Map.Entry entry : listLJLLLL) {
                Pair pair2 = new Pair(entry.getKey(), entry.getValue());
                linkedHashMap4.put(pair2.getFirst(), pair2.getSecond());
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
            Iterator it2 = linkedHashMap4.keySet().iterator();
            while (it2.hasNext()) {
                C702980Rho.LIZ(linkedHashSet2, linkedHashSet3, linkedHashMap4, str, linkedHashSet4, linkedHashSet5, c700400Rde, map, (String) it2.next());
            }
            return C702990Rhp.LIZ(c702990Rhp2, null, new C702940Rhk(c702940RhkLIZJ.LIZ, c702940RhkLIZJ.LIZIZ, c700400Rde, c702940RhkLIZJ.LIZLLL), c700400RdeLJ, c700400Rde, 0L, 0L, 0L, null, linkedHashMap, linkedHashMap2, C13LP.LJLLJ(C13LP.LLIIII(linkedHashSet)), 241);
        }
        return c702990Rhp2;
    }
}
