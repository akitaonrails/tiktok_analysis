package X;

/* JADX INFO: renamed from: X.00to, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C224600to extends AbstractC224700tp {
    public final double LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C224600to) && Double.compare(this.LIZ, ((C224600to) obj).LIZ) == 0;
    }

    public final int hashCode() {
        return C786410Ut5.X2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FPS(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C224600to(double d) {
        this.LIZ = d;
    }
}
