package X;

/* JADX INFO: renamed from: X.0Dnz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350090Dnz {
    public final long LIZ;
    public final long LIZIZ;

    public C350090Dnz() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C350090Dnz)) {
            return false;
        }
        C350090Dnz c350090Dnz = (C350090Dnz) obj;
        return this.LIZ == c350090Dnz.LIZ && this.LIZIZ == c350090Dnz.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrackPanelTimeState(maxTime=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", maxMainTrackTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C350090Dnz(int i) {
        this(0L, 0L);
    }

    public C350090Dnz(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
