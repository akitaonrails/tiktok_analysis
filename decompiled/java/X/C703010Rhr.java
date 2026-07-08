package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Rhr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C703010Rhr extends C2217421BqW implements Function2<C702990Rhp, InterfaceC1445905lJ, C702990Rhp> {
    public C703010Rhr(Object obj) {
        super(2, obj, C703020Rhs.class, "reduceStartExecute", "reduceStartExecute(Lcom/tiktok/kmp/fcp/slotstrategy/core/SlotStrategyStoreState;Lcom/tiktok/kmp/fcp/redux/Action;)Lcom/tiktok/kmp/fcp/slotstrategy/core/SlotStrategyStoreState;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C702990Rhp invoke(C702990Rhp c702990Rhp, InterfaceC1445905lJ interfaceC1445905lJ) {
        C1262804ws c1262804ws;
        C702990Rhp c702990Rhp2 = c702990Rhp;
        InterfaceC1445905lJ interfaceC1445905lJ2 = interfaceC1445905lJ;
        this.receiver.getClass();
        if ((interfaceC1445905lJ2 instanceof C1262804ws) && (c1262804ws = (C1262804ws) interfaceC1445905lJ2) != null) {
            if (c1262804ws.LIZIZ.isEmpty()) {
                return C702990Rhp.LIZ(c702990Rhp2, null, null, null, null, 0L, 0L, Math.max(c702990Rhp2.LJI, c1262804ws.LIZ), null, null, null, null, 1983);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(c702990Rhp2.LJII);
            Iterator<T> it2 = c1262804ws.LIZIZ.iterator();
            while (it2.hasNext()) {
                linkedHashMap.put(it2.next(), Long.valueOf(c1262804ws.LIZ));
            }
            return C702990Rhp.LIZ(c702990Rhp2, null, null, null, null, 0L, 0L, Math.max(c702990Rhp2.LJI, c1262804ws.LIZ), linkedHashMap, null, null, null, 1855);
        }
        return c702990Rhp2;
    }
}
