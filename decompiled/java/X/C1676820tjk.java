package X;

/* JADX INFO: renamed from: X.0tjk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676820tjk {
    public static final /* synthetic */ int LIZIZ = 0;
    public final long LIZ;

    static {
        new Object() { // from class: X.0tjl
        };
    }

    public static long LIZ(int i, int i2, int i3, long j) {
        if ((i3 & 1) != 0) {
            i = (int) (j >> 32);
        }
        if ((i3 & 2) != 0) {
            i2 = (int) (j & 4294967295L);
        }
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public static final boolean LIZIZ(long j, long j2) {
        return j == j2;
    }

    public static final int LIZJ(long j) {
        return (int) (j & 4294967295L);
    }

    public static final long LIZLLL(long j, long j2) {
        return (((long) (((int) (j >> 32)) - ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public static final long LJ(long j, long j2) {
        return (((long) (((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) (((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        return LJFF(this.LIZ);
    }

    public /* synthetic */ C1676820tjk(long j) {
        this.LIZ = j;
    }

    public static String LJFF(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('(');
        sbLIZ.append((int) (j >> 32));
        sbLIZ.append(", ");
        sbLIZ.append(LIZJ(j));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C1676820tjk) || j != ((C1676820tjk) obj).LIZ) {
            return false;
        }
        return true;
    }
}
