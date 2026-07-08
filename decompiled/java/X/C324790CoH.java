package X;

/* JADX INFO: renamed from: X.0CoH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C324790CoH {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C324790CoH)) {
            return false;
        }
        C324790CoH c324790CoH = (C324790CoH) obj;
        return this.LIZ == c324790CoH.LIZ && this.LIZIZ == c324790CoH.LIZIZ && this.LIZJ == c324790CoH.LIZJ && this.LIZLLL == c324790CoH.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoOnboardingEligibility(featureEnabled=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hitServerGate=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hitActiveEntryGate=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hitSilenceGate=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C324790CoH(boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
    }
}
