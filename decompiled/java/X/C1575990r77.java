package X;

/* JADX INFO: renamed from: X.0r77, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1575990r77 {
    public final EnumC1576090r7H LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1575990r77)) {
            return false;
        }
        C1575990r77 c1575990r77 = (C1575990r77) obj;
        return this.LIZ == c1575990r77.LIZ && this.LIZIZ == c1575990r77.LIZIZ && this.LIZJ == c1575990r77.LIZJ && this.LIZLLL == c1575990r77.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VibeExitStrategyClientAIOverride(intentType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", exposeImpressionLimitTotal=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", exposeDaysWithoutClick=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", autoReEntranceDays=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1575990r77(EnumC1576090r7H enumC1576090r7H, int i, int i2, int i3) {
        this.LIZ = enumC1576090r7H;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}
