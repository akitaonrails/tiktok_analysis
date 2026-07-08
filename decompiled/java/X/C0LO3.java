package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LO3, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LO3 {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final Function1<C542120LNy, C1897207bu> LJ;

    public C0LO3() {
        this(false, false, false, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LO3)) {
            return false;
        }
        C0LO3 c0lo3 = (C0LO3) obj;
        return this.LIZ == c0lo3.LIZ && this.LIZIZ == c0lo3.LIZIZ && this.LIZJ == c0lo3.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0lo3.LIZLLL) && Intrinsics.LJFF(this.LJ, c0lo3.LJ);
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        String str = this.LIZLLL;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        Function1<C542120LNy, C1897207bu> function1 = this.LJ;
        return iHashCode + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AuthConfig(enableAuthInPost=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enableAuthInSave=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", allowMultiplePublish=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", aiFunctionType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", authResultToErrorCode=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0LO3(boolean z, boolean z2, boolean z3, String str, Function1<? super C542120LNy, C1897207bu> function1) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = str;
        this.LJ = function1;
    }
}
