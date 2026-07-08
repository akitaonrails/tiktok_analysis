package X;

/* JADX INFO: renamed from: X.0Tzr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C765130Tzr extends AbstractC764660Tz6 {
    public final C0U0I LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C765130Tzr)) {
            return false;
        }
        C765130Tzr c765130Tzr = (C765130Tzr) obj;
        return this.LIZ == c765130Tzr.LIZ && this.LIZIZ == c765130Tzr.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SongActionFail(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", songId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C765130Tzr(C0U0I c0u0i) {
        this(c0u0i, -1L);
    }

    public C765130Tzr(C0U0I c0u0i, long j) {
        this.LIZ = c0u0i;
        this.LIZIZ = j;
    }
}
