package X;

/* JADX INFO: renamed from: X.0tjW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676680tjW {
    public static final long LIZIZ = C1671190taf.LIZ(0.5f, 0.5f);
    public static final /* synthetic */ int LIZJ = 0;
    public final long LIZ;

    public static final boolean LIZ(long j, long j2) {
        return j == j2;
    }

    public static String LIZLLL(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TransformOrigin(packedValue=");
        sbLIZ.append(j);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String toString() {
        return LIZLLL(this.LIZ);
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public /* synthetic */ C1676680tjW(long j) {
        this.LIZ = j;
    }

    public static final float LIZIZ(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float LIZJ(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C1676680tjW) || j != ((C1676680tjW) obj).LIZ) {
            return false;
        }
        return true;
    }
}
