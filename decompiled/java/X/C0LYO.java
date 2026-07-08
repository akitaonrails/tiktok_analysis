package X;

/* JADX INFO: renamed from: X.0LYO, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LYO implements C0LYT {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0LYO) && this.LIZ == ((C0LYO) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NoQuotaLeft(quota=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LYO(int i) {
        this.LIZ = i;
    }
}
