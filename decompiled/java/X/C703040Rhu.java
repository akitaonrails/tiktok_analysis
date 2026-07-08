package X;

import Y.AComparatorS30S0000000_11;
import Y.AComparatorS510S0100000_11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Rhu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C703040Rhu extends C2217421BqW implements Function2<C702990Rhp, InterfaceC1445905lJ, C702990Rhp> {
    public C703040Rhu(Object obj) {
        super(2, obj, C703020Rhs.class, "reduceBindRules", "reduceBindRules(Lcom/tiktok/kmp/fcp/slotstrategy/core/SlotStrategyStoreState;Lcom/tiktok/kmp/fcp/redux/Action;)Lcom/tiktok/kmp/fcp/slotstrategy/core/SlotStrategyStoreState;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C702990Rhp invoke(C702990Rhp c702990Rhp, InterfaceC1445905lJ interfaceC1445905lJ) {
        C1937107iL c1937107iL;
        C702990Rhp c702990Rhp2 = c702990Rhp;
        InterfaceC1445905lJ interfaceC1445905lJ2 = interfaceC1445905lJ;
        this.receiver.getClass();
        if ((interfaceC1445905lJ2 instanceof C1937107iL) && (c1937107iL = (C1937107iL) interfaceC1445905lJ2) != null) {
            List<C703160Ri6> list = c1937107iL.LIZ.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (C703160Ri6 c703160Ri6 : list) {
                String str = c703160Ri6.LIZ;
                Object arrayList = linkedHashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(str, arrayList);
                }
                ((List) arrayList).add(c703160Ri6);
            }
            Iterator it2 = linkedHashMap.values().iterator();
            while (it2.hasNext()) {
                C08XD.LJJ((List) it2.next(), new AComparatorS510S0100000_11(new AComparatorS510S0100000_11(new AComparatorS510S0100000_11(new AComparatorS30S0000000_11(5), 2), 3), 4));
            }
            List listLJLLJ = C13LP.LJLLJ(linkedHashMap.keySet());
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(listLJLLJ, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ);
            for (Object obj : listLJLLJ) {
                Object obj2 = linkedHashMap.get(obj);
                if (obj2 == null) {
                    obj2 = C13BV.INSTANCE;
                }
                linkedHashMap2.put(obj, obj2);
            }
            return C702990Rhp.LIZ(c702990Rhp2, linkedHashMap2, null, null, null, 0L, 0L, 0L, null, null, null, null, 2046);
        }
        return c702990Rhp2;
    }
}
