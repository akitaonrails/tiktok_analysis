package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tEV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1657450tEV {
    public final Function1<C1DRG, InterfaceC1665350tRF<? extends InterfaceC1665520tRW>> LIZ;

    public C1657450tEV() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1657450tEV) && Intrinsics.LJFF(this.LIZ, ((C1657450tEV) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShootButtonConfiguration(provider=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1657450tEV(int i) {
        this(AFwS266S0000000_25.get$arr$(3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1657450tEV(Function1<? super C1DRG, ? extends InterfaceC1665350tRF<? extends InterfaceC1665520tRW>> function1) {
        this.LIZ = function1;
    }
}
