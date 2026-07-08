package X;

/* JADX INFO: renamed from: X.07UE, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07UE implements C07UD {
    public final long LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07UE) && this.LIZ == ((C07UE) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Visible(beginTime=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07UE(long j) {
        this.LIZ = j;
    }
}
