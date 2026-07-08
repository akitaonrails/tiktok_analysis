package X;

/* JADX INFO: renamed from: X.0Tzi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C765040Tzi extends AbstractC764660Tz6 {
    public final C0U0I LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C765040Tzi)) {
            return false;
        }
        C765040Tzi c765040Tzi = (C765040Tzi) obj;
        return this.LIZ == c765040Tzi.LIZ && this.LIZIZ == c765040Tzi.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SongActionSuccess(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", songId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C765040Tzi(C0U0I c0u0i, long j) {
        this.LIZ = c0u0i;
        this.LIZIZ = j;
    }
}
