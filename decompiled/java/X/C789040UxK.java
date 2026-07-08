package X;

/* JADX INFO: renamed from: X.0UxK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789040UxK {
    public final long LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C789040UxK)) {
            return false;
        }
        C789040UxK c789040UxK = (C789040UxK) obj;
        return this.LIZ == c789040UxK.LIZ && this.LIZIZ == c789040UxK.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReadyInfo(timestamp=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fromLocal=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C789040UxK(long j, boolean z) {
        this.LIZ = j;
        this.LIZIZ = z;
    }
}
