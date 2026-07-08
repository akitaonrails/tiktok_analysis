package X;

import dn3.a;
import java.lang.Enum;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1DGT, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DGT<KEY extends Enum<KEY>> implements C1DGU<KEY> {
    public final Map<C1DGK<KEY>, Function1<C1DHB, InterfaceC2252981DGe<KEY>>> LIZ = new LinkedHashMap();

    @Override // X.C1DGU
    public final InterfaceC2252981DGe<KEY> LIZ(C1DGK<KEY> c1dgk, C1DHB c1dhb) {
        InterfaceC2252981DGe<KEY> interfaceC2252981DGe;
        Function1 function1 = (Function1) ((LinkedHashMap) this.LIZ).get(c1dgk);
        if (function1 == null || (interfaceC2252981DGe = (InterfaceC2252981DGe) function1.invoke(c1dhb)) == null) {
            return new a(c1dgk, c1dhb);
        }
        return interfaceC2252981DGe;
    }
}
