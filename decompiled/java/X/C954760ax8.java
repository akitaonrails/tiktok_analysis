package X;

/* JADX INFO: renamed from: X.0ax8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954760ax8 extends AbstractC956310azd {
    public final long LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final long LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Apply(targetUid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", durationMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", targetRoomId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", targetChannelId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZIZ);
    }

    @Override // X.AbstractC956310azd
    public final long LIZ() {
        return this.LIZJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C954760ax8) && this.LIZIZ == ((C954760ax8) obj).LIZIZ) {
            return true;
        }
        return false;
    }

    public C954760ax8(long j, long j2, long j3, long j4) {
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = j3;
        this.LJ = j4;
    }
}
