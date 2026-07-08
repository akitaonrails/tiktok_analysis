package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NeP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C598950NeP {
    public final Object LIZ;
    public final Function0<InterfaceC599000NeU> LIZIZ;
    public final AbstractC2252651DEx LIZJ;
    public final long LIZLLL = Long.MAX_VALUE;
    public final boolean LJ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C598950NeP)) {
            return false;
        }
        C598950NeP c598950NeP = (C598950NeP) obj;
        return Intrinsics.LJFF(this.LIZ, c598950NeP.LIZ) && Intrinsics.LJFF(this.LIZIZ, c598950NeP.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c598950NeP.LIZJ) && this.LIZLLL == c598950NeP.LIZLLL && this.LJ == c598950NeP.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionRegistration(component=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", actionHandler=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", dispatcher=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", timeoutMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", handleErrors=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C598950NeP(Object obj, Function0 function0, AbstractC2238408pq abstractC2238408pq) {
        this.LIZ = obj;
        this.LIZIZ = function0;
        this.LIZJ = abstractC2238408pq;
    }
}
