package X;

/* JADX INFO: renamed from: X.0u2G, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688300u2G {
    public final long LIZ;

    public static long LIZ(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final int LIZIZ(long j) {
        return (int) (j & 4294967295L);
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        long j = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('(');
        sbLIZ.append((int) (j >> 32));
        sbLIZ.append(", ");
        sbLIZ.append(LIZIZ(j));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1688300u2G(long j) {
        this.LIZ = j;
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C1688300u2G) || j != ((C1688300u2G) obj).LIZ) {
            return false;
        }
        return true;
    }
}
