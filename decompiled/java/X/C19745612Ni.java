package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12Ni, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19745612Ni implements InterfaceC21640319mb {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final Float LIZLLL;
    public final Function1<? super Integer, Unit> LJ;

    public C19745612Ni() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19745612Ni)) {
            return false;
        }
        C19745612Ni c19745612Ni = (C19745612Ni) obj;
        return this.LIZ == c19745612Ni.LIZ && this.LIZIZ == c19745612Ni.LIZIZ && Intrinsics.LJFF(this.LIZJ, c19745612Ni.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c19745612Ni.LIZLLL) && Intrinsics.LJFF(this.LJ, c19745612Ni.LJ);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Float f = this.LIZLLL;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Function1<? super Integer, Unit> function1 = this.LJ;
        return iHashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Color(startColor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", endColor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", propertyName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", minimumVisibleChange=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", springColorCallback=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19745612Ni(int i, int i2, AwS595S0100000_16 awS595S0100000_16) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = "backgroundColor";
        this.LIZLLL = null;
        this.LJ = awS595S0100000_16;
    }
}
