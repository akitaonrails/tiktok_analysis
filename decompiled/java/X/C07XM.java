package X;

/* JADX INFO: renamed from: X.07XM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07XM {
    public final float LIZ;
    public final int LIZIZ;

    public C07XM() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07XM)) {
            return false;
        }
        C07XM c07xm = (C07XM) obj;
        return Float.compare(this.LIZ, c07xm.LIZ) == 0 && this.LIZIZ == c07xm.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReduceTransparencyConfig(dimAmount=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", backgroundBlurRadius=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.LIZ) * 31) + this.LIZIZ;
    }

    public C07XM(int i) {
        this.LIZ = 0.8f;
        this.LIZIZ = -1;
    }
}
