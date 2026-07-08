package X;

/* JADX INFO: renamed from: X.0ENc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363540ENc {
    public final double LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C363540ENc) && Double.compare(this.LIZ, ((C363540ENc) obj).LIZ) == 0;
    }

    public final int hashCode() {
        return C786410Ut5.X2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DoubleValue(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C363540ENc(double d) {
        this.LIZ = d;
    }
}
