package X;

/* JADX INFO: renamed from: X.0toM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679680toM {
    public static final /* synthetic */ int LIZIZ = 0;
    public final long LIZ;

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        long j = this.LIZ;
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((Object) C1668650tWZ.LJFF(LIZIZ(j)));
        sbLIZ.append(" x ");
        sbLIZ.append((Object) C1668650tWZ.LJFF(LIZ(j)));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final float LIZ(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float LIZIZ(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C1679680toM) || j != ((C1679680toM) obj).LIZ) {
            return false;
        }
        return true;
    }
}
