package X;

/* JADX INFO: renamed from: X.0973, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0973 extends AbstractC764660Tz6 {
    public final long LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0973)) {
            return false;
        }
        AnonymousClass0973 anonymousClass0973 = (AnonymousClass0973) obj;
        return this.LIZ == anonymousClass0973.LIZ && this.LIZIZ == anonymousClass0973.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownloadProgressChange(songId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0973(long j, int i) {
        this.LIZ = j;
        this.LIZIZ = i;
    }
}
