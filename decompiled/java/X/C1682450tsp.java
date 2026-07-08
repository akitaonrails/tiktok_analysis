package X;

/* JADX INFO: renamed from: X.0tsp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682450tsp {
    public static final /* synthetic */ int LIZIZ = 0;
    public final long LIZ;

    public static final boolean LIZ(long j, long j2) {
        return j == j2;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        return LIZIZ(this.LIZ);
    }

    public static String LIZIZ(long j) {
        if (LIZ(j, 0L)) {
            return "Unspecified";
        }
        if (LIZ(j, 4294967296L)) {
            return "Sp";
        }
        if (LIZ(j, 8589934592L)) {
            return "Em";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C1682450tsp) || j != ((C1682450tsp) obj).LIZ) {
            return false;
        }
        return true;
    }
}
