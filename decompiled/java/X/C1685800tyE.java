package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS303S0000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tyE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685800tyE implements InterfaceC1685750ty9 {
    public final InterfaceC1685750ty9 LIZIZ;
    public final InterfaceC1685750ty9 LIZJ;

    @Override // X.InterfaceC1685750ty9
    public final /* synthetic */ InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9) {
        return C1685810tyF.LIZ(this, interfaceC1685750ty9);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZJ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append((String) LJIILJJIL("", AFwS303S0000000_19.get$arr$(0)));
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1685750ty9
    public final boolean LJIILLIIL(Function1<? super InterfaceC1672410tcd, Boolean> function1) {
        if (this.LIZIZ.LJIILLIIL(function1) && this.LIZJ.LJIILLIIL(function1)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1685800tyE) {
            C1685800tyE c1685800tyE = (C1685800tyE) obj;
            if (Intrinsics.LJFF(this.LIZIZ, c1685800tyE.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1685800tyE.LIZJ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1685800tyE(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1685750ty9 interfaceC1685750ty92) {
        this.LIZIZ = interfaceC1685750ty9;
        this.LIZJ = interfaceC1685750ty92;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1685750ty9
    public final <R> R LJIILJJIL(R r, Function2<? super R, ? super InterfaceC1672410tcd, ? extends R> function2) {
        return (R) this.LIZJ.LJIILJJIL(this.LIZIZ.LJIILJJIL(r, function2), function2);
    }
}
