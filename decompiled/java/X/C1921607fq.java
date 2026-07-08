package X;

/* JADX INFO: renamed from: X.07fq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1921607fq implements InterfaceC1921807fs {
    public final double LIZ;

    @Override // X.InterfaceC1921807fs
    public final boolean LIZ() {
        double d = this.LIZ;
        return (d == 0.0d || Double.isNaN(d) || Double.isInfinite(d)) ? false : true;
    }

    @Override // X.InterfaceC1921807fs
    public final String LIZIZ() {
        return String.valueOf(this.LIZ);
    }

    @Override // X.InterfaceC1921807fs
    public final Double LIZJ() {
        return Double.valueOf(this.LIZ);
    }

    @Override // X.InterfaceC1921807fs
    public final Long LIZLLL() {
        return Long.valueOf((long) this.LIZ);
    }

    public final int hashCode() {
        return C786410Ut5.X2(this.LIZ);
    }

    public final String toString() {
        double d = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FloatType(value=");
        sbLIZ.append(d);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        double d = this.LIZ;
        if (!(obj instanceof C1921607fq) || Double.compare(d, ((C1921607fq) obj).LIZ) != 0) {
            return false;
        }
        return true;
    }
}
