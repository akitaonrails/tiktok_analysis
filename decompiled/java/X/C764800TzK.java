package X;

/* JADX INFO: renamed from: X.0TzK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C764800TzK extends AbstractC764660Tz6 {
    public final C0U0R LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C764800TzK)) {
            return false;
        }
        C764800TzK c764800TzK = (C764800TzK) obj;
        return this.LIZ == c764800TzK.LIZ && this.LIZIZ == c764800TzK.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayerActionSuccess(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", songId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C764800TzK(C0U0R c0u0r, long j) {
        this.LIZ = c0u0r;
        this.LIZIZ = j;
    }
}
