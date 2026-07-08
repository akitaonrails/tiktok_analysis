package X;

/* JADX INFO: renamed from: X.0wQa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1780260wQa {
    public final int LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1780260wQa)) {
            return false;
        }
        C1780260wQa c1780260wQa = (C1780260wQa) obj;
        return this.LIZ == c1780260wQa.LIZ && this.LIZIZ == c1780260wQa.LIZIZ && this.LIZJ == c1780260wQa.LIZJ && this.LIZLLL == c1780260wQa.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreatorRankInteractAction(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", num=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", cohostChannelId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1780260wQa(int i, int i2, long j, long j2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = j;
        this.LIZLLL = j2;
    }
}
