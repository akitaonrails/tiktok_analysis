package X;

/* JADX INFO: renamed from: X.0xSG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1819740xSG {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C1819740xSG() {
        this(true, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1819740xSG)) {
            return false;
        }
        C1819740xSG c1819740xSG = (C1819740xSG) obj;
        return this.LIZ == c1819740xSG.LIZ && this.LIZIZ == c1819740xSG.LIZIZ && this.LIZJ == c1819740xSG.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadingStates(isLoading=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isError=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isSuccess=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1819740xSG(boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
    }

    public static C1819740xSG LIZ(C1819740xSG c1819740xSG, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = c1819740xSG.LIZ;
        }
        if ((i & 2) != 0) {
            z2 = c1819740xSG.LIZIZ;
        }
        if ((i & 4) != 0) {
            z3 = c1819740xSG.LIZJ;
        }
        c1819740xSG.getClass();
        return new C1819740xSG(z, z2, z3);
    }
}
