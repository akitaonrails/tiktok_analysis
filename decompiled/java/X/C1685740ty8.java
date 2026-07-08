package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ty8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685740ty8 extends AbstractC1685790tyD implements InterfaceC20058213e0 {
    public final C2267581DpE LIZJ;
    public final Function1<C2267501Dp6, Unit> LIZLLL;

    @Override // X.InterfaceC20058213e0
    public final Object LJII() {
        return new C1685770tyB(this.LIZJ, this.LIZLLL);
    }

    public final int hashCode() {
        return this.LIZLLL.hashCode();
    }

    @Override // X.InterfaceC1685750ty9
    public final InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9) {
        return C1685810tyF.LIZ(this, interfaceC1685750ty9);
    }

    @Override // X.InterfaceC1685750ty9
    public final boolean LJIILLIIL(Function1<? super InterfaceC1672410tcd, Boolean> function1) {
        return C1672400tcc.LIZ(this, function1);
    }

    public final boolean equals(Object obj) {
        C1685740ty8 c1685740ty8;
        Function1<C2267501Dp6, Unit> function1 = this.LIZLLL;
        Function1<C2267501Dp6, Unit> function12 = null;
        if ((obj instanceof C1685740ty8) && (c1685740ty8 = (C1685740ty8) obj) != null) {
            function12 = c1685740ty8.LIZLLL;
        }
        return Intrinsics.LJFF(function1, function12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1685740ty8(C2267581DpE c2267581DpE, Function1<? super C2267501Dp6, Unit> function1) {
        super(C1684360tvu.LIZ);
        this.LIZJ = c2267581DpE;
        this.LIZLLL = function1;
    }

    @Override // X.InterfaceC1685750ty9
    public final <R> R LJIILJJIL(R r, Function2<? super R, ? super InterfaceC1672410tcd, ? extends R> function2) {
        return function2.invoke(r, this);
    }
}
