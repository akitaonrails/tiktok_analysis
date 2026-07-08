package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Rhv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C703050Rhv extends C2217421BqW implements Function2<C702990Rhp, InterfaceC1445905lJ, C702990Rhp> {
    public C703050Rhv(Object obj) {
        super(2, obj, C703020Rhs.class, "reduceCancelExecute", "reduceCancelExecute(Lcom/tiktok/kmp/fcp/slotstrategy/core/SlotStrategyStoreState;Lcom/tiktok/kmp/fcp/redux/Action;)Lcom/tiktok/kmp/fcp/slotstrategy/core/SlotStrategyStoreState;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C702990Rhp invoke(C702990Rhp c702990Rhp, InterfaceC1445905lJ interfaceC1445905lJ) {
        C1233104s5 c1233104s5;
        C702990Rhp c702990Rhp2 = c702990Rhp;
        InterfaceC1445905lJ interfaceC1445905lJ2 = interfaceC1445905lJ;
        this.receiver.getClass();
        if ((interfaceC1445905lJ2 instanceof C1233104s5) && (c1233104s5 = (C1233104s5) interfaceC1445905lJ2) != null && !c1233104s5.LIZ.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(c702990Rhp2.LJII);
            Iterator<T> it2 = c1233104s5.LIZ.iterator();
            while (it2.hasNext()) {
                linkedHashMap.put(it2.next(), Long.valueOf(c702990Rhp2.LJI));
            }
            return C702990Rhp.LIZ(c702990Rhp2, null, null, null, null, 0L, 0L, 0L, linkedHashMap, null, null, null, 1919);
        }
        return c702990Rhp2;
    }
}
