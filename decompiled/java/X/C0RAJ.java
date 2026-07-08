package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RAJ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RAJ extends AbstractC1007980cKy {
    public final String LIZ;
    public final Function1<C0RAB, Unit> LIZIZ;
    public final Function1<C0RAO, Unit> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0RAJ)) {
            return false;
        }
        C0RAJ c0raj = (C0RAJ) obj;
        return Intrinsics.LJFF(this.LIZ, c0raj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0raj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0raj.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Function1<C0RAB, Unit> function1 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<C0RAO, Unit> function12 = this.LIZJ;
        return iHashCode2 + (function12 != null ? function12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiContentVideoRegisterListener(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0RAJ(String str, AwS590S0100000_11 awS590S0100000_11, AwS590S0100000_11 awS590S0100000_112) {
        this.LIZ = str;
        this.LIZIZ = awS590S0100000_11;
        this.LIZJ = awS590S0100000_112;
    }
}
