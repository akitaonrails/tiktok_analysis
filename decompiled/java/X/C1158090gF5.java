package X;

/* JADX INFO: renamed from: X.0gF5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158090gF5 {
    public final long LIZ = 1228800;
    public final long LIZIZ = 1433600;
    public final long LIZJ = 1638400;
    public final long LIZLLL = 1843200;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158090gF5)) {
            return false;
        }
        C1158090gF5 c1158090gF5 = (C1158090gF5) obj;
        return this.LIZ == c1158090gF5.LIZ && this.LIZIZ == c1158090gF5.LIZIZ && this.LIZJ == c1158090gF5.LIZJ && this.LIZLLL == c1158090gF5.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Thresholds(low=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", medium=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", high=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extreme=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
