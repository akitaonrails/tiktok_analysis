package X;

/* JADX INFO: renamed from: X.04z3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1276304z3 {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1276304z3)) {
            return false;
        }
        C1276304z3 c1276304z3 = (C1276304z3) obj;
        return this.LIZ == c1276304z3.LIZ && this.LIZIZ == c1276304z3.LIZIZ && this.LIZJ == c1276304z3.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCDerivedFlags(hasC2PA=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasC2PAExcludeMinor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasImportAigc=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1276304z3(boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
    }
}
