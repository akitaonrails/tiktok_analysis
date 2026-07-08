package X;

/* JADX INFO: renamed from: X.07dv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1909707dv implements InterfaceC1905407dE {
    public final double LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1909707dv) && Double.compare(this.LIZ, ((C1909707dv) obj).LIZ) == 0;
    }

    public final int hashCode() {
        return C786410Ut5.X2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NumberValue(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1909707dv(double d) {
        this.LIZ = d;
    }
}
