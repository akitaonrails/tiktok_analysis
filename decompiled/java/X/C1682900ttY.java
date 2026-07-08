package X;

/* JADX INFO: renamed from: X.0ttY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682900ttY {
    public static final /* synthetic */ int LIZIZ = 0;
    public final long LIZ;

    static {
        new Object() { // from class: X.0ttZ
        };
    }

    public static final boolean LIZIZ(long j, long j2) {
        return j == j2;
    }

    public static final int LIZJ(long j) {
        return (int) (j & 4294967295L);
    }

    public final boolean equals(Object obj) {
        return LIZ(this.LIZ, obj);
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        return LIZLLL(this.LIZ);
    }

    public /* synthetic */ C1682900ttY(long j) {
        this.LIZ = j;
    }

    public static String LIZLLL(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((int) (j >> 32));
        sbLIZ.append(" x ");
        sbLIZ.append((int) (j & 4294967295L));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static boolean LIZ(long j, Object obj) {
        if (!(obj instanceof C1682900ttY) || j != ((C1682900ttY) obj).LIZ) {
            return false;
        }
        return true;
    }
}
