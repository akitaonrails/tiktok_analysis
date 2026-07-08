package X;

/* JADX INFO: renamed from: X.0eXg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092740eXg {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public C1092740eXg() {
        this(0, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1092740eXg)) {
            return false;
        }
        C1092740eXg c1092740eXg = (C1092740eXg) obj;
        return this.LIZ == c1092740eXg.LIZ && this.LIZIZ == c1092740eXg.LIZIZ && this.LIZJ == c1092740eXg.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FrequencyConfiguration(frequencyType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timeLimit=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", durationLimit=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1092740eXg(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }
}
