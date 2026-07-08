package X;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1D5c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2250101D5c extends C09AY implements Function0<C1DGT<Enum<Object>>> {
    public final /* synthetic */ C1DGR<Enum<Object>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2250101D5c(C1DGR<Enum<Object>> c1dgr) {
        super(0);
        this.LL = c1dgr;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.jvm.functions.Function0
    public final C1DGT<Enum<Object>> invoke() {
        C1DGT<Enum<Object>> c1dgt = new C1DGT<>();
        for (Map.Entry entry : this.LL.LIZIZ.entrySet()) {
            Object key = entry.getKey();
            Function1<C1DHB, InterfaceC2252981DGe<KEY>> function1 = ((C1DGQ) entry.getValue()).LIZJ;
            if (function1 != 0) {
                c1dgt.LIZ.put((C1DGK<KEY>) key, function1);
            }
        }
        return c1dgt;
    }
}
