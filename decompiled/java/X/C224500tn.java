package X;

/* JADX INFO: renamed from: X.00tn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C224500tn extends AbstractC224700tp {
    public final double LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C224500tn)) {
            return false;
        }
        C224500tn c224500tn = (C224500tn) obj;
        return Double.compare(this.LIZ, c224500tn.LIZ) == 0 && this.LIZIZ == c224500tn.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.X2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Duration(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isInfinite=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C224500tn(boolean z, double d) {
        this.LIZ = d;
        this.LIZIZ = z;
    }
}
