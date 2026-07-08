package X;

/* JADX INFO: renamed from: X.04xt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1269104xt {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1269104xt)) {
            return false;
        }
        C1269104xt c1269104xt = (C1269104xt) obj;
        return this.LIZ == c1269104xt.LIZ && this.LIZIZ == c1269104xt.LIZIZ && this.LIZJ == c1269104xt.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GsonConfig(disableHtmlEscaping=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", prettyPrinting=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", serializeNulls=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1269104xt(boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
    }
}
