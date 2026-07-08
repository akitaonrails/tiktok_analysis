package X;

/* JADX INFO: renamed from: X.0LYN, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LYN implements C0LYT {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0LYN) && this.LIZ == ((C0LYN) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LastGeneration(quota=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LYN(int i) {
        this.LIZ = i;
    }
}
