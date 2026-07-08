package X;

/* JADX INFO: renamed from: X.0Ybp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877630Ybp extends AbstractC877620Ybo {
    public final double LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C877630Ybp) && Double.compare(this.LIZ, ((C877630Ybp) obj).LIZ) == 0;
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

    public C877630Ybp(double d) {
        this.LIZ = d;
    }
}
