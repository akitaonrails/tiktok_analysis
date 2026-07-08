package X;

/* JADX INFO: renamed from: X.097Q, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C097Q extends AbstractC764660Tz6 {
    public final long LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C097Q) && this.LIZ == ((C097Q) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayerProgressChange(progress=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C097Q(long j) {
        this.LIZ = j;
    }
}
