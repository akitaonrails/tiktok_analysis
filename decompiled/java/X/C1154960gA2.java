package X;

/* JADX INFO: renamed from: X.0gA2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1154960gA2 {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C1154960gA2() {
        this(false, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1154960gA2)) {
            return false;
        }
        C1154960gA2 c1154960gA2 = (C1154960gA2) obj;
        return this.LIZ == c1154960gA2.LIZ && this.LIZIZ == c1154960gA2.LIZIZ && this.LIZJ == c1154960gA2.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PollDiff(publishStateChange=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", optionChange=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pollContentChange=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1154960gA2(boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
    }
}
