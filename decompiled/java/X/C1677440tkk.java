package X;

/* JADX INFO: renamed from: X.0tkk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1677440tkk {
    public static final /* synthetic */ int LIZIZ = 0;
    public final long LIZ;

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZ);
    }

    public final String toString() {
        long j = this.LIZ;
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('(');
        sbLIZ.append((Object) C1668650tWZ.LJFF(Float.intBitsToFloat((int) (j >> 32))));
        sbLIZ.append(", ");
        sbLIZ.append((Object) C1668650tWZ.LJFF(Float.intBitsToFloat((int) (j & 4294967295L))));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        long j = this.LIZ;
        if (!(obj instanceof C1677440tkk) || j != ((C1677440tkk) obj).LIZ) {
            return false;
        }
        return true;
    }
}
