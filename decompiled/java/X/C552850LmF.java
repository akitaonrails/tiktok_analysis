package X;

/* JADX INFO: renamed from: X.0LmF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C552850LmF {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C552850LmF() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C552850LmF)) {
            return false;
        }
        C552850LmF c552850LmF = (C552850LmF) obj;
        return this.LIZ == c552850LmF.LIZ && this.LIZIZ == c552850LmF.LIZIZ && this.LIZJ == c552850LmF.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WorkflowBuildValidationGate(enableInDebug=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enableInLocalTest=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enableInOtherChannels=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C552850LmF(int i) {
        this.LIZ = true;
        this.LIZIZ = true;
        this.LIZJ = false;
    }
}
