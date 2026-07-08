package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UuF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C787130UuF implements InterfaceC1665520tRW {
    public final boolean LIZ = true;
    public final Function0<Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C787130UuF)) {
            return false;
        }
        C787130UuF c787130UuF = (C787130UuF) obj;
        return this.LIZ == c787130UuF.LIZ && Intrinsics.LJFF(this.LIZIZ, c787130UuF.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RevealShootButtonState(isVisible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", shootCallback=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1665520tRW
    public final boolean isVisible() {
        return this.LIZ;
    }

    public C787130UuF(C1657510tEb c1657510tEb) {
        this.LIZIZ = c1657510tEb;
    }
}
