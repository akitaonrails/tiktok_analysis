package X;

/* JADX INFO: renamed from: X.0M1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C561890M1z extends C0M22 {
    public final long LIZ;
    public final long LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C561890M1z)) {
            return false;
        }
        C561890M1z c561890M1z = (C561890M1z) obj;
        return this.LIZ == c561890M1z.LIZ && this.LIZIZ == c561890M1z.LIZIZ && this.LIZJ == c561890M1z.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ByMemory(totalBytesThreshold=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", oldBytesThreshold=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", oldMonths=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C561890M1z() {
        this(3221225472L, 1073741824L, 6);
    }

    @Override // X.C0M22
    public final int LIZ() {
        return this.LIZJ;
    }

    public C561890M1z(long j, long j2, int i) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = i;
    }
}
