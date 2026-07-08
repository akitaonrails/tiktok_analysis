package X;

/* JADX INFO: renamed from: X.0hXV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1207950hXV extends AbstractC1207960hXW {
    public final boolean LIZ;

    public C1207950hXV() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1207950hXV) && this.LIZ == ((C1207950hXV) obj).LIZ;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Rationale(isCover=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1207950hXV(boolean z) {
        this.LIZ = z;
    }
}
