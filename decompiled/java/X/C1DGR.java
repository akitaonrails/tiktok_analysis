package X;

import bn3.a;
import java.lang.Enum;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1DGR, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DGR<KEY extends Enum<KEY>> implements C1DGS<KEY> {
    public Function1<? super a, Unit> LIZ;
    public final LinkedHashMap<C1DGK<KEY>, C1DGQ<KEY>> LIZIZ = new LinkedHashMap<>();

    @Override // X.C1DGS
    public final void LIZ(Function1<? super a, Unit> function1) {
        this.LIZ = function1;
    }

    @Override // X.C1DGS
    public final void LIZIZ(C1DGK<KEY> c1dgk, boolean z, Function1<? super C1DHB, ? extends InterfaceC2252981DGe<KEY>> function1, Function1<? super C1DGZ<KEY>, Unit> function12) {
        this.LIZIZ.put(c1dgk, new C1DGQ<>(c1dgk, z, function1, function12));
    }
}
